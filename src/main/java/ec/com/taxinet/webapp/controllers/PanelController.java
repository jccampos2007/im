/**
 * 
 */
package ec.com.taxinet.webapp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ec.com.taxinet.webapp.session.model.User;

/**
 * @author JUAN CAMPOS
 *
 */
@Controller
@Scope("request")
public class PanelController {
	
	private static final Logger logger = LoggerFactory.getLogger(PanelController.class);
	
	@Autowired
	private User user;
	/**
	 * index
	 */
	@RequestMapping(value = "/panel", method = RequestMethod.GET)
	public String index(Model model) {
		
		logger.info("Welcome Panel Main!");		 	
		model.addAttribute("user", user);

		return "mainMenu";
	}

	/**
	 * injecta objeto User al objeto Response
	 * @param model
	 */
	@ModelAttribute
    public void addAttributes(Model model) {
	   model.addAttribute("user", user);
    }
	
	
}
