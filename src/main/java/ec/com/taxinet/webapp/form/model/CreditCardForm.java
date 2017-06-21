/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Jccampos
 */
public class CreditCardForm {

	private Long idCreditCard;
	private String expirationMonth;
	private String expirationYear;
	private String expirationDate;
	private String name;
	private String number;
	private String code;
	private Integer type;
	private String action;

	public CreditCardForm() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCreditCard() {
		return idCreditCard;
	}

	public void setIdCreditCard(Long idCreditCard) {
		this.idCreditCard = idCreditCard;
	}

	public String getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public String getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "CreditCardForm [idCreditCard=" + idCreditCard + ", expirationMonth=" + expirationMonth
				+ ", expirationYear=" + expirationYear + ", expirationDate=" + expirationDate + ", name=" + name
				+ ", number=" + number + ", code=" + code + ", type=" + type + ", action=" + action + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
