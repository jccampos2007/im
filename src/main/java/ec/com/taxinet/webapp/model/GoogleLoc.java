package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class GoogleLoc implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<Results> results;
	private String status;
	

	
	public GoogleLoc(){
		
	}


	
	public List<Results> getResults() {
		return results;
	}



	public void setResults(List<Results> results) {
		this.results = results;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "GoogleLoc [results=" + results + ", status=" + status + "]";
	}




	@JsonInclude(Include.NON_NULL)
	public static class Results{
		public Results(){
			
		}
		
		
		private List<AddressComponents> address_components;
		private String formatted_address;
		private Geometry geometry;
		private String place_id;
		private List<String> types;
		
		
		
		
		public List<AddressComponents> getAddress_components() {
			return address_components;
		}

		public void setAddress_components(List<AddressComponents> address_components) {
			this.address_components = address_components;
		}

		public String getFormatted_address() {
			return formatted_address;
		}

		public void setFormatted_address(String formatted_address) {
			this.formatted_address = formatted_address;
		}

		public Geometry getGeometry() {
			return geometry;
		}

		public void setGeometry(Geometry geometry) {
			this.geometry = geometry;
		}

		public String getPlace_id() {
			return place_id;
		}

		public void setPlace_id(String place_id) {
			this.place_id = place_id;
		}

		public List<String> getTypes() {
			return types;
		}

		public void setTypes(List<String> types) {
			this.types = types;
		}

		@Override
		public String toString() {
			return "Results [address_components=" + address_components + ", formatted_address=" + formatted_address
					+ ", geometry=" + geometry + ", place_id=" + place_id + ", types=" + types + "]";
		}





		@JsonInclude(Include.NON_NULL)
		public static class AddressComponents{
			
			
			public AddressComponents(){
				
			}
			
			
			private String long_name;
			private String short_name;
			private List<String> types;
			
			
			public String getLong_name() {
				return long_name;
			}
			public void setLong_name(String long_name) {
				this.long_name = long_name;
			}
			public String getShort_name() {
				return short_name;
			}
			public void setShort_name(String short_name) {
				this.short_name = short_name;
			}
			public List<String> getTypes() {
				return types;
			}
			public void setTypes(List<String> types) {
				this.types = types;
			}
			@Override
			public String toString() {
				return "AddressComponents [long_name=" + long_name + ", short_name=" + short_name + ", types=" + types
						+ "]";
			}
			
			
			
			
		}
		
		@JsonInclude(Include.NON_NULL)
		public static class Geometry{
			
			public Geometry(){
				
			}
			
			private Bounds bounds;
			private Location location;
			private String location_type;
			private Viewport viewport;
			

			public Bounds getBounds() {
				return bounds;
			}

			public void setBounds(Bounds bounds) {
				this.bounds = bounds;
			}

			public Location getLocation() {
				return location;
			}

			public void setLocation(Location location) {
				this.location = location;
			}

			public String getLocation_type() {
				return location_type;
			}

			public void setLocation_type(String location_type) {
				this.location_type = location_type;
			}

			public Viewport getViewport() {
				return viewport;
			}

			public void setViewport(Viewport viewport) {
				this.viewport = viewport;
			}

			@Override
			public String toString() {
				return "Geometry [bounds=" + bounds + ", location=" + location + ", location_type=" + location_type
						+ ", viewport=" + viewport + "]";
			}



			@JsonInclude(Include.NON_NULL)
			public static class Bounds{
				
				public Bounds(){
					
				}
				
				private Northeast northeast;
				private Southwest southwest;
				
				
				
				public Northeast getNortheast() {
					return northeast;
				}


				public void setNortheast(Northeast northeast) {
					this.northeast = northeast;
				}


				public Southwest getSouthwest() {
					return southwest;
				}


				public void setSouthwest(Southwest southwest) {
					this.southwest = southwest;
				}


				




				@Override
				public String toString() {
					return "Bounds [northeast=" + northeast + ", southwest=" + southwest + "]";
				}


				@JsonInclude(Include.NON_NULL)
				public static class Northeast{
					public Northeast(){
						
					}
					
					private Float lat;
					private Float lng;
					
					
					
					
					public Float getLat() {
						return lat;
					}




					public void setLat(Float lat) {
						this.lat = lat;
					}




					public Float getLng() {
						return lng;
					}




					public void setLng(Float lng) {
						this.lng = lng;
					}




					@Override
					public String toString() {
						return "Northeast [lat=" + lat + ", lng=" + lng + "]";
					}
					
					
				}
				
				
				@JsonInclude(Include.NON_NULL)
				public static class Southwest{
					
					public Southwest(){
						
					}
					
					private Float lat; 
					private Float lng;
					
					
					public Float getLat() {
						return lat;
					}

					public void setLat(Float lat) {
						this.lat = lat;
					}

					public Float getLng() {
						return lng;
					}

					public void setLng(Float lng) {
						this.lng = lng;
					}



					@Override
					public String toString() {
						return "Southwest [lat=" + lat + ", lng=" + lng + "]";
					}
					
					
					
					
				}
				
			}
			
			
			@JsonInclude(Include.NON_NULL)
			public static class Location{
				
				public Location(){
					
				}
				
				private Float lat;
				private Float lng;
				
				
				
				public Float getLat() {
					return lat;
				}



				public void setLat(Float lat) {
					this.lat = lat;
				}



				public Float getLng() {
					return lng;
				}



				public void setLng(Float lng) {
					this.lng = lng;
				}



				@Override
				public String toString() {
					return "Location [lat=" + lat + ", lng=" + lng + "]";
				}
				
				
				
				
			}
			
			@JsonInclude(Include.NON_NULL)
			public static class Viewport{
				
				public Viewport(){
					
				}
				
				
				private Northeast northeast;
				private Southwest southwest;
				
				
				
				
				
				public Northeast getNortheast() {
					return northeast;
				}


				public void setNortheast(Northeast northeast) {
					this.northeast = northeast;
				}


				public Southwest getSouthwest() {
					return southwest;
				}


				public void setSouthwest(Southwest southwest) {
					this.southwest = southwest;
				}

				
				

				@Override
				public String toString() {
					return "Viewport [northeast=" + northeast + ", southwest=" + southwest + "]";
				}




				@JsonInclude(Include.NON_NULL)
				public static class Northeast{
					
					public Northeast(){
						
					}
					
					private Float lat;
					private Float lng;
					

					public Float getLat() {
						return lat;
					}

					public void setLat(Float lat) {
						this.lat = lat;
					}

					public Float getLng() {
						return lng;
					}

					public void setLng(Float lng) {
						this.lng = lng;
					}

					@Override
					public String toString() {
						return "Northeast [lat=" + lat + ", lng=" + lng + "]";
					}
					
					
					
					
				}
				
				
				@JsonInclude(Include.NON_NULL)
				public static class Southwest{
					
					
					public Southwest(){
						
					}
					
					private Float lat;
					private Float lng;
					
					public Float getLat() {
						return lat;
					}

					public void setLat(Float lat) {
						this.lat = lat;
					}

					public Float getLng() {
						return lng;
					}

					public void setLng(Float lng) {
						this.lng = lng;
					}

					@Override
					public String toString() {
						return "Southwest [lat=" + lat + ", lng=" + lng + "]";
					}
					
					
					
					
				}
				
			}
			
			
		}
		
		
	}
	

}