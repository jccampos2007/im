package ec.com.taxinet.webapp.model;

import java.io.Serializable;

public class CiudadanoSucre   implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String address;
	private String nroCatastro;
	private String responsable;
	private String responsable_id;
	private String responsable_civ;
	private String indicador_urban;
	private String urbanizacion;
	private String indicador_av;
	private String avenida_calle;
	private String indicador_parcela;
	private String parcela;
	private String edificio;
	private String piso;
	private String apto;
	private String parroquia;
	
	public CiudadanoSucre(){
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNroCatastro() {
		return nroCatastro;
	}

	public void setNroCatastro(String nroCatastro) {
		this.nroCatastro = nroCatastro;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getResponsable_id() {
		return responsable_id;
	}

	public void setResponsable_id(String responsable_id) {
		this.responsable_id = responsable_id;
	}

	public String getResponsable_civ() {
		return responsable_civ;
	}

	public void setResponsable_civ(String responsable_civ) {
		this.responsable_civ = responsable_civ;
	}

	public String getIndicador_urban() {
		return indicador_urban;
	}

	public void setIndicador_urban(String indicador_urban) {
		this.indicador_urban = indicador_urban;
	}

	public String getUrbanizacion() {
		return urbanizacion;
	}

	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}

	public String getIndicador_av() {
		return indicador_av;
	}

	public void setIndicador_av(String indicador_av) {
		this.indicador_av = indicador_av;
	}

	public String getAvenida_calle() {
		return avenida_calle;
	}

	public void setAvenida_calle(String avenida_calle) {
		this.avenida_calle = avenida_calle;
	}

	public String getIndicador_parcela() {
		return indicador_parcela;
	}

	public void setIndicador_parcela(String indicador_parcela) {
		this.indicador_parcela = indicador_parcela;
	}

	public String getParcela() {
		return parcela;
	}

	public void setParcela(String parcela) {
		this.parcela = parcela;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getApto() {
		return apto;
	}

	public void setApto(String apto) {
		this.apto = apto;
	}

	public String getParroquia() {
		return parroquia;
	}

	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}

	@Override
	public String toString() {
		return "CiudadanoSucre [address=" + address + ", nroCatastro=" + nroCatastro + ", responsable=" + responsable
				+ ", responsable_id=" + responsable_id + ", responsable_civ=" + responsable_civ + ", indicador_urban="
				+ indicador_urban + ", urbanizacion=" + urbanizacion + ", indicador_av=" + indicador_av
				+ ", avenida_calle=" + avenida_calle + ", indicador_parcela=" + indicador_parcela + ", parcela="
				+ parcela + ", edificio=" + edificio + ", piso=" + piso + ", apto=" + apto + ", parroquia=" + parroquia
				+ "]";
	}
}
