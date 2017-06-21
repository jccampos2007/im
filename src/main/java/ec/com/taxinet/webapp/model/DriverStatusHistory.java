package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DriverStatusHistory implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List <DriverCurrentStatus> driverCurrentStatus;
	private List <DriverStatusHistoric> driverStatusHistoric;
	
	public DriverStatusHistory(){
		
	}
	
	
	
	public List<DriverCurrentStatus> getDriverCurrentStatus() {
		return driverCurrentStatus;
	}

	public void setDriverCurrentStatus(List<DriverCurrentStatus> driverCurrentStatus) {
		this.driverCurrentStatus = driverCurrentStatus;
	}

	public List<DriverStatusHistoric> getDriverStatusHistoric() {
		return driverStatusHistoric;
	}

	public void setDriverStatusHistoric(List<DriverStatusHistoric> driverStatusHistoric) {
		this.driverStatusHistoric = driverStatusHistoric;
	}

	

	@Override
	public String toString() {
		return "DriverStatusHistory [driverCurrentStatus=" + driverCurrentStatus + ", driverStatusHistoric="
				+ driverStatusHistoric + "]";
	}



	@JsonInclude(Include.NON_NULL)
	public static class DriverCurrentStatus{
		
		public DriverCurrentStatus(){
			
		}
		
        private String d_fathersLastName;
        private String d_WorkCityName;
        private Integer d_statusDriver;
        private String d_driverLicense;
        private String d_motherLastName;
        private String d_WorkContryName;
        private Long d_idWorkContry;
        private String d_firstName;
        private String d_mobile;
        private String d_email;
        private String u_username;
        private Long d_idWorkEstate;
        private String d_WorkEstateName;
        private String d_statusDriverDate;
        private Long d_idUser;
        private Integer d_status;
        private String d_middleName;
        private Long d_idWorkCity;
        private Long d_idDriver;
        private String d_photoUrl;
		public String getD_fathersLastName() {
			return d_fathersLastName;
		}
		public void setD_fathersLastName(String d_fathersLastName) {
			this.d_fathersLastName = d_fathersLastName;
		}
		public String getD_WorkCityName() {
			return d_WorkCityName;
		}
		public void setD_WorkCityName(String d_WorkCityName) {
			this.d_WorkCityName = d_WorkCityName;
		}
		public Integer getD_statusDriver() {
			return d_statusDriver;
		}
		public void setD_statusDriver(Integer d_statusDriver) {
			this.d_statusDriver = d_statusDriver;
		}
		public String getD_driverLicense() {
			return d_driverLicense;
		}
		public void setD_driverLicense(String d_driverLicense) {
			this.d_driverLicense = d_driverLicense;
		}
		public String getD_motherLastName() {
			return d_motherLastName;
		}
		public void setD_motherLastName(String d_motherLastName) {
			this.d_motherLastName = d_motherLastName;
		}
		public String getD_WorkContryName() {
			return d_WorkContryName;
		}
		public void setD_WorkContryName(String d_WorkContryName) {
			this.d_WorkContryName = d_WorkContryName;
		}
		public Long getD_idWorkContry() {
			return d_idWorkContry;
		}
		public void setD_idWorkContry(Long d_idWorkContry) {
			this.d_idWorkContry = d_idWorkContry;
		}
		public String getD_firstName() {
			return d_firstName;
		}
		public void setD_firstName(String d_firstName) {
			this.d_firstName = d_firstName;
		}
		public String getD_mobile() {
			return d_mobile;
		}
		public void setD_mobile(String d_mobile) {
			this.d_mobile = d_mobile;
		}
		public String getD_email() {
			return d_email;
		}
		public void setD_email(String d_email) {
			this.d_email = d_email;
		}
		public String getU_username() {
			return u_username;
		}
		public void setU_username(String u_username) {
			this.u_username = u_username;
		}
		public Long getD_idWorkEstate() {
			return d_idWorkEstate;
		}
		public void setD_idWorkEstate(Long d_idWorkEstate) {
			this.d_idWorkEstate = d_idWorkEstate;
		}
		public String getD_WorkEstateName() {
			return d_WorkEstateName;
		}
		public void setD_WorkEstateName(String d_WorkEstateName) {
			this.d_WorkEstateName = d_WorkEstateName;
		}
		public String getD_statusDriverDate() {
			return d_statusDriverDate;
		}
		public void setD_statusDriverDate(String d_statusDriverDate) {
			this.d_statusDriverDate = d_statusDriverDate;
		}
		public Long getD_idUser() {
			return d_idUser;
		}
		public void setD_idUser(Long d_idUser) {
			this.d_idUser = d_idUser;
		}
		public Integer getD_status() {
			return d_status;
		}
		public void setD_status(Integer d_status) {
			this.d_status = d_status;
		}
		public String getD_middleName() {
			return d_middleName;
		}
		public void setD_middleName(String d_middleName) {
			this.d_middleName = d_middleName;
		}
		public Long getD_idWorkCity() {
			return d_idWorkCity;
		}
		public void setD_idWorkCity(Long d_idWorkCity) {
			this.d_idWorkCity = d_idWorkCity;
		}
		public Long getD_idDriver() {
			return d_idDriver;
		}
		public void setD_idDriver(Long d_idDriver) {
			this.d_idDriver = d_idDriver;
		}
		public String getD_photoUrl() {
			return d_photoUrl;
		}
		public void setD_photoUrl(String d_photoUrl) {
			this.d_photoUrl = d_photoUrl;
		}
		@Override
		public String toString() {
			return "DriverCurrentStatus [d_fathersLastName=" + d_fathersLastName + ", d_WorkCityName=" + d_WorkCityName
					+ ", d_statusDriver=" + d_statusDriver + ", d_driverLicense=" + d_driverLicense
					+ ", d_motherLastName=" + d_motherLastName + ", d_WorkContryName=" + d_WorkContryName
					+ ", d_idWorkContry=" + d_idWorkContry + ", d_firstName=" + d_firstName + ", d_mobile=" + d_mobile
					+ ", d_email=" + d_email + ", u_username=" + u_username + ", d_idWorkEstate=" + d_idWorkEstate
					+ ", d_WorkEstateName=" + d_WorkEstateName + ", d_statusDriverDate=" + d_statusDriverDate
					+ ", d_idUser=" + d_idUser + ", d_status=" + d_status + ", d_middleName=" + d_middleName
					+ ", d_idWorkCity=" + d_idWorkCity + ", d_idDriver=" + d_idDriver + ", d_photoUrl=" + d_photoUrl
					+ "]";
		}
        
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class DriverStatusHistoric{
		
		public DriverStatusHistoric(){
			
		}
		
		private String dh_statusDate_end;
		private String dh_statusDate_start;
        private Integer dh_statusDriver;
        private String dh_statusDriverTime;
        private Long d_idDriver;
        private String d_name;
        private String d_lastName;
        private String d_licence;
        private String d_statusName;
        private Timestamp startDateTS;
        private Timestamp endDateTS;
        private String currentStatusName;
        
		public String getDh_statusDate_end() {
			return dh_statusDate_end;
		}
		public void setDh_statusDate_end(String dh_statusDate_end) {
			this.dh_statusDate_end = dh_statusDate_end;
		}
		public String getDh_statusDate_start() {
			return dh_statusDate_start;
		}
		public void setDh_statusDate_start(String dh_statusDate_start) {
			this.dh_statusDate_start = dh_statusDate_start;
		}
		public Integer getDh_statusDriver() {
			return dh_statusDriver;
		}
		public void setDh_statusDriver(Integer dh_statusDriver) {
			this.dh_statusDriver = dh_statusDriver;
		}
		public String getDh_statusDriverTime() {
			return dh_statusDriverTime;
		}
		public void setDh_statusDriverTime(String dh_statusDriverTime) {
			this.dh_statusDriverTime = dh_statusDriverTime;
		}
		public Long getD_idDriver() {
			return d_idDriver;
		}
		public void setD_idDriver(Long d_idDriver) {
			this.d_idDriver = d_idDriver;
		}
		public String getD_name() {
			return d_name;
		}
		public void setD_name(String d_name) {
			this.d_name = d_name;
		}
		public String getD_lastName() {
			return d_lastName;
		}
		public void setD_lastName(String d_lastName) {
			this.d_lastName = d_lastName;
		}
		public String getD_licence() {
			return d_licence;
		}
		public void setD_licence(String d_licence) {
			this.d_licence = d_licence;
		}
		public String getD_statusName() {
			return d_statusName;
		}
		public void setD_statusName(String d_statusName) {
			this.d_statusName = d_statusName;
		}
		public Timestamp getStartDateTS() {
			return startDateTS;
		}
		public void setStartDateTS(Timestamp startDateTS) {
			this.startDateTS = startDateTS;
		}
		public Timestamp getEndDateTS() {
			return endDateTS;
		}
		public void setEndDateTS(Timestamp endDateTS) {
			this.endDateTS = endDateTS;
		}
		public String getCurrentStatusName() {
			return currentStatusName;
		}
		public void setCurrentStatusName(String currentStatusName) {
			this.currentStatusName = currentStatusName;
		}
		@Override
		public String toString() {
			return "DriverStatusHistoric [dh_statusDate_end=" + dh_statusDate_end + ", dh_statusDate_start="
					+ dh_statusDate_start + ", dh_statusDriver=" + dh_statusDriver + ", dh_statusDriverTime="
					+ dh_statusDriverTime + ", d_idDriver=" + d_idDriver + ", d_name=" + d_name + ", d_lastName="
					+ d_lastName + ", d_licence=" + d_licence + ", d_statusName=" + d_statusName + ", startDateTS="
					+ startDateTS + ", endDateTS=" + endDateTS + ", currentStatusName=" + currentStatusName + "]";
		}
        
        
		
	}

}
