package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class DriverServiceVoucher  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public DriverServiceVoucher(){
		
	}
	
	private List<DiverServiceVoucherTotal> driverServiceVoucherTotal;
	private List<DriverServiceVoucherDetail> driverServiceVoucher;
	


	public List<DiverServiceVoucherTotal> getDriverServiceVoucherTotal() {
		return driverServiceVoucherTotal;
	}

	public void setDriverServiceVoucherTotal(List<DiverServiceVoucherTotal> driverServiceVoucherTotal) {
		this.driverServiceVoucherTotal = driverServiceVoucherTotal;
	}

	public List<DriverServiceVoucherDetail> getDriverServiceVoucher() {
		return driverServiceVoucher;
	}

	public void setDriverServiceVoucher(List<DriverServiceVoucherDetail> driverServiceVoucher) {
		this.driverServiceVoucher = driverServiceVoucher;
	}
	
	
	
	
	@Override
	public String toString() {
		return "DriverServiceVoucher [driverServiceVoucherTotal=" + driverServiceVoucherTotal
				+ ", driverServiceVoucher=" + driverServiceVoucher + "]";
	}

	@JsonInclude(Include.NON_NULL)
	public static class DiverServiceVoucherTotal{
		
		public DiverServiceVoucherTotal(){
			
		}
		
		private Long sr_idContry;
	    private String sr_ContryName;
	    private Long sr_ServiceRecord_Count;
	    private Long sr_serviceType_1;
	    private Long sr_serviceType_2;
	    private Long sr_serviceType_3;
	    private Long sr_serviceType_4;
	    private Integer d_Driver_Count;
	    private Float srv_totalAmmount_SUM;
	    private Float srv_totalAmmount_AVG;
	    private Float srv_distance_AVG;
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
		public Long getSr_ServiceRecord_Count() {
			return sr_ServiceRecord_Count;
		}
		public void setSr_ServiceRecord_Count(Long sr_ServiceRecord_Count) {
			this.sr_ServiceRecord_Count = sr_ServiceRecord_Count;
		}
		public Long getSr_serviceType_1() {
			return sr_serviceType_1;
		}
		public void setSr_serviceType_1(Long sr_serviceType_1) {
			this.sr_serviceType_1 = sr_serviceType_1;
		}
		public Long getSr_serviceType_2() {
			return sr_serviceType_2;
		}
		public void setSr_serviceType_2(Long sr_serviceType_2) {
			this.sr_serviceType_2 = sr_serviceType_2;
		}
		public Long getSr_serviceType_3() {
			return sr_serviceType_3;
		}
		public void setSr_serviceType_3(Long sr_serviceType_3) {
			this.sr_serviceType_3 = sr_serviceType_3;
		}
		public Long getSr_serviceType_4() {
			return sr_serviceType_4;
		}
		public void setSr_serviceType_4(Long sr_serviceType_4) {
			this.sr_serviceType_4 = sr_serviceType_4;
		}
		public Integer getD_Driver_Count() {
			return d_Driver_Count;
		}
		public void setD_Driver_Count(Integer d_Driver_Count) {
			this.d_Driver_Count = d_Driver_Count;
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
			return "DiverServiceVoucherTotal [sr_idContry=" + sr_idContry + ", sr_ContryName=" + sr_ContryName
					+ ", sr_ServiceRecord_Count=" + sr_ServiceRecord_Count + ", sr_serviceType_1=" + sr_serviceType_1
					+ ", sr_serviceType_2=" + sr_serviceType_2 + ", sr_serviceType_3=" + sr_serviceType_3
					+ ", sr_serviceType_4=" + sr_serviceType_4 + ", d_Driver_Count=" + d_Driver_Count
					+ ", srv_totalAmmount_SUM=" + srv_totalAmmount_SUM + ", srv_totalAmmount_AVG="
					+ srv_totalAmmount_AVG + ", srv_distance_AVG=" + srv_distance_AVG + "]";
		}
		
	    
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class DriverServiceVoucherDetail{
		
		public DriverServiceVoucherDetail(){
			
		}
		
		private Long sr_idServiceRecord;
	    private Long sr_serviceType;
	    private Long sr_idContry;
	    private String sr_ContryName;
	    private Long sr_idState;
	    private String sr_StateName;
	    private Long sr_idCity;
	    private String sr_CityName;
	    private String sr_Origen;
	    private String sr_Destino;
	    private Long d_idDriver;
	    private String d_firstName;
	    private String d_fathersLastName;
	    private String d_driverLicense;
	    private Long d_idUser;
	    private String d_username;
	    private String t_vehiclePlate;
	    private Long srv_idUsedPaymentMethod;
	    private String srv_UsedPaymentMethod_Name;
	    private Float srv_totalAmmount;
	    private Float srv_distance;
	    private Float srv_serviceAmmount;
	    private Float srv_appFeeAmmount;
	    private Float srv_otherAmmount;
	    private Float srv_taxAmmount;
	    private String srv_createdDate;
	    private List<DiverServiceVoucherTotal> diverServiceVoucherTotal;
	    private String typeServiceName;
	    private String distanceFormatted;
	    private Timestamp createdTS;
	    private Long t_idTaxiCorp;
		private String t_TaxiCorpName;
		private String totalAmmount;
	    
		public Long getSr_idServiceRecord() {
			return sr_idServiceRecord;
		}
		public void setSr_idServiceRecord(Long sr_idServiceRecord) {
			this.sr_idServiceRecord = sr_idServiceRecord;
		}
		public Long getSr_serviceType() {
			return sr_serviceType;
		}
		public void setSr_serviceType(Long sr_serviceType) {
			this.sr_serviceType = sr_serviceType;
		}
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
		public Long getSr_idCity() {
			return sr_idCity;
		}
		public void setSr_idCity(Long sr_idCity) {
			this.sr_idCity = sr_idCity;
		}
		public String getSr_CityName() {
			return sr_CityName;
		}
		public void setSr_CityName(String sr_CityName) {
			this.sr_CityName = sr_CityName;
		}
		public String getSr_Origen() {
			return sr_Origen;
		}
		public void setSr_Origen(String sr_Origen) {
			this.sr_Origen = sr_Origen;
		}
		public String getSr_Destino() {
			return sr_Destino;
		}
		public void setSr_Destino(String sr_Destino) {
			this.sr_Destino = sr_Destino;
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
		public String getD_username() {
			return d_username;
		}
		public void setD_username(String d_username) {
			this.d_username = d_username;
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
		public Float getSrv_totalAmmount() {
			return srv_totalAmmount;
		}
		public void setSrv_totalAmmount(Float srv_totalAmmount) {
			this.srv_totalAmmount = srv_totalAmmount;
		}
		public Float getSrv_distance() {
			return srv_distance;
		}
		public void setSrv_distance(Float srv_distance) {
			this.srv_distance = srv_distance;
		}
		public Float getSrv_serviceAmmount() {
			return srv_serviceAmmount;
		}
		public void setSrv_serviceAmmount(Float srv_serviceAmmount) {
			this.srv_serviceAmmount = srv_serviceAmmount;
		}
		public Float getSrv_appFeeAmmount() {
			return srv_appFeeAmmount;
		}
		public void setSrv_appFeeAmmount(Float srv_appFeeAmmount) {
			this.srv_appFeeAmmount = srv_appFeeAmmount;
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
		public String getSrv_createdDate() {
			return srv_createdDate;
		}
		public void setSrv_createdDate(String srv_createdDate) {
			this.srv_createdDate = srv_createdDate;
		}
		public List<DiverServiceVoucherTotal> getDiverServiceVoucherTotal() {
			return diverServiceVoucherTotal;
		}
		public void setDiverServiceVoucherTotal(List<DiverServiceVoucherTotal> diverServiceVoucherTotal) {
			this.diverServiceVoucherTotal = diverServiceVoucherTotal;
		}
		public String getTypeServiceName() {
			return typeServiceName;
		}
		public void setTypeServiceName(String typeServiceName) {
			this.typeServiceName = typeServiceName;
		}
		public String getT_vehiclePlate() {
			return t_vehiclePlate;
		}
		public void setT_vehiclePlate(String t_vehiclePlate) {
			this.t_vehiclePlate = t_vehiclePlate;
		}
		public String getDistanceFormatted() {
			return distanceFormatted;
		}
		public void setDistanceFormatted(String distanceFormatted) {
			this.distanceFormatted = distanceFormatted;
		}
		public Timestamp getCreatedTS() {
			return createdTS;
		}
		public void setCreatedTS(Timestamp createdTS) {
			this.createdTS = createdTS;
		}
		public Long getT_idTaxiCorp() {
			return t_idTaxiCorp;
		}
		public void setT_idTaxiCorp(Long t_idTaxiCorp) {
			this.t_idTaxiCorp = t_idTaxiCorp;
		}
		public String getT_TaxiCorpName() {
			return t_TaxiCorpName;
		}
		public void setT_TaxiCorpName(String t_TaxiCorpName) {
			this.t_TaxiCorpName = t_TaxiCorpName;
		}
		public String getTotalAmmount() {
			return totalAmmount;
		}
		public void setTotalAmmount(String totalAmmount) {
			this.totalAmmount = totalAmmount;
		}
		@Override
		public String toString() {
			return "DriverServiceVoucherDetail [sr_idServiceRecord=" + sr_idServiceRecord + ", sr_serviceType="
					+ sr_serviceType + ", sr_idContry=" + sr_idContry + ", sr_ContryName=" + sr_ContryName
					+ ", sr_idState=" + sr_idState + ", sr_StateName=" + sr_StateName + ", sr_idCity=" + sr_idCity
					+ ", sr_CityName=" + sr_CityName + ", sr_Origen=" + sr_Origen + ", sr_Destino=" + sr_Destino
					+ ", d_idDriver=" + d_idDriver + ", d_firstName=" + d_firstName + ", d_fathersLastName="
					+ d_fathersLastName + ", d_driverLicense=" + d_driverLicense + ", d_idUser=" + d_idUser
					+ ", d_username=" + d_username + ", t_vehiclePlate=" + t_vehiclePlate + ", srv_idUsedPaymentMethod="
					+ srv_idUsedPaymentMethod + ", srv_UsedPaymentMethod_Name=" + srv_UsedPaymentMethod_Name
					+ ", srv_totalAmmount=" + srv_totalAmmount + ", srv_distance=" + srv_distance
					+ ", srv_serviceAmmount=" + srv_serviceAmmount + ", srv_appFeeAmmount=" + srv_appFeeAmmount
					+ ", srv_otherAmmount=" + srv_otherAmmount + ", srv_taxAmmount=" + srv_taxAmmount
					+ ", srv_createdDate=" + srv_createdDate + ", diverServiceVoucherTotal=" + diverServiceVoucherTotal
					+ ", typeServiceName=" + typeServiceName + ", distanceFormatted=" + distanceFormatted
					+ ", createdTS=" + createdTS + "]";
		}
	    
	    
		
	}

}
