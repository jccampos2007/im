package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DriversLocation implements Serializable {
	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;	
	private Long idDriver;
	private String firstName;
	private String fathersLastName;
	private String photoUrl;
	private String mobile;
	private String driverLicense;
	private Integer statusDriver;
	private Boolean isPanic;
	private Long idUser;
	private Long idHomeEstate;
	private String homeEstateName;
	private Long idHomeCityCatalog;
	private String homeCityName;
	private Long rate;
	private Double amount;
	private Long idDriverLocation;
	private Long idCityCatalog;
	private String cityName;
	private Double latitude;
	private Double longitude;
	private String sector;
	private Long modifiedDate;
	private String formatModifiedDate;
	private String username;
	private String vehiclePlate;
	
	public DriversLocation(){
		
	}

	public Long getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(Long idDriver) {
		this.idDriver = idDriver;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFathersLastName() {
		return fathersLastName;
	}

	public void setFathersLastName(String fathersLastName) {
		this.fathersLastName = fathersLastName;
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

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
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

	public String getHomeEstateName() {
		return homeEstateName;
	}

	public void setHomeEstateName(String homeEstateName) {
		this.homeEstateName = homeEstateName;
	}

	public Long getIdHomeCityCatalog() {
		return idHomeCityCatalog;
	}

	public void setIdHomeCityCatalog(Long idHomeCityCatalog) {
		this.idHomeCityCatalog = idHomeCityCatalog;
	}

	public String getHomeCityName() {
		return homeCityName;
	}

	public void setHomeCityName(String homeCityName) {
		this.homeCityName = homeCityName;
	}

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getIdDriverLocation() {
		return idDriverLocation;
	}

	public void setIdDriverLocation(Long idDriverLocation) {
		this.idDriverLocation = idDriverLocation;
	}

	public Long getIdCityCatalog() {
		return idCityCatalog;
	}

	public void setIdCityCatalog(Long idCityCatalog) {
		this.idCityCatalog = idCityCatalog;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Long getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Long modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getFormatModifiedDate() {
		return formatModifiedDate;
	}

	public void setFormatModifiedDate(String formatModifiedDate) {
		this.formatModifiedDate = formatModifiedDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DriversLocation [idDriver=" + idDriver + ", firstName=" + firstName + ", fathersLastName="
				+ fathersLastName + ", photoUrl=" + photoUrl + ", mobile=" + mobile + ", driverLicense=" + driverLicense
				+ ", statusDriver=" + statusDriver + ", isPanic=" + isPanic + ", idUser=" + idUser + ", idHomeEstate="
				+ idHomeEstate + ", homeEstateName=" + homeEstateName + ", idHomeCityCatalog=" + idHomeCityCatalog
				+ ", homeCityName=" + homeCityName + ", rate=" + rate + ", amount=" + amount + ", idDriverLocation="
				+ idDriverLocation + ", idCityCatalog=" + idCityCatalog + ", cityName=" + cityName + ", latitude="
				+ latitude + ", longitude=" + longitude + ", sector=" + sector + ", modifiedDate=" + modifiedDate
				+ ", formatModifiedDate=" + formatModifiedDate + ", username=" + username + ", vehiclePlate="
				+ vehiclePlate + "]";
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class RequestDriversLocationForm{	
		/*
		 * {
			  "aditionalData": false,
			  "cityName": "guayaquil",
			  "countryName": "ecuador",
			  "driverStatus": 0,
			  "idCityCatalog": 0,
			  "idDriver": 0,
			  "idTaxiCorp": 0,
			  "latitude": 0,
			  "longitude": 0,
			  "stateName": "guayas"
			}
		 */
		
		public RequestDriversLocationForm(){
			
		}
		
		private Boolean aditionalData;
		private String cityName;
		private String countryName;
		private Integer driverStatus;
		private Integer idCityCatalog;
		private Integer idDriver;
		private Integer idRider;
		private Integer idTaxiCorp;
		private Double latitude;
		private Double longitude;
		private String stateName;
		
		public Boolean getAditionalData() {
			return aditionalData;
		}
		public void setAditionalData(Boolean aditionalData) {
			this.aditionalData = aditionalData;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public Integer getDriverStatus() {
			return driverStatus;
		}
		public void setDriverStatus(Integer driverStatus) {
			this.driverStatus = driverStatus;
		}
		public Integer getIdCityCatalog() {
			return idCityCatalog;
		}
		public void setIdCityCatalog(Integer idCityCatalog) {
			this.idCityCatalog = idCityCatalog;
		}
		public Integer getIdDriver() {
			return idDriver;
		}
		public void setIdDriver(Integer idDriver) {
			this.idDriver = idDriver;
		}
		public Integer getIdRider() {
			return idRider;
		}
		public void setIdRider(Integer idRider) {
			this.idRider = idRider;
		}
		public Integer getIdTaxiCorp() {
			return idTaxiCorp;
		}
		public void setIdTaxiCorp(Integer idTaxiCorp) {
			this.idTaxiCorp = idTaxiCorp;
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
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		
		@Override
		public String toString() {
			return "RequestDriversLocationForm [aditionalData=" + aditionalData + ", cityName=" + cityName
					+ ", countryName=" + countryName + ", driverStatus=" + driverStatus + ", idCityCatalog="
					+ idCityCatalog + ", idDriver=" + idDriver + ", idRider=" + idRider + ", idTaxiCorp=" + idTaxiCorp
					+ ", latitude=" + latitude + ", longitude=" + longitude + ", stateName=" + stateName + "]";
		}

	}
	
	@JsonInclude(Include.NON_NULL)
	public static class ResponseDriversLocation{	
		/*
		 * {
			  "idDriver": 71,
		      "latitude": -2.1753025,
		      "longitude": -79.89087,
		      "lastUpdatedLocation": "2017-01-07 13:14:01.437",
		      "driverStatus": 3,
		      "panic": false,
		      "driverLocationListAditional": null
			}
		 */
		
		public ResponseDriversLocation(){
			
		}
		
		private Long idDriver;
		private Double latitude;
		private Double longitude;
		private String lastUpdatedLocation;
		private Integer driverStatus;
		private Boolean panic;
		private Boolean isFavoriteDriver;
		private String driverLocationListAditional;
		
		public Long getIdDriver() {
			return idDriver;
		}
		public void setIdDriver(Long idDriver) {
			this.idDriver = idDriver;
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
		public String getLastUpdatedLocation() {
			return lastUpdatedLocation;
		}
		public void setLastUpdatedLocation(String lastUpdatedLocation) {
			this.lastUpdatedLocation = lastUpdatedLocation;
		}
		public Integer getDriverStatus() {
			return driverStatus;
		}
		public void setDriverStatus(Integer driverStatus) {
			this.driverStatus = driverStatus;
		}
		public Boolean getPanic() {
			return panic;
		}
		public void setPanic(Boolean panic) {
			this.panic = panic;
		}
		public Boolean getIsFavoriteDriver() {
			return isFavoriteDriver;
		}
		public void setIsFavoriteDriver(Boolean isFavoriteDriver) {
			this.isFavoriteDriver = isFavoriteDriver;
		}
		public String getDriverLocationListAditional() {
			return driverLocationListAditional;
		}
		public void setDriverLocationListAditional(String driverLocationListAditional) {
			this.driverLocationListAditional = driverLocationListAditional;
		}
		
		@Override
		public String toString() {
			return "ResponseDriversLocation [idDriver=" + idDriver + ", latitude=" + latitude + ", longitude="
					+ longitude + ", lastUpdatedLocation=" + lastUpdatedLocation + ", driverStatus=" + driverStatus
					+ ", panic=" + panic + ", isFavoriteDriver=" + isFavoriteDriver + ", driverLocationListAditional="
					+ driverLocationListAditional + "]";
		}
		
	}

}
