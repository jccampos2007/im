/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class variableNumeralList implements Serializable {
	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	private Long id_variable_numeral;
	private String name_variable_numeral;
	private String description_variable_numeral;
	private String flag_percent;
	
	public variableNumeralList() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_variable_numeral() {
		return id_variable_numeral;
	}

	public void setId_variable_numeral(Long id_variable_numeral) {
		this.id_variable_numeral = id_variable_numeral;
	}

	public String getName_variable_numeral() {
		return name_variable_numeral;
	}

	public void setName_variable_numeral(String name_variable_numeral) {
		this.name_variable_numeral = name_variable_numeral;
	}

	public String getDescription_variable_numeral() {
		return description_variable_numeral;
	}

	public void setDescription_variable_numeral(String description_variable_numeral) {
		this.description_variable_numeral = description_variable_numeral;
	}

	public String getFlag_percent() {
		return flag_percent;
	}

	public void setFlag_percent(String flag_percent) {
		this.flag_percent = flag_percent;
	}

	@Override
	public String toString() {
		return "variableNumeralList [id_variable_numeral=" + id_variable_numeral + ", name_variable_numeral="
				+ name_variable_numeral + ", description_variable_numeral=" + description_variable_numeral
				+ ", flag_percent=" + flag_percent + "]";
	}

}
