/**
 * 
 */
package ec.com.taxinet.webapp.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ec.com.taxinet.webapp.controllers.LoginController;

/**
 * @author Juan Campos
 *
 */
public class ApplicationSessionListener implements HttpSessionListener {
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationSessionListener.class);
	
	private Integer sessionCount;

	/**
	 * 
	 */
	public ApplicationSessionListener() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		
		synchronized (this) {
	        ServletContext application = event.getSession().getServletContext();
	        sessionCount = (Integer) application.getAttribute("SESSION_COUNT");
	        if (sessionCount == null) {
	            application.setAttribute("SESSION_COUNT", (sessionCount = 1));//setting sessioncount inside application scope
	        } else {
	            application.setAttribute("SESSION_COUNT", sessionCount + 1);
	        }
	        //logger.info("Session Created1: "+ event.getSession().getId());
	        //logger.info("Total Sessions1: " + sessionCount);
	    }

	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		
		synchronized (this) {
	        ServletContext application = event.getSession().getServletContext();
	        sessionCount = (Integer) application.getAttribute("SESSION_COUNT");
	        application.setAttribute("SESSION_COUNT", sessionCount - 1);
	    }
		/*logger.info("Session Destroyed: " + event.getSession().getId());
		logger.info("Total Sessions: " + sessionCount);*/

	}

}
