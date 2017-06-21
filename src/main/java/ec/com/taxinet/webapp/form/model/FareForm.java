package ec.com.taxinet.webapp.form.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class FareForm {
	
	private Float costMinimum; //###############################
	private List<DistancePrice> fareDistance;
	private String finalDate; //yyyy-mm-dd- hh:mm:ss
	private String finalFriday;
	private String finalMonday;
	private String finalSaturday;
	private String finalSunday;
	private String finalThursday;
	private String finalTuesday;
	private String finalWednesday;
	private Boolean friday;
	private Long idCity;
	private Long idCoin;
	private Long idDistanceUnit;
	private Long idTaxiService;
	private Long idUserSession;
	private String initialDate; //yyyy-mm-dd- hh:mm:ss
	private Float initialFare;
	private String initialFriday;
	private String initialMonday;
	private String initialSaturday;
	private String initialSunday;
	private String initialThursday;
	private String initialTuesday;
	private String initialWednesday;
	private Boolean isAllWeek;
	private Float minimumFare;//###################################
	private Boolean monday;
	private String nameFare;
	private Float otherCharges;//##################################
	private Boolean saturday;
	private Integer status;
	private Boolean sunday;
	private Boolean thursday;
	private String tokenSession;
	private Boolean tuesday;
	private Integer type;
	private Boolean wednesday;

	private String initialTime;
	private String finalTime;
	
	
	public FareForm(){
		
	}
	
	
	

	public Float getCostMinimum() {
		return costMinimum;
	}




	public void setCostMinimum(Float costMinimum) {
		this.costMinimum = costMinimum;
	}




	public List<DistancePrice> getFareDistance() {
		return fareDistance;
	}




	public void setFareDistance(List<DistancePrice> fareDistance) {
		this.fareDistance = fareDistance;
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




	public Long getIdCoin() {
		return idCoin;
	}




	public void setIdCoin(Long idCoin) {
		this.idCoin = idCoin;
	}




	public Long getIdDistanceUnit() {
		return idDistanceUnit;
	}




	public void setIdDistanceUnit(Long idDistanceUnit) {
		this.idDistanceUnit = idDistanceUnit;
	}




	public Long getIdTaxiService() {
		return idTaxiService;
	}




	public void setIdTaxiService(Long idTaxiService) {
		this.idTaxiService = idTaxiService;
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




	public Float getInitialFare() {
		return initialFare;
	}




	public void setInitialFare(Float initialFare) {
		this.initialFare = initialFare;
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




	public Boolean getIsAllWeek() {
		return isAllWeek;
	}




	public void setIsAllWeek(Boolean isAllWeek) {
		this.isAllWeek = isAllWeek;
	}




	public Float getMinimumFare() {
		return minimumFare;
	}




	public void setMinimumFare(Float minimumFare) {
		this.minimumFare = minimumFare;
	}




	public Boolean getMonday() {
		return monday;
	}




	public void setMonday(Boolean monday) {
		this.monday = monday;
	}




	public String getNameFare() {
		return nameFare;
	}




	public void setNameFare(String nameFare) {
		this.nameFare = nameFare;
	}




	public Float getOtherCharges() {
		return otherCharges;
	}




	public void setOtherCharges(Float otherCharges) {
		this.otherCharges = otherCharges;
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




	public String getInitialTime() {
		return initialTime;
	}




	public void setInitialTime(String initialTime) {
		this.initialTime = initialTime;
	}




	public String getFinalTime() {
		return finalTime;
	}




	public void setFinalTime(String finalTime) {
		this.finalTime = finalTime;
	}




	@Override
	public String toString() {
		return "FareForm [costMinimum=" + costMinimum + ", fareDistance=" + fareDistance + ", finalDate=" + finalDate
				+ ", finalFriday=" + finalFriday + ", finalMonday=" + finalMonday + ", finalSaturday=" + finalSaturday
				+ ", finalSunday=" + finalSunday + ", finalThursday=" + finalThursday + ", finalTuesday=" + finalTuesday
				+ ", finalWednesday=" + finalWednesday + ", friday=" + friday + ", idCity=" + idCity + ", idCoin="
				+ idCoin + ", idDistanceUnit=" + idDistanceUnit + ", idTaxiService=" + idTaxiService
				+ ", idUserSession=" + idUserSession + ", initialDate=" + initialDate + ", initialFare=" + initialFare
				+ ", initialFriday=" + initialFriday + ", initialMonday=" + initialMonday + ", initialSaturday="
				+ initialSaturday + ", initialSunday=" + initialSunday + ", initialThursday=" + initialThursday
				+ ", initialTuesday=" + initialTuesday + ", initialWednesday=" + initialWednesday + ", isAllWeek="
				+ isAllWeek + ", minimumFare=" + minimumFare + ", monday=" + monday + ", nameFare=" + nameFare
				+ ", otherCharges=" + otherCharges + ", saturday=" + saturday + ", status=" + status + ", sunday="
				+ sunday + ", thursday=" + thursday + ", tokenSession=" + tokenSession + ", tuesday=" + tuesday
				+ ", type=" + type + ", wednesday=" + wednesday + ", initialTime=" + initialTime + ", finalTime="
				+ finalTime + "]";
	}




	@JsonInclude(Include.NON_NULL)
	public static class DistancePrice{
		
		public DistancePrice(){
			
		}
		
		private Float finalDistance;
		private Float initialDistance;
		private Float price;
		public Float getFinalDistance() {
			return finalDistance;
		}
		public void setFinalDistance(Float finalDistance) {
			this.finalDistance = finalDistance;
		}
		public Float getInitialDistance() {
			return initialDistance;
		}
		public void setInitialDistance(Float initialDistance) {
			this.initialDistance = initialDistance;
		}
		public Float getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
		}
		
		
		@Override
		public String toString() {
			return "DistancePrice [finalDistance=" + finalDistance + ", initialDistance=" + initialDistance + ", price="
					+ price + "]";
		}
		
		@JsonInclude(Include.NON_NULL)
		public static class FareFormUpdate{
			
			public FareFormUpdate(){
				
			}
			
			private Long idFare;
			private Boolean status;
			
			
			public Long getIdFare() {
				return idFare;
			}
			public void setIdFare(Long idFare) {
				this.idFare = idFare;
			}
			public Boolean getStatus() {
				return status;
			}
			public void setStatus(Boolean status) {
				this.status = status;
			}
			@Override
			public String toString() {
				return "FareFormUpdate [idFare=" + idFare + ", status=" + status + "]";
			}
			
			
			
			
			
		}
		
		
	}

}
