/**
 * 
 */
package ec.com.taxinet.webapp.model.catalog;

/**
 * @author Juan Campos
 *
 */
public class Model {
	
	private Long idBrand;
	private String brandName;
	private Boolean brandStatus;
	private Long idBrandFather;
	private Long idModel;
	private String brandModel;
	private Boolean modelStatus;
	private Long idModelFather;
	
	/**
	 * 
	 */
	public Model() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Long idBrand) {
		this.idBrand = idBrand;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Boolean getBrandStatus() {
		return brandStatus;
	}

	public void setBrandStatus(Boolean brandStatus) {
		this.brandStatus = brandStatus;
	}

	public Long getIdBrandFather() {
		return idBrandFather;
	}

	public void setIdBrandFather(Long idBrandFather) {
		this.idBrandFather = idBrandFather;
	}

	public Long getIdModel() {
		return idModel;
	}

	public void setIdModel(Long idModel) {
		this.idModel = idModel;
	}

	public String getBrandModel() {
		return brandModel;
	}

	public void setBrandModel(String brandModel) {
		this.brandModel = brandModel;
	}

	public Boolean getModelStatus() {
		return modelStatus;
	}

	public void setModelStatus(Boolean modelStatus) {
		this.modelStatus = modelStatus;
	}

	public Long getIdModelFather() {
		return idModelFather;
	}

	public void setIdModelFather(Long idModelFather) {
		this.idModelFather = idModelFather;
	}

	@Override
	public String toString() {
		return "Model [idBrand=" + idBrand + ", brandName=" + brandName + ", brandStatus=" + brandStatus
				+ ", idBrandFather=" + idBrandFather + ", idModel=" + idModel + ", brandModel=" + brandModel
				+ ", modelStatus=" + modelStatus + ", idModelFather=" + idModelFather + "]";
	}

}
