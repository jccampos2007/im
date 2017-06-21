package ec.com.taxinet.webapp.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class FinishedServices  implements Serializable {
	
	public FinishedServices() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idServiceRecord;
	private Long idPaymentMethod;
	private String pickUpDateTime;
	private String FormatPickUpDate;
	private String FormatPickUpTime;
	private String pickUpLocation;
	private String dropOffLocation;
	private Double totalAmmount;
	private AdminFinishedServicesAditional adminFinishedServicesAditional;

	

	public Long getIdServiceRecord() {
		return idServiceRecord;
	}



	public void setIdServiceRecord(Long idServiceRecord) {
		this.idServiceRecord = idServiceRecord;
	}



	public Long getIdPaymentMethod() {
		return idPaymentMethod;
	}



	public void setIdPaymentMethod(Long idPaymentMethod) {
		this.idPaymentMethod = idPaymentMethod;
	}



	public String getPickUpDateTime() {
		return pickUpDateTime;
	}



	public void setPickUpDateTime(String pickUpDateTime) {
		this.pickUpDateTime = pickUpDateTime;
	}



	public String getFormatPickUpDate() {
		return FormatPickUpDate;
	}



	public void setFormatPickUpDate(String formatPickUpDate) {
		FormatPickUpDate = formatPickUpDate;
	}



	public String getFormatPickUpTime() {
		return FormatPickUpTime;
	}



	public void setFormatPickUpTime(String formatPickUpTime) {
		FormatPickUpTime = formatPickUpTime;
	}



	public String getPickUpLocation() {
		return pickUpLocation;
	}



	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}



	public String getDropOffLocation() {
		return dropOffLocation;
	}



	public void setDropOffLocation(String dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}



	public Double getTotalAmmount() {
		return totalAmmount;
	}



	public void setTotalAmmount(Double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}



	public AdminFinishedServicesAditional getAdminFinishedServicesAditional() {
		return adminFinishedServicesAditional;
	}



	public void setAdminFinishedServicesAditional(AdminFinishedServicesAditional adminFinishedServicesAditional) {
		this.adminFinishedServicesAditional = adminFinishedServicesAditional;
	}

	@Override
	public String toString() {
		return "FinishedServices [idServiceRecord=" + idServiceRecord + ", idPaymentMethod=" + idPaymentMethod
				+ ", pickUpDateTime=" + pickUpDateTime + ", FormatPickUpDate=" + FormatPickUpDate
				+ ", FormatPickUpTime=" + FormatPickUpTime + ", pickUpLocation=" + pickUpLocation + ", dropOffLocation="
				+ dropOffLocation + ", totalAmmount=" + totalAmmount + ", adminFinishedServicesAditional="
				+ adminFinishedServicesAditional + "]";
	}

	@JsonInclude(Include.NON_NULL)
	public static class AdminFinishedServicesAditional{
		
		public AdminFinishedServicesAditional(){
			
		}
		
		/*
		 * 
		 */		
		private String username;
		private String driverFullName;
		private String driverEmail;
		private String driverLicense;
		private String dropOffDateTime;
		private Double totalDistance;
		private Double totalIdleTime;
		
		public String getUsername() {
			return username;
		}
		
		public void setUsername(String username) {
			this.username = username;
		}
		
		public String getDriverFullName() {
			return driverFullName;
		}
		
		public void setDriverFullName(String driverFullName) {
			this.driverFullName = driverFullName;
		}
		
		public String getDriverEmail() {
			return driverEmail;
		}
		
		public void setDriverEmail(String driverEmail) {
			this.driverEmail = driverEmail;
		}
		
		public String getDriverLicense() {
			return driverLicense;
		}
		
		public void setDriverLicense(String driverLicense) {
			this.driverLicense = driverLicense;
		}
		
		public String getDropOffDateTime() {
			return dropOffDateTime;
		}
		
		public void setDropOffDateTime(String dropOffDateTime) {
			this.dropOffDateTime = dropOffDateTime;
		}
		
		public Double getTotalDistance() {
			return totalDistance;
		}
		
		public void setTotalDistance(Double totalDistance) {
			this.totalDistance = totalDistance;
		}
		
		public Double getTotalIdleTime() {
			return totalIdleTime;
		}
		
		public void setTotalIdleTime(Double totalIdleTime) {
			this.totalIdleTime = totalIdleTime;
		}

		@Override
		public String toString() {
			return "AdminFinishedServicesAditional [username=" + username + ", driverFullName=" + driverFullName
					+ ", driverEmail=" + driverEmail + ", driverLicense=" + driverLicense + ", dropOffDateTime="
					+ dropOffDateTime + ", totalDistance=" + totalDistance + ", totalIdleTime=" + totalIdleTime + "]";
		}

	}

}
