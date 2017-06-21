/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.util.Date;

/**
 * @author Juan Campos
 *
 */
public class CompanyUserAdmin {
	
	private Long idCompany;
    private String name;
    private String localIdNumber;
    private String emailCompany;
    private Double fee;
    private Integer cutDay;
    private Long idCountry;
    private String countryName;
    private Boolean statusCompany;
    private Long idStaff;
    private String firstName;
    private String middleName;
    private String fathersLastName;
    private String motherLastName;
    private Date birthdate;
    private String mobile;
    private String email;
    boolean statusStaff;
    private Long idUser;
    private String username;
    private Long idRole;
    private String roleName;

	/**
	 * 
	 */
	public CompanyUserAdmin() {
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

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Boolean getStatusCompany() {
		return statusCompany;
	}

	public void setStatusCompany(Boolean statusCompany) {
		this.statusCompany = statusCompany;
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

	public String getMotherLastName() {
		return motherLastName;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
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

	public boolean isStatusStaff() {
		return statusStaff;
	}

	public void setStatusStaff(boolean statusStaff) {
		this.statusStaff = statusStaff;
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

	@Override
	public String toString() {
		return "CompanyUserAdmin [idCompany=" + idCompany + ", name=" + name + ", localIdNumber=" + localIdNumber
				+ ", emailCompany=" + emailCompany + ", fee=" + fee + ", cutDay=" + cutDay + ", idCountry=" + idCountry
				+ ", countryName=" + countryName + ", statusCompany=" + statusCompany + ", idStaff=" + idStaff
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", fathersLastName=" + fathersLastName
				+ ", motherLastName=" + motherLastName + ", birthdate=" + birthdate + ", mobile=" + mobile + ", email="
				+ email + ", statusStaff=" + statusStaff + ", idUser=" + idUser + ", username=" + username + ", idRole="
				+ idRole + ", roleName=" + roleName + "]";
	}

}
