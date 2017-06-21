package ec.com.taxinet.webapp.form.model;

public class UserCompanyForm {
	
	private Long idUserCompany;
	private Long idCompany;
	private Long idUser;
	private Float limit;
	private Long idDepartment;
	private Long idCity;
	private Integer statusUserCompany;
    private Long idUserSession;
    private String tokenSession;
	

	public UserCompanyForm() {
		// TODO Auto-generated constructor stub
	}


	public Long getIdUserCompany() {
		return idUserCompany;
	}


	public void setIdUserCompany(Long idUserCompany) {
		this.idUserCompany = idUserCompany;
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


	public Float getLimit() {
		return limit;
	}


	public void setLimit(Float limit) {
		this.limit = limit;
	}


	public Long getIdDepartment() {
		return idDepartment;
	}


	public void setIdDepartment(Long idDepartment) {
		this.idDepartment = idDepartment;
	}


	public Long getIdCity() {
		return idCity;
	}


	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}


	public Integer getStatusUserCompany() {
		return statusUserCompany;
	}


	public void setStatusUserCompany(Integer statusUserCompany) {
		this.statusUserCompany = statusUserCompany;
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


}
