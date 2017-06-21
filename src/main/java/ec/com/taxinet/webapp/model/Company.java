/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private Integer idCityCatalog;
	private String cityName;
	private String countryName;
	private String userAdminName;
	private String userAdminEmail;
	private String userAdminPassword;
	private Double fee;
	
	/**
	 * 
	 */
	public Company() {
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
	public Integer getIdCityCatalog() {
		return idCityCatalog;
	}
	public void setIdCityCatalog(Integer idCityCatalog) {
		this.idCityCatalog = idCityCatalog;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Company [idCompany=" + idCompany + ", name=" + name + ", localIdNumber=" + localIdNumber
				+ ", legalRepresentative=" + legalRepresentative + ", phone=" + phone + ", email=" + email
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", cutOffDay=" + cutOffDay
				+ ", idCountryCatalog=" + idCountryCatalog + ", status=" + status + ", idCityCatalog=" + idCityCatalog
				+ ", cityName=" + cityName + ", countryName=" + countryName + ", userAdminName=" + userAdminName
				+ ", userAdminEmail=" + userAdminEmail + ", userAdminPassword=" + userAdminPassword + ", fee=" + fee
				+ "]";
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
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}


}
