/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class zoneList implements Serializable {
	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	private Long id_zone;
	private String name_zone;
	
	public zoneList() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_zone() {
		return id_zone;
	}

	public void setId_zone(Long id_zone) {
		this.id_zone = id_zone;
	}

	public String getName_zone() {
		return name_zone;
	}

	public void setName_zone(String name_zone) {
		this.name_zone = name_zone;
	}

	@Override
	public String toString() {
		return "zoneList [id_zone=" + id_zone + ", name_zone=" + name_zone + "]";
	}
	
}
