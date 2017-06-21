package ec.com.taxinet.webapp.services.logout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import ec.com.taxinet.webapp.dto.LogoutDTO;
import ec.com.taxinet.webapp.form.model.LogoutForm;
import ec.com.taxinet.webapp.services.CiudadanoSucre.CiudadanoSucreImp;


@Service
public class LogoutImp implements ILogout{

	private static final Logger logger = LoggerFactory.getLogger(CiudadanoSucreImp.class);	
	
	@Autowired
	//protected RestTemplate restTemplate;
	
	@Value("${taxinet_host}")
	private String host;
	@Value("${END_POINT_LOGOUT}")
	private String end_point;
	
	public LogoutImp() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public LogoutDTO logout(LogoutForm logoutForm) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point);
		
		LogoutDTO logout = null;
		
		try{
			RestTemplate restTemplate = new RestTemplate();
			logout = restTemplate.postForObject(uri.toString(), logoutForm, LogoutDTO.class);
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}

		
		logger.info("\n metodo: logout =  "
				+ "\n logout =  " + logout.toString());
		
		return logout;
		
	}

}
