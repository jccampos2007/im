package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class TypeUse   implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id_type_use;
	private String name_type_use;
	
	public TypeUse(){
		
	}

	public Integer getId_type_use() {
		return id_type_use;
	}

	public void setId_type_use(Integer id_type_use) {
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
		return "TypeUse [id_type_use=" + id_type_use + ", name_type_use=" + name_type_use + "]";
	}	
	
}
