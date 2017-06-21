package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.Date;

public class Packages implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long idPackage;
	private String name;
	private String type;
	private Long idCity;
	private String cityName;
	private Long idState;
	private String stateName;
	private Float packageAmount;
	private Float realAmount;
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
	
	private String isSunday;
	private String isMonday;
	private String isTuesday;
	private String isWednesday;
	private String isThursday;
	private String isFriday;
	private String isSaturday;
	
	public Packages(){
		
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



	public Float getPackageAmount() {
		return packageAmount;
	}

	public void setPackageAmount(Float packageAmount) {
		this.packageAmount = packageAmount;
	}

	public Float getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Float realAmount) {
		this.realAmount = realAmount;
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

	public String getIsSunday() {
		return isSunday;
	}

	public void setIsSunday(String isSunday) {
		this.isSunday = isSunday;
	}

	public String getIsMonday() {
		return isMonday;
	}

	public void setIsMonday(String isMonday) {
		this.isMonday = isMonday;
	}

	public String getIsTuesday() {
		return isTuesday;
	}

	public void setIsTuesday(String isTuesday) {
		this.isTuesday = isTuesday;
	}

	public String getIsWednesday() {
		return isWednesday;
	}

	public void setIsWednesday(String isWednesday) {
		this.isWednesday = isWednesday;
	}

	public String getIsThursday() {
		return isThursday;
	}

	public void setIsThursday(String isThursday) {
		this.isThursday = isThursday;
	}

	public String getIsFriday() {
		return isFriday;
	}

	public void setIsFriday(String isFriday) {
		this.isFriday = isFriday;
	}

	public String getIsSaturday() {
		return isSaturday;
	}

	public void setIsSaturday(String isSaturday) {
		this.isSaturday = isSaturday;
	}

	@Override
	public String toString() {
		return "Packages [idPackage=" + idPackage + ", name=" + name + ", type=" + type + ", idCity=" + idCity
				+ ", cityName=" + cityName + ", idState=" + idState + ", stateName=" + stateName + ", packageAmount="
				+ packageAmount + ", realAmount=" + realAmount + ", finalDate=" + finalDate + ", initialDate="
				+ initialDate + ", sunday=" + sunday + ", monday=" + monday + ", tuesday=" + tuesday + ", wednesday="
				+ wednesday + ", thursday=" + thursday + ", friday=" + friday + ", saturday=" + saturday
				+ ", initialSunday=" + initialSunday + ", initialMonday=" + initialMonday + ", initialTuesday="
				+ initialTuesday + ", initialWednesday=" + initialWednesday + ", initialThursday=" + initialThursday
				+ ", initialFriday=" + initialFriday + ", initialSaturday=" + initialSaturday + ", finalSunday="
				+ finalSunday + ", finalMonday=" + finalMonday + ", finalTuesday=" + finalTuesday + ", finalWednesday="
				+ finalWednesday + ", finalThursday=" + finalThursday + ", finalFriday=" + finalFriday
				+ ", finalSaturday=" + finalSaturday + ", idCoinCatalog=" + idCoinCatalog + ", status=" + status
				+ ", statusName=" + statusName + ", pk_idCountry=" + pk_idCountry + ", isSunday=" + isSunday
				+ ", isMonday=" + isMonday + ", isTuesday=" + isTuesday + ", isWednesday=" + isWednesday
				+ ", isThursday=" + isThursday + ", isFriday=" + isFriday + ", isSaturday=" + isSaturday + "]";
	}
	
	
	
	
	

}
