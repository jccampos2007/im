<!-- abreviación Doc -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">
    <input type="hidden" name="opt-action" id="corp-opt-action" value="${action}"/>
    <input type="hidden" name="opt-message" id="corp-opt-message" value="${message}"/>
    <input type="hidden" name="opt-title" id="corp-opt-title" value="${title}"/>
    <input type="hidden" id="allow-corp-query" name="allow-corp-query" value="${page.canConsult}">
    <div class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
		 <h2><spring:message code="requestVUE.page.title" text="Consulta Preliminar en Edificaciones"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="form-corporate" action="/corporate" method="POST">
                  <h4><spring:message code="lbl.title" text="Buscar N° de Solicitud"/></h4>
                    <div class="row">
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputVUETecSearchNumberRequest" id="inputVUETecSearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputVUETecSearchResponsable" id="inputVUETecSearchResponsable" type="text" placeholder="Nombre Responsable">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputVUETecSearchDateRequestFrom" id="inputVUETecSearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputVUETecSearchDateRequestTo" id="inputVUETecSearchDateRequestTo" type="text" placeholder="Fecha Hasta">
                      </div>
                      <div class="form-group col-sm-2">
                        <button type="button" id="btnTecSearch" class="btn btn-default"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
                          <i class="glyphicon glyphicon-search"></i>
                        </button>
                      </div>
                    </div>
                </form>
            </div>
        </div>
       </div>
     </div>
    </div>

    <div id="divVUETecInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.tec.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblVUETecInbox"  class="table table-striped">
            		<thead>
            			<tr>
            				<td>id_request</td>
            				<td>N° de Solicitud</td>
            				<td>Responsable</td>
            				<td>Acción</td>
            			</tr>
            		</thead>
            		<tbody></tbody>
            	</table>
            </div>
        </div>
       </div>
     </div>
    </div>

    <div id="divVUETecInboxTwo" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.tec.panel.titleInbox" text="En revisión"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblVUETecInboxTwo"  class="table table-striped">
            		<thead>
            			<tr>
            				<td>id_request</td>
            				<td>N° de Solicitud</td>
            				<td>Responsable</td>
            				<td>Acción</td>
            			</tr>
            		</thead>
            		<tbody></tbody>
            	</table>
            </div>
        </div>
       </div>
     </div>
    </div>

    <div id="divTecControlReport" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.tec.panel.titleControlReport" text="Acta Control"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="formTecControlReport" action="" method="POST">
                    <div class="row">
                        <div class="form-group col-sm-4">
                        	<input id="inputVUETecIdRequest" name="inputVUETecIdRequest" type="hidden" required>
	                        <label for="inputVUETecNumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
	                        <input class="form-control" id="inputVUETecNumberRequest" name="inputVUETecNumberRequest" type="text" required>
	                        <input name="inputVUETecIdOrdinance" id="inputVUETecIdOrdinance" type="hidden">
	                        <input name="inputVUETecIdResponsibleOfficial" id="inputVUETecIdResponsibleOfficial" type="hidden">
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="inputVUETecDateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
                            <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
								<input id="inputVUETecDateRequest" class="form-control" size="16" type="text" value="" readonly required>
								<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				            </div>
                        </div>
                        <div class="form-group col-sm-4">
                        	<label for="selTecIdTypeUse" class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Uso Presentado"/></label>
                            <select class="form-control" id="selTecIdTypeUse" name="selTecIdTypeUse">
                              <c:forEach items="${typeUses}" var="typeUse">
								<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
							  </c:forEach>
			                </select>
                        </div>
                       </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputVUETecNumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
                              <input class="form-control" id="inputVUETecNumberCatastro" name="inputVUETecNumberCatastro" type="text" required
                              placeholder="N° Catastro Anterior">
                        </div>
                        <div class="form-group col-sm-6">
                              <label for="inputVUETecNumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
                              <input class="form-control" id="inputVUETecNumberCatastroOld" name="inputVUETecNumberCatastroOld" type="text" placeholder="N° Catastro Anterior">
                        </div>
                      </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <label for="inputVUETecAdress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
                              <textarea class="form-control" id="inputVUETecAdress" rows="3" required></textarea>
                        </div>
                    </div>                    
					<div class="row">
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
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="N° Comprobante:"/></label>
			              	<input class="form-control" name="inputVUETecFee" id="inputVUETecFee" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputVUETecPaymentImput" id="inputVUETecPaymentImput" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha del pago"/></label>
			              	<input id="inputVUETecDatePayment" class="form-control" size="16" type="text" value="" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="inputVUETecPaymentOutput" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputVUETecPaymentOutput" id="inputVUETecPaymentOutput" type="text" required>
				        </div>
			       	</div>
			       	
                    <div class="row"><!-- selTecIdResponsibleOfficial -->
                        <div class="form-group col-sm-6">
                              <label for="inputVUETecResponsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
                              <input class="form-control" name="inputVUETecResponsable" id="inputVUETecResponsable" type="text" required
                              placeholder="Responsable">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputVUETecResponsableId" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
                              <input class="form-control" name="inputVUETecResponsableId" id="inputVUETecResponsableId" type="text" required
                              placeholder="Responsable">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputVUETecResponsableCiv" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
                              <input class="form-control" name="inputVUETecResponsableCiv" id="inputVUETecResponsableCiv" type="text" required
                              placeholder="Responsable">
                        </div>
                    </div>
                    
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
							      <th>ACCIONES</th>
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
                    
                    <div class="row"><!-- selTecIdResponsibleOfficial -->
                        <div class="form-group col-sm-3">
                              <input class="form-control" name="inputVUERequestParent" id="inputVUERequestParent" type="text" required
                              placeholder="Solicitud de tramite VUF">
                        </div>
                        <div class="form-group col-sm-3">
							<label id="btnVUERequestParent" class="form-control btn btn-primary" style="display: table-cell; vertical-align: bottom; float: none;">CONSULTAR
							<i class="glyphicon glyphicon-search" style="margin-left: 5px;"></i>
							</label>
                        </div>
                        <div class="form-group col-sm-6">
                        	<input id="inputVUEIdRequestParent" type="hidden">
							<label id="lblVUESuccessful" style="display: table-cell; vertical-align: bottom; float: none;"></label>
                        </div>
                    </div>
			       	
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <table id="tblTecRequestRequisite" class="table">
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
                                  <th>
                                  	<input type="radio" id="chkSelectAllPending" name="selectAll" />PENDIENTE</th>
                                </tr>
                              </thead>
                              <tbody>
                                <tr id="16" class="requisite">
				                    <th scope="row">Solicitud de consulta preliminar
				                    <input id="requestRequisite16" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select16" /></th>
				                    <th><input type="radio" value="no" name="select16" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select16" /></th>
				                    <th><input type="radio" value="pending" name="select16" /></th>
				                  </tr>
				                  <tr id="17" class="requisite">
				                    <th scope="row">Tecumento de Propiedad
				                    <input id="requestRequisite17" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select17" /></th>
				                    <th><input type="radio" value="no" name="select17" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select17" /></th>
				                    <th><input type="radio" value="pending" name="select17" /></th>
				                  </tr>
				                  <tr id="18" class="requisite">
				                    <th scope="row">Cédula Catastral actualizada a nombre del propietario actual
				                    <input id="requestRequisite18" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select18" /></th>
				                    <th><input type="radio" value="no" name="select18" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select18" /></th>
				                    <th><input type="radio" value="pending" name="select18" /></th>
				                  </tr>
				                  <tr id="19" class="requisite">
				                    <th scope="row">Contrato de Arrendamiento
				                    <input id="requestRequisite19" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select19" /></th>
				                    <th><input type="radio" value="no" name="select19" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select19" /></th>
				                    <th><input type="radio" value="pending" name="select19" /></th>
				                  </tr>
				                  <tr id="20" class="requisite">
				                    <th scope="row">Registro Mercantil
				                    <input id="requestRequisite20" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select20" /></th>
				                    <th><input type="radio" value="no" name="select20" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select20" /></th>
				                    <th><input type="radio" value="pending" name="select20" /></th>
				                  </tr>
				                  <tr id="21" class="requisite">
				                    <th scope="row">Solvencia Municipal o Estado en cero
				                    <input id="requestRequisite21" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select21" /></th>
				                    <th><input type="radio" value="no" name="select21" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select21" /></th>
				                    <th><input type="radio" value="pending" name="select21" /></th>
				                  </tr>
				                  <tr id="22" class="requisite">
				                    <th scope="row">Solvencia del profesional presentante
				                    <input id="requestRequisite22" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select22" /></th>
				                    <th><input type="radio" value="no" name="select22" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select22" /></th>
				                    <th><input type="radio" value="pending" name="select22" /></th>
				                  </tr>
				                  <tr id="23" class="requisite">
				                    <th scope="row">Cédula del propietario y profesional responsable
				                    <input id="requestRequisite23" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select23" /></th>
				                    <th><input type="radio" value="no" name="select23" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select23" /></th>
				                    <th><input type="radio" value="pending" name="select23" /></th>
				                  </tr>
				                  <tr id="24" class="requisite">
				                    <th scope="row">Solvencia de aseo urbano emitida por SERDECO.
				                    <input id="requestRequisite24" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select24" /></th>
				                    <th><input type="radio" value="no" name="select24" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select24" /></th>
				                    <th><input type="radio" value="pending" name="select24" /></th>
				                  </tr>
				                  <tr id="25" class="requisite">
				                    <th scope="row">Solvencia del servicio público agua emanada del IMAS.
				                    <input id="requestRequisite25" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select25" /></th>
				                    <th><input type="radio" value="no" name="select25" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select25" /></th>
				                    <th><input type="radio" value="pending" name="select25" /></th>
				                  </tr>
				                  <tr id="26" class="requisite">
				                    <th scope="row">Poder notariado del Representante legal del propietario.
				                    <input id="requestRequisite26" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select26" /></th>
				                    <th><input type="radio" value="no" name="select26" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select26" /></th>
				                    <th><input type="radio" value="pending" name="select26" /></th>
				                  </tr>
				                  <tr id="27" class="requisite">
				                    <th scope="row">Aprobación y autorización por parte del Instituto de Patrimonio Cultural IPC.
				                    <input id="requestRequisite27" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select27" /></th>
				                    <th><input type="radio" value="no" name="select27" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select27" /></th>
				                    <th><input type="radio" value="pending" name="select27" /></th>
				                  </tr>
				                  <tr id="28" class="requisite">
				                    <th scope="row">Oficio de Asignación de Variables Urbanas Fundamentales o de la Constancia de Cumplimiento de variables urbanas fundamentales en edificaciones o copia de la carátula del permiso Clase A o B, según sea el caso
				                    <input id="requestRequisite28" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select28" /></th>
				                    <th><input type="radio" value="no" name="select28" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select28" /></th>
				                    <th><input type="radio" value="pending" name="select28" /></th>
				                  </tr>
				                  <tr id="29" class="requisite">
				                    <th scope="row">Oficio de Asignación de Variables Urbanas Fundamentales o de la Constancia de Cumplimiento de variables urbanas fundamentales en edificaciones o copia de la carátula del permiso Clase A o B, según sea el caso
				                    <input id="requestRequisite29" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select29" /></th>
				                    <th><input type="radio" value="no" name="select29" /></th>
				                    <th><input type="radio" value="does_not_apply" name="select29" /></th>
				                    <th><input type="radio" value="pending" name="select29" /></th>
				                  </tr>
                                <tr id="30" class="requisite">
                                    <th scope="row">Planos - Dos (02) ejemplares del levantamiento Arquitectónico
                                  		<input id="requestRequisite30" type="hidden">
                                  		
										<div class="row">
					                        <div class="col-sm-8">
									            <div class="input-group">
									                <label class="input-group-btn">
									                    <span class="btn btn-primary">
									                        <i class="glyphicon glyphicon-paperclip"></i> Buscar&hellip; <input name="filePlano14Pdf" type="file" style="display: none;">
									                    </span>
									                </label>
									                <input name="inputPdfPlano30" type="text" class="form-control" readonly>
									            </div>
					                        </div>
					                        
											<div class=" col-sm-4">
					                        	<label id="btnTecClearPlano30" class="btn btn-default"  data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></label>
												<label id="btnTecUploadPlano30" class="btn btn-primary"><spring:message code="btn.upload.controlReport.title" text="Subir Archivo"/></label>
											</div>
										</div>
										
				                    </th>
                                    <th><input type="radio" value="yes" name="select30" /></th>
									<th><input type="radio" value="no" name="select30" /></th>
									<th><input type="radio" value="does_not_apply" name="select30" /></th>
									<th><input type="radio" value="pending" name="select30" /></th>
                                </tr>
                                <tr id="31" class="requisite">
                                    <th scope="row">Planos - Un (01) Cd del levantamiento Arquitectónico en Autocad
                                  		<input id="requestRequisite31" type="hidden">    
                                  		                              		
				                        <div class="row">
					                        <div class="col-sm-8">
									            <div class="input-group">
									                <label class="input-group-btn">
									                    <span class="btn btn-primary">
									                        <i class="glyphicon glyphicon-paperclip"></i> Buscar&hellip; <input name="filePlano15Pdf" type="file" style="display: none;">
									                    </span>
									                </label>
									                <input name="inputPdfPlano31" type="text" class="form-control" readonly>
									            </div>
					                        </div>
					                        
											<div class=" col-sm-4">
					                        	<label id=" btnTecClearPlano31" class="btn btn-default"  data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></label>
												<label id="btnTecUploadPlano31" class="btn btn-primary"><spring:message code="btn.upload.controlReport.title" text="Subir Archivo"/></label>
											</div>
										</div>
										
                        			</th>
                                    <th><input type="radio" value="yes" name="select31" /></th>
									<th><input type="radio" value="no" name="select31" /></th>
									<th><input type="radio" value="does_not_apply" name="select31" /></th>
									<th><input type="radio" value="pending" name="select31" /></th>
                                </tr>
                                <tr id="32" class="requisite">
                                    <th scope="row">Planos - Dos  (02) memorias descriptivas
                                  		<input id="requestRequisite32" type="hidden">    
                                  		                              		
				                        <div class="row">
					                        <div class="col-sm-8">
									            <div class="input-group">
									                <label class="input-group-btn">
									                    <span class="btn btn-primary">
									                        <i class="glyphicon glyphicon-paperclip"></i> Buscar&hellip; <input name="filePlano15Pdf" type="file" style="display: none;">
									                    </span>
									                </label>
									                <input name="inputPdfPlano32" type="text" class="form-control" readonly>
									            </div>
					                        </div>
					                        
											<div class=" col-sm-4">
					                        	<label id=" btnTecClearPlano32" class="btn btn-default"  data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></label>
												<label id="btnTecUploadPlano32" class="btn btn-primary"><spring:message code="btn.upload.controlReport.title" text="Subir Archivo"/></label>
											</div>
										</div>
										
                        			</th>
                                    <th><input type="radio" value="yes" name="select32" /></th>
									<th><input type="radio" value="no" name="select32" /></th>
									<th><input type="radio" value="does_not_apply" name="select32" /></th>
									<th><input type="radio" value="pending" name="select32" /></th>
                                </tr>
                                <tr>
                                  <th scope="row" colspan="5">OBSERVACIONES:</th>
                                </tr>
                                <tr>
                                  <th scope="row" colspan="5"><textarea id="taTecCommentRequisite" rows="" cols=""></textarea></th>
                                </tr>
                              </tbody>
                            </table>
                        </div>
                    </div>
                    
                    
                   	<div class="row">                   		
                        
						<div class=" col-sm-3">
                        	<label id="btnVUETecDownloadExcel" class="btn btn-default" ><spring:message code="btn.excel" text="Excel"/></label>
						</div>
                        <div class="col-sm-6">
				            <div class="input-group">
				                <label class="input-group-btn">
				                    <span class="btn btn-primary">
				                        <i class="glyphicon glyphicon-paperclip"></i> Buscar&hellip; <input name="filePlano15Pdf" type="file" style="display: none;">
				                    </span>
				                </label>
				                <input name="inputVUETecUploadExcel" type="text" class="form-control" readonly>
				            </div>
                        </div>
                        
						<div class=" col-sm-3">
                        	<label id=" btnVUETecClearExcel" class="btn btn-default"  data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></label>
							<label id="btnVUETecUploadExcel" class="btn btn-primary"><spring:message code="btn.upload.controlReport.title" text="Subir Archivo"/></label>
						</div>
					</div>
                    
                    
					<div class="row">
				        <div class="form-group col-sm-12">
				        	<input type="radio" value="0" id="radioNotice" name="notice" />
							<label for="radioNotice" id="btnVUETecNotice">Sin Oficio Motivado / Pendiente</label>
				        	<input type="radio" value="1" id="radioNoticeMotivated" name="notice" />
				        	<label for="radioNoticeMotivated" id="btnVUETecNoticeMotivated">Oficio Motivado</label>
				        	<input type="radio" value="2" id="radioNoticePending" name="notice" />		              		
							<label for="radioNoticePending" id="btnVUETecNoticePending">Oficio Pendiente</label>
				        </div>
			       	</div>
			       	
			       	<div id="divNoticeMotivated" class="row">
				       <div class="x_title">
				         <h2><spring:message code="requestVUF.tec.panel.titleControlReport" text="Oficio Motivado"/></h2>
				         <div class="clearfix"></div>
				       </div>
				        <div class="form-group col-sm-3">
		              		<label for="inputTecVUEAreaAccused" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Área acusada:"/></label>
                        	<input class="form-control" name="inputTecVUEAreaAccused" id="inputTecVUEAreaAccused" type="text" required>
				        </div>
				        <div class="form-group col-sm-9">
				        	<label class="text-muted"> </label>
				        </div>
				        <div class="x_title  col-sm-12">
					        <h2><spring:message code="requestVUF.tec.panel.titleControlReport" text="Datos de Zonificación"/></h2>
					        <div class="clearfix"></div>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="inputTecVUENameZoning" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Nombre Zonificación:" /></label>
			              	<input class="form-control" name="inputTecVUENameZoning" id="inputTecVUENameZoning" type="text" required>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="inputTecVUENumberGacetaZoning" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="N° de Gaceta:"/></label>
			              	<input class="form-control" name="inputTecVUENumberGacetaZoning" id="inputTecVUENumberGacetaZoning" type="text" required>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="inputTecVUEDateGacetaZoning" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Fecha de Gaceta:" /></label>
			              	<div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
								<input id="inputTecVUEDateGacetaZoning" class="form-control" size="16" type="text" value="" readonly required>
								<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				            </div>
				        </div>
				        <div class="form-group col-sm-12">
		              		<label for="inputTecVUESectionZoning" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Sector:"/></label>
			              	<input class="form-control" name="inputTecVUESectionZoning" id="inputTecVUESectionZoning" type="text" required>
				        </div>
				        <div class="form-group col-sm-12">
		              		<label for="inputTecVUEDescriptionParcel" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Caracteristica Parcela:" /></label>
			              	<textarea class="form-control vn" name="inputTecVUEDescriptionParcel" id="inputTecVUEDescriptionParcel" rows="" cols="" style="" required></textarea>
				        </div>
				        <div class="form-group col-sm-12">
		              		<div class="well">
                                  <p id="pTecVUEPreview">La parcela se encuentra zonificada como <strong>{nombre_zonificacion}</strong> de conformidad con lo señalado en el plano anexo a la Ordenanza de Zonificación para el Sector <strong>{sector}</strong>, N° <strong>{nro_gaceta}</strong> Extraordinario, publicada en Gaceta Municipal en fecha <strong>{fecha_gaceta}</strong>. De igual manera, la referida parcela presenta <strong>{caracteristica_parcela}</strong>.</p>
                            </div>
				        </div>
				        
				        <div class="x_title  col-sm-12">
					        <h2><spring:message code="requestVUF.tec.panel.titleControlReport" text="Datos de Variables Urbanas establecida"/></h2>
					        <div class="clearfix"></div>
				        </div>
				        <div class="form-group col-sm-12">
		              		<label for="selTecVUEIdVariableNumeral" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Variable numeral:"/></label>
			              	<select class="form-control" name="selTecVUEIdVariableNumeral" id="selTecVUEIdVariableNumeral">
								<c:forEach items="${variablesNumeral}" var="variableNumeral">
									<option value="${variableNumeral.id_variable_numeral}">${variableNumeral.name_variable_numeral}</option>
								</c:forEach>
			              	</select>
                 		</div>
				        <div class="form-group col-sm-12">
		              		<label for="taTecVUECommentRequestVariable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Comentario variable numeral:"/></label>
			              	<textarea class="form-control vn" id="taTecVUECommentRequestVariable" rows="" cols=""style="width:100%;"></textarea>
				        </div>
				        <div class="form-group col-sm-12">
		              		<label for="inputTecVUEDateGacetaZoning" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Conclusión variable numeral:" /></label>
			              	<textarea class="form-control vn" id="taTecVUEConclusionRequestVariable" rows="" cols=""style="width:100%;"></textarea>
				        </div>
				        
				        
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Variables Urbanas" /></label>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Reglamentación" /></label>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Presentado" /></label>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Diferencia (Exceso/Déficit)" /></label>
				        </div>
				        
				        
				        
				        <div class="form-group col-sm-3">
		              		<input class="form-control vn" name="inputTecVUENameVariableRegulation" id="inputTecVUENameVariableRegulation" type="text" placeholder="Nombre variable reglamento" required>
				        </div>
				        <div class="form-group col-sm-1">
			              	<input class="form-control vn" name="inputTecVUEPercentageRegulation" id="inputTecVUEPercentageRegulation" type="text" placeholder="%" required>
				        </div>
				        <div class="form-group col-sm-2">
			              	<input class="form-control vn" name="inputTecVUEValueRegulation" id="inputTecVUEValueRegulation" type="text" placeholder="Reglamentación" required>
				        </div>
				        <div class="form-group col-sm-1">
			              	<input class="form-control vn" name="inputTecVUEPercentagePresentee" id="inputTecVUEPercentagePresentee" type="text" placeholder="%" required>
				        </div>
				        <div class="form-group col-sm-2">
			              	<input class="form-control vn" name="inputTecVUEValuePresentee" id="inputTecVUEValuePresentee" type="text" placeholder="Presentado" required>
				        </div>
				        <div class="form-group col-sm-1">
			              	<input class="form-control vn" name="inputTecVUEPercentageDifference" id="inputTecVUEPercentageDifference" type="text"  placeholder="%" required>
				        </div>
				        <div class="form-group col-sm-2">
			              	<input class="form-control vn" name="inputTecVUEValueDifference" id="inputTecVUEValueDifference" type="text" placeholder="Diferencia" required>
				        </div>
				        <div class="form-group col-sm-3">
                              <label id="btnTecVUEAddRequestVariableNumeral" class="form-control btn btn-primary">Agregar Variable
                                  <i class="glyphicon glyphicon-plus" style="margin-left: 5px;"></i>
                              </label>                        	
				        </div>
				        
				        <div class="form-group col-sm-12">
                        	<table id="tableTecVUERequestVariableNumeral" class="table">
							  <thead>
							    <tr>
                                  <th>Variable del numeral</th>
							      <th>Variable urbana</th>
							      <th>Reglamentación</th>
							      <th>Presentado</th>
							      <th>Diferencia</th>
							      <th>ACCIONES</th>
							    </tr>
							  </thead>
							  <tbody></tbody>
							</table>
                        </div>
				        <div class="form-group col-sm-3">
                              <label id="btnTecVUEAddRequestNoticeMotive" class="form-control btn btn-primary">Guardar Oficio
                                  <i class="glyphicon glyphicon-plus" style="margin-left: 5px;"></i>
                              </label>                        	
				        </div>
				        <div class="form-group col-sm-3">
                              <label id="btnTecVUEPrintRequestNoticeMotive" class="form-control btn btn-primary">Imprimir
                                  <i class="glyphicon glyphicon-print" style="margin-left: 5px;"></i>
                              </label>                        	
				        </div>
				        
			       	</div>	
			       	
			       	<div id="divNoticePending" class="row">
				       <div class="x_title">
				         <h2><spring:message code="requestVUF.tec.panel.titleControlReport" text="Oficio de Pendiente"/></h2>
				         <div class="clearfix"></div>
				       </div>
				        <div class="form-group col-sm-3">
		              		<label for="inputTecVUEAreaAccusedPending" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Área acusada:"/></label>
                        	<input class="form-control" name="inputTecVUEAreaAccusedPending" id="inputTecVUEAreaAccusedPending" type="text" required>
				        </div>
				        <div class="form-group col-sm-9">
				        	<label class="text-muted"> </label>
				        </div>
				        <div class="x_title  col-sm-12">
					        <h2><spring:message code="requestVUF.tec.panel.titleControlReport" text="Datos de Zonificación"/></h2>
					        <div class="clearfix"></div>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="inputTecVUENameZoningPending" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Nombre Zonificación:"/></label>
			              	<input class="form-control" name="inputTecVUENameZoningPending" id="inputTecVUENameZoningPending" type="text" required>
				        </div>
				        <div class="form-group col-sm-12">
		              		<label for="inputTecVUEDescriptionPlane" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Descripción de plano anexo:" /></label>
			              	<textarea class="form-control vn" name="inputTecVUEDescriptionPlane" id="inputTecVUEDescriptionPlane" rows="" cols="" required></textarea>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="inputTecVUENoticeRequestPrevious" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="N° Solicitud VUF:"/></label>
			              	<input class="form-control" name="inputTecVUENoticeRequestPrevious" id="inputTecVUENoticeRequestPrevious" type="text" required>
				        </div>
				        <div class="form-group col-sm-4">
		              		<label for="inputTecVUEDateNoticeRequestPrevious" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Fecha Solicitud VUF:"/></label>
			              	<div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
								<input id="inputTecVUEDateNoticeRequestPrevious" class="form-control" size="16" type="text" value="" readonly required>
								<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				            </div>
				        </div>
				        <div class="form-group col-sm-12">
		              		<div class="well">
                                  <p id="pTecVUEPreview">La parcela se encuentra zonificada como <strong>{Nombre Zonificación}</strong> de conformidad con lo señalado en el plano anexo a <strong>{descripción de Plano}</strong>,
                                  debiendo regirse para su desarrollo por todas aquellas disposiciones que le sean aplicables de la ordenanza antes señalada. Presenta oficio <strong>{N° Solicitud VUF} </strong>
                                  de fecha <strong>{Fecha Solicitud VUF}</strong> referente a consulta preliminar de de variables Urbanas fundamentales emanado de la Dirección de Ingeniería y Planeamiento Urbano Local.</p>
                            </div>
				        </div>
				        <div class="form-group col-sm-12">
		              		<label for="taTecVUEDescriptionObservationPending" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Observaciones:"/></label>
			              	<textarea class="form-control vn" id="taTecVUEDescriptionObservationPending" rows="" cols=""style="width:100%;"></textarea>
				        </div>
				        <div class="form-group col-sm-3">
                              <label id="btnTecVUEAddRequestObservationPending" class="form-control btn btn-primary">Agregar Observación
                                  <i class="glyphicon glyphicon-plus" style="margin-left: 5px;"></i>
                              </label>                        	
				        </div>
				        
				        <div class="form-group col-sm-12">
                        	<table id="tableTecVUERequestObservationPending" class="table">
							  <thead>
							    <tr>
                                  <th>Observaciones</th>
							      <th>ACCIONES</th>
							    </tr>
							  </thead>
							  <tbody></tbody>
							</table>
                        </div>
				        <div class="form-group col-sm-3">
                              <label id="btnTecVUEAddRequestNoticePending" class="form-control btn btn-primary">Guardar Oficio
                                  <i class="glyphicon glyphicon-plus" style="margin-left: 5px;"></i>
                              </label>                        	
				        </div>
				        <div class="form-group col-sm-3">
                              <label id="btnTecVUEPrintRequestNoticePending" class="form-control btn btn-primary">Imprimir
                                  <i class="glyphicon glyphicon-print" style="margin-left: 5px;"></i>
                              </label>                        	
				        </div>
				        
			       	</div>			       	
			       	
					<div class="row">
						<!-- <label id="btnTecDownload" class="btn btn-primary">
                        		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar PDF"/>
                       	</label> -->
						<label id="btnVUETecCancelControlReport" class="btn btn-warning">Cancelar</label>
						<label id="btnVUETecSaveControlReport" class="btn btn-success">Guardar</label>
						<label id="btnVUETecProcessControlReport" class="btn btn-primary">Procesar</label>
					</div>
				</form>
            </div>
        </div>
       </div>
     </div>
    </div>
</div>

<%-- Modal --%>
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
                <input class="form-control" id="inputAddOwnerId" name="inputAddOwnerId" type="text" required
                placeholder="CI / Rif">
            </div>
            <div class="form-group col-sm-2">
                <button type="button" id="btnFindOwner" class="btn btn-primary"><spring:message text="Consultar"/></button><!--  code="btn.delete.title"  -->
            </div>
            <div class="form-group col-sm-6">
                <input class="form-control inputOwner" id="inputAddNameOwner" name="inputAddNameOwner" type="text" required
                placeholder="Nombre">
                <input id="inputAddIdOwner" name="inputAddIdOwner" type="hidden" value="0">
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label for="inputAddEmailOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Correo:"/></label>
                <input class="form-control inputOwner" id="inputAddEmailOwner" name="inputAddEmailOwner" type="text" required
                >
            </div>
            <div class="form-group col-sm-6">
                <label for="selAddNationalityOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Nacionalidad:"/></label>
                <select class="form-control inputOwner" name="selAddNationalityOwner" id="selAddNationalityOwner">
                     <option value="V" selected="selected">V</option>
                     <option value="E">E</option>
                 </select>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label for="inputAddPhoneOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Teléfono Hab.:"/></label>
                <input class="form-control inputOwner" id="inputAddPhoneOwner" name="inputAddPhoneOwner" type="text" required
                >
            </div>
            <div class="form-group col-sm-6">
                <label for="inputAddMobileOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Teléfono Celular:"/></label>
                <input class="form-control inputOwner" id="inputAddMobileOwner" name="inputAddMobileOwner" type="text" required
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

<%-- Modal --%>
<div id="divEditOwner" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
	  <form id="formEditOwner" action="" method="POST">
	    <div class="modal-header">
	      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
	      </button>
	      <h4 class="modal-title" id="myModalLabel2">Editar Propietario</h4>
	    </div>
	    <div class="modal-body">
	      <div class="row">
            <div class="form-group col-sm-4">
                <input class="form-control inputOwner" id="inputEditOwnerId" name="inputEditOwnerId" type="text" required
                placeholder="CI / Rif">
            </div>
            <div class="form-group col-sm-8">
                <input class="form-control" id="inputEditNameOwner" name="inputEditNameOwner" type="text" required
                placeholder="Nombre">
                <input id="inputEditIdOwner" name="inputEditIdOwner" type="hidden" value="0">
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label for="inputEditEmailOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Correo:"/></label>
                <input class="form-control" id="inputEditEmailOwner" name="inputEditEmailOwner" type="text" required
                >
            </div>
            <div class="form-group col-sm-6">
                <label for="selEditNationalityOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Nacionalidad:"/></label>
                <select class="form-control" name="selEditNationalityOwner" id="selEditNationalityOwner">
                     <option value="V" selected="selected">V</option>
                     <option value="E">E</option>
                 </select>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label for="inputEditPhoneOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Teléfono Hab.:"/></label>
                <input class="form-control" id="inputEditPhoneOwner" name="inputEditPhoneOwner" type="text" required
                >
            </div>
            <div class="form-group col-sm-6">
                <label for="inputEditMobileOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Teléfono Celular:"/></label>
                <input class="form-control" id="inputEditMobileOwner" name="inputEditMobileOwner" type="text" required
                >
            </div>
    	  </div>
	    </div>
	    <div class="modal-footer">
	      <button type="button" class="btn btn-default" data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></button>
	      <button type="button" id="btnEditDataOwner" class="btn btn-primary"><spring:message text="Enviar"/></button><!--  code="btn.delete.title"  -->
	    </div>
      </form>
    </div>
  </div>
</div>

<%-- Modal --%>
<div id="divTecReview" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
	  <form id="formTecRvAssignOfficial" action="" method="POST">
	    <div class="modal-header">
	      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
	      </button>
	      <h4 class="modal-title" id="myModalLabel2">Revisión Técnica</h4>
	    </div>
	    <div class="modal-body">
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.numberRequest" text="N° Solicitud:"/></label>
                <input class="form-control" id="inputVUETecRvNumberRequest" type="text" readonly>
                <input id="inputVUETecRvIdRequest" type="hidden" value="0">                
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Facha:"/></label>
                <input class="form-control" id="inputVUETecRvDateRequest" name="inputVUETecRvDateRequest" type="text" readonly>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Tipo de Uso:"/></label>
                <select class="form-control" id="selTecRvIdTypeUse" name="selTecRvIdTypeUse">
                    <c:forEach items="${typeUses}" var="typeUse">
						<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
					</c:forEach>
	            </select>
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro:"/></label>
                <input class="form-control" id="inputVUETecRvNumberCatastro" type="text" readonly>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable:"/></label>
                <input class="form-control" id="inputVUETecRvResponsable" type="text" readonly>
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="CI / Rif:"/></label>
                <input class="form-control" id="inputVUETecRvResponsableId" type="text" readonly>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.address" text="Dirección:"/></label>
                <input class="form-control" id="inputVUETecRvAddress" type="text" readonly>
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.responsibleOfficial" text="Asignar Tecnico:"/></label>
                <select class="form-control" id="selTecRvIdResponsibleOfficial">
                    <c:forEach items="${responsibleOfficial}" var="official">
						<option value="${official.id_user_session}">${official.username}</option>
					</c:forEach>
                </select>
	        </div>
    	  </div>
	    </div>
	    <div class="modal-footer">
	      <button type="button" class="btn btn-default" data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></button>
	      <button type="button" id="btnVUETecReview" class="btn btn-primary"><spring:message text="Revisión"/></button><!--  code="btn.delete.title"  -->
	    </div>
      </form>
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