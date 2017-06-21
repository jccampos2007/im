/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Juan Campos
 *
 */
public class RiderForm {

	private Long idUserRider;
	private Long idRider;
	private Long idCountryCatalog;
	private String cityRegister;
	private String countryName;
	private String countryRegister;
	private String email;
	private String lastNames;
	private String names;
	private String password;
	private String phoneNumber;
	private String stateRegister;
	private String username;
	private Long idCity;
	private Long idDepartment;
	private Double limit;
	private Boolean statusUserCompany;

	/**
	 * 
	 */
	public RiderForm() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdUserRider() {
		return idUserRider;
	}

	public void setIdUserRider(Long idUserRider) {
		this.idUserRider = idUserRider;
	}

	public Long getIdRider() {
		return idRider;
	}

	public void setIdRider(Long idRider) {
		this.idRider = idRider;
	}

	public Long getIdCountryCatalog() {
		return idCountryCatalog;
	}

	public void setIdCountryCatalog(Long idCountryCatalog) {
		this.idCountryCatalog = idCountryCatalog;
	}

	public String getCityRegister() {
		return cityRegister;
	}

	public void setCityRegister(String cityRegister) {
		this.cityRegister = cityRegister;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryRegister() {
		return countryRegister;
	}

	public void setCountryRegister(String countryRegister) {
		this.countryRegister = countryRegister;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStateRegister() {
		return stateRegister;
	}

	public void setStateRegister(String stateRegister) {
		this.stateRegister = stateRegister;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getIdCity() {
		return idCity;
	}

	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}

	public Long getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Long idDepartment) {
		this.idDepartment = idDepartment;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public Boolean getStatusUserCompany() {
		return statusUserCompany;
	}

	public void setStatusUserCompany(Boolean statusUserCompany) {
		this.statusUserCompany = statusUserCompany;
	}

	@Override
	public String toString() {
		return "RiderForm [idUserRider=" + idUserRider + ", idRider=" + idRider + ", idCountryCatalog="
				+ idCountryCatalog + ", cityRegister=" + cityRegister + ", countryName=" + countryName
				+ ", countryRegister=" + countryRegister + ", email=" + email + ", lastNames=" + lastNames + ", names="
				+ names + ", password=" + password + ", phoneNumber=" + phoneNumber + ", stateRegister=" + stateRegister
				+ ", username=" + username + ", idCity=" + idCity + ", idDepartment=" + idDepartment + ", limit="
				+ limit + ", statusUserCompany=" + statusUserCompany + "]";
	}

	@JsonInclude(Include.NON_NULL)
	public static class RiderSignUpFrom{
		
		public RiderSignUpFrom(){
			
		}
		
		private String cityRegister;
		private String countryName;
		private String countryRegister;
		private String email;
		private String lastNames;
		private String names;
		private String password;
		private String phoneNumber;
		private String stateRegister;
		private Double limit;
		private String username;
		
		public String getCityRegister() {
			return cityRegister;
		}
		public void setCityRegister(String cityRegister) {
			this.cityRegister = cityRegister;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public String getCountryRegister() {
			return countryRegister;
		}
		public void setCountryRegister(String countryRegister) {
			this.countryRegister = countryRegister;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLastNames() {
			return lastNames;
		}
		public void setLastNames(String lastNames) {
			this.lastNames = lastNames;
		}
		public String getNames() {
			return names;
		}
		public void setNames(String names) {
			this.names = names;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getStateRegister() {
			return stateRegister;
		}
		public void setStateRegister(String stateRegister) {
			this.stateRegister = stateRegister;
		}
		public Double getLimit() {
			return limit;
		}
		public void setLimit(Double limit) {
			this.limit = limit;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		@Override
		public String toString() {
			return "RiderSignUpFrom [cityRegister=" + cityRegister + ", countryName=" + countryName
					+ ", countryRegister=" + countryRegister + ", email=" + email + ", lastNames=" + lastNames
					+ ", names=" + names + ", password=" + password + ", phoneNumber=" + phoneNumber
					+ ", stateRegister=" + stateRegister + ", limit=" + limit + ", username=" + username + "]";
		}

	}
	
	@JsonInclude(Include.NON_NULL)
	public static class ManageUserCompanyRiderFrom{
		
		public ManageUserCompanyRiderFrom(){
			
		}

		private Long idCity;
		private Long idCompany;
		private Long idDepartment;
		private Long idUser;
		private Long idUserSession;
		private Double limit;
		private Boolean statusUserCompany;
		private String tokenSession;
		
		public Long getIdCity() {
			return idCity;
		}
		
		public void setIdCity(Long idCity) {
			this.idCity = idCity;
		}
		
		public Long getIdCompany() {
			return idCompany;
		}
		
		public void setIdCompany(Long idCompany) {
			this.idCompany = idCompany;
		}
		
		public Long getIdDepartment() {
			return idDepartment;
		}
		
		public void setIdDepartment(Long idDepartment) {
			this.idDepartment = idDepartment;
		}
		
		public Long getIdUser() {
			return idUser;
		}
		
		public void setIdUser(Long idUser) {
			this.idUser = idUser;
		}
		
		public Long getIdUserSession() {
			return idUserSession;
		}
		
		public void setIdUserSession(Long idUserSession) {
			this.idUserSession = idUserSession;
		}
		
		public Double getLimit() {
			return limit;
		}
		
		public void setLimit(Double limit) {
			this.limit = limit;
		}
		
		public Boolean getStatusUserCompany() {
			return statusUserCompany;
		}
		
		public void setStatusUserCompany(Boolean statusUserCompany) {
			this.statusUserCompany = statusUserCompany;
		}
		
		public String getTokenSession() {
			return tokenSession;
		}
		
		public void setTokenSession(String tokenSession) {
			this.tokenSession = tokenSession;
		}
		
		@Override
		public String toString() {
			return "ManageUserCompanyRiderFrom [idCity=" + idCity + ", idCompany=" + idCompany + ", idDepartment="
					+ idDepartment + ", idUser=" + idUser + ", idUserSession=" + idUserSession + ", limit=" + limit
					+ ", statusUserCompany=" + statusUserCompany + ", tokenSession=" + tokenSession + "]";
		}
		
		@JsonInclude(Include.NON_NULL)
		public static class ManageRiderStatusFrom{
			
			public ManageRiderStatusFrom(){
				
			}

			private Long idUser;
			private Long idRider;
			private Integer statusRider;
			private Long idUserSession;
			private String tokenSession;
			
			public Long getIdUser() {
				return idUser;
			}
			
			public void setIdUser(Long idUser) {
				this.idUser = idUser;
			}
			
			public Long getIdRider() {
				return idRider;
			}
			
			public void setIdRider(Long idRider) {
				this.idRider = idRider;
			}
			
			public Integer getStatusRider() {
				return statusRider;
			}
			
			public void setStatusRider(Integer statusRider) {
				this.statusRider = statusRider;
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
				return "ManageRiderStatusFrom [idUser=" + idUser + ", idRider=" + idRider + ", statusRider="
						+ statusRider + ", idUserSession=" + idUserSession + ", tokenSession=" + tokenSession + "]";
			}
			
		}
		
		@JsonInclude(Include.NON_NULL)
		public static class ManageRiderWebFrom{
			
			public ManageRiderWebFrom(){
				
			}

			private Long idRider;
			private String email;
			private Long idCountryCatalog;
			private String identification;
			private String lastNames;
			private Double limit;
			private String mobile;
			private String names;
			private String photoUrl;
			private Boolean status;
			private String token;
			private Long idUserSession;
			private String tokenSession;
			
			public Long getIdRider() {
				return idRider;
			}
			public void setIdRider(Long idRider) {
				this.idRider = idRider;
			}
			
			public String getEmail() {
				return email;
			}
			
			public void setEmail(String email) {
				this.email = email;
			}
			
			public Long getIdCountryCatalog() {
				return idCountryCatalog;
			}
			
			public void setIdCountryCatalog(Long idCountryCatalog) {
				this.idCountryCatalog = idCountryCatalog;
			}
			
			public String getIdentification() {
				return identification;
			}
			
			public void setIdentification(String identification) {
				this.identification = identification;
			}
			
			public String getLastNames() {
				return lastNames;
			}
			
			public void setLastNames(String lastNames) {
				this.lastNames = lastNames;
			}
			
			public Double getLimit() {
				return limit;
			}
			
			public void setLimit(Double limit) {
				this.limit = limit;
			}
			
			public String getMobile() {
				return mobile;
			}
			public void setMobile(String mobile) {
				this.mobile = mobile;
			}
			
			public String getNames() {
				return names;
			}
			
			public void setNames(String names) {
				this.names = names;
			}
			public String getPhotoUrl() {
				return photoUrl;
			}
			
			public void setPhotoUrl(String photoUrl) {
				this.photoUrl = photoUrl;
			}
			
			public Boolean getStatus() {
				return status;
			}
			
			public void setStatus(Boolean status) {
				this.status = status;
			}
			
			public String getToken() {
				return token;
			}
			
			public void setToken(String token) {
				this.token = token;
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
				return "ManageRiderWebFrom [idRider=" + idRider + ", email=" + email + ", idCountryCatalog="
						+ idCountryCatalog + ", identification=" + identification + ", lastNames=" + lastNames
						+ ", limit=" + limit + ", mobile=" + mobile + ", names=" + names + ", photoUrl=" + photoUrl
						+ ", status=" + status + ", token=" + token + ", idUserSession=" + idUserSession
						+ ", tokenSession=" + tokenSession + "]";
			}
			
		}
		
	}
}
