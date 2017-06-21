package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DriverConection  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<DriverOnlineTotal> driverOnlineTotal;
	private List<DriverOnlineDetail> driverOnlineDetail;
	
	public DriverConection(){
		
	}

	public List<DriverOnlineTotal> getDriverOnlineTotal() {
		return driverOnlineTotal;
	}

	public void setDriverOnlineTotal(List<DriverOnlineTotal> driverOnlineTotal) {
		this.driverOnlineTotal = driverOnlineTotal;
	}

	public List<DriverOnlineDetail> getDriverOnlineDetail() {
		return driverOnlineDetail;
	}

	public void setDriverOnlineDetail(List<DriverOnlineDetail> driverOnlineDetail) {
		this.driverOnlineDetail = driverOnlineDetail;
	}

	
	@Override
	public String toString() {
		return "DriverConection [driverOnlineTotal=" + driverOnlineTotal + ", driverOnlineDetail=" + driverOnlineDetail
				+ "]";
	}


	@JsonInclude(Include.NON_NULL)
	public static class DriverOnlineTotal{
		
		public DriverOnlineTotal(){
			
		}
		
	      private Long p_idWorkContry;
	        private String p_WorkContryName;
	        private Integer driver_Count;
	        private Integer d_StatusOnline;
	        private Float d_StatusOnlinePCT;
	        
	        
			public Long getP_idWorkContry() {
				return p_idWorkContry;
			}
			public void setP_idWorkContry(Long p_idWorkContry) {
				this.p_idWorkContry = p_idWorkContry;
			}
			public String getP_WorkContryName() {
				return p_WorkContryName;
			}
			public void setP_WorkContryName(String p_WorkContryName) {
				this.p_WorkContryName = p_WorkContryName;
			}
			public Integer getDriver_Count() {
				return driver_Count;
			}
			public void setDriver_Count(Integer driver_Count) {
				this.driver_Count = driver_Count;
			}
			public Integer getD_StatusOnline() {
				return d_StatusOnline;
			}
			public void setD_StatusOnline(Integer d_StatusOnline) {
				this.d_StatusOnline = d_StatusOnline;
			}
			public Float getD_StatusOnlinePCT() {
				return d_StatusOnlinePCT;
			}
			public void setD_StatusOnlinePCT(Float d_StatusOnlinePCT) {
				this.d_StatusOnlinePCT = d_StatusOnlinePCT;
			}
			@Override
			public String toString() {
				return "DriverOnlineTotal [p_idWorkContry=" + p_idWorkContry + ", p_WorkContryName=" + p_WorkContryName
						+ ", driver_Count=" + driver_Count + ", d_StatusOnline=" + d_StatusOnline
						+ ", d_StatusOnlinePCT=" + d_StatusOnlinePCT + "]";
			}
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class DriverOnlineDetail{
		
		public DriverOnlineDetail(){
			
		}
		
		private Long d_idDriver;
        private String d_firstName;
        private String d_fathersLastName;
        private String d_photoUrl;
        private String d_mobile;
        private String d_driverLicense;
        private Integer d_status;
        private Integer d_statusDriver;
        private Long d_idUser;
        private String d_username;
        private Long p_idWorkContry;
        private String p_WorkContryName;
        private Long p_idWorkState;
        private String p_WorkStateName;
        private Long p_idWorkCity;
        private String p_WorkCityName;
        private Float d_rate;
        private Float d_amount;
        private String d_statusDriverTime;
        private String statusDriverName;
        private List<DriverOnlineTotal> driverOnlineTotal;
        private String t_vehiclePlate;
        private String dt_isDriverTaxiActive;
        private String tc_idTaxiCorp;
        private String tc_TaxiCorpName;
        private Float d_onlineMinutes; 
        
		public Long getD_idDriver() {
			return d_idDriver;
		}
		public void setD_idDriver(Long d_idDriver) {
			this.d_idDriver = d_idDriver;
		}
		public String getD_firstName() {
			return d_firstName;
		}
		public void setD_firstName(String d_firstName) {
			this.d_firstName = d_firstName;
		}
		public String getD_fathersLastName() {
			return d_fathersLastName;
		}
		public void setD_fathersLastName(String d_fathersLastName) {
			this.d_fathersLastName = d_fathersLastName;
		}
		public String getD_photoUrl() {
			return d_photoUrl;
		}
		public void setD_photoUrl(String d_photoUrl) {
			this.d_photoUrl = d_photoUrl;
		}
		public String getD_mobile() {
			return d_mobile;
		}
		public void setD_mobile(String d_mobile) {
			this.d_mobile = d_mobile;
		}
		public String getD_driverLicense() {
			return d_driverLicense;
		}
		public void setD_driverLicense(String d_driverLicense) {
			this.d_driverLicense = d_driverLicense;
		}
		public Integer getD_status() {
			return d_status;
		}
		public void setD_status(Integer d_status) {
			this.d_status = d_status;
		}
		public Integer getD_statusDriver() {
			return d_statusDriver;
		}
		public void setD_statusDriver(Integer d_statusDriver) {
			this.d_statusDriver = d_statusDriver;
		}
		public Long getD_idUser() {
			return d_idUser;
		}
		public void setD_idUser(Long d_idUser) {
			this.d_idUser = d_idUser;
		}
		public String getD_username() {
			return d_username;
		}
		public void setD_username(String d_username) {
			this.d_username = d_username;
		}
		public Long getP_idWorkContry() {
			return p_idWorkContry;
		}
		public void setP_idWorkContry(Long p_idWorkContry) {
			this.p_idWorkContry = p_idWorkContry;
		}
		public String getP_WorkContryName() {
			return p_WorkContryName;
		}
		public void setP_WorkContryName(String p_WorkContryName) {
			this.p_WorkContryName = p_WorkContryName;
		}
		public Long getP_idWorkState() {
			return p_idWorkState;
		}
		public void setP_idWorkState(Long p_idWorkState) {
			this.p_idWorkState = p_idWorkState;
		}
		public String getP_WorkStateName() {
			return p_WorkStateName;
		}
		public void setP_WorkStateName(String p_WorkStateName) {
			this.p_WorkStateName = p_WorkStateName;
		}
		public Long getP_idWorkCity() {
			return p_idWorkCity;
		}
		public void setP_idWorkCity(Long p_idWorkCity) {
			this.p_idWorkCity = p_idWorkCity;
		}
		public String getP_WorkCityName() {
			return p_WorkCityName;
		}
		public void setP_WorkCityName(String p_WorkCityName) {
			this.p_WorkCityName = p_WorkCityName;
		}
		public Float getD_rate() {
			return d_rate;
		}
		public void setD_rate(Float d_rate) {
			this.d_rate = d_rate;
		}
		public Float getD_amount() {
			return d_amount;
		}
		public void setD_amount(Float d_amount) {
			this.d_amount = d_amount;
		}
		public String getD_statusDriverTime() {
			return d_statusDriverTime;
		}
		public void setD_statusDriverTime(String d_statusDriverTime) {
			this.d_statusDriverTime = d_statusDriverTime;
		}
		
		public String getStatusDriverName() {
			return statusDriverName;
		}
		public void setStatusDriverName(String statusDriverName) {
			this.statusDriverName = statusDriverName;
		}
		public List<DriverOnlineTotal> getDriverOnlineTotal() {
			return driverOnlineTotal;
		}
		public void setDriverOnlineTotal(List<DriverOnlineTotal> driverOnlineTotal) {
			this.driverOnlineTotal = driverOnlineTotal;
		}
		public String getT_vehiclePlate() {
			return t_vehiclePlate;
		}
		public void setT_vehiclePlate(String t_vehiclePlate) {
			this.t_vehiclePlate = t_vehiclePlate;
		}
		public String getDt_isDriverTaxiActive() {
			return dt_isDriverTaxiActive;
		}
		public void setDt_isDriverTaxiActive(String dt_isDriverTaxiActive) {
			this.dt_isDriverTaxiActive = dt_isDriverTaxiActive;
		}
		public String getTc_idTaxiCorp() {
			return tc_idTaxiCorp;
		}
		public void setTc_idTaxiCorp(String tc_idTaxiCorp) {
			this.tc_idTaxiCorp = tc_idTaxiCorp;
		}
		public String getTc_TaxiCorpName() {
			return tc_TaxiCorpName;
		}
		public void setTc_TaxiCorpName(String tc_TaxiCorpName) {
			this.tc_TaxiCorpName = tc_TaxiCorpName;
		}
		public Float getD_onlineMinutes() {
			return d_onlineMinutes;
		}
		public void setD_onlineMinutes(Float d_onlineMinutes) {
			this.d_onlineMinutes = d_onlineMinutes;
		}
		@Override
		public String toString() {
			return "DriverOnlineDetail [d_idDriver=" + d_idDriver + ", d_firstName=" + d_firstName
					+ ", d_fathersLastName=" + d_fathersLastName + ", d_photoUrl=" + d_photoUrl + ", d_mobile="
					+ d_mobile + ", d_driverLicense=" + d_driverLicense + ", d_status=" + d_status + ", d_statusDriver="
					+ d_statusDriver + ", d_idUser=" + d_idUser + ", d_username=" + d_username + ", p_idWorkContry="
					+ p_idWorkContry + ", p_WorkContryName=" + p_WorkContryName + ", p_idWorkState=" + p_idWorkState
					+ ", p_WorkStateName=" + p_WorkStateName + ", p_idWorkCity=" + p_idWorkCity + ", p_WorkCityName="
					+ p_WorkCityName + ", d_rate=" + d_rate + ", d_amount=" + d_amount + ", d_statusDriverTime="
					+ d_statusDriverTime + ", statusDriverName=" + statusDriverName + ", driverOnlineTotal="
					+ driverOnlineTotal + ", t_vehiclePlate=" + t_vehiclePlate + ", dt_isDriverTaxiActive="
					+ dt_isDriverTaxiActive + ", tc_idTaxiCorp=" + tc_idTaxiCorp + ", tc_TaxiCorpName="
					+ tc_TaxiCorpName + ", d_onlineMinutes=" + d_onlineMinutes + "]";
		}
        
        
		
	}
	

}
