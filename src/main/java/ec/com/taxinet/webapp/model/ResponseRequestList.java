/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Jccampos
 *
 */
public class ResponseRequestList implements Serializable {

	public ResponseRequestList() {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;
	private Integer id_request;
	private String number_request;
	private String date_request;
	private String format_date_request;
	private Integer id_type_use;
	private String number_catastro;
	private String number_catastro_old;
	private String responsable;
	private String responsable_id;
	private String responsable_civ;
	private String address;
	private Integer id_responsible_official;
	private String comment_requisite;
	private Integer id_type_request;
	private String status_request;
	private Integer id_user_created;
	private Date date_created;
	private Integer id_user_modificated;
	private Date date_modificated;
	
	private Double payment_imput;
	private Double payment_output;
	private String name_delivery;
	private String id_delivery;
	private String date_delivery;
	private Integer id_zone;
	private Integer id_ordinance;
	private String format_date_payment;
	private String format_date_notice_catastro;
	
	private List<RequestOwnerList> requestOwnerList;
	private List<RequestRequisiteList> requestRequisiteList;
	private List<RequestAttachedList> requestAttachedList;
	private List<ResponseRequestPaymentList> responseRequestPaymentList;
	private RequestUpplementaryList requestUpplementaryList;
	private List<RequestCommentList> requestCommentList;
	
	public Integer getId_request() {
		return id_request;
	}

	public void setId_request(Integer id_request) {
		this.id_request = id_request;
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

	public String getFormat_date_request() {
		return format_date_request;
	}

	public void setFormat_date_request(String format_date_request) {
		this.format_date_request = format_date_request;
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

	public Integer getId_type_request() {
		return id_type_request;
	}

	public void setId_type_request(Integer id_type_request) {
		this.id_type_request = id_type_request;
	}

	public String getStatus_request() {
		return status_request;
	}

	public void setStatus_request(String status_request) {
		this.status_request = status_request;
	}

	public Integer getId_user_created() {
		return id_user_created;
	}

	public void setId_user_created(Integer id_user_created) {
		this.id_user_created = id_user_created;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Integer getId_user_modificated() {
		return id_user_modificated;
	}

	public void setId_user_modificated(Integer id_user_modificated) {
		this.id_user_modificated = id_user_modificated;
	}

	public Date getDate_modificated() {
		return date_modificated;
	}

	public void setDate_modificated(Date date_modificated) {
		this.date_modificated = date_modificated;
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

	public String getName_delivery() {
		return name_delivery;
	}

	public void setName_delivery(String name_delivery) {
		this.name_delivery = name_delivery;
	}

	public String getId_delivery() {
		return id_delivery;
	}

	public void setId_delivery(String id_delivery) {
		this.id_delivery = id_delivery;
	}

	public String getDate_delivery() {
		return date_delivery;
	}

	public void setDate_delivery(String date_delivery) {
		this.date_delivery = date_delivery;
	}

	public Integer getId_zone() {
		return id_zone;
	}

	public void setId_zone(Integer id_zone) {
		this.id_zone = id_zone;
	}

	public Integer getId_ordinance() {
		return id_ordinance;
	}

	public void setId_ordinance(Integer id_ordinance) {
		this.id_ordinance = id_ordinance;
	}

	public String getFormat_date_payment() {
		return format_date_payment;
	}

	public void setFormat_date_payment(String format_date_payment) {
		this.format_date_payment = format_date_payment;
	}

	public String getFormat_date_notice_catastro() {
		return format_date_notice_catastro;
	}

	public void setFormat_date_notice_catastro(String format_date_notice_catastro) {
		this.format_date_notice_catastro = format_date_notice_catastro;
	}

	public List<RequestOwnerList> getRequestOwnerList() {
		return requestOwnerList;
	}

	public void setRequestOwnerList(List<RequestOwnerList> requestOwnerList) {
		this.requestOwnerList = requestOwnerList;
	}

	public List<RequestRequisiteList> getRequestRequisiteList() {
		return requestRequisiteList;
	}

	public void setRequestRequisiteList(List<RequestRequisiteList> requestRequisiteList) {
		this.requestRequisiteList = requestRequisiteList;
	}

	public List<RequestAttachedList> getRequestAttachedList() {
		return requestAttachedList;
	}

	public void setRequestAttachedList(List<RequestAttachedList> requestAttachedList) {
		this.requestAttachedList = requestAttachedList;
	}

	public List<ResponseRequestPaymentList> getResponseRequestPaymentList() {
		return responseRequestPaymentList;
	}

	public void setResponseRequestPaymentList(List<ResponseRequestPaymentList> responseRequestPaymentList) {
		this.responseRequestPaymentList = responseRequestPaymentList;
	}

	public RequestUpplementaryList getRequestUpplementaryList() {
		return requestUpplementaryList;
	}

	public void setRequestUpplementaryList(RequestUpplementaryList requestUpplementaryList) {
		this.requestUpplementaryList = requestUpplementaryList;
	}

	public List<RequestCommentList> getRequestCommentList() {
		return requestCommentList;
	}

	public void setRequestCommentList(List<RequestCommentList> requestCommentList) {
		this.requestCommentList = requestCommentList;
	}
	
	@Override
	public String toString() {
		return "ResponseRequestList [id_request=" + id_request + ", number_request=" + number_request
				+ ", date_request=" + date_request + ", format_date_request=" + format_date_request + ", id_type_use="
				+ id_type_use + ", number_catastro=" + number_catastro + ", number_catastro_old=" + number_catastro_old
				+ ", responsable=" + responsable + ", responsable_id=" + responsable_id + ", responsable_civ="
				+ responsable_civ + ", address=" + address + ", id_responsible_official=" + id_responsible_official
				+ ", comment_requisite=" + comment_requisite + ", id_type_request=" + id_type_request
				+ ", status_request=" + status_request + ", id_user_created=" + id_user_created + ", date_created="
				+ date_created + ", id_user_modificated=" + id_user_modificated + ", date_modificated="
				+ date_modificated + ", payment_imput=" + payment_imput + ", payment_output=" + payment_output
				+ ", name_delivery=" + name_delivery + ", id_delivery=" + id_delivery + ", date_delivery="
				+ date_delivery + ", id_zone=" + id_zone + ", id_ordinance=" + id_ordinance + ", format_date_payment="
				+ format_date_payment + ", format_date_notice_catastro=" + format_date_notice_catastro
				+ ", requestOwnerList=" + requestOwnerList + ", requestRequisiteList=" + requestRequisiteList
				+ ", requestAttachedList=" + requestAttachedList + ", responseRequestPaymentList="
				+ responseRequestPaymentList + ", requestUpplementaryList=" + requestUpplementaryList
				+ ", requestCommentList=" + requestCommentList + "]";
	}

	@JsonInclude(Include.NON_NULL)
	public static class RequestOwnerList{
		
		public RequestOwnerList(){
			
		}

		private Integer id_request_owner;
		private Integer id_request;
		private Integer id_owner;
		private String name_owner;
		private String email_owner;
		private String owner_id;
		private String nationality_owner;
		private String phone_owner;
		private String mobile_owner;
		
		public Integer getId_request_owner() {
			return id_request_owner;
		}
		public void setId_request_owner(Integer id_request_owner) {
			this.id_request_owner = id_request_owner;
		}
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
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
			return "RequestOwnerList [id_request_owner=" + id_request_owner + ", id_request=" + id_request
					+ ", id_owner=" + id_owner + ", name_owner=" + name_owner + ", email_owner=" + email_owner
					+ ", owner_id=" + owner_id + ", nationality_owner=" + nationality_owner + ", phone_owner="
					+ phone_owner + ", mobile_owner=" + mobile_owner + "]";
		}
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class RequestRequisiteList{
		
		public RequestRequisiteList(){
			
		}

		private Integer id_request_requisite;
		private Integer id_request;
		private Integer id_requisite;
		private String name_requisite;
		private Boolean yes;
		private Boolean no;
		private Boolean does_not_apply;
		private Boolean pending;
		public Integer getId_request_requisite() {
			return id_request_requisite;
		}
		public void setId_request_requisite(Integer id_request_requisite) {
			this.id_request_requisite = id_request_requisite;
		}
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public Integer getId_requisite() {
			return id_requisite;
		}
		public void setId_requisite(Integer id_requisite) {
			this.id_requisite = id_requisite;
		}
		public String getName_requisite() {
			return name_requisite;
		}
		public void setName_requisite(String name_requisite) {
			this.name_requisite = name_requisite;
		}
		public Boolean getYes() {
			return yes;
		}
		public void setYes(Boolean yes) {
			this.yes = yes;
		}
		public Boolean getNo() {
			return no;
		}
		public void setNo(Boolean no) {
			this.no = no;
		}
		public Boolean getDoes_not_apply() {
			return does_not_apply;
		}
		public void setDoes_not_apply(Boolean does_not_apply) {
			this.does_not_apply = does_not_apply;
		}
		public Boolean getPending() {
			return pending;
		}
		public void setPending(Boolean pending) {
			this.pending = pending;
		}
		@Override
		public String toString() {
			return "RequestRequisiteList [id_request_requisite=" + id_request_requisite + ", id_request=" + id_request
					+ ", id_requisite=" + id_requisite + ", name_requisite=" + name_requisite + ", yes=" + yes + ", no="
					+ no + ", does_not_apply=" + does_not_apply + ", pending=" + pending + "]";
		}
		
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class RequestAttachedList{
		
		public RequestAttachedList(){
			
		}

		private Integer number_request;
		private String name_requisite;
		private String url;
		private Integer id_request_attached;
		private Integer id_request_requisite;
		private Integer id_request;
		private Integer id_requisite;
		public Integer getNumber_request() {
			return number_request;
		}
		public void setNumber_request(Integer number_request) {
			this.number_request = number_request;
		}
		public String getName_requisite() {
			return name_requisite;
		}
		public void setName_requisite(String name_requisite) {
			this.name_requisite = name_requisite;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
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
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public Integer getId_requisite() {
			return id_requisite;
		}
		public void setId_requisite(Integer id_requisite) {
			this.id_requisite = id_requisite;
		}
		@Override
		public String toString() {
			return "RequestAttachedList [number_request=" + number_request + ", name_requisite=" + name_requisite
					+ ", url=" + url + ", id_request_attached=" + id_request_attached + ", id_request_requisite="
					+ id_request_requisite + ", id_request=" + id_request + ", id_requisite=" + id_requisite + "]";
		}

	}
	
	@JsonInclude(Include.NON_NULL)
	public static class ResponseRequestPaymentList{
		
		public ResponseRequestPaymentList(){
			
		}
		/*
		 * "id_request_payment": 1,
          "amount": 1000,
          "fee": 1,
          "date_payment": "2017-03-15",
          "id_request": 6,
          "active": true,
          "number_request": 1234512345
		 */

		private Integer id_request_payment;
		private Double amount;
		private String fee;
		private String date_payment;
		private Integer id_request;
		private Boolean active;
		private String number_request;
		
		public Integer getId_request_payment() {
			return id_request_payment;
		}
		
		public void setId_request_payment(Integer id_request_payment) {
			this.id_request_payment = id_request_payment;
		}
		
		public Double getAmount() {
			return amount;
		}
		
		public void setAmount(Double amount) {
			this.amount = amount;
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
		
		public Integer getId_request() {
			return id_request;
		}
		
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		
		public Boolean getActive() {
			return active;
		}
		
		public void setActive(Boolean active) {
			this.active = active;
		}
		
		public String getNumber_request() {
			return number_request;
		}
		
		public void setNumber_request(String number_request) {
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
	public static class RequestUpplementaryList{
		
		public RequestUpplementaryList(){
			
		}

		private Integer id_request_upplementary;
		private String number_notice_catastro;
		private String date_notice_catastro;
		private Double area_terrain;
		private Double front_terrain;
		private Double area_usable;
		
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
		public String getDate_notice_catastro() {
			return date_notice_catastro;
		}
		public void setDate_notice_catastro(String date_notice_catastro) {
			this.date_notice_catastro = date_notice_catastro;
		}
		public Double getArea_terrain() {
			return area_terrain;
		}
		public void setArea_terrain(Double area_terrain) {
			this.area_terrain = area_terrain;
		}
		public Double getFront_terrain() {
			return front_terrain;
		}
		public void setFront_terrain(Double front_terrain) {
			this.front_terrain = front_terrain;
		}
		public Double getArea_usable() {
			return area_usable;
		}
		public void setArea_usable(Double area_usable) {
			this.area_usable = area_usable;
		}
		
		@Override
		public String toString() {
			return "RequestUpplementaryList [id_request_upplementary=" + id_request_upplementary
					+ ", number_notice_catastro=" + number_notice_catastro + ", date_notice_catastro="
					+ date_notice_catastro + ", area_terrain=" + area_terrain + ", front_terrain=" + front_terrain
					+ ", area_usable=" + area_usable + "]";
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class RequestCommentList{
		
		public RequestCommentList(){
			
		}

		private Integer id_request_comment;
		private String comment_rev;
		private String status_name;
		private String date_comment;
		private Integer id_request;
		private Integer devolution;
		
		public Integer getId_request_comment() {
			return id_request_comment;
		}
		public void setId_request_comment(Integer id_request_comment) {
			this.id_request_comment = id_request_comment;
		}
		public String getComment_rev() {
			return comment_rev;
		}
		public void setComment_rev(String comment_rev) {
			this.comment_rev = comment_rev;
		}
		public String getStatus_name() {
			return status_name;
		}
		public void setStatus_name(String status_name) {
			this.status_name = status_name;
		}
		public String getDate_comment() {
			return date_comment;
		}
		public void setDate_comment(String date_comment) {
			this.date_comment = date_comment;
		}
		public Integer getId_request() {
			return id_request;
		}
		public void setId_request(Integer id_request) {
			this.id_request = id_request;
		}
		public Integer getDevolution() {
			return devolution;
		}
		public void setDevolution(Integer devolution) {
			this.devolution = devolution;
		}
		
		@Override
		public String toString() {
			return "RequestCommentList [id_request_comment=" + id_request_comment + ", comment_rev=" + comment_rev
					+ ", status_name=" + status_name + ", date_comment=" + date_comment + ", id_request=" + id_request
					+ ", devolution=" + devolution + "]";
		}
		
	}
	//

}
