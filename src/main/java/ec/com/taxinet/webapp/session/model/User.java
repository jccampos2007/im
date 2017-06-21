/**
 * 
 */
package ec.com.taxinet.webapp.session.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

import ec.com.taxinet.webapp.form.model.Profile.ResponseDataDriver;
import ec.com.taxinet.webapp.form.model.Profile.ResponseDataRider;
import ec.com.taxinet.webapp.form.model.Profile.ResponseDataStaff;
import ec.com.taxinet.webapp.form.model.StaffLocation;
import ec.com.taxinet.webapp.model.ResponseRequestList;
import ec.com.taxinet.webapp.model.FavoriteDriver;
import ec.com.taxinet.webapp.model.FavoriteSite;
import ec.com.taxinet.webapp.model.RoleAndPermissions;

/**
 * @author Juan Campos
 *
 */
@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class User implements Serializable{

	/**
	 * 
	 */
	
	public User() {
		
	}
	
	private static final long serialVersionUID = 1L;
	private Integer id_user_session;
	private String name_user_session;
	private String id;
	private Integer id_role;
	private String username;
	private String password;
	private List<RoleAndPermissions> role_by_module;
	
	public Integer getId_user_session() {
		return id_user_session;
	}
	public void setId_user_session(Integer id_user_session) {
		this.id_user_session = id_user_session;
	}
	public String getName_user_session() {
		return name_user_session;
	}
	public void setName_user_session(String name_user_session) {
		this.name_user_session = name_user_session;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getId_role() {
		return id_role;
	}
	public void setId_role(Integer id_role) {
		this.id_role = id_role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RoleAndPermissions> getRole_by_module() {
		return role_by_module;
	}
	public void setRole_by_module(List<RoleAndPermissions> role_by_module) {
		this.role_by_module = role_by_module;
	}
	
	@Override
	public String toString() {
		return "User [id_user_session=" + id_user_session + ", name_user_session=" + name_user_session + ", id=" + id
				+ ", id_role=" + id_role + ", username=" + username + ", password=" + password + ", role_by_module="
				+ role_by_module + "]";
	}
}
