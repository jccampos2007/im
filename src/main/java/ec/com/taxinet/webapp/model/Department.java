package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Boolean status;
	private Long idCatalogFather;

	public Department() {
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getIdCatalogFather() {
		return idCatalogFather;
	}

	public void setIdCatalogFather(Long idCatalogFather) {
		this.idCatalogFather = idCatalogFather;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", status=" + status + ", idCatalogFather=" + idCatalogFather
				+ "]";
	}

}
