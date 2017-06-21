/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class DriverForm {
	
	  private Integer idDriver;
	  private String firstName;
	  private String middleName;
	  private String fathersLastName;
	  private String motherLastName;
	  //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	  private String birthdate;
	  private Integer gender;
	  private String photoUrl;
	  private String mobile;
	  private String phoneHome;
	  private String phoneOffice;
	  private String email;
	  private String driverLicense;
	  //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	  private String expirationDateLicense;
	  private Boolean status;
	  private Integer statusDriver;
	  private Boolean isPanic;
	  private Integer idUser;
	  private Integer idHomeCityCatalog;
	  private Integer idWorkCityCatalog;
	  private String addressLine1;
	  private String addressLine2;
	  private Float rate;
	  private Float amount;
	  
	  private String username;
	  private String password;
	  private String repeatPassword;
	  
	  private String deviceImei;
	  private Long idUserSession;
	  private String sessionToken;
	  private Long idDevice;
	  private Long deviceMark;
	  private Long deviceModel;
	  private String deviceSerial;
	  private String devicePhone;
	  

	/** 
	 * 
	 */
	public DriverForm() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdDriver() {
		return idDriver;
	}


	public void setIdDriver(Integer idDriver) {
		this.idDriver = idDriver;
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


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public Integer getGender() {
		return gender;
	}


	public void setGender(Integer gender) {
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


	public String getDriverLicense() {
		return driverLicense;
	}


	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}


	public String getExpirationDateLicense() {
		return expirationDateLicense;
	}


	public void setExpirationDateLicense(String expirationDateLicense) {
		this.expirationDateLicense = expirationDateLicense;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public Integer getStatusDriver() {
		return statusDriver;
	}


	public void setStatusDriver(Integer statusDriver) {
		this.statusDriver = statusDriver;
	}


	public Boolean getIsPanic() {
		return isPanic;
	}


	public void setIsPanic(Boolean isPanic) {
		this.isPanic = isPanic;
	}


	public Integer getIdUser() {
		return idUser;
	}


	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}


	public Integer getIdHomeCityCatalog() {
		return idHomeCityCatalog;
	}


	public void setIdHomeCityCatalog(Integer idHomeCityCatalog) {
		this.idHomeCityCatalog = idHomeCityCatalog;
	}


	public Integer getIdWorkCityCatalog() {
		return idWorkCityCatalog;
	}


	public void setIdWorkCityCatalog(Integer idWorkCityCatalog) {
		this.idWorkCityCatalog = idWorkCityCatalog;
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


	public Float getRate() {
		return rate;
	}


	public void setRate(Float rate) {
		this.rate = rate;
	}


	public Float getAmount() {
		return amount;
	}


	public void setAmount(Float amount) {
		this.amount = amount;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRepeatPassword() {
		return repeatPassword;
	}


	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}


	public String getDeviceImei() {
		return deviceImei;
	}


	public void setDeviceImei(String deviceImei) {
		this.deviceImei = deviceImei;
	}


	@Override
	public String toString() {
		return "DriverForm [idDriver=" + idDriver + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", fathersLastName=" + fathersLastName + ", motherLastName=" + motherLastName + ", birthdate="
				+ birthdate + ", gender=" + gender + ", photoUrl=" + photoUrl + ", mobile=" + mobile + ", phoneHome="
				+ phoneHome + ", phoneOffice=" + phoneOffice + ", email=" + email + ", driverLicense=" + driverLicense
				+ ", expirationDateLicense=" + expirationDateLicense + ", status=" + status + ", statusDriver="
				+ statusDriver + ", isPanic=" + isPanic + ", idUser=" + idUser + ", idHomeCityCatalog="
				+ idHomeCityCatalog + ", idWorkCityCatalog=" + idWorkCityCatalog + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", rate=" + rate + ", amount=" + amount + ", username=" + username
				+ ", password=" + password + ", repeatPassword=" + repeatPassword + ", deviceImei=" + deviceImei
				+ ", idUserSession=" + idUserSession + ", sessionToken=" + sessionToken + ", idDevice=" + idDevice
				+ ", deviceMark=" + deviceMark + ", deviceModel=" + deviceModel + ", deviceSerial=" + deviceSerial
				+ ", devicePhone=" + devicePhone + "]";
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


	public Long getIdDevice() {
		return idDevice;
	}


	public void setIdDevice(Long idDevice) {
		this.idDevice = idDevice;
	}


	public Long getDeviceMark() {
		return deviceMark;
	}


	public void setDeviceMark(Long deviceMark) {
		this.deviceMark = deviceMark;
	}


	public Long getDeviceModel() {
		return deviceModel;
	}


	public void setDeviceModel(Long deviceModel) {
		this.deviceModel = deviceModel;
	}


	public String getDeviceSerial() {
		return deviceSerial;
	}


	public void setDeviceSerial(String deviceSerial) {
		this.deviceSerial = deviceSerial;
	}


	public String getDevicePhone() {
		return devicePhone;
	}


	public void setDevicePhone(String devicePhone) {
		this.devicePhone = devicePhone;
	}

}
