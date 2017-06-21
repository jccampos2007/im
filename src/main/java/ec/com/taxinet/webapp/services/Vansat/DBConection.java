package ec.com.taxinet.webapp.services.Vansat;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ec.com.taxinet.webapp.controllers.PanelController;
import ec.com.taxinet.webapp.model.ConfiguracionBd;
import ec.com.taxinet.webapp.session.model.User;

/**
 *
 * @author dukai
 */
public class DBConection {
	

	@Autowired
	private IVansat vansat;
	
	private static final Logger logger = LoggerFactory.getLogger(DBConection.class);
	
    public Connection getDBConnection() throws ClassNotFoundException {
    /**
    * Metodo: getDBConnection
    * Descripción: Establece los parametros iniciales de conexón
    * 
    */
        
        ConfiguracionBd configbd = new ConfiguracionBd();
    
        logger.info("\n Metodo: getDBConnection\n"
            + "Descripcion : Busca conectarse a la BD ");

        Connection dbConnection = null;
        
        //configbd =  vansat.getPropValues();
    	configbd.setDriver("org.postgresql.Driver");
    	configbd.setUrl("jdbc:postgresql://localhost:5432/vansat");
        configbd.setUser("postgres");
        configbd.setPassword("vale060807");

    	logger.info("\n Metodo: getDBConnection"
                + "\n configbd.setDriver()" + configbd.getDriver()
                + "\n configbd.getUrl()" + configbd.getUrl()
                + "\n configbd.getUser()" + configbd.getUser()
                + "\n configbd.getPassword()" + configbd.getPassword());
    	
        Class.forName(configbd.getDriver());
        
        try {
            if (configbd != null) {
                
                dbConnection = DriverManager.getConnection(
                                configbd.getUrl(), 
                                configbd.getUser(),
                                configbd.getPassword());
                
                return dbConnection;
            
            }
        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }/*catch (ClassNotFoundException e) {

        	logger.info("\n Metodo: getDBConnection\n"
                    + "ClassNotFoundException:" + e.getMessage());
            System.out.println(e.getMessage());
        }*/
        		/*                
                */
        return dbConnection;
   
   }
	
    public Connection getDBConnectionEngineeringRequest() throws ClassNotFoundException {
    /**
    * Metodo: getDBConnection
    * Descripción: Establece los parametros iniciales de conexón
    * 
    */
        
        ConfiguracionBd configbd = new ConfiguracionBd();
    
        logger.info("\n Metodo: getDBConnection\n"
            + "Descripcion : Busca conectarse a la BD ");

        Connection dbConnection = null;
        
        //configbd =  vansat.getPropValues();
    	configbd.setDriver("org.postgresql.Driver");
    	configbd.setUrl("jdbc:postgresql://localhost:5432/engineering_request");
        configbd.setUser("user_request");
        configbd.setPassword("4dm1np4ss");

    	logger.info("\n Metodo: getDBConnection"
                + "\n configbd.setDriver()" + configbd.getDriver()
                + "\n configbd.getUrl()" + configbd.getUrl()
                + "\n configbd.getUser()" + configbd.getUser()
                + "\n configbd.getPassword()" + configbd.getPassword());
    	
        Class.forName(configbd.getDriver());
        
        try {
            if (configbd != null) {
                
                dbConnection = DriverManager.getConnection(
                                configbd.getUrl(), 
                                configbd.getUser(),
                                configbd.getPassword());
                
                return dbConnection;
            
            }
        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }/*catch (ClassNotFoundException e) {

        	logger.info("\n Metodo: getDBConnection\n"
                    + "ClassNotFoundException:" + e.getMessage());
            System.out.println(e.getMessage());
        }*/
        		/*                
                */
        return dbConnection;
   
   }    
    
    
    
    
    
}