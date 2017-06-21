package ec.com.taxinet.webapp.form.model;

public class AddUserCompanyForm {
	
	private Long idCity;
	private Long idCompany;
	private Long idDepartment;
	private Long idUser;
	private Long idUserSession;
	private Double limit;
	private Boolean statusUserCompany;
	private String tokenSession;
	
	public AddUserCompanyForm(){
		
	}

	public Long getIdCity() {
		return idCity;
	}

	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}

	public Long getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Long idCompany) {
		this.idCompany = idCompany;
	}

	public Long getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Long idDepartment) {
		this.idDepartment = idDepartment;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(Long idUserSession) {
		this.idUserSession = idUserSession;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public Boolean getStatusUserCompany() {
		return statusUserCompany;
	}

	public void setStatusUserCompany(Boolean statusUserCompany) {
		this.statusUserCompany = statusUserCompany;
	}

	public String getTokenSession() {
		return tokenSession;
	}

	public void setTokenSession(String tokenSession) {
		this.tokenSession = tokenSession;
	}

	@Override
	public String toString() {
		return "AddUserCompany [idCity=" + idCity + ", idCompany=" + idCompany + ", idDepartment=" + idDepartment
				+ ", idUser=" + idUser + ", idUserSession=" + idUserSession + ", limit=" + limit
				+ ", statusUserCompany=" + statusUserCompany + ", tokenSession=" + tokenSession + "]";
	}
}
