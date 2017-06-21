package ec.com.taxinet.webapp.form.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class FamilyRiderFrom {
	
	public FamilyRiderFrom(){
		
	}

	@JsonInclude(Include.NON_NULL)
	public static class FamilyRiderDeleteFrom{
		
		public FamilyRiderDeleteFrom(){
			
		}
		
		private Long idRiderParent;
		private Long idRiderSon;
		private Long idUserSession;
		private String sessionToken;
		
		public Long getIdRiderParent() {
			return idRiderParent;
		}
		
		public void setIdRiderParent(Long idRiderParent) {
			this.idRiderParent = idRiderParent;
		}
		
		public Long getIdRiderSon() {
			return idRiderSon;
		}
		
		public void setIdRiderSon(Long idRiderSon) {
			this.idRiderSon = idRiderSon;
		}
		
		public Long getIdUserSession() {
			return idUserSession;
		}
		
		public void setIdUserSession(Long idUserSession) {
			this.idUserSession = idUserSession;
		}
		
		public String getSessionToken() {
			return sessionToken;
		}
		
		public void setSessionToken(String sessionToken) {
			this.sessionToken = sessionToken;
		}
		
		@Override
		public String toString() {
			return "FamilyRiderDeleteFrom [idRiderParent=" + idRiderParent + ", idRiderSon=" + idRiderSon
					+ ", idUserSession=" + idUserSession + ", sessionToken=" + sessionToken + "]";
		}

	}
	@JsonInclude(Include.NON_NULL)
	public static class FamilyRiderAddFrom{
		
		public FamilyRiderAddFrom(){
			
		}
		
		private Long idRider;
		private String email;
		private Long idUserSession;
		private String sessionToken;
		private String link;

		public Long getIdRider() {
			return idRider;
		}

		public void setIdRider(Long idRider) {
			this.idRider = idRider;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getIdUserSession() {
			return idUserSession;
		}

		public void setIdUserSession(Long idUserSession) {
			this.idUserSession = idUserSession;
		}

		public String getSessionToken() {
			return sessionToken;
		}

		public void setSessionToken(String sessionToken) {
			this.sessionToken = sessionToken;
		}

		public String getLink() {
			return link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		@Override
		public String toString() {
			return "AddFamilyRiderFrom [idRider=" + idRider + ", email=" + email + ", idUserSession=" + idUserSession
					+ ", sessionToken=" + sessionToken + ", link=" + link + "]";
		}

	}

}
