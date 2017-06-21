/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Juan Campos
 *
 */
public class UserForm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserForm() {
	}
	
	private String username;
	private String password;

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
	
	@Override
	public String toString() {
		return "UserForm [username=" + username + ", password=" + password + "]";
	}
	

	@JsonInclude(Include.NON_NULL)
	public static class RoleByModuleFrom{
		
		public RoleByModuleFrom(){
			
		}
		
		private Integer id_user_session;

		public Integer getId_user_session() {
			return id_user_session;
		}

		public void setId_user_session(Integer id_user_session) {
			this.id_user_session = id_user_session;
		}

		@Override
		public String toString() {
			return "RoleByModuleFrom [id_user_session=" + id_user_session + "]";
		}
		
	}

}
