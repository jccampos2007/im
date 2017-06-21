<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">
	<div class="col-md-12 col-sm-12 col-xs-12">
	 <div class="x_panel tile">
	   <div class="x_title">
		 <h2><spring:message code="requestVUF.page.title" text="Consulta Preliminar de variables urbanas fundamentales"/></h2>
		 <div class="clearfix"></div>
	   </div>
	   <div class="x_content">
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<form id="formRecSearchCS" action="" method="POST">
			      <h4><spring:message code="lbl.title" text="Buscar N° de Solicitud"/></h4>
			        <div class="row">
				        <div class="form-group col-sm-4">
		              		<input class="form-control" name="inputRequestVUFNroCS" id="inputRequestVUFNroCS" type="text" readonly
			              	data-errormessage-value-missing="El n&uacute;mero de Solicitud Ciudadano Sucre no puede ser vacio" placeholder="N° Solicitud Ciudadano Sucre">
				        </div>
				        <div class="form-group col-sm-2">
				        	<button type="button" id="btnRequestVUFSearch" class="btn btn-default disabled"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
				          	<i class="glyphicon glyphicon-search"></i>
				          </button>
				        </div>
				        <div class="form-group col-sm-6">
				          &nbsp;
				        </div>
			       	</div>
			    </form>
			</div>
		</div>
	   </div>
	 </div>
	</div>
	<div id="divControlReport" class="col-md-12 col-sm-12 col-xs-12">
	 <div class="x_panel tile">
	   <div class="x_title">
		 <h2><spring:message code="requestVUF.page.title" text="Acta Control"/></h2>
		 <div class="clearfix"></div>
	   </div>
	   <div class="x_content">
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<form id="formRecControlReport" action="" method="POST">
					<div class="row">
				        <div class="form-group col-sm-4">
		              		<label for="inputRecNumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
			              	<input class="form-control" name="inputRecNumberRequest" id="inputRecNumberRequest" type="text" required>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="inputRecDateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
			              	  <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
				                 <input id="inputRecDateRequest" class="form-control" size="16" type="text" value="" readonly required>
				                 <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				             </div>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="selRecIdTypeUse" class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Uso Presentado"/></label>
			              	<select class="form-control" name="selRecIdTypeUse" id="selRecIdTypeUse">
								<c:forEach items="${typeUses}" var="typeUse">
									<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
								</c:forEach>
				            </select>
				        </div>
			       	</div>
					<div class="row">
				        <div class="form-group col-sm-6">
		              		<label for="inputRecNumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
			              	<input class="form-control" name="inputRecNumberCatastro" id="inputRecNumberCatastro" type="text" required
			              	placeholder="N° Catastro Anterior">
				        </div>
				        <div class="form-group col-sm-6">
		              		<label for="inputRecNumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
			              	<input class="form-control" name="inputRecNumberCatastroOld" id="inputRecNumberCatastroOld" type="text"
			              	placeholder="N° Catastro Anterior">
				        </div>
			       	</div>
					<div class="row">
				        <div class="form-group col-sm-12">
		              		<label for="inputRecAdress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
		              		<textarea class="form-control"name="inputRecAdress" id="inputRecAdress" rows="3" required></textarea>
				        </div>
			       	</div>
					<div class="row">
				        <!-- <div class="form-group col-sm-3">
		              		<label for="selRecIdResponsibleOfficial" class="text-muted"><spring:message code="RequestVUF.lbl.responsibleOfficial" text="Funcionario revisor"/></label>
			              	<select class="form-control" name="selRecIdResponsibleOfficial" id="selRecIdResponsibleOfficial">
				              <option value="1" selected="selected">XXXXXXX</option>
				              <option value="2">XXXXXXX</option>
				              <option value="3">XXXXXXX</option>
				            </select>
				        </div> -->
				        <div class="form-group col-sm-6">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
			              	<input class="form-control" name="inputRecResponsable" id="inputRecResponsable" type="text"
			              	placeholder="Responsable">
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
			              	<input class="form-control" name="inputRecResponsableId" id="inputRecResponsableId" type="text"
			              	placeholder="Responsable">
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
			              	<input class="form-control" name="inputRecResponsableCiv" id="inputRecResponsableCiv" type="text"
			              	placeholder="Responsable">
				        </div>
			       	</div>
					<div id="divOrdinance" class="row">
				        <div class="form-group col-sm-3">
		              		<label for="selIdZone" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Zona"/></label>
			              	<select class="form-control" name="selIdZone" id="selIdZone">
				              <c:forEach items="${zones}" var="zone">
								<option value="${zone.id_zone}">${zone.name_zone}</option>
							  </c:forEach>
				            </select>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="selIdOrdinance" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Ordenanza"/></label>
			              	<select class="form-control" name="selIdOrdinance" id="selIdOrdinance"></select>
				        </div>
			       	</div>
					<div class="row">
				        <div class="form-group col-sm-4">
		              		<label for="inputRecFee" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="N° Comprobante:"/></label>
			              	<input class="form-control" name="inputRecFee" id="inputRecFee" type="text" required
			              	placeholder="Comprobante de Pago">
				        </div>
				        <div class="form-group col-sm-2">
		              		<label for="inputRecFee" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="VANSAT"/></label>
			              	<label id="btnCheckFee" class="form-control btn btn-primary" style="display: table-cell; vertical-align: bottom; float: none;">CONSULTAR
		              			<i class="glyphicon glyphicon-search" style="margin-left: 5px;"></i>
		              		</label>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputRecPaymentImput" id="inputRecPaymentImput" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha del pago"/></label>
			              	<input id="inputRecDatePayment" class="form-control" size="16" type="text" value="" readonly>
				        </div>
			       	</div>
			       	<%--
					<div class="row">
				        <div class="form-group col-sm-10">
		              		<table id="tableOwnerList" class="table">
							  <thead>
							    <tr>
                                  <th>id_owner</th>
                                  <th>id_request_owner</th>
							      <th>PROPIETARIO</th>
							      <th>CI / RIF</th>
							      <th>CORREO</th>
							      <th>TELÉFONO</th>
							    </tr>
							  </thead>
							  <tbody></tbody>
							</table>
				        </div>
				        <div class="form-group col-sm-2">
		              		<label id="btnAddOwner" class="form-control btn btn-primary">AGREGAR
		              			<i class="glyphicon glyphicon-plus" style="margin-left: 5px;"></i>
		              		</label>
				        </div>
			       	</div>
			       	--%>
					<div class="row">
				        <div class="form-group col-sm-12">
		              		<table id="tblRecRequestRequisite" class="table">
							  <thead>
							    <tr>
							      <th>RECAUDOS</th>
							      <th>
							      	<input type="radio" id="chkSelectAllYes" name="selectAll" />SI
							      </th>
							      <th>
							      	<input type="radio" id="chkSelectAllNo" name="selectAll" />NO</th>
							      <th>
							      	<input type="radio" id="chkSelectAllNa" name="selectAll" />N.A</th>
							    </tr>
							  </thead>
							  <tbody>
							    <tr>
							        <th scope="row">Solicitud de consulta preliminar</th>
							        <th><input type="radio" value="yes" name="select1" /></th>
									<th><input type="radio" value="no" name="select1" /></th>
									<th><input type="radio" value="does_not_apply" name="select1" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Documento de Propiedad</th>
							        <th><input type="radio" value="yes" name="select2" /></th>
									<th><input type="radio" value="no" name="select2" /></th>
									<th><input type="radio" value="does_not_apply" name="select2" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Cédula Catastral actualizada a nombre del propietario actual</th>
							        <th><input type="radio" value="yes" name="select3" /></th>
									<th><input type="radio" value="no" name="select3" /></th>
									<th><input type="radio" value="does_not_apply" name="select3" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Contrato de Arrendamiento</th>
							        <th><input type="radio" value="yes" name="select4" /></th>
									<th><input type="radio" value="no" name="select4" /></th>
									<th><input type="radio" value="does_not_apply" name="select4" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Registro Mercantil</th>
							        <th><input type="radio" value="yes" name="select5" /></th>
									<th><input type="radio" value="no" name="select5" /></th>
									<th><input type="radio" value="does_not_apply" name="select5" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Solvencia Municipal o Estado en cero</th>
							        <th><input type="radio" value="yes" name="select6" /></th>
									<th><input type="radio" value="no" name="select6" /></th>
									<th><input type="radio" value="does_not_apply" name="select6" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Solvencia del profesional presentante</th>
							        <th><input type="radio" value="yes" name="select7" /></th>
									<th><input type="radio" value="no" name="select7" /></th>
									<th><input type="radio" value="does_not_apply" name="select7" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Cédula del propietario y profesional responsable</th>
							        <th><input type="radio" value="yes" name="select8" /></th>
									<th><input type="radio" value="no" name="select8" /></th>
									<th><input type="radio" value="does_not_apply" name="select8" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Solvencia de aseo urbano emitida por SERDECO.</th>
							        <th><input type="radio" value="yes" name="select9" /></th>
									<th><input type="radio" value="no" name="select9" /></th>
									<th><input type="radio" value="does_not_apply" name="select9" /></th>
							    </tr>
							    <tr>
							      <th scope="row">Solvencia del servicio público agua emanada del IMAS.</th>
							      <th><input type="radio" value="yes" name="select10" /></th>
									<th><input type="radio" value="no" name="select10" /></th>
									<th><input type="radio" value="does_not_apply" name="select10" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Poder notariado del Representante legal del propietario.</th>
							        <th><input type="radio" value="yes" name="select11" /></th>
									<th><input type="radio" value="no" name="select11" /></th>
									<th><input type="radio" value="does_not_apply" name="select11" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Informe de Verificación de Áreas, linderos y pendientes, emitida por la Dirección de Catastro Municipal.</th>
							        <th><input type="radio" value="yes" name="select12" /></th>
									<th><input type="radio" value="no" name="select12" /></th>
									<th><input type="radio" value="does_not_apply" name="select12" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Comprobante de Cancelación de las Tasas.</th>
							        <th><input type="radio" value="yes" name="select13" /></th>
									<th><input type="radio" value="no" name="select13" /></th>
									<th><input type="radio" value="does_not_apply" name="select13" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Planos -Tres (1) ejemplares del plano de Topografía original, con curvas de nivel a cada (2 m.) con estudio de clasificación de pendientes de 0 a 20°, de 21 a 40°, de 41o a 60° y >60°, indicando linderos y área conforme al documento de propiedad inserto en cuadro de coordenadas UTM referidas a Sistemas REGVEN.</th>
							        <th><input type="radio" value="yes" name="select14" /></th>
									<th><input type="radio" value="no" name="select14" /></th>
									<th><input type="radio" value="does_not_apply" name="select14" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Planos -Un (01) Cd plano de Topografía original formato DWG (AUTOCAD), con curvas de nivel a cada (2 m.) con estudio de clasificación de pendientes de 0 a 20°, de 21 a 40°, de 41o a 60° y >60°, indicando linderos y área conforme al documento de propiedad</th>
							        <th><input type="radio" value="yes" name="select15" /></th>
									<th><input type="radio" value="no" name="select15" /></th>
									<th><input type="radio" value="does_not_apply" name="select15" /></th>
							    </tr>
							    <tr>
							      <th scope="row" colspan="4">OBSERVACIONES:</th>
							    </tr>
							    <tr>
							      <th scope="row" colspan="4"><textarea id="taRecCommentRequisite" rows="" cols=""></textarea></th>
							    </tr>
							  </tbody>
							</table>
				        </div>
			       	</div>
			       	<div class="row">
			       		<label id="btnCancel" type="submit" class="btn btn-warning">Cancelar</label>
                        <label id="btnProcess" type="submit" class="btn btn-success">Procesar</label>
			       	</div>
			    </form>
			</div>
		</div>
	   </div>
	 </div>
	</div>
</div>

<%-- Modal
<div id="divAddOwner" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
	  <form id="formAddOwner" action="" method="POST">
	    <div class="modal-header">
	      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
	      </button>
	      <h4 class="modal-title" id="myModalLabel2">Agregar Propietario</h4>
	    </div>
	    <div class="modal-body">
	      <div class="row">
            <div class="form-group col-sm-4">
                <input class="form-control" id="inputDocOwnerId" name="inputDocOwnerId" type="text" required
                placeholder="CI / Rif">
            </div>
            <div class="form-group col-sm-2">
                <button type="button" id="btnFindOwner" class="btn btn-primary"><spring:message text="Consultar"/></button><!--  code="btn.delete.title"  -->
            </div>
            <div class="form-group col-sm-6">
                <input class="form-control inputOwner" id="inputDocNameOwner" name="inputDocNameOwner" type="text" required
                placeholder="Nombre">
                <input id="inputDocIdOwner" name="inputDocIdOwner" type="hidden" value="0">
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label for="inputDocEmailOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Correo:"/></label>
                <input class="form-control inputOwner" id="inputDocEmailOwner" name="inputDocEmailOwner" type="text" required
                >
            </div>
            <div class="form-group col-sm-6">
                <label for="selDocNationalityOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Nacionalidad:"/></label>
                <select class="form-control inputOwner" name="selDocNationalityOwner" id="selDocNationalityOwner">
                     <option value="V" selected="selected">V</option>
                     <option value="E">E</option>
                 </select>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label for="inputDocPhoneOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Teléfono Hab.:"/></label>
                <input class="form-control inputOwner" id="inputDocPhoneOwner" name="inputDocPhoneOwner" type="text" required
                >
            </div>
            <div class="form-group col-sm-6">
                <label for="inputDocMobileOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Teléfono Celular:"/></label>
                <input class="form-control inputOwner" id="inputDocMobileOwner" name="inputDocMobileOwner" type="text" required
                >
            </div>
    	  </div>
	    </div>
	    <div class="modal-footer">
	      <button type="button" class="btn btn-default" data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></button>
	      <button type="button" id="btnAddDataOwner" class="btn btn-primary"><spring:message text="Enviar"/></button><!--  code="btn.delete.title"  -->
	    </div>
      </form>
    </div>
  </div>
</div>
--%>
 
<!--START SCRIPT-->
<script>
 	document.addEventListener("DOMContentLoaded", function(event) { 
 		var url = "/ordinance/"+$('#selIdZone').val();
		$('#selIdOrdinance').html('');
		$.ajax({
		   url: url,
		   data: {
		      format: 'json'
		   },
		   error: function() {		   
			   console.log('ajax -> /ordinance/'+$('#selIdZone').val()+', Ha ocurrido un error...');
		   },
		   dataType: 'json',
		   success: function(data) {
			   var i = 0;
			   var options ="";
		   
		   
			   while (i < data.length) {
				   options += "<option value='"+data[i].id_ordinance+"'>"+data[i].name_ordinance+"</option>";
				   i++;				
			   }
			   $('#selIdOrdinance').append(options);
		   },
		   type: 'GET'
		});
	});
</script>
<!--END SCRIPT-->
