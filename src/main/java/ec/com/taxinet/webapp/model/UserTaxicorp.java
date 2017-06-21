package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class UserTaxicorp  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long idTaxiCorp;
	private String name;
	private Long idCity;
	private String cityName;
	private String username;
	private String email;
	
	public UserTaxicorp(){
		
	}

	public Long getIdTaxiCorp() {
		return idTaxiCorp;
	}

	public void setIdTaxiCorp(Long idTaxiCorp) {
		this.idTaxiCorp = idTaxiCorp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserTaxicorp [idTaxiCorp=" + idTaxiCorp + ", name=" + name + ", idCity=" + idCity + ", cityName="
				+ cityName + ", username=" + username + ", email=" + email + "]";
	}
	
	
	

}
