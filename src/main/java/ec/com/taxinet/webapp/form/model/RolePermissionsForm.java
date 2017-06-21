package ec.com.taxinet.webapp.form.model;

import java.util.List;

public class RolePermissionsForm {
	
	private Long idRole;
	private String name;
	private String description;
	private Boolean statusRole;
	private List<PagesList> pages;
	
	public RolePermissionsForm(){
		
	}
	
	public Long getIdRole() {
		return idRole;
	}	
	
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
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
	
	public List<PagesList> getPages() {
		return pages;
	}
	public Boolean getStatusRole() {
		return statusRole;
	}

	public void setStatusRole(Boolean statusRole) {
		this.statusRole = statusRole;
	}

	public void setPages(List<PagesList> pages) {
		this.pages = pages;
	}
	
	
	@Override
	public String toString() {
		return "RolePermissionsForm [idRole=" + idRole + ", name=" + name + ", description=" + description
				+ ", statusRole=" + statusRole + ", pages=" + pages + "]";
	}

	
	
	
	public static class PagesList{
		
		public PagesList(){
			
		}
		
		private Long idPage;
		private Long idRole;
		private Integer isAdd;
		private Integer isDelete;
		private Integer isConsult;
		private Integer isEdit;
		
		
		public Long getIdPage() {
			return idPage;
		}
		public void setIdPage(Long idPage) {
			this.idPage = idPage;
		}
		public Long getIdRole() {
			return idRole;
		}
		public void setIdRole(Long idRole) {
			this.idRole = idRole;
		}
		
		
		public Integer getIsAdd() {
			return isAdd;
		}
		public void setIsAdd(Integer isAdd) {
			this.isAdd = isAdd;
		}
		public Integer getIsDelete() {
			return isDelete;
		}
		public void setIsDelete(Integer isDelete) {
			this.isDelete = isDelete;
		}
		public Integer getIsConsult() {
			return isConsult;
		}
		public void setIsConsult(Integer isConsult) {
			this.isConsult = isConsult;
		}
		public Integer getIsEdit() {
			return isEdit;
		}
		public void setIsEdit(Integer isEdit) {
			this.isEdit = isEdit;
		}
		
		
		@Override
		public String toString() {
			return "Pages [idPage=" + idPage + ", idRole=" + idRole + ", isAdd=" + isAdd + ", isDelete=" + isDelete
					+ ", isConsult=" + isConsult + ", isEdit=" + isEdit + "]";
		}
		
		
	}
	
	
	public static class RoleForm{
		
		public RoleForm(){
			
		}
			
		private String description;
		private Long idUserSession;
		private String name;
		private String tokenSession;
		
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getIdUserSession() {
			return idUserSession;
		}
		public void setIdUserSession(Long idUserSession) {
			this.idUserSession = idUserSession;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTokenSession() {
			return tokenSession;
		}
		public void setTokenSession(String tokenSession) {
			this.tokenSession = tokenSession;
		}
		
		
		@Override
		public String toString() {
			return "RoleForm [description=" + description + ", idUserSession=" + idUserSession + ", name=" + name
					+ ", tokenSession=" + tokenSession + "]";
		}		
	}
	
	public static class RoleUpdt{
		public RoleUpdt(){
			
		}
		
		private String description;
		private Long idRol;
		private Long idUserSession;
		private String name;
		private Boolean statusRole;
		private String tokenSession;
		
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getIdRol() {
			return idRol;
		}
		public void setIdRol(Long idRol) {
			this.idRol = idRol;
		}
		public Long getIdUserSession() {
			return idUserSession;
		}
		public void setIdUserSession(Long idUserSession) {
			this.idUserSession = idUserSession;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getStatusRole() {
			return statusRole;
		}
		public void setStatusRole(Boolean statusRole) {
			this.statusRole = statusRole;
		}
		public String getTokenSession() {
			return tokenSession;
		}
		public void setTokenSession(String tokenSession) {
			this.tokenSession = tokenSession;
		}
		
		
		@Override
		public String toString() {
			return "RoleUpdt [description=" + description + ", idRol=" + idRol + ", idUserSession=" + idUserSession
					+ ", name=" + name + ", statusRole=" + statusRole + ", tokenSession=" + tokenSession + "]";
		}
		
	}
	
	
	
	public static class PageForm{
		
		public PageForm(){
			
		}
		
		private List<Long> idPage;
		private Long idRole;
		private Long idUserSession;
		private List<Integer> isAdd;
		private List<Integer> isConsult;
		private List<Integer> isDelete;
		private List<Integer> isEdit;
		private String sessionToken;
		private Boolean status;
		
		
		public List<Long> getIdPage() {
			return idPage;
		}
		public void setIdPage(List<Long> idPage) {
			this.idPage = idPage;
		}
		public Long getIdRole() {
			return idRole;
		}
		public void setIdRole(Long idRole) {
			this.idRole = idRole;
		}
		public Long getIdUserSession() {
			return idUserSession;
		}
		public void setIdUserSession(Long idUserSession) {
			this.idUserSession = idUserSession;
		}
		public List<Integer> getIsAdd() {
			return isAdd;
		}
		public void setIsAdd(List<Integer> isAdd) {
			this.isAdd = isAdd;
		}
		public List<Integer> getIsConsult() {
			return isConsult;
		}
		public void setIsConsult(List<Integer> isConsult) {
			this.isConsult = isConsult;
		}
		public List<Integer> getIsDelete() {
			return isDelete;
		}
		public void setIsDelete(List<Integer> isDelete) {
			this.isDelete = isDelete;
		}
		public List<Integer> getIsEdit() {
			return isEdit;
		}
		public void setIsEdit(List<Integer> isEdit) {
			this.isEdit = isEdit;
		}
		public String getSessionToken() {
			return sessionToken;
		}
		public void setSessionToken(String sessionToken) {
			this.sessionToken = sessionToken;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
		
		
		@Override
		public String toString() {
			return "PageForm [idPage=" + idPage + ", idRole=" + idRole + ", idUserSession=" + idUserSession + ", isAdd="
					+ isAdd + ", isConsult=" + isConsult + ", isDelete=" + isDelete + ", isEdit=" + isEdit
					+ ", sessionToken=" + sessionToken + ", status=" + status + "]";
		}
		
		
		
		
	}
	
}
