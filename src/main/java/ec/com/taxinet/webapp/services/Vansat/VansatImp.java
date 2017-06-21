package ec.com.taxinet.webapp.services.Vansat;

import java.io.IOException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ec.com.taxinet.webapp.model.ConfiguracionBd;

@Service
public class VansatImp implements IVansat {
	
	private static final Logger logger = LoggerFactory.getLogger(VansatImp.class);
	
	String result = "";
	
	@Value("${END_POINT_DRIVER}")
	private String end_point_driver;
	
	@Value("${END_POINT_URL}")
	private String end_point_url;
	
	@Value("${END_POINT_USER}")
	private String end_point_user;
	
	@Value("${END_POINT_PASSWORD}")
	private String end_point_password;
	
	public VansatImp(){
		
	}
    
    public ConfiguracionBd getPropValues() {
    	
    	logger.info("\nMetodo: getPropValues >>" 
    	+ "\nend_point_url: " + end_point_url);
    	
    	StringBuffer url = new StringBuffer();
		url.append(end_point_url);
    	
    	logger.info("\nMetodo: getPropValues <<" 
    	+ "\nurl: " +url);
      
        ConfiguracionBd config= null;        
        Date time = new Date(System.currentTimeMillis());
        config = new ConfiguracionBd(end_point_driver.toString(),url.toString(), end_point_user,end_point_password );
        result = "Valores archivo de configuracion = Driver:" + end_point_driver.toString() 
        		+ ", URL:" + url.toString() + ", User: " + end_point_user
                + ", Password: *****" ;//+  password;
        logger.info("\n" + result + "\nProgram Ran on " + time );
        return config;
    
    }

}
