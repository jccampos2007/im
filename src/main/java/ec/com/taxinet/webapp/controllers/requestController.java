package ec.com.taxinet.webapp.controllers;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sucre.im.utils.NumberToLetterConverter;

import ec.com.taxinet.webapp.dto.ResponseRequestListDTO;
import ec.com.taxinet.webapp.dto.deleteRequestOwnerDTO;
import ec.com.taxinet.webapp.dto.ordinanceListDTO;
import ec.com.taxinet.webapp.dto.ownerFindDTO;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufAddOwnerFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufAddPaymentFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufTracingManagementFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom.VufAddRequestAttachedFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom.requestOwner;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom.requestRequisite;
import ec.com.taxinet.webapp.form.model.RequestListForm.mngRequestNoticeMotive;
import ec.com.taxinet.webapp.form.model.RequestListForm.mngRequestNoticePending;
import ec.com.taxinet.webapp.form.model.RequestListForm.mngRequestUpplementary;
import ec.com.taxinet.webapp.datatable.DataTablesTO;
import ec.com.taxinet.webapp.dto.CiudadanoSucreDTO;
import ec.com.taxinet.webapp.dto.ResponseNoticeMotiveListDTO;
import ec.com.taxinet.webapp.dto.ResponseNoticePendingListDTO;
import ec.com.taxinet.webapp.dto.ownerManagementDTO;
import ec.com.taxinet.webapp.dto.paymentManagementDTO;
import ec.com.taxinet.webapp.dto.requestAttachedDTO;
import ec.com.taxinet.webapp.dto.requestManagementDTO;
import ec.com.taxinet.webapp.dto.requestNoticeMotiveManagementDTO;
import ec.com.taxinet.webapp.dto.requestNoticePendingManagementDTO;
import ec.com.taxinet.webapp.dto.tracingManagementDTO;
import ec.com.taxinet.webapp.dto.typeUseListDTO;
import ec.com.taxinet.webapp.dto.userSessionDTO;
import ec.com.taxinet.webapp.dto.variableNumeralListDTO;
import ec.com.taxinet.webapp.dto.zoneListDTO;
import ec.com.taxinet.webapp.model.Payment;
import ec.com.taxinet.webapp.model.ResponseRequestList;
import ec.com.taxinet.webapp.model.ResponseRequestList.RequestOwnerList;
import ec.com.taxinet.webapp.model.ordinanceList;
import ec.com.taxinet.webapp.services.CiudadanoSucre.ICiudadanoSucre;
import ec.com.taxinet.webapp.services.Common.ICommon;
import ec.com.taxinet.webapp.services.Vansat.DBConection;
import ec.com.taxinet.webapp.services.login.ILogin;
import ec.com.taxinet.webapp.services.requestVUE.IRequestVUE;
import ec.com.taxinet.webapp.services.requestVUF.IRequestVUF;
import ec.com.taxinet.webapp.session.model.User;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author JUAN CAMPOS
 *
 */
@Controller
@Scope("request")
public class requestController {
	
	private static final Logger logger = LoggerFactory.getLogger(PanelController.class);
	
	@Autowired
	private User user;
	
	@Autowired
	private ILogin loginService;
	
	@Autowired
	private ICiudadanoSucre ciudadanoSucre;
	
	@Autowired
	private ICommon common;
	
	@Autowired
	private IRequestVUF requestVUF;
	
	@Autowired
	private IRequestVUE requestVUE;
	
	//@Autowired
	//private DBConection conecVansat;
	
	/**
	 * index recorderVUF
	 */
	@RequestMapping(value = "/VUF/recorder", method = RequestMethod.GET)
	public String viewVUFRecorder(Model model) {
		
		logger.info("Modulo: viewVUFRecorder");
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		//ordinanceListDTO ordinanceList = common.listOrdinance(0, 1);//VUF
		//model.addAttribute("ordinances", ordinanceList);
		zoneListDTO zoneList = common.listZone(0);//VUF
		model.addAttribute("zones", zoneList.getResponseData());
		
		return "recorderVUF";
	}
	
	/**
	 * index supervisorVUF
	 */
	@RequestMapping(value = "/VUF/supervisor", method = RequestMethod.GET)
	public String viewVUFSupervisor(Model model) {
				 	
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		userSessionDTO responsibleOfficialList = loginService.getResponsibleOfficial("TECNICO");
		model.addAttribute("responsibleOfficial", responsibleOfficialList.getResponseData());

		logger.info("\nModulo: viewVUFSupervisor"
				+ "\n responsibleOfficialList = " + responsibleOfficialList.getResponseData().toString());
		
		return "supervisorVUF";
	}
	
	/**
	 * index technicalVUF
	 */
	@RequestMapping(value = "/VUF/technical", method = RequestMethod.GET)
	public String viewVUFTechnical(Model model) {
		
		logger.info("Modulo: viewVUFTechnical");
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		userSessionDTO responsibleOfficialList = loginService.getResponsibleOfficial("TECNICO");
		model.addAttribute("responsibleOfficial", responsibleOfficialList.getResponseData());
		zoneListDTO zoneList = common.listZone(0);//VUF
		model.addAttribute("zones", zoneList.getResponseData());

		return "technicalVUF";
	}
	
	/**
	 * index supervisorApprovalVUF
	 */
	@RequestMapping(value = "/VUF/supervisorApproval", method = RequestMethod.GET)
	public String viewVUFSupervisorApproval(Model model) {
		
		logger.info("Modulo: viewVUFSupervisorApproval");
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		//FALTA WS ResponsibleOfficial

		return "supervisorApprovalVUF";
	}
	
	/**
	 * index managerApprovalVUF
	 */
	@RequestMapping(value = "/VUF/managerApproval", method = RequestMethod.GET)
	public String viewVUFManagerApproval(Model model) {
		
		logger.info("Modulo: viewVUFManagerApproval");
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		//FALTA WS ResponsibleOfficial

		return "managerApprovalVUF";
	}
	
	/**
	 * index viewVUFDelivery
	 */
	@RequestMapping(value = "/VUF/delivery", method = RequestMethod.GET)
	public String viewVUFDelivery(Model model) {
	 	
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		userSessionDTO responsibleOfficialList = loginService.getResponsibleOfficial("TECNICO");
		model.addAttribute("responsibleOfficial", responsibleOfficialList.getResponseData());
		
		logger.info("\nModulo: viewVUFDelivery"
				+ "\n responsibleOfficialList = " + responsibleOfficialList.getResponseData().toString());
		
		return "deliveryVUF";
	}
	
	/**
	 * index recorderVUE
	 */
	@RequestMapping(value = "/VUE/recorder", method = RequestMethod.GET)
	public String viewVUERecorder(Model model) {
		
		logger.info("Modulo: viewVUFRecorder");
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		//ordinanceListDTO ordinanceList = common.listOrdinance(0, 1);//VUF
		//model.addAttribute("ordinances", ordinanceList);
		zoneListDTO zoneList = common.listZone(0);//VUF
		model.addAttribute("zones", zoneList.getResponseData());
		
		return "recorderVUE";
	}
	
	/**
	 * index supervisorVUE
	 */
	@RequestMapping(value = "/VUE/supervisor", method = RequestMethod.GET)
	public String viewVUESupervisor(Model model) {
				 	
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		userSessionDTO responsibleOfficialList = loginService.getResponsibleOfficial("TECNICO");
		model.addAttribute("responsibleOfficial", responsibleOfficialList.getResponseData());

		logger.info("\nModulo: viewVUFSupervisor"
				+ "\n responsibleOfficialList = " + responsibleOfficialList.getResponseData().toString());
		
		return "supervisorVUE";
	}
	
	/**
	 * index technicalVUE
	 */
	@RequestMapping(value = "/VUE/technical", method = RequestMethod.GET)
	public String viewVUETechnical(Model model) {
		
		logger.info("Modulo: viewVUFTechnical");
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		userSessionDTO responsibleOfficialList = loginService.getResponsibleOfficial("TECNICO");
		model.addAttribute("responsibleOfficial", responsibleOfficialList.getResponseData());
		zoneListDTO zoneList = common.listZone(0);
		model.addAttribute("zones", zoneList.getResponseData());
		variableNumeralListDTO variableNumeralList = common.listVariableNumeral();
		model.addAttribute("variablesNumeral", variableNumeralList.getResponseData());

		return "technicalVUE";
	}
	
	/**
	 * index supervisorApprovalVUE
	 */
	@RequestMapping(value = "/VUE/supervisorApproval", method = RequestMethod.GET)
	public String viewVUESupervisorApproval(Model model) {
		
		logger.info("Modulo: viewVUFSupervisorApproval");
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		//FALTA WS ResponsibleOfficial

		return "supervisorApprovalVUE";
	}
	
	/**
	 * index managerApprovalVUE
	 */
	@RequestMapping(value = "/VUE/managerApproval", method = RequestMethod.GET)
	public String viewVUEManagerApproval(Model model) {
		
		logger.info("Modulo: viewVUFManagerApproval");
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		//FALTA WS ResponsibleOfficial

		return "managerApprovalVUE";
	}
	
	/**
	 * index deliveryVUE
	 */
	@RequestMapping(value = "/VUE/delivery", method = RequestMethod.GET)
	public String viewVUEDelivery(Model model) {
	 	
		model.addAttribute("user", user);
		typeUseListDTO typeUseList = common.listTypeUse();
		model.addAttribute("typeUses", typeUseList.getResponseData());
		userSessionDTO responsibleOfficialList = loginService.getResponsibleOfficial("TECNICO");
		model.addAttribute("responsibleOfficial", responsibleOfficialList.getResponseData());
		
		logger.info("\nModulo: viewVUFDelivery"
				+ "\n responsibleOfficialList = " + responsibleOfficialList.getResponseData().toString());
		
		return "deliveryVUE";
	}
	
	
	/**
	 * requestFindCS 
	 */	
	@RequestMapping(value = "/VUF/find/CS/{nroSolicitud}", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody CiudadanoSucreDTO findVUFCS(
			@PathVariable String nroSolicitud, 
			Model model) {

		CiudadanoSucreDTO ciudadanoSucreDTO =  ciudadanoSucre.findCS(nroSolicitud);
		return ciudadanoSucreDTO;
		
	}
	
	/**
	 * requestFindCS
	 */
	@RequestMapping(value = "/find/request/{id_request}/{numberRequest}/{responsable}/{id_responsible_official}/{dateRequestFrom}/{dateRequestTo}/{status_request}/{id_type_request}/", produces = "application/json")
	public @ResponseBody String getRequestList(
			@PathVariable int id_request, 
			@PathVariable String numberRequest, 
			@PathVariable String responsable, 
			@PathVariable int id_responsible_official, 
			@PathVariable String dateRequestFrom, 
			@PathVariable String dateRequestTo, 
			@PathVariable String status_request,
			@PathVariable int id_type_request,
			@RequestParam int iDisplayStart,
            @RequestParam int iDisplayLength, 
            @RequestParam int sEcho,
            @RequestParam String sSearch, 
            @RequestParam int iColumns, 
            @RequestParam int iSortingCols, 
            @RequestParam int iSortCol_0, 
            @RequestParam String sSortDir_0) {
		
		
		logger.info("\nMetodo: getRequestList"
			+"\nnumberRequest: "+numberRequest+" responsable:"+responsable
			+" dateRequestFrom:"+dateRequestFrom+" dateRequestTo:"+dateRequestFrom
			+" status_request:"+status_request + "id_type_request:"+ id_type_request);
		
		if (status_request.equals("Asignacion de Tecnico") || status_request.equals("En Revision Tecnica")){
			id_responsible_official = user.getId_user_session();
			logger.info("\nstatus_request == Asignacion de Tecnico"
					+" id_responsible_official:"+id_responsible_official);
		}
		
		StringBuffer result = new StringBuffer();
		DataTablesTO<ResponseRequestList> dt = new DataTablesTO<ResponseRequestList>();
		
		
		// llamar al servicio para obtener las lista de Request
		ResponseRequestListDTO responseRequestListDTO = requestVUF.listRequest(id_request, numberRequest, responsable, id_responsible_official, dateRequestFrom, dateRequestTo, status_request, id_type_request, false);
		
		//obtener las lista de Objects Request
		List<ResponseRequestList> requests  = responseRequestListDTO.getResponseData();
				
		final int sortColumnIndex = iSortCol_0;
		final int sortDirection = sSortDir_0.equals("asc") ? -1 : 1;
		
		List<ResponseRequestList> requestList = new LinkedList<ResponseRequestList>();
		Iterator<ResponseRequestList> iter = requests.iterator();
		boolean found = true;
		
		while(iter.hasNext()){
			ResponseRequestList request = (ResponseRequestList)iter.next();
			
			if(found){
				
				SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
				java.util.Date utilDate = null;
				try {	
					utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getDate_request());				
				} catch (ParseException e) {
					//The handling for the code
				}
				request.setFormat_date_request(formatDate.format(utilDate));
				requestList.add(request);
			}
			found 	= true;
		}		
		
		Collections.sort(requestList, new Comparator<ResponseRequestList>() {				
			@Override
			public int compare(ResponseRequestList request_1, ResponseRequestList request_2) {
				try{
					switch(sortColumnIndex){
					case 0:
						return request_1.getNumber_request().compareTo(request_1.getNumber_request()) * sortDirection;
					}
				}catch(NullPointerException e){
					
				}
				return 0;
			}
		});	
		
		
		// obtiene el total de registros recuperados
		int iTotalDisplayRecords = requestList.size();
		
		// crea un sublista para la pagination
		if(requestList.size() < iDisplayStart + iDisplayLength){
			requestList = requestList.subList(iDisplayStart, requestList.size());
		}else{
			requestList = requestList.subList(iDisplayStart, iDisplayStart + iDisplayLength);
		}
		
		dt.setAaData(requestList);
		dt.setiTotalDisplayRecords(iTotalDisplayRecords);
		dt.setiTotalRecords(requests.size());
		dt.setsEcho(sEcho);	
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			result.append(mapper.writeValueAsString(dt));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			result = null;
		}
		return result.toString();
		
		
	}
	
	/**
	 * getRequestListByNumberRequest 
	 */	
	@RequestMapping(value = "/find/request/number/{numberRequest}/{id_type_request}/", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseRequestListDTO getRequestListByNumberRequest(
			@PathVariable String numberRequest, 
			@PathVariable int id_type_request, 
			Model model) {
		logger.info("\n metodo: getRequestListByIdRequest"
				+"\nnumberRequest =" + numberRequest
				+"\nid_type_request =" + id_type_request);
		
		// llamar al servicio para obtener las lista de Request
		ResponseRequestListDTO responseRequestListDTO = requestVUF.listRequest(0, numberRequest, "na", 0,"na", "na", "na", id_type_request, true);

		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date utilDate = null;
		java.util.Date utilDate2 = null;
		java.util.Date utilDate3 = null;
		if (!responseRequestListDTO.getResponseData().isEmpty()){
			try {	
				utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getDate_request());	
				utilDate2 = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getResponseRequestPaymentList().get(0).getDate_payment());
				
				if (responseRequestListDTO.getResponseData().get(0).getRequestUpplementaryList().getDate_notice_catastro() != null){
					utilDate3 = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getRequestUpplementaryList().getDate_notice_catastro());
				}else{
					utilDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-01");
				}
				
			} catch (ParseException e) {
				//The handling for the code
			}
			responseRequestListDTO.getResponseData().get(0).setFormat_date_request(formatDate.format(utilDate));
			responseRequestListDTO.getResponseData().get(0).setFormat_date_payment(formatDate.format(utilDate2));
			responseRequestListDTO.getResponseData().get(0).setFormat_date_notice_catastro(formatDate.format(utilDate3));
	
			for(int i=0; i< responseRequestListDTO.getResponseData().get(0).getResponseRequestPaymentList().size(); i++) {
				
				try {
					utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getResponseRequestPaymentList().get(i).getDate_payment());			
				} catch (ParseException e) {
					//The handling for the code
				}
				responseRequestListDTO.getResponseData().get(0).getResponseRequestPaymentList().get(i).setDate_payment(formatDate.format(utilDate));
				
	        }
		}
		return responseRequestListDTO;
	}
	
	/**
	 * getRequestListByIdRequest 
	 */	
	@RequestMapping(value = "/find/request/{id_request}/{id_type_request}/", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseRequestListDTO getRequestListByIdRequest(
			@PathVariable int id_request, 
			@PathVariable int id_type_request, 
			Model model) {
		logger.info("\n metodo: getRequestListByIdRequest"
				+"\nid_request =" + id_request);
		
		// llamar al servicio para obtener las lista de Request
		ResponseRequestListDTO responseRequestListDTO = requestVUF.listRequest(id_request, "na", "na", 0,"na", "na", "na", id_type_request, true);

		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date utilDate = null;
		java.util.Date utilDate2 = null;
		java.util.Date utilDate3 = null;
		java.util.Date utilDate4 = null;
		try {	
			utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getDate_request());	
			utilDate2 = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getResponseRequestPaymentList().get(0).getDate_payment());
			
			if (responseRequestListDTO.getResponseData().get(0).getRequestUpplementaryList().getDate_notice_catastro() != null){
				utilDate3 = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getRequestUpplementaryList().getDate_notice_catastro());
			}else{
				utilDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-01");
			}
		} catch (ParseException e) {
			//The handling for the code
		}
		responseRequestListDTO.getResponseData().get(0).setFormat_date_request(formatDate.format(utilDate));
		responseRequestListDTO.getResponseData().get(0).setFormat_date_payment(formatDate.format(utilDate2));
		responseRequestListDTO.getResponseData().get(0).setFormat_date_notice_catastro(formatDate.format(utilDate3));

		for(int i=0; i< responseRequestListDTO.getResponseData().get(0).getResponseRequestPaymentList().size(); i++) {
			
			try {
				utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getResponseRequestPaymentList().get(i).getDate_payment());			
			} catch (ParseException e) {
				//The handling for the code
			}
			responseRequestListDTO.getResponseData().get(0).getResponseRequestPaymentList().get(i).setDate_payment(formatDate.format(utilDate));
			
        }
		//Solicitud de tramite VUF
		ResponseRequestListDTO responseRequestParentDTO = requestVUF.listRequest(responseRequestListDTO.getResponseData().get(0).getId_request_parent(), "na", "na", 0,"na", "na", "na", 1, false);
		responseRequestListDTO.getResponseData().get(0).setNumberRequestParent(responseRequestParentDTO.getResponseData().get(0).getNumber_request());
		//Solicitud de tramite VUF
		if(responseRequestListDTO.getResponseData().get(0).getId_type_notice() == 1){
			ResponseNoticeMotiveListDTO responseNoticeMotiveListDTO = requestVUF.listNoticeMotive(id_request);
			responseRequestListDTO.getResponseData().get(0).setNoticeMotiveList(responseNoticeMotiveListDTO.getResponseData());
			try {
				utilDate4 = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getNoticeMotiveList().getDate_gaceta_zoning());				
			} catch (ParseException e) {
				//The handling for the code
			}
			responseRequestListDTO.getResponseData().get(0).getNoticeMotiveList().setFormat_date_gaceta_zoning(formatDate.format(utilDate4));
		}
		else if(responseRequestListDTO.getResponseData().get(0).getId_type_notice() == 2){
			ResponseNoticePendingListDTO responseNoticePendingListDTO = requestVUF.listNoticePending(id_request);
			responseRequestListDTO.getResponseData().get(0).setNoticePendingList(responseNoticePendingListDTO.getResponseData());
			try {
				utilDate4 = new SimpleDateFormat("yyyy-MM-dd").parse(responseRequestListDTO.getResponseData().get(0).getNoticePendingList().getDate_notice_request_previous());
			} catch (ParseException e) {
				//The handling for the code
			}
			responseRequestListDTO.getResponseData().get(0).getNoticePendingList().setFormat_date_notice_request_previous(formatDate.format(utilDate4));
		}
		return responseRequestListDTO;
	}

	/**
	 * setAddOwner 
	 */	
	@RequestMapping(value = "/add/owner/", method = RequestMethod.POST)
	public @ResponseBody ownerManagementDTO setAddOwner(@RequestBody VufAddOwnerFrom addOwnerFrom, Model model, final RedirectAttributes redirectAttributes) {
		logger.info("\n metodo: setAddOwner "
				+ "\n" + addOwnerFrom.toString());//idServiceRecord
		ownerManagementDTO result = common.addOwner(addOwnerFrom);
		return result;
	}

	/**
	 * setAddPayment 
	 */	
	@RequestMapping(value = "/add/payment/", method = RequestMethod.POST)
	public @ResponseBody paymentManagementDTO setAddPayment(@RequestBody VufAddPaymentFrom addPaymentFrom, Model model, final RedirectAttributes redirectAttributes) {
		logger.info("\n metodo: setAddPayment "
				+ "\n" + addPaymentFrom.toString());//idServiceRecord
		
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate = null;
		try {	
			utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(addPaymentFrom.getDate_payment());	
		} catch (ParseException e) {
			logger.info("\n fallo fecha " + addPaymentFrom.getDate_payment());
		}
		addPaymentFrom.setDate_payment(formatDate.format(utilDate));
		
		paymentManagementDTO result = common.addPayment(addPaymentFrom);
		return result;
	}

	/**
	 * setAddPayment 
	 */	
	@RequestMapping(value = "/delete/requestOwner/{id_request_owner}", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody deleteRequestOwnerDTO setDeleteRequestOwner(
			@PathVariable Integer id_request_owner, 
			Model model) {
		logger.info("\n metodo: setDeleteRequestOwner "
				+ "\n" + id_request_owner.toString());//id_request_owner
		
		deleteRequestOwnerDTO result = common.deleteRequestOwner(id_request_owner);
		return result;
	}
	


	/**
	 * setDeleteVariableNumeral 
	 */	
	@RequestMapping(value = "/VUE/delete/deleteVariableNumeral/{id_request_variable_numeral}", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody deleteRequestOwnerDTO setDeleteVariableNumeral(
			@PathVariable Integer id_request_variable_numeral, 
			Model model) {
		logger.info("\n metodo: setDeleteRequestOwner "
				+ "\n" + id_request_variable_numeral.toString());//id_request_owner
		
		deleteRequestOwnerDTO result = requestVUE.deleteVariableNumeral(id_request_variable_numeral);
		return result;
	}

	
	/**
	 * getOwner 
	 */	
	@RequestMapping(value = "/find/owner/{owner_id}", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody ownerFindDTO getOwner(
			@PathVariable String owner_id, 
			Model model) {
		logger.info("\n metodo: getOwner"
				+"\nowner_id =" + owner_id);
		
		ownerFindDTO result = common.findOwner(owner_id, 0);
				
		return result;
	}

	
	/**
	 * getFindOwnerById 
	 */	
	@RequestMapping(value = "/find/ownerById/{id_owner}", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody ownerFindDTO getFindOwnerById(
			@PathVariable Integer id_owner, 
			Model model) {
		logger.info("\n metodo: getfindOwnerById"
				+"\nid_owner =" + id_owner);
		
		ownerFindDTO result = common.findOwner("0",id_owner);
				
		return result;
	}

	/**
	 * setUpdateRequest 
	 * @throws IOException 
	 */
	
	@RequestMapping(value = "/update/request/", method = RequestMethod.POST)
	public @ResponseBody requestManagementDTO setUpdateRequest(@RequestBody VufUpdateRequestFrom updateRequestFrom, Model model, final RedirectAttributes redirectAttributes) throws IOException {

		Iterator<String> iter = updateRequestFrom.getId_requisites().iterator();
		List<requestRequisite> listRequisite = new ArrayList<requestRequisite>();
		while(iter.hasNext()){
			String requisiteSelected= iter.next();
			String[] parts = requisiteSelected.split("-");
			Integer id_requisite = Integer.valueOf(parts[0]); // id_requisite
			Integer id_request_requisite = Integer.valueOf(parts[1]); // id_request_requisite
			String option = parts[2]; // option		
			Boolean does_not_apply = false;
			Boolean nno = false;
			Boolean pending = false;
			Boolean yyes = false;
			
			switch(option) {
			   case "does_not_apply":
			   	  does_not_apply = true;
			      break;			   
			   case "no":
			   	  nno = true;
			      break;
			   case "pending":
			   	  pending = true;
			      break;			   
			   case "yes":
			   	  yyes = true;
			      break;
			}
			
			requestRequisite rowRequisite = new requestRequisite();
			rowRequisite.setDoes_not_apply(does_not_apply);
			rowRequisite.setId_request(updateRequestFrom.getId_request());
			rowRequisite.setId_request_requisite(id_request_requisite);
			rowRequisite.setId_requisite(id_requisite);
			rowRequisite.setNno(nno);
			rowRequisite.setPending(pending);
			rowRequisite.setYyes(yyes);
			
			listRequisite.add(rowRequisite);
		}
		updateRequestFrom.setRequestMngRequestRequisite(listRequisite);
		
		Iterator<String> iterOwner = updateRequestFrom.getId_owners().iterator();
		List<requestOwner> listOwner = new ArrayList<requestOwner>();
		while(iterOwner.hasNext()){
			String ownerSelected= iterOwner.next();
			String[] parts = ownerSelected.split("-");
			Integer id_owner = Integer.valueOf(parts[0]); // id_owner
			Integer id_request_owner = Integer.valueOf(parts[1]); // id_request_owner
			
			requestOwner rowOwner = new requestOwner();
			rowOwner.setId_owner(id_owner);
			rowOwner.setId_request(updateRequestFrom.getId_request());
			rowOwner.setId_request_owner(id_request_owner);
			
			listOwner.add(rowOwner);
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate = null;
		java.util.Date utilDate2 = null;
		java.util.Date utilDate3 = null;
		java.util.Date utilDate4 = null;
		try {
			utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(updateRequestFrom.getDate_request());
			if (updateRequestFrom.getDate_payment() != null){
				utilDate2 = new SimpleDateFormat("dd/MM/yyyy").parse(updateRequestFrom.getDate_payment());
			}else{
				utilDate2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2017");
			}
			if (updateRequestFrom.getDate_delivery() != null){
				utilDate3 = new SimpleDateFormat("dd/MM/yyyy").parse(updateRequestFrom.getDate_delivery());
			}else{
				utilDate3 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2017");
			}
			if (updateRequestFrom.getDate_notice_catastro() != null){
				utilDate4 = new SimpleDateFormat("dd/MM/yyyy").parse(updateRequestFrom.getDate_notice_catastro());
			}else{
				utilDate4 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2017");
			}
		} catch (ParseException e) {
			requestManagementDTO result = new requestManagementDTO();
			result.setErrorCode(-3001);
			result.setResponseMessage("Error Parse de Fecha de Solicitud");
			return result;
		}
		
		updateRequestFrom.setDate_request(dateFormat.format(utilDate));
		updateRequestFrom.setDate_payment(dateFormat.format(utilDate2));
		updateRequestFrom.setRequestMngRequestOwner(listOwner);
		updateRequestFrom.setId_user(user.getId_user_session());
		if (updateRequestFrom.getId_delivery() == null){
			updateRequestFrom.setId_delivery("");
			updateRequestFrom.setName_delivery("");
		}
		updateRequestFrom.setDate_delivery(dateFormat.format(utilDate3));

		mngRequestUpplementary upplementary = new mngRequestUpplementary();
		upplementary.setArea_terrain(updateRequestFrom.getArea_terrain());
		upplementary.setArea_usable(updateRequestFrom.getArea_usable());
		upplementary.setDate_notice_catastro(dateFormat.format(utilDate4));
		upplementary.setFront_terrain(updateRequestFrom.getFront_terrain());
		upplementary.setId_request(updateRequestFrom.getId_request());
		upplementary.setId_request_upplementary(updateRequestFrom.getId_request_upplementary());
		upplementary.setNumber_notice_catastro(updateRequestFrom.getNumber_notice_catastro());
		updateRequestFrom.setMngRequestUpplementary(upplementary);
		
		
		logger.info("\n" + updateRequestFrom.toString());//idServiceRecord

		requestManagementDTO result = requestVUF.updateRequest(updateRequestFrom);
		return result;
	}

	/**
	 * setProcessRequest 
	 */
	
	@RequestMapping(value = "/process/request/", method = RequestMethod.POST)
	public @ResponseBody tracingManagementDTO setProcessRequest(@RequestBody VufTracingManagementFrom tracingManagementFrom, Model model, final RedirectAttributes redirectAttributes) {
		logger.info("\n metodo: setProcessRequest "
				+ "\n" + tracingManagementFrom.toString());//idServiceRecord
		
		tracingManagementDTO result = requestVUF.tracingManagement(tracingManagementFrom);
		/*tracingManagementDTO result = new tracingManagementDTO();
		result.setResponseCode(200);
		result.setResponseMessage("");
		result.setMethodName("demo");*/
		return result;
	}

	/**
	 * setAssignOfficial 
	 */
	
	@RequestMapping(value = "/VUF/assign/official/", method = RequestMethod.POST)
	public @ResponseBody boolean setAssignOfficial(@RequestBody VufUpdateRequestFrom updateRequestFrom, Model model, final RedirectAttributes redirectAttributes) {
		logger.info("\n metodo: setAssignOfficial "
				+ "\n" + updateRequestFrom.toString());//idServiceRecord
		
		//boolean result = serviceRecord.sendPushNotification(sendPushNotificationResquest, user.getIdUser(), user.getToken());
		return true;
	}
	
	/**
	 * Retorna Provincia por ID de Pais Recibido 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/ordinance/{id}", produces = "application/json")
	public @ResponseBody List<ordinanceList> getOrdinanceByIdZone(@PathVariable Integer id) {
		logger.info("\nOpcion Configuraciones->Obtener Ordenanzas por IdZone=" + id);
		
		ordinanceListDTO ordinanceList = common.listOrdinance(0, id, 1);//VUF
		return ordinanceList.getResponseData();
		
	}
	
	/**
	 * Retorna exito si copia el archivo
	 * @param id_request
	 * @return
	 */
	@RequestMapping(value = "/printer/excel/{id_request}/{id_ordinance}/{id_type_request}/{typePrint}", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody ordinanceListDTO setPrinterExcel(
			@PathVariable Integer id_request,
			@PathVariable Integer id_ordinance,
			@PathVariable Integer id_type_request,
			@PathVariable String typePrint) {
		
		logger.info("\nsetPrinterExcel -> id_request = " + id_request
				+ "\ntypePrint: " + typePrint);
		if (typePrint.equals("created")){
			common.printerExcel(id_request, id_type_request);
		}
		//obtener el nombre del archivo
        ordinanceListDTO ordinanceList = common.listOrdinance(0, id_ordinance, id_type_request);
        
		return ordinanceList;
		
	}
	
	/**
	 * setAddRequestAttached 
	 */
	
	@RequestMapping(value = "/add/requestAttached/", method = RequestMethod.POST)
	public @ResponseBody requestAttachedDTO setAddRequestAttached(@RequestBody VufAddRequestAttachedFrom requestFrom, Model model, final RedirectAttributes redirectAttributes) {
		logger.info("\n metodo: setAddRequestAttached "
				+ "\n" + requestFrom.toString());//idServiceRecord
		
		requestAttachedDTO result = requestVUF.addRequestAttached(requestFrom);
		return result;
	}
	
	/**
	 * getFindPaymentVansat 
	 * @throws ClassNotFoundException 
	 */	
	@RequestMapping(value = "/find/paymentVansat/{reference_code}", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody Payment getFindPaymentVansat(
			@PathVariable String reference_code, 
			Model model) throws ClassNotFoundException {
		logger.info("\n metodo: getFindPaymentVansat"
				+"\nreference_code =" + reference_code);

        Payment payment = new Payment();
        DBConection ccn = new DBConection();
        Connection con = ccn.getDBConnection();
        
         if (con !=null){
              
             Statement proc_stmt ;

             try {
	        	 
				proc_stmt = con.createStatement();
				
	        	 logger.info("Metodo: getFindPaymentVansat\n"
	     	            + "proc_stmt" + proc_stmt.toString());
				
				ResultSet rs =proc_stmt.executeQuery("SELECT * FROM payment " +
	                     " WHERE reference_code = '"+reference_code.toUpperCase()+"'  and  payment.status= 1");             
	             
	             while (rs.next()){                 
	            	 payment.setId(rs.getInt("id"));
	            	 payment.setReference_code(rs.getString("reference_code"));
	            	 payment.setAmount(rs.getDouble("amount"));
	            	 payment.setDate(rs.getString("date"));

	            	 SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
	 				java.util.Date utilDate = null;
	 				try {	
	 					utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("date"));				
	 				} catch (ParseException e) {
	 					//The handling for the code
	 				}
	 				payment.setFormat_date(formatDate.format(utilDate));
	             }             
	             proc_stmt.close();
	             con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block	             
	        	 logger.info("Metodo: getFindPaymentVansat\n"
	            + "SQLException e" + e);
				e.printStackTrace();
				
			}

         }else{

        	 logger.info("Metodo: getFindPaymentVansat\n"
            + "Noooooo");
         }
		return payment;
	}
	
	/**
	 * printPDF 
	 * @throws JRException 
	 */
	
	@RequestMapping(value = "/VUF/print/{id_request}/", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody Boolean printVUF(
			@PathVariable int id_request) throws SQLException {
		logger.info("\n printVUF ---->    /library/iReports/rptVUFPrincipal.jasper");//idServiceRecord
		System.setProperty("java.awt.headless", "false");
		
		
		ResponseRequestListDTO responseRequestListDTO = requestVUF.listRequest(id_request, "na", "na", 0,"na", "na", "na", 1, true);
		//obtener las lista de Objects Request
		List<ResponseRequestList> requests  = responseRequestListDTO.getResponseData();
		ResponseRequestList request = requests.get(0);		
		Iterator<RequestOwnerList> iter = request.getRequestOwnerList().iterator();
		String owners = "";
		
		while(iter.hasNext()){
			RequestOwnerList owner = (RequestOwnerList)iter.next();
			owners += owner.getName_owner() + " CI: " + owner.getOwner_id() + " ";
		}		
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("p_id_request", id_request);
		parameters.put("p_owners", owners);
		parameters.put("p_payment_output", NumberToLetterConverter.convertNumberToLetter(request.getPayment_output()));
		parameters.put("p_print_when", false);

        DBConection ccn = new DBConection();
        Connection con;
		try {
			con = ccn.getDBConnectionEngineeringRequest();
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(System.getProperty("jboss.server.data.dir") 
					+ "/library/iReports/rptVUFPrincipal.jasper", parameters,con);
			/*JasperViewer jasperViewer = new	JasperViewer(jasperPrint);
			jasperViewer.setVisible(true);*/
			
			File outDir = new File(System.getProperty("jboss.server.data.dir") + "/file_request/" + id_request + "/");
			outDir.mkdirs();
			
			//SIN FIRMA
			JasperExportManager.exportReportToPdfFile( jasperPrint, System.getProperty("jboss.server.data.dir") 
					+ "/file_request/" + id_request + "/" + request.getNumber_request() + "VUFTemp.pdf" );
			
			//CON FIRMA
			parameters.put("p_print_when", true);
			jasperPrint = JasperFillManager.fillReport(System.getProperty("jboss.server.data.dir") 
					+ "/library/iReports/rptVUFPrincipal.jasper", parameters,con);
			JasperExportManager.exportReportToPdfFile( jasperPrint, System.getProperty("jboss.server.data.dir") 
					+ "/file_request/" + id_request + "/" + request.getNumber_request() + "VUF.pdf" );
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done!");
		return true;
	}
	
	/**
	 * printPDF 
	 * @throws JRException 
	 */
	
	@RequestMapping(value = "/VUE/print/noticePending/{id_request}/", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody Boolean printNoticePendingVUE(
			@PathVariable int id_request) throws SQLException {
		
		ResponseRequestListDTO responseRequestListDTO = requestVUF.listRequest(id_request, "na", "na", 0,"na", "na", "na", 2, true);
		//obtener las lista de Objects Request
		List<ResponseRequestList> requests  = responseRequestListDTO.getResponseData();
		ResponseRequestList request = requests.get(0);		
		Iterator<RequestOwnerList> iter = request.getRequestOwnerList().iterator();
		String owners = "";
		
		while(iter.hasNext()){
			RequestOwnerList owner = (RequestOwnerList)iter.next();
			owners += owner.getName_owner() + " CI: " + owner.getOwner_id() + " ";
		}		
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("p_id_request", id_request);
		parameters.put("p_owners", owners);
		parameters.put("p_print_when", false);
		
		logger.info("\n printVUF ---->    /library/iReports/reportNoticePendiente.jasper"
				+"\nid_request = " + id_request 
				+"\nowners = " + owners);//idServiceRecord

        DBConection ccn = new DBConection();
        Connection con;
		try {
			con = ccn.getDBConnectionEngineeringRequest();
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(System.getProperty("jboss.server.data.dir") 
					+ "/library/iReports/reportNoticePendiente.jasper", parameters,con);
			/*JasperViewer jasperViewer = new	JasperViewer(jasperPrint);
			jasperViewer.setVisible(true);*/
			
			File outDir = new File(System.getProperty("jboss.server.data.dir") + "/file_request/" + id_request + "/");
			outDir.mkdirs();
			
			//SIN FIRMA
			JasperExportManager.exportReportToPdfFile( jasperPrint, System.getProperty("jboss.server.data.dir") 
					+ "/file_request/" + id_request + "/" + request.getNumber_request() + "NPVUETemp.pdf" );
			
			//CON FIRMA
			parameters.put("p_print_when", true);
			jasperPrint = JasperFillManager.fillReport(System.getProperty("jboss.server.data.dir") 
					+ "/library/iReports/reportNoticePendiente.jasper", parameters,con);
			JasperExportManager.exportReportToPdfFile( jasperPrint, System.getProperty("jboss.server.data.dir") 
					+ "/file_request/" + id_request + "/" + request.getNumber_request() + "NPVUE.pdf" );
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done!");
		return true;
	}
	
	/**
	 * printPDF 
	 * @throws JRException 
	 */
	
	@RequestMapping(value = "/VUE/print/noticeMotive/{id_request}/", method= RequestMethod.GET, produces = "application/json")
	public @ResponseBody Boolean printNoticeMotiveVUE(
			@PathVariable int id_request) throws SQLException {
		logger.info("\n printVUF ---->    /library/iReports/rptVUFPrincipal.jasper");//idServiceRecord
		System.setProperty("java.awt.headless", "false");
		
		
		ResponseRequestListDTO responseRequestListDTO = requestVUF.listRequest(id_request, "na", "na", 0,"na", "na", "na", 2, true);
		//obtener las lista de Objects Request
		List<ResponseRequestList> requests  = responseRequestListDTO.getResponseData();
		ResponseRequestList request = requests.get(0);		
		Iterator<RequestOwnerList> iter = request.getRequestOwnerList().iterator();
		String owners = "";
		
		while(iter.hasNext()){
			RequestOwnerList owner = (RequestOwnerList)iter.next();
			owners += owner.getName_owner() + " CI: " + owner.getOwner_id() + " ";
		}		
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("p_id_request", id_request);
		parameters.put("p_owners", owners);
		parameters.put("p_print_when", false);

        DBConection ccn = new DBConection();
        Connection con;
		try {
			con = ccn.getDBConnectionEngineeringRequest();
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(System.getProperty("jboss.server.data.dir") 
					+ "/library/iReports/report1NoticeMotive.jasper", parameters,con);
			/*JasperViewer jasperViewer = new	JasperViewer(jasperPrint);
			jasperViewer.setVisible(true);*/
			
			File outDir = new File(System.getProperty("jboss.server.data.dir") + "/file_request/" + id_request + "/");
			outDir.mkdirs();
			
			//SIN FIRMA
			JasperExportManager.exportReportToPdfFile( jasperPrint, System.getProperty("jboss.server.data.dir") 
					+ "/file_request/" + id_request + "/" + request.getNumber_request() + "NMVUETemp.pdf" );
			
			//CON FIRMA
			parameters.put("p_print_when", true);
			jasperPrint = JasperFillManager.fillReport(System.getProperty("jboss.server.data.dir") 
					+ "/library/iReports/report1NoticeMotive.jasper", parameters,con);
			JasperExportManager.exportReportToPdfFile( jasperPrint, System.getProperty("jboss.server.data.dir") 
					+ "/file_request/" + id_request + "/" + request.getNumber_request() + "NMVUE.pdf" );
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done!");
		return true;
	}

	/**
	 * setRequestNoticeMotive 
	 */
	
	@RequestMapping(value = "/VUE/NoticeMotive/", method = RequestMethod.POST)
	public @ResponseBody requestNoticeMotiveManagementDTO setRequestNoticeMotive(@RequestBody mngRequestNoticeMotive mngRequestNoticeMotiveFrom, Model model, final RedirectAttributes redirectAttributes) {
		logger.info("\n metodo: setProcessRequest "
				+ "\n" + mngRequestNoticeMotiveFrom.toString());//idServiceRecord

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate = null;
		try {
			utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(mngRequestNoticeMotiveFrom.getDate_gaceta_zoning());
		} catch (ParseException e) {
			requestNoticeMotiveManagementDTO result = new requestNoticeMotiveManagementDTO();
			result.setErrorCode(-3001);
			result.setResponseMessage("Error Parse de Fecha de Solicitud");
			return result;
		}
		mngRequestNoticeMotiveFrom.setDate_gaceta_zoning(dateFormat.format(utilDate));
		requestNoticeMotiveManagementDTO result = requestVUE.requestNoticeMotiveManagement(mngRequestNoticeMotiveFrom);
		return result;
	}

	/**
	 * setRequestNoticePending 
	 */
	
	@RequestMapping(value = "/VUE/NoticePending/", method = RequestMethod.POST)
	public @ResponseBody requestNoticePendingManagementDTO setRequestNoticePending(@RequestBody mngRequestNoticePending mngRequestNoticePendingFrom, Model model, final RedirectAttributes redirectAttributes) {
		logger.info("\n metodo: setProcessRequest "
				+ "\n" + mngRequestNoticePendingFrom.toString());//idServiceRecord
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate = null;
		try {
			utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(mngRequestNoticePendingFrom.getDate_notice_request_previous());
		} catch (ParseException e) {
			requestNoticePendingManagementDTO result = new requestNoticePendingManagementDTO();
			result.setErrorCode(-3001);
			result.setResponseMessage("Error Parse de Fecha de Solicitud");
			return result;
		}
		mngRequestNoticePendingFrom.setDate_notice_request_previous(dateFormat.format(utilDate));
		requestNoticePendingManagementDTO result = requestVUE.requestNoticePendingManagement(mngRequestNoticePendingFrom);
		return result;
	}
	

}
