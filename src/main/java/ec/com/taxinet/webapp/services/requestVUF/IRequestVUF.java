package ec.com.taxinet.webapp.services.requestVUF;

import ec.com.taxinet.webapp.dto.ResponseNoticeMotiveListDTO;
import ec.com.taxinet.webapp.dto.ResponseNoticePendingListDTO;
import ec.com.taxinet.webapp.dto.ResponseRequestListDTO;
import ec.com.taxinet.webapp.dto.deleteRequestOwnerDTO;
import ec.com.taxinet.webapp.dto.requestAttachedDTO;
import ec.com.taxinet.webapp.dto.requestManagementDTO;
import ec.com.taxinet.webapp.dto.tracingManagementDTO;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufTracingManagementFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom;
import ec.com.taxinet.webapp.form.model.RequestListForm.VufUpdateRequestFrom.VufAddRequestAttachedFrom;

public interface IRequestVUF {

	public requestManagementDTO updateRequest(VufUpdateRequestFrom requestFrom);

	public requestAttachedDTO addRequestAttached(VufAddRequestAttachedFrom requestFrom);
	
	public tracingManagementDTO tracingManagement(VufTracingManagementFrom tracingManagementFrom);
	
	public ResponseRequestListDTO listRequest(int id_request, String numberRequest, String responsable, int id_responsible_official, String dateRequestFrom, String dateRequestTo, String status_request, int id_type_request, Boolean data_additional);
	
	public ResponseNoticeMotiveListDTO listNoticeMotive(int id_request);
	
	public ResponseNoticePendingListDTO listNoticePending(int id_request);

}
