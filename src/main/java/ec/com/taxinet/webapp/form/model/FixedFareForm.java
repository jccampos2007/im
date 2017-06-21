package ec.com.taxinet.webapp.form.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class FixedFareForm {
	
	private String name;
	private Float price;
	private String startPlace;
	private String endPlace;
	private String startLatitude;
	private String startLongitude;
	private String endLatitude;
	private String endLongitude;
	private Long idCoin;
	private Long idEndCity;
	private Long idStartCity;
	private Long idUserSession;
	private String tokenSession;

	
	public FixedFareForm(){
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	public String getStartPlace() {
		return startPlace;
	}


	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}


	public String getEndPlace() {
		return endPlace;
	}


	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}


	public String getStartLatitude() {
		return startLatitude;
	}


	public void setStartLatitude(String startLatitude) {
		this.startLatitude = startLatitude;
	}


	public String getStartLongitude() {
		return startLongitude;
	}


	public void setStartLongitude(String startLongitude) {
		this.startLongitude = startLongitude;
	}


	public String getEndLatitude() {
		return endLatitude;
	}


	public void setEndLatitude(String endLatitude) {
		this.endLatitude = endLatitude;
	}


	public String getEndLongitude() {
		return endLongitude;
	}


	public void setEndLongitude(String endLongitude) {
		this.endLongitude = endLongitude;
	}


	public Long getIdCoin() {
		return idCoin;
	}


	public void setIdCoin(Long idCoin) {
		this.idCoin = idCoin;
	}


	public Long getIdEndCity() {
		return idEndCity;
	}


	public void setIdEndCity(Long idEndCity) {
		this.idEndCity = idEndCity;
	}


	public Long getIdStartCity() {
		return idStartCity;
	}


	public void setIdStartCity(Long idStartCity) {
		this.idStartCity = idStartCity;
	}


	public Long getIdUserSession() {
		return idUserSession;
	}


	public void setIdUserSession(Long idUserSession) {
		this.idUserSession = idUserSession;
	}


	public String getTokenSession() {
		return tokenSession;
	}


	public void setTokenSession(String tokenSession) {
		this.tokenSession = tokenSession;
	}


	@Override
	public String toString() {
		return "FixedFareForm [name=" + name + ", price=" + price + ", startPlace=" + startPlace + ", endPlace="
				+ endPlace + ", startLatitude=" + startLatitude + ", startLongitude=" + startLongitude
				+ ", endLatitude=" + endLatitude + ", endLongitude=" + endLongitude + ", idCoin=" + idCoin
				+ ", idEndCity=" + idEndCity + ", idStartCity=" + idStartCity + ", idUserSession=" + idUserSession
				+ ", tokenSession=" + tokenSession + "]";
	}
	
	

}
