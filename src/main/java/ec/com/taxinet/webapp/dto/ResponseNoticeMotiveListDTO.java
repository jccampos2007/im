package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.ResponseRequestList;
import ec.com.taxinet.webapp.model.ResponseRequestList.NoticeMotiveList;

public class ResponseNoticeMotiveListDTO extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private NoticeMotiveList responseData;
	
	public ResponseNoticeMotiveListDTO(){
		
	}

	public NoticeMotiveList getResponseData() {
		return responseData;
	}

	public void setResponseData(NoticeMotiveList responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "ResponseNoticeMotiveListDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
}
