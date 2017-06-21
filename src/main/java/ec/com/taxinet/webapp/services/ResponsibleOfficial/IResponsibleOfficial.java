package ec.com.taxinet.webapp.services.ResponsibleOfficial;

import ec.com.taxinet.webapp.dto.CiudadanoSucreDTO;

public interface IResponsibleOfficial {
	
	public CiudadanoSucreDTO findCS(String nroSolicitud);

}
