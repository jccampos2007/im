/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class CooperativeForm {
	
	private String name;
	private String localIdNumber;
	private String phone;
	private String email;
	private String addressLine1;
	private String addressLine2;
	private Integer status;
	private String userAdminName;
	private String userAdminEmail;
	private String userAdminPassword;
	private Long IdTaxiCorp;
	private Integer action;
	private Long idCityCatalog;
	private String sessionToken;
	private Integer idUserSession;
	private Integer idCountryCatalog;
	private Integer statusOld;
	private Long idCountry;
	private String countryName;
	private Integer countryStatus;
	private Long idState;
	private String stateName;
	private Integer stateStatus;
	private Long idCity;
	private String cityName;

	
	/**
	 * 
	 */
	public CooperativeForm() {
		// TODO Auto-generated constructor stub
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public Long getIdTaxiCorp() {
		return IdTaxiCorp;
	}

	public void setIdTaxiCorp(Long idTaxiCorp) {
		IdTaxiCorp = idTaxiCorp;
	}

	public Integer getAction() {
		return action;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	public Long getIdCityCatalog() {
		return idCityCatalog;
	}

	public void setIdCityCatalog(Long idCityCatalog) {
		this.idCityCatalog = idCityCatalog;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public Integer getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(Integer idUserSession) {
		this.idUserSession = idUserSession;
	}

	public Integer getIdCountryCatalog() {
		return idCountryCatalog;
	}

	public void setIdCountryCatalog(Integer idCountryCatalog) {
		this.idCountryCatalog = idCountryCatalog;
	}

	@Override
	public String toString() {
		return "CooperativeForm [name=" + name + ", localIdNumber=" + localIdNumber + ", phone=" + phone + ", email="
				+ email + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", status=" + status
				+ ", userAdminName=" + userAdminName + ", userAdminEmail=" + userAdminEmail + ", userAdminPassword="
				+ userAdminPassword + ", IdTaxiCorp=" + IdTaxiCorp + ", action=" + action + ", idCityCatalog="
				+ idCityCatalog + ", sessionToken=" + sessionToken + ", idUserSession=" + idUserSession
				+ ", idCountryCatalog=" + idCountryCatalog + ", statusOld=" + statusOld + ", idCountry=" + idCountry
				+ ", countryName=" + countryName + ", countryStatus=" + countryStatus + ", idState=" + idState
				+ ", stateName=" + stateName + ", stateStatus=" + stateStatus + ", idCity=" + idCity + ", cityName="
				+ cityName + "]";
	}

	public Integer getStatusOld() {
		return statusOld;
	}

	public void setStatusOld(Integer statusOld) {
		this.statusOld = statusOld;
	}

	public Long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getCountryStatus() {
		return countryStatus;
	}

	public void setCountryStatus(Integer countryStatus) {
		this.countryStatus = countryStatus;
	}

	public Long getIdState() {
		return idState;
	}

	public void setIdState(Long idState) {
		this.idState = idState;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getStateStatus() {
		return stateStatus;
	}

	public void setStateStatus(Integer stateStatus) {
		this.stateStatus = stateStatus;
	}

	public Long getIdCity() {
		return idCity;
	}

	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
