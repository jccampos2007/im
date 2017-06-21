/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class ownerFind implements Serializable {

	/**
	 * "id_owner": 1,
      "name_owner": "JUAN CARLOS",
      "email_owner": "JUANC@GMAIL.COM",
      "owner_id": "13564508",
      "nationality_owner": "V",
      "phone_owner": "02127899081",
      "mobile_owner": "O4164223567"
	 */
	private static final long serialVersionUID = 1L;
	private Long id_owner;
	private String name_owner;
	private String email_owner;
	private String owner_id;
	private String nationality_owner;
	private String phone_owner;
	private String mobile_owner;
	
	/**
	 * 
	 */
	public ownerFind() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_owner() {
		return id_owner;
	}

	public void setId_owner(Long id_owner) {
		this.id_owner = id_owner;
	}

	public String getName_owner() {
		return name_owner;
	}

	public void setName_owner(String name_owner) {
		this.name_owner = name_owner;
	}

	public String getEmail_owner() {
		return email_owner;
	}

	public void setEmail_owner(String email_owner) {
		this.email_owner = email_owner;
	}

	public String getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}

	public String getNationality_owner() {
		return nationality_owner;
	}

	public void setNationality_owner(String nationality_owner) {
		this.nationality_owner = nationality_owner;
	}

	public String getPhone_owner() {
		return phone_owner;
	}

	public void setPhone_owner(String phone_owner) {
		this.phone_owner = phone_owner;
	}

	public String getMobile_owner() {
		return mobile_owner;
	}

	public void setMobile_owner(String mobile_owner) {
		this.mobile_owner = mobile_owner;
	}

	@Override
	public String toString() {
		return "ownerFind [id_owner=" + id_owner + ", name_owner=" + name_owner + ", email_owner=" + email_owner
				+ ", owner_id=" + owner_id + ", nationality_owner=" + nationality_owner + ", phone_owner=" + phone_owner
				+ ", mobile_owner=" + mobile_owner + "]";
	}
	
	

}
