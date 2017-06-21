/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class Catalog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idCatalog;
	private String value;
	private Long idCatalogFather;
	
	/**
	 * 
	 */
	public Catalog() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCatalog() {
		return idCatalog;
	}

	public void setIdCatalog(Long idCatalog) {
		this.idCatalog = idCatalog;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getIdCatalogFather() {
		return idCatalogFather;
	}

	public void setIdCatalogFather(Long idCatalogFather) {
		this.idCatalogFather = idCatalogFather;
	}

	@Override
	public String toString() {
		return "Catalog [idCatalog=" + idCatalog + ", value=" + value + ", idCatalogFather=" + idCatalogFather + "]";
	}

}
