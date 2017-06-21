package ec.com.taxinet.webapp.services.ResponsibleOfficial;

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

import ec.com.taxinet.webapp.dto.CiudadanoSucreDTO;


@Service
public class ResponsibleOfficialImp implements IResponsibleOfficial{

	private static final Logger logger = LoggerFactory.getLogger(ResponsibleOfficialImp.class);

	@Autowired(required=true)
	//protected RestTemplate restTemplate;
	
	@Value("${taxinet_host}")
	private String host;
	
	@Value("${END_POINT_CS}")
	private String end_point_cs;
	
	public ResponsibleOfficialImp(){
		
	}
	
	@Override
	public CiudadanoSucreDTO findCS(String nroSolicitud) {
		
		StringBuffer uri = new StringBuffer();
		uri.append(host).append(end_point_cs);
						
		Map<String, String> params = new HashMap<String, String>();
		params.put("nroSolicitud", nroSolicitud);
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//headers.set("idUser", "");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		CiudadanoSucreDTO csDTO = null;
		try{
			ResponseEntity<CiudadanoSucreDTO> response = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, CiudadanoSucreDTO.class, params);
			csDTO  = response.getBody();
		}catch(HttpClientErrorException e){
			e.printStackTrace();
		}
				
		return csDTO;
	}
	
}
