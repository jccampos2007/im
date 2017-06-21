/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Juan Campos
 *
 */
public class Rider implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long idCompany;
	private String name;
	private String localIdNumber;
	private String emailCompany;
	private Double fee;
	private Integer cutDay;
	private Long idCountry;
	private String countryNameCompany;
	private Boolean statusCompany;
	private Long idUserCompany;
	private Double limitUserCompany;
	private Long idDepartment;
	private String departmentName;
	private Long idCity;
	private String cityName;
	private Boolean statusUserCompany;
	private Long idRider;
	private String identificationRider;
	private String namesRider;
	private String lastNamesRider;
	private String mobileRider;
	private String photoUrlRider;
	private Boolean statusRider;
	private Long idUserRider;
	private Long idCountryRider;
	private String countryNameRider;
	private Long idFamilyRider;
	private Double limitRider;
	private String username;

	/**
	 * 
	 */
	public Rider() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Long idCompany) {
		this.idCompany = idCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalIdNumber() {
		return localIdNumber;
	}

	public void setLocalIdNumber(String localIdNumber) {
		this.localIdNumber = localIdNumber;
	}

	public String getEmailCompany() {
		return emailCompany;
	}

	public void setEmailCompany(String emailCompany) {
		this.emailCompany = emailCompany;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Integer getCutDay() {
		return cutDay;
	}

	public void setCutDay(Integer cutDay) {
		this.cutDay = cutDay;
	}

	public Long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	public String getCountryNameCompany() {
		return countryNameCompany;
	}

	public void setCountryNameCompany(String countryNameCompany) {
		this.countryNameCompany = countryNameCompany;
	}

	public Boolean getStatusCompany() {
		return statusCompany;
	}

	public void setStatusCompany(Boolean statusCompany) {
		this.statusCompany = statusCompany;
	}

	public Long getIdUserCompany() {
		return idUserCompany;
	}

	public void setIdUserCompany(Long idUserCompany) {
		this.idUserCompany = idUserCompany;
	}

	public Double getLimitUserCompany() {
		return limitUserCompany;
	}

	public void setLimitUserCompany(Double limitUserCompany) {
		this.limitUserCompany = limitUserCompany;
	}

	public Long getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Long idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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

	public Boolean getStatusUserCompany() {
		return statusUserCompany;
	}

	public void setStatusUserCompany(Boolean statusUserCompany) {
		this.statusUserCompany = statusUserCompany;
	}

	public Long getIdRider() {
		return idRider;
	}

	public void setIdRider(Long idRider) {
		this.idRider = idRider;
	}

	public String getIdentificationRider() {
		return identificationRider;
	}

	public void setIdentificationRider(String identificationRider) {
		this.identificationRider = identificationRider;
	}

	public String getNamesRider() {
		return namesRider;
	}

	public void setNamesRider(String namesRider) {
		this.namesRider = namesRider;
	}

	public String getLastNamesRider() {
		return lastNamesRider;
	}

	public void setLastNamesRider(String lastNamesRider) {
		this.lastNamesRider = lastNamesRider;
	}

	public String getMobileRider() {
		return mobileRider;
	}

	public void setMobileRider(String mobileRider) {
		this.mobileRider = mobileRider;
	}

	public String getPhotoUrlRider() {
		return photoUrlRider;
	}

	public void setPhotoUrlRider(String photoUrlRider) {
		this.photoUrlRider = photoUrlRider;
	}

	public Boolean getStatusRider() {
		return statusRider;
	}

	public void setStatusRider(Boolean statusRider) {
		this.statusRider = statusRider;
	}

	public Long getIdUserRider() {
		return idUserRider;
	}

	public void setIdUserRider(Long idUserRider) {
		this.idUserRider = idUserRider;
	}

	public Long getIdCountryRider() {
		return idCountryRider;
	}

	public void setIdCountryRider(Long idCountryRider) {
		this.idCountryRider = idCountryRider;
	}

	public String getCountryNameRider() {
		return countryNameRider;
	}

	public void setCountryNameRider(String countryNameRider) {
		this.countryNameRider = countryNameRider;
	}

	public Long getIdFamilyRider() {
		return idFamilyRider;
	}

	public void setIdFamilyRider(Long idFamilyRider) {
		this.idFamilyRider = idFamilyRider;
	}

	public Double getLimitRider() {
		return limitRider;
	}

	public void setLimitRider(Double limitRider) {
		this.limitRider = limitRider;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Rider [idCompany=" + idCompany + ", name=" + name + ", localIdNumber=" + localIdNumber
				+ ", emailCompany=" + emailCompany + ", fee=" + fee + ", cutDay=" + cutDay + ", idCountry=" + idCountry
				+ ", countryNameCompany=" + countryNameCompany + ", statusCompany=" + statusCompany + ", idUserCompany="
				+ idUserCompany + ", limitUserCompany=" + limitUserCompany + ", idDepartment=" + idDepartment
				+ ", departmentName=" + departmentName + ", idCity=" + idCity + ", cityName=" + cityName
				+ ", statusUserCompany=" + statusUserCompany + ", idRider=" + idRider + ", identificationRider="
				+ identificationRider + ", namesRider=" + namesRider + ", lastNamesRider=" + lastNamesRider
				+ ", mobileRider=" + mobileRider + ", photoUrlRider=" + photoUrlRider + ", statusRider=" + statusRider
				+ ", idUserRider=" + idUserRider + ", idCountryRider=" + idCountryRider + ", countryNameRider="
				+ countryNameRider + ", idFamilyRider=" + idFamilyRider + ", limitRider=" + limitRider + ", username="
				+ username + "]";
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class ResponseDataRiderSignUp{
		
		private Long idRider;
		private Long idUser;
		
		public ResponseDataRiderSignUp() {
			// TODO Auto-generated constructor stub
		}

		public Long getIdRider() {
			return idRider;
		}

		public void setIdRider(Long idRider) {
			this.idRider = idRider;
		}

		public Long getIdUser() {
			return idUser;
		}

		public void setIdUser(Long idUser) {
			this.idUser = idUser;
		}

		@Override
		public String toString() {
			return "ResponseDataRiderSignUp [idRider=" + idRider + ", idUser=" + idUser + "]";
		}

	}

}
