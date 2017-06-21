/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class DriverDevice  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idDriver;
	private String username;
	private String name;
	private String lastName;
	private String photoUrl;
	private String mobile;
	private String driverLicense;
	private String status;
	private String driverStatusDriver;
	private Boolean isPanic;
	private Long idUser;
	private Long idHomeEstate;
	private String homeEstateName;
	private Long idHomeCity;
	private String homeCityName;
	private Double rate;
	private Double amount;
	private Long idDevice;
	private String imei;
	private Long idModel;
	private String modelName;
	private Long idBrand;
	private String brandName;
	private String serialDevice;
	private Boolean statusDevice;
	private Long idCityDevice;
	private String cityNameDevice;	
	private Long idDriverDevice;
	private String mobileDevice;
	/**
	 * 
	 */
	public DriverDevice() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(Long idDriver) {
		this.idDriver = idDriver;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDriverStatusDriver() {
		return driverStatusDriver;
	}

	public void setDriverStatusDriver(String driverStatusDriver) {
		this.driverStatusDriver = driverStatusDriver;
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

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(Long idDevice) {
		this.idDevice = idDevice;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Long getIdModel() {
		return idModel;
	}

	public void setIdModel(Long idModel) {
		this.idModel = idModel;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Long getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Long idBrand) {
		this.idBrand = idBrand;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSerialDevice() {
		return serialDevice;
	}

	public void setSerialDevice(String serialDevice) {
		this.serialDevice = serialDevice;
	}

	public Boolean getStatusDevice() {
		return statusDevice;
	}

	public void setStatusDevice(Boolean statusDevice) {
		this.statusDevice = statusDevice;
	}

	public Long getIdCityDevice() {
		return idCityDevice;
	}

	public void setIdCityDevice(Long idCityDevice) {
		this.idCityDevice = idCityDevice;
	}

	public String getCityNameDevice() {
		return cityNameDevice;
	}

	public void setCityNameDevice(String cityNameDevice) {
		this.cityNameDevice = cityNameDevice;
	}

	@Override
	public String toString() {
		return "DriverDevice [idDriver=" + idDriver + ", username=" + username + ", name=" + name + ", lastName="
				+ lastName + ", photoUrl=" + photoUrl + ", mobile=" + mobile + ", driverLicense=" + driverLicense
				+ ", status=" + status + ", driverStatusDriver=" + driverStatusDriver + ", isPanic=" + isPanic
				+ ", idUser=" + idUser + ", idHomeEstate=" + idHomeEstate + ", homeEstateName=" + homeEstateName
				+ ", idHomeCity=" + idHomeCity + ", homeCityName=" + homeCityName + ", rate=" + rate + ", amount="
				+ amount + ", idDevice=" + idDevice + ", imei=" + imei + ", idModel=" + idModel + ", modelName="
				+ modelName + ", idBrand=" + idBrand + ", brandName=" + brandName + ", serialDevice=" + serialDevice
				+ ", statusDevice=" + statusDevice + ", idCityDevice=" + idCityDevice + ", cityNameDevice="
				+ cityNameDevice + ", idDriverDevice=" + idDriverDevice + ", mobileDevice=" + mobileDevice + "]";
	}

	public Long getIdDriverDevice() {
		return idDriverDevice;
	}

	public void setIdDriverDevice(Long idDriverDevice) {
		this.idDriverDevice = idDriverDevice;
	}

	public String getMobileDevice() {
		return mobileDevice;
	}

	public void setMobileDevice(String mobileDevice) {
		this.mobileDevice = mobileDevice;
	}

}
