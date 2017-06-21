/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Juan Campos
 *
 */
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Role> rolAndPermissionList;
	
	public Roles(){
		
	}

	public List<Role> getRolAndPermissionList() {
		return rolAndPermissionList;
	}

	public void setRolAndPermissionList(List<Role> rolAndPermissionList) {
		this.rolAndPermissionList = rolAndPermissionList;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Roles [rolAndPermissionList=" + rolAndPermissionList + "]";
	}




	@JsonInclude(Include.NON_NULL)
	public static class Role{
		
		
		public Role(){
			
		}
		
		private Long idRole;
		private String nameRole;
		private Integer status;
		private String descriptionRole;
		

		public Long getIdRole() {
			return idRole;
		}
		public void setIdRole(Long idRole) {
			this.idRole = idRole;
		}
		public String getNameRole() {
			return nameRole;
		}
		public void setNameRole(String nameRole) {
			this.nameRole = nameRole;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getDescriptionRole() {
			return descriptionRole;
		}
		public void setDescriptionRole(String descriptionRole) {
			this.descriptionRole = descriptionRole;
		}
		@Override
		public String toString() {
			return "Role [idRole=" + idRole + ", nameRole=" + nameRole + ", status=" + status + ", descriptionRole="
					+ descriptionRole + "]";
		}




		@JsonInclude(Include.NON_NULL)
		public static class RolePage{
			
			public RolePage(){
				
				
			}
			
			private Long idPage;
			private Boolean canAdd;
			private Boolean canEdit;
			private Boolean canDelete;
			private Boolean canConsult;
			
			
			public Long getIdPage() {
				return idPage;
			}
			
			public void setIdPage(Long idPage) {
				this.idPage = idPage;
			}
			
			public Boolean getCanAdd() {
				return canAdd;
			}
			
			public void setCanAdd(Boolean canAdd) {
				this.canAdd = canAdd;
			}
			
			public Boolean getCanEdit() {
				return canEdit;
			}
			
			public void setCanEdit(Boolean canEdit) {
				this.canEdit = canEdit;
			}
			
			public Boolean getCanDelete() {
				return canDelete;
			}
			
			public void setCanDelete(Boolean canDelete) {
				this.canDelete = canDelete;
			}
			
			public Boolean getCanConsult() {
				return canConsult;
			}
			
			public void setCanConsult(Boolean canConsult) {
				this.canConsult = canConsult;
			}

			@Override
			public String toString() {
				return "RolePage [idPage=" + idPage + ", canAdd=" + canAdd + ", canEdit=" + canEdit + ", canDelete="
						+ canDelete + ", canConsult=" + canConsult + "]";
			}
			
			
			
			
		}
		
		
		
	}
	

}
