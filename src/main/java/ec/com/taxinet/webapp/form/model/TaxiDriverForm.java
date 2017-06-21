/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class TaxiDriverForm {
	
	private Long idDriver;
	private Long idTaxi;
	private Long idUserSession;
	private String sessionToken;
	private Boolean statusDriverTaxi;
	private String vehiclePlate;
	private Long idTaxiCorp;
	private Long idBrand;
	private Long idModel;
	private Long idColor;
	private Integer year;
	private Long idCarType;
	private Long idTaxiService;
	private String ownerFirstName;
	private String ownerMiddleName;
	private String ownerFathersLastName;
	private String ownerMotherLastName;
	private String ownerDirectionLine1;
	private String ownerDirectionLine2;	
	private Long driverOwner;
	
	/**
	 * 
	 */
	public TaxiDriverForm() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(Long idDriver) {
		this.idDriver = idDriver;
	}

	public Long getIdTaxi() {
		return idTaxi;
	}

	public void setIdTaxi(Long idTaxi) {
		this.idTaxi = idTaxi;
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

	public Boolean getStatusDriverTaxi() {
		return statusDriverTaxi;
	}

	public void setStatusDriverTaxi(Boolean statusDriverTaxi) {
		this.statusDriverTaxi = statusDriverTaxi;
	}

	@Override
	public String toString() {
		return "TaxiDriverForm [idDriver=" + idDriver + ", idTaxi=" + idTaxi + ", idUserSession=" + idUserSession
				+ ", sessionToken=" + sessionToken + ", statusDriverTaxi=" + statusDriverTaxi + ", vehiclePlate="
				+ vehiclePlate + ", idTaxiCorp=" + idTaxiCorp + ", idBrand=" + idBrand + ", idModel=" + idModel
				+ ", idColor=" + idColor + ", year=" + year + ", idCarType=" + idCarType + ", idTaxiService="
				+ idTaxiService + ", ownerFirstName=" + ownerFirstName + ", ownerMiddleName=" + ownerMiddleName
				+ ", ownerFathersLastName=" + ownerFathersLastName + ", ownerMotherLastName=" + ownerMotherLastName
				+ ", ownerDirectionLine1=" + ownerDirectionLine1 + ", ownerDirectionLine2=" + ownerDirectionLine2
				+ ", driverOwner=" + driverOwner + "]";
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public Long getIdTaxiCorp() {
		return idTaxiCorp;
	}

	public void setIdTaxiCorp(Long idTaxiCorp) {
		this.idTaxiCorp = idTaxiCorp;
	}

	public Long getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Long idBrand) {
		this.idBrand = idBrand;
	}

	public Long getIdModel() {
		return idModel;
	}

	public void setIdModel(Long idModel) {
		this.idModel = idModel;
	}

	public Long getIdColor() {
		return idColor;
	}

	public void setIdColor(Long idColor) {
		this.idColor = idColor;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Long getIdCarType() {
		return idCarType;
	}

	public void setIdCarType(Long idCarType) {
		this.idCarType = idCarType;
	}

	public Long getIdTaxiService() {
		return idTaxiService;
	}

	public void setIdTaxiService(Long idTaxiService) {
		this.idTaxiService = idTaxiService;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerMiddleName() {
		return ownerMiddleName;
	}

	public void setOwnerMiddleName(String ownerMiddleName) {
		this.ownerMiddleName = ownerMiddleName;
	}

	public String getOwnerFathersLastName() {
		return ownerFathersLastName;
	}

	public void setOwnerFathersLastName(String ownerFathersLastName) {
		this.ownerFathersLastName = ownerFathersLastName;
	}

	public String getOwnerMotherLastName() {
		return ownerMotherLastName;
	}

	public void setOwnerMotherLastName(String ownerMotherLastName) {
		this.ownerMotherLastName = ownerMotherLastName;
	}

	public String getOwnerDirectionLine1() {
		return ownerDirectionLine1;
	}

	public void setOwnerDirectionLine1(String ownerDirectionLine1) {
		this.ownerDirectionLine1 = ownerDirectionLine1;
	}

	public String getOwnerDirectionLine2() {
		return ownerDirectionLine2;
	}

	public void setOwnerDirectionLine2(String ownerDirectionLine2) {
		this.ownerDirectionLine2 = ownerDirectionLine2;
	}

	public Long getDriverOwner() {
		return driverOwner;
	}

	public void setDriverOwner(Long driverOwner) {
		this.driverOwner = driverOwner;
	}

}
