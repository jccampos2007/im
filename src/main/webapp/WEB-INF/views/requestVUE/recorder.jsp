<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">
	<div class="col-md-12 col-sm-12 col-xs-12">
	 <div class="x_panel tile">
	   <div class="x_title">
		 <h2><spring:message code="requestVUE.page.title" text="Consulta Preliminar en Edificaciones"/></h2>
		 <div class="clearfix"></div>
	   </div>
	   <div class="x_content">
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<form id="formVUERecSearchCS" action="" method="POST">
			      <h4><spring:message code="lbl.title" text="Buscar N° de Solicitud"/></h4>
			        <div class="row">
				        <div class="form-group col-sm-4">
		              		<input class="form-control" name="inputVUERecRequestNroCS" id="inputVUERecRequestNroCS" type="text" readonly
			              	data-errormessage-value-missing="El n&uacute;mero de Solicitud Ciudadano Sucre no puede ser vacio" placeholder="N° Solicitud Ciudadano Sucre">
				        </div>
				        <div class="form-group col-sm-2">
				        	<button type="button" id="btnVUERecRequestSearch" class="btn btn-default disabled"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
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
	<div id="divVUEControlReport" class="col-md-12 col-sm-12 col-xs-12">
	 <div class="x_panel tile">
	   <div class="x_title">
		 <h2><spring:message code="requestVUE.page.title" text="Acta Control"/></h2>
		 <div class="clearfix"></div>
	   </div>
	   <div class="x_content">
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<form id="formVUERecControlReport" action="" method="POST">
					<div class="row">
				        <div class="form-group col-sm-4">
		              		<label for="inputVUERecNumberRequest" class="text-muted"><spring:message code="requestVUE.lbl.nroRequest" text="N° Solicitud"/></label>
			              	<input class="form-control" name="inputVUERecNumberRequest" id="inputVUERecNumberRequest" type="text" required>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="inputVUERecDateRequest" class="text-muted"><spring:message code="requestVUE.lbl.dateRequest" text="Fecha Solicitud"/></label>
							<div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
								<input id="inputVUERecDateRequest" class="form-control" size="16" type="text" value="" readonly required>
								<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				            </div>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="selVUERecIdTypeUse" class="text-muted"><spring:message code="requestVUE.lbl.typeUse" text="Uso Presentado"/></label>
			              	<select class="form-control" name="selVUERecIdTypeUse" id="selVUERecIdTypeUse">
								<c:forEach items="${typeUses}" var="typeUse">
									<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
								</c:forEach>
				            </select>
				        </div>
			       	</div>
					<div class="row">
				        <div class="form-group col-sm-6">
		              		<label for="inputVUERecNumberCatastro" class="text-muted"><spring:message code="requestVUE.lbl.numberCatastro" text="N° Catastro"/></label>
			              	<input class="form-control" name="inputVUERecNumberCatastro" id="inputVUERecNumberCatastro" type="text" required
			              	placeholder="N° Catastro Anterior">
				        </div>
				        <div class="form-group col-sm-6">
		              		<label for="inputVUERecNumberCatastroOld" class="text-muted"><spring:message code="requestVUE.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
			              	<input class="form-control" name="inputVUERecNumberCatastroOld" id="inputVUERecNumberCatastroOld" type="text"
			              	placeholder="N° Catastro Anterior">
				        </div>
			       	</div>
					<div class="row">
				        <div class="form-group col-sm-12">
		              		<label for="inputVUERecAdress" class="text-muted"><spring:message code="requestVUE.lbl.adress" text="Dirección"/></label>
		              		<textarea class="form-control"name="inputVUERecAdress" id="inputVUERecAdress" rows="3" required></textarea>
				        </div>
			       	</div>
					<div class="row">
				        <div class="form-group col-sm-6">
		              		<label for="name" class="text-muted"><spring:message code="requestVUE.lbl.responsable" text="Responsable"/></label>
			              	<input class="form-control" name="inputVUERecResponsable" id="inputVUERecResponsable" type="text"
			              	placeholder="Responsable">
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="requestVUE.lbl.responsableId" text="Cedula"/></label>
			              	<input class="form-control" name="inputVUERecResponsableId" id="inputVUERecResponsableId" type="text"
			              	placeholder="Responsable">
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="requestVUE.lbl.responsableCiv" text="CIV"/></label>
			              	<input class="form-control" name="inputVUERecResponsableCiv" id="inputVUERecResponsableCiv" type="text"
			              	placeholder="Responsable">
				        </div>
			       	</div>
					<div id="divOrdinance" class="row">
				        <div class="form-group col-sm-3">
		              		<label for="selIdZone" class="text-muted"><spring:message code="requestVUE.lbl.responsableId" text="Zona"/></label>
			              	<select class="form-control" name="selIdZone" id="selIdZone">
				              <c:forEach items="${zones}" var="zone">
								<option value="${zone.id_zone}">${zone.name_zone}</option>
							  </c:forEach>
				            </select>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="selIdOrdinance" class="text-muted"><spring:message code="requestVUE.lbl.responsable" text="Ordenanza"/></label>
			              	<select class="form-control" name="selIdOrdinance" id="selIdOrdinance"></select>
				        </div>
			       	</div>
					<div class="row">
				        <div class="form-group col-sm-4">
		              		<label for="inputVUERecFee" class="text-muted"><spring:message code="requestVUE.lbl.responsable" text="N° Comprobante:"/></label>
			              	<input class="form-control" name="inputRecFee" id="inputRecFee" type="text" required
			              	placeholder="Comprobante de Pago">
				        </div>
				        <div class="form-group col-sm-2">
		              		<label for="inputVUERecFee" class="text-muted"><spring:message code="requestVUE.lbl.responsable" text="VANSAT"/></label>
			              	<label id="btnCheckFee" class="form-control btn btn-primary" style="display: table-cell; vertical-align: bottom; float: none;">CONSULTAR
		              			<i class="glyphicon glyphicon-search" style="margin-left: 5px;"></i>
		              		</label>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="requestVUE.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" id="inputRecPaymentImput" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="requestVUE.lbl.datePayment" text="Fecha del pago"/></label>
			              	<input id="inputRecDatePayment" class="form-control" size="16" type="text" value="" readonly>
				        </div>
			       	</div>
					<div class="row">
				        <div class="form-group col-sm-12">
		              		<table id="tblVUERecRequestRequisite" class="table">
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
							        <th><input type="radio" value="yes" name="select16" /></th>
									<th><input type="radio" value="no" name="select16" /></th>
									<th><input type="radio" value="does_not_apply" name="select16" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Documento de Propiedad</th>
							        <th><input type="radio" value="yes" name="select17" /></th>
									<th><input type="radio" value="no" name="select17" /></th>
									<th><input type="radio" value="does_not_apply" name="select17" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Cédula Catastral actualizada a nombre del propietario actual</th>
							        <th><input type="radio" value="yes" name="select18" /></th>
									<th><input type="radio" value="no" name="select18" /></th>
									<th><input type="radio" value="does_not_apply" name="select18" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Contrato de Arrendamiento</th>
							        <th><input type="radio" value="yes" name="select19" /></th>
									<th><input type="radio" value="no" name="select19" /></th>
									<th><input type="radio" value="does_not_apply" name="select19" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Registro Mercantil</th>
							        <th><input type="radio" value="yes" name="select20" /></th>
									<th><input type="radio" value="no" name="select20" /></th>
									<th><input type="radio" value="does_not_apply" name="select20" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Solvencia Municipal o Estado en cero</th>
							        <th><input type="radio" value="yes" name="select21" /></th>
									<th><input type="radio" value="no" name="select21" /></th>
									<th><input type="radio" value="does_not_apply" name="select21" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Solvencia del profesional presentante</th>
							        <th><input type="radio" value="yes" name="select22" /></th>
									<th><input type="radio" value="no" name="select22" /></th>
									<th><input type="radio" value="does_not_apply" name="select22" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Cédula del propietario y profesional responsable</th>
							        <th><input type="radio" value="yes" name="select23" /></th>
									<th><input type="radio" value="no" name="select23" /></th>
									<th><input type="radio" value="does_not_apply" name="select23" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Solvencia de aseo urbano emitida por SERDECO.</th>
							        <th><input type="radio" value="yes" name="select24" /></th>
									<th><input type="radio" value="no" name="select24" /></th>
									<th><input type="radio" value="does_not_apply" name="select24" /></th>
							    </tr>
							    <tr>
							      <th scope="row">Solvencia del servicio público agua emanada del IMAS.</th>
							      <th><input type="radio" value="yes" name="select25" /></th>
									<th><input type="radio" value="no" name="select25" /></th>
									<th><input type="radio" value="does_not_apply" name="select25" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Poder notariado del Representante legal del propietario.</th>
							        <th><input type="radio" value="yes" name="select26" /></th>
									<th><input type="radio" value="no" name="select26" /></th>
									<th><input type="radio" value="does_not_apply" name="select26" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Aprobación y autorización por parte del Instituto de Patrimonio Cultural IPC.</th>
							        <th><input type="radio" value="yes" name="select27" /></th>
									<th><input type="radio" value="no" name="select27" /></th>
									<th><input type="radio" value="does_not_apply" name="select27" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Oficio de Asignación de Variables Urbanas Fundamentales o de la Constancia de Cumplimiento de variables urbanas fundamentales en edificaciones o copia de la carátula del permiso Clase A o B, según sea el caso</th>
							        <th><input type="radio" value="yes" name="select28" /></th>
									<th><input type="radio" value="no" name="select28" /></th>
									<th><input type="radio" value="does_not_apply" name="select28" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Comprobante de Cancelación de las Tasas por concepto de Revisión</th>
							        <th><input type="radio" value="yes" name="select29" /></th>
									<th><input type="radio" value="no" name="select29" /></th>
									<th><input type="radio" value="does_not_apply" name="select29" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Planos - Dos (02) ejemplares del levantamiento Arquitectónico</th>
							        <th><input type="radio" value="yes" name="select30" /></th>
									<th><input type="radio" value="no" name="select30" /></th>
									<th><input type="radio" value="does_not_apply" name="select30" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Planos - Un (01) Cd del levantamiento Arquitectónico en Autocad</th>
							        <th><input type="radio" value="yes" name="select31" /></th>
									<th><input type="radio" value="no" name="select31" /></th>
									<th><input type="radio" value="does_not_apply" name="select31" /></th>
							    </tr>
							    <tr>
							        <th scope="row">Planos - Dos  (02) memorias descriptivas</th>
							        <th><input type="radio" value="yes" name="select32" /></th>
									<th><input type="radio" value="no" name="select32" /></th>
									<th><input type="radio" value="does_not_apply" name="select32" /></th>
							    </tr>
							    <tr>
							      <th scope="row" colspan="4">OBSERVACIONES:</th>
							    </tr>
							    <tr>
							      <th scope="row" colspan="4"><textarea id="taVUERecCommentRequisite" rows="" cols=""></textarea></th>
							    </tr>
							  </tbody>
							</table>
				        </div>
			       	</div>
			       	<div class="row">
			       		<label id="btnVUERecCancel" type="submit" class="btn btn-warning">Cancelar</label>
                        <label id="btnVUERecProcess" type="submit" class="btn btn-success">Procesar</label>
			       	</div>
			    </form>
			</div>
		</div>
	   </div>
	 </div>
	</div>
</div>
 
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
