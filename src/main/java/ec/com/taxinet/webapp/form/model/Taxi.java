/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class Taxi {
	
	private Long idDriverTaxi;
	private Long idDriver;
	private Long idTaxi;
	private String vehiclePlate;
	private Integer year;
	private Integer taxiStatus;
	private String brandName;
	private String modelName;
	private String colorName;
	private String typeCarName;
	private Long idTaxiService;
	private Long idHomeState;
	private Long idCity;
	private String cityName;
	private Long idTaxiCorp;
	private Long taxiCorpIdCity;
	private String taxiCorpCityName;
	private String taxiCorpName;
	private String taxiCorpPhone;
	private String taxiServiceName;
	private Integer currentTaxi;
	
	/**
	 * 
	 */
	public Taxi() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdDriverTaxi() {
		return idDriverTaxi;
	}

	public void setIdDriverTaxi(Long idDriverTaxi) {
		this.idDriverTaxi = idDriverTaxi;
	}

	public Long getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(Long idDriver) {
		this.idDriver = idDriver;
	}

	public Long getIdTaxi() {
		return idTaxi;
	}

	public void setIdTaxi(Long idTaxi) {
		this.idTaxi = idTaxi;
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getTaxiStatus() {
		return taxiStatus;
	}

	public void setTaxiStatus(Integer taxiStatus) {
		this.taxiStatus = taxiStatus;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getTypeCarName() {
		return typeCarName;
	}

	public void setTypeCarName(String typeCarName) {
		this.typeCarName = typeCarName;
	}

	public Long getIdTaxiService() {
		return idTaxiService;
	}

	public void setIdTaxiService(Long idTaxiService) {
		this.idTaxiService = idTaxiService;
	}

	public Long getIdHomeState() {
		return idHomeState;
	}

	public void setIdHomeState(Long idHomeState) {
		this.idHomeState = idHomeState;
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

	public Long getIdTaxiCorp() {
		return idTaxiCorp;
	}

	public void setIdTaxiCorp(Long idTaxiCorp) {
		this.idTaxiCorp = idTaxiCorp;
	}

	public Long getTaxiCorpIdCity() {
		return taxiCorpIdCity;
	}

	public void setTaxiCorpIdCity(Long taxiCorpIdCity) {
		this.taxiCorpIdCity = taxiCorpIdCity;
	}

	public String getTaxiCorpCityName() {
		return taxiCorpCityName;
	}

	public void setTaxiCorpCityName(String taxiCorpCityName) {
		this.taxiCorpCityName = taxiCorpCityName;
	}

	public String getTaxiCorpName() {
		return taxiCorpName;
	}

	public void setTaxiCorpName(String taxiCorpName) {
		this.taxiCorpName = taxiCorpName;
	}

	public String getTaxiCorpPhone() {
		return taxiCorpPhone;
	}

	public void setTaxiCorpPhone(String taxiCorpPhone) {
		this.taxiCorpPhone = taxiCorpPhone;
	}

	@Override
	public String toString() {
		return "Taxi [idDriverTaxi=" + idDriverTaxi + ", idDriver=" + idDriver + ", idTaxi=" + idTaxi
				+ ", vehiclePlate=" + vehiclePlate + ", year=" + year + ", taxiStatus=" + taxiStatus + ", brandName="
				+ brandName + ", modelName=" + modelName + ", colorName=" + colorName + ", typeCarName=" + typeCarName
				+ ", idTaxiService=" + idTaxiService + ", idHomeState=" + idHomeState + ", idCity=" + idCity
				+ ", cityName=" + cityName + ", idTaxiCorp=" + idTaxiCorp + ", taxiCorpIdCity=" + taxiCorpIdCity
				+ ", taxiCorpCityName=" + taxiCorpCityName + ", taxiCorpName=" + taxiCorpName + ", taxiCorpPhone="
				+ taxiCorpPhone + "]";
	}

	public String getTaxiServiceName() {
		return taxiServiceName;
	}

	public void setTaxiServiceName(String taxiServiceName) {
		this.taxiServiceName = taxiServiceName;
	}

	public Integer getCurrentTaxi() {
		return currentTaxi;
	}

	public void setCurrentTaxi(Integer currentTaxi) {
		this.currentTaxi = currentTaxi;
	}

}
