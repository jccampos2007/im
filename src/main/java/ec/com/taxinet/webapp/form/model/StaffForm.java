package ec.com.taxinet.webapp.form.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class StaffForm {

	private String birthdate;
	private String email;
	private String fathersLastName;
	private String firstName;
	private Long idRole;
	private Long idUserSession;
	private String middleName;
	private String mobile;
	private String motherLastName;
	private String password;
	private String sessionToken;
	private List<StaffLocationForm> staffLocation;
	private Integer status;
	private String username;
	
	
	public StaffForm(){
		
	}


	
	
	public String getBirthdate() {
		return birthdate;
	}




	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getFathersLastName() {
		return fathersLastName;
	}




	public void setFathersLastName(String fathersLastName) {
		this.fathersLastName = fathersLastName;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public Long getIdRole() {
		return idRole;
	}




	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}




	public Long getIdUserSession() {
		return idUserSession;
	}




	public void setIdUserSession(Long idUserSession) {
		this.idUserSession = idUserSession;
	}




	public String getMiddleName() {
		return middleName;
	}




	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}




	public String getMobile() {
		return mobile;
	}




	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	public String getMotherLastName() {
		return motherLastName;
	}




	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getSessionToken() {
		return sessionToken;
	}




	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}




	public List<StaffLocationForm> getStaffLocation() {
		return staffLocation;
	}




	public void setStaffLocation(List<StaffLocationForm> staffLocation) {
		this.staffLocation = staffLocation;
	}




	public Integer getStatus() {
		return status;
	}




	public void setStatus(Integer status) {
		this.status = status;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}

	
	

	@Override
	public String toString() {
		return "StaffForm [birthdate=" + birthdate + ", email=" + email + ", fathersLastName=" + fathersLastName
				+ ", firstName=" + firstName + ", idRole=" + idRole + ", idUserSession=" + idUserSession
				+ ", middleName=" + middleName + ", mobile=" + mobile + ", motherLastName=" + motherLastName
				+ ", password=" + password + ", sessionToken=" + sessionToken + ", staffLocation=" + staffLocation
				+ ", status=" + status + ", username=" + username + "]";
	}




	@JsonInclude(Include.NON_NULL)
	public static class StaffLocationForm{
		
		public StaffLocationForm(){
			
		}
		
		
		private Long idCity;
		private Long idCountry;
		private Long idState;
		
		
		public Long getIdCity() {
			return idCity;
		}
		public void setIdCity(Long idCity) {
			this.idCity = idCity;
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
		
		
		@Override
		public String toString() {
			return "StaffLocation [idCity=" + idCity + ", idCountry=" + idCountry + ", idState=" + idState + "]";
		}
	
	}

	@JsonInclude(Include.NON_NULL)
	public static class StaffEditForm{
	
		public StaffEditForm(){
			
		}


		private String birthdate;
		private String email;
		private String fathersLastName;
		private String fisrtName;
		private Long idStaff;
		private Long idUserSession;
		private String middleName;
		private String mobile;
		private String motherLastName;
		private String sessionToken;
		private Integer status;
		private List<StaffLocationForm> staffLocation;
		
		
		
		public List<StaffLocationForm> getStaffLocation() {
			return staffLocation;
		}
		public void setStaffLocation(List<StaffLocationForm> staffLocation) {
			this.staffLocation = staffLocation;
		}
		public String getBirthdate() {
			return birthdate;
		}
		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFathersLastName() {
			return fathersLastName;
		}
		public void setFathersLastName(String fathersLastName) {
			this.fathersLastName = fathersLastName;
		}
		public String getFisrtName() {
			return fisrtName;
		}
		public void setFisrtName(String fisrtName) {
			this.fisrtName = fisrtName;
		}
		
		public Long getIdStaff() {
			return idStaff;
		}
		public void setIdStaff(Long idStaff) {
			this.idStaff = idStaff;
		}
		
		public Long getIdUserSession() {
			return idUserSession;
		}
		public void setIdUserSession(Long idUserSession) {
			this.idUserSession = idUserSession;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getMotherLastName() {
			return motherLastName;
		}
		public void setMotherLastName(String motherLastName) {
			this.motherLastName = motherLastName;
		}
		public String getSessionToken() {
			return sessionToken;
		}
		public void setSessionToken(String sessionToken) {
			this.sessionToken = sessionToken;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		
		
		@Override
		public String toString() {
			return "StaffEditForm [birthdate=" + birthdate + ", email=" + email + ", fathersLastName=" + fathersLastName
					+ ", fisrtName=" + fisrtName + ", idStaff=" + idStaff + ", idUserSession=" + idUserSession
					+ ", middleName=" + middleName + ", mobile=" + mobile + ", motherLastName=" + motherLastName
					+ ", sessionToken=" + sessionToken + ", status=" + status + ", staffLocation=" + staffLocation
					+ "]";
		}
		
		
		
		@JsonInclude(Include.NON_NULL)
		public static class LocationEditForm extends StaffLocationForm {
		
			public LocationEditForm(){
				
			}
			
			private Long idStaff;
			private Long idUserSession;
			private Boolean statusLocation;
			private String tokenSession;
			
			public Long getIdStaff() {
				return idStaff;
			}
			public void setIdStaff(Long idStaff) {
				this.idStaff = idStaff;
			}
			public Long getIdUserSession() {
				return idUserSession;
			}
			public void setIdUserSession(Long idUserSession) {
				this.idUserSession = idUserSession;
			}
			public Boolean getStatusLocation() {
				return statusLocation;
			}
			public void setStatusLocation(Boolean statusLocation) {
				this.statusLocation = statusLocation;
			}
			public String getTokenSession() {
				return tokenSession;
			}
			public void setTokenSession(String tokenSession) {
				this.tokenSession = tokenSession;
			}
			
			
			@Override
			public String toString() {
				return "LocationEditForm [idStaff=" + idStaff + ", idUserSession=" + idUserSession + ", statusLocation="
						+ statusLocation + ", tokenSession=" + tokenSession + ", getIdCity()=" + getIdCity()
						+ ", getIdCountry()=" + getIdCountry() + ", getIdState()=" + getIdState() + ", toString()="
						+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
			}
			
		}
			
			
		
	}
	

}
