package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class FareData implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private List<CityFareList> cityFareList;
	
	
	
	public FareData(){
		
	}



	public List<CityFareList> getCityFareList() {
		return cityFareList;
	}


	public void setCityFareList(List<CityFareList> cityFareList) {
		this.cityFareList = cityFareList;
	}


	
	

	@Override
	public String toString() {
		return "FareData [cityFareList=" + cityFareList + "]";
	}





	@JsonInclude(Include.NON_NULL)
	public static class CityFareList{
		
		public CityFareList(){
			
		}
		
		private Integer idLocalidad;
		private List<Fares> fares;
		private List<AppFee> appFee;
		private List<OtherCharges> otherCharges;
		

		
		
		

		public Integer getIdLocalidad() {
			return idLocalidad;
		}

		public void setIdLocalidad(Integer idLocalidad) {
			this.idLocalidad = idLocalidad;
		}

		public List<Fares> getFares() {
			return fares;
		}

		public void setFares(List<Fares> fares) {
			this.fares = fares;
		}

		public List<AppFee> getAppFee() {
			return appFee;
		}

		public void setAppFee(List<AppFee> appFee) {
			this.appFee = appFee;
		}

		public List<OtherCharges> getOtherCharges() {
			return otherCharges;
		}

		public void setOtherCharges(List<OtherCharges> otherCharges) {
			this.otherCharges = otherCharges;
		}
		
		
		

		@Override
		public String toString() {
			return "CityFareList [idLocalidad=" + idLocalidad + ", fares=" + fares + ", appFee=" + appFee
					+ ", otherCharges=" + otherCharges + "]";
		}




		@JsonInclude(Include.NON_NULL)
		public static class Fares{
			
			public Fares(){
				
			}
			
			private Long idFare;
			private Long startAt;
			private String currency;
			private String initialFare;
			private String minimumFare;
			private String idleFare;
			private List<Integer> days;
			private List<DistanceFareList> distanceFareList;
			private String distanceUnit;
			
			
			
			public Long getIdFare() {
				return idFare;
			}



			public void setIdFare(Long idFare) {
				this.idFare = idFare;
			}



			public Long getStartAt() {
				return startAt;
			}



			public void setStartAt(Long startAt) {
				this.startAt = startAt;
			}



			public String getCurrency() {
				return currency;
			}



			public void setCurrency(String currency) {
				this.currency = currency;
			}



			public String getInitialFare() {
				return initialFare;
			}



			public void setInitialFare(String initialFare) {
				this.initialFare = initialFare;
			}



			public String getMinimumFare() {
				return minimumFare;
			}



			public void setMinimumFare(String minimumFare) {
				this.minimumFare = minimumFare;
			}



			public String getIdleFare() {
				return idleFare;
			}



			public void setIdleFare(String idleFare) {
				this.idleFare = idleFare;
			}



			public List<Integer> getDays() {
				return days;
			}



			public void setDays(List<Integer> days) {
				this.days = days;
			}



			public List<DistanceFareList> getDistanceFareList() {
				return distanceFareList;
			}



			public void setDistanceFareList(List<DistanceFareList> distanceFareList) {
				this.distanceFareList = distanceFareList;
			}



			public String getDistanceUnit() {
				return distanceUnit;
			}



			public void setDistanceUnit(String distanceUnit) {
				this.distanceUnit = distanceUnit;
			}
			
			



			@Override
			public String toString() {
				return "Fares [idFare=" + idFare + ", startAt=" + startAt + ", currency=" + currency + ", initialFare="
						+ initialFare + ", minimumFare=" + minimumFare + ", idleFare=" + idleFare + ", days=" + days
						+ ", distanceFareList=" + distanceFareList + ", distanceUnit=" + distanceUnit + "]";
			}





			@JsonInclude(Include.NON_NULL)
			public static class DistanceFareList{
				private Integer fromDistance;
				private Integer distanceFare;
				
				
				public DistanceFareList(){
					
				}
				
				public Integer getFromDistance() {
					return fromDistance;
				}
				public void setFromDistance(Integer fromDistance) {
					this.fromDistance = fromDistance;
				}
				public Integer getDistanceFare() {
					return distanceFare;
				}
				public void setDistanceFare(Integer distanceFare) {
					this.distanceFare = distanceFare;
				}
				
				
				@Override
				public String toString() {
					return "DistanceFareList [fromDistance=" + fromDistance + ", distanceFare=" + distanceFare + "]";
				}
				
				
				
				
			}
			
			
		}
		
		
		@JsonInclude(Include.NON_NULL)
		public static class AppFee{
			
			public AppFee(){
				
			}
			
			private Integer serviceType;
			private String serviceName;
			private Float riderCharge;
			private Float driverCharge;
			
			
			public Integer getServiceType() {
				return serviceType;
			}
			public void setServiceType(Integer serviceType) {
				this.serviceType = serviceType;
			}
			public String getServiceName() {
				return serviceName;
			}
			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}
			public Float getRiderCharge() {
				return riderCharge;
			}
			public void setRiderCharge(Float riderCharge) {
				this.riderCharge = riderCharge;
			}
			public Float getDriverCharge() {
				return driverCharge;
			}
			public void setDriverCharge(Float driverCharge) {
				this.driverCharge = driverCharge;
			}
			
			
			@Override
			public String toString() {
				return "AppFee [serviceType=" + serviceType + ", serviceName=" + serviceName + ", riderCharge="
						+ riderCharge + ", driverCharge=" + driverCharge + "]";
			}
			
			
			
			
			
		}
		
		@JsonInclude(Include.NON_NULL)
		public static class OtherCharges{
			
			public OtherCharges(){
				
			}
			
			private String name;
			private Float value;
			
			
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public Float getValue() {
				return value;
			}
			public void setValue(Float value) {
				this.value = value;
			}
			
			
			@Override
			public String toString() {
				return "OtherCharges [name=" + name + ", value=" + value + "]";
			}
			
			
			
		}
		
		
	}

}
