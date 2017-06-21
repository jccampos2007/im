package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class FixedFare  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/*

     
      "coinName": "DOLAR",
      "coinCode": "USD($)",
      "coinValue": "$",
      "status": true
    },
	*/
	
	private Long idFixedFare;
	private String name;
	private Long idStartCity;
	private String startCityName;
	private Long startIdState;
	private String startStateName;
	private Long startIdContry;
	private Long idEndCity;
	private String endCityName;
	private Long endIdState;
	private String endStateName;
	private Long endIdContry;
	private Float startLatitude;
	private Float startLongitude;
	private Float endLatitude;
	private Float endLongitude;
	private Float price;
	private Long idCoin;
	private String coinName;
	private String coinCode;
	private String coinValue;
	private Boolean status;
	
	public FixedFare(){
		
	}

	public Long getIdFixedFare() {
		return idFixedFare;
	}

	public void setIdFixedFare(Long idFixedFare) {
		this.idFixedFare = idFixedFare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdStartCity() {
		return idStartCity;
	}

	public void setIdStartCity(Long idStartCity) {
		this.idStartCity = idStartCity;
	}

	public String getStartCityName() {
		return startCityName;
	}

	public void setStartCityName(String startCityName) {
		this.startCityName = startCityName;
	}

	public Long getStartIdState() {
		return startIdState;
	}

	public void setStartIdState(Long startIdState) {
		this.startIdState = startIdState;
	}

	public String getStartStateName() {
		return startStateName;
	}

	public void setStartStateName(String startStateName) {
		this.startStateName = startStateName;
	}

	public Long getStartIdContry() {
		return startIdContry;
	}

	public void setStartIdContry(Long startIdContry) {
		this.startIdContry = startIdContry;
	}

	public Long getIdEndCity() {
		return idEndCity;
	}

	public void setIdEndCity(Long idEndCity) {
		this.idEndCity = idEndCity;
	}

	public String getEndCityName() {
		return endCityName;
	}

	public void setEndCityName(String endCityName) {
		this.endCityName = endCityName;
	}

	public Long getEndIdState() {
		return endIdState;
	}

	public void setEndIdState(Long endIdState) {
		this.endIdState = endIdState;
	}

	public String getEndStateName() {
		return endStateName;
	}

	public void setEndStateName(String endStateName) {
		this.endStateName = endStateName;
	}

	public Long getEndIdContry() {
		return endIdContry;
	}

	public void setEndIdContry(Long endIdContry) {
		this.endIdContry = endIdContry;
	}

	public Float getStartLatitude() {
		return startLatitude;
	}

	public void setStartLatitude(Float startLatitude) {
		this.startLatitude = startLatitude;
	}

	public Float getStartLongitude() {
		return startLongitude;
	}

	public void setStartLongitude(Float startLongitude) {
		this.startLongitude = startLongitude;
	}

	public Float getEndLatitude() {
		return endLatitude;
	}

	public void setEndLatitude(Float endLatitude) {
		this.endLatitude = endLatitude;
	}

	public Float getEndLongitude() {
		return endLongitude;
	}

	public void setEndLongitude(Float endLongitude) {
		this.endLongitude = endLongitude;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Long getIdCoin() {
		return idCoin;
	}

	public void setIdCoin(Long idCoin) {
		this.idCoin = idCoin;
	}

	public String getCoinName() {
		return coinName;
	}

	public void setCoinName(String coinName) {
		this.coinName = coinName;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FixedFare [idFixedFare=" + idFixedFare + ", name=" + name + ", idStartCity=" + idStartCity
				+ ", startCityName=" + startCityName + ", startIdState=" + startIdState + ", startStateName="
				+ startStateName + ", startIdContry=" + startIdContry + ", idEndCity=" + idEndCity + ", endCityName="
				+ endCityName + ", endIdState=" + endIdState + ", endStateName=" + endStateName + ", endIdContry="
				+ endIdContry + ", startLatitude=" + startLatitude + ", startLongitude=" + startLongitude
				+ ", endLatitude=" + endLatitude + ", endLongitude=" + endLongitude + ", price=" + price + ", idCoin="
				+ idCoin + ", coinName=" + coinName + ", coinCode=" + coinCode + ", coinValue=" + coinValue
				+ ", status=" + status + "]";
	}
	
	

}
