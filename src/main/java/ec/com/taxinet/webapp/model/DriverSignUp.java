package ec.com.taxinet.webapp.model;

import java.sql.Date;

public class DriverSignUp {
	
	private String username;
    String password;
    private int idUserSession;
    String sessionToken;    
    private String firstName;
    private String middleName;
    private String fathersLastName;
    private String motherLastName;
    private Date birthdate;
    private int gender;
    private String photoUrl;
    private String mobile;
    private String phoneHome;
    private String phoneOffice;
    private String email;
    private String driverLicense;
    private Date expirationDataLicense;
    private int statusDriver;
    private int idHomeCityCatalog;
    private int idWorkCityCatalog;
    private String addressLine1;
    private String addressLine2;
    private Long idDriver;
    
	public DriverSignUp() {
		// TODO Auto-generated constructor stub
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

	public int getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(int idUserSession) {
		this.idUserSession = idUserSession;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
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

	public Date getExpirationDataLicense() {
		return expirationDataLicense;
	}

	public void setExpirationDataLicense(Date expirationDataLicense) {
		this.expirationDataLicense = expirationDataLicense;
	}

	public int getStatusDriver() {
		return statusDriver;
	}

	public void setStatusDriver(int statusDriver) {
		this.statusDriver = statusDriver;
	}

	public int getIdHomeCityCatalog() {
		return idHomeCityCatalog;
	}

	public void setIdHomeCityCatalog(int idHomeCityCatalog) {
		this.idHomeCityCatalog = idHomeCityCatalog;
	}

	public int getIdWorkCityCatalog() {
		return idWorkCityCatalog;
	}

	public void setIdWorkCityCatalog(int idWorkCityCatalog) {
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

	@Override
	public String toString() {
		return "DriverSignUp [username=" + username + ", password=" + password + ", idUserSession=" + idUserSession
				+ ", sessionToken=" + sessionToken + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", fathersLastName=" + fathersLastName + ", motherLastName=" + motherLastName + ", birthdate="
				+ birthdate + ", gender=" + gender + ", photoUrl=" + photoUrl + ", mobile=" + mobile + ", phoneHome="
				+ phoneHome + ", phoneOffice=" + phoneOffice + ", email=" + email + ", driverLicense=" + driverLicense
				+ ", expirationDataLicense=" + expirationDataLicense + ", statusDriver=" + statusDriver
				+ ", idHomeCityCatalog=" + idHomeCityCatalog + ", idWorkCityCatalog=" + idWorkCityCatalog
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", idDriver=" + idDriver + "]";
	}

	public Long getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(Long idDriver) {
		this.idDriver = idDriver;
	}

}
