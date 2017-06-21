package ec.com.taxinet.webapp.services.Common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import ec.com.taxinet.webapp.dto.deleteRequestOwnerDTO;
import ec.com.taxinet.webapp.dto.ordinanceListDTO;
import ec.com.taxinet.webapp.dto.ownerFindDTO;
import ec.com.taxinet.webapp.dto.ownerManagementDTO;
import ec.com.taxinet.webapp.dto.paymentManagementDTO;
import ec.com.taxinet.webapp.dto.printerExcelDTO;
import ec.com.taxinet.webapp.dto.typeUseListDTO;
import ec.com.taxinet.webapp.dto.variableNumeralListDTO;
import ec.com.taxinet.webapp.dto.zoneListDTO;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufAddOwnerFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufAddPaymentFrom;

@Service
public class CommonImp implements ICommon{

	private static final Logger logger = LoggerFactory.getLogger(CommonImp.class);

	@Autowired(required=true)
	//protected RestTemplate restTemplate;
	
	@Value("${taxinet_host}")
	private String host;
	
	@Value("${END_POINT_TYPEUSE}")
	private String end_point_typeUse;
	
	@Value("${END_POINT_OWNERMANAGEMENT}")
	private String end_point_ownerManagement;
	
	@Value("${END_POINT_OWNERLIST}")
	private String end_point_ownerList;
	
	@Value("${END_POINT_ORDINANCELIST}")
	private String end_point_ordinanceList;
	
	@Value("${END_POINT_ZONELIST}")
	private String end_point_zoneList;
	
	@Value("${END_POINT_PAYMENTMANAGEMENT}")
	private String end_point_paymentManagement;
	
	@Value("${END_POINT_PRINTEREXCEL}")
	private String end_point_printerExcel;
	
	@Value("${END_POINT_REQUESTOWNERDELETE}")
	private String end_point_requestOwnerDelete;
	
	@Value("${END_POINT_VARIABLENUMERAL}")
	private String end_point_variableNumeral;
	
	public CommonImp(){
		
	}
	
	@Override
	public ownerManagementDTO addOwner(VufAddOwnerFrom addOwnerFrom) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_ownerManagement);
		logger.info("\nuri="+uri.toString()
				+ "\naddOwnerFrom="+addOwnerFrom.toString() );

		ownerManagementDTO omDTO = null;
		try{
			RestTemplate restTemplate = new RestTemplate();
			omDTO = restTemplate.postForObject(uri.toString(), addOwnerFrom, ownerManagementDTO.class);
			logger.info("\nlogin="+omDTO.toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();			
		}
				
		return omDTO;
	}
	
	@Override
	public paymentManagementDTO addPayment(VufAddPaymentFrom addPaymentFrom) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_paymentManagement);
		logger.info("\nuri="+uri.toString()
				+ "\naddPayment="+addPaymentFrom.toString());

		paymentManagementDTO omDTO = null;
		try{
			RestTemplate restTemplate = new RestTemplate();
			omDTO = restTemplate.postForObject(uri.toString(), addPaymentFrom, paymentManagementDTO.class);
			logger.info("\nlogin="+omDTO.toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();			
		}
				
		return omDTO;
	}
	
	@Override
	public ownerFindDTO findOwner(String ownerId, Integer idOwner) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_ownerList);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("idOwner", idOwner.toString());
		params.put("ownerId", ownerId);
			
		logger.info("\nuri="+uri.toString()
				+ "\nownerId="+ownerId );

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ownerFindDTO ownerList = null;		
		try{			
			ResponseEntity<ownerFindDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, ownerFindDTO.class, params);
			ownerList = response.getBody();
			logger.info("\n requestList response.getBody() = "+ response.getBody().toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
		
		return ownerList;
	}
	
	@Override
	public deleteRequestOwnerDTO deleteRequestOwner(Integer id_request_owner) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_requestOwnerDelete);
		
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id_request_owner", id_request_owner);
			
		logger.info("\nuri="+uri.toString()
				+ "\nid_request_owner="+id_request_owner);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		deleteRequestOwnerDTO ownerList = null;	
		try{			
			ResponseEntity<deleteRequestOwnerDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, deleteRequestOwnerDTO.class, params);
			ownerList = response.getBody();
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
				
		return ownerList;
	}
	
	@Override
	public printerExcelDTO printerExcel(Integer id_request) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_printerExcel);
		
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id_request", id_request);
			
		logger.info("metodo:printerExcel"
				+ "\nuri="+uri.toString()
				+ "\nid_request="+id_request);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		printerExcelDTO ownerList = null;	
		try{			
			ResponseEntity<printerExcelDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, printerExcelDTO.class, params);
			ownerList = response.getBody();
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
				
		return ownerList;
	}
	
	@Override
	public typeUseListDTO listTypeUse() {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_typeUse);
		
		Map<String, String> params = new HashMap<String, String>();
			
		logger.info("\nuri="+uri.toString());

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		typeUseListDTO ordinanceList = null;		
		try{			
			ResponseEntity<typeUseListDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, typeUseListDTO.class, params);
			ordinanceList = response.getBody();
			logger.info("\n requestList response.getBody() = "+ response.getBody().toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
				
		return ordinanceList;
	}
	
	@Override
	public ordinanceListDTO listOrdinance(Integer p_id_ordinance, Integer p_id_zone, Integer p_id_type_request) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_ordinanceList);
		
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("p_id_ordinance", p_id_ordinance);
		params.put("p_id_zone", p_id_zone);
		params.put("p_id_type_request", p_id_type_request);
			
		logger.info("\nuri="+uri.toString()
		+ "\np_id_ordinance="+p_id_ordinance
		+ "\np_id_zone="+p_id_zone
		+ "\np_id_type_request="+p_id_type_request );

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ordinanceListDTO ordinanceList = null;		
		try{			
			ResponseEntity<ordinanceListDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, ordinanceListDTO.class, params);
			ordinanceList = response.getBody();
			logger.info("\n requestList response.getBody() = "+ response.getBody().toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
				
		return ordinanceList;
	}
	
	@Override
	public zoneListDTO listZone(Integer id_zone) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_zoneList);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("id_zone", id_zone.toString());
			
		logger.info("\nuri="+uri.toString()
			+ "\nid_zone="+id_zone);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		zoneListDTO zoneList = null;		
		try{			
			ResponseEntity<zoneListDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, zoneListDTO.class, params);
			zoneList = response.getBody();
			logger.info("\n requestList response.getBody() = "+ response.getBody().toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
				
		return zoneList;
	}
	
	//
	@Override
	public variableNumeralListDTO listVariableNumeral() {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_variableNumeral);
		
		Map<String, String> params = new HashMap<String, String>();

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		variableNumeralListDTO variableNumeralList = null;
		try{			
			ResponseEntity<variableNumeralListDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, variableNumeralListDTO.class, params);
			variableNumeralList = response.getBody();
			logger.info("\n listVariableNumeral response.getBody() = "+ response.getBody().toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
		
		return variableNumeralList;
	}
	
}
