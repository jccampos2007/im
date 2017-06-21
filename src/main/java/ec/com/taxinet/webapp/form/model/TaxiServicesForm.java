package ec.com.taxinet.webapp.form.model;

public class TaxiServicesForm {
	
	private Long idCountry;
	private Long idState;
	private Long idCity;
	private Long idTypeService;
	private Long idUserSession;
	private String sessionToken;
	
	public TaxiServicesForm() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	public Long getIdState() {
		return idState;
	}

	public void setIdState(Long idState) {
		this.idState = idState;
	}

	public Long getIdCity() {
		return idCity;
	}

	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}

	public Long getIdTypeService() {
		return idTypeService;
	}

	public void setIdTypeService(Long idTypeService) {
		this.idTypeService = idTypeService;
	}

	public Long getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(Long idUserSession) {
		this.idUserSession = idUserSession;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	@Override
	public String toString() {
		return "TaxiServicesForm [idCountry=" + idCountry + ", idState=" + idState + ", idCity=" + idCity
				+ ", idTypeService=" + idTypeService + ", idUserSession=" + idUserSession + ", sessionToken="
				+ sessionToken + "]";
	}

}
