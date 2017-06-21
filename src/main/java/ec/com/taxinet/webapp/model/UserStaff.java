package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class UserStaff implements Serializable {
	
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	private List<Staff> serStaffList;


	public UserStaff(){
		
		
	}
	

	
	
	public List<Staff> getSerStaffList() {
		return serStaffList;
	}




	public void setSerStaffList(List<Staff> serStaffList) {
		this.serStaffList = serStaffList;
	}




	@Override
	public String toString() {
		return "UserStaff [serStaffList=" + serStaffList + "]";
	}	
	
	@JsonInclude(Include.NON_NULL)
	public static class Staff{
		
		
		public Staff(){
			
			
		}
		
		
		private Long idStaff;
		private String firstName;
		private String middleName;
		private String fathersLastName;
		private String birthdate;
		private String mobile;
		private String email;
		private Integer status;
		private Long idUser;
		private String username;
		private Long idRole;
		private String roleName;
		private String s_motherLastName;
		private List<StaffLocationList> staffLocationList;
		
		
		
		public List<StaffLocationList> getStaffLocationList() {
			return staffLocationList;
		}
		public void setStaffLocationList(List<StaffLocationList> staffLocationList) {
			this.staffLocationList = staffLocationList;
		}
		public Long getIdStaff() {
			return idStaff;
		}
		public void setIdStaff(Long idStaff) {
			this.idStaff = idStaff;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getFathersLastName() {
			return fathersLastName;
		}
		public void setFathersLastName(String fathersLastName) {
			this.fathersLastName = fathersLastName;
		}
		public String getBirthdate() {
			return birthdate;
		}
		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Long getIdUser() {
			return idUser;
		}
		public void setIdUser(Long idUser) {
			this.idUser = idUser;
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
		public String getS_motherLastName() {
			return s_motherLastName;
		}
		public void setS_motherLastName(String s_motherLastName) {
			this.s_motherLastName = s_motherLastName;
		}
		
		
		@Override
		public String toString() {
			return "Staff [idStaff=" + idStaff + ", firstName=" + firstName + ", middleName=" + middleName
					+ ", fathersLastName=" + fathersLastName + ", birthdate=" + birthdate + ", mobile=" + mobile
					+ ", email=" + email + ", status=" + status + ", idUser=" + idUser + ", username=" + username
					+ ", idRole=" + idRole + ", roleName=" + roleName + ", s_motherLastName=" + s_motherLastName
					+ ", staffLocationList=" + staffLocationList + "]";
		}
		
		
	}
	
	
	@JsonInclude(Include.NON_NULL)
	public static class StaffLocationList{
		
		public StaffLocationList(){
			
		}
		
		
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
			return "StaffLocationList [idStaff=" + idStaff + ", idUser=" + idUser + ", idCountry=" + idCountry
					+ ", countryName=" + countryName + ", idState=" + idState + ", stateName=" + stateName + ", idCity="
					+ idCity + ", cityName=" + cityName + ", username=" + username + ", idRole=" + idRole
					+ ", roleName=" + roleName + "]";
		}
		
		
	}

}
