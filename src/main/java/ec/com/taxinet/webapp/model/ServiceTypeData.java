package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ServiceTypeData implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private List<TypeService> typeServiceList;
	
	public ServiceTypeData(){
		
	}
	


	public List<TypeService> getTypeServiceList() {
		return typeServiceList;
	}



	public void setTypeServiceList(List<TypeService> typeServiceList) {
		this.typeServiceList = typeServiceList;
	}


	@Override
	public String toString() {
		return "ServiceTypeData [typeServiceList=" + typeServiceList + "]";
	}
	

	@JsonInclude(Include.NON_NULL)
	public static class TypeService{
		
		public TypeService(){
			
		}
		
		private Long idTypeService;
		private String name;
		private String description;
		private Long idCityCatolog;
		private Integer status;
		
		
		
		
		public Long getIdTypeService() {
			return idTypeService;
		}
		public void setIdTypeService(Long idTypeService) {
			this.idTypeService = idTypeService;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getIdCityCatolog() {
			return idCityCatolog;
		}
		public void setIdCityCatolog(Long idCityCatolog) {
			this.idCityCatolog = idCityCatolog;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		
		@Override
		public String toString() {
			return "TypeService [idTypeService=" + idTypeService + ", name=" + name + ", description=" + description
					+ ", idCityCatolog=" + idCityCatolog + ", status=" + status + "]";
		}
		
		
	}
	

}
