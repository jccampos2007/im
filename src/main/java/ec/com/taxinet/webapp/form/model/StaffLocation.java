package ec.com.taxinet.webapp.form.model;

public class StaffLocation {
	
	private Long idStaff;
	private Long idUser;
	private Long idCountry;
	private String countryName;
	private Long idState;
	private String stateName;
	private Long idCity;
	private String cityName;
	private String username;
	private Long idRole;
	private String roleName; 
		
	public StaffLocation() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdStaff() {
		return idStaff;
	}

	public void setIdStaff(Long idStaff) {
		this.idStaff = idStaff;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
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

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "StaffLocation [idStaff=" + idStaff + ", idUser=" + idUser + ", idCountry=" + idCountry
				+ ", countryName=" + countryName + ", idState=" + idState + ", stateName=" + stateName + ", idCity="
				+ idCity + ", cityName=" + cityName + ", username=" + username + ", idRole=" + idRole + ", roleName="
				+ roleName + "]";
	}

}
