/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idCountry;
	private Long idState;
	private Long idCity;
	private String countryName;
	private String stateName;
	private String cityName;
	private Integer statusCountry;
	private Integer statusState;
	private Integer statusCity;
	
	/**
	 * 
	 */
	public City() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	public Long getIdState() {
		return idState;
	}

	public void setIdState(Long idState) {
		this.idState = idState;
	}

	public Long getIdCity() {
		return idCity;
	}

	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getStatusCountry() {
		return statusCountry;
	}

	public void setStatusCountry(Integer statusCountry) {
		this.statusCountry = statusCountry;
	}

	public Integer getStatusState() {
		return statusState;
	}

	public void setStatusState(Integer statusState) {
		this.statusState = statusState;
	}

	public Integer getStatusCity() {
		return statusCity;
	}

	public void setStatusCity(Integer statusCity) {
		this.statusCity = statusCity;
	}

	@Override
	public String toString() {
		return "City [idCountry=" + idCountry + ", idState=" + idState + ", idCity=" + idCity + ", countryName="
				+ countryName + ", stateName=" + stateName + ", cityName=" + cityName + ", statusCountry="
				+ statusCountry + ", statusState=" + statusState + ", statusCity=" + statusCity + "]";
	}
	
}
