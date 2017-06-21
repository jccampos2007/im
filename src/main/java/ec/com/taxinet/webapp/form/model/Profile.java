/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Juan Campos
 * @edit jccampos
 */
public class Profile {

	private List<ResponseDataRider> responseDataRider;
	private List<ResponseDataStaff> responseDataStaff;
	private List<ResponseDataDriver> responseDataDriver;

	public Profile() {
		// TODO Auto-generated constructor stub
	}	
	
	public List<ResponseDataRider> getResponseDataRider() {
		return responseDataRider;
	}

	public void setResponseDataRider(List<ResponseDataRider> responseDataRider) {
		this.responseDataRider = responseDataRider;
	}

	public List<ResponseDataStaff> getResponseDataStaff() {
		return responseDataStaff;
	}

	public void setResponseDataStaff(List<ResponseDataStaff> responseDataStaff) {
		this.responseDataStaff = responseDataStaff;
	}

	public List<ResponseDataDriver> getResponseDataDriver() {
		return responseDataDriver;
	}

	public void setResponseDataDriver(List<ResponseDataDriver> responseDataDriver) {
		this.responseDataDriver = responseDataDriver;
	}
	
	@Override
	public String toString() {
		return "Profile [responseDataRider=" + responseDataRider + ", responseDataStaff=" + responseDataStaff
				+ ", responseDataDriver=" + responseDataDriver + "]";
	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataRider{
		
		/*
		 * 
		 */
		
		private Long idRider;
		private String identification;
		private String names;
		private String lastNames;
		private String email;
		private String mobile;
		private String photoUrl;
		private Integer status;
		private Integer riderIdUser;
		private Long idCountry;
		private String countryName;
		private Long idFamilyRider;
		private Float limit;
		private String username;
		private Boolean mustVerify;
		private Long idCompany;
		private Boolean isCompanyUser;

		public ResponseDataRider() {
			// TODO Auto-generated constructor stub
		}

		public Long getIdRider() {
			return idRider;
		}

		public void setIdRider(Long idRider) {
			this.idRider = idRider;
		}

		public String getIdentification() {
			return identification;
		}

		public void setIdentification(String identification) {
			this.identification = identification;
		}

		public String getNames() {
			return names;
		}

		public void setNames(String names) {
			this.names = names;
		}

		public String getLastNames() {
			return lastNames;
		}

		public void setLastNames(String lastNames) {
			this.lastNames = lastNames;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getPhotoUrl() {
			return photoUrl;
		}

		public void setPhotoUrl(String photoUrl) {
			this.photoUrl = photoUrl;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getRiderIdUser() {
			return riderIdUser;
		}

		public void setRiderIdUser(Integer riderIdUser) {
			this.riderIdUser = riderIdUser;
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

		public Long getIdFamilyRider() {
			return idFamilyRider;
		}

		public void setIdFamilyRider(Long idFamilyRider) {
			this.idFamilyRider = idFamilyRider;
		}

		public Float getLimit() {
			return limit;
		}

		public void setLimit(Float limit) {
			this.limit = limit;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Boolean getMustVerify() {
			return mustVerify;
		}

		public void setMustVerify(Boolean mustVerify) {
			this.mustVerify = mustVerify;
		}

		public Long getIdCompany() {
			return idCompany;
		}

		public void setIdCompany(Long idCompany) {
			this.idCompany = idCompany;
		}

		public Boolean getIsCompanyUser() {
			return isCompanyUser;
		}

		public void setIsCompanyUser(Boolean isCompanyUser) {
			this.isCompanyUser = isCompanyUser;
		}

		@Override
		public String toString() {
			return "ResponseDataRider [idRider=" + idRider + ", identification=" + identification + ", names=" + names
					+ ", lastNames=" + lastNames + ", email=" + email + ", mobile=" + mobile + ", photoUrl=" + photoUrl
					+ ", status=" + status + ", riderIdUser=" + riderIdUser + ", idCountry=" + idCountry
					+ ", countryName=" + countryName + ", idFamilyRider=" + idFamilyRider + ", limit=" + limit
					+ ", username=" + username + ", mustVerify=" + mustVerify + ", idCompany=" + idCompany
					+ ", isCompanyUser=" + isCompanyUser + "]";
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataStaff{

		private Long idStaff;
		private String firstName;
		private String middleName;
		private String fathersLastName;
		private String birthdate;
		private String mobile;
		private String email;
		private Integer status;
		private Long idUser;
		private String username;
		private Long idRole;
		private String roleName;
		private String S_photoUrl;
		private List<StaffLocation> staffLocation;
		
		public ResponseDataStaff() {
			// TODO Auto-generated constructor stub
		}

		public Long getIdStaff() {
			return idStaff;
		}

		public void setIdStaff(Long idStaff) {
			this.idStaff = idStaff;
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

		public String getBirthdate() {
			return birthdate;
		}

		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getIdUser() {
			return idUser;
		}

		public void setIdUser(Long idUser) {
			this.idUser = idUser;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Long getIdRole() {
			return idRole;
		}

		public void setIdRole(Long idRole) {
			this.idRole = idRole;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getS_photoUrl() {
			return S_photoUrl;
		}

		public void setS_photoUrl(String s_photoUrl) {
			S_photoUrl = s_photoUrl;
		}

		public List<StaffLocation> getStaffLocation() {
			return staffLocation;
		}

		public void setStaffLocation(List<StaffLocation> staffLocation) {
			this.staffLocation = staffLocation;
		}

		@Override
		public String toString() {
			return "ResponseDataStaff [idStaff=" + idStaff + ", firstName=" + firstName + ", middleName=" + middleName
					+ ", fathersLastName=" + fathersLastName + ", birthdate=" + birthdate + ", mobile=" + mobile
					+ ", email=" + email + ", status=" + status + ", idUser=" + idUser + ", username=" + username
					+ ", idRole=" + idRole + ", roleName=" + roleName + ", S_photoUrl=" + S_photoUrl
					+ ", staffLocation=" + staffLocation + "]";
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataDriver{
		
		private Long dIdDriver;
		private String firstName;
		private String middleName;
		private String fathersLastName;
		private String motherLastName;
		private String birthdate;
		private Integer gender;
		private String photoUrl;
		private String mobile;
		private String phoneHome;
		private String phoneOffice;
		private String email;
		private String dDriverLicense;
		private String dExpirationDateLicense;
		private String dStatusDriver;
		private String dIsPanic;
		private Long idUser;
		private Long idHomeEstate;
		private String dhomeEstateName;
		private Long idHomeCity;
		private String homeCityName;
		private Long idWorkCity;
		private String workCityName;
		private String addressLine1;
		private String addressLine2;
		private Float rate;
		private Float amount;
		private String username;
		
		public ResponseDataDriver() {
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
		
		public String getdStatusDriver() {
			return dStatusDriver;
		}
		
		public void setdStatusDriver(String dStatusDriver) {
			this.dStatusDriver = dStatusDriver;
		}
		
		public String getdIsPanic() {
			return dIsPanic;
		}
		
		public void setdIsPanic(String dIsPanic) {
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
		
		@Override
		public String toString() {
			return "ResponseDataDriver [dIdDriver=" + dIdDriver + ", firstName=" + firstName + ", middleName="
					+ middleName + ", fathersLastName=" + fathersLastName + ", motherLastName=" + motherLastName
					+ ", birthdate=" + birthdate + ", gender=" + gender + ", photoUrl=" + photoUrl + ", mobile="
					+ mobile + ", phoneHome=" + phoneHome + ", phoneOffice=" + phoneOffice + ", email=" + email
					+ ", dDriverLicense=" + dDriverLicense + ", dExpirationDateLicense=" + dExpirationDateLicense
					+ ", dStatusDriver=" + dStatusDriver + ", dIsPanic=" + dIsPanic + ", idUser=" + idUser
					+ ", idHomeEstate=" + idHomeEstate + ", dhomeEstateName=" + dhomeEstateName + ", idHomeCity="
					+ idHomeCity + ", homeCityName=" + homeCityName + ", idWorkCity=" + idWorkCity + ", workCityName="
					+ workCityName + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", rate="
					+ rate + ", amount=" + amount + ", username=" + username + "]";
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataStaffCompany{

		private Long idCompany;
		private String name;
		private String localIdNumber;
		private String emailCompany;
		private Double fee;
		private Integer cutDay;
		private Long idCountry;
		private String countryName;
		private String statusCompany;
		private Long idStaff;
		private String firstName;
		private String middleName;
		private String fathersLastName;
		private String motherLastName;
		private Date birthdate;
		private String mobile;
		private Long email;
		private Boolean statusStaff;
		private Long idUser;
		private String username;
		private Long idRole;
		private Long roleName;
		
		public ResponseDataStaffCompany() {
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

		public String getEmailCompany() {
			return emailCompany;
		}

		public void setEmailCompany(String emailCompany) {
			this.emailCompany = emailCompany;
		}

		public Double getFee() {
			return fee;
		}

		public void setFee(Double fee) {
			this.fee = fee;
		}

		public Integer getCutDay() {
			return cutDay;
		}

		public void setCutDay(Integer cutDay) {
			this.cutDay = cutDay;
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

		public String getStatusCompany() {
			return statusCompany;
		}

		public void setStatusCompany(String statusCompany) {
			this.statusCompany = statusCompany;
		}

		public Long getIdStaff() {
			return idStaff;
		}

		public void setIdStaff(Long idStaff) {
			this.idStaff = idStaff;
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

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public Long getEmail() {
			return email;
		}

		public void setEmail(Long email) {
			this.email = email;
		}

		public Boolean getStatusStaff() {
			return statusStaff;
		}

		public void setStatusStaff(Boolean statusStaff) {
			this.statusStaff = statusStaff;
		}

		public Long getIdUser() {
			return idUser;
		}

		public void setIdUser(Long idUser) {
			this.idUser = idUser;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Long getIdRole() {
			return idRole;
		}

		public void setIdRole(Long idRole) {
			this.idRole = idRole;
		}

		public Long getRoleName() {
			return roleName;
		}

		public void setRoleName(Long roleName) {
			this.roleName = roleName;
		}

		@Override
		public String toString() {
			return "ResponseDataStaffCompany [idCompany=" + idCompany + ", name=" + name + ", localIdNumber="
					+ localIdNumber + ", emailCompany=" + emailCompany + ", fee=" + fee + ", cutDay=" + cutDay
					+ ", idCountry=" + idCountry + ", countryName=" + countryName + ", statusCompany=" + statusCompany
					+ ", idStaff=" + idStaff + ", firstName=" + firstName + ", middleName=" + middleName
					+ ", fathersLastName=" + fathersLastName + ", motherLastName=" + motherLastName + ", birthdate="
					+ birthdate + ", mobile=" + mobile + ", email=" + email + ", statusStaff=" + statusStaff
					+ ", idUser=" + idUser + ", username=" + username + ", idRole=" + idRole + ", roleName=" + roleName
					+ "]";
		}

	}

}
