package ec.com.taxinet.webapp.form.model;

public class ServiceRecordForm {

	private Integer serviceType;
	private Boolean isFavoriteSiteOrigin;
	private String pickUpLocation;
	private Double latOrigin;
	private Double lngOrigin;
	private String countryOrigin;
	private String stateOrigin;
	private String cityOrigin;
	private Long idFavoriteSiteOrigin;
	private String pickUpReference;
	private String pickUpDate;
	private String pickUpTime;
	private Boolean isFavoriteSiteDestination;
	private String dropOffLocation;
	private Double latDestination;
	private Double lngDestination;
	private Long idFavoriteSiteDestination;
	private Boolean isFavoriteDriver;
	private Long idDriver;
	private Long creditCard;
	private Integer idPaymentMethod;
	private String thirdPersonName;
	
	public ServiceRecordForm(){
		
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public Boolean getIsFavoriteSiteOrigin() {
		return isFavoriteSiteOrigin;
	}

	public void setIsFavoriteSiteOrigin(Boolean isFavoriteSiteOrigin) {
		this.isFavoriteSiteOrigin = isFavoriteSiteOrigin;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public Double getLatOrigin() {
		return latOrigin;
	}

	public void setLatOrigin(Double latOrigin) {
		this.latOrigin = latOrigin;
	}

	public Double getLngOrigin() {
		return lngOrigin;
	}

	public void setLngOrigin(Double lngOrigin) {
		this.lngOrigin = lngOrigin;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public String getStateOrigin() {
		return stateOrigin;
	}

	public void setStateOrigin(String stateOrigin) {
		this.stateOrigin = stateOrigin;
	}

	public String getCityOrigin() {
		return cityOrigin;
	}

	public void setCityOrigin(String cityOrigin) {
		this.cityOrigin = cityOrigin;
	}

	public Long getIdFavoriteSiteOrigin() {
		return idFavoriteSiteOrigin;
	}

	public void setIdFavoriteSiteOrigin(Long idFavoriteSiteOrigin) {
		this.idFavoriteSiteOrigin = idFavoriteSiteOrigin;
	}

	public String getPickUpReference() {
		return pickUpReference;
	}

	public void setPickUpReference(String pickUpReference) {
		this.pickUpReference = pickUpReference;
	}

	public String getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(String pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public String getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public Boolean getIsFavoriteSiteDestination() {
		return isFavoriteSiteDestination;
	}

	public void setIsFavoriteSiteDestination(Boolean isFavoriteSiteDestination) {
		this.isFavoriteSiteDestination = isFavoriteSiteDestination;
	}

	public String getDropOffLocation() {
		return dropOffLocation;
	}

	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	public Double getLatDestination() {
		return latDestination;
	}

	public void setLatDestination(Double latDestination) {
		this.latDestination = latDestination;
	}

	public Double getLngDestination() {
		return lngDestination;
	}

	public void setLngDestination(Double lngDestination) {
		this.lngDestination = lngDestination;
	}

	public Long getIdFavoriteSiteDestination() {
		return idFavoriteSiteDestination;
	}

	public void setIdFavoriteSiteDestination(Long idFavoriteSiteDestination) {
		this.idFavoriteSiteDestination = idFavoriteSiteDestination;
	}

	public Boolean getIsFavoriteDriver() {
		return isFavoriteDriver;
	}

	public void setIsFavoriteDriver(Boolean isFavoriteDriver) {
		this.isFavoriteDriver = isFavoriteDriver;
	}

	public Long getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(Long idDriver) {
		this.idDriver = idDriver;
	}

	public Long getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(Long creditCard) {
		this.creditCard = creditCard;
	}

	public Integer getIdPaymentMethod() {
		return idPaymentMethod;
	}

	public void setIdPaymentMethod(Integer idPaymentMethod) {
		this.idPaymentMethod = idPaymentMethod;
	}

	public String getThirdPersonName() {
		return thirdPersonName;
	}

	public void setThirdPersonName(String thirdPersonName) {
		this.thirdPersonName = thirdPersonName;
	}

	@Override
	public String toString() {
		return "ServiceRecordForm [serviceType=" + serviceType + ", isFavoriteSiteOrigin=" + isFavoriteSiteOrigin
				+ ", pickUpLocation=" + pickUpLocation + ", latOrigin=" + latOrigin + ", lngOrigin=" + lngOrigin
				+ ", countryOrigin=" + countryOrigin + ", stateOrigin=" + stateOrigin + ", cityOrigin=" + cityOrigin
				+ ", idFavoriteSiteOrigin=" + idFavoriteSiteOrigin + ", pickUpReference=" + pickUpReference
				+ ", pickUpDate=" + pickUpDate + ", pickUpTime=" + pickUpTime + ", isFavoriteSiteDestination="
				+ isFavoriteSiteDestination + ", dropOffLocation=" + dropOffLocation + ", latDestination="
				+ latDestination + ", lngDestination=" + lngDestination + ", idFavoriteSiteDestination="
				+ idFavoriteSiteDestination + ", isFavoriteDriver=" + isFavoriteDriver + ", idDriver=" + idDriver
				+ ", creditCard=" + creditCard + ", idPaymentMethod=" + idPaymentMethod + ", thirdPersonName="
				+ thirdPersonName + "]";
	}

	public static class ServiceRecordResponse{
		
		private Long idRider;
		private Integer serviceType;
		private String pickupCityName;
		private String pickupStateName;
		private String pickupCountryName;
		private String pickupDateTime;
		private Double pickupLatitude;
		private Double pickupLongitude;
		private String pickupLocation;
		private String pickupNeighborhood;
		private String pickupReference;
		private Double dropoffLatitude;
		private Double dropoffLongitude;
		private String dropoffLocation;
		private Double requestLatitude;
		private Double requestLongitude;
		private Boolean isFavoriteDriver;
		private Long idDriver;
		private Integer idApp;
		private Boolean isCompanyUser;
		private Long idCreditCard;
		private Integer idPaymentMethod;
		private String riderName;
		
		public ServiceRecordResponse(){
			
		}

		public Long getIdRider() {
			return idRider;
		}

		public void setIdRider(Long idRider) {
			this.idRider = idRider;
		}

		public Integer getServiceType() {
			return serviceType;
		}

		public void setServiceType(Integer serviceType) {
			this.serviceType = serviceType;
		}

		public String getPickupCityName() {
			return pickupCityName;
		}

		public void setPickupCityName(String pickupCityName) {
			this.pickupCityName = pickupCityName;
		}

		public String getPickupStateName() {
			return pickupStateName;
		}

		public void setPickupStateName(String pickupStateName) {
			this.pickupStateName = pickupStateName;
		}

		public String getPickupCountryName() {
			return pickupCountryName;
		}

		public void setPickupCountryName(String pickupCountryName) {
			this.pickupCountryName = pickupCountryName;
		}

		public String getPickupDateTime() {
			return pickupDateTime;
		}

		public void setPickupDateTime(String pickupDateTime) {
			this.pickupDateTime = pickupDateTime;
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

		public String getPickupLocation() {
			return pickupLocation;
		}

		public void setPickupLocation(String pickupLocation) {
			this.pickupLocation = pickupLocation;
		}

		public String getPickupNeighborhood() {
			return pickupNeighborhood;
		}

		public void setPickupNeighborhood(String pickupNeighborhood) {
			this.pickupNeighborhood = pickupNeighborhood;
		}

		public String getPickupReference() {
			return pickupReference;
		}

		public void setPickupReference(String pickupReference) {
			this.pickupReference = pickupReference;
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

		public Boolean getIsFavoriteDriver() {
			return isFavoriteDriver;
		}

		public void setIsFavoriteDriver(Boolean isFavoriteDriver) {
			this.isFavoriteDriver = isFavoriteDriver;
		}

		public Long getIdDriver() {
			return idDriver;
		}

		public void setIdDriver(Long idDriver) {
			this.idDriver = idDriver;
		}

		public Integer getIdApp() {
			return idApp;
		}

		public void setIdApp(Integer idApp) {
			this.idApp = idApp;
		}

		public Boolean getIsCompanyUser() {
			return isCompanyUser;
		}

		public void setIsCompanyUser(Boolean isCompanyUser) {
			this.isCompanyUser = isCompanyUser;
		}

		public Long getIdCreditCard() {
			return idCreditCard;
		}

		public void setIdCreditCard(Long idCreditCard) {
			this.idCreditCard = idCreditCard;
		}

		public Integer getIdPaymentMethod() {
			return idPaymentMethod;
		}

		public void setIdPaymentMethod(Integer idPaymentMethod) {
			this.idPaymentMethod = idPaymentMethod;
		}

		public String getRiderName() {
			return riderName;
		}

		public void setRiderName(String riderName) {
			this.riderName = riderName;
		}

		@Override
		public String toString() {
			return "ServiceRecordResponse [idRider=" + idRider + ", serviceType=" + serviceType + ", pickupCityName="
					+ pickupCityName + ", pickupStateName=" + pickupStateName + ", pickupCountryName="
					+ pickupCountryName + ", pickupDateTime=" + pickupDateTime + ", pickupLatitude=" + pickupLatitude
					+ ", pickupLongitude=" + pickupLongitude + ", pickupLocation=" + pickupLocation
					+ ", pickupNeighborhood=" + pickupNeighborhood + ", pickupReference=" + pickupReference
					+ ", dropoffLatitude=" + dropoffLatitude + ", dropoffLongitude=" + dropoffLongitude
					+ ", dropoffLocation=" + dropoffLocation + ", requestLatitude=" + requestLatitude
					+ ", requestLongitude=" + requestLongitude + ", isFavoriteDriver=" + isFavoriteDriver
					+ ", idDriver=" + idDriver + ", idApp=" + idApp + ", isCompanyUser=" + isCompanyUser
					+ ", idCreditCard=" + idCreditCard + ", idPaymentMethod=" + idPaymentMethod + ", riderName="
					+ riderName + "]";
		}
		
	}

	public static class CancelServiceRecordResquest{
		
		private String comment;
		private Long idServiceRecord;
		private Integer idStatusServiceRecord;
		
		public CancelServiceRecordResquest(){
			
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Long getIdServiceRecord() {
			return idServiceRecord;
		}

		public void setIdServiceRecord(Long idServiceRecord) {
			this.idServiceRecord = idServiceRecord;
		}

		public Integer getIdStatusServiceRecord() {
			return idStatusServiceRecord;
		}

		public void setIdStatusServiceRecord(Integer idStatusServiceRecord) {
			this.idStatusServiceRecord = idStatusServiceRecord;
		}

		@Override
		public String toString() {
			return "cancelServiceRecordResquest [comment=" + comment + ", idServiceRecord=" + idServiceRecord
					+ ", idStatusServiceRecord=" + idStatusServiceRecord + "]";
		}
		
	}

	public static class SendPushNotificationResquest{
		/*
		 * 
		 */
		private String data;
		private Long idDriver;
		private Long idRider;
		private String message;
		private String title;
		private Integer user;
		
		public SendPushNotificationResquest(){
			
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Long getIdDriver() {
			return idDriver;
		}

		public void setIdDriver(Long idDriver) {
			this.idDriver = idDriver;
		}

		public Long getIdRider() {
			return idRider;
		}

		public void setIdRider(Long idRider) {
			this.idRider = idRider;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Integer getUser() {
			return user;
		}

		public void setUser(Integer user) {
			this.user = user;
		}

		@Override
		public String toString() {
			return "SendPushNotificationResquest [data=" + data + ", idDriver=" + idDriver + ", idRider=" + idRider
					+ ", message=" + message + ", title=" + title + ", user=" + user + "]";
		}

	}

	public static class CheckServiceRecordResquest{
		
		private Long idServiceRecord;
		
		public CheckServiceRecordResquest(){
			
		}

		public Long getIdServiceRecord() {
			return idServiceRecord;
		}

		public void setIdServiceRecord(Long idServiceRecord) {
			this.idServiceRecord = idServiceRecord;
		}

		@Override
		public String toString() {
			return "CheckServiceRecordResquest [idServiceRecord=" + idServiceRecord + "]";
		}
		
	}
	
	
}
