package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.ResponseRequestList;
import ec.com.taxinet.webapp.model.ResponseRequestList.NoticeMotiveList;
import ec.com.taxinet.webapp.model.ResponseRequestList.NoticePendingList;

public class ResponseNoticePendingListDTO extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private NoticePendingList responseData;
	
	public ResponseNoticePendingListDTO(){
		
	}

	public NoticePendingList getResponseData() {
		return responseData;
	}

	public void setResponseData(NoticePendingList responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "ResponseNoticePendingListDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
}
