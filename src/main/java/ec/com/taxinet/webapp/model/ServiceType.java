package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class ServiceType implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long idTypeService;
	private Long idCityCatalog;
	private String cityName;
	private Long idStateCatalog;
	private String nameState;
	private Long idCountryCatalog;
	private String name;
	private String description;
	private Integer status;
	private String statusName;
	
	
	
	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public ServiceType(){
		
	}

	public Long getIdTypeService() {
		return idTypeService;
	}

	public void setIdTypeService(Long idTypeService) {
		this.idTypeService = idTypeService;
	}

	public Long getIdCityCatalog() {
		return idCityCatalog;
	}

	public void setIdCityCatalog(Long idCityCatalog) {
		this.idCityCatalog = idCityCatalog;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getIdStateCatalog() {
		return idStateCatalog;
	}

	public void setIdStateCatalog(Long idStateCatalog) {
		this.idStateCatalog = idStateCatalog;
	}

	public String getNameState() {
		return nameState;
	}

	public void setNameState(String nameState) {
		this.nameState = nameState;
	}

	public Long getIdCountryCatalog() {
		return idCountryCatalog;
	}

	public void setIdCountryCatalog(Long idCountryCatalog) {
		this.idCountryCatalog = idCountryCatalog;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ServiceType [idTypeService=" + idTypeService + ", idCityCatalog=" + idCityCatalog + ", cityName="
				+ cityName + ", idStateCatalog=" + idStateCatalog + ", nameState=" + nameState + ", idCountryCatalog="
				+ idCountryCatalog + ", name=" + name + ", description=" + description + ", status=" + status + "]";
	}
	
	
	
	

}
