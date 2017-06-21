package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.Date;

public class Family implements Serializable {
	/**
	 * "identification": "301403883",
      "names": "Ana Valentina",
      "lastNames": "Delgado",
      "email": "valentinajjk@gmail.com",
      "mobile": "0261388383",
      "photoUrl": "http://localhost:8080/Taxinet-1.0.3/images/defaul_user_photo.jpg",
      "status": 1,
      "token": "301403883",
      "idUser": 12,
      "idCountryCatalog": 3,
      "idFamilyRider": 3,
      "limit": 20,
      "createdBy": 1,
      "createdDate": "2016-10-24",
      "modifiedBy": 1,
      "modifiedDate": "2016-10-24",
      "contryNameSingup": null,
      "stateNameSingup": null,
      "cityNameSingup": null
	 */	
	private static final long serialVersionUID = 1L;
	private Long idRider;
	private String identification;
	private String names;
	private String lastNames;
	private String email;
	private String mobile;
	private String photoUrl;
	private Long status;
	private String token;
	private Long idUser;
	private Long idCountryCatalog;
	private Long idFamilyRider;
	private Double limit;
	private Long createdBy;
	private Date createdDate;
	private Long modifiedBy;
	private Date modifiedDate;
	private String contryNameSingup;
	private String stateNameSingup;
	private String cityNameSingup;
	public Long getIdRider() {
		return idRider;
	}
	public void setIdRider(Long idRider) {
		this.idRider = idRider;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getLastNames() {
		return lastNames;
	}
	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Long getIdCountryCatalog() {
		return idCountryCatalog;
	}
	public void setIdCountryCatalog(Long idCountryCatalog) {
		this.idCountryCatalog = idCountryCatalog;
	}
	public Long getIdFamilyRider() {
		return idFamilyRider;
	}
	public void setIdFamilyRider(Long idFamilyRider) {
		this.idFamilyRider = idFamilyRider;
	}
	public Double getLimit() {
		return limit;
	}
	public void setLimit(Double limit) {
		this.limit = limit;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getContryNameSingup() {
		return contryNameSingup;
	}
	public void setContryNameSingup(String contryNameSingup) {
		this.contryNameSingup = contryNameSingup;
	}
	public String getStateNameSingup() {
		return stateNameSingup;
	}
	public void setStateNameSingup(String stateNameSingup) {
		this.stateNameSingup = stateNameSingup;
	}
	public String getCityNameSingup() {
		return cityNameSingup;
	}
	public void setCityNameSingup(String cityNameSingup) {
		this.cityNameSingup = cityNameSingup;
	}
	
	@Override
	public String toString() {
		return "family [idRider=" + idRider + ", identification=" + identification + ", names=" + names + ", lastNames="
				+ lastNames + ", email=" + email + ", mobile=" + mobile + ", photoUrl=" + photoUrl + ", status="
				+ status + ", token=" + token + ", idUser=" + idUser + ", idCountryCatalog=" + idCountryCatalog
				+ ", idFamilyRider=" + idFamilyRider + ", limit=" + limit + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
				+ ", contryNameSingup=" + contryNameSingup + ", stateNameSingup=" + stateNameSingup
				+ ", cityNameSingup=" + cityNameSingup + "]";
	}
	
	
	

}
