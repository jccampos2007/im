package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class CompanyAccount implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String c_name;
    private String c_localIdNumber;
    private String c_legalRepresentative;
    private String c_phone;
    private String c_email;
    private String c_addressLine1;
    private String c_addressLine2;
    private Float c_fee;
    private String c_cutDay;
    private int c_idCountry;
    private String c_CountryName;
    private int c_status;
    private String ca_CutYear;
    private String ca_CutMonth;
    private String ca_CutDay;
    private String ca_StartDate;
    private String ca_EndDate;
    private int ca_Count_Rider;
    private int ca_Count_Immediate;
    private int ca_Count_ServiceRecord;
    private int ca_Count_Scheduled;
    private int ca_Count_Multiservice;
    private int ca_Count_Self;
    private Float ca_Sum_totalAmmount;
    private Float ca_Avg_totalAmmount;
    private Float ca_Sum_CompanyFee;
    private String ca_createdDate;
    
    public CompanyAccount(){
    	
    }

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_localIdNumber() {
		return c_localIdNumber;
	}

	public void setC_localIdNumber(String c_localIdNumber) {
		this.c_localIdNumber = c_localIdNumber;
	}

	public String getC_legalRepresentative() {
		return c_legalRepresentative;
	}

	public void setC_legalRepresentative(String c_legalRepresentative) {
		this.c_legalRepresentative = c_legalRepresentative;
	}

	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}

	public String getC_addressLine1() {
		return c_addressLine1;
	}

	public void setC_addressLine1(String c_addressLine1) {
		this.c_addressLine1 = c_addressLine1;
	}

	public String getC_addressLine2() {
		return c_addressLine2;
	}

	public void setC_addressLine2(String c_addressLine2) {
		this.c_addressLine2 = c_addressLine2;
	}

	public Float getC_fee() {
		return c_fee;
	}

	public void setC_fee(Float c_fee) {
		this.c_fee = c_fee;
	}

	public String getC_cutDay() {
		return c_cutDay;
	}

	public void setC_cutDay(String c_cutDay) {
		this.c_cutDay = c_cutDay;
	}

	public int getC_idCountry() {
		return c_idCountry;
	}

	public void setC_idCountry(int c_idCountry) {
		this.c_idCountry = c_idCountry;
	}

	public String getC_CountryName() {
		return c_CountryName;
	}

	public void setC_CountryName(String c_CountryName) {
		this.c_CountryName = c_CountryName;
	}

	public int getC_status() {
		return c_status;
	}

	public void setC_status(int c_status) {
		this.c_status = c_status;
	}

	public String getCa_CutYear() {
		return ca_CutYear;
	}

	public void setCa_CutYear(String ca_CutYear) {
		this.ca_CutYear = ca_CutYear;
	}

	public String getCa_CutMonth() {
		return ca_CutMonth;
	}

	public void setCa_CutMonth(String ca_CutMonth) {
		this.ca_CutMonth = ca_CutMonth;
	}

	public String getCa_CutDay() {
		return ca_CutDay;
	}

	public void setCa_CutDay(String ca_CutDay) {
		this.ca_CutDay = ca_CutDay;
	}

	public String getCa_StartDate() {
		return ca_StartDate;
	}

	public void setCa_StartDate(String ca_StartDate) {
		this.ca_StartDate = ca_StartDate;
	}

	public String getCa_EndDate() {
		return ca_EndDate;
	}

	public void setCa_EndDate(String ca_EndDate) {
		this.ca_EndDate = ca_EndDate;
	}

	public int getCa_Count_Rider() {
		return ca_Count_Rider;
	}

	public void setCa_Count_Rider(int ca_Count_Rider) {
		this.ca_Count_Rider = ca_Count_Rider;
	}

	public int getCa_Count_Immediate() {
		return ca_Count_Immediate;
	}

	public void setCa_Count_Immediate(int ca_Count_Immediate) {
		this.ca_Count_Immediate = ca_Count_Immediate;
	}

	public int getCa_Count_ServiceRecord() {
		return ca_Count_ServiceRecord;
	}

	public void setCa_Count_ServiceRecord(int ca_Count_ServiceRecord) {
		this.ca_Count_ServiceRecord = ca_Count_ServiceRecord;
	}

	public int getCa_Count_Scheduled() {
		return ca_Count_Scheduled;
	}

	public void setCa_Count_Scheduled(int ca_Count_Scheduled) {
		this.ca_Count_Scheduled = ca_Count_Scheduled;
	}

	public int getCa_Count_Multiservice() {
		return ca_Count_Multiservice;
	}

	public void setCa_Count_Multiservice(int ca_Count_Multiservice) {
		this.ca_Count_Multiservice = ca_Count_Multiservice;
	}

	public int getCa_Count_Self() {
		return ca_Count_Self;
	}

	public void setCa_Count_Self(int ca_Count_Self) {
		this.ca_Count_Self = ca_Count_Self;
	}

	public Float getCa_Sum_totalAmmount() {
		return ca_Sum_totalAmmount;
	}

	public void setCa_Sum_totalAmmount(Float ca_Sum_totalAmmount) {
		this.ca_Sum_totalAmmount = ca_Sum_totalAmmount;
	}

	public Float getCa_Avg_totalAmmount() {
		return ca_Avg_totalAmmount;
	}

	public void setCa_Avg_totalAmmount(Float ca_Avg_totalAmmount) {
		this.ca_Avg_totalAmmount = ca_Avg_totalAmmount;
	}

	public Float getCa_Sum_CompanyFee() {
		return ca_Sum_CompanyFee;
	}

	public void setCa_Sum_CompanyFee(Float ca_Sum_CompanyFee) {
		this.ca_Sum_CompanyFee = ca_Sum_CompanyFee;
	}

	public String getCa_createdDate() {
		return ca_createdDate;
	}

	public void setCa_createdDate(String ca_createdDate) {
		this.ca_createdDate = ca_createdDate;
	}

	@Override
	public String toString() {
		return "CompanyAccount [c_name=" + c_name + ", c_localIdNumber=" + c_localIdNumber + ", c_legalRepresentative="
				+ c_legalRepresentative + ", c_phone=" + c_phone + ", c_email=" + c_email + ", c_addressLine1="
				+ c_addressLine1 + ", c_addressLine2=" + c_addressLine2 + ", c_fee=" + c_fee + ", c_cutDay=" + c_cutDay
				+ ", c_idCountry=" + c_idCountry + ", c_CountryName=" + c_CountryName + ", c_status=" + c_status
				+ ", ca_CutYear=" + ca_CutYear + ", ca_CutMonth=" + ca_CutMonth + ", ca_CutDay=" + ca_CutDay
				+ ", ca_StartDate=" + ca_StartDate + ", ca_EndDate=" + ca_EndDate + ", ca_Count_Rider=" + ca_Count_Rider
				+ ", ca_Count_Immediate=" + ca_Count_Immediate + ", ca_Count_ServiceRecord=" + ca_Count_ServiceRecord
				+ ", ca_Count_Scheduled=" + ca_Count_Scheduled + ", ca_Count_Multiservice=" + ca_Count_Multiservice
				+ ", ca_Count_Self=" + ca_Count_Self + ", ca_Sum_totalAmmount=" + ca_Sum_totalAmmount
				+ ", ca_Avg_totalAmmount=" + ca_Avg_totalAmmount + ", ca_Sum_CompanyFee=" + ca_Sum_CompanyFee
				+ ", ca_createdDate=" + ca_createdDate + "]";
	}
    
    

}
