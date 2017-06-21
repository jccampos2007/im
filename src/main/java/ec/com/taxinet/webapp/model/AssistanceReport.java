package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AssistanceReport   implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<PanicTotal> panicTotals;
	private List<PanicDetail> panicDrivers;
	
	public AssistanceReport(){
		
	}
	
	
	
	public List<PanicTotal> getPanicTotals() {
		return panicTotals;
	}

	public void setPanicTotals(List<PanicTotal> panicTotals) {
		this.panicTotals = panicTotals;
	}

	public List<PanicDetail> getPanicDrivers() {
		return panicDrivers;
	}

	public void setPanicDrivers(List<PanicDetail> panicDrivers) {
		this.panicDrivers = panicDrivers;
	}



	@Override
	public String toString() {
		return "AssistanceReport [panicTotals=" + panicTotals + ", panicDrivers=" + panicDrivers + "]";
	}



	@JsonInclude(Include.NON_NULL)
	public static class PanicTotal{
		
		public PanicTotal(){
			
		}
		

		private Long idCountry;
		private String countryName;
		private Long total;
		private Long totalRider;
		private Long totalDriver;
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
		public Long getTotal() {
			return total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
		public Long getTotalRider() {
			return totalRider;
		}
		public void setTotalRider(Long totalRider) {
			this.totalRider = totalRider;
		}
		public Long getTotalDriver() {
			return totalDriver;
		}
		public void setTotalDriver(Long totalDriver) {
			this.totalDriver = totalDriver;
		}
		@Override
		public String toString() {
			return "PanicTotal [idCountry=" + idCountry + ", countryName=" + countryName + ", total=" + total
					+ ", totalRider=" + totalRider + ", totalDriver=" + totalDriver + "]";
		}
		
		
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class PanicDetail{
		
		
		public PanicDetail(){
			
		}
		
		
		private Integer isRider;
		private Long idServiceRecord;
		private String d_HomeCityName;
		private String p_CityName;
		private Long p_idCity;
		private Long d_idHomeEstate;
		private Long d_idHomeCity;
		private String d_HomeEstateName;
		private Long r_idRider;
		private Long r_identification;
		private String r_username;
		private String r_names;
		private String r_lastNames;
		private String r_email;
		private String r_mobile;
		private String r_photoUrl;
		private Integer r_status;
		private Long r_idUser;
		private Long r_idCountry;
		private String r_CountryName;
		private Long d_idDriver;
		private String d_firstName;
		private String d_fathersLastName;
		private String d_username;
		private String d_photoUrl;
		private String d_mobile;
		private String d_driverLicense;
		private Long d_idUser;
		private Long p_idPanic;
		private String p_dateCasePanic2;
		private Long p_idRider;
		private String p_dateCasePanic;
		private String st_photoUrl;
		private Long p_idStaff;
		private String st_fathersLastName;
		private String p_createdDate;
		private String p_CasePanicName;
		private Long st_idUser;
		private Float p_latitude;
		private Float p_longitude;
		private String p_address;
		private String st_firstName;
		private Long st_idStaff;
		private String p_CountryName;
		private Long p_idCountry;
		private Long p_idServiceRecord;
		private List<PanicTotal> panicTotals;
		private String d_taxiPlate;
		
		private String requestedUserNames;
		private String riderNames;
		private String driverNames;
		
		private Timestamp createdTS;
		
		
		public Integer getIsRider() {
			return isRider;
		}
		public void setIsRider(Integer isRider) {
			this.isRider = isRider;
		}
		public Long getIdServiceRecord() {
			return idServiceRecord;
		}
		public void setIdServiceRecord(Long idServiceRecord) {
			this.idServiceRecord = idServiceRecord;
		}
		public String getD_HomeCityName() {
			return d_HomeCityName;
		}
		public void setD_HomeCityName(String d_HomeCityName) {
			this.d_HomeCityName = d_HomeCityName;
		}
		public String getP_CityName() {
			return p_CityName;
		}
		public void setP_CityName(String p_CityName) {
			this.p_CityName = p_CityName;
		}
		public Long getP_idCity() {
			return p_idCity;
		}
		public void setP_idCity(Long p_idCity) {
			this.p_idCity = p_idCity;
		}
		public Long getD_idHomeEstate() {
			return d_idHomeEstate;
		}
		public void setD_idHomeEstate(Long d_idHomeEstate) {
			this.d_idHomeEstate = d_idHomeEstate;
		}
		public Long getD_idHomeCity() {
			return d_idHomeCity;
		}
		public void setD_idHomeCity(Long d_idHomeCity) {
			this.d_idHomeCity = d_idHomeCity;
		}
		public String getD_HomeEstateName() {
			return d_HomeEstateName;
		}
		public void setD_HomeEstateName(String d_HomeEstateName) {
			this.d_HomeEstateName = d_HomeEstateName;
		}
		public Long getR_idRider() {
			return r_idRider;
		}
		public void setR_idRider(Long r_idRider) {
			this.r_idRider = r_idRider;
		}
		public Long getR_identification() {
			return r_identification;
		}
		public void setR_identification(Long r_identification) {
			this.r_identification = r_identification;
		}
		public String getR_username() {
			return r_username;
		}
		public void setR_username(String r_username) {
			this.r_username = r_username;
		}
		public String getR_names() {
			return r_names;
		}
		public void setR_names(String r_names) {
			this.r_names = r_names;
		}
		public String getR_lastNames() {
			return r_lastNames;
		}
		public void setR_lastNames(String r_lastNames) {
			this.r_lastNames = r_lastNames;
		}
		public String getR_email() {
			return r_email;
		}
		public void setR_email(String r_email) {
			this.r_email = r_email;
		}
		public String getR_mobile() {
			return r_mobile;
		}
		public void setR_mobile(String r_mobile) {
			this.r_mobile = r_mobile;
		}
		public String getR_photoUrl() {
			return r_photoUrl;
		}
		public void setR_photoUrl(String r_photoUrl) {
			this.r_photoUrl = r_photoUrl;
		}
		public Integer getR_status() {
			return r_status;
		}
		public void setR_status(Integer r_status) {
			this.r_status = r_status;
		}
		public Long getR_idUser() {
			return r_idUser;
		}
		public void setR_idUser(Long r_idUser) {
			this.r_idUser = r_idUser;
		}
		public Long getR_idCountry() {
			return r_idCountry;
		}
		public void setR_idCountry(Long r_idCountry) {
			this.r_idCountry = r_idCountry;
		}
		public String getR_CountryName() {
			return r_CountryName;
		}
		public void setR_CountryName(String r_CountryName) {
			this.r_CountryName = r_CountryName;
		}
		public Long getD_idDriver() {
			return d_idDriver;
		}
		public void setD_idDriver(Long d_idDriver) {
			this.d_idDriver = d_idDriver;
		}
		public String getD_firstName() {
			return d_firstName;
		}
		public void setD_firstName(String d_firstName) {
			this.d_firstName = d_firstName;
		}
		public String getD_fathersLastName() {
			return d_fathersLastName;
		}
		public void setD_fathersLastName(String d_fathersLastName) {
			this.d_fathersLastName = d_fathersLastName;
		}
		public String getD_username() {
			return d_username;
		}
		public void setD_username(String d_username) {
			this.d_username = d_username;
		}
		public String getD_photoUrl() {
			return d_photoUrl;
		}
		public void setD_photoUrl(String d_photoUrl) {
			this.d_photoUrl = d_photoUrl;
		}
		public String getD_mobile() {
			return d_mobile;
		}
		public void setD_mobile(String d_mobile) {
			this.d_mobile = d_mobile;
		}
		public String getD_driverLicense() {
			return d_driverLicense;
		}
		public void setD_driverLicense(String d_driverLicense) {
			this.d_driverLicense = d_driverLicense;
		}
		public Long getD_idUser() {
			return d_idUser;
		}
		public void setD_idUser(Long d_idUser) {
			this.d_idUser = d_idUser;
		}
		public Long getP_idPanic() {
			return p_idPanic;
		}
		public void setP_idPanic(Long p_idPanic) {
			this.p_idPanic = p_idPanic;
		}
		public String getP_dateCasePanic2() {
			return p_dateCasePanic2;
		}
		public void setP_dateCasePanic2(String p_dateCasePanic2) {
			this.p_dateCasePanic2 = p_dateCasePanic2;
		}
		public Long getP_idRider() {
			return p_idRider;
		}
		public void setP_idRider(Long p_idRider) {
			this.p_idRider = p_idRider;
		}
		public String getP_dateCasePanic() {
			return p_dateCasePanic;
		}
		public void setP_dateCasePanic(String p_dateCasePanic) {
			this.p_dateCasePanic = p_dateCasePanic;
		}
		public String getSt_photoUrl() {
			return st_photoUrl;
		}
		public void setSt_photoUrl(String st_photoUrl) {
			this.st_photoUrl = st_photoUrl;
		}
		public Long getP_idStaff() {
			return p_idStaff;
		}
		public void setP_idStaff(Long p_idStaff) {
			this.p_idStaff = p_idStaff;
		}
		public String getSt_fathersLastName() {
			return st_fathersLastName;
		}
		public void setSt_fathersLastName(String st_fathersLastName) {
			this.st_fathersLastName = st_fathersLastName;
		}
		public String getP_createdDate() {
			return p_createdDate;
		}
		public void setP_createdDate(String p_createdDate) {
			this.p_createdDate = p_createdDate;
		}
		public String getP_CasePanicName() {
			return p_CasePanicName;
		}
		public void setP_CasePanicName(String p_CasePanicName) {
			this.p_CasePanicName = p_CasePanicName;
		}
		public Long getSt_idUser() {
			return st_idUser;
		}
		public void setSt_idUser(Long st_idUser) {
			this.st_idUser = st_idUser;
		}
		public Float getP_latitude() {
			return p_latitude;
		}
		public void setP_latitude(Float p_latitude) {
			this.p_latitude = p_latitude;
		}
		public Float getP_longitude() {
			return p_longitude;
		}
		public void setP_longitude(Float p_longitude) {
			this.p_longitude = p_longitude;
		}
		public String getP_address() {
			return p_address;
		}
		public void setP_address(String p_address) {
			this.p_address = p_address;
		}
		public String getSt_firstName() {
			return st_firstName;
		}
		public void setSt_firstName(String st_firstName) {
			this.st_firstName = st_firstName;
		}
		public Long getSt_idStaff() {
			return st_idStaff;
		}
		public void setSt_idStaff(Long st_idStaff) {
			this.st_idStaff = st_idStaff;
		}
		public String getP_CountryName() {
			return p_CountryName;
		}
		public void setP_CountryName(String p_CountryName) {
			this.p_CountryName = p_CountryName;
		}
		public Long getP_idCountry() {
			return p_idCountry;
		}
		public void setP_idCountry(Long p_idCountry) {
			this.p_idCountry = p_idCountry;
		}
		public Long getP_idServiceRecord() {
			return p_idServiceRecord;
		}
		public void setP_idServiceRecord(Long p_idServiceRecord) {
			this.p_idServiceRecord = p_idServiceRecord;
		}
		public List<PanicTotal> getPanicTotals() {
			return panicTotals;
		}
		public void setPanicTotals(List<PanicTotal> panicTotals) {
			this.panicTotals = panicTotals;
		}
		public String getD_taxiPlate() {
			return d_taxiPlate;
		}
		public void setD_taxiPlate(String d_taxiPlate) {
			this.d_taxiPlate = d_taxiPlate;
		}
		public String getRequestedUserNames() {
			return requestedUserNames;
		}
		public void setRequestedUserNames(String requestedUserNames) {
			this.requestedUserNames = requestedUserNames;
		}
		public String getRiderNames() {
			return riderNames;
		}
		public void setRiderNames(String riderNames) {
			this.riderNames = riderNames;
		}
		public String getDriverNames() {
			return driverNames;
		}
		public void setDriverNames(String driverNames) {
			this.driverNames = driverNames;
		}
		
		
		public Timestamp getCreatedTS() {
			return createdTS;
		}
		public void setCreatedTS(Timestamp createdTS) {
			this.createdTS = createdTS;
		}
		@Override
		public String toString() {
			return "PanicDetail [isRider=" + isRider + ", idServiceRecord=" + idServiceRecord + ", d_HomeCityName="
					+ d_HomeCityName + ", p_CityName=" + p_CityName + ", p_idCity=" + p_idCity + ", d_idHomeEstate="
					+ d_idHomeEstate + ", d_idHomeCity=" + d_idHomeCity + ", d_HomeEstateName=" + d_HomeEstateName
					+ ", r_idRider=" + r_idRider + ", r_identification=" + r_identification + ", r_username="
					+ r_username + ", r_names=" + r_names + ", r_lastNames=" + r_lastNames + ", r_email=" + r_email
					+ ", r_mobile=" + r_mobile + ", r_photoUrl=" + r_photoUrl + ", r_status=" + r_status + ", r_idUser="
					+ r_idUser + ", r_idCountry=" + r_idCountry + ", r_CountryName=" + r_CountryName + ", d_idDriver="
					+ d_idDriver + ", d_firstName=" + d_firstName + ", d_fathersLastName=" + d_fathersLastName
					+ ", d_username=" + d_username + ", d_photoUrl=" + d_photoUrl + ", d_mobile=" + d_mobile
					+ ", d_driverLicense=" + d_driverLicense + ", d_idUser=" + d_idUser + ", p_idPanic=" + p_idPanic
					+ ", p_dateCasePanic2=" + p_dateCasePanic2 + ", p_idRider=" + p_idRider + ", p_dateCasePanic="
					+ p_dateCasePanic + ", st_photoUrl=" + st_photoUrl + ", p_idStaff=" + p_idStaff
					+ ", st_fathersLastName=" + st_fathersLastName + ", p_createdDate=" + p_createdDate
					+ ", p_CasePanicName=" + p_CasePanicName + ", st_idUser=" + st_idUser + ", p_latitude=" + p_latitude
					+ ", p_longitude=" + p_longitude + ", p_address=" + p_address + ", st_firstName=" + st_firstName
					+ ", st_idStaff=" + st_idStaff + ", p_CountryName=" + p_CountryName + ", p_idCountry=" + p_idCountry
					+ ", p_idServiceRecord=" + p_idServiceRecord + ", panicTotals=" + panicTotals + ", d_taxiPlate="
					+ d_taxiPlate + ", requestedUserNames=" + requestedUserNames + ", riderNames=" + riderNames
					+ ", driverNames=" + driverNames + ", createdTS=" + createdTS + "]";
		}
		
	}
	

}
