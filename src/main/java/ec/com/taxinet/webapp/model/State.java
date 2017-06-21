package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class State implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long idCountry;
	private String countryName;
	private Integer statusCountry;
	private Long idState;
	private Integer statusState;
	private String stateName;
	
	public State(){
		
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

	public Integer getStatusCountry() {
		return statusCountry;
	}

	public void setStatusCountry(Integer statusCountry) {
		this.statusCountry = statusCountry;
	}

	public Long getIdState() {
		return idState;
	}

	public void setIdState(Long idState) {
		this.idState = idState;
	}

	public Integer getStatusState() {
		return statusState;
	}

	public void setStatusState(Integer statusState) {
		this.statusState = statusState;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [idCountry=" + idCountry + ", countryName=" + countryName + ", statusCountry=" + statusCountry
				+ ", idState=" + idState + ", statusState=" + statusState + ", stateName=" + stateName + "]";
	}
	
	
	

}
