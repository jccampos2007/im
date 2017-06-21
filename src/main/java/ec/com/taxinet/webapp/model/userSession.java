/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class userSession implements Serializable{
	
	/*
	 * 
	 */

	public userSession(){
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	private Integer id_user_session;
	private String name_user_session;
	private String id;
	private String username;
	private String name_role;
	
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
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getName_role() {
		return name_role;
	}
	
	public void setName_role(String name_role) {
		this.name_role = name_role;
	}
	
	@Override
	public String toString() {
		return "userSession [id_user_session=" + id_user_session + ", name_user_session=" + name_user_session + ", id="
				+ id + ", username=" + username + ", name_role=" + name_role + "]";
	}

}
