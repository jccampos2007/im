package ec.com.taxinet.webapp.form.model;

public class LogoutForm {
	
	private Long idUser;
	private String sessionToken;
	
	
	public LogoutForm() {
		// TODO Auto-generated constructor stub
	}

	
	public Long getIdUser() {
		return idUser;
	}
	
	
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	
	
	public String getSessionToken() {
		return sessionToken;
	}
	
	
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}
	
	

}
