package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Fare implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Fare(){
		
	}
	
	private Long idTaxiService;
	private String taxiServiceName;
	private String taxiServiceDescription;
	private Long idFare;
	private String fareName;
	private Integer fareType;
	private Float costMinimum;
	private Float initialFare;
	private Float minimumFare;
	private Float otherCharges; // Revisar
	private Float idleFare; // Revisar
	private String initialDate;
	private String finalDate;
	private Boolean isAllWeek;
	private Boolean sunday;
	private String initialSunday;
	private String finalSunday;
	private Boolean monday;
	private String initialMonday;
	private String finalMonday;
	private Boolean tuesday;
	private String initialTuesday;
	private String finalTuesday;
	private Boolean wednesday;
	private String initialWednesday;
	private String finalWednesday;
	private Boolean thursday;
	private String initialThursday;
	private String finalThursday;
	private Boolean friday;
	private String initialFriday;
	private String finalFriday;
	private Boolean saturday;
	private String initialSaturday;
	private String finalSaturday;
	private Long idDistanceUnit;
	private String distanceUnitName;
	private String distanceUnitValue;
	private Long idCoin;
	private String coinCode;
	private String coinValue;
	private String coinName;
	private Long idCity;
	private String cityName;
	private Long idState;
	private String stateName;
	private Long idCountry;
	private Boolean status;
	private List<DistanceFare> distanceFare;

	public Long getIdTaxiService() {
		return idTaxiService;
	}
	public void setIdTaxiService(Long idTaxiService) {
		this.idTaxiService = idTaxiService;
	}
	public String getTaxiServiceName() {
		return taxiServiceName;
	}
	public void setTaxiServiceName(String taxiServiceName) {
		this.taxiServiceName = taxiServiceName;
	}
	public String getTaxiServiceDescription() {
		return taxiServiceDescription;
	}
	public void setTaxiServiceDescription(String taxiServiceDescription) {
		this.taxiServiceDescription = taxiServiceDescription;
	}
	public Long getIdFare() {
		return idFare;
	}
	public void setIdFare(Long idFare) {
		this.idFare = idFare;
	}
	public String getFareName() {
		return fareName;
	}
	public void setFareName(String fareName) {
		this.fareName = fareName;
	}
	public Integer getFareType() {
		return fareType;
	}
	public void setFareType(Integer fareType) {
		this.fareType = fareType;
	}
	public Float getCostMinimum() {
		return costMinimum;
	}
	public void setCostMinimum(Float costMinimum) {
		this.costMinimum = costMinimum;
	}
	public Float getInitialFare() {
		return initialFare;
	}
	public void setInitialFare(Float initialFare) {
		this.initialFare = initialFare;
	}
	public Float getMinimumFare() {
		return minimumFare;
	}
	public void setMinimumFare(Float minimumFare) {
		this.minimumFare = minimumFare;
	}
	public Float getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(Float otherCharges) {
		this.otherCharges = otherCharges;
	}
	public Float getIdleFare() {
		return idleFare;
	}
	public void setIdleFare(Float idleFare) {
		this.idleFare = idleFare;
	}
	public String getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}
	public String getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}
	public Boolean getIsAllWeek() {
		return isAllWeek;
	}
	public void setIsAllWeek(Boolean isAllWeek) {
		this.isAllWeek = isAllWeek;
	}
	public Boolean getSunday() {
		return sunday;
	}
	public void setSunday(Boolean sunday) {
		this.sunday = sunday;
	}
	public String getInitialSunday() {
		return initialSunday;
	}
	public void setInitialSunday(String initialSunday) {
		this.initialSunday = initialSunday;
	}
	public String getFinalSunday() {
		return finalSunday;
	}
	public void setFinalSunday(String finalSunday) {
		this.finalSunday = finalSunday;
	}
	public Boolean getMonday() {
		return monday;
	}
	public void setMonday(Boolean monday) {
		this.monday = monday;
	}
	public String getInitialMonday() {
		return initialMonday;
	}
	public void setInitialMonday(String initialMonday) {
		this.initialMonday = initialMonday;
	}
	public String getFinalMonday() {
		return finalMonday;
	}
	public void setFinalMonday(String finalMonday) {
		this.finalMonday = finalMonday;
	}
	public Boolean getTuesday() {
		return tuesday;
	}
	public void setTuesday(Boolean tuesday) {
		this.tuesday = tuesday;
	}
	public String getInitialTuesday() {
		return initialTuesday;
	}
	public void setInitialTuesday(String initialTuesday) {
		this.initialTuesday = initialTuesday;
	}
	public String getFinalTuesday() {
		return finalTuesday;
	}
	public void setFinalTuesday(String finalTuesday) {
		this.finalTuesday = finalTuesday;
	}
	public Boolean getWednesday() {
		return wednesday;
	}
	public void setWednesday(Boolean wednesday) {
		this.wednesday = wednesday;
	}
	public String getInitialWednesday() {
		return initialWednesday;
	}
	public void setInitialWednesday(String initialWednesday) {
		this.initialWednesday = initialWednesday;
	}
	public String getFinalWednesday() {
		return finalWednesday;
	}
	public void setFinalWednesday(String finalWednesday) {
		this.finalWednesday = finalWednesday;
	}
	public Boolean getThursday() {
		return thursday;
	}
	public void setThursday(Boolean thursday) {
		this.thursday = thursday;
	}
	public String getInitialThursday() {
		return initialThursday;
	}
	public void setInitialThursday(String initialThursday) {
		this.initialThursday = initialThursday;
	}
	public String getFinalThursday() {
		return finalThursday;
	}
	public void setFinalThursday(String finalThursday) {
		this.finalThursday = finalThursday;
	}
	public Boolean getFriday() {
		return friday;
	}
	public void setFriday(Boolean friday) {
		this.friday = friday;
	}
	public String getInitialFriday() {
		return initialFriday;
	}
	public void setInitialFriday(String initialFriday) {
		this.initialFriday = initialFriday;
	}
	public String getFinalFriday() {
		return finalFriday;
	}
	public void setFinalFriday(String finalFriday) {
		this.finalFriday = finalFriday;
	}
	public Boolean getSaturday() {
		return saturday;
	}
	public void setSaturday(Boolean saturday) {
		this.saturday = saturday;
	}
	public String getInitialSaturday() {
		return initialSaturday;
	}
	public void setInitialSaturday(String initialSaturday) {
		this.initialSaturday = initialSaturday;
	}
	public String getFinalSaturday() {
		return finalSaturday;
	}
	public void setFinalSaturday(String finalSaturday) {
		this.finalSaturday = finalSaturday;
	}
	public Long getIdDistanceUnit() {
		return idDistanceUnit;
	}
	public void setIdDistanceUnit(Long idDistanceUnit) {
		this.idDistanceUnit = idDistanceUnit;
	}
	public String getDistanceUnitName() {
		return distanceUnitName;
	}
	public void setDistanceUnitName(String distanceUnitName) {
		this.distanceUnitName = distanceUnitName;
	}
	public String getDistanceUnitValue() {
		return distanceUnitValue;
	}
	public void setDistanceUnitValue(String distanceUnitValue) {
		this.distanceUnitValue = distanceUnitValue;
	}
	public Long getIdCoin() {
		return idCoin;
	}
	public void setIdCoin(Long idCoin) {
		this.idCoin = idCoin;
	}
	public String getCoinCode() {
		return coinCode;
	}
	public void setCoinCode(String coinCode) {
		this.coinCode = coinCode;
	}
	public String getCoinValue() {
		return coinValue;
	}
	public void setCoinValue(String coinValue) {
		this.coinValue = coinValue;
	}
	public String getCoinName() {
		return coinName;
	}
	public void setCoinName(String coinName) {
		this.coinName = coinName;
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
	public Long getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public List<DistanceFare> getDistanceFare() {
		return distanceFare;
	}
	public void setDistanceFare(List<DistanceFare> distanceFare) {
		this.distanceFare = distanceFare;
	}
	
	
	
	@Override
	public String toString() {
		return "Fare [idTaxiService=" + idTaxiService + ", taxiServiceName=" + taxiServiceName
				+ ", taxiServiceDescription=" + taxiServiceDescription + ", idFare=" + idFare + ", fareName=" + fareName
				+ ", fareType=" + fareType + ", costMinimum=" + costMinimum + ", initialFare=" + initialFare
				+ ", minimumFare=" + minimumFare + ", otherCharges=" + otherCharges + ", idleFare=" + idleFare
				+ ", initialDate=" + initialDate + ", finalDate=" + finalDate + ", isAllWeek=" + isAllWeek + ", sunday="
				+ sunday + ", initialSunday=" + initialSunday + ", finalSunday=" + finalSunday + ", monday=" + monday
				+ ", initialMonday=" + initialMonday + ", finalMonday=" + finalMonday + ", tuesday=" + tuesday
				+ ", initialTuesday=" + initialTuesday + ", finalTuesday=" + finalTuesday + ", wednesday=" + wednesday
				+ ", initialWednesday=" + initialWednesday + ", finalWednesday=" + finalWednesday + ", thursday="
				+ thursday + ", initialThursday=" + initialThursday + ", finalThursday=" + finalThursday + ", friday="
				+ friday + ", initialFriday=" + initialFriday + ", finalFriday=" + finalFriday + ", saturday="
				+ saturday + ", initialSaturday=" + initialSaturday + ", finalSaturday=" + finalSaturday
				+ ", idDistanceUnit=" + idDistanceUnit + ", distanceUnitName=" + distanceUnitName
				+ ", distanceUnitValue=" + distanceUnitValue + ", idCoin=" + idCoin + ", coinCode=" + coinCode
				+ ", coinValue=" + coinValue + ", coinName=" + coinName + ", idCity=" + idCity + ", cityName="
				+ cityName + ", idState=" + idState + ", stateName=" + stateName + ", idCountry=" + idCountry
				+ ", status=" + status + ", distanceFare=" + distanceFare + "]";
	}



	@JsonInclude(Include.NON_NULL)
	public static class DistanceFare{
		
		public DistanceFare(){
			
		}
		
		private Float fromDistance;
		private Float finalDistance;
		private Float price;
		
		public Float getFromDistance() {
			return fromDistance;
		}
		public void setFromDistance(Float fromDistance) {
			this.fromDistance = fromDistance;
		}
		public Float getFinalDistance() {
			return finalDistance;
		}
		public void setFinalDistance(Float finalDistance) {
			this.finalDistance = finalDistance;
		}
		public Float getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
		}
		
		
		
		@Override
		public String toString() {
			return "DistanceFare [fromDistance=" + fromDistance + ", finalDistance=" + finalDistance + ", price="
					+ price + "]";
		}
		
		
		
	}
	

}
