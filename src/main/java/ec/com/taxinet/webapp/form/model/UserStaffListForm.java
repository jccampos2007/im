package ec.com.taxinet.webapp.form.model;

public class UserStaffListForm {
	
	private Integer idStaff;
	private String sessionToken;
	
	public UserStaffListForm() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIdStaff() {
		return idStaff;
	}
	public void setIdStaff(Integer idStaff) {
		this.idStaff = idStaff;
	}
	public String getSessionToken() {
		return sessionToken;
	}
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}
	
	@Override
	public String toString() {
		return "UserStaffListForm [idStaff=" + idStaff + ", sessionToken=" + sessionToken + "]";
	}

}
