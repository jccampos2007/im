package ec.com.taxinet.webapp.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DriverService implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public DriverService(){
		
	}
	
	private String simpleDate;
	private String typeServiceName;
	private Long idServiceRecord;
	private Long driverId;
	private String driverFirstName;
	private String driverFathersLastName;
	private String licenseDriver;
	private String pickUpTime;
	private Long createdDate;
	private String dropOffTime;
	private String pickUpLocation;
	private String dropOffLocation;
	private Float amount;
	private Float statusServiceRecordId;
	private String statusDescription;
	private Long cityId;
	private String cityName;
	private Long idRider;
	private String riderUsername;
	private String riderNames;
	private String riderLastNames;
	private Integer driverstatus;
	private String mobile;
	private Float rate;
	private Long driverIdHomeCity;
	private String driverHomeCityName;
	private Float pickUpLongitude;
	private String pickUpReference;
	private Float dropOffLatitude;
	private Float dropOffLongitude;
	private Float requestLatitude;
	private Float requestLongitude;
	private Boolean isCompanyUser;
	private String thirdPersonName;
	private String riderIdentification;
	private Long riderIdCountry;
	private String raderCountryName;
	private Float riderLimit;
	private String riderMobile;
	private String raderEmail;
	private String driverUsername;
	private Integer serviceType;
	private Float timeElapsed;
	private Float pickUpLatitude;
	private String riderPhotoUrl;
	private String driverPhotoUrl;
	
	private Long srv_idServiceVoucher;
	private Long srv_idSelectedCreditCard;
	private String srv_SelectedCreditCard_Number;
	private Long srv_idSelectedPaymentMethod;
	private String srv_SelectedPaymentMethod_Name;
	private Long srv_idServiceRecord;
	private Long srv_idUsedCreditCard;
	private Long srv_UsedCreditCard_Type;
	private String srv_UsedCreditCard_Number;
	private Long srv_idUsedPaymentMethod;
	private String srv_UsedPaymentMethod_Name;
	private Float srv_totalAmmount;
	private Float srv_distance;
	private Double srv_idleTime;
	private Boolean srv_voucherSended;
	private String srv_voucherSendedDate;
	private Float srv_serviceAmmount;
	private Float srv_appFeeAmmount;
	private Float srv_otherAmmount;
	private Float srv_taxAmmount;
	private Long srv_createdDate;
	private Long srv_modifiedDate;
	

	
	public String getSimpleDate() {
		return simpleDate;
	}
	public void setSimpleDate(String simpleDate) {
		this.simpleDate = simpleDate;
	}
	public String getTypeServiceName() {
		return typeServiceName;
	}
	public void setTypeServiceName(String typeServiceName) {
		this.typeServiceName = typeServiceName;
	}
	public Long getIdServiceRecord() {
		return idServiceRecord;
	}
	public void setIdServiceRecord(Long idServiceRecord) {
		this.idServiceRecord = idServiceRecord;
	}
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
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
	public String getLicenseDriver() {
		return licenseDriver;
	}
	public void setLicenseDriver(String licenseDriver) {
		this.licenseDriver = licenseDriver;
	}
	public String getPickUpTime() {
		return pickUpTime;
	}
	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}
	public Long getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}
	public String getDropOffTime() {
		return dropOffTime;
	}
	public void setDropOffTime(String dropOffTime) {
		this.dropOffTime = dropOffTime;
	}
	public String getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}
	public String getDropOffLocation() {
		return dropOffLocation;
	}
	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Float getStatusServiceRecordId() {
		return statusServiceRecordId;
	}
	public void setStatusServiceRecordId(Float statusServiceRecordId) {
		this.statusServiceRecordId = statusServiceRecordId;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Long getIdRider() {
		return idRider;
	}
	public void setIdRider(Long idRider) {
		this.idRider = idRider;
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
	public Integer getDriverstatus() {
		return driverstatus;
	}
	public void setDriverstatus(Integer driverstatus) {
		this.driverstatus = driverstatus;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
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
	public Float getPickUpLongitude() {
		return pickUpLongitude;
	}
	public void setPickUpLongitude(Float pickUpLongitude) {
		this.pickUpLongitude = pickUpLongitude;
	}
	public String getPickUpReference() {
		return pickUpReference;
	}
	public void setPickUpReference(String pickUpReference) {
		this.pickUpReference = pickUpReference;
	}
	public Float getDropOffLatitude() {
		return dropOffLatitude;
	}
	public void setDropOffLatitude(Float dropOffLatitude) {
		this.dropOffLatitude = dropOffLatitude;
	}
	public Float getDropOffLongitude() {
		return dropOffLongitude;
	}
	public void setDropOffLongitude(Float dropOffLongitude) {
		this.dropOffLongitude = dropOffLongitude;
	}
	public Float getRequestLatitude() {
		return requestLatitude;
	}
	public void setRequestLatitude(Float requestLatitude) {
		this.requestLatitude = requestLatitude;
	}
	public Float getRequestLongitude() {
		return requestLongitude;
	}
	public void setRequestLongitude(Float requestLongitude) {
		this.requestLongitude = requestLongitude;
	}
	public Boolean getIsCompanyUser() {
		return isCompanyUser;
	}
	public void setIsCompanyUser(Boolean isCompanyUser) {
		this.isCompanyUser = isCompanyUser;
	}
	public String getThirdPersonName() {
		return thirdPersonName;
	}
	public void setThirdPersonName(String thirdPersonName) {
		this.thirdPersonName = thirdPersonName;
	}
	public String getRiderIdentification() {
		return riderIdentification;
	}
	public void setRiderIdentification(String riderIdentification) {
		this.riderIdentification = riderIdentification;
	}
	public Long getRiderIdCountry() {
		return riderIdCountry;
	}
	public void setRiderIdCountry(Long riderIdCountry) {
		this.riderIdCountry = riderIdCountry;
	}
	public String getRaderCountryName() {
		return raderCountryName;
	}
	public void setRaderCountryName(String raderCountryName) {
		this.raderCountryName = raderCountryName;
	}
	public Float getRiderLimit() {
		return riderLimit;
	}
	public void setRiderLimit(Float riderLimit) {
		this.riderLimit = riderLimit;
	}
	public String getRiderMobile() {
		return riderMobile;
	}
	public void setRiderMobile(String riderMobile) {
		this.riderMobile = riderMobile;
	}
	public String getRaderEmail() {
		return raderEmail;
	}
	public void setRaderEmail(String raderEmail) {
		this.raderEmail = raderEmail;
	}
	public String getDriverUsername() {
		return driverUsername;
	}
	public void setDriverUsername(String driverUsername) {
		this.driverUsername = driverUsername;
	}
	public Integer getServiceType() {
		return serviceType;
	}
	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}
	public Float getTimeElapsed() {
		return timeElapsed;
	}
	public void setTimeElapsed(Float timeElapsed) {
		this.timeElapsed = timeElapsed;
	}
	public Float getPickUpLatitude() {
		return pickUpLatitude;
	}
	public void setPickUpLatitude(Float pickUpLatitude) {
		this.pickUpLatitude = pickUpLatitude;
	}
	public String getRiderPhotoUrl() {
		return riderPhotoUrl;
	}
	public void setRiderPhotoUrl(String riderPhotoUrl) {
		this.riderPhotoUrl = riderPhotoUrl;
	}
	public String getDriverPhotoUrl() {
		return driverPhotoUrl;
	}
	public void setDriverPhotoUrl(String driverPhotoUrl) {
		this.driverPhotoUrl = driverPhotoUrl;
	}
	
	
	public Long getSrv_idServiceVoucher() {
		return srv_idServiceVoucher;
	}
	public void setSrv_idServiceVoucher(Long srv_idServiceVoucher) {
		this.srv_idServiceVoucher = srv_idServiceVoucher;
	}
	public Long getSrv_idSelectedCreditCard() {
		return srv_idSelectedCreditCard;
	}
	public void setSrv_idSelectedCreditCard(Long srv_idSelectedCreditCard) {
		this.srv_idSelectedCreditCard = srv_idSelectedCreditCard;
	}
	public String getSrv_SelectedCreditCard_Number() {
		return srv_SelectedCreditCard_Number;
	}
	public void setSrv_SelectedCreditCard_Number(String srv_SelectedCreditCard_Number) {
		this.srv_SelectedCreditCard_Number = srv_SelectedCreditCard_Number;
	}
	public Long getSrv_idSelectedPaymentMethod() {
		return srv_idSelectedPaymentMethod;
	}
	public void setSrv_idSelectedPaymentMethod(Long srv_idSelectedPaymentMethod) {
		this.srv_idSelectedPaymentMethod = srv_idSelectedPaymentMethod;
	}
	public String getSrv_SelectedPaymentMethod_Name() {
		return srv_SelectedPaymentMethod_Name;
	}
	public void setSrv_SelectedPaymentMethod_Name(String srv_SelectedPaymentMethod_Name) {
		this.srv_SelectedPaymentMethod_Name = srv_SelectedPaymentMethod_Name;
	}
	public Long getSrv_idServiceRecord() {
		return srv_idServiceRecord;
	}
	public void setSrv_idServiceRecord(Long srv_idServiceRecord) {
		this.srv_idServiceRecord = srv_idServiceRecord;
	}
	public Long getSrv_idUsedCreditCard() {
		return srv_idUsedCreditCard;
	}
	public void setSrv_idUsedCreditCard(Long srv_idUsedCreditCard) {
		this.srv_idUsedCreditCard = srv_idUsedCreditCard;
	}
	public Long getSrv_UsedCreditCard_Type() {
		return srv_UsedCreditCard_Type;
	}
	public void setSrv_UsedCreditCard_Type(Long srv_UsedCreditCard_Type) {
		this.srv_UsedCreditCard_Type = srv_UsedCreditCard_Type;
	}
	public String getSrv_UsedCreditCard_Number() {
		return srv_UsedCreditCard_Number;
	}
	public void setSrv_UsedCreditCard_Number(String srv_UsedCreditCard_Number) {
		this.srv_UsedCreditCard_Number = srv_UsedCreditCard_Number;
	}
	public Long getSrv_idUsedPaymentMethod() {
		return srv_idUsedPaymentMethod;
	}
	public void setSrv_idUsedPaymentMethod(Long srv_idUsedPaymentMethod) {
		this.srv_idUsedPaymentMethod = srv_idUsedPaymentMethod;
	}
	public String getSrv_UsedPaymentMethod_Name() {
		return srv_UsedPaymentMethod_Name;
	}
	public void setSrv_UsedPaymentMethod_Name(String srv_UsedPaymentMethod_Name) {
		this.srv_UsedPaymentMethod_Name = srv_UsedPaymentMethod_Name;
	}
	public Float getSrv_totalAmmount() {
		return srv_totalAmmount;
	}
	public void setSrv_totalAmmount(Float srv_totalAmmount) {
		this.srv_totalAmmount = srv_totalAmmount;
	}
	public Float getSrv_distance() {
		return srv_distance;
	}
	public void setSrv_distance(Float srv_distance) {
		this.srv_distance = srv_distance;
	}
	public Double getSrv_idleTime() {
		return srv_idleTime;
	}
	public void setSrv_idleTime(Double srv_idleTime) {
		this.srv_idleTime = srv_idleTime;
	}
	public Boolean getSrv_voucherSended() {
		return srv_voucherSended;
	}
	public void setSrv_voucherSended(Boolean srv_voucherSended) {
		this.srv_voucherSended = srv_voucherSended;
	}
	public String getSrv_voucherSendedDate() {
		return srv_voucherSendedDate;
	}
	public void setSrv_voucherSendedDate(String srv_voucherSendedDate) {
		this.srv_voucherSendedDate = srv_voucherSendedDate;
	}
	public Float getSrv_serviceAmmount() {
		return srv_serviceAmmount;
	}
	public void setSrv_serviceAmmount(Float srv_serviceAmmount) {
		this.srv_serviceAmmount = srv_serviceAmmount;
	}
	public Float getSrv_appFeeAmmount() {
		return srv_appFeeAmmount;
	}
	public void setSrv_appFeeAmmount(Float srv_appFeeAmmount) {
		this.srv_appFeeAmmount = srv_appFeeAmmount;
	}
	public Float getSrv_otherAmmount() {
		return srv_otherAmmount;
	}
	public void setSrv_otherAmmount(Float srv_otherAmmount) {
		this.srv_otherAmmount = srv_otherAmmount;
	}
	public Float getSrv_taxAmmount() {
		return srv_taxAmmount;
	}
	public void setSrv_taxAmmount(Float srv_taxAmmount) {
		this.srv_taxAmmount = srv_taxAmmount;
	}
	public Long getSrv_createdDate() {
		return srv_createdDate;
	}
	public void setSrv_createdDate(Long srv_createdDate) {
		this.srv_createdDate = srv_createdDate;
	}
	public Long getSrv_modifiedDate() {
		return srv_modifiedDate;
	}
	public void setSrv_modifiedDate(Long srv_modifiedDate) {
		this.srv_modifiedDate = srv_modifiedDate;
	}
	
	
	@Override
	public String toString() {
		return "DriverService [simpleDate=" + simpleDate + ", typeServiceName=" + typeServiceName + ", idServiceRecord="
				+ idServiceRecord + ", driverId=" + driverId + ", driverFirstName=" + driverFirstName
				+ ", driverFathersLastName=" + driverFathersLastName + ", licenseDriver=" + licenseDriver
				+ ", pickUpTime=" + pickUpTime + ", createdDate=" + createdDate + ", dropOffTime=" + dropOffTime
				+ ", pickUpLocation=" + pickUpLocation + ", dropOffLocation=" + dropOffLocation + ", amount=" + amount
				+ ", statusServiceRecordId=" + statusServiceRecordId + ", statusDescription=" + statusDescription
				+ ", cityId=" + cityId + ", cityName=" + cityName + ", idRider=" + idRider + ", riderUsername="
				+ riderUsername + ", riderNames=" + riderNames + ", riderLastNames=" + riderLastNames
				+ ", driverstatus=" + driverstatus + ", mobile=" + mobile + ", rate=" + rate + ", driverIdHomeCity="
				+ driverIdHomeCity + ", driverHomeCityName=" + driverHomeCityName + ", pickUpLongitude="
				+ pickUpLongitude + ", pickUpReference=" + pickUpReference + ", dropOffLatitude=" + dropOffLatitude
				+ ", dropOffLongitude=" + dropOffLongitude + ", requestLatitude=" + requestLatitude
				+ ", requestLongitude=" + requestLongitude + ", isCompanyUser=" + isCompanyUser + ", thirdPersonName="
				+ thirdPersonName + ", riderIdentification=" + riderIdentification + ", riderIdCountry="
				+ riderIdCountry + ", raderCountryName=" + raderCountryName + ", riderLimit=" + riderLimit
				+ ", riderMobile=" + riderMobile + ", raderEmail=" + raderEmail + ", driverUsername=" + driverUsername
				+ ", serviceType=" + serviceType + ", timeElapsed=" + timeElapsed + ", pickUpLatitude=" + pickUpLatitude
				+ ", riderPhotoUrl=" + riderPhotoUrl + ", driverPhotoUrl=" + driverPhotoUrl + ", srv_idServiceVoucher="
				+ srv_idServiceVoucher + ", srv_idSelectedCreditCard=" + srv_idSelectedCreditCard
				+ ", srv_SelectedCreditCard_Number=" + srv_SelectedCreditCard_Number + ", srv_idSelectedPaymentMethod="
				+ srv_idSelectedPaymentMethod + ", srv_SelectedPaymentMethod_Name=" + srv_SelectedPaymentMethod_Name
				+ ", srv_idServiceRecord=" + srv_idServiceRecord + ", srv_idUsedCreditCard=" + srv_idUsedCreditCard
				+ ", srv_UsedCreditCard_Type=" + srv_UsedCreditCard_Type + ", srv_UsedCreditCard_Number="
				+ srv_UsedCreditCard_Number + ", srv_idUsedPaymentMethod=" + srv_idUsedPaymentMethod
				+ ", srv_UsedPaymentMethod_Name=" + srv_UsedPaymentMethod_Name + ", srv_totalAmmount="
				+ srv_totalAmmount + ", srv_distance=" + srv_distance + ", srv_idleTime=" + srv_idleTime
				+ ", srv_voucherSended=" + srv_voucherSended + ", srv_voucherSendedDate=" + srv_voucherSendedDate
				+ ", srv_serviceAmmount=" + srv_serviceAmmount + ", srv_appFeeAmmount=" + srv_appFeeAmmount
				+ ", srv_otherAmmount=" + srv_otherAmmount + ", srv_taxAmmount=" + srv_taxAmmount + ", srv_createdDate="
				+ srv_createdDate + ", srv_modifiedDate=" + srv_modifiedDate + "]";
	}




	@JsonInclude(Include.NON_NULL)
	public static class ResponseServicesDriver{	
		
		public ResponseServicesDriver(){
			
		}
		
		private Long idServiceRecord; //: 49,
		private Long driverId; //: 2,
		private String driverFirstName; //: "Nacarid",
		private String driverFathersLastName; //: "Silva",
		private String licenseDriver; //: "028383902",
		private Long pickUpTime; //: 1479873600000,
		private Long createdDate; //: 1479925999857,
		private String createdDateFormat; //: 1479925999857,
		private String dropOffTime; //: null,
		private String pickUpLocation; //: "Test2",
		private String dropOffLocation; //: "GUAYAQUIL",
		private Double amount; //: 717.36,
		private String amountFormat; //: 717.36,
		private Integer statusServiceRecordId; //: 7,
		private String statusDescription; //: "Driver On Way",
		private Long cityId; //: 581,
		private String cityName; //: "GUAYAQUIL",
		private Long idRider; //: 13,
		private String riderUsername; //: "breyes",
		private String riderNames; //: "Brick",
		private String riderLastNames; //: "Reyes Zambrano",
		private Integer driverstatus; //: 1,
		private String mobile; //: "04323467894",
		private Double rate; //: 5,
		private Long driverIdHomeCity; //: 581,
		private String driverHomeCityName; //: "GUAYAQUIL",
		private Double pickUpLongitude; //: 20,
		private String pickUpReference; //: "Sambil",
		private Double dropOffLatitude; //: 0,
		private Double dropOffLongitude; //: 0,
		private Double requestLatitude; //: 10,
		private Double requestLongitude; //: 20,
		private Boolean isCompanyUser; //: false,
		private String thirdPersonName; //: "S/I",
		private String riderIdentification; //: "0919730150",
		private Long riderIdCountry; //: 3,
		private String raderCountryName; //: "ECUADOR",
		private Double riderLimit; //: 0,
		private String riderMobile; //: "+593-986734908",
		private String raderEmail; //: "breyes@kruger.com.ec",
		private String driverUsername; //: "driver01",
		private Integer serviceType; //: 1,
		private String typeServiceName; //: 1,
		private Integer timeElapsed; //: 0,
		private Double pickUpLatitude; //: 10,
		private String riderPhotoUrl; //: "",
		private String driverPhotoUrl;
		
		private Long srv_idServiceVoucher;
		private Long srv_idSelectedCreditCard;
		private String srv_SelectedCreditCard_Number;
		private Long srv_idSelectedPaymentMethod;
		private String srv_SelectedPaymentMethod_Name;
		private Long srv_idServiceRecord;
		private Long srv_idUsedCreditCard;
		private Long srv_UsedCreditCard_Type;
		private String srv_UsedCreditCard_Number;
		private Long srv_idUsedPaymentMethod;
		private String srv_UsedPaymentMethod_Name;
		private Float srv_totalAmmount;
		private Float srv_distance;
		private Double srv_idleTime;
		private Boolean srv_voucherSended;
		private String srv_voucherSendedDate;
		private Float srv_serviceAmmount;
		private Float srv_appFeeAmmount;
		private Float srv_otherAmmount;
		private Float srv_taxAmmount;
		private String srv_createdDate;
		private String srv_modifiedDate;
		private String t_VehiclePlate;
		
		public Long getIdServiceRecord() {
			return idServiceRecord;
		}
		public void setIdServiceRecord(Long idServiceRecord) {
			this.idServiceRecord = idServiceRecord;
		}
		public Long getDriverId() {
			return driverId;
		}
		public void setDriverId(Long driverId) {
			this.driverId = driverId;
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
		public String getLicenseDriver() {
			return licenseDriver;
		}
		public void setLicenseDriver(String licenseDriver) {
			this.licenseDriver = licenseDriver;
		}
		public Long getPickUpTime() {
			return pickUpTime;
		}
		public void setPickUpTime(Long pickUpTime) {
			this.pickUpTime = pickUpTime;
		}
		public Long getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Long createdDate) {
			this.createdDate = createdDate;
		}
		public String getCreatedDateFormat() {
			return createdDateFormat;
		}
		public void setCreatedDateFormat(String createdDateFormat) {
			this.createdDateFormat = createdDateFormat;
		}
		public String getDropOffTime() {
			return dropOffTime;
		}
		public void setDropOffTime(String dropOffTime) {
			this.dropOffTime = dropOffTime;
		}
		public String getPickUpLocation() {
			return pickUpLocation;
		}
		public void setPickUpLocation(String pickUpLocation) {
			this.pickUpLocation = pickUpLocation;
		}
		public String getDropOffLocation() {
			return dropOffLocation;
		}
		public void setDropOffLocation(String dropOffLocation) {
			this.dropOffLocation = dropOffLocation;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public String getAmountFormat() {
			return amountFormat;
		}
		public void setAmountFormat(String amountFormat) {
			this.amountFormat = amountFormat;
		}
		public Integer getStatusServiceRecordId() {
			return statusServiceRecordId;
		}
		public void setStatusServiceRecordId(Integer statusServiceRecordId) {
			this.statusServiceRecordId = statusServiceRecordId;
		}
		public String getStatusDescription() {
			return statusDescription;
		}
		public void setStatusDescription(String statusDescription) {
			this.statusDescription = statusDescription;
		}
		public Long getCityId() {
			return cityId;
		}
		public void setCityId(Long cityId) {
			this.cityId = cityId;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public Long getIdRider() {
			return idRider;
		}
		public void setIdRider(Long idRider) {
			this.idRider = idRider;
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
		public Integer getDriverstatus() {
			return driverstatus;
		}
		public void setDriverstatus(Integer driverstatus) {
			this.driverstatus = driverstatus;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public Double getRate() {
			return rate;
		}
		public void setRate(Double rate) {
			this.rate = rate;
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
		public Double getPickUpLongitude() {
			return pickUpLongitude;
		}
		public void setPickUpLongitude(Double pickUpLongitude) {
			this.pickUpLongitude = pickUpLongitude;
		}
		public String getPickUpReference() {
			return pickUpReference;
		}
		public void setPickUpReference(String pickUpReference) {
			this.pickUpReference = pickUpReference;
		}
		public Double getDropOffLatitude() {
			return dropOffLatitude;
		}
		public void setDropOffLatitude(Double dropOffLatitude) {
			this.dropOffLatitude = dropOffLatitude;
		}
		public Double getDropOffLongitude() {
			return dropOffLongitude;
		}
		public void setDropOffLongitude(Double dropOffLongitude) {
			this.dropOffLongitude = dropOffLongitude;
		}
		public Double getRequestLatitude() {
			return requestLatitude;
		}
		public void setRequestLatitude(Double requestLatitude) {
			this.requestLatitude = requestLatitude;
		}
		public Double getRequestLongitude() {
			return requestLongitude;
		}
		public void setRequestLongitude(Double requestLongitude) {
			this.requestLongitude = requestLongitude;
		}
		public Boolean getIsCompanyUser() {
			return isCompanyUser;
		}
		public void setIsCompanyUser(Boolean isCompanyUser) {
			this.isCompanyUser = isCompanyUser;
		}
		public String getThirdPersonName() {
			return thirdPersonName;
		}
		public void setThirdPersonName(String thirdPersonName) {
			this.thirdPersonName = thirdPersonName;
		}
		public String getRiderIdentification() {
			return riderIdentification;
		}
		public void setRiderIdentification(String riderIdentification) {
			this.riderIdentification = riderIdentification;
		}
		public Long getRiderIdCountry() {
			return riderIdCountry;
		}
		public void setRiderIdCountry(Long riderIdCountry) {
			this.riderIdCountry = riderIdCountry;
		}
		public String getRaderCountryName() {
			return raderCountryName;
		}
		public void setRaderCountryName(String raderCountryName) {
			this.raderCountryName = raderCountryName;
		}
		public Double getRiderLimit() {
			return riderLimit;
		}
		public void setRiderLimit(Double riderLimit) {
			this.riderLimit = riderLimit;
		}
		public String getRiderMobile() {
			return riderMobile;
		}
		public void setRiderMobile(String riderMobile) {
			this.riderMobile = riderMobile;
		}
		public String getRaderEmail() {
			return raderEmail;
		}
		public void setRaderEmail(String raderEmail) {
			this.raderEmail = raderEmail;
		}
		public String getDriverUsername() {
			return driverUsername;
		}
		public void setDriverUsername(String driverUsername) {
			this.driverUsername = driverUsername;
		}
		public Integer getServiceType() {
			return serviceType;
		}
		public void setServiceType(Integer serviceType) {
			this.serviceType = serviceType;
		}
		public String getTypeServiceName() {
			return typeServiceName;
		}
		public void setTypeServiceName(String typeServiceName) {
			this.typeServiceName = typeServiceName;
		}
		public Integer getTimeElapsed() {
			return timeElapsed;
		}
		public void setTimeElapsed(Integer timeElapsed) {
			this.timeElapsed = timeElapsed;
		}
		public Double getPickUpLatitude() {
			return pickUpLatitude;
		}
		public void setPickUpLatitude(Double pickUpLatitude) {
			this.pickUpLatitude = pickUpLatitude;
		}
		public String getRiderPhotoUrl() {
			return riderPhotoUrl;
		}
		public void setRiderPhotoUrl(String riderPhotoUrl) {
			this.riderPhotoUrl = riderPhotoUrl;
		}
		public String getDriverPhotoUrl() {
			return driverPhotoUrl;
		}
		public void setDriverPhotoUrl(String driverPhotoUrl) {
			this.driverPhotoUrl = driverPhotoUrl;
		}
		public Long getSrv_idServiceVoucher() {
			return srv_idServiceVoucher;
		}
		public void setSrv_idServiceVoucher(Long srv_idServiceVoucher) {
			this.srv_idServiceVoucher = srv_idServiceVoucher;
		}
		public Long getSrv_idSelectedCreditCard() {
			return srv_idSelectedCreditCard;
		}
		public void setSrv_idSelectedCreditCard(Long srv_idSelectedCreditCard) {
			this.srv_idSelectedCreditCard = srv_idSelectedCreditCard;
		}
		public String getSrv_SelectedCreditCard_Number() {
			return srv_SelectedCreditCard_Number;
		}
		public void setSrv_SelectedCreditCard_Number(String srv_SelectedCreditCard_Number) {
			this.srv_SelectedCreditCard_Number = srv_SelectedCreditCard_Number;
		}
		public Long getSrv_idSelectedPaymentMethod() {
			return srv_idSelectedPaymentMethod;
		}
		public void setSrv_idSelectedPaymentMethod(Long srv_idSelectedPaymentMethod) {
			this.srv_idSelectedPaymentMethod = srv_idSelectedPaymentMethod;
		}
		public String getSrv_SelectedPaymentMethod_Name() {
			return srv_SelectedPaymentMethod_Name;
		}
		public void setSrv_SelectedPaymentMethod_Name(String srv_SelectedPaymentMethod_Name) {
			this.srv_SelectedPaymentMethod_Name = srv_SelectedPaymentMethod_Name;
		}
		public Long getSrv_idServiceRecord() {
			return srv_idServiceRecord;
		}
		public void setSrv_idServiceRecord(Long srv_idServiceRecord) {
			this.srv_idServiceRecord = srv_idServiceRecord;
		}
		public Long getSrv_idUsedCreditCard() {
			return srv_idUsedCreditCard;
		}
		public void setSrv_idUsedCreditCard(Long srv_idUsedCreditCard) {
			this.srv_idUsedCreditCard = srv_idUsedCreditCard;
		}
		public Long getSrv_UsedCreditCard_Type() {
			return srv_UsedCreditCard_Type;
		}
		public void setSrv_UsedCreditCard_Type(Long srv_UsedCreditCard_Type) {
			this.srv_UsedCreditCard_Type = srv_UsedCreditCard_Type;
		}
		public String getSrv_UsedCreditCard_Number() {
			return srv_UsedCreditCard_Number;
		}
		public void setSrv_UsedCreditCard_Number(String srv_UsedCreditCard_Number) {
			this.srv_UsedCreditCard_Number = srv_UsedCreditCard_Number;
		}
		public Long getSrv_idUsedPaymentMethod() {
			return srv_idUsedPaymentMethod;
		}
		public void setSrv_idUsedPaymentMethod(Long srv_idUsedPaymentMethod) {
			this.srv_idUsedPaymentMethod = srv_idUsedPaymentMethod;
		}
		public String getSrv_UsedPaymentMethod_Name() {
			return srv_UsedPaymentMethod_Name;
		}
		public void setSrv_UsedPaymentMethod_Name(String srv_UsedPaymentMethod_Name) {
			this.srv_UsedPaymentMethod_Name = srv_UsedPaymentMethod_Name;
		}
		public Float getSrv_totalAmmount() {
			return srv_totalAmmount;
		}
		public void setSrv_totalAmmount(Float srv_totalAmmount) {
			this.srv_totalAmmount = srv_totalAmmount;
		}
		public Float getSrv_distance() {
			return srv_distance;
		}
		public void setSrv_distance(Float srv_distance) {
			this.srv_distance = srv_distance;
		}
		public Double getSrv_idleTime() {
			return srv_idleTime;
		}
		public void setSrv_idleTime(Double srv_idleTime) {
			this.srv_idleTime = srv_idleTime;
		}
		public Boolean getSrv_voucherSended() {
			return srv_voucherSended;
		}
		public void setSrv_voucherSended(Boolean srv_voucherSended) {
			this.srv_voucherSended = srv_voucherSended;
		}
		public String getSrv_voucherSendedDate() {
			return srv_voucherSendedDate;
		}
		public void setSrv_voucherSendedDate(String srv_voucherSendedDate) {
			this.srv_voucherSendedDate = srv_voucherSendedDate;
		}
		public Float getSrv_serviceAmmount() {
			return srv_serviceAmmount;
		}
		public void setSrv_serviceAmmount(Float srv_serviceAmmount) {
			this.srv_serviceAmmount = srv_serviceAmmount;
		}
		public Float getSrv_appFeeAmmount() {
			return srv_appFeeAmmount;
		}
		public void setSrv_appFeeAmmount(Float srv_appFeeAmmount) {
			this.srv_appFeeAmmount = srv_appFeeAmmount;
		}
		public Float getSrv_otherAmmount() {
			return srv_otherAmmount;
		}
		public void setSrv_otherAmmount(Float srv_otherAmmount) {
			this.srv_otherAmmount = srv_otherAmmount;
		}
		public Float getSrv_taxAmmount() {
			return srv_taxAmmount;
		}
		public void setSrv_taxAmmount(Float srv_taxAmmount) {
			this.srv_taxAmmount = srv_taxAmmount;
		}
		public String getSrv_createdDate() {
			return srv_createdDate;
		}
		public void setSrv_createdDate(String srv_createdDate) {
			this.srv_createdDate = srv_createdDate;
		}
		public String getSrv_modifiedDate() {
			return srv_modifiedDate;
		}
		public void setSrv_modifiedDate(String srv_modifiedDate) {
			this.srv_modifiedDate = srv_modifiedDate;
		}
		public String getT_VehiclePlate() {
			return t_VehiclePlate;
		}
		public void setT_VehiclePlate(String t_VehiclePlate) {
			this.t_VehiclePlate = t_VehiclePlate;
		}
		
		@Override
		public String toString() {
			return "ResponseServicesDriver [idServiceRecord=" + idServiceRecord + ", driverId=" + driverId
					+ ", driverFirstName=" + driverFirstName + ", driverFathersLastName=" + driverFathersLastName
					+ ", licenseDriver=" + licenseDriver + ", pickUpTime=" + pickUpTime + ", createdDate=" + createdDate
					+ ", createdDateFormat=" + createdDateFormat + ", dropOffTime=" + dropOffTime + ", pickUpLocation="
					+ pickUpLocation + ", dropOffLocation=" + dropOffLocation + ", amount=" + amount + ", amountFormat="
					+ amountFormat + ", statusServiceRecordId=" + statusServiceRecordId + ", statusDescription="
					+ statusDescription + ", cityId=" + cityId + ", cityName=" + cityName + ", idRider=" + idRider
					+ ", riderUsername=" + riderUsername + ", riderNames=" + riderNames + ", riderLastNames="
					+ riderLastNames + ", driverstatus=" + driverstatus + ", mobile=" + mobile + ", rate=" + rate
					+ ", driverIdHomeCity=" + driverIdHomeCity + ", driverHomeCityName=" + driverHomeCityName
					+ ", pickUpLongitude=" + pickUpLongitude + ", pickUpReference=" + pickUpReference
					+ ", dropOffLatitude=" + dropOffLatitude + ", dropOffLongitude=" + dropOffLongitude
					+ ", requestLatitude=" + requestLatitude + ", requestLongitude=" + requestLongitude
					+ ", isCompanyUser=" + isCompanyUser + ", thirdPersonName=" + thirdPersonName
					+ ", riderIdentification=" + riderIdentification + ", riderIdCountry=" + riderIdCountry
					+ ", raderCountryName=" + raderCountryName + ", riderLimit=" + riderLimit + ", riderMobile="
					+ riderMobile + ", raderEmail=" + raderEmail + ", driverUsername=" + driverUsername
					+ ", serviceType=" + serviceType + ", typeServiceName=" + typeServiceName + ", timeElapsed="
					+ timeElapsed + ", pickUpLatitude=" + pickUpLatitude + ", riderPhotoUrl=" + riderPhotoUrl
					+ ", driverPhotoUrl=" + driverPhotoUrl + ", srv_idServiceVoucher=" + srv_idServiceVoucher
					+ ", srv_idSelectedCreditCard=" + srv_idSelectedCreditCard + ", srv_SelectedCreditCard_Number="
					+ srv_SelectedCreditCard_Number + ", srv_idSelectedPaymentMethod=" + srv_idSelectedPaymentMethod
					+ ", srv_SelectedPaymentMethod_Name=" + srv_SelectedPaymentMethod_Name + ", srv_idServiceRecord="
					+ srv_idServiceRecord + ", srv_idUsedCreditCard=" + srv_idUsedCreditCard
					+ ", srv_UsedCreditCard_Type=" + srv_UsedCreditCard_Type + ", srv_UsedCreditCard_Number="
					+ srv_UsedCreditCard_Number + ", srv_idUsedPaymentMethod=" + srv_idUsedPaymentMethod
					+ ", srv_UsedPaymentMethod_Name=" + srv_UsedPaymentMethod_Name + ", srv_totalAmmount="
					+ srv_totalAmmount + ", srv_distance=" + srv_distance + ", srv_idleTime=" + srv_idleTime
					+ ", srv_voucherSended=" + srv_voucherSended + ", srv_voucherSendedDate=" + srv_voucherSendedDate
					+ ", srv_serviceAmmount=" + srv_serviceAmmount + ", srv_appFeeAmmount=" + srv_appFeeAmmount
					+ ", srv_otherAmmount=" + srv_otherAmmount + ", srv_taxAmmount=" + srv_taxAmmount
					+ ", srv_createdDate=" + srv_createdDate + ", srv_modifiedDate=" + srv_modifiedDate
					+ ", t_VehiclePlate=" + t_VehiclePlate + "]";
		}
		
		
		
		
	}
	
}
