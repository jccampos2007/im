/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class DeviceForm {
	
	private Long idDevice;
	private String imei;
	private Long idModel;
	private String modelName;
	private Long idBrand;
	private String brandName;
	private String serial;
	private String mobile;
	private int status;
    private int idCity;
    private String cityName;

	/**
	 * 
	 */
	public DeviceForm() {
		// TODO Auto-generated constructor stub
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

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getIdCity() {
		return idCity;
	}

	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "DeviceForm [idDevice=" + idDevice + ", imei=" + imei + ", idModel=" + idModel + ", modelName="
				+ modelName + ", idBrand=" + idBrand + ", brandName=" + brandName + ", serial=" + serial + ", mobile="
				+ mobile + ", status=" + status + ", idCity=" + idCity + ", cityName=" + cityName + "]";
	}

}
