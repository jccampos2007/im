/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class TaxiCorp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long taxiCorp;
	private String name;
	private String phone;
	private String email;
	private String addressLine1;
	private String addressLine2;
	private Integer status;
	private Integer resgistryCorporate;
	private String nameUserAdmin;
	private String emailUserAdmin;
	private String passwordUserdAdmin;
	private Long idCityCatalog;
	private Long idCountry;
	private String countryName;
	private Integer countryStatus;
	private Long idState;
	private String stateName;
	private Integer stateStatus;
	private Long idCity;
	private String cityName;
	private Long cityStatus;
	private String localIdNumber;

	/**
	 * 
	 */
	public TaxiCorp() {
		// TODO Auto-generated constructor stub
	}

	public Long getTaxiCorp() {
		return taxiCorp;
	}

	public void setTaxiCorp(Long taxiCorp) {
		this.taxiCorp = taxiCorp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Integer getResgistryCorporate() {
		return resgistryCorporate;
	}

	public void setResgistryCorporate(Integer resgistryCorporate) {
		this.resgistryCorporate = resgistryCorporate;
	}

	public String getNameUserAdmin() {
		return nameUserAdmin;
	}

	public void setNameUserAdmin(String nameUserAdmin) {
		this.nameUserAdmin = nameUserAdmin;
	}

	public String getEmailUserAdmin() {
		return emailUserAdmin;
	}

	public void setEmailUserAdmin(String emailUserAdmin) {
		this.emailUserAdmin = emailUserAdmin;
	}

	public String getPasswordUserdAdmin() {
		return passwordUserdAdmin;
	}

	public void setPasswordUserdAdmin(String passwordUserdAdmin) {
		this.passwordUserdAdmin = passwordUserdAdmin;
	}

	public Long getIdCityCatalog() {
		return idCityCatalog;
	}

	public void setIdCityCatalog(Long idCityCatalog) {
		this.idCityCatalog = idCityCatalog;
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

	public Long getCityStatus() {
		return cityStatus;
	}

	public void setCityStatus(Long cityStatus) {
		this.cityStatus = cityStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Corporate [taxiCorp=" + taxiCorp + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", status=" + status
				+ ", resgistryCorporate=" + resgistryCorporate + ", nameUserAdmin=" + nameUserAdmin
				+ ", emailUserAdmin=" + emailUserAdmin + ", passwordUserdAdmin=" + passwordUserdAdmin
				+ ", idCityCatalog=" + idCityCatalog + ", idCountry=" + idCountry + ", countryName=" + countryName
				+ ", countryStatus=" + countryStatus + ", idState=" + idState + ", stateName=" + stateName
				+ ", stateStatus=" + stateStatus + ", idCity=" + idCity + ", cityName=" + cityName + ", cityStatus="
				+ cityStatus + ", localIdNumber=" + localIdNumber + "]";
	}

	public String getLocalIdNumber() {
		return localIdNumber;
	}

	public void setLocalIdNumber(String localIdNumber) {
		this.localIdNumber = localIdNumber;
	}

}
