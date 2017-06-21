package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ServiceRecord implements Serializable {
	
	/*
	 * “idRider”: 0,
“idServiceType”: 0,
“pickupLatitude”: 0.0,
“pickupLongitude”: 0.0,
“pickupLocation”: “string”,
“pickupNeighborhood”: “string”,
“pickupReference”: “string”,
“pickupTime”: Date,
“dropoffLatitude”: 0.0,
“dropoffLongitude”: 0.0,
“dropoffLocation”: “string”,
“requestLatitude”: 0.0,
“requestLongitude”: 0.0,
“requestCityName”: “string”,
“requestStateName”: “string”,
“requestCountryName”: “string”,
“isFavoriteDriver”: true,
“idDriver”: 0,
“idAppName”: 0,
“isCompanyUser”: “string”,
“idCreditCard”: 0,
“riderName”: “string”
	 */
	
	private static final long serialVersionUID = 1L;
	private Long idPackage;
	private String name;
	private String type;
	private Long idCity;
	private String cityName;
	private Long idState;
	private String stateName;
	private Float totalAmount;
	private Float valueFee;
	private Integer countCareer;
	private String finalDate;
	private String initialDate;
	private Boolean sunday;
	private Boolean monday;
	private Boolean tuesday;
	private Boolean wednesday;
	private Boolean thursday;
	private Boolean friday;
	private Boolean saturday;
	private String initialSunday;
	private String initialMonday;
	private String initialTuesday;
	private String initialWednesday;
	private String initialThursday;
	private String initialFriday;
	private String initialSaturday;
	private String finalSunday;
	private String finalMonday;
	private String finalTuesday;
	private String finalWednesday;
	private String finalThursday;
	private String finalFriday;
	private String finalSaturday;
	private Long idCoinCatalog;
	private Integer status;
	private String statusName;
	private Long pk_idCountry;
	
	public ServiceRecord(){
		
	}

	public Long getIdPackage() {
		return idPackage;
	}

	public void setIdPackage(Long idPackage) {
		this.idPackage = idPackage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Float getValueFee() {
		return valueFee;
	}

	public void setValueFee(Float valueFee) {
		this.valueFee = valueFee;
	}

	public Integer getCountCareer() {
		return countCareer;
	}

	public void setCountCareer(Integer countCareer) {
		this.countCareer = countCareer;
	}

	public String getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}

	public String getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}

	public Boolean getSunday() {
		return sunday;
	}

	public void setSunday(Boolean sunday) {
		this.sunday = sunday;
	}

	public Boolean getMonday() {
		return monday;
	}

	public void setMonday(Boolean monday) {
		this.monday = monday;
	}

	public Boolean getTuesday() {
		return tuesday;
	}

	public void setTuesday(Boolean tuesday) {
		this.tuesday = tuesday;
	}

	public Boolean getWednesday() {
		return wednesday;
	}

	public void setWednesday(Boolean wednesday) {
		this.wednesday = wednesday;
	}

	public Boolean getThursday() {
		return thursday;
	}

	public void setThursday(Boolean thursday) {
		this.thursday = thursday;
	}

	public Boolean getFriday() {
		return friday;
	}

	public void setFriday(Boolean friday) {
		this.friday = friday;
	}

	public Boolean getSaturday() {
		return saturday;
	}

	public void setSaturday(Boolean saturday) {
		this.saturday = saturday;
	}

	public String getInitialSunday() {
		return initialSunday;
	}

	public void setInitialSunday(String initialSunday) {
		this.initialSunday = initialSunday;
	}

	public String getInitialMonday() {
		return initialMonday;
	}

	public void setInitialMonday(String initialMonday) {
		this.initialMonday = initialMonday;
	}

	public String getInitialTuesday() {
		return initialTuesday;
	}

	public void setInitialTuesday(String initialTuesday) {
		this.initialTuesday = initialTuesday;
	}

	public String getInitialWednesday() {
		return initialWednesday;
	}

	public void setInitialWednesday(String initialWednesday) {
		this.initialWednesday = initialWednesday;
	}

	public String getInitialThursday() {
		return initialThursday;
	}

	public void setInitialThursday(String initialThursday) {
		this.initialThursday = initialThursday;
	}

	public String getInitialFriday() {
		return initialFriday;
	}

	public void setInitialFriday(String initialFriday) {
		this.initialFriday = initialFriday;
	}

	public String getInitialSaturday() {
		return initialSaturday;
	}

	public void setInitialSaturday(String initialSaturday) {
		this.initialSaturday = initialSaturday;
	}

	public String getFinalSunday() {
		return finalSunday;
	}

	public void setFinalSunday(String finalSunday) {
		this.finalSunday = finalSunday;
	}

	public String getFinalMonday() {
		return finalMonday;
	}

	public void setFinalMonday(String finalMonday) {
		this.finalMonday = finalMonday;
	}

	public String getFinalTuesday() {
		return finalTuesday;
	}

	public void setFinalTuesday(String finalTuesday) {
		this.finalTuesday = finalTuesday;
	}

	public String getFinalWednesday() {
		return finalWednesday;
	}

	public void setFinalWednesday(String finalWednesday) {
		this.finalWednesday = finalWednesday;
	}

	public String getFinalThursday() {
		return finalThursday;
	}

	public void setFinalThursday(String finalThursday) {
		this.finalThursday = finalThursday;
	}

	public String getFinalFriday() {
		return finalFriday;
	}

	public void setFinalFriday(String finalFriday) {
		this.finalFriday = finalFriday;
	}

	public String getFinalSaturday() {
		return finalSaturday;
	}

	public void setFinalSaturday(String finalSaturday) {
		this.finalSaturday = finalSaturday;
	}

	public Long getIdCoinCatalog() {
		return idCoinCatalog;
	}

	public void setIdCoinCatalog(Long idCoinCatalog) {
		this.idCoinCatalog = idCoinCatalog;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Long getPk_idCountry() {
		return pk_idCountry;
	}

	public void setPk_idCountry(Long pk_idCountry) {
		this.pk_idCountry = pk_idCountry;
	}

	@Override
	public String toString() {
		return "ServiceRecord [idPackage=" + idPackage + ", name=" + name + ", type=" + type + ", idCity=" + idCity
				+ ", cityName=" + cityName + ", idState=" + idState + ", stateName=" + stateName + ", totalAmount="
				+ totalAmount + ", valueFee=" + valueFee + ", countCareer=" + countCareer + ", finalDate=" + finalDate
				+ ", initialDate=" + initialDate + ", sunday=" + sunday + ", monday=" + monday + ", tuesday=" + tuesday
				+ ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday + ", saturday="
				+ saturday + ", initialSunday=" + initialSunday + ", initialMonday=" + initialMonday
				+ ", initialTuesday=" + initialTuesday + ", initialWednesday=" + initialWednesday + ", initialThursday="
				+ initialThursday + ", initialFriday=" + initialFriday + ", initialSaturday=" + initialSaturday
				+ ", finalSunday=" + finalSunday + ", finalMonday=" + finalMonday + ", finalTuesday=" + finalTuesday
				+ ", finalWednesday=" + finalWednesday + ", finalThursday=" + finalThursday + ", finalFriday="
				+ finalFriday + ", finalSaturday=" + finalSaturday + ", idCoinCatalog=" + idCoinCatalog + ", status="
				+ status + ", statusName=" + statusName + ", pk_idCountry=" + pk_idCountry + "]";
	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataServiceRecord{
		
		private Long idServiceRecord;
		
		public ResponseDataServiceRecord() {
			// TODO Auto-generated constructor stub
		}

		public Long getIdServiceRecord() {
			return idServiceRecord;
		}

		public void setIdServiceRecord(Long idServiceRecord) {
			this.idServiceRecord = idServiceRecord;
		}

		@Override
		public String toString() {
			return "ResponseDataServiceRecord [idServiceRecord=" + idServiceRecord + "]";
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseUserCompanyServiceList{
		/*
		 * 
		 */
		
		private Long sr_idServiceRecord;
		private Long sr_idRider;
		private Long sr_idDriver;
		private Long sr_idStatusServiceRecord;
		private String sr_StatusDescription;
		private Long sr_idCity;
		private String sr_CityName;
		private Long sr_idFare;
		private Long sr_idFixedFare;
		private Long sr_serviceType;
		private String sr_pickUpLocation;
		private String sr_pickUpNeighborhood;
		private Double sr_pickUpLatitude;
		private Double sr_pickUpLongitude;
		private String sr_pickUpTime;
		private String sr_pickUpReference;
		private String sr_dropOffLocation;
		private Double sr_dropOffLatitude;
		private Double sr_dropOffLongitude;
		private String sr_dropOffTime;
		private Double sr_requestLatitude;
		private Double sr_requestLongitude;
		private Boolean sr_isFavoriteDriver;
		private String sr_appName;
		private Boolean r_isCompanyUser;
		private String sr_thirdPersonName;
		private String sr_createdDate;
		private String srs_pickupTime;
		private Long r_idRider;
		private String r_identification;
		private String r_username;
		private String r_names;
		private String r_lastNames;
		private String r_email;
		private String r_mobile;
		private String r_photoUrl;
		private Boolean r_status;
		private Long r_idUser;
		private Long r_idCountry;
		private String r_CountryName;
		private Long r_idFamilyRider;
		private Long r_limit;
		private Long uc_idDepartment;
		private String uc_DepartmentName;
		private Long d_idDriver;
		private String d_firstName;
		private String d_fathersLastName;
		private String d_username;
		private String d_photoUrl;
		private String d_mobile;
		private String d_driverLicense;
		private Long d_idUser;
		private Double d_rate;
		private Long srv_idServiceVoucher;
		private Long srv_idSelectedCreditCard;
		private Long srv_SelectedCreditCard_Type;
		private String srv_SelectedCreditCard_Number;
		private Long srv_idSelectedPaymentMethod;
		private String srv_SelectedPaymentMethod_Name;
		private Long srv_idServiceRecord;
		private Long srv_idUsedCreditCard;
		private Long srv_UsedCreditCard_Type;
		private String srv_UsedCreditCard_Number;
		private Long srv_idUsedPaymentMethod;
		private String srv_UsedPaymentMethod_Name;
		private Double srv_totalAmmount;
		private Double srv_distance;
		private Double srv_idleTime;
		private Boolean srv_voucherSended;
		private String srv_voucherSendedDate;
		private Double srv_serviceAmmount;
		private Double srv_appFeeAmmount;
		private Double srv_otherAmmount;
		private Double srv_taxAmmount;
		private String srv_createdDate;
		private String srv_totalAmmountFormatted;
		
		public ResponseUserCompanyServiceList() {
			// TODO Auto-generated constructor stub
		}

		public Long getSr_idServiceRecord() {
			return sr_idServiceRecord;
		}

		public void setSr_idServiceRecord(Long sr_idServiceRecord) {
			this.sr_idServiceRecord = sr_idServiceRecord;
		}

		public Long getSr_idRider() {
			return sr_idRider;
		}

		public void setSr_idRider(Long sr_idRider) {
			this.sr_idRider = sr_idRider;
		}

		public Long getSr_idDriver() {
			return sr_idDriver;
		}

		public void setSr_idDriver(Long sr_idDriver) {
			this.sr_idDriver = sr_idDriver;
		}

		public Long getSr_idStatusServiceRecord() {
			return sr_idStatusServiceRecord;
		}

		public void setSr_idStatusServiceRecord(Long sr_idStatusServiceRecord) {
			this.sr_idStatusServiceRecord = sr_idStatusServiceRecord;
		}

		public String getSr_StatusDescription() {
			return sr_StatusDescription;
		}

		public void setSr_StatusDescription(String sr_StatusDescription) {
			this.sr_StatusDescription = sr_StatusDescription;
		}

		public Long getSr_idCity() {
			return sr_idCity;
		}

		public void setSr_idCity(Long sr_idCity) {
			this.sr_idCity = sr_idCity;
		}

		public String getSr_CityName() {
			return sr_CityName;
		}

		public void setSr_CityName(String sr_CityName) {
			this.sr_CityName = sr_CityName;
		}

		public Long getSr_idFare() {
			return sr_idFare;
		}

		public void setSr_idFare(Long sr_idFare) {
			this.sr_idFare = sr_idFare;
		}

		public Long getSr_idFixedFare() {
			return sr_idFixedFare;
		}

		public void setSr_idFixedFare(Long sr_idFixedFare) {
			this.sr_idFixedFare = sr_idFixedFare;
		}

		public Long getSr_serviceType() {
			return sr_serviceType;
		}

		public void setSr_serviceType(Long sr_serviceType) {
			this.sr_serviceType = sr_serviceType;
		}

		public String getSr_pickUpLocation() {
			return sr_pickUpLocation;
		}

		public void setSr_pickUpLocation(String sr_pickUpLocation) {
			this.sr_pickUpLocation = sr_pickUpLocation;
		}

		public String getSr_pickUpNeighborhood() {
			return sr_pickUpNeighborhood;
		}

		public void setSr_pickUpNeighborhood(String sr_pickUpNeighborhood) {
			this.sr_pickUpNeighborhood = sr_pickUpNeighborhood;
		}

		public Double getSr_pickUpLatitude() {
			return sr_pickUpLatitude;
		}

		public void setSr_pickUpLatitude(Double sr_pickUpLatitude) {
			this.sr_pickUpLatitude = sr_pickUpLatitude;
		}

		public Double getSr_pickUpLongitude() {
			return sr_pickUpLongitude;
		}

		public void setSr_pickUpLongitude(Double sr_pickUpLongitude) {
			this.sr_pickUpLongitude = sr_pickUpLongitude;
		}

		public String getSr_pickUpTime() {
			return sr_pickUpTime;
		}

		public void setSr_pickUpTime(String sr_pickUpTime) {
			this.sr_pickUpTime = sr_pickUpTime;
		}

		public String getSr_pickUpReference() {
			return sr_pickUpReference;
		}

		public void setSr_pickUpReference(String sr_pickUpReference) {
			this.sr_pickUpReference = sr_pickUpReference;
		}

		public String getSr_dropOffLocation() {
			return sr_dropOffLocation;
		}

		public void setSr_dropOffLocation(String sr_dropOffLocation) {
			this.sr_dropOffLocation = sr_dropOffLocation;
		}

		public Double getSr_dropOffLatitude() {
			return sr_dropOffLatitude;
		}

		public void setSr_dropOffLatitude(Double sr_dropOffLatitude) {
			this.sr_dropOffLatitude = sr_dropOffLatitude;
		}

		public Double getSr_dropOffLongitude() {
			return sr_dropOffLongitude;
		}

		public void setSr_dropOffLongitude(Double sr_dropOffLongitude) {
			this.sr_dropOffLongitude = sr_dropOffLongitude;
		}

		public String getSr_dropOffTime() {
			return sr_dropOffTime;
		}

		public void setSr_dropOffTime(String sr_dropOffTime) {
			this.sr_dropOffTime = sr_dropOffTime;
		}

		public Double getSr_requestLatitude() {
			return sr_requestLatitude;
		}

		public void setSr_requestLatitude(Double sr_requestLatitude) {
			this.sr_requestLatitude = sr_requestLatitude;
		}

		public Double getSr_requestLongitude() {
			return sr_requestLongitude;
		}

		public void setSr_requestLongitude(Double sr_requestLongitude) {
			this.sr_requestLongitude = sr_requestLongitude;
		}

		public Boolean getSr_isFavoriteDriver() {
			return sr_isFavoriteDriver;
		}

		public void setSr_isFavoriteDriver(Boolean sr_isFavoriteDriver) {
			this.sr_isFavoriteDriver = sr_isFavoriteDriver;
		}

		public String getSr_appName() {
			return sr_appName;
		}

		public void setSr_appName(String sr_appName) {
			this.sr_appName = sr_appName;
		}

		public Boolean getR_isCompanyUser() {
			return r_isCompanyUser;
		}

		public void setR_isCompanyUser(Boolean r_isCompanyUser) {
			this.r_isCompanyUser = r_isCompanyUser;
		}

		public String getSr_thirdPersonName() {
			return sr_thirdPersonName;
		}

		public void setSr_thirdPersonName(String sr_thirdPersonName) {
			this.sr_thirdPersonName = sr_thirdPersonName;
		}

		public String getSr_createdDate() {
			return sr_createdDate;
		}

		public void setSr_createdDate(String sr_createdDate) {
			this.sr_createdDate = sr_createdDate;
		}

		public String getSrs_pickupTime() {
			return srs_pickupTime;
		}

		public void setSrs_pickupTime(String srs_pickupTime) {
			this.srs_pickupTime = srs_pickupTime;
		}

		public Long getR_idRider() {
			return r_idRider;
		}

		public void setR_idRider(Long r_idRider) {
			this.r_idRider = r_idRider;
		}

		public String getR_identification() {
			return r_identification;
		}

		public void setR_identification(String r_identification) {
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

		public Boolean getR_status() {
			return r_status;
		}

		public void setR_status(Boolean r_status) {
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

		public Long getR_idFamilyRider() {
			return r_idFamilyRider;
		}

		public void setR_idFamilyRider(Long r_idFamilyRider) {
			this.r_idFamilyRider = r_idFamilyRider;
		}

		public Long getR_limit() {
			return r_limit;
		}

		public void setR_limit(Long r_limit) {
			this.r_limit = r_limit;
		}

		public Long getUc_idDepartment() {
			return uc_idDepartment;
		}

		public void setUc_idDepartment(Long uc_idDepartment) {
			this.uc_idDepartment = uc_idDepartment;
		}

		public String getUc_DepartmentName() {
			return uc_DepartmentName;
		}

		public void setUc_DepartmentName(String uc_DepartmentName) {
			this.uc_DepartmentName = uc_DepartmentName;
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

		public Double getD_rate() {
			return d_rate;
		}

		public void setD_rate(Double d_rate) {
			this.d_rate = d_rate;
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

		public Long getSrv_SelectedCreditCard_Type() {
			return srv_SelectedCreditCard_Type;
		}

		public void setSrv_SelectedCreditCard_Type(Long srv_SelectedCreditCard_Type) {
			this.srv_SelectedCreditCard_Type = srv_SelectedCreditCard_Type;
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

		public Double getSrv_totalAmmount() {
			return srv_totalAmmount;
		}

		public void setSrv_totalAmmount(Double srv_totalAmmount) {
			this.srv_totalAmmount = srv_totalAmmount;
		}

		public Double getSrv_distance() {
			return srv_distance;
		}

		public void setSrv_distance(Double srv_distance) {
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

		public Double getSrv_serviceAmmount() {
			return srv_serviceAmmount;
		}

		public void setSrv_serviceAmmount(Double srv_serviceAmmount) {
			this.srv_serviceAmmount = srv_serviceAmmount;
		}

		public Double getSrv_appFeeAmmount() {
			return srv_appFeeAmmount;
		}

		public void setSrv_appFeeAmmount(Double srv_appFeeAmmount) {
			this.srv_appFeeAmmount = srv_appFeeAmmount;
		}

		public Double getSrv_otherAmmount() {
			return srv_otherAmmount;
		}

		public void setSrv_otherAmmount(Double srv_otherAmmount) {
			this.srv_otherAmmount = srv_otherAmmount;
		}

		public Double getSrv_taxAmmount() {
			return srv_taxAmmount;
		}

		public void setSrv_taxAmmount(Double srv_taxAmmount) {
			this.srv_taxAmmount = srv_taxAmmount;
		}

		public String getSrv_createdDate() {
			return srv_createdDate;
		}

		public void setSrv_createdDate(String srv_createdDate) {
			this.srv_createdDate = srv_createdDate;
		}

		public String getSrv_totalAmmountFormatted() {
			return srv_totalAmmountFormatted;
		}

		public void setSrv_totalAmmountFormatted(String srv_totalAmmountFormatted) {
			this.srv_totalAmmountFormatted = srv_totalAmmountFormatted;
		}

		@Override
		public String toString() {
			return "ResponseUserCompanyServiceList [sr_idServiceRecord=" + sr_idServiceRecord + ", sr_idRider="
					+ sr_idRider + ", sr_idDriver=" + sr_idDriver + ", sr_idStatusServiceRecord="
					+ sr_idStatusServiceRecord + ", sr_StatusDescription=" + sr_StatusDescription + ", sr_idCity="
					+ sr_idCity + ", sr_CityName=" + sr_CityName + ", sr_idFare=" + sr_idFare + ", sr_idFixedFare="
					+ sr_idFixedFare + ", sr_serviceType=" + sr_serviceType + ", sr_pickUpLocation=" + sr_pickUpLocation
					+ ", sr_pickUpNeighborhood=" + sr_pickUpNeighborhood + ", sr_pickUpLatitude=" + sr_pickUpLatitude
					+ ", sr_pickUpLongitude=" + sr_pickUpLongitude + ", sr_pickUpTime=" + sr_pickUpTime
					+ ", sr_pickUpReference=" + sr_pickUpReference + ", sr_dropOffLocation=" + sr_dropOffLocation
					+ ", sr_dropOffLatitude=" + sr_dropOffLatitude + ", sr_dropOffLongitude=" + sr_dropOffLongitude
					+ ", sr_dropOffTime=" + sr_dropOffTime + ", sr_requestLatitude=" + sr_requestLatitude
					+ ", sr_requestLongitude=" + sr_requestLongitude + ", sr_isFavoriteDriver=" + sr_isFavoriteDriver
					+ ", sr_appName=" + sr_appName + ", r_isCompanyUser=" + r_isCompanyUser + ", sr_thirdPersonName="
					+ sr_thirdPersonName + ", sr_createdDate=" + sr_createdDate + ", srs_pickupTime=" + srs_pickupTime
					+ ", r_idRider=" + r_idRider + ", r_identification=" + r_identification + ", r_username="
					+ r_username + ", r_names=" + r_names + ", r_lastNames=" + r_lastNames + ", r_email=" + r_email
					+ ", r_mobile=" + r_mobile + ", r_photoUrl=" + r_photoUrl + ", r_status=" + r_status + ", r_idUser="
					+ r_idUser + ", r_idCountry=" + r_idCountry + ", r_CountryName=" + r_CountryName
					+ ", r_idFamilyRider=" + r_idFamilyRider + ", r_limit=" + r_limit + ", uc_idDepartment="
					+ uc_idDepartment + ", uc_DepartmentName=" + uc_DepartmentName + ", d_idDriver=" + d_idDriver
					+ ", d_firstName=" + d_firstName + ", d_fathersLastName=" + d_fathersLastName + ", d_username="
					+ d_username + ", d_photoUrl=" + d_photoUrl + ", d_mobile=" + d_mobile + ", d_driverLicense="
					+ d_driverLicense + ", d_idUser=" + d_idUser + ", d_rate=" + d_rate + ", srv_idServiceVoucher="
					+ srv_idServiceVoucher + ", srv_idSelectedCreditCard=" + srv_idSelectedCreditCard
					+ ", srv_SelectedCreditCard_Type=" + srv_SelectedCreditCard_Type
					+ ", srv_SelectedCreditCard_Number=" + srv_SelectedCreditCard_Number
					+ ", srv_idSelectedPaymentMethod=" + srv_idSelectedPaymentMethod
					+ ", srv_SelectedPaymentMethod_Name=" + srv_SelectedPaymentMethod_Name + ", srv_idServiceRecord="
					+ srv_idServiceRecord + ", srv_idUsedCreditCard=" + srv_idUsedCreditCard
					+ ", srv_UsedCreditCard_Type=" + srv_UsedCreditCard_Type + ", srv_UsedCreditCard_Number="
					+ srv_UsedCreditCard_Number + ", srv_idUsedPaymentMethod=" + srv_idUsedPaymentMethod
					+ ", srv_UsedPaymentMethod_Name=" + srv_UsedPaymentMethod_Name + ", srv_totalAmmount="
					+ srv_totalAmmount + ", srv_distance=" + srv_distance + ", srv_idleTime=" + srv_idleTime
					+ ", srv_voucherSended=" + srv_voucherSended + ", srv_voucherSendedDate=" + srv_voucherSendedDate
					+ ", srv_serviceAmmount=" + srv_serviceAmmount + ", srv_appFeeAmmount=" + srv_appFeeAmmount
					+ ", srv_otherAmmount=" + srv_otherAmmount + ", srv_taxAmmount=" + srv_taxAmmount
					+ ", srv_createdDate=" + srv_createdDate + "]";
		}
		
	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataCheckServiceRecord{

		private Integer idServiceStatus;
		private Integer serviceType;
		private Long idDriver;
		private Double driverLatitude;
		private Double driverLongitude;
		private String driverName;
		private String driverMobileNumber;
		private Double driverScore;
		private String driverLicense;
		private String driverPhotoUrl;
		private String taxiCorpName;
		private String carColor;
		private String carBrand;
		private String carModel;
		private String carPlate;
		private Long idRider;
		private String riderName;
		private String riderPhotoUrl;
		private String riderMobileNumber;
		private Double pickupLatitude;
		private Double pickupLongitude;
		private String pickupDateTime;
		private String pickupLocation;
		private Double dropoffLatitude;
		private Double dropoffLongitude;
		private String dropoffLocation;
		private String ServiceStatusName;
		private String formatPickupDateTime;
		
		public ResponseDataCheckServiceRecord() {
			// TODO Auto-generated constructor stub
		}

		public Integer getIdServiceStatus() {
			return idServiceStatus;
		}

		public void setIdServiceStatus(Integer idServiceStatus) {
			this.idServiceStatus = idServiceStatus;
		}

		public Integer getServiceType() {
			return serviceType;
		}

		public void setServiceType(Integer serviceType) {
			this.serviceType = serviceType;
		}

		public Long getIdDriver() {
			return idDriver;
		}

		public void setIdDriver(Long idDriver) {
			this.idDriver = idDriver;
		}

		public Double getDriverLatitude() {
			return driverLatitude;
		}

		public void setDriverLatitude(Double driverLatitude) {
			this.driverLatitude = driverLatitude;
		}

		public Double getDriverLongitude() {
			return driverLongitude;
		}

		public void setDriverLongitude(Double driverLongitude) {
			this.driverLongitude = driverLongitude;
		}

		public String getDriverName() {
			return driverName;
		}

		public void setDriverName(String driverName) {
			this.driverName = driverName;
		}

		public String getDriverMobileNumber() {
			return driverMobileNumber;
		}

		public void setDriverMobileNumber(String driverMobileNumber) {
			this.driverMobileNumber = driverMobileNumber;
		}

		public Double getDriverScore() {
			return driverScore;
		}

		public void setDriverScore(Double driverScore) {
			this.driverScore = driverScore;
		}

		public String getDriverLicense() {
			return driverLicense;
		}

		public void setDriverLicense(String driverLicense) {
			this.driverLicense = driverLicense;
		}

		public String getDriverPhotoUrl() {
			return driverPhotoUrl;
		}

		public void setDriverPhotoUrl(String driverPhotoUrl) {
			this.driverPhotoUrl = driverPhotoUrl;
		}

		public String getTaxiCorpName() {
			return taxiCorpName;
		}

		public void setTaxiCorpName(String taxiCorpName) {
			this.taxiCorpName = taxiCorpName;
		}

		public String getCarColor() {
			return carColor;
		}

		public void setCarColor(String carColor) {
			this.carColor = carColor;
		}

		public String getCarBrand() {
			return carBrand;
		}

		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
		}

		public String getCarModel() {
			return carModel;
		}

		public void setCarModel(String carModel) {
			this.carModel = carModel;
		}

		public String getCarPlate() {
			return carPlate;
		}

		public void setCarPlate(String carPlate) {
			this.carPlate = carPlate;
		}

		public Long getIdRider() {
			return idRider;
		}

		public void setIdRider(Long idRider) {
			this.idRider = idRider;
		}

		public String getRiderName() {
			return riderName;
		}

		public void setRiderName(String riderName) {
			this.riderName = riderName;
		}

		public String getRiderPhotoUrl() {
			return riderPhotoUrl;
		}

		public void setRiderPhotoUrl(String riderPhotoUrl) {
			this.riderPhotoUrl = riderPhotoUrl;
		}

		public String getRiderMobileNumber() {
			return riderMobileNumber;
		}

		public void setRiderMobileNumber(String riderMobileNumber) {
			this.riderMobileNumber = riderMobileNumber;
		}

		public Double getPickupLatitude() {
			return pickupLatitude;
		}

		public void setPickupLatitude(Double pickupLatitude) {
			this.pickupLatitude = pickupLatitude;
		}

		public Double getPickupLongitude() {
			return pickupLongitude;
		}

		public void setPickupLongitude(Double pickupLongitude) {
			this.pickupLongitude = pickupLongitude;
		}

		public String getPickupDateTime() {
			return pickupDateTime;
		}

		public void setPickupDateTime(String pickupDateTime) {
			this.pickupDateTime = pickupDateTime;
		}

		public String getPickupLocation() {
			return pickupLocation;
		}

		public void setPickupLocation(String pickupLocation) {
			this.pickupLocation = pickupLocation;
		}

		public Double getDropoffLatitude() {
			return dropoffLatitude;
		}

		public void setDropoffLatitude(Double dropoffLatitude) {
			this.dropoffLatitude = dropoffLatitude;
		}

		public Double getDropoffLongitude() {
			return dropoffLongitude;
		}

		public void setDropoffLongitude(Double dropoffLongitude) {
			this.dropoffLongitude = dropoffLongitude;
		}

		public String getDropoffLocation() {
			return dropoffLocation;
		}

		public void setDropoffLocation(String dropoffLocation) {
			this.dropoffLocation = dropoffLocation;
		}

		public String getServiceStatusName() {
			return ServiceStatusName;
		}

		public void setServiceStatusName(String serviceStatusName) {
			ServiceStatusName = serviceStatusName;
		}

		public String getFormatPickupDateTime() {
			return formatPickupDateTime;
		}

		public void setFormatPickupDateTime(String formatPickupDateTime) {
			this.formatPickupDateTime = formatPickupDateTime;
		}

		@Override
		public String toString() {
			return "ResponseDataCheckServiceRecord [idServiceStatus=" + idServiceStatus + ", serviceType=" + serviceType
					+ ", idDriver=" + idDriver + ", driverLatitude=" + driverLatitude + ", driverLongitude="
					+ driverLongitude + ", driverName=" + driverName + ", driverMobileNumber=" + driverMobileNumber
					+ ", driverScore=" + driverScore + ", driverLicense=" + driverLicense + ", driverPhotoUrl="
					+ driverPhotoUrl + ", taxiCorpName=" + taxiCorpName + ", carColor=" + carColor + ", carBrand="
					+ carBrand + ", carModel=" + carModel + ", carPlate=" + carPlate + ", idRider=" + idRider
					+ ", riderName=" + riderName + ", riderPhotoUrl=" + riderPhotoUrl + ", riderMobileNumber="
					+ riderMobileNumber + ", pickupLatitude=" + pickupLatitude + ", pickupLongitude=" + pickupLongitude
					+ ", pickupDateTime=" + pickupDateTime + ", pickupLocation=" + pickupLocation + ", dropoffLatitude="
					+ dropoffLatitude + ", dropoffLongitude=" + dropoffLongitude + ", dropoffLocation="
					+ dropoffLocation + ", ServiceStatusName=" + ServiceStatusName + ", formatPickupDateTime="
					+ formatPickupDateTime + "]";
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataMultipleService{

		private Long idServiceRecord;
		private Integer idServiceStatus;
		private String serviceStatusName;
		private String riderName;
		private String pickupLocation;
		
		public ResponseDataMultipleService() {
			// TODO Auto-generated constructor stub
		}

		public Long getIdServiceRecord() {
			return idServiceRecord;
		}

		public void setIdServiceRecord(Long idServiceRecord) {
			this.idServiceRecord = idServiceRecord;
		}

		public Integer getIdServiceStatus() {
			return idServiceStatus;
		}

		public void setIdServiceStatus(Integer idServiceStatus) {
			this.idServiceStatus = idServiceStatus;
		}

		public String getServiceStatusName() {
			return serviceStatusName;
		}

		public void setServiceStatusName(String serviceStatusName) {
			this.serviceStatusName = serviceStatusName;
		}

		public String getRiderName() {
			return riderName;
		}

		public void setRiderName(String riderName) {
			this.riderName = riderName;
		}

		public String getPickupLocation() {
			return pickupLocation;
		}

		public void setPickupLocation(String pickupLocation) {
			this.pickupLocation = pickupLocation;
		}

		@Override
		public String toString() {
			return "ResponseDataMultipleService [idServiceRecord=" + idServiceRecord + ", idServiceStatus="
					+ idServiceStatus + ", serviceStatusName=" + serviceStatusName + ", riderName=" + riderName
					+ ", pickupLocation=" + pickupLocation + "]";
		}		
		
	}

	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataScheduledService{

		private Long idServiceRecord;
		private Integer idServiceStatus;
		private String pickupDateTime;
		private String pickupLatitude;
		private String pickupLongitude;
		private String pickupLocation;
		private String pickupLocationReference;
		private String pickupLocationNeighborhood;
		private String idDriver;
		private String driverName;
		private String driverScore;
		private String driverPhotoUrl;
		private String driverMobilePhone;
		private String taxiCompany;
		private String carBrand;
		private String carModel;
		private String carPlate;
		
		public ResponseDataScheduledService() {
			// TODO Auto-generated constructor stub
		}

		public Long getIdServiceRecord() {
			return idServiceRecord;
		}

		public void setIdServiceRecord(Long idServiceRecord) {
			this.idServiceRecord = idServiceRecord;
		}

		public Integer getIdServiceStatus() {
			return idServiceStatus;
		}

		public void setIdServiceStatus(Integer idServiceStatus) {
			this.idServiceStatus = idServiceStatus;
		}

		public String getPickupDateTime() {
			return pickupDateTime;
		}

		public void setPickupDateTime(String pickupDateTime) {
			this.pickupDateTime = pickupDateTime;
		}

		public String getPickupLatitude() {
			return pickupLatitude;
		}

		public void setPickupLatitude(String pickupLatitude) {
			this.pickupLatitude = pickupLatitude;
		}

		public String getPickupLongitude() {
			return pickupLongitude;
		}

		public void setPickupLongitude(String pickupLongitude) {
			this.pickupLongitude = pickupLongitude;
		}

		public String getPickupLocation() {
			return pickupLocation;
		}

		public void setPickupLocation(String pickupLocation) {
			this.pickupLocation = pickupLocation;
		}

		public String getPickupLocationReference() {
			return pickupLocationReference;
		}

		public void setPickupLocationReference(String pickupLocationReference) {
			this.pickupLocationReference = pickupLocationReference;
		}

		public String getPickupLocationNeighborhood() {
			return pickupLocationNeighborhood;
		}

		public void setPickupLocationNeighborhood(String pickupLocationNeighborhood) {
			this.pickupLocationNeighborhood = pickupLocationNeighborhood;
		}

		public String getIdDriver() {
			return idDriver;
		}

		public void setIdDriver(String idDriver) {
			this.idDriver = idDriver;
		}

		public String getDriverName() {
			return driverName;
		}

		public void setDriverName(String driverName) {
			this.driverName = driverName;
		}

		public String getDriverScore() {
			return driverScore;
		}

		public void setDriverScore(String driverScore) {
			this.driverScore = driverScore;
		}

		public String getDriverPhotoUrl() {
			return driverPhotoUrl;
		}

		public void setDriverPhotoUrl(String driverPhotoUrl) {
			this.driverPhotoUrl = driverPhotoUrl;
		}

		public String getDriverMobilePhone() {
			return driverMobilePhone;
		}

		public void setDriverMobilePhone(String driverMobilePhone) {
			this.driverMobilePhone = driverMobilePhone;
		}

		public String getTaxiCompany() {
			return taxiCompany;
		}

		public void setTaxiCompany(String taxiCompany) {
			this.taxiCompany = taxiCompany;
		}

		public String getCarBrand() {
			return carBrand;
		}

		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
		}

		public String getCarModel() {
			return carModel;
		}

		public void setCarModel(String carModel) {
			this.carModel = carModel;
		}

		public String getCarPlate() {
			return carPlate;
		}

		public void setCarPlate(String carPlate) {
			this.carPlate = carPlate;
		}

		@Override
		public String toString() {
			return "ResponseDataScheduledService [idServiceRecord=" + idServiceRecord + ", idServiceStatus="
					+ idServiceStatus + ", pickupDateTime=" + pickupDateTime + ", pickupLatitude=" + pickupLatitude
					+ ", pickupLongitude=" + pickupLongitude + ", pickupLocation=" + pickupLocation
					+ ", pickupLocationReference=" + pickupLocationReference + ", pickupLocationNeighborhood="
					+ pickupLocationNeighborhood + ", idDriver=" + idDriver + ", driverName=" + driverName
					+ ", driverScore=" + driverScore + ", driverPhotoUrl=" + driverPhotoUrl + ", driverMobilePhone="
					+ driverMobilePhone + ", taxiCompany=" + taxiCompany + ", carBrand=" + carBrand + ", carModel="
					+ carModel + ", carPlate=" + carPlate + "]";
		}			
		
	}

}
