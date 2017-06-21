/**
 * 
 */
package ec.com.taxinet.webapp.services.login;

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

import ec.com.taxinet.webapp.dto.LoginDTO;
import ec.com.taxinet.webapp.dto.RolAndPermissionDTO;
import ec.com.taxinet.webapp.dto.typeUseListDTO;
import ec.com.taxinet.webapp.dto.userSessionDTO;
import ec.com.taxinet.webapp.form.model.UserForm;
import ec.com.taxinet.webapp.form.model.UserForm.RoleByModuleFrom;

@Service
public class LoginImp implements ILogin {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginImp.class);

	/**
	 * 
	 */
	
	@Autowired(required=true)
	//protected RestTemplate restTemplate;

	@Value("${taxinet_host}")
	private String host;
	
	@Value("${END_POINT_LOGIN}")
	private String end_point_login;
	
	@Value("${END_POINT_ROLEBYMODULE}")
	private String end_point_RoleByModule;
	
	@Value("${END_POINT_USERSECCION}")
	private String end_point_userSeccion;
	
	public LoginImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public LoginDTO login(UserForm userform) {
		logger.info("\nhost="+host);
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_login);
		
		LoginDTO login = null;
		
		try{			
			RestTemplate restTemplate = new RestTemplate();
			login = restTemplate.postForObject(uri.toString(), userform, LoginDTO.class);
			logger.info("\nlogin="+login.toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
		return login;
	}
	
	@Override
	public RolAndPermissionDTO getRoleAndPermissions(RoleByModuleFrom roleByModuleFrom){
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_RoleByModule);

		RolAndPermissionDTO roleAndPermissions=null;
		
		try{
			RestTemplate restTemplate = new RestTemplate();
			roleAndPermissions = restTemplate.postForObject(uri.toString(), roleByModuleFrom, RolAndPermissionDTO.class);
			logger.info("\nlogin="+roleAndPermissions.toString());			
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
		
		return roleAndPermissions;
		
	}
	@Override
	public userSessionDTO getResponsibleOfficial(String p_name_role) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_userSeccion);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("p_name_role", p_name_role);
			
		logger.info("\n >>>> uri="+uri.toString()
				+ "\n >>>> p_name_role="+p_name_role);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		userSessionDTO userSessionList = null;		
		try{			
			ResponseEntity<userSessionDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, userSessionDTO.class, params);
			userSessionList = response.getBody();
			logger.info("\n userSessionList response.getBody() = "+ response.getBody().toString());
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
				
		return userSessionList;
	}

}
