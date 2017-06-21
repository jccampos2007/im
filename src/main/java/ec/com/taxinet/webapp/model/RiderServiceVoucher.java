package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class RiderServiceVoucher implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<RiderVoucherTotal> riderVoucherTotal;
	private List<RiderVoucherDetail> riderVoucherDetail;
	
	
	public RiderServiceVoucher(){
		
	}
	
	
	
	public List<RiderVoucherTotal> getRiderVoucherTotal() {
		return riderVoucherTotal;
	}

	public void setRiderVoucherTotal(List<RiderVoucherTotal> riderVoucherTotal) {
		this.riderVoucherTotal = riderVoucherTotal;
	}

	public List<RiderVoucherDetail> getRiderVoucherDetail() {
		return riderVoucherDetail;
	}

	public void setRiderVoucherDetail(List<RiderVoucherDetail> riderVoucherDetail) {
		this.riderVoucherDetail = riderVoucherDetail;
	}



	@Override
	public String toString() {
		return "RiderServiceVoucher [riderVoucherTotal=" + riderVoucherTotal + ", riderVoucherDetail="
				+ riderVoucherDetail + "]";
	}



	@JsonInclude(Include.NON_NULL)
	public static class RiderVoucherTotal{
		
		public RiderVoucherTotal(){
			
		}
		
		public Long sr_idContry;
		public String sr_ContryName;
		public Integer r_Rider_Count;
		public Integer sr_ServiceRecord_Count;
		public Integer sr_serviceType_1;
		public Integer sr_serviceType_2;
		public Integer sr_serviceType_3;
		public Integer sr_serviceType_4;
		public Float srv_totalAmmount_SUM;
		public Float srv_totalAmmount_AVG;
		public Float srv_distance_AVG;
		public Long getSr_idContry() {
			return sr_idContry;
		}
		public void setSr_idContry(Long sr_idContry) {
			this.sr_idContry = sr_idContry;
		}
		public String getSr_ContryName() {
			return sr_ContryName;
		}
		public void setSr_ContryName(String sr_ContryName) {
			this.sr_ContryName = sr_ContryName;
		}
		public Integer getR_Rider_Count() {
			return r_Rider_Count;
		}
		public void setR_Rider_Count(Integer r_Rider_Count) {
			this.r_Rider_Count = r_Rider_Count;
		}
		public Integer getSr_ServiceRecord_Count() {
			return sr_ServiceRecord_Count;
		}
		public void setSr_ServiceRecord_Count(Integer sr_ServiceRecord_Count) {
			this.sr_ServiceRecord_Count = sr_ServiceRecord_Count;
		}
		public Integer getSr_serviceType_1() {
			return sr_serviceType_1;
		}
		public void setSr_serviceType_1(Integer sr_serviceType_1) {
			this.sr_serviceType_1 = sr_serviceType_1;
		}
		public Integer getSr_serviceType_2() {
			return sr_serviceType_2;
		}
		public void setSr_serviceType_2(Integer sr_serviceType_2) {
			this.sr_serviceType_2 = sr_serviceType_2;
		}
		public Integer getSr_serviceType_3() {
			return sr_serviceType_3;
		}
		public void setSr_serviceType_3(Integer sr_serviceType_3) {
			this.sr_serviceType_3 = sr_serviceType_3;
		}
		public Integer getSr_serviceType_4() {
			return sr_serviceType_4;
		}
		public void setSr_serviceType_4(Integer sr_serviceType_4) {
			this.sr_serviceType_4 = sr_serviceType_4;
		}
		public Float getSrv_totalAmmount_SUM() {
			return srv_totalAmmount_SUM;
		}
		public void setSrv_totalAmmount_SUM(Float srv_totalAmmount_SUM) {
			this.srv_totalAmmount_SUM = srv_totalAmmount_SUM;
		}
		public Float getSrv_totalAmmount_AVG() {
			return srv_totalAmmount_AVG;
		}
		public void setSrv_totalAmmount_AVG(Float srv_totalAmmount_AVG) {
			this.srv_totalAmmount_AVG = srv_totalAmmount_AVG;
		}
		public Float getSrv_distance_AVG() {
			return srv_distance_AVG;
		}
		public void setSrv_distance_AVG(Float srv_distance_AVG) {
			this.srv_distance_AVG = srv_distance_AVG;
		}
		
		
		@Override
		public String toString() {
			return "RiderVoucherTotal [sr_idContry=" + sr_idContry + ", sr_ContryName=" + sr_ContryName
					+ ", r_Rider_Count=" + r_Rider_Count + ", sr_ServiceRecord_Count=" + sr_ServiceRecord_Count
					+ ", sr_serviceType_1=" + sr_serviceType_1 + ", sr_serviceType_2=" + sr_serviceType_2
					+ ", sr_serviceType_3=" + sr_serviceType_3 + ", sr_serviceType_4=" + sr_serviceType_4
					+ ", srv_totalAmmount_SUM=" + srv_totalAmmount_SUM + ", srv_totalAmmount_AVG="
					+ srv_totalAmmount_AVG + ", srv_distance_AVG=" + srv_distance_AVG + "]";
		}
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class RiderVoucherDetail{
		
		public RiderVoucherDetail(){
			
		}
		
		private Float srv_totalAmmount;
		private Float srv_serviceAmmount;
        private Long srv_idUsedPaymentMethod;
        private String srv_UsedPaymentMethod_Name;
        private Float srv_otherAmmount;
        private Float srv_taxAmmount;
        private Float srv_appFeeAmmount;
        private String srv_createdDate;
        private String r_lastNames;
        private Long r_idRider;
        private Long r_idUser;
        private String r_email;
        private String r_mobile;
        private String r_names;
        private String r_username;
        private Integer r_status;
        private String sr_Destino;
        private Long sr_idCity;
        private String sr_Origen;
        private String sr_ContryName;
        private String sr_CityName;
        private String sr_StateName;
        private Long sr_idContry;
        private Long sr_idState;
        private Float srv_distance;
        private Long sr_idServiceRecord;
        private Integer sr_serviceType;
        private List<RiderVoucherTotal> riderVoucherTotal;
        private String serviceTypeName;
        private Timestamp createdTS;
        private Integer sr_idStatusServiceRecord;
        private String sr_statusServiceRecord;
        private String d_name;
        private Integer r_isCorporativeUser;
        private String r_corporative;
        
        
		public Float getSrv_totalAmmount() {
			return srv_totalAmmount;
		}
		public void setSrv_totalAmmount(Float srv_totalAmmount) {
			this.srv_totalAmmount = srv_totalAmmount;
		}
		public Float getSrv_serviceAmmount() {
			return srv_serviceAmmount;
		}
		public void setSrv_serviceAmmount(Float srv_serviceAmmount) {
			this.srv_serviceAmmount = srv_serviceAmmount;
		}
		public Long getSrv_idUsedPaymentMethod() {
			return srv_idUsedPaymentMethod;
		}
		public void setSrv_idUsedPaymentMethod(Long srv_idUsedPaymentMethod) {
			this.srv_idUsedPaymentMethod = srv_idUsedPaymentMethod;
		}
		public String getSrv_UsedPaymentMethod_Name() {
			return srv_UsedPaymentMethod_Name;
		}
		public void setSrv_UsedPaymentMethod_Name(String srv_UsedPaymentMethod_Name) {
			this.srv_UsedPaymentMethod_Name = srv_UsedPaymentMethod_Name;
		}
		public Float getSrv_otherAmmount() {
			return srv_otherAmmount;
		}
		public void setSrv_otherAmmount(Float srv_otherAmmount) {
			this.srv_otherAmmount = srv_otherAmmount;
		}
		public Float getSrv_taxAmmount() {
			return srv_taxAmmount;
		}
		public void setSrv_taxAmmount(Float srv_taxAmmount) {
			this.srv_taxAmmount = srv_taxAmmount;
		}
		public Float getSrv_appFeeAmmount() {
			return srv_appFeeAmmount;
		}
		public void setSrv_appFeeAmmount(Float srv_appFeeAmmount) {
			this.srv_appFeeAmmount = srv_appFeeAmmount;
		}
		public String getSrv_createdDate() {
			return srv_createdDate;
		}
		public void setSrv_createdDate(String srv_createdDate) {
			this.srv_createdDate = srv_createdDate;
		}
		public String getR_lastNames() {
			return r_lastNames;
		}
		public void setR_lastNames(String r_lastNames) {
			this.r_lastNames = r_lastNames;
		}
		public Long getR_idRider() {
			return r_idRider;
		}
		public void setR_idRider(Long r_idRider) {
			this.r_idRider = r_idRider;
		}
		public Long getR_idUser() {
			return r_idUser;
		}
		public void setR_idUser(Long r_idUser) {
			this.r_idUser = r_idUser;
		}
		public String getR_email() {
			return r_email;
		}
		public void setR_email(String r_email) {
			this.r_email = r_email;
		}
		public String getR_mobile() {
			return r_mobile;
		}
		public void setR_mobile(String r_mobile) {
			this.r_mobile = r_mobile;
		}
		public String getR_names() {
			return r_names;
		}
		public void setR_names(String r_names) {
			this.r_names = r_names;
		}
		public String getR_username() {
			return r_username;
		}
		public void setR_username(String r_username) {
			this.r_username = r_username;
		}
		public Integer getR_status() {
			return r_status;
		}
		public void setR_status(Integer r_status) {
			this.r_status = r_status;
		}
		public String getSr_Destino() {
			return sr_Destino;
		}
		public void setSr_Destino(String sr_Destino) {
			this.sr_Destino = sr_Destino;
		}
		public Long getSr_idCity() {
			return sr_idCity;
		}
		public void setSr_idCity(Long sr_idCity) {
			this.sr_idCity = sr_idCity;
		}
		public String getSr_Origen() {
			return sr_Origen;
		}
		public void setSr_Origen(String sr_Origen) {
			this.sr_Origen = sr_Origen;
		}
		public String getSr_ContryName() {
			return sr_ContryName;
		}
		public void setSr_ContryName(String sr_ContryName) {
			this.sr_ContryName = sr_ContryName;
		}
		public String getSr_CityName() {
			return sr_CityName;
		}
		public void setSr_CityName(String sr_CityName) {
			this.sr_CityName = sr_CityName;
		}
		public String getSr_StateName() {
			return sr_StateName;
		}
		public void setSr_StateName(String sr_StateName) {
			this.sr_StateName = sr_StateName;
		}
		public Long getSr_idContry() {
			return sr_idContry;
		}
		public void setSr_idContry(Long sr_idContry) {
			this.sr_idContry = sr_idContry;
		}
		public Long getSr_idState() {
			return sr_idState;
		}
		public void setSr_idState(Long sr_idState) {
			this.sr_idState = sr_idState;
		}
		public Float getSrv_distance() {
			return srv_distance;
		}
		public void setSrv_distance(Float srv_distance) {
			this.srv_distance = srv_distance;
		}
		public Long getSr_idServiceRecord() {
			return sr_idServiceRecord;
		}
		public void setSr_idServiceRecord(Long sr_idServiceRecord) {
			this.sr_idServiceRecord = sr_idServiceRecord;
		}
		public Integer getSr_serviceType() {
			return sr_serviceType;
		}
		public void setSr_serviceType(Integer sr_serviceType) {
			this.sr_serviceType = sr_serviceType;
		}
		
		public List<RiderVoucherTotal> getRiderVoucherTotal() {
			return riderVoucherTotal;
		}
		public void setRiderVoucherTotal(List<RiderVoucherTotal> riderVoucherTotal) {
			this.riderVoucherTotal = riderVoucherTotal;
		}
		public String getServiceTypeName() {
			return serviceTypeName;
		}
		public void setServiceTypeName(String serviceTypeName) {
			this.serviceTypeName = serviceTypeName;
		}
		public Timestamp getCreatedTS() {
			return createdTS;
		}
		public void setCreatedTS(Timestamp createdTS) {
			this.createdTS = createdTS;
		}
		public Integer getSr_idStatusServiceRecord() {
			return sr_idStatusServiceRecord;
		}
		public void setSr_idStatusServiceRecord(Integer sr_idStatusServiceRecord) {
			this.sr_idStatusServiceRecord = sr_idStatusServiceRecord;
		}
		public String getSr_statusServiceRecord() {
			return sr_statusServiceRecord;
		}
		public void setSr_statusServiceRecord(String sr_statusServiceRecord) {
			this.sr_statusServiceRecord = sr_statusServiceRecord;
		}
		public String getD_name() {
			return d_name;
		}
		public void setD_name(String d_name) {
			this.d_name = d_name;
		}
		public Integer getR_isCorporativeUser() {
			return r_isCorporativeUser;
		}
		public void setR_isCorporativeUser(Integer r_isCorporativeUser) {
			this.r_isCorporativeUser = r_isCorporativeUser;
		}
		public String getR_corporative() {
			return r_corporative;
		}
		public void setR_corporative(String r_corporative) {
			this.r_corporative = r_corporative;
		}
		@Override
		public String toString() {
			return "RiderVoucherDetail [srv_totalAmmount=" + srv_totalAmmount + ", srv_serviceAmmount="
					+ srv_serviceAmmount + ", srv_idUsedPaymentMethod=" + srv_idUsedPaymentMethod
					+ ", srv_UsedPaymentMethod_Name=" + srv_UsedPaymentMethod_Name + ", srv_otherAmmount="
					+ srv_otherAmmount + ", srv_taxAmmount=" + srv_taxAmmount + ", srv_appFeeAmmount="
					+ srv_appFeeAmmount + ", srv_createdDate=" + srv_createdDate + ", r_lastNames=" + r_lastNames
					+ ", r_idRider=" + r_idRider + ", r_idUser=" + r_idUser + ", r_email=" + r_email + ", r_mobile="
					+ r_mobile + ", r_names=" + r_names + ", r_username=" + r_username + ", r_status=" + r_status
					+ ", sr_Destino=" + sr_Destino + ", sr_idCity=" + sr_idCity + ", sr_Origen=" + sr_Origen
					+ ", sr_ContryName=" + sr_ContryName + ", sr_CityName=" + sr_CityName + ", sr_StateName="
					+ sr_StateName + ", sr_idContry=" + sr_idContry + ", sr_idState=" + sr_idState + ", srv_distance="
					+ srv_distance + ", sr_idServiceRecord=" + sr_idServiceRecord + ", sr_serviceType=" + sr_serviceType
					+ ", riderVoucherTotal=" + riderVoucherTotal + ", serviceTypeName=" + serviceTypeName
					+ ", createdTS=" + createdTS + ", sr_idStatusServiceRecord=" + sr_idStatusServiceRecord
					+ ", sr_statusServiceRecord=" + sr_statusServiceRecord + ", d_name=" + d_name
					+ ", r_isCorporativeUser=" + r_isCorporativeUser + ", r_corporative=" + r_corporative + "]";
		}
		
	}

}
