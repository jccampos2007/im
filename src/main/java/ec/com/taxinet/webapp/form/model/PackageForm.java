package ec.com.taxinet.webapp.form.model;

public class PackageForm {

	
	/* 


  "monday": true,
  "name": "string",
  "packageAmount": 0,
  "realAmount": 0,
  "saturday": true,
  "status": 0,
  "sunday": true,
  "thursday": true,
  "tokenSession": "string",
  "tuesday": true,
  "type": 0,
  "wednesday": true
  */
	
	private String finalDate;
	private String finalFriday;
	private String finalMonday;
	private String finalSaturday;
	private String finalSunday;
	private String finalThursday;
	private String finalTuesday;
	private String finalWednesday;
	private Boolean friday;
	private Long idCity;
	private Long idCoinCatalog;
	private Long idUserSession;
	private String initialDate;
	private String initialFriday;
	private String initialMonday;
	private String initialSaturday;
	private String initialSunday;
	private String initialThursday;
	private String initialTuesday;
	private String initialWednesday;
	private Boolean monday;
	private String name;
	private Float packageAmount;
	private Float realAmount;
	private Boolean saturday;
	private Integer status;
	private Boolean sunday;
	private Boolean thursday;
	private String tokenSession;
	private Boolean tuesday;
	private Integer type;
	private Boolean wednesday;
	
	
	public PackageForm(){
		
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
	public String getFinalFriday() {
		return finalFriday;
	}
	public void setFinalFriday(String finalFriday) {
		this.finalFriday = finalFriday;
	}
	public String getFinalMonday() {
		return finalMonday;
	}
	public void setFinalMonday(String finalMonday) {
		this.finalMonday = finalMonday;
	}
	public String getFinalSaturday() {
		return finalSaturday;
	}
	public void setFinalSaturday(String finalSaturday) {
		this.finalSaturday = finalSaturday;
	}
	public String getFinalSunday() {
		return finalSunday;
	}
	public void setFinalSunday(String finalSunday) {
		this.finalSunday = finalSunday;
	}
	public String getFinalThursday() {
		return finalThursday;
	}
	public void setFinalThursday(String finalThursday) {
		this.finalThursday = finalThursday;
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
	public Boolean getFriday() {
		return friday;
	}
	public void setFriday(Boolean friday) {
		this.friday = friday;
	}
	public Long getIdCity() {
		return idCity;
	}
	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}
	public Long getIdCoinCatalog() {
		return idCoinCatalog;
	}
	public void setIdCoinCatalog(Long idCoinCatalog) {
		this.idCoinCatalog = idCoinCatalog;
	}
	public Long getIdUserSession() {
		return idUserSession;
	}
	public void setIdUserSession(Long idUserSession) {
		this.idUserSession = idUserSession;
	}
	public String getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}
	public String getInitialFriday() {
		return initialFriday;
	}
	public void setInitialFriday(String initialFriday) {
		this.initialFriday = initialFriday;
	}
	public String getInitialMonday() {
		return initialMonday;
	}
	public void setInitialMonday(String initialMonday) {
		this.initialMonday = initialMonday;
	}
	public String getInitialSaturday() {
		return initialSaturday;
	}
	public void setInitialSaturday(String initialSaturday) {
		this.initialSaturday = initialSaturday;
	}
	public String getInitialSunday() {
		return initialSunday;
	}
	public void setInitialSunday(String initialSunday) {
		this.initialSunday = initialSunday;
	}
	public String getInitialThursday() {
		return initialThursday;
	}
	public void setInitialThursday(String initialThursday) {
		this.initialThursday = initialThursday;
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
	public Boolean getMonday() {
		return monday;
	}
	public void setMonday(Boolean monday) {
		this.monday = monday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getSaturday() {
		return saturday;
	}
	public void setSaturday(Boolean saturday) {
		this.saturday = saturday;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getSunday() {
		return sunday;
	}
	public void setSunday(Boolean sunday) {
		this.sunday = sunday;
	}
	public Boolean getThursday() {
		return thursday;
	}
	public void setThursday(Boolean thursday) {
		this.thursday = thursday;
	}
	public String getTokenSession() {
		return tokenSession;
	}
	public void setTokenSession(String tokenSession) {
		this.tokenSession = tokenSession;
	}

	public Boolean getTuesday() {
		return tuesday;
	}
	public void setTuesday(Boolean tuesday) {
		this.tuesday = tuesday;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

	public Boolean getWednesday() {
		return wednesday;
	}
	public void setWednesday(Boolean wednesday) {
		this.wednesday = wednesday;
	}
	@Override
	public String toString() {
		return "PackageForm [finalDate=" + finalDate + ", finalFriday=" + finalFriday + ", finalMonday=" + finalMonday
				+ ", finalSaturday=" + finalSaturday + ", finalSunday=" + finalSunday + ", finalThursday="
				+ finalThursday + ", finalTuesday=" + finalTuesday + ", finalWednesday=" + finalWednesday + ", friday="
				+ friday + ", idCity=" + idCity + ", idCoinCatalog=" + idCoinCatalog + ", idUserSession="
				+ idUserSession + ", initialDate=" + initialDate + ", initialFriday=" + initialFriday
				+ ", initialMonday=" + initialMonday + ", initialSaturday=" + initialSaturday + ", initialSunday="
				+ initialSunday + ", initialThursday=" + initialThursday + ", initialTuesday=" + initialTuesday
				+ ", initialWednesday=" + initialWednesday + ", monday=" + monday + ", name=" + name
				+ ", packageAmount=" + packageAmount + ", realAmount=" + realAmount + ", saturday=" + saturday
				+ ", status=" + status + ", sunday=" + sunday + ", thursday=" + thursday + ", tokenSession="
				+ tokenSession + ", tuesday=" + tuesday + ", type=" + type + ", wednesday=" + wednesday + "]";
	}
	

	
	
}
