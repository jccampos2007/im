package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * 
 * @author keyber
 *
 */
public class SettingSystem  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long idSettingSystem;
	private Integer type;
	private String name;
	private String value;
	private Integer status;
	
	public SettingSystem(){
		
	}

	public Long getIdSettingSystem() {
		return idSettingSystem;
	}

	public void setIdSettingSystem(Long idSettingSystem) {
		this.idSettingSystem = idSettingSystem;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SettingSystem [idSettingSystem=" + idSettingSystem + ", type=" + type + ", name=" + name + ", value="
				+ value + ", status=" + status + "]";
	}
	
	
	
	
	

}
