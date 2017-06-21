package ec.com.taxinet.webapp.services.requestVUF;

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

import ec.com.taxinet.webapp.dto.ResponseRequestListDTO;
import ec.com.taxinet.webapp.dto.requestAttachedDTO;
import ec.com.taxinet.webapp.dto.requestManagementDTO;
import ec.com.taxinet.webapp.dto.tracingManagementDTO;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufTracingManagementFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom.VufAddRequestAttachedFrom;


@Service
public class requestVUFImp implements IRequestVUF{

	private static final Logger logger = LoggerFactory.getLogger(requestVUFImp.class);

	@Autowired(required=true)
	//protected RestTemplate restTemplate;
	
	@Value("${taxinet_host}")
	private String host;
	
	@Value("${END_POINT_REQUESTMANAGEMENT}")
	private String end_point_requestManagement;
	
	@Value("${END_POINT_REQUESTLIST}")
	private String end_point_requestList;
	
	@Value("${END_POINT_TRACINGMANAGEMENT}")
	private String end_point_tracingManagement;
	
	@Value("${END_POINT_REQUESTATTACHED}")
	private String end_point_requestAttached;
	
	public requestVUFImp(){
		
	}
	
	@Override
	public requestManagementDTO updateRequest(VufUpdateRequestFrom requestFrom) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_requestManagement);
		logger.info("\nMetodo=updateRequest"
			+ "\nuri="+uri.toString()
			+ "\n"+requestFrom.toString() );

		requestManagementDTO omDTO = null;
		try{
			RestTemplate restTemplate = new RestTemplate();
			omDTO = restTemplate.postForObject(uri.toString(), requestFrom, requestManagementDTO.class);
			logger.info("\nlogin="+omDTO.toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();			
		}
				
		return omDTO;
	}
	
	@Override
	public requestAttachedDTO addRequestAttached(VufAddRequestAttachedFrom requestFrom) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_requestAttached);
		logger.info("\nMetodo=addRequestAttached"
			+ "\nuri="+uri.toString()
			+ "\n"+requestFrom.toString() );

		requestAttachedDTO raDTO = null;
		try{
			RestTemplate restTemplate = new RestTemplate();
			raDTO = restTemplate.postForObject(uri.toString(), requestFrom, requestAttachedDTO.class);
			logger.info("\nlogin="+raDTO.toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();			
		}
		
		return raDTO;
	}
	
	@Override
	public tracingManagementDTO tracingManagement(VufTracingManagementFrom tracingManagementFrom) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_tracingManagement);
		logger.info("\nMetodo=tracingManagement"
			+ "\nuri="+uri.toString()
			+ "\n"+tracingManagementFrom.toString() );

		tracingManagementDTO tmDTO = null;
		try{
			RestTemplate restTemplate = new RestTemplate();
			tmDTO = restTemplate.postForObject(uri.toString(), tracingManagementFrom, tracingManagementDTO.class);
			logger.info("\ntmDTO="+tmDTO.toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();			
		}		
		return tmDTO;
	}


	@Override
	public ResponseRequestListDTO listRequest(
			int id_request, 
			String number_request, 
			String responsable,
			int id_responsible_official, 
			String date_request, 
			String date_request_hasta, 
			String status_request,
			int id_type_request,
			Boolean data_additional) {
				
		//
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_requestList);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("data_additional", data_additional.toString());
		if (id_request != 0){
			uri.append("&id_request={id_request}");
			params.put("id_request", Integer.toString(id_request));			
		}
		if (!number_request.equals("na")){
			uri.append("&number_request={number_request}");
			params.put("number_request", number_request);			
		}
		if (!responsable.equals("na")){
			uri.append("&responsable={responsable}");
			params.put("responsable", responsable);			
		}
		if (!date_request.equals("na")){
			uri.append("&date_request={date_request}&date_request_hasta={date_request_hasta}");
			params.put("date_request", date_request);	
			params.put("date_request_hasta", date_request_hasta);		
		}
		if (!status_request.equals("na")){
			uri.append("&status_request={status_request}");
			params.put("status_request", status_request);			
		}
		if (id_responsible_official != 0){
			uri.append("&id_responsible_official={id_responsible_official}");
			params.put("id_responsible_official", Integer.toString(id_responsible_official));			
		}
		if (id_type_request != 0){
			uri.append("&id_type_request={id_type_request}");
			params.put("id_type_request", Integer.toString(id_type_request));			
		}
		
		logger.info("\n listRequest "
			+"\nuri = "+ uri.toString()
			+"\nid_request = "+id_request
			+"\nnumberRequest = "+number_request
			+"\nresponsable = "+responsable
			+"\nid_responsible_official = "+id_responsible_official
			+"\ndateRequestFrom = "+date_request
			+"\ndateRequestTo = "+date_request_hasta
			+"\nstatus_request = "+status_request
			+"\nid_type_request = "+id_type_request
			+"\nparams = "+params.toString()
		);
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ResponseRequestListDTO requestList = null;		
		try{			
			ResponseEntity<ResponseRequestListDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, ResponseRequestListDTO.class, params);
			requestList = response.getBody();
			logger.info("\n requestList response.getBody() = "+ response.getBody().toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
		
		return requestList;
	}
	
}
