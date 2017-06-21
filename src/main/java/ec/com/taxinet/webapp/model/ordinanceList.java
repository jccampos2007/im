/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class ordinanceList implements Serializable {
	
	/**
	 * "id_ordinance": 1,
      "name_ordinance": "Vivienda Unifamiliar aislada (2.000,00 m2)",
      "url_file": "VUF/R1/",
      "name_file": "Formato CP-VUF R1.xlsx",
      "name_file2": "PARTE II DEL FORMATO CPVUF R1.doc",
      "id_type_request": 1,
      "id_zone": 1
	 */	
	public ordinanceList() {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;	
	private String id_ordinance;
	private String name_ordinance;
	private String url_file;
	private String name_file;
	private String name_file2;
	private Integer id_type_request;
	private Integer id_zone;
	
	public String getId_ordinance() {
		return id_ordinance;
	}
	
	public void setId_ordinance(String id_ordinance) {
		this.id_ordinance = id_ordinance;
	}
	
	public String getName_ordinance() {
		return name_ordinance;
	}
	
	public void setName_ordinance(String name_ordinance) {
		this.name_ordinance = name_ordinance;
	}
	
	public String getUrl_file() {
		return url_file;
	}
	
	public void setUrl_file(String url_file) {
		this.url_file = url_file;
	}
	
	public String getName_file() {
		return name_file;
	}
	
	public void setName_file(String name_file) {
		this.name_file = name_file;
	}
	
	public String getName_file2() {
		return name_file2;
	}
	
	public void setName_file2(String name_file2) {
		this.name_file2 = name_file2;
	}
	
	public Integer getId_type_request() {
		return id_type_request;
	}
	
	public void setId_type_request(Integer id_type_request) {
		this.id_type_request = id_type_request;
	}
	
	public Integer getId_zone() {
		return id_zone;
	}
	
	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
	}
	
	@Override
	public String toString() {
		return "ordinanceList [id_ordinance=" + id_ordinance + ", name_ordinance=" + name_ordinance + ", url_file="
				+ url_file + ", name_file=" + name_file + ", name_file2=" + name_file2 + ", id_type_request="
				+ id_type_request + ", id_zone=" + id_zone + "]";
	}
	
}
