/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Juan Campos
 *
 */
public class Driver  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long dIdDriver;
	private String firstName;
	private String middleName;
	private String fathersLastName;
	private String motherLastName;
	private Date birthdate;
	private Boolean gender;
	private String photoUrl;
	private String mobile;
	private String phoneHome;
	private String phoneOffice;
	private String email;
	private String dDriverLicense;
	private String dExpirationDateLicense;
	private Integer dStatus;
	private Integer dStatusDriver;
	private Boolean dIsPanic;
	private Long idUser;
	private Long idHomeEstate;
	private String dhomeEstateName;
	private Long idHomeCity;
	private String homeCityName;
	private Long idWorkCity;
	private String workCityName;
	private String addressLine1;
	private String addressLine2;
	private Double rate;
	private Double amount;
	private String username;
	private String expirationDate;
	private Long idHomeContry;
	private String homeContryName;
	private Long idWorkEstate;
	private String workEstateName;
	private Long idWorkContry;
	private String workContryName;



	/**
	 * 
	 */
	public Driver() {
		// TODO Auto-generated constructor stub
	}



	public Long getdIdDriver() {
		return dIdDriver;
	}



	public void setdIdDriver(Long dIdDriver) {
		this.dIdDriver = dIdDriver;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getFathersLastName() {
		return fathersLastName;
	}



	public void setFathersLastName(String fathersLastName) {
		this.fathersLastName = fathersLastName;
	}



	public String getMotherLastName() {
		return motherLastName;
	}



	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}



	public Date getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}



	public Boolean getGender() {
		return gender;
	}



	public void setGender(Boolean gender) {
		this.gender = gender;
	}



	public String getPhotoUrl() {
		return photoUrl;
	}



	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getPhoneHome() {
		return phoneHome;
	}



	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}



	public String getPhoneOffice() {
		return phoneOffice;
	}



	public void setPhoneOffice(String phoneOffice) {
		this.phoneOffice = phoneOffice;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getdDriverLicense() {
		return dDriverLicense;
	}



	public void setdDriverLicense(String dDriverLicense) {
		this.dDriverLicense = dDriverLicense;
	}



	public String getdExpirationDateLicense() {
		return dExpirationDateLicense;
	}



	public void setdExpirationDateLicense(String dExpirationDateLicense) {
		this.dExpirationDateLicense = dExpirationDateLicense;
	}



	public Integer getdStatus() {
		return dStatus;
	}



	public void setdStatus(Integer dStatus) {
		this.dStatus = dStatus;
	}



	public Integer getdStatusDriver() {
		return dStatusDriver;
	}



	public void setdStatusDriver(Integer dStatusDriver) {
		this.dStatusDriver = dStatusDriver;
	}



	public Boolean getdIsPanic() {
		return dIsPanic;
	}



	public void setdIsPanic(Boolean dIsPanic) {
		this.dIsPanic = dIsPanic;
	}



	public Long getIdUser() {
		return idUser;
	}



	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}



	public Long getIdHomeEstate() {
		return idHomeEstate;
	}



	public void setIdHomeEstate(Long idHomeEstate) {
		this.idHomeEstate = idHomeEstate;
	}



	public String getDhomeEstateName() {
		return dhomeEstateName;
	}



	public void setDhomeEstateName(String dhomeEstateName) {
		this.dhomeEstateName = dhomeEstateName;
	}



	public Long getIdHomeCity() {
		return idHomeCity;
	}



	public void setIdHomeCity(Long idHomeCity) {
		this.idHomeCity = idHomeCity;
	}



	public String getHomeCityName() {
		return homeCityName;
	}



	public void setHomeCityName(String homeCityName) {
		this.homeCityName = homeCityName;
	}



	public Long getIdWorkCity() {
		return idWorkCity;
	}



	public void setIdWorkCity(Long idWorkCity) {
		this.idWorkCity = idWorkCity;
	}



	public String getWorkCityName() {
		return workCityName;
	}



	public void setWorkCityName(String workCityName) {
		this.workCityName = workCityName;
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



	public Double getRate() {
		return rate;
	}



	public void setRate(Double rate) {
		this.rate = rate;
	}



	public Double getAmount() {
		return amount;
	}



	public void setAmount(Double amount) {
		this.amount = amount;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getExpirationDate() {
		return expirationDate;
	}



	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}



	public Long getIdHomeContry() {
		return idHomeContry;
	}



	public void setIdHomeContry(Long idHomeContry) {
		this.idHomeContry = idHomeContry;
	}



	public String getHomeContryName() {
		return homeContryName;
	}



	public void setHomeContryName(String homeContryName) {
		this.homeContryName = homeContryName;
	}



	public Long getIdWorkEstate() {
		return idWorkEstate;
	}



	public void setIdWorkEstate(Long idWorkEstate) {
		this.idWorkEstate = idWorkEstate;
	}



	public String getWorkEstateName() {
		return workEstateName;
	}



	public void setWorkEstateName(String workEstateName) {
		this.workEstateName = workEstateName;
	}



	public Long getIdWorkContry() {
		return idWorkContry;
	}



	public void setIdWorkContry(Long idWorkContry) {
		this.idWorkContry = idWorkContry;
	}



	public String getWorkContryName() {
		return workContryName;
	}



	public void setWorkContryName(String workContryName) {
		this.workContryName = workContryName;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Driver [dIdDriver=" + dIdDriver + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", fathersLastName=" + fathersLastName + ", motherLastName=" + motherLastName + ", birthdate="
				+ birthdate + ", gender=" + gender + ", photoUrl=" + photoUrl + ", mobile=" + mobile + ", phoneHome="
				+ phoneHome + ", phoneOffice=" + phoneOffice + ", email=" + email + ", dDriverLicense=" + dDriverLicense
				+ ", dExpirationDateLicense=" + dExpirationDateLicense + ", dStatus=" + dStatus + ", dStatusDriver="
				+ dStatusDriver + ", dIsPanic=" + dIsPanic + ", idUser=" + idUser + ", idHomeEstate=" + idHomeEstate
				+ ", dhomeEstateName=" + dhomeEstateName + ", idHomeCity=" + idHomeCity + ", homeCityName="
				+ homeCityName + ", idWorkCity=" + idWorkCity + ", workCityName=" + workCityName + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", rate=" + rate + ", amount=" + amount
				+ ", username=" + username + ", expirationDate=" + expirationDate + ", idHomeContry=" + idHomeContry
				+ ", homeContryName=" + homeContryName + ", idWorkEstate=" + idWorkEstate + ", workEstateName="
				+ workEstateName + ", idWorkContry=" + idWorkContry + ", workContryName=" + workContryName + "]";
	}



}
