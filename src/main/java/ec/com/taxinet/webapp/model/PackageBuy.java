package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * 
 * @author keyber
 *
 */
public class PackageBuy  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<PackageBuyData> driverPackageBuy;
	private List<DriverPackageBuyGroup> driverPackageBuyGroup;

	public PackageBuy(){
		
	}
	
	
	public List<PackageBuyData> getDriverPackageBuy() {
		return driverPackageBuy;
	}


	public void setDriverPackageBuy(List<PackageBuyData> driverPackageBuy) {
		this.driverPackageBuy = driverPackageBuy;
	}
	
	


	public List<DriverPackageBuyGroup> getDriverPackageBuyGroup() {
		return driverPackageBuyGroup;
	}



	public void setDriverPackageBuyGroup(List<DriverPackageBuyGroup> driverPackageBuyGroup) {
		this.driverPackageBuyGroup = driverPackageBuyGroup;
	}



	@Override
	public String toString() {
		return "PackageBuy [driverPackageBuy=" + driverPackageBuy + ", driverPackageBuyGroup=" + driverPackageBuyGroup
				+ "]";
	}


	@JsonInclude(Include.NON_NULL)
	public static class DriverPackageBuyGroup{
		
		public DriverPackageBuyGroup(){
			
		}
		
		private Long p_idContry;
	    private String p_ContryName;
	    private Long sr_idState ;
	    private String sr_StateName;
	    private Long p_idCity;
	    private String p_CityName;
	    private Long p_idPackage;
	    private String p_name;
	    private Integer driver_Count;
	    private Integer dp_DriverPackage_Buy_Count;
	    private Float dp_packageAmount_SUM;     
	    private Float dp_packageAmount_AVG;
	    private Float dp_realAmount_SUM;    
	    private Float dp_realAmount_AVG;
	    
	    
		public Long getP_idContry() {
			return p_idContry;
		}
		public void setP_idContry(Long p_idContry) {
			this.p_idContry = p_idContry;
		}
		public String getP_ContryName() {
			return p_ContryName;
		}
		public void setP_ContryName(String p_ContryName) {
			this.p_ContryName = p_ContryName;
		}
		public Long getSr_idState() {
			return sr_idState;
		}
		public void setSr_idState(Long sr_idState) {
			this.sr_idState = sr_idState;
		}
		public String getSr_StateName() {
			return sr_StateName;
		}
		public void setSr_StateName(String sr_StateName) {
			this.sr_StateName = sr_StateName;
		}
		public Long getP_idCity() {
			return p_idCity;
		}
		public void setP_idCity(Long p_idCity) {
			this.p_idCity = p_idCity;
		}
		public String getP_CityName() {
			return p_CityName;
		}
		public void setP_CityName(String p_CityName) {
			this.p_CityName = p_CityName;
		}
		public Long getP_idPackage() {
			return p_idPackage;
		}
		public void setP_idPackage(Long p_idPackage) {
			this.p_idPackage = p_idPackage;
		}
		public String getP_name() {
			return p_name;
		}
		public void setP_name(String p_name) {
			this.p_name = p_name;
		}
		public Integer getDriver_Count() {
			return driver_Count;
		}
		public void setDriver_Count(Integer driver_Count) {
			this.driver_Count = driver_Count;
		}
		public Integer getDp_DriverPackage_Buy_Count() {
			return dp_DriverPackage_Buy_Count;
		}
		public void setDp_DriverPackage_Buy_Count(Integer dp_DriverPackage_Buy_Count) {
			this.dp_DriverPackage_Buy_Count = dp_DriverPackage_Buy_Count;
		}
		public Float getDp_packageAmount_SUM() {
			return dp_packageAmount_SUM;
		}
		public void setDp_packageAmount_SUM(Float dp_packageAmount_SUM) {
			this.dp_packageAmount_SUM = dp_packageAmount_SUM;
		}
		public Float getDp_packageAmount_AVG() {
			return dp_packageAmount_AVG;
		}
		public void setDp_packageAmount_AVG(Float dp_packageAmount_AVG) {
			this.dp_packageAmount_AVG = dp_packageAmount_AVG;
		}
		public Float getDp_realAmount_SUM() {
			return dp_realAmount_SUM;
		}
		public void setDp_realAmount_SUM(Float dp_realAmount_SUM) {
			this.dp_realAmount_SUM = dp_realAmount_SUM;
		}
		public Float getDp_realAmount_AVG() {
			return dp_realAmount_AVG;
		}
		public void setDp_realAmount_AVG(Float dp_realAmount_AVG) {
			this.dp_realAmount_AVG = dp_realAmount_AVG;
		}
		
		@Override
		public String toString() {
			return "DriverPackageBuyGroup [p_idContry=" + p_idContry + ", p_ContryName=" + p_ContryName
					+ ", sr_idState=" + sr_idState + ", sr_StateName=" + sr_StateName + ", p_idCity=" + p_idCity
					+ ", p_CityName=" + p_CityName + ", p_idPackage=" + p_idPackage + ", p_name=" + p_name
					+ ", driver_Count=" + driver_Count + ", dp_DriverPackage_Buy_Count=" + dp_DriverPackage_Buy_Count
					+ ", dp_packageAmount_SUM=" + dp_packageAmount_SUM + ", dp_packageAmount_AVG="
					+ dp_packageAmount_AVG + ", dp_realAmount_SUM=" + dp_realAmount_SUM + ", dp_realAmount_AVG="
					+ dp_realAmount_AVG + "]";
		}
		
	}

	@JsonInclude(Include.NON_NULL)
	public static class PackageBuyData{
		
		public PackageBuyData(){
			
		}
		
		private String d_HomeCityName;
		private Long p_idPackage;
		private Float dp_packageAmount;
		private String p_CityName;
		private Float dp_initialDriverAmount;
		private Float p_realAmount;
		private String p_finalDate;
		private Long dp_idDriverPackage;
		private Long p_idCity;
		private String dp_DateTime_Buy;
		private Long sr_idState;
		private Long d_idHomeEstate;
		private Float d_amount;
		private Float p_packageAmount;
		private String sr_StateName;
		private Long sr_idCountry;
		private Integer p_status;
		private Integer d_statusDriver;
		private Long d_idHomeCity;
		private String p_initialDate;
		private String sr_ContryName;
		private String d_HomeEstateName;
		private Integer d_status;
		private Float dp_realAmount;
		private String p_name;
		private Long dp_idDriverPackage_Buy;
		private Long d_idDriver;
		private String d_firstName;
		private String d_fathersLastName;
		private String d_username;
		private String d_photoUrl;
		private String d_mobile;
		private String d_driverLicense;
		private Long d_idUser;
		private Float d_rate;
		private Timestamp dateBuyTS;
		private List<DriverPackageBuyGroup> driverPackageBuyGroup;
		
		public String getD_HomeCityName() {
			return d_HomeCityName;
		}
		public void setD_HomeCityName(String d_HomeCityName) {
			this.d_HomeCityName = d_HomeCityName;
		}
		public Long getP_idPackage() {
			return p_idPackage;
		}
		public void setP_idPackage(Long p_idPackage) {
			this.p_idPackage = p_idPackage;
		}
		public Float getDp_packageAmount() {
			return dp_packageAmount;
		}
		public void setDp_packageAmount(Float dp_packageAmount) {
			this.dp_packageAmount = dp_packageAmount;
		}
		public String getP_CityName() {
			return p_CityName;
		}
		public void setP_CityName(String p_CityName) {
			this.p_CityName = p_CityName;
		}
		public Float getDp_initialDriverAmount() {
			return dp_initialDriverAmount;
		}
		public void setDp_initialDriverAmount(Float dp_initialDriverAmount) {
			this.dp_initialDriverAmount = dp_initialDriverAmount;
		}
		public Float getP_realAmount() {
			return p_realAmount;
		}
		public void setP_realAmount(Float p_realAmount) {
			this.p_realAmount = p_realAmount;
		}
		public String getP_finalDate() {
			return p_finalDate;
		}
		public void setP_finalDate(String p_finalDate) {
			this.p_finalDate = p_finalDate;
		}
		public Long getDp_idDriverPackage() {
			return dp_idDriverPackage;
		}
		public void setDp_idDriverPackage(Long dp_idDriverPackage) {
			this.dp_idDriverPackage = dp_idDriverPackage;
		}
		public Long getP_idCity() {
			return p_idCity;
		}
		public void setP_idCity(Long p_idCity) {
			this.p_idCity = p_idCity;
		}
		public String getDp_DateTime_Buy() {
			return dp_DateTime_Buy;
		}
		public void setDp_DateTime_Buy(String dp_DateTime_Buy) {
			this.dp_DateTime_Buy = dp_DateTime_Buy;
		}
		public Long getSr_idState() {
			return sr_idState;
		}
		public void setSr_idState(Long sr_idState) {
			this.sr_idState = sr_idState;
		}
		public Long getD_idHomeEstate() {
			return d_idHomeEstate;
		}
		public void setD_idHomeEstate(Long d_idHomeEstate) {
			this.d_idHomeEstate = d_idHomeEstate;
		}
		public Float getD_amount() {
			return d_amount;
		}
		public void setD_amount(Float d_amount) {
			this.d_amount = d_amount;
		}
		public Float getP_packageAmount() {
			return p_packageAmount;
		}
		public void setP_packageAmount(Float p_packageAmount) {
			this.p_packageAmount = p_packageAmount;
		}
		public String getSr_StateName() {
			return sr_StateName;
		}
		public void setSr_StateName(String sr_StateName) {
			this.sr_StateName = sr_StateName;
		}
		public Long getSr_idCountry() {
			return sr_idCountry;
		}
		public void setSr_idCountry(Long sr_idCountry) {
			this.sr_idCountry = sr_idCountry;
		}
		public Integer getP_status() {
			return p_status;
		}
		public void setP_status(Integer p_status) {
			this.p_status = p_status;
		}
		public Integer getD_statusDriver() {
			return d_statusDriver;
		}
		public void setD_statusDriver(Integer d_statusDriver) {
			this.d_statusDriver = d_statusDriver;
		}
		public Long getD_idHomeCity() {
			return d_idHomeCity;
		}
		public void setD_idHomeCity(Long d_idHomeCity) {
			this.d_idHomeCity = d_idHomeCity;
		}
		public String getP_initialDate() {
			return p_initialDate;
		}
		public void setP_initialDate(String p_initialDate) {
			this.p_initialDate = p_initialDate;
		}
		public String getSr_ContryName() {
			return sr_ContryName;
		}
		public void setSr_ContryName(String sr_ContryName) {
			this.sr_ContryName = sr_ContryName;
		}
		public String getD_HomeEstateName() {
			return d_HomeEstateName;
		}
		public void setD_HomeEstateName(String d_HomeEstateName) {
			this.d_HomeEstateName = d_HomeEstateName;
		}
		public Integer getD_status() {
			return d_status;
		}
		public void setD_status(Integer d_status) {
			this.d_status = d_status;
		}
		public Float getDp_realAmount() {
			return dp_realAmount;
		}
		public void setDp_realAmount(Float dp_realAmount) {
			this.dp_realAmount = dp_realAmount;
		}
		public String getP_name() {
			return p_name;
		}
		public void setP_name(String p_name) {
			this.p_name = p_name;
		}
		public Long getDp_idDriverPackage_Buy() {
			return dp_idDriverPackage_Buy;
		}
		public void setDp_idDriverPackage_Buy(Long dp_idDriverPackage_Buy) {
			this.dp_idDriverPackage_Buy = dp_idDriverPackage_Buy;
		}
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
		public String getD_username() {
			return d_username;
		}
		public void setD_username(String d_username) {
			this.d_username = d_username;
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
		public Long getD_idUser() {
			return d_idUser;
		}
		public void setD_idUser(Long d_idUser) {
			this.d_idUser = d_idUser;
		}
		public Float getD_rate() {
			return d_rate;
		}
		public void setD_rate(Float d_rate) {
			this.d_rate = d_rate;
		}
		public Timestamp getDateBuyTS() {
			return dateBuyTS;
		}
		public void setDateBuyTS(Timestamp dateBuyTS) {
			this.dateBuyTS = dateBuyTS;
		}
		public List<DriverPackageBuyGroup> getDriverPackageBuyGroup() {
			return driverPackageBuyGroup;
		}
		public void setDriverPackageBuyGroup(List<DriverPackageBuyGroup> driverPackageBuyGroup) {
			this.driverPackageBuyGroup = driverPackageBuyGroup;
		}
		
		
		@Override
		public String toString() {
			return "PackageBuyData [d_HomeCityName=" + d_HomeCityName + ", p_idPackage=" + p_idPackage
					+ ", dp_packageAmount=" + dp_packageAmount + ", p_CityName=" + p_CityName
					+ ", dp_initialDriverAmount=" + dp_initialDriverAmount + ", p_realAmount=" + p_realAmount
					+ ", p_finalDate=" + p_finalDate + ", dp_idDriverPackage=" + dp_idDriverPackage + ", p_idCity="
					+ p_idCity + ", dp_DateTime_Buy=" + dp_DateTime_Buy + ", sr_idState=" + sr_idState
					+ ", d_idHomeEstate=" + d_idHomeEstate + ", d_amount=" + d_amount + ", p_packageAmount="
					+ p_packageAmount + ", sr_StateName=" + sr_StateName + ", sr_idCountry=" + sr_idCountry
					+ ", p_status=" + p_status + ", d_statusDriver=" + d_statusDriver + ", d_idHomeCity=" + d_idHomeCity
					+ ", p_initialDate=" + p_initialDate + ", sr_ContryName=" + sr_ContryName + ", d_HomeEstateName="
					+ d_HomeEstateName + ", d_status=" + d_status + ", dp_realAmount=" + dp_realAmount + ", p_name="
					+ p_name + ", dp_idDriverPackage_Buy=" + dp_idDriverPackage_Buy + ", d_idDriver=" + d_idDriver
					+ ", d_firstName=" + d_firstName + ", d_fathersLastName=" + d_fathersLastName + ", d_username="
					+ d_username + ", d_photoUrl=" + d_photoUrl + ", d_mobile=" + d_mobile + ", d_driverLicense="
					+ d_driverLicense + ", d_idUser=" + d_idUser + ", d_rate=" + d_rate + ", dateBuyTS=" + dateBuyTS
					+ ", driverPackageBuyGroup=" + driverPackageBuyGroup + "]";
		}
		
		
		
	}

	

}
