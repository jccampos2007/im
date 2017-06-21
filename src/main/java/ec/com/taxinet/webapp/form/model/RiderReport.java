package ec.com.taxinet.webapp.form.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class RiderReport  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long r_idRider;
	private String r_identification;
	private String r_names;
	private String r_lastNames;
	private String r_mobile;
	private String r_photoUrl;
	private Integer r_status;
	private Long r_idUser;
	private Long r_idCountry;
	private String r_CountryName;
	private Long r_idFamilyRider;
	private Float r_limit;
	private Long uc_idDepartment;
	private String uc_DepartmentName;
	private String c_email;
	private Float c_fee;
	private Long c_idCountry;
	private String c_CountryName;
	private Integer c_status;
	private Long uc_idUserCompany;
	private Float uc_limit;
	private Long uc_idCity;
	private String uc_CityName;
	private Integer uc_status;
	private String u_username;
	private Integer c_cutDay;
	private Long c_localIdNumber;
	private Long c_idCompany;
	private String c_name;
	private String r_email;
	
	private String r_createdDate;
	private String r_statusName;
	private Timestamp createdTS;
	
	public RiderReport(){
		
	}

	public Long getR_idRider() {
		return r_idRider;
	}

	public void setR_idRider(Long r_idRider) {
		this.r_idRider = r_idRider;
	}

	public String getR_identification() {
		return r_identification;
	}

	public void setR_identification(String r_identification) {
		this.r_identification = r_identification;
	}

	public String getR_names() {
		return r_names;
	}

	public void setR_names(String r_names) {
		this.r_names = r_names;
	}

	public String getR_lastNames() {
		return r_lastNames;
	}

	public void setR_lastNames(String r_lastNames) {
		this.r_lastNames = r_lastNames;
	}

	public String getR_mobile() {
		return r_mobile;
	}

	public void setR_mobile(String r_mobile) {
		this.r_mobile = r_mobile;
	}

	public String getR_photoUrl() {
		return r_photoUrl;
	}

	public void setR_photoUrl(String r_photoUrl) {
		this.r_photoUrl = r_photoUrl;
	}

	public Integer getR_status() {
		return r_status;
	}

	public void setR_status(Integer r_status) {
		this.r_status = r_status;
	}

	public Long getR_idUser() {
		return r_idUser;
	}

	public void setR_idUser(Long r_idUser) {
		this.r_idUser = r_idUser;
	}

	public Long getR_idCountry() {
		return r_idCountry;
	}

	public void setR_idCountry(Long r_idCountry) {
		this.r_idCountry = r_idCountry;
	}

	public String getR_CountryName() {
		return r_CountryName;
	}

	public void setR_CountryName(String r_CountryName) {
		this.r_CountryName = r_CountryName;
	}

	public Long getR_idFamilyRider() {
		return r_idFamilyRider;
	}

	public void setR_idFamilyRider(Long r_idFamilyRider) {
		this.r_idFamilyRider = r_idFamilyRider;
	}

	public Float getR_limit() {
		return r_limit;
	}

	public void setR_limit(Float r_limit) {
		this.r_limit = r_limit;
	}

	public Long getUc_idDepartment() {
		return uc_idDepartment;
	}

	public void setUc_idDepartment(Long uc_idDepartment) {
		this.uc_idDepartment = uc_idDepartment;
	}

	public String getUc_DepartmentName() {
		return uc_DepartmentName;
	}

	public void setUc_DepartmentName(String uc_DepartmentName) {
		this.uc_DepartmentName = uc_DepartmentName;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}

	public Float getC_fee() {
		return c_fee;
	}

	public void setC_fee(Float c_fee) {
		this.c_fee = c_fee;
	}

	public Long getC_idCountry() {
		return c_idCountry;
	}

	public void setC_idCountry(Long c_idCountry) {
		this.c_idCountry = c_idCountry;
	}

	public String getC_CountryName() {
		return c_CountryName;
	}

	public void setC_CountryName(String c_CountryName) {
		this.c_CountryName = c_CountryName;
	}

	public Integer getC_status() {
		return c_status;
	}

	public void setC_status(Integer c_status) {
		this.c_status = c_status;
	}

	public Long getUc_idUserCompany() {
		return uc_idUserCompany;
	}

	public void setUc_idUserCompany(Long uc_idUserCompany) {
		this.uc_idUserCompany = uc_idUserCompany;
	}

	public Float getUc_limit() {
		return uc_limit;
	}

	public void setUc_limit(Float uc_limit) {
		this.uc_limit = uc_limit;
	}

	public Long getUc_idCity() {
		return uc_idCity;
	}

	public void setUc_idCity(Long uc_idCity) {
		this.uc_idCity = uc_idCity;
	}

	public String getUc_CityName() {
		return uc_CityName;
	}

	public void setUc_CityName(String uc_CityName) {
		this.uc_CityName = uc_CityName;
	}

	public Integer getUc_status() {
		return uc_status;
	}

	public void setUc_status(Integer uc_status) {
		this.uc_status = uc_status;
	}

	public String getU_username() {
		return u_username;
	}

	public void setU_username(String u_username) {
		this.u_username = u_username;
	}

	public Integer getC_cutDay() {
		return c_cutDay;
	}

	public void setC_cutDay(Integer c_cutDay) {
		this.c_cutDay = c_cutDay;
	}

	public Long getC_localIdNumber() {
		return c_localIdNumber;
	}

	public void setC_localIdNumber(Long c_localIdNumber) {
		this.c_localIdNumber = c_localIdNumber;
	}

	public Long getC_idCompany() {
		return c_idCompany;
	}

	public void setC_idCompany(Long c_idCompany) {
		this.c_idCompany = c_idCompany;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getR_createdDate() {
		return r_createdDate;
	}

	public void setR_createdDate(String r_createdDate) {
		this.r_createdDate = r_createdDate;
	}

	public String getR_statusName() {
		return r_statusName;
	}

	public void setR_statusName(String r_statusName) {
		this.r_statusName = r_statusName;
	}

	public Timestamp getCreatedTS() {
		return createdTS;
	}

	public void setCreatedTS(Timestamp createdTS) {
		this.createdTS = createdTS;
	}

	public String getR_email() {
		return r_email;
	}

	public void setR_email(String r_email) {
		this.r_email = r_email;
	}

	@Override
	public String toString() {
		return "RiderReport [r_idRider=" + r_idRider + ", r_identification=" + r_identification + ", r_names=" + r_names
				+ ", r_lastNames=" + r_lastNames + ", r_mobile=" + r_mobile + ", r_photoUrl=" + r_photoUrl
				+ ", r_status=" + r_status + ", r_idUser=" + r_idUser + ", r_idCountry=" + r_idCountry
				+ ", r_CountryName=" + r_CountryName + ", r_idFamilyRider=" + r_idFamilyRider + ", r_limit=" + r_limit
				+ ", uc_idDepartment=" + uc_idDepartment + ", uc_DepartmentName=" + uc_DepartmentName + ", c_email="
				+ c_email + ", c_fee=" + c_fee + ", c_idCountry=" + c_idCountry + ", c_CountryName=" + c_CountryName
				+ ", c_status=" + c_status + ", uc_idUserCompany=" + uc_idUserCompany + ", uc_limit=" + uc_limit
				+ ", uc_idCity=" + uc_idCity + ", uc_CityName=" + uc_CityName + ", uc_status=" + uc_status
				+ ", u_username=" + u_username + ", c_cutDay=" + c_cutDay + ", c_localIdNumber=" + c_localIdNumber
				+ ", c_idCompany=" + c_idCompany + ", c_name=" + c_name + ", r_email=" + r_email + ", r_createdDate="
				+ r_createdDate + ", r_statusName=" + r_statusName + ", createdTS=" + createdTS + "]";
	}
	
}
