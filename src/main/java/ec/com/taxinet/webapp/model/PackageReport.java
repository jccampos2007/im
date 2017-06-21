package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PackageReport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<PackageReportInfo> reportDriverPackageList;
	
	public PackageReport(){
		
	}
	
	
	
	
	public List<PackageReportInfo> getReportDriverPackageList() {
		return reportDriverPackageList;
	}




	public void setReportDriverPackageList(List<PackageReportInfo> reportDriverPackageList) {
		this.reportDriverPackageList = reportDriverPackageList;
	}


	


	@Override
	public String toString() {
		return "PackageReport [reportDriverPackageList=" + reportDriverPackageList + "]";
	}





	@JsonInclude(Include.NON_NULL)
	public static class PackageReportInfo{
		
		public PackageReportInfo(){
			
		}
		
		private Long idDriverPackage;
		private String driverLicense;
		private String vehiclePlate;
		private Float balance;
		private String taxiCorpName;
		private String driverNames;
		private String driverLastNames;
		private Float credit;
		private Float debit;
		private Long driverPackageDate;
		
		
		public Long getIdDriverPackage() {
			return idDriverPackage;
		}
		public void setIdDriverPackage(Long idDriverPackage) {
			this.idDriverPackage = idDriverPackage;
		}
		public String getDriverLicense() {
			return driverLicense;
		}
		public void setDriverLicense(String driverLicense) {
			this.driverLicense = driverLicense;
		}
		public String getVehiclePlate() {
			return vehiclePlate;
		}
		public void setVehiclePlate(String vehiclePlate) {
			this.vehiclePlate = vehiclePlate;
		}
		public Float getBalance() {
			return balance;
		}
		public void setBalance(Float balance) {
			this.balance = balance;
		}
		public String getTaxiCorpName() {
			return taxiCorpName;
		}
		public void setTaxiCorpName(String taxiCorpName) {
			this.taxiCorpName = taxiCorpName;
		}
		public String getDriverNames() {
			return driverNames;
		}
		public void setDriverNames(String driverNames) {
			this.driverNames = driverNames;
		}
		public String getDriverLastNames() {
			return driverLastNames;
		}
		public void setDriverLastNames(String driverLastNames) {
			this.driverLastNames = driverLastNames;
		}
		public Float getCredit() {
			return credit;
		}
		public void setCredit(Float credit) {
			this.credit = credit;
		}
		public Float getDebit() {
			return debit;
		}
		public void setDebit(Float debit) {
			this.debit = debit;
		}
		public Long getDriverPackageDate() {
			return driverPackageDate;
		}
		public void setDriverPackageDate(Long driverPackageDate) {
			this.driverPackageDate = driverPackageDate;
		}
		
		
		@Override
		public String toString() {
			return "PackageReportInfo [idDriverPackage=" + idDriverPackage + ", driverLicense=" + driverLicense
					+ ", vehiclePlate=" + vehiclePlate + ", balance=" + balance + ", taxiCorpName=" + taxiCorpName
					+ ", driverNames=" + driverNames + ", driverLastNames=" + driverLastNames + ", credit=" + credit
					+ ", debit=" + debit + ", driverPackageDate=" + driverPackageDate + "]";
		}
		
		
		
	}

}
