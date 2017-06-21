package ec.com.taxinet.webapp.services.logout;

import ec.com.taxinet.webapp.dto.LogoutDTO;
import ec.com.taxinet.webapp.form.model.LogoutForm;

public interface ILogout {
	public LogoutDTO logout(LogoutForm logoutForm);

}
