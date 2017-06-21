package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class LocationInf  implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Long idCountryCatalog;
	private String countryName;
	private Long idStateCatalog;
	private String stateName;
	private Long idCity;
	private String cityName;
	
	public LocationInf(){
		
	}

	public Long getIdCountryCatalog() {
		return idCountryCatalog;
	}

	public void setIdCountryCatalog(Long idCountryCatalog) {
		this.idCountryCatalog = idCountryCatalog;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Long getIdStateCatalog() {
		return idStateCatalog;
	}

	public void setIdStateCatalog(Long idStateCatalog) {
		this.idStateCatalog = idStateCatalog;
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

	@Override
	public String toString() {
		return "LocationInf [idCountryCatalog=" + idCountryCatalog + ", countryName=" + countryName
				+ ", idStateCatalog=" + idStateCatalog + ", stateName=" + stateName + ", idCity=" + idCity
				+ ", cityName=" + cityName + "]";
	}
	
	

}
