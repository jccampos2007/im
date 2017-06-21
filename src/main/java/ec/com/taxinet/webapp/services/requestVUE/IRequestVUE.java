package ec.com.taxinet.webapp.services.requestVUE;

import ec.com.taxinet.webapp.dto.requestNoticeMotiveManagementDTO;
import ec.com.taxinet.webapp.dto.requestNoticePendingManagementDTO;
import ec.com.taxinet.webapp.form.model.RequestListForm.mngRequestNoticeMotive;
import ec.com.taxinet.webapp.form.model.RequestListForm.mngRequestNoticePending;

public interface IRequestVUE {

	public requestNoticeMotiveManagementDTO requestNoticeMotiveManagement(mngRequestNoticeMotive mngRequestNoticeMotiveFrom);

	public requestNoticePendingManagementDTO requestNoticePendingManagement(mngRequestNoticePending mngRequestNoticePendingFrom);

}
