package ec.com.taxinet.webapp.form.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ChargeForm {

	private Float appFee; //Aplicacion
	private Float companyFee; //Corporativas
	private Float driverCharge; //
	private Long idCity;
	private Long idUserSession;
	private Float immediateFee; //Inmediatas
	private Float multiserviceFee;
	private Float scheduledFee; // Programadas
	private Float selfFee; //Instantaneas
	private String tokenSession;
	private Boolean statusCharge;
	private Float driverImmediateFee;
	private Float driverScheduledFee;
	private Float driverMultiserviceFee;
	private Float driverSelfFee;
	private Float driverCompanyFee;
	
	public ChargeForm(){
		
	}
	
	
	
	public Float getAppFee() {
		return appFee;
	}



	public void setAppFee(Float appFee) {
		this.appFee = appFee;
	}



	public Float getCompanyFee() {
		return companyFee;
	}



	public void setCompanyFee(Float companyFee) {
		this.companyFee = companyFee;
	}



	public Float getDriverCharge() {
		return driverCharge;
	}



	public void setDriverCharge(Float driverCharge) {
		this.driverCharge = driverCharge;
	}



	public Long getIdCity() {
		return idCity;
	}



	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}



	public Long getIdUserSession() {
		return idUserSession;
	}



	public void setIdUserSession(Long idUserSession) {
		this.idUserSession = idUserSession;
	}



	public Float getImmediateFee() {
		return immediateFee;
	}



	public void setImmediateFee(Float immediateFee) {
		this.immediateFee = immediateFee;
	}



	public Float getMultiserviceFee() {
		return multiserviceFee;
	}



	public void setMultiserviceFee(Float multiserviceFee) {
		this.multiserviceFee = multiserviceFee;
	}



	public Float getScheduledFee() {
		return scheduledFee;
	}



	public void setScheduledFee(Float scheduledFee) {
		this.scheduledFee = scheduledFee;
	}



	public Float getSelfFee() {
		return selfFee;
	}



	public void setSelfFee(Float selfFee) {
		this.selfFee = selfFee;
	}



	public String getTokenSession() {
		return tokenSession;
	}



	public void setTokenSession(String tokenSession) {
		this.tokenSession = tokenSession;
	}



	public Boolean getStatusCharge() {
		return statusCharge;
	}



	public void setStatusCharge(Boolean statusCharge) {
		this.statusCharge = statusCharge;
	}



	public Float getDriverImmediateFee() {
		return driverImmediateFee;
	}



	public void setDriverImmediateFee(Float driverImmediateFee) {
		this.driverImmediateFee = driverImmediateFee;
	}



	public Float getDriverScheduledFee() {
		return driverScheduledFee;
	}



	public void setDriverScheduledFee(Float driverScheduledFee) {
		this.driverScheduledFee = driverScheduledFee;
	}



	public Float getDriverMultiserviceFee() {
		return driverMultiserviceFee;
	}



	public void setDriverMultiserviceFee(Float driverMultiserviceFee) {
		this.driverMultiserviceFee = driverMultiserviceFee;
	}



	public Float getDriverSelfFee() {
		return driverSelfFee;
	}



	public void setDriverSelfFee(Float driverSelfFee) {
		this.driverSelfFee = driverSelfFee;
	}



	public Float getDriverCompanyFee() {
		return driverCompanyFee;
	}



	public void setDriverCompanyFee(Float driverCompanyFee) {
		this.driverCompanyFee = driverCompanyFee;
	}



	@Override
	public String toString() {
		return "ChargeForm [appFee=" + appFee + ", companyFee=" + companyFee + ", driverCharge=" + driverCharge
				+ ", idCity=" + idCity + ", idUserSession=" + idUserSession + ", immediateFee=" + immediateFee
				+ ", multiserviceFee=" + multiserviceFee + ", scheduledFee=" + scheduledFee + ", selfFee=" + selfFee
				+ ", tokenSession=" + tokenSession + ", statusCharge=" + statusCharge + ", driverImmediateFee="
				+ driverImmediateFee + ", driverScheduledFee=" + driverScheduledFee + ", driverMultiserviceFee="
				+ driverMultiserviceFee + ", driverSelfFee=" + driverSelfFee + ", driverCompanyFee=" + driverCompanyFee
				+ "]";
	}



	@JsonInclude(Include.NON_NULL)
	public static class ChargeUpdateForm{
		
		public ChargeUpdateForm(){
			
		}
		
		private Long idCharge;
		private Boolean status;
		
		public Long getIdCharge() {
			return idCharge;
		}
		public void setIdCharge(Long idCharge) {
			this.idCharge = idCharge;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
		
		
		@Override
		public String toString() {
			return "ChargeUpdateForm [idCharge=" + idCharge + ", status=" + status + "]";
		}
		
		
	}
	
}
