package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class Page implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long idPage;
	private String namePage;
	private Integer status;
	
	
	public Long getIdPage() {
		return idPage;
	}
	public void setIdPage(Long idPage) {
		this.idPage = idPage;
	}
	
	public String getNamePage() {
		return namePage;
	}
	public void setNamePage(String namePage) {
		this.namePage = namePage;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Page [idPage=" + idPage + ", namePage=" + namePage + ", status=" + status + "]";
	}
	
	
	

}
