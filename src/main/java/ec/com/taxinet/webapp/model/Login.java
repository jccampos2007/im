/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Juan Campos
 *
 */
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id_user_session;
	private String name_user_session;
	private String id;
	private Integer id_role;

	/**
	 * 
	 */
	public Login() {
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "Login [id_user_session=" + id_user_session + ", name_user_session=" + name_user_session + ", id=" + id
				+ ", id_role=" + id_role + "]";
	}
}
