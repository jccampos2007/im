/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class VerifyUsernameForm {
	
	private String username;
	private Long idUserSession;
	private String sessionToken; 

	/**
	 * 
	 */
	public VerifyUsernameForm() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(Long idUserSession) {
		this.idUserSession = idUserSession;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	@Override
	public String toString() {
		return "VerifyUsernameForm [username=" + username + ", idUserSession=" + idUserSession + ", sessionToken="
				+ sessionToken + "]";
	}

}
