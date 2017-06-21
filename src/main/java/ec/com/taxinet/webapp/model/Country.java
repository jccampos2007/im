/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class Country implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idCountry;
	private String countryName;
	private Integer status;
	
	/**
	 * 
	 */
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Country [idCountry=" + idCountry + ", countryName=" + countryName + ", status=" + status + "]";
	}
	
}
