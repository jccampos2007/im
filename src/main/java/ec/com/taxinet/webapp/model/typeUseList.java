/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class typeUseList implements Serializable {
	
	/**
	 * 
	 */	
	public typeUseList() {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;	
	private String id_type_use;
	private String name_type_use;
	
	public String getId_type_use() {
		return id_type_use;
	}
	
	public void setId_type_use(String id_type_use) {
		this.id_type_use = id_type_use;
	}
	
	public String getName_type_use() {
		return name_type_use;
	}
	
	public void setName_type_use(String name_type_use) {
		this.name_type_use = name_type_use;
	}

	@Override
	public String toString() {
		return "typeUseList [id_type_use=" + id_type_use + ", name_type_use=" + name_type_use + "]";
	}
	
}
