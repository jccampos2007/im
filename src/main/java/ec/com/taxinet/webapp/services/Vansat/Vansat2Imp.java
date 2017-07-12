package ec.com.taxinet.webapp.services.Vansat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Vansat2Imp{

	private static final Logger logger = LoggerFactory.getLogger(Vansat2Imp.class);

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
	
	@Value("${END_POINT_REQUESTOWNERDELETE}")
	private String end_point_requestOwnerDelete;
	
	@Value("${END_POINT_URL}")
	private String end_point_url;
	
	@Value("${END_POINT_USER}")
	private String end_point_user;
	
	@Value("${END_POINT_PASSWORD}")
	private String end_point_password;
	
	public Vansat2Imp(){
		
	}
	
	public Boolean getPropValuesVansat() {
		
		logger.info("\nMetodo: getPropValues >>" 
		    	+ "\nend_point_url: " + end_point_typeUse);
		
		return true;
	}
	
}
