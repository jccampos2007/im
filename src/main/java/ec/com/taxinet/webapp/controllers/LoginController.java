/**
 * 
 */
package ec.com.taxinet.webapp.controllers;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.com.taxinet.webapp.dto.LoginDTO;
import ec.com.taxinet.webapp.dto.RolAndPermissionDTO;
import ec.com.taxinet.webapp.form.model.UserForm;
import ec.com.taxinet.webapp.form.model.UserForm.RoleByModuleFrom;
import ec.com.taxinet.webapp.services.login.ILogin;
import ec.com.taxinet.webapp.session.model.User;

/**
 * @author Juan Campos
 *
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private User user;
	
	@Autowired
	private ILogin loginService;
	
	@Value("${END_POINT_web}")
	private String host;
			
	/**
	 * index
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		logger.info("Welcome home!!!!");		
		
		return "home";
	}	
	
	/**
	 * Valida las credenciales de inicio de sesion del usuario
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("userform") UserForm userform, Model model, final RedirectAttributes redirectAttributes) {
		
		
		String viewResult = "redirect:/login";
		
		LoginDTO login = loginService.login(userform);

		/*LoginDTO login = new LoginDTO();
		login.setErrorCode(0);
		login.setMethodName("login");
		login.setResponseCode(200);

		Login responseData = new Login();
		responseData.setId("#######");
		responseData.setId_role(1);
		responseData.setId_user_session(1);
		responseData.setName_user_session("XXXXXXX");
		
		login.setResponseData(responseData);
		login.setResponseMessage("XXXXXXX");*/
		
		if(login.getResponseCode().compareTo(200) == 0 && login.getResponseData() != null){
			// declara el objeto USER para guardarlos en session
			user.setId_user_session(login.getResponseData().getId_user_session());;
			user.setName_user_session(login.getResponseData().getName_user_session());
			user.setId(login.getResponseData().getId());
			user.setId_role(login.getResponseData().getId_role());
			user.setUsername(userform.getUsername());
			user.setPassword(userform.getPassword());
			
			logger.info("\n setId_role = " + user.getId_role());
			RoleByModuleFrom roleByModuleFrom = new RoleByModuleFrom();
			roleByModuleFrom.setId_user_session(user.getId_user_session());
			
			logger.info("\n roleByModuleFrom = " + roleByModuleFrom.toString());
			
			RolAndPermissionDTO roleByModuleDTO = loginService.getRoleAndPermissions(roleByModuleFrom);
			/*RolAndPermissionDTO roleByModuleDTO = new RolAndPermissionDTO();
			List<RoleAndPermissions> roleAndPermissions = new ArrayList<RoleAndPermissions>();
			RoleAndPermissions row = new RoleAndPermissions();
			List<Integer> permission = new ArrayList<Integer>();
			permission.add(1);
			permission.add(2);
			permission.add(3);
			permission.add(4);
			permission.add(5);
			row.setId_module(1L);
			row.setPermission(permission);
			roleAndPermissions.add(row);
			
			roleByModuleDTO.setResponseData(roleAndPermissions);*/
			user.setRole_by_module(roleByModuleDTO.getResponseData());		
			
			viewResult = "redirect:/panel";	
			
		}else{
			
			redirectAttributes.addFlashAttribute("error", "Usuario y/o password no valido");
			viewResult = "redirect:/";
			return viewResult;
		}
		
		model.addAttribute("user", user);

		return viewResult;
	}
	
	/**
	 * Termina la session del usuario
	 * @param model
	 * @param session
	 * @return String view
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model,  HttpSession session) {
		
		String retorno;
				
		session.invalidate();
		model.asMap().clear();
	    retorno = "redirect:/";
				
		return retorno;
		
	}
	
	@RequestMapping(value = "/sessiontimeout", method = RequestMethod.GET)
	public String sessiontimeout(@ModelAttribute UserForm userForm,  Model model) {
		
		return "sessiontimeout";
		
	}

}