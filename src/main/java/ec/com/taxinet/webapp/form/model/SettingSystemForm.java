package ec.com.taxinet.webapp.form.model;

import java.util.List;

/**
 * 
 * @author keyber
 *
 */
public class SettingSystemForm {
	
	private List<SettingForm> settingList;
	
	
	
	public SettingSystemForm(){
		
	}
	
	
	
public List<SettingForm> getSettingList() {
		return settingList;
	}



	public void setSettingList(List<SettingForm> settingList) {
		this.settingList = settingList;
	}
	
	



@Override
	public String toString() {
		return "SettingSystemForm [settingList=" + settingList + "]";
	}





public static class SettingForm{
		
		public SettingForm(){
			
		}
		
		private Long idSettingSystem;
		private String name;
		private Integer status;
		private Integer type;
		private String value;
		
		
		public Long getIdSettingSystem() {
			return idSettingSystem;
		}
		public void setIdSettingSystem(Long idSettingSystem) {
			this.idSettingSystem = idSettingSystem;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Integer getType() {
			return type;
		}
		public void setType(Integer type) {
			this.type = type;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
		
		@Override
		public String toString() {
			return "SettingForm [idSettingSystem=" + idSettingSystem + ", name=" + name + ", status=" + status
					+ ", type=" + type + ", value=" + value + "]";
		}
		
		
		
		
		
}
			

	
	
}
