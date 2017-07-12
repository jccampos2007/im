package ec.com.taxinet.webapp.services.Common;

import ec.com.taxinet.webapp.dto.deleteRequestOwnerDTO;
import ec.com.taxinet.webapp.dto.ordinanceListDTO;
import ec.com.taxinet.webapp.dto.ownerFindDTO;
import ec.com.taxinet.webapp.dto.ownerManagementDTO;
import ec.com.taxinet.webapp.dto.paymentManagementDTO;
import ec.com.taxinet.webapp.dto.printerExcelDTO;
import ec.com.taxinet.webapp.dto.typeUseListDTO;
import ec.com.taxinet.webapp.dto.variableNumeralListDTO;
import ec.com.taxinet.webapp.dto.zoneListDTO;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufAddOwnerFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufAddPaymentFrom;

public interface ICommon {
	
	public typeUseListDTO listTypeUse();

	public ownerManagementDTO addOwner(VufAddOwnerFrom addOwnerFrom);

	public paymentManagementDTO addPayment(VufAddPaymentFrom addPaymentFrom);
	
	public ownerFindDTO findOwner(String ownwrId, Integer idOwner);
	
	public ordinanceListDTO listOrdinance(Integer p_id_ordinance, Integer p_id_zone, Integer p_id_type_request);
	
	public zoneListDTO listZone(Integer id_zone);
	
	public printerExcelDTO printerExcel(Integer id_request, Integer id_type_request);
	
	public deleteRequestOwnerDTO deleteRequestOwner(Integer id_request_owner);
	
	public variableNumeralListDTO listVariableNumeral();

}