package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Panic implements Serializable {
	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	private Long idDriver;
    private String driverUsername;
    private String driverFirstName;
    private String driverFathersLastName;
    private String driverPhotoUrl;
    private String driverMobile;
    private String driverLicense;
    private Long driverIdUser;
    private Long driverIdHomeEstate;
    private String driverHomeEstateName;
    private Long driverIdHomeCity;
    private String driverHomeCityName;
    private Long idDriverLocation;
    private Long driverLocationIdCity;
    private String driverLocationCityName;
    private Double driverLocationLatitude;
    private Double driverLocationLongitude;
    private String driverLocationSector;
    private Date driverLocationModifiedDate;
    private Date dateCasePanic;
    private Long idRider;
    private Long idPanic;
    private String panicName;
    private Long idStaff;
    private Long idServiceRecord;
    private Double latitude;
    private Double longitude;
    private Long createdDate;
    private Long riderIdentification;
    private String riderUsername;
    private String riderNames;
    private String riderLastNames;
    private String riderEmail;
    private String riderMobile;
    private String riderPhotoUrl;
    private Long riderStatus;
    private Long riderIdUser;
    private Long riderIdCountry;
    private String riderCountryName;
    private Long idFamilyRider;
    private Double riderLimit;
    private Boolean riderActivePanic;
    private String requestName;
    private String riderFullName;
    private String driverFullName;
    private String vehiclePlate;
    private String deviceMobile;
    private String formatCreatedDate;
    private String address;

	public Panic(){		
		
	}

	public Long getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(Long idDriver) {
		this.idDriver = idDriver;
	}

	public String getDriverUsername() {
		return driverUsername;
	}

	public void setDriverUsername(String driverUsername) {
		this.driverUsername = driverUsername;
	}

	public String getDriverFirstName() {
		return driverFirstName;
	}

	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}

	public String getDriverFathersLastName() {
		return driverFathersLastName;
	}

	public void setDriverFathersLastName(String driverFathersLastName) {
		this.driverFathersLastName = driverFathersLastName;
	}

	public String getDriverPhotoUrl() {
		return driverPhotoUrl;
	}

	public void setDriverPhotoUrl(String driverPhotoUrl) {
		this.driverPhotoUrl = driverPhotoUrl;
	}

	public String getDriverMobile() {
		return driverMobile;
	}

	public void setDriverMobile(String driverMobile) {
		this.driverMobile = driverMobile;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public Long getDriverIdUser() {
		return driverIdUser;
	}

	public void setDriverIdUser(Long driverIdUser) {
		this.driverIdUser = driverIdUser;
	}

	public Long getDriverIdHomeEstate() {
		return driverIdHomeEstate;
	}

	public void setDriverIdHomeEstate(Long driverIdHomeEstate) {
		this.driverIdHomeEstate = driverIdHomeEstate;
	}

	public String getDriverHomeEstateName() {
		return driverHomeEstateName;
	}

	public void setDriverHomeEstateName(String driverHomeEstateName) {
		this.driverHomeEstateName = driverHomeEstateName;
	}

	public Long getDriverIdHomeCity() {
		return driverIdHomeCity;
	}

	public void setDriverIdHomeCity(Long driverIdHomeCity) {
		this.driverIdHomeCity = driverIdHomeCity;
	}

	public String getDriverHomeCityName() {
		return driverHomeCityName;
	}

	public void setDriverHomeCityName(String driverHomeCityName) {
		this.driverHomeCityName = driverHomeCityName;
	}

	public Long getIdDriverLocation() {
		return idDriverLocation;
	}

	public void setIdDriverLocation(Long idDriverLocation) {
		this.idDriverLocation = idDriverLocation;
	}

	public Long getDriverLocationIdCity() {
		return driverLocationIdCity;
	}

	public void setDriverLocationIdCity(Long driverLocationIdCity) {
		this.driverLocationIdCity = driverLocationIdCity;
	}

	public String getDriverLocationCityName() {
		return driverLocationCityName;
	}

	public void setDriverLocationCityName(String driverLocationCityName) {
		this.driverLocationCityName = driverLocationCityName;
	}

	public Double getDriverLocationLatitude() {
		return driverLocationLatitude;
	}

	public void setDriverLocationLatitude(Double driverLocationLatitude) {
		this.driverLocationLatitude = driverLocationLatitude;
	}

	public Double getDriverLocationLongitude() {
		return driverLocationLongitude;
	}

	public void setDriverLocationLongitude(Double driverLocationLongitude) {
		this.driverLocationLongitude = driverLocationLongitude;
	}

	public String getDriverLocationSector() {
		return driverLocationSector;
	}

	public void setDriverLocationSector(String driverLocationSector) {
		this.driverLocationSector = driverLocationSector;
	}

	public Date getDriverLocationModifiedDate() {
		return driverLocationModifiedDate;
	}

	public void setDriverLocationModifiedDate(Date driverLocationModifiedDate) {
		this.driverLocationModifiedDate = driverLocationModifiedDate;
	}

	public Date getDateCasePanic() {
		return dateCasePanic;
	}

	public void setDateCasePanic(Date dateCasePanic) {
		this.dateCasePanic = dateCasePanic;
	}

	public Long getIdRider() {
		return idRider;
	}

	public void setIdRider(Long idRider) {
		this.idRider = idRider;
	}

	public Long getIdPanic() {
		return idPanic;
	}

	public void setIdPanic(Long idPanic) {
		this.idPanic = idPanic;
	}

	public String getPanicName() {
		return panicName;
	}

	public void setPanicName(String panicName) {
		this.panicName = panicName;
	}

	public Long getIdStaff() {
		return idStaff;
	}

	public void setIdStaff(Long idStaff) {
		this.idStaff = idStaff;
	}

	public Long getIdServiceRecord() {
		return idServiceRecord;
	}

	public void setIdServiceRecord(Long idServiceRecord) {
		this.idServiceRecord = idServiceRecord;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Long getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}

	public Long getRiderIdentification() {
		return riderIdentification;
	}

	public void setRiderIdentification(Long riderIdentification) {
		this.riderIdentification = riderIdentification;
	}

	public String getRiderUsername() {
		return riderUsername;
	}

	public void setRiderUsername(String riderUsername) {
		this.riderUsername = riderUsername;
	}

	public String getRiderNames() {
		return riderNames;
	}

	public void setRiderNames(String riderNames) {
		this.riderNames = riderNames;
	}

	public String getRiderLastNames() {
		return riderLastNames;
	}

	public void setRiderLastNames(String riderLastNames) {
		this.riderLastNames = riderLastNames;
	}

	public String getRiderEmail() {
		return riderEmail;
	}

	public void setRiderEmail(String riderEmail) {
		this.riderEmail = riderEmail;
	}

	public String getRiderMobile() {
		return riderMobile;
	}

	public void setRiderMobile(String riderMobile) {
		this.riderMobile = riderMobile;
	}

	public String getRiderPhotoUrl() {
		return riderPhotoUrl;
	}

	public void setRiderPhotoUrl(String riderPhotoUrl) {
		this.riderPhotoUrl = riderPhotoUrl;
	}

	public Long getRiderStatus() {
		return riderStatus;
	}

	public void setRiderStatus(Long riderStatus) {
		this.riderStatus = riderStatus;
	}

	public Long getRiderIdUser() {
		return riderIdUser;
	}

	public void setRiderIdUser(Long riderIdUser) {
		this.riderIdUser = riderIdUser;
	}

	public Long getRiderIdCountry() {
		return riderIdCountry;
	}

	public void setRiderIdCountry(Long riderIdCountry) {
		this.riderIdCountry = riderIdCountry;
	}

	public String getRiderCountryName() {
		return riderCountryName;
	}

	public void setRiderCountryName(String riderCountryName) {
		this.riderCountryName = riderCountryName;
	}

	public Long getIdFamilyRider() {
		return idFamilyRider;
	}

	public void setIdFamilyRider(Long idFamilyRider) {
		this.idFamilyRider = idFamilyRider;
	}

	public Double getRiderLimit() {
		return riderLimit;
	}

	public void setRiderLimit(Double riderLimit) {
		this.riderLimit = riderLimit;
	}

	public Boolean getRiderActivePanic() {
		return riderActivePanic;
	}

	public void setRiderActivePanic(Boolean riderActivePanic) {
		this.riderActivePanic = riderActivePanic;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getRiderFullName() {
		return riderFullName;
	}

	public void setRiderFullName(String riderFullName) {
		this.riderFullName = riderFullName;
	}

	public String getDriverFullName() {
		return driverFullName;
	}

	public void setDriverFullName(String driverFullName) {
		this.driverFullName = driverFullName;
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public String getDeviceMobile() {
		return deviceMobile;
	}

	public void setDeviceMobile(String deviceMobile) {
		this.deviceMobile = deviceMobile;
	}

	public String getFormatCreatedDate() {
		return formatCreatedDate;
	}

	public void setFormatCreatedDate(String formatCreatedDate) {
		this.formatCreatedDate = formatCreatedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Panic [idDriver=" + idDriver + ", driverUsername=" + driverUsername + ", driverFirstName="
				+ driverFirstName + ", driverFathersLastName=" + driverFathersLastName + ", driverPhotoUrl="
				+ driverPhotoUrl + ", driverMobile=" + driverMobile + ", driverLicense=" + driverLicense
				+ ", driverIdUser=" + driverIdUser + ", driverIdHomeEstate=" + driverIdHomeEstate
				+ ", driverHomeEstateName=" + driverHomeEstateName + ", driverIdHomeCity=" + driverIdHomeCity
				+ ", driverHomeCityName=" + driverHomeCityName + ", idDriverLocation=" + idDriverLocation
				+ ", driverLocationIdCity=" + driverLocationIdCity + ", driverLocationCityName="
				+ driverLocationCityName + ", driverLocationLatitude=" + driverLocationLatitude
				+ ", driverLocationLongitude=" + driverLocationLongitude + ", driverLocationSector="
				+ driverLocationSector + ", driverLocationModifiedDate=" + driverLocationModifiedDate
				+ ", dateCasePanic=" + dateCasePanic + ", idRider=" + idRider + ", idPanic=" + idPanic + ", panicName="
				+ panicName + ", idStaff=" + idStaff + ", idServiceRecord=" + idServiceRecord + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", createdDate=" + createdDate + ", riderIdentification="
				+ riderIdentification + ", riderUsername=" + riderUsername + ", riderNames=" + riderNames
				+ ", riderLastNames=" + riderLastNames + ", riderEmail=" + riderEmail + ", riderMobile=" + riderMobile
				+ ", riderPhotoUrl=" + riderPhotoUrl + ", riderStatus=" + riderStatus + ", riderIdUser=" + riderIdUser
				+ ", riderIdCountry=" + riderIdCountry + ", riderCountryName=" + riderCountryName + ", idFamilyRider="
				+ idFamilyRider + ", riderLimit=" + riderLimit + ", riderActivePanic=" + riderActivePanic
				+ ", requestName=" + requestName + ", riderFullName=" + riderFullName + ", driverFullName="
				+ driverFullName + ", vehiclePlate=" + vehiclePlate + ", deviceMobile=" + deviceMobile
				+ ", formatCreatedDate=" + formatCreatedDate + ", address=" + address + "]";
	}
	
}
