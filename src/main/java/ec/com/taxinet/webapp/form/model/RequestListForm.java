/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Juan Campos
 *
 */
public class RequestListForm {
	/** 
	 * 
	 */

	@JsonInclude(Include.NON_NULL)
	public static class VUFFindRequestFrom{
		
		public VUFFindRequestFrom(){
			
		}
		
		private Integer number_request;
		private String responsable;
		private String date_request;
		private String date_request_hasta;
		
		public Integer getNumber_request() {
			return number_request;
		}
		
		public void setNumber_request(Integer number_request) {
			this.number_request = number_request;
		}
		
		public String getResponsable() {
			return responsable;
		}
		
		public void setResponsable(String responsable) {
			this.responsable = responsable;
		}
		
		public String getDate_request() {
			return date_request;
		}
		
		public void setDate_request(String date_request) {
			this.date_request = date_request;
		}
		
		public String getDate_request_hasta() {
			return date_request_hasta;
		}
		
		public void setDate_request_hasta(String date_request_hasta) {
			this.date_request_hasta = date_request_hasta;
		}
		
		@Override
		public String toString() {
			return "RequestRequest [number_request=" + number_request + ", responsable=" + responsable
					+ ", date_request=" + date_request + ", date_request_hasta=" + date_request_hasta + "]";
		}

	}
	
	@JsonInclude(Include.NON_NULL)
	public static class VufAddOwnerFrom{
		
		public VufAddOwnerFrom(){
			
		}
		
		private Integer id_owner;
		private String name_owner;
		private String email_owner;
		private String owner_id;
		private String nationality_owner;
		private String phone_owner;
		private String mobile_owner;
		
		public Integer getId_owner() {
			return id_owner;
		}
		public void setId_owner(Integer id_owner) {
			this.id_owner = id_owner;
		}
		public String getName_owner() {
			return name_owner;
		}
		public void setName_owner(String name_owner) {
			this.name_owner = name_owner;
		}
		public String getEmail_owner() {
			return email_owner;
		}
		public void setEmail_owner(String email_owner) {
			this.email_owner = email_owner;
		}
		public String getOwner_id() {
			return owner_id;
		}
		public void setOwner_id(String owner_id) {
			this.owner_id = owner_id;
		}
		public String getNationality_owner() {
			return nationality_owner;
		}
		public void setNationality_owner(String nationality_owner) {
			this.nationality_owner = nationality_owner;
		}
		public String getPhone_owner() {
			return phone_owner;
		}
		public void setPhone_owner(String phone_owner) {
			this.phone_owner = phone_owner;
		}
		public String getMobile_owner() {
			return mobile_owner;
		}
		public void setMobile_owner(String mobile_owner) {
			this.mobile_owner = mobile_owner;
		}
		@Override
		public String toString() {
			return "VUFaddOwner [id_owner=" + id_owner + ", name_owner=" + name_owner + ", email_owner=" + email_owner
					+ ", owner_id=" + owner_id + ", nationality_owner=" + nationality_owner + ", phone_owner="
					+ phone_owner + ", mobile_owner=" + mobile_owner + "]";
		}		

	}

	
	@JsonInclude(Include.NON_NULL)
	public static class VufAddPaymentFrom{
		
		public VufAddPaymentFrom(){
			
		}
		
		private Integer id_request_payment;
		private Integer id_request;
		private Integer fee;
		private String date_payment;
		private Double amount;
		private Boolean active;
		
		public Integer getId_request_payment() {
			return id_request_payment;
		}
		public void setId_request_payment(Integer id_request_payment) {
			this.id_request_payment = id_request_payment;
		}
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public Integer getFee() {
			return fee;
		}
		public void setFee(Integer fee) {
			this.fee = fee;
		}
		public String getDate_payment() {
			return date_payment;
		}
		public void setDate_payment(String date_payment) {
			this.date_payment = date_payment;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public Boolean getActive() {
			return active;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		
		@Override
		public String toString() {
			return "VufAddPaymentFrom [id_request_payment=" + id_request_payment + ", id_request=" + id_request
					+ ", fee=" + fee + ", date_payment=" + date_payment + ", amount=" + amount + ", active=" + active
					+ "]";
		}
		
	}
	

	
	@JsonInclude(Include.NON_NULL)
	public static class VufUpdateRequestFrom{
		
		public VufUpdateRequestFrom(){
			
		}

		private Integer id_request;
		private Integer id_type_request;
		private Integer id_user;
		private String number_request;
		private String date_request;
		private Integer id_type_use;
		private String number_catastro;
		private String number_catastro_old;
		private String responsable;
		private String responsable_id;
		private String responsable_civ;
		private String address;
		private Integer id_responsible_official;
		private String comment_requisite;
		private Integer id_request_parent;

		private Integer id_ordinance;
		private String id_delivery;
		private String name_delivery;
		private String date_delivery;
		private String fee;
		private String date_payment;
		private Double payment_imput;
		private Double payment_output;
		

		private Double area_terrain;
		private Double area_usable;
		private String date_notice_catastro;
		private Double front_terrain;
		private Integer id_request_upplementary;
		private String number_notice_catastro;
		private Integer id_type_notice;
		
		private List<String> id_owners;
		private List<String> id_requisites;
		private List<requestOwner> requestMngRequestOwner;
		private List<requestRequisite> requestMngRequestRequisite;
		private List<responseRequestPaymentList> responseRequestPaymentList;
		private mngRequestUpplementary mngRequestUpplementary;

		public Integer getId_request() {
			return id_request;
		}

		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}

		public Integer getId_type_request() {
			return id_type_request;
		}

		public void setId_type_request(Integer id_type_request) {
			this.id_type_request = id_type_request;
		}

		public Integer getId_user() {
			return id_user;
		}

		public void setId_user(Integer id_user) {
			this.id_user = id_user;
		}

		public String getNumber_request() {
			return number_request;
		}

		public void setNumber_request(String number_request) {
			this.number_request = number_request;
		}

		public String getDate_request() {
			return date_request;
		}

		public void setDate_request(String date_request) {
			this.date_request = date_request;
		}

		public Integer getId_type_use() {
			return id_type_use;
		}

		public void setId_type_use(Integer id_type_use) {
			this.id_type_use = id_type_use;
		}

		public String getNumber_catastro() {
			return number_catastro;
		}

		public void setNumber_catastro(String number_catastro) {
			this.number_catastro = number_catastro;
		}

		public String getNumber_catastro_old() {
			return number_catastro_old;
		}

		public void setNumber_catastro_old(String number_catastro_old) {
			this.number_catastro_old = number_catastro_old;
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

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Integer getId_responsible_official() {
			return id_responsible_official;
		}

		public void setId_responsible_official(Integer id_responsible_official) {
			this.id_responsible_official = id_responsible_official;
		}

		public String getComment_requisite() {
			return comment_requisite;
		}

		public void setComment_requisite(String comment_requisite) {
			this.comment_requisite = comment_requisite;
		}

		public Integer getId_request_parent() {
			return id_request_parent;
		}

		public void setId_request_parent(Integer id_request_parent) {
			this.id_request_parent = id_request_parent;
		}

		public Integer getId_ordinance() {
			return id_ordinance;
		}

		public void setId_ordinance(Integer id_ordinance) {
			this.id_ordinance = id_ordinance;
		}

		public String getId_delivery() {
			return id_delivery;
		}

		public void setId_delivery(String id_delivery) {
			this.id_delivery = id_delivery;
		}

		public String getName_delivery() {
			return name_delivery;
		}

		public void setName_delivery(String name_delivery) {
			this.name_delivery = name_delivery;
		}

		public String getDate_delivery() {
			return date_delivery;
		}

		public void setDate_delivery(String date_delivery) {
			this.date_delivery = date_delivery;
		}

		public String getFee() {
			return fee;
		}

		public void setFee(String fee) {
			this.fee = fee;
		}

		public String getDate_payment() {
			return date_payment;
		}

		public void setDate_payment(String date_payment) {
			this.date_payment = date_payment;
		}

		public Double getPayment_imput() {
			return payment_imput;
		}

		public void setPayment_imput(Double payment_imput) {
			this.payment_imput = payment_imput;
		}

		public Double getPayment_output() {
			return payment_output;
		}

		public void setPayment_output(Double payment_output) {
			this.payment_output = payment_output;
		}

		public Double getArea_terrain() {
			return area_terrain;
		}

		public void setArea_terrain(Double area_terrain) {
			this.area_terrain = area_terrain;
		}

		public Double getArea_usable() {
			return area_usable;
		}

		public void setArea_usable(Double area_usable) {
			this.area_usable = area_usable;
		}

		public String getDate_notice_catastro() {
			return date_notice_catastro;
		}

		public void setDate_notice_catastro(String date_notice_catastro) {
			this.date_notice_catastro = date_notice_catastro;
		}

		public Double getFront_terrain() {
			return front_terrain;
		}

		public void setFront_terrain(Double front_terrain) {
			this.front_terrain = front_terrain;
		}

		public Integer getId_request_upplementary() {
			return id_request_upplementary;
		}

		public void setId_request_upplementary(Integer id_request_upplementary) {
			this.id_request_upplementary = id_request_upplementary;
		}

		public String getNumber_notice_catastro() {
			return number_notice_catastro;
		}

		public void setNumber_notice_catastro(String number_notice_catastro) {
			this.number_notice_catastro = number_notice_catastro;
		}

		public Integer getId_type_notice() {
			return id_type_notice;
		}

		public void setId_type_notice(Integer id_type_notice) {
			this.id_type_notice = id_type_notice;
		}

		public List<String> getId_owners() {
			return id_owners;
		}

		public void setId_owners(List<String> id_owners) {
			this.id_owners = id_owners;
		}

		public List<String> getId_requisites() {
			return id_requisites;
		}

		public void setId_requisites(List<String> id_requisites) {
			this.id_requisites = id_requisites;
		}

		public List<requestOwner> getRequestMngRequestOwner() {
			return requestMngRequestOwner;
		}

		public void setRequestMngRequestOwner(List<requestOwner> requestMngRequestOwner) {
			this.requestMngRequestOwner = requestMngRequestOwner;
		}

		public List<requestRequisite> getRequestMngRequestRequisite() {
			return requestMngRequestRequisite;
		}

		public void setRequestMngRequestRequisite(List<requestRequisite> requestMngRequestRequisite) {
			this.requestMngRequestRequisite = requestMngRequestRequisite;
		}

		public List<responseRequestPaymentList> getResponseRequestPaymentList() {
			return responseRequestPaymentList;
		}

		public void setResponseRequestPaymentList(List<responseRequestPaymentList> responseRequestPaymentList) {
			this.responseRequestPaymentList = responseRequestPaymentList;
		}

		public mngRequestUpplementary getMngRequestUpplementary() {
			return mngRequestUpplementary;
		}

		public void setMngRequestUpplementary(mngRequestUpplementary mngRequestUpplementary) {
			this.mngRequestUpplementary = mngRequestUpplementary;
		}

		@Override
		public String toString() {
			return "VufUpdateRequestFrom [id_request=" + id_request + ", id_type_request=" + id_type_request
					+ ", id_user=" + id_user + ", number_request=" + number_request + ", date_request=" + date_request
					+ ", id_type_use=" + id_type_use + ", number_catastro=" + number_catastro + ", number_catastro_old="
					+ number_catastro_old + ", responsable=" + responsable + ", responsable_id=" + responsable_id
					+ ", responsable_civ=" + responsable_civ + ", address=" + address + ", id_responsible_official="
					+ id_responsible_official + ", comment_requisite=" + comment_requisite + ", id_request_parent="
					+ id_request_parent + ", id_ordinance=" + id_ordinance + ", id_delivery=" + id_delivery
					+ ", name_delivery=" + name_delivery + ", date_delivery=" + date_delivery + ", fee=" + fee
					+ ", date_payment=" + date_payment + ", payment_imput=" + payment_imput + ", payment_output="
					+ payment_output + ", area_terrain=" + area_terrain + ", area_usable=" + area_usable
					+ ", date_notice_catastro=" + date_notice_catastro + ", front_terrain=" + front_terrain
					+ ", id_request_upplementary=" + id_request_upplementary + ", number_notice_catastro="
					+ number_notice_catastro + ", id_type_notice=" + id_type_notice + ", id_owners=" + id_owners
					+ ", id_requisites=" + id_requisites + ", requestMngRequestOwner=" + requestMngRequestOwner
					+ ", requestMngRequestRequisite=" + requestMngRequestRequisite + ", responseRequestPaymentList="
					+ responseRequestPaymentList + ", mngRequestUpplementary=" + mngRequestUpplementary + "]";
		}



		@JsonInclude(Include.NON_NULL)
		public static class VufAddRequestAttachedFrom{
			
			public VufAddRequestAttachedFrom(){
				
			}

			private Integer id_request_attached;
			private Integer id_request_requisite;
			private String url;
			
			public Integer getId_request_attached() {
				return id_request_attached;
			}
			
			public void setId_request_attached(Integer id_request_attached) {
				this.id_request_attached = id_request_attached;
			}
			
			public Integer getId_request_requisite() {
				return id_request_requisite;
			}
			
			public void setId_request_requisite(Integer id_request_requisite) {
				this.id_request_requisite = id_request_requisite;
			}
			
			public String getUrl() {
				return url;
			}
			
			public void setUrl(String url) {
				this.url = url;
			}

			@Override
			public String toString() {
				return "VufAddRequestAttachedFrom [id_request_attached=" + id_request_attached + ", id_request_requisite="
						+ id_request_requisite + ", url=" + url + "]";
			}
			
		}

		@JsonInclude(Include.NON_NULL)
		public static class requestOwner{			
			
			public requestOwner(){
				
			}

			private Integer id_owner;
			private Integer id_request;
			private Integer id_request_owner;
			
			public Integer getId_owner() {
				return id_owner;
			}
			
			public void setId_owner(Integer id_owner) {
				this.id_owner = id_owner;
			}
			
			public Integer getId_request() {
				return id_request;
			}
			
			public void setId_request(Integer id_request) {
				this.id_request = id_request;
			}
			
			public Integer getId_request_owner() {
				return id_request_owner;
			}
			
			public void setId_request_owner(Integer id_request_owner) {
				this.id_request_owner = id_request_owner;
			}
			
			@Override
			public String toString() {
				return "requestOwner [id_owner=" + id_owner + ", id_request=" + id_request + ", id_request_owner="
						+ id_request_owner + "]";
			}
			
		}

		@JsonInclude(Include.NON_NULL)
		public static class requestRequisite{
			
			public requestRequisite(){
				
			}

			private Boolean does_not_apply;
			private Integer id_request;
			private Integer id_request_requisite;
			private Integer id_requisite;
			private Boolean nno;
			private Boolean pending;
			private Boolean yyes;
			
			public Boolean getDoes_not_apply() {
				return does_not_apply;
			}
			public void setDoes_not_apply(Boolean does_not_apply) {
				this.does_not_apply = does_not_apply;
			}
			public Integer getId_request() {
				return id_request;
			}
			public void setId_request(Integer id_request) {
				this.id_request = id_request;
			}
			public Integer getId_request_requisite() {
				return id_request_requisite;
			}
			public void setId_request_requisite(Integer id_request_requisite) {
				this.id_request_requisite = id_request_requisite;
			}
			public Integer getId_requisite() {
				return id_requisite;
			}
			public void setId_requisite(Integer id_requisite) {
				this.id_requisite = id_requisite;
			}
			public Boolean getNno() {
				return nno;
			}
			public void setNno(Boolean nno) {
				this.nno = nno;
			}
			public Boolean getPending() {
				return pending;
			}
			public void setPending(Boolean pending) {
				this.pending = pending;
			}
			public Boolean getYyes() {
				return yyes;
			}
			public void setYyes(Boolean yyes) {
				this.yyes = yyes;
			}
			
			@Override
			public String toString() {
				return "requestRequisite [does_not_apply=" + does_not_apply + ", id_request=" + id_request
						+ ", id_request_requisite=" + id_request_requisite + ", id_requisite=" + id_requisite + ", nno="
						+ nno + ", pending=" + pending + ", yyes=" + yyes + "]";
			}

		}
		
		
	}

	@JsonInclude(Include.NON_NULL)
	public static class VufTracingManagementFrom{
		
		public VufTracingManagementFrom(){
			
		}
		/*
		 * "comment_manager": "",
  "comment_supervisor": "",
  "decision": 1,
  "id_request": 30
		 */
		
		private Integer id_request;
		private Integer decision;
		private String comment_supervisor;
		private String comment_manager;
		
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public Integer getDecision() {
			return decision;
		}
		public void setDecision(Integer decision) {
			this.decision = decision;
		}
		public String getComment_supervisor() {
			return comment_supervisor;
		}
		public void setComment_supervisor(String comment_supervisor) {
			this.comment_supervisor = comment_supervisor;
		}
		public String getComment_manager() {
			return comment_manager;
		}
		public void setComment_manager(String comment_manager) {
			this.comment_manager = comment_manager;
		}
		
		@Override
		public String toString() {
			return "VufTracingManagementFrom [id_request=" + id_request + ", decision=" + decision
					+ ", comment_supervisor=" + comment_supervisor + ", comment_manager=" + comment_manager + "]";
		}
		
	}
	


	@JsonInclude(Include.NON_NULL)
	public static class responseRequestPaymentList{
		
		public responseRequestPaymentList(){
			
		}
		/*
		 * "id_request_payment": 2,
          "amount": 1000,
          "fee": 1,
          "date_payment": "2017-03-15",
          "id_request": 13,
          "active": true,
          "number_request": 1234512345
		 */
		
		private Integer id_request_payment;
		private Integer amount;
		private Integer fee;
		private Integer date_payment;
		private Integer id_request;
		private Integer active;
		private Integer number_request;
		
		public Integer getId_request_payment() {
			return id_request_payment;
		}
		
		public void setId_request_payment(Integer id_request_payment) {
			this.id_request_payment = id_request_payment;
		}
		
		public Integer getAmount() {
			return amount;
		}
		
		public void setAmount(Integer amount) {
			this.amount = amount;
		}
		
		public Integer getFee() {
			return fee;
		}
		
		public void setFee(Integer fee) {
			this.fee = fee;
		}
		
		public Integer getDate_payment() {
			return date_payment;
		}
		
		public void setDate_payment(Integer date_payment) {
			this.date_payment = date_payment;
		}
		
		public Integer getId_request() {
			return id_request;
		}
		
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		
		public Integer getActive() {
			return active;
		}
		
		public void setActive(Integer active) {
			this.active = active;
		}
		
		public Integer getNumber_request() {
			return number_request;
		}
		
		public void setNumber_request(Integer number_request) {
			this.number_request = number_request;
		}
		
		@Override
		public String toString() {
			return "responseRequestPaymentList [id_request_payment=" + id_request_payment + ", amount=" + amount
					+ ", fee=" + fee + ", date_payment=" + date_payment + ", id_request=" + id_request + ", active="
					+ active + ", number_request=" + number_request + "]";
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class mngRequestUpplementary{
		
		public mngRequestUpplementary(){
			
		}
		/*<!-- "mngRequestUpplementary": {
	    "area_terrain": 0,
	    "area_usable": 0, aprovechable
	    "date_notice_catastro": "string",
	    "front_terrain": 0, frente
	    "id_request": 0,
	    "id_request_upplementary": 0,
	    "number_notice_catastro": "string"
	  }, -->*/
		
		private Double area_terrain;
		private Double area_usable;
		private String date_notice_catastro;
		private Double front_terrain;
		private Integer id_request;
		private Integer id_request_upplementary;
		private String number_notice_catastro;
		
		public Double getArea_terrain() {
			return area_terrain;
		}
		public void setArea_terrain(Double area_terrain) {
			this.area_terrain = area_terrain;
		}
		public Double getArea_usable() {
			return area_usable;
		}
		public void setArea_usable(Double area_usable) {
			this.area_usable = area_usable;
		}
		public String getDate_notice_catastro() {
			return date_notice_catastro;
		}
		public void setDate_notice_catastro(String date_notice_catastro) {
			this.date_notice_catastro = date_notice_catastro;
		}
		public Double getFront_terrain() {
			return front_terrain;
		}
		public void setFront_terrain(Double front_terrain) {
			this.front_terrain = front_terrain;
		}
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public Integer getId_request_upplementary() {
			return id_request_upplementary;
		}
		public void setId_request_upplementary(Integer id_request_upplementary) {
			this.id_request_upplementary = id_request_upplementary;
		}
		public String getNumber_notice_catastro() {
			return number_notice_catastro;
		}
		public void setNumber_notice_catastro(String number_notice_catastro) {
			this.number_notice_catastro = number_notice_catastro;
		}
		
		@Override
		public String toString() {
			return "mngRequestUpplementary [area_terrain=" + area_terrain + ", area_usable=" + area_usable
					+ ", date_notice_catastro=" + date_notice_catastro + ", front_terrain=" + front_terrain
					+ ", id_request=" + id_request + ", id_request_upplementary=" + id_request_upplementary
					+ ", number_notice_catastro=" + number_notice_catastro + "]";
		}
		
	}

	@JsonInclude(Include.NON_NULL)
	public static class mngRequestNoticeMotive{
		
		public mngRequestNoticeMotive(){
			
		}
		
		private Double area_accused;
        private String date_gaceta_zoning;
        private String description_parcel;
        private Integer id_request;
        private Integer id_request_notice_motive;
        private String name_zoning;
        private String number_gaceta_zoning;
		private String section_zoning;
		private List<RequestVar> requestVar;
		
		public Double getArea_accused() {
			return area_accused;
		}
		
		public String getDate_gaceta_zoning() {
			return date_gaceta_zoning;
		}
		
		public String getDescription_parcel() {
			return description_parcel;
		}
		
		public Integer getId_request() {
			return id_request;
		}
		
		public Integer getId_request_notice_motive() {
			return id_request_notice_motive;
		}
		
		public String getName_zoning() {
			return name_zoning;
		}
		
		public String getNumber_gaceta_zoning() {
			return number_gaceta_zoning;
		}
		
		public String getSection_zoning() {
			return section_zoning;
		}
		
		public List<RequestVar> getRequestVar() {
			return requestVar;
		}
		
		public void setArea_accused(Double area_accused) {
			this.area_accused = area_accused;
		}
		
		public void setDate_gaceta_zoning(String date_gaceta_zoning) {
			this.date_gaceta_zoning = date_gaceta_zoning;
		}
		
		public void setDescription_parcel(String description_parcel) {
			this.description_parcel = description_parcel;
		}
		
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		
		public void setId_request_notice_motive(Integer id_request_notice_motive) {
			this.id_request_notice_motive = id_request_notice_motive;
		}
		
		public void setName_zoning(String name_zoning) {
			this.name_zoning = name_zoning;
		}
		
		public void setNumber_gaceta_zoning(String number_gaceta_zoning) {
			this.number_gaceta_zoning = number_gaceta_zoning;
		}
		
		public void setSection_zoning(String section_zoning) {
			this.section_zoning = section_zoning;
		}
		
		public void setRequestVar(List<RequestVar> requestVar) {
			this.requestVar = requestVar;
		}
		
		@Override
		public String toString() {
			return "mngRequestNoticeMotive [area_accused=" + area_accused + ", date_gaceta_zoning=" + date_gaceta_zoning
					+ ", description_parcel=" + description_parcel + ", id_request=" + id_request
					+ ", id_request_notice_motive=" + id_request_notice_motive + ", name_zoning=" + name_zoning
					+ ", number_gaceta_zoning=" + number_gaceta_zoning + ", section_zoning=" + section_zoning
					+ ", requestVar=" + requestVar + "]";
		}
		
	}

	@JsonInclude(Include.NON_NULL)
	public static class RequestVar{
		
		public RequestVar(){
			
		}
		
		private String comment_request_variable;
		private String conclusion_request_variable;
		private Integer id_request;
		private Integer id_request_variable_numeral;
		private Integer id_variable_numeral;
		private String name_variable_regulation;
		private Double percentage_difference;
		private Double percentage_presentee;
		private Double percentage_regulation;
		private String value_difference;
		private String value_presentee;
		private String value_regulation;
		
		public String getComment_request_variable() {
			return comment_request_variable;
		}
		public String getConclusion_request_variable() {
			return conclusion_request_variable;
		}
		public Integer getId_request() {
			return id_request;
		}
		public Integer getId_request_variable_numeral() {
			return id_request_variable_numeral;
		}
		public Integer getId_variable_numeral() {
			return id_variable_numeral;
		}
		public String getName_variable_regulation() {
			return name_variable_regulation;
		}
		public Double getPercentage_difference() {
			return percentage_difference;
		}
		public Double getPercentage_presentee() {
			return percentage_presentee;
		}
		public Double getPercentage_regulation() {
			return percentage_regulation;
		}
		public String getValue_difference() {
			return value_difference;
		}
		public String getValue_presentee() {
			return value_presentee;
		}
		public String getValue_regulation() {
			return value_regulation;
		}
		public void setComment_request_variable(String comment_request_variable) {
			this.comment_request_variable = comment_request_variable;
		}
		public void setConclusion_request_variable(String conclusion_request_variable) {
			this.conclusion_request_variable = conclusion_request_variable;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public void setId_request_variable_numeral(Integer id_request_variable_numeral) {
			this.id_request_variable_numeral = id_request_variable_numeral;
		}
		public void setId_variable_numeral(Integer id_variable_numeral) {
			this.id_variable_numeral = id_variable_numeral;
		}
		public void setName_variable_regulation(String name_variable_regulation) {
			this.name_variable_regulation = name_variable_regulation;
		}
		public void setPercentage_difference(Double percentage_difference) {
			this.percentage_difference = percentage_difference;
		}
		public void setPercentage_presentee(Double percentage_presentee) {
			this.percentage_presentee = percentage_presentee;
		}
		public void setPercentage_regulation(Double percentage_regulation) {
			this.percentage_regulation = percentage_regulation;
		}
		public void setValue_difference(String value_difference) {
			this.value_difference = value_difference;
		}
		public void setValue_presentee(String value_presentee) {
			this.value_presentee = value_presentee;
		}
		public void setValue_regulation(String value_regulation) {
			this.value_regulation = value_regulation;
		}
		
		@Override
		public String toString() {
			return "RequestVar [comment_request_variable=" + comment_request_variable + ", conclusion_request_variable="
					+ conclusion_request_variable + ", id_request=" + id_request + ", id_request_variable_numeral="
					+ id_request_variable_numeral + ", id_variable_numeral=" + id_variable_numeral
					+ ", name_variable_regulation=" + name_variable_regulation + ", percentage_difference="
					+ percentage_difference + ", percentage_presentee=" + percentage_presentee
					+ ", percentage_regulation=" + percentage_regulation + ", value_difference=" + value_difference
					+ ", value_presentee=" + value_presentee + ", value_regulation=" + value_regulation + "]";
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class mngRequestNoticePending{
		
		public mngRequestNoticePending(){
			
		}
		
		private Double area_accused;
        private String date_notice_request_previous;
        private String description_plane;
        private Integer id_request;
        private Integer id_request_notice_pending;
        private String name_zoning;
        private String notice_request_previous;
		private List<RequestObserPending> requestObserPending;
		
		public Double getArea_accused() {
			return area_accused;
		}
		public void setArea_accused(Double area_accused) {
			this.area_accused = area_accused;
		}
		public String getDate_notice_request_previous() {
			return date_notice_request_previous;
		}
		public void setDate_notice_request_previous(String date_notice_request_previous) {
			this.date_notice_request_previous = date_notice_request_previous;
		}
		public String getDescription_plane() {
			return description_plane;
		}
		public void setDescription_plane(String description_plane) {
			this.description_plane = description_plane;
		}
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public Integer getId_request_notice_pending() {
			return id_request_notice_pending;
		}
		public void setId_request_notice_pending(Integer id_request_notice_pending) {
			this.id_request_notice_pending = id_request_notice_pending;
		}
		public String getName_zoning() {
			return name_zoning;
		}
		public void setName_zoning(String name_zoning) {
			this.name_zoning = name_zoning;
		}
		public String getNotice_request_previous() {
			return notice_request_previous;
		}
		public void setNotice_request_previous(String notice_request_previous) {
			this.notice_request_previous = notice_request_previous;
		}
		public List<RequestObserPending> getRequestObserPending() {
			return requestObserPending;
		}
		public void setRequestObserPending(List<RequestObserPending> requestObserPending) {
			this.requestObserPending = requestObserPending;
		}
		
		@Override
		public String toString() {
			return "mngRequestNoticePending [area_accused=" + area_accused + ", date_notice_request_previous="
					+ date_notice_request_previous + ", description_plane=" + description_plane + ", id_request="
					+ id_request + ", id_request_notice_pending=" + id_request_notice_pending + ", name_zoning="
					+ name_zoning + ", notice_request_previous=" + notice_request_previous + ", requestObserPending="
					+ requestObserPending + "]";
		}

	}
	


	@JsonInclude(Include.NON_NULL)
	public static class RequestObserPending{
		
		public RequestObserPending(){
			
		}
		
		private String description_observation;
        private Integer id_request;
        private Integer id_request_observation_pending;
        
		public String getDescription_observation() {
			return description_observation;
		}
		public void setDescription_observation(String description_observation) {
			this.description_observation = description_observation;
		}
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public Integer getId_request_observation_pending() {
			return id_request_observation_pending;
		}
		public void setId_request_observation_pending(Integer id_request_observation_pending) {
			this.id_request_observation_pending = id_request_observation_pending;
		}
		
		@Override
		public String toString() {
			return "RequestObserPending [description_observation=" + description_observation + ", id_request="
					+ id_request + ", id_request_observation_pending=" + id_request_observation_pending + "]";
		}

	}
}
	
	
