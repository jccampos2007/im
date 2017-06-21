package ec.com.taxinet.webapp.services.login;

import ec.com.taxinet.webapp.dto.LoginDTO;
import ec.com.taxinet.webapp.dto.RolAndPermissionDTO;
import ec.com.taxinet.webapp.dto.userSessionDTO;
import ec.com.taxinet.webapp.form.model.UserForm;
import ec.com.taxinet.webapp.form.model.UserForm.RoleByModuleFrom;

public interface ILogin {
	
	public LoginDTO login(UserForm userform);
	
	public RolAndPermissionDTO getRoleAndPermissions(RoleByModuleFrom roleByModuleFrom);
	
	public userSessionDTO getResponsibleOfficial(String p_name_role);
	
}