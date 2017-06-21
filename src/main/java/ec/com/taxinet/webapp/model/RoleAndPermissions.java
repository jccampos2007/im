package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.List;

public class RoleAndPermissions implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id_module;
	private List<Integer> permission;
	
	public Long getId_module() {
		return id_module;
	}
	
	public void setId_module(Long id_module) {
		this.id_module = id_module;
	}
	
	public List<Integer> getPermission() {
		return permission;
	}
	
	public void setPermission(List<Integer> permission) {
		this.permission = permission;
	}
	
	@Override
	public String toString() {
		return "RoleAndPermissions [id_module=" + id_module + ", permission=" + permission + "]";
	}

}
