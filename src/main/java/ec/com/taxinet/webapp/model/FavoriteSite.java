/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Jccampos
 *
 */
public class FavoriteSite implements Serializable {

	/**
	 * 
	 */
	public FavoriteSite() {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;
	private Long idFavoriteSite;
	private Double latitude;
	private Double longitude;
	private String address;
	private String name;
	private String reference;
	private String neighborhoodName;
	private String cityName;
	private String stateName;
	private String countryName;
	
	public Long getidFavoriteSite() {
		return idFavoriteSite;
	}
	public Double getLatitude() {
		return latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public String getReference() {
		return reference;
	}
	public String getNeighborhoodName() {
		return neighborhoodName;
	}
	public String getCityName() {
		return cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setidFavoriteSite(Long idFavoriteSite) {
		this.idFavoriteSite = idFavoriteSite;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public void setNeighborhoodName(String neighborhoodName) {
		this.neighborhoodName = neighborhoodName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	@Override
	public String toString() {
		return "FavoriteSite [idFavoriteSite=" + idFavoriteSite + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", address=" + address + ", name=" + name + ", reference=" + reference + ", neighborhoodName="
				+ neighborhoodName + ", cityName=" + cityName + ", stateName=" + stateName + ", countryName="
				+ countryName + "]";
	}

}
