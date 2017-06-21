/**
 * 
 */
package ec.com.taxinet.webapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Juan Campos
 *
 */
public class RedirectOnSessionCount implements Filter {
	
	private static final Logger logger = LoggerFactory.getLogger(RedirectOnSessionCount.class);

	/**
	 * 
	 */
	public RedirectOnSessionCount() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
				
			HttpServletResponse httpResponse = (HttpServletResponse) response;
	        HttpServletRequest httpRequest = (HttpServletRequest)request;
	        Integer sessionCount = (Integer) request.getServletContext().getAttribute("SESSION_COUNT");//fetching session count from application scope
	        
	        //logger.info("URL => "+httpRequest.getRequestURL().toString());
	        
	        if(sessionCount != null && sessionCount == 0){ 
	        	httpResponse.sendRedirect("/sessiontimeout");
            }
	        chain.doFilter(request, response);

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
