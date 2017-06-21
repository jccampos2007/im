/**
 * 
 */
package ec.com.taxinet.webapp.model;

/**
 * @author Juan Campos
 *
 */
public class TaxiService {
	
	private int idTypeService;  
    private int idCityCatalog;
    private String cityName;
    private int idStateCatalog;
    private String nameState;
    private int idCountryCatalog;       
    private String name;
    private String description;                
    private int status;

	/**
	 * 
	 */
	public TaxiService() {
		// TODO Auto-generated constructor stub
	}

	public int getIdTypeService() {
		return idTypeService;
	}

	public void setIdTypeService(int idTypeService) {
		this.idTypeService = idTypeService;
	}

	public int getIdCityCatalog() {
		return idCityCatalog;
	}

	public void setIdCityCatalog(int idCityCatalog) {
		this.idCityCatalog = idCityCatalog;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getIdStateCatalog() {
		return idStateCatalog;
	}

	public void setIdStateCatalog(int idStateCatalog) {
		this.idStateCatalog = idStateCatalog;
	}

	public String getNameState() {
		return nameState;
	}

	public void setNameState(String nameState) {
		this.nameState = nameState;
	}

	public int getIdCountryCatalog() {
		return idCountryCatalog;
	}

	public void setIdCountryCatalog(int idCountryCatalog) {
		this.idCountryCatalog = idCountryCatalog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TaxiService [idTypeService=" + idTypeService + ", idCityCatalog=" + idCityCatalog + ", cityName="
				+ cityName + ", idStateCatalog=" + idStateCatalog + ", nameState=" + nameState + ", idCountryCatalog="
				+ idCountryCatalog + ", name=" + name + ", description=" + description + ", status=" + status + "]";
	}

}
