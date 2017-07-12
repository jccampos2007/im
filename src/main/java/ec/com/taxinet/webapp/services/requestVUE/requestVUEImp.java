package ec.com.taxinet.webapp.services.requestVUE;

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
import ec.com.taxinet.webapp.dto.deleteRequestOwnerDTO;
import ec.com.taxinet.webapp.dto.requestAttachedDTO;
import ec.com.taxinet.webapp.dto.requestManagementDTO;
import ec.com.taxinet.webapp.dto.requestNoticeMotiveManagementDTO;
import ec.com.taxinet.webapp.dto.requestNoticePendingManagementDTO;
import ec.com.taxinet.webapp.dto.tracingManagementDTO;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufTracingManagementFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom.VufAddRequestAttachedFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.mngRequestNoticeMotive;
import ec.com.taxinet.webapp.form.model.RequestListForm.mngRequestNoticePending;


@Service
public class requestVUEImp implements IRequestVUE{
	
	public requestVUEImp(){
		
	}

	private static final Logger logger = LoggerFactory.getLogger(requestVUEImp.class);

	@Autowired(required=true)
	//protected RestTemplate restTemplate;
	
	@Value("${taxinet_host}")
	private String host;
	
	@Value("${END_POINT_NOTICEMOTIVE}")
	private String end_point_NoticeMotiveManagement;
	
	@Value("${END_POINT_NOTICEPENDING}")
	private String end_point_NoticePendingManagement;
	
	@Value("${END_POINT_VARIABLENUMERALDELETE}")
	private String end_point_variableNumeralDelete;
	
	@Override
	public requestNoticeMotiveManagementDTO requestNoticeMotiveManagement(mngRequestNoticeMotive mngRequestNoticeMotiveFrom) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_NoticeMotiveManagement);
		logger.info("\nMetodo=requestNoticeMotiveManagement"
			+ "\nuri="+uri.toString()
			+ "\n"+mngRequestNoticeMotiveFrom.toString() );

		requestNoticeMotiveManagementDTO rnmDTO = null;
		try{
			RestTemplate restTemplate = new RestTemplate();
			rnmDTO = restTemplate.postForObject(uri.toString(), mngRequestNoticeMotiveFrom, requestNoticeMotiveManagementDTO.class);
			logger.info("\nrequestNoticeMotiveManagement="+rnmDTO.toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();			
		}
				
		return rnmDTO;
	}
	
	@Override
	public requestNoticePendingManagementDTO requestNoticePendingManagement(mngRequestNoticePending mngRequestNoticePendingFrom) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_NoticePendingManagement);
		logger.info("\nMetodo=requestNoticePendingManagement"
			+ "\nuri="+uri.toString()
			+ "\n"+mngRequestNoticePendingFrom.toString() );

		requestNoticePendingManagementDTO rnmDTO = null;
		try{
			RestTemplate restTemplate = new RestTemplate();
			rnmDTO = restTemplate.postForObject(uri.toString(), mngRequestNoticePendingFrom, requestNoticePendingManagementDTO.class);
			logger.info("\nrequestNoticeMotiveManagement="+rnmDTO.toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();			
		}
				
		return rnmDTO;
	}
	
	@Override
	public deleteRequestOwnerDTO deleteVariableNumeral(Integer id_request_variable_numeral) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_variableNumeralDelete);
		
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id_request_variable_numeral", id_request_variable_numeral);
			
		logger.info("\nuri="+uri.toString()
				+ "\nid_request_variable_numeral="+id_request_variable_numeral);

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
	
}
