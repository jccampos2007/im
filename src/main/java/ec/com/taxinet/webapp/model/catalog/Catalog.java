/**
 * 
 */
package ec.com.taxinet.webapp.model.catalog;

import java.io.Serializable;


/**
 * @author Juan Campos
 *
 */

public class Catalog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Long idCatalogFather;
	private Boolean status;

	/**
	 * 
	 */
	public Catalog() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdCatalogFather() {
		return idCatalogFather;
	}

	public void setIdCatalogFather(Long idCatalogFather) {
		this.idCatalogFather = idCatalogFather;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", idCatalogFather=" + idCatalogFather + ", status=" + status
				+ "]";
	}

}
