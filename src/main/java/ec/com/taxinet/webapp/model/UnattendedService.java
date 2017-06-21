package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class UnattendedService implements Serializable {
	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	private Long idServiceRecord;
	private Long pickUpTime;
	private Long createdDate;
	private Long dropOffTime;
	private String pickUpLocation;
	private String dropOffLocation;
	private Integer statusServiceRecordId;
	private String statusDescription;
	private Long cityId;
	private String cityName;
	private Long idRider;
	private String riderUsername;
	private String riderNames;
	private String riderLastNames;
	private double pickUpLongitude;
	private double pickUpLatitude;
	private String pickUpReference;
	private double dropOffLatitude;
	private double dropOffLongitud;
	private double requestLatitude;
	private double requestLongitude;
	private Boolean isCompanyUser;
	private String thirdPersonName;
	private String riderIdentification;
	private Long riderIdCountry;
	private String raderCountryName;
	private double riderLimit;
	private String riderMobile;
	private String raderEmail;
	private Integer serviceType; //1:inmediato 2:programado 3:multiservicio
	private Integer minElapsed;
	private Integer segElapsed;
    private String fullNameRider;
    private String locationName;
    private String serviceTypeName;
    private String formatCreatedDate;

	public UnattendedService(){		
		
	}

	public Long getIdServiceRecord() {
		return idServiceRecord;
	}

	public Long getPickUpTime() {
		return pickUpTime;
	}

	public Long getCreatedDate() {
		return createdDate;
	}

	public Long getDropOffTime() {
		return dropOffTime;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public String getDropOffLocation() {
		return dropOffLocation;
	}

	public Integer getStatusServiceRecordId() {
		return statusServiceRecordId;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public Long getCityId() {
		return cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public Long getIdRider() {
		return idRider;
	}

	public String getRiderUsername() {
		return riderUsername;
	}

	public String getRiderNames() {
		return riderNames;
	}

	public String getRiderLastNames() {
		return riderLastNames;
	}

	public Double getPickUpLongitude() {
		return pickUpLongitude;
	}

	public Double getPickUpLatitude() {
		return pickUpLatitude;
	}

	public String getPickUpReference() {
		return pickUpReference;
	}

	public Double getDropOffLatitude() {
		return dropOffLatitude;
	}

	public Double getDropOffLongitud() {
		return dropOffLongitud;
	}

	public Double getRequestLatitude() {
		return requestLatitude;
	}

	public Double getRequestLongitude() {
		return requestLongitude;
	}

	public Boolean getIsCompanyUser() {
		return isCompanyUser;
	}

	public String getThirdPersonName() {
		return thirdPersonName;
	}

	public String getRiderIdentification() {
		return riderIdentification;
	}

	public Long getRiderIdCountry() {
		return riderIdCountry;
	}

	public String getRaderCountryName() {
		return raderCountryName;
	}

	public Double getRiderLimit() {
		return riderLimit;
	}

	public String getRiderMobile() {
		return riderMobile;
	}

	public String getRaderEmail() {
		return raderEmail;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public Integer getMinElapsed() {
		return minElapsed;
	}

	public Integer getSegElapsed() {
		return segElapsed;
	}

	public String getFullNameRider() {
		return fullNameRider;
	}

	public String getLocationName() {
		return locationName;
	}

	public String getServiceTypeName() {
		return serviceTypeName;
	}

	public String getFormatCreatedDate() {
		return formatCreatedDate;
	}

	public void setIdServiceRecord(Long idServiceRecord) {
		this.idServiceRecord = idServiceRecord;
	}

	public void setPickUpTime(Long pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}

	public void setDropOffTime(Long dropOffTime) {
		this.dropOffTime = dropOffTime;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	public void setStatusServiceRecordId(Integer statusServiceRecordId) {
		this.statusServiceRecordId = statusServiceRecordId;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setIdRider(Long idRider) {
		this.idRider = idRider;
	}

	public void setRiderUsername(String riderUsername) {
		this.riderUsername = riderUsername;
	}

	public void setRiderNames(String riderNames) {
		this.riderNames = riderNames;
	}

	public void setRiderLastNames(String riderLastNames) {
		this.riderLastNames = riderLastNames;
	}

	public void setPickUpLongitude(Double pickUpLongitude) {
		this.pickUpLongitude = pickUpLongitude;
	}

	public void setPickUpLatitude(Double pickUpLatitude) {
		this.pickUpLatitude = pickUpLatitude;
	}

	public void setPickUpReference(String pickUpReference) {
		this.pickUpReference = pickUpReference;
	}

	public void setDropOffLatitude(Double dropOffLatitude) {
		this.dropOffLatitude = dropOffLatitude;
	}

	public void setDropOffLongitud(Double dropOffLongitud) {
		this.dropOffLongitud = dropOffLongitud;
	}

	public void setRequestLatitude(Double requestLatitude) {
		this.requestLatitude = requestLatitude;
	}

	public void setRequestLongitude(Double requestLongitude) {
		this.requestLongitude = requestLongitude;
	}

	public void setIsCompanyUser(Boolean isCompanyUser) {
		this.isCompanyUser = isCompanyUser;
	}

	public void setThirdPersonName(String thirdPersonName) {
		this.thirdPersonName = thirdPersonName;
	}

	public void setRiderIdentification(String riderIdentification) {
		this.riderIdentification = riderIdentification;
	}

	public void setRiderIdCountry(Long riderIdCountry) {
		this.riderIdCountry = riderIdCountry;
	}

	public void setRaderCountryName(String raderCountryName) {
		this.raderCountryName = raderCountryName;
	}

	public void setRiderLimit(Double riderLimit) {
		this.riderLimit = riderLimit;
	}

	public void setRiderMobile(String riderMobile) {
		this.riderMobile = riderMobile;
	}

	public void setRaderEmail(String raderEmail) {
		this.raderEmail = raderEmail;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public void setMinElapsed(Integer minElapsed) {
		this.minElapsed = minElapsed;
	}

	public void setSegElapsed(Integer segElapsed) {
		this.segElapsed = segElapsed;
	}

	public void setFullNameRider(String fullNameRider) {
		this.fullNameRider = fullNameRider;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}

	public void setFormatCreatedDate(String formatCreatedDate) {
		this.formatCreatedDate = formatCreatedDate;
	}

	@Override
	public String toString() {
		return "UnattendedService [idServiceRecord=" + idServiceRecord + ", pickUpTime=" + pickUpTime + ", createdDate="
				+ createdDate + ", dropOffTime=" + dropOffTime + ", pickUpLocation=" + pickUpLocation
				+ ", dropOffLocation=" + dropOffLocation + ", statusServiceRecordId=" + statusServiceRecordId
				+ ", statusDescription=" + statusDescription + ", cityId=" + cityId + ", cityName=" + cityName
				+ ", idRider=" + idRider + ", riderUsername=" + riderUsername + ", riderNames=" + riderNames
				+ ", riderLastNames=" + riderLastNames + ", pickUpLongitude=" + pickUpLongitude + ", pickUpLatitude="
				+ pickUpLatitude + ", pickUpReference=" + pickUpReference + ", dropOffLatitude=" + dropOffLatitude
				+ ", dropOffLongitud=" + dropOffLongitud + ", requestLatitude=" + requestLatitude
				+ ", requestLongitude=" + requestLongitude + ", isCompanyUser=" + isCompanyUser + ", thirdPersonName="
				+ thirdPersonName + ", riderIdentification=" + riderIdentification + ", riderIdCountry="
				+ riderIdCountry + ", raderCountryName=" + raderCountryName + ", riderLimit=" + riderLimit
				+ ", riderMobile=" + riderMobile + ", raderEmail=" + raderEmail + ", serviceType=" + serviceType
				+ ", minElapsed=" + minElapsed + ", segElapsed=" + segElapsed + ", fullNameRider=" + fullNameRider
				+ ", locationName=" + locationName + ", serviceTypeName=" + serviceTypeName + ", formatCreatedDate="
				+ formatCreatedDate + "]";
	}
	
}
