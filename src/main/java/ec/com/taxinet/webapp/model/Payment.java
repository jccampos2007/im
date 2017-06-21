package ec.com.taxinet.webapp.model;

import java.util.Date;

/**
 *
 * @author dukai
 */
public class Payment {
    private int id;
    private String reference_code;
    private double  amount;
    private String date;
    private String format_date;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReference_code() {
		return reference_code;
	}
	public void setReference_code(String reference_code) {
		this.reference_code = reference_code;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFormat_date() {
		return format_date;
	}
	public void setFormat_date(String format_date) {
		this.format_date = format_date;
	}
	
	@Override
	public String toString() {
		return "Payment [id=" + id + ", reference_code=" + reference_code + ", amount=" + amount + ", date=" + date
				+ ", format_date=" + format_date + "]";
	}
	
}
