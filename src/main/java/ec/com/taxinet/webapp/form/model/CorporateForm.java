/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class CorporateForm {
    
	private Long idCompany;
	private String name;
	private String localIdNumber;
	private String legalRepresentative;
	private String phone;
	private String email;
	private String addressLine1;
	private String addressLine2;
	private Integer cutOffDay;
	private Integer idCountryCatalog;
	private Integer status;
	private Integer action;
	private String sessionToken;
	private Integer idCityCatalog;
	private Integer idUserSession;
	private String userAdminName;
	private String userAdminEmail;
	private String userAdminPassword;
	private Double fee;
	
	/**
	 * 
	 */
	public CorporateForm() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Long idCompany) {
		this.idCompany = idCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalIdNumber() {
		return localIdNumber;
	}

	public void setLocalIdNumber(String localIdNumber) {
		this.localIdNumber = localIdNumber;
	}

	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Integer getCutOffDay() {
		return cutOffDay;
	}

	public void setCutOffDay(Integer cutOffDay) {
		this.cutOffDay = cutOffDay;
	}

	public Integer getIdCountryCatalog() {
		return idCountryCatalog;
	}

	public void setIdCountryCatalog(Integer idCountryCatalog) {
		this.idCountryCatalog = idCountryCatalog;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAction() {
		return action;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public Integer getIdCityCatalog() {
		return idCityCatalog;
	}

	public void setIdCityCatalog(Integer idCityCatalog) {
		this.idCityCatalog = idCityCatalog;
	}

	public Integer getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(Integer idUserSession) {
		this.idUserSession = idUserSession;
	}

	public String getUserAdminName() {
		return userAdminName;
	}

	public void setUserAdminName(String userAdminName) {
		this.userAdminName = userAdminName;
	}

	public String getUserAdminEmail() {
		return userAdminEmail;
	}

	public void setUserAdminEmail(String userAdminEmail) {
		this.userAdminEmail = userAdminEmail;
	}

	public String getUserAdminPassword() {
		return userAdminPassword;
	}

	public void setUserAdminPassword(String userAdminPassword) {
		this.userAdminPassword = userAdminPassword;
	}

	@Override
	public String toString() {
		return "CorporateForm [idCompany=" + idCompany + ", name=" + name + ", localIdNumber=" + localIdNumber
				+ ", legalRepresentative=" + legalRepresentative + ", phone=" + phone + ", email=" + email
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", cutOffDay=" + cutOffDay
				+ ", idCountryCatalog=" + idCountryCatalog + ", status=" + status + ", action=" + action
				+ ", sessionToken=" + sessionToken + ", idCityCatalog=" + idCityCatalog + ", idUserSession="
				+ idUserSession + ", userAdminName=" + userAdminName + ", userAdminEmail=" + userAdminEmail
				+ ", userAdminPassword=" + userAdminPassword + ", fee=" + fee + "]";
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

}
