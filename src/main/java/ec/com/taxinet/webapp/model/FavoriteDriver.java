/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Jccampos
 *
 */
public class FavoriteDriver implements Serializable {

	/**
	 * "idDriver": 0,
       "driverName": "string",
       "driverPhotoUrl": "string",
       "driverScore": 0
	 */
	public FavoriteDriver() {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;
	private Long idDriver;
	private String driverName;
	private String driverPhotoUrl;
	private Double driverScore;
	
	public Long getIdDriver() {
		return idDriver;
	}
	public String getDriverName() {
		return driverName;
	}
	public String getDriverPhotoUrl() {
		return driverPhotoUrl;
	}
	public Double getDriverScore() {
		return driverScore;
	}
	public void setIdDriver(Long idDriver) {
		this.idDriver = idDriver;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setDriverPhotoUrl(String driverPhotoUrl) {
		this.driverPhotoUrl = driverPhotoUrl;
	}
	public void setDriverScore(Double driverScore) {
		this.driverScore = driverScore;
	}
	
	@Override
	public String toString() {
		return "FavoriteDriver [idDriver=" + idDriver + ", driverName=" + driverName + ", driverPhotoUrl="
				+ driverPhotoUrl + ", driverScore=" + driverScore + "]";
	}
	
	
	

}
