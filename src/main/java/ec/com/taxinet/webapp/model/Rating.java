package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Rating implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<DriverReviewTotal> driverReviewTotal;
	private List<DriverReview> driverReview;
	
	public Rating(){
		
	}
	
	
		
	public List<DriverReviewTotal> getDriverReviewTotal() {
		return driverReviewTotal;
	}

	public void setDriverReviewTotal(List<DriverReviewTotal> driverReviewTotal) {
		this.driverReviewTotal = driverReviewTotal;
	}

	public List<DriverReview> getDriverReview() {
		return driverReview;
	}

	public void setDriverReview(List<DriverReview> driverReview) {
		this.driverReview = driverReview;
	}
	
	



	@Override
	public String toString() {
		return "Rating [driverReviewTotal=" + driverReviewTotal + ", driverReview=" + driverReview + "]";
	}





	@JsonInclude(Include.NON_NULL)
	public static class DriverReviewTotal{
		
		public DriverReviewTotal(){
			
		}
		
		private Integer d_Rate_Malo;
		private Integer d_Rate_Excelente;
		private Integer d_Rate_Bueno;
		private Long d_idWorkContry;
		private String d_WorkContryName;
		private Integer d_Driver_Count;
		private Integer d_Rate_SinCalificar;
		
		public Integer getD_Rate_Malo() {
			return d_Rate_Malo;
		}
		public void setD_Rate_Malo(Integer d_Rate_Malo) {
			this.d_Rate_Malo = d_Rate_Malo;
		}
		public Integer getD_Rate_Excelente() {
			return d_Rate_Excelente;
		}
		public void setD_Rate_Excelente(Integer d_Rate_Excelente) {
			this.d_Rate_Excelente = d_Rate_Excelente;
		}
		public Integer getD_Rate_Bueno() {
			return d_Rate_Bueno;
		}
		public void setD_Rate_Bueno(Integer d_Rate_Bueno) {
			this.d_Rate_Bueno = d_Rate_Bueno;
		}
		public Long getD_idWorkContry() {
			return d_idWorkContry;
		}
		public void setD_idWorkContry(Long d_idWorkContry) {
			this.d_idWorkContry = d_idWorkContry;
		}
		public String getD_WorkContryName() {
			return d_WorkContryName;
		}
		public void setD_WorkContryName(String d_WorkContryName) {
			this.d_WorkContryName = d_WorkContryName;
		}
		public Integer getD_Driver_Count() {
			return d_Driver_Count;
		}
		public void setD_Driver_Count(Integer d_Driver_Count) {
			this.d_Driver_Count = d_Driver_Count;
		}
		
		
		public Integer getD_Rate_SinCalificar() {
			return d_Rate_SinCalificar;
		}
		public void setD_Rate_SinCalificar(Integer d_Rate_SinCalificar) {
			this.d_Rate_SinCalificar = d_Rate_SinCalificar;
		}
		@Override
		public String toString() {
			return "DriverReviewTotal [d_Rate_Malo=" + d_Rate_Malo + ", d_Rate_Excelente=" + d_Rate_Excelente
					+ ", d_Rate_Bueno=" + d_Rate_Bueno + ", d_idWorkContry=" + d_idWorkContry + ", d_WorkContryName="
					+ d_WorkContryName + ", d_Driver_Count=" + d_Driver_Count + ", d_Rate_SinCalificar="
					+ d_Rate_SinCalificar + "]";
		}
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class DriverReview{
		
		private List<DriverReviewTotal> driverReviewTotal;
		private String d_HomeCityName;
		private Long d_idHomeEstate;
		private Integer d_statusDriver;
		private Long d_idHomeCity;
		private String d_HomeEstateName;
		private Integer d_status;
		private Long d_idDriver;
		private String d_firstName;
		private String d_fathersLastName;
		private String d_photoUrl;
		private String d_mobile;
		private String d_driverLicense;
		private Long d_idUser;
		private Float d_rate;
		private String u_username;
		private String d_middleName;
		private String d_motherLastName;
		private String d_phoneHome;
		private String d_phoneOffice;
		private String d_email;
		private String d_expirationDateLicense;
		private Long d_idWorkState;
		private String d_WorkStateName;
		private Long d_idWorkCity;
		private String d_WorkCityName;
		private String tc_localIdNumber;
		private Integer tc_status;
		private Long d_idWorkContry;
		private String d_WorkContryName;
		private Long tc_idTaxiCorp;
		private Long tc_idCity;
		private String tc_CityName;
		private String tc_name;
		private String ratingStars;
		
		public DriverReview(){
			
		}

		public List<DriverReviewTotal> getDriverReviewTotal() {
			return driverReviewTotal;
		}

		public void setDriverReviewTotal(List<DriverReviewTotal> driverReviewTotal) {
			this.driverReviewTotal = driverReviewTotal;
		}

		public String getD_HomeCityName() {
			return d_HomeCityName;
		}

		public void setD_HomeCityName(String d_HomeCityName) {
			this.d_HomeCityName = d_HomeCityName;
		}

		public Long getD_idHomeEstate() {
			return d_idHomeEstate;
		}

		public void setD_idHomeEstate(Long d_idHomeEstate) {
			this.d_idHomeEstate = d_idHomeEstate;
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

		public String getU_username() {
			return u_username;
		}

		public void setU_username(String u_username) {
			this.u_username = u_username;
		}

		public String getD_middleName() {
			return d_middleName;
		}

		public void setD_middleName(String d_middleName) {
			this.d_middleName = d_middleName;
		}

		public String getD_motherLastName() {
			return d_motherLastName;
		}

		public void setD_motherLastName(String d_motherLastName) {
			this.d_motherLastName = d_motherLastName;
		}

		public String getD_phoneHome() {
			return d_phoneHome;
		}

		public void setD_phoneHome(String d_phoneHome) {
			this.d_phoneHome = d_phoneHome;
		}

		public String getD_phoneOffice() {
			return d_phoneOffice;
		}

		public void setD_phoneOffice(String d_phoneOffice) {
			this.d_phoneOffice = d_phoneOffice;
		}

		public String getD_email() {
			return d_email;
		}

		public void setD_email(String d_email) {
			this.d_email = d_email;
		}

		public String getD_expirationDateLicense() {
			return d_expirationDateLicense;
		}

		public void setD_expirationDateLicense(String d_expirationDateLicense) {
			this.d_expirationDateLicense = d_expirationDateLicense;
		}

		public Long getD_idWorkState() {
			return d_idWorkState;
		}

		public void setD_idWorkState(Long d_idWorkState) {
			this.d_idWorkState = d_idWorkState;
		}

		public String getD_WorkStateName() {
			return d_WorkStateName;
		}

		public void setD_WorkStateName(String d_WorkStateName) {
			this.d_WorkStateName = d_WorkStateName;
		}

		public Long getD_idWorkCity() {
			return d_idWorkCity;
		}

		public void setD_idWorkCity(Long d_idWorkCity) {
			this.d_idWorkCity = d_idWorkCity;
		}

		public String getD_WorkCityName() {
			return d_WorkCityName;
		}

		public void setD_WorkCityName(String d_WorkCityName) {
			this.d_WorkCityName = d_WorkCityName;
		}

		public String getTc_localIdNumber() {
			return tc_localIdNumber;
		}

		public void setTc_localIdNumber(String tc_localIdNumber) {
			this.tc_localIdNumber = tc_localIdNumber;
		}

		public Integer getTc_status() {
			return tc_status;
		}

		public void setTc_status(Integer tc_status) {
			this.tc_status = tc_status;
		}

		public Long getD_idWorkContry() {
			return d_idWorkContry;
		}

		public void setD_idWorkContry(Long d_idWorkContry) {
			this.d_idWorkContry = d_idWorkContry;
		}

		public String getD_WorkContryName() {
			return d_WorkContryName;
		}

		public void setD_WorkContryName(String d_WorkContryName) {
			this.d_WorkContryName = d_WorkContryName;
		}

		public Long getTc_idTaxiCorp() {
			return tc_idTaxiCorp;
		}

		public void setTc_idTaxiCorp(Long tc_idTaxiCorp) {
			this.tc_idTaxiCorp = tc_idTaxiCorp;
		}

		public Long getTc_idCity() {
			return tc_idCity;
		}

		public void setTc_idCity(Long tc_idCity) {
			this.tc_idCity = tc_idCity;
		}

		public String getTc_CityName() {
			return tc_CityName;
		}

		public void setTc_CityName(String tc_CityName) {
			this.tc_CityName = tc_CityName;
		}

		public String getTc_name() {
			return tc_name;
		}

		public void setTc_name(String tc_name) {
			this.tc_name = tc_name;
		}

		public String getRatingStars() {
			return ratingStars;
		}

		public void setRatingStars(String ratingStars) {
			this.ratingStars = ratingStars;
		}

		@Override
		public String toString() {
			return "DriverReview [driverReviewTotal=" + driverReviewTotal + ", d_HomeCityName=" + d_HomeCityName
					+ ", d_idHomeEstate=" + d_idHomeEstate + ", d_statusDriver=" + d_statusDriver + ", d_idHomeCity="
					+ d_idHomeCity + ", d_HomeEstateName=" + d_HomeEstateName + ", d_status=" + d_status
					+ ", d_idDriver=" + d_idDriver + ", d_firstName=" + d_firstName + ", d_fathersLastName="
					+ d_fathersLastName + ", d_photoUrl=" + d_photoUrl + ", d_mobile=" + d_mobile + ", d_driverLicense="
					+ d_driverLicense + ", d_idUser=" + d_idUser + ", d_rate=" + d_rate + ", u_username=" + u_username
					+ ", d_middleName=" + d_middleName + ", d_motherLastName=" + d_motherLastName + ", d_phoneHome="
					+ d_phoneHome + ", d_phoneOffice=" + d_phoneOffice + ", d_email=" + d_email
					+ ", d_expirationDateLicense=" + d_expirationDateLicense + ", d_idWorkState=" + d_idWorkState
					+ ", d_WorkStateName=" + d_WorkStateName + ", d_idWorkCity=" + d_idWorkCity + ", d_WorkCityName="
					+ d_WorkCityName + ", tc_localIdNumber=" + tc_localIdNumber + ", tc_status=" + tc_status
					+ ", d_idWorkContry=" + d_idWorkContry + ", d_WorkContryName=" + d_WorkContryName
					+ ", tc_idTaxiCorp=" + tc_idTaxiCorp + ", tc_idCity=" + tc_idCity + ", tc_CityName=" + tc_CityName
					+ ", tc_name=" + tc_name + ", ratingStars=" + ratingStars + "]";
		}
		
		
		
	}

}
