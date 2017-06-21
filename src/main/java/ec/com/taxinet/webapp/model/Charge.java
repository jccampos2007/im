package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * 
 * @author keyber
 *
 */
public class Charge  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long idCharge;
	private Long idCountry;
	private String countryName;
	private Long idState;
	private String stateName;
	private Long idCity;
	private String cityName;
	private Float appFee;
	private Float scheduledFee;
	private Float selfFee;
	private Float immediateFee;
	private Float multiserviceFee;
	private Float companyFee;
	private Float driverCharge;
	private boolean status;
	private Float driverImmediateFee;
	private Float driverScheduledFee;
	private Float driverMultiserviceFee;
	private Float driverSelfFee;
	private Float driverCompanyFee;
	
	public Charge(){
		
	}

	public Long getIdCharge() {
		return idCharge;
	}

	public void setIdCharge(Long idCharge) {
		this.idCharge = idCharge;
	}

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

	public Float getAppFee() {
		return appFee;
	}

	public void setAppFee(Float appFee) {
		this.appFee = appFee;
	}

	public Float getScheduledFee() {
		return scheduledFee;
	}

	public void setScheduledFee(Float scheduledFee) {
		this.scheduledFee = scheduledFee;
	}

	public Float getSelfFee() {
		return selfFee;
	}

	public void setSelfFee(Float selfFee) {
		this.selfFee = selfFee;
	}

	public Float getImmediateFee() {
		return immediateFee;
	}

	public void setImmediateFee(Float immediateFee) {
		this.immediateFee = immediateFee;
	}

	public Float getMultiserviceFee() {
		return multiserviceFee;
	}

	public void setMultiserviceFee(Float multiserviceFee) {
		this.multiserviceFee = multiserviceFee;
	}

	public Float getCompanyFee() {
		return companyFee;
	}

	public void setCompanyFee(Float companyFee) {
		this.companyFee = companyFee;
	}

	public Float getDriverCharge() {
		return driverCharge;
	}

	public void setDriverCharge(Float driverCharge) {
		this.driverCharge = driverCharge;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Float getDriverImmediateFee() {
		return driverImmediateFee;
	}

	public void setDriverImmediateFee(Float driverImmediateFee) {
		this.driverImmediateFee = driverImmediateFee;
	}

	public Float getDriverScheduledFee() {
		return driverScheduledFee;
	}

	public void setDriverScheduledFee(Float driverScheduledFee) {
		this.driverScheduledFee = driverScheduledFee;
	}

	public Float getDriverMultiserviceFee() {
		return driverMultiserviceFee;
	}

	public void setDriverMultiserviceFee(Float driverMultiserviceFee) {
		this.driverMultiserviceFee = driverMultiserviceFee;
	}

	public Float getDriverSelfFee() {
		return driverSelfFee;
	}

	public void setDriverSelfFee(Float driverSelfFee) {
		this.driverSelfFee = driverSelfFee;
	}

	public Float getDriverCompanyFee() {
		return driverCompanyFee;
	}

	public void setDriverCompanyFee(Float driverCompanyFee) {
		this.driverCompanyFee = driverCompanyFee;
	}

	@Override
	public String toString() {
		return "Charge [idCharge=" + idCharge + ", idCountry=" + idCountry + ", countryName=" + countryName
				+ ", idState=" + idState + ", stateName=" + stateName + ", idCity=" + idCity + ", cityName=" + cityName
				+ ", appFee=" + appFee + ", scheduledFee=" + scheduledFee + ", selfFee=" + selfFee + ", immediateFee="
				+ immediateFee + ", multiserviceFee=" + multiserviceFee + ", companyFee=" + companyFee
				+ ", driverCharge=" + driverCharge + ", status=" + status + ", driverImmediateFee=" + driverImmediateFee
				+ ", driverScheduledFee=" + driverScheduledFee + ", driverMultiserviceFee=" + driverMultiserviceFee
				+ ", driverSelfFee=" + driverSelfFee + ", driverCompanyFee=" + driverCompanyFee + "]";
	}
	
	

}
