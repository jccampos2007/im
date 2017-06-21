package ec.com.taxinet.webapp.form.model;

public class UserTaxicorpForm {
	
	private Long idTaxiCorp;
	private Long idUser;
	private Integer statusUsertaxiCorp;
	private Long idUserSession;
	private String tokenSession;
	
	public UserTaxicorpForm(){
		
	}

	public Long getIdTaxiCorp() {
		return idTaxiCorp;
	}

	public void setIdTaxiCorp(Long idTaxiCorp) {
		this.idTaxiCorp = idTaxiCorp;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Integer getStatusUsertaxiCorp() {
		return statusUsertaxiCorp;
	}

	public void setStatusUsertaxiCorp(Integer statusUsertaxiCorp) {
		this.statusUsertaxiCorp = statusUsertaxiCorp;
	}

	public Long getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(Long idUserSession) {
		this.idUserSession = idUserSession;
	}

	public String getTokenSession() {
		return tokenSession;
	}

	public void setTokenSession(String tokenSession) {
		this.tokenSession = tokenSession;
	}

	@Override
	public String toString() {
		return "UserTaxicorpForm [idTaxiCorp=" + idTaxiCorp + ", idUser=" + idUser + ", statusUsertaxiCorp="
				+ statusUsertaxiCorp + ", idUserSession=" + idUserSession + ", tokenSession=" + tokenSession + "]";
	}

}
