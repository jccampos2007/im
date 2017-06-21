/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class CompanyUserAdminForm {
	
	private Long idCompany;
	private Long idUser;
	private Long idStaff;
	private Boolean idStatusUser;
	private Long idUserSession;
	private String sessionToken;

	/**
	 * 
	 */
	public CompanyUserAdminForm() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Long idCompany) {
		this.idCompany = idCompany;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdStaff() {
		return idStaff;
	}

	public void setIdStaff(Long idStaff) {
		this.idStaff = idStaff;
	}

	public Boolean getIdStatusUser() {
		return idStatusUser;
	}

	public void setIdStatusUser(Boolean idStatusUser) {
		this.idStatusUser = idStatusUser;
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
		return "CompanyUserAdminForm [idCompany=" + idCompany + ", idUser=" + idUser + ", idStaff=" + idStaff
				+ ", idStatusUser=" + idStatusUser + ", idUserSession=" + idUserSession + ", sessionToken="
				+ sessionToken + "]";
	}

}
