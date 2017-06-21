package ec.com.taxinet.webapp.form.model;

public class TaxiOwnerForm {
	
	private int idTaxi;
    private String vehiclePlate;
    private boolean driverOwner;
    private String ownerfirstName;
    private String ownerMiddleName;
    private String ownerFathersLastName;
    private String ownerMotherLastName;
    private String ownerAddressLine1;
    private String ownerAddressLine2;
    private int idTaxiCorp;
    private int idCityCatalog;
    private int idModelCatalog; 
    private int idColorCatalog;
    private int year;
    private int idTypeCarCatalog;
    private int idTaxiService;   
    private int action;
    private int idUserSession;
    private String sessionToken;

	public TaxiOwnerForm() {
		// TODO Auto-generated constructor stub
	}

	public int getIdTaxi() {
		return idTaxi;
	}

	public void setIdTaxi(int idTaxi) {
		this.idTaxi = idTaxi;
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public boolean isDriverOwner() {
		return driverOwner;
	}

	public void setDriverOwner(boolean driverOwner) {
		this.driverOwner = driverOwner;
	}

	public String getOwnerfirstName() {
		return ownerfirstName;
	}

	public void setOwnerfirstName(String ownerfirstName) {
		this.ownerfirstName = ownerfirstName;
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

	public String getOwnerAddressLine1() {
		return ownerAddressLine1;
	}

	public void setOwnerAddressLine1(String ownerAddressLine1) {
		this.ownerAddressLine1 = ownerAddressLine1;
	}

	public String getOwnerAddressLine2() {
		return ownerAddressLine2;
	}

	public void setOwnerAddressLine2(String ownerAddressLine2) {
		this.ownerAddressLine2 = ownerAddressLine2;
	}

	public int getIdTaxiCorp() {
		return idTaxiCorp;
	}

	public void setIdTaxiCorp(int idTaxiCorp) {
		this.idTaxiCorp = idTaxiCorp;
	}

	public int getIdCityCatalog() {
		return idCityCatalog;
	}

	public void setIdCityCatalog(int idCityCatalog) {
		this.idCityCatalog = idCityCatalog;
	}

	public int getIdModelCatalog() {
		return idModelCatalog;
	}

	public void setIdModelCatalog(int idModelCatalog) {
		this.idModelCatalog = idModelCatalog;
	}

	public int getIdColorCatalog() {
		return idColorCatalog;
	}

	public void setIdColorCatalog(int idColorCatalog) {
		this.idColorCatalog = idColorCatalog;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getIdTypeCarCatalog() {
		return idTypeCarCatalog;
	}

	public void setIdTypeCarCatalog(int idTypeCarCatalog) {
		this.idTypeCarCatalog = idTypeCarCatalog;
	}

	public int getIdTaxiService() {
		return idTaxiService;
	}

	public void setIdTaxiService(int idTaxiService) {
		this.idTaxiService = idTaxiService;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public int getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(int idUserSession) {
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
		return "TaxiOwnerForm [idTaxi=" + idTaxi + ", vehiclePlate=" + vehiclePlate + ", driverOwner=" + driverOwner
				+ ", ownerfirstName=" + ownerfirstName + ", ownerMiddleName=" + ownerMiddleName
				+ ", ownerFathersLastName=" + ownerFathersLastName + ", ownerMotherLastName=" + ownerMotherLastName
				+ ", ownerAddressLine1=" + ownerAddressLine1 + ", ownerAddressLine2=" + ownerAddressLine2
				+ ", idTaxiCorp=" + idTaxiCorp + ", idCityCatalog=" + idCityCatalog + ", idModelCatalog="
				+ idModelCatalog + ", idColorCatalog=" + idColorCatalog + ", year=" + year + ", idTypeCarCatalog="
				+ idTypeCarCatalog + ", idTaxiService=" + idTaxiService + ", action=" + action + ", idUserSession="
				+ idUserSession + ", sessionToken=" + sessionToken + "]";
	}

}
