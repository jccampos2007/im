package ec.com.taxinet.webapp.form.model;

import java.util.List;

/**
 * @author keyber
 *
 */
public class ServiceTypeForm {
	

	private Integer action;
	private String description; 
	private List<Long> idCityCatolog;
	private Long idTypeService;
	private String name;
	private String sessionToken;
	private Integer status;
	
	public ServiceTypeForm(){
		
	}
	
	
	public Integer getAction() {
		return action;
	}
	public void setAction(Integer action) {
		this.action = action;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Long> getIdCityCatolog() {
		return idCityCatolog;
	}
	public void setIdCityCatolog(List<Long> idCityCatolog) {
		this.idCityCatolog = idCityCatolog;
	}
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
	public String getSessionToken() {
		return sessionToken;
	}
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "ServiceTypeForm [action=" + action + ", description=" + description + ", idCityCatolog=" + idCityCatolog
				+ ", idTypeService=" + idTypeService + ", name=" + name + ", sessionToken=" + sessionToken + ", status="
				+ status + "]";
	}
	
	
	public static class ServiceSend{
		
		public ServiceSend(){
			
		}
		
		private Integer action;
		private String description; 
		private Long idCityCatolog;
		private Long idTypeService;
		private String name;
		private String sessionToken;
		private Integer status;
		private Long idUserSession;
		
		
		
		
		public Long getIdUserSession() {
			return idUserSession;
		}
		public void setIdUserSession(Long idUserSession) {
			this.idUserSession = idUserSession;
		}
		public Integer getAction() {
			return action;
		}
		public void setAction(Integer action) {
			this.action = action;
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
		public String getSessionToken() {
			return sessionToken;
		}
		public void setSessionToken(String sessionToken) {
			this.sessionToken = sessionToken;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		
		
		@Override
		public String toString() {
			return "ServiceSend [action=" + action + ", description=" + description + ", idCityCatolog=" + idCityCatolog
					+ ", idTypeService=" + idTypeService + ", name=" + name + ", sessionToken=" + sessionToken
					+ ", status=" + status + ", idUserSession=" + idUserSession + "]";
		}
		
		
		
		
	}
	
	
	
	
}
