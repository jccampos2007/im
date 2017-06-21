/**
 * 
 */
package ec.com.taxinet.webapp.services.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Juan Campos
 *
 */
@Service
public class UtilsImp implements IUtils {

	@Autowired(required=true)
	//protected RestTemplate restTemplate;
	
	@Value("${taxinet_host}")
	private String host;
	
	public UtilsImp() {
		// TODO Auto-generated constructor stub
	}

}
