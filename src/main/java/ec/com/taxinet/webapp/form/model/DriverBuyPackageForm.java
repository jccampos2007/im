/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class DriverBuyPackageForm {
	
	private int idDriver;
    private int idPackage;
    private int idCreditCard;
    private String securityCode; 
    private double AmountBuy;
    private int idUserSession;
    private String tokenSession;
    
	/**
	 * 
	 */
	public DriverBuyPackageForm() {
		// TODO Auto-generated constructor stub
	}

	public int getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(int idDriver) {
		this.idDriver = idDriver;
	}

	public int getIdPackage() {
		return idPackage;
	}

	public void setIdPackage(int idPackage) {
		this.idPackage = idPackage;
	}

	public int getIdCreditCard() {
		return idCreditCard;
	}

	public void setIdCreditCard(int idCreditCard) {
		this.idCreditCard = idCreditCard;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public double getAmountBuy() {
		return AmountBuy;
	}

	public void setAmountBuy(double amountBuy) {
		AmountBuy = amountBuy;
	}

	public int getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(int idUserSession) {
		this.idUserSession = idUserSession;
	}

	public String getTokenSession() {
		return tokenSession;
	}

	public void setTokenSession(String tokenSession) {
		this.tokenSession = tokenSession;
	}

	@Override
	public String toString() {
		return "DriverBuyPackageForm [idDriver=" + idDriver + ", idPackage=" + idPackage + ", idCreditCard="
				+ idCreditCard + ", securityCode=" + securityCode + ", AmountBuy=" + AmountBuy + ", idUserSession="
				+ idUserSession + ", tokenSession=" + tokenSession + "]";
	}

}
