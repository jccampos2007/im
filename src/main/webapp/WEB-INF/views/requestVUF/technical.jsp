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
         <h2><spring:message code="requestVUF.page.title" text="Consulta Preliminar de variables urbanas fundamentales"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="form-corporate" action="/corporate" method="POST">
                  <h4><spring:message code="lbl.title" text="Buscar N° de Solicitud"/></h4>
                    <div class="row">
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputTecSearchNumberRequest" id="inputTecSearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputTecSearchResponsable" id="inputTecSearchResponsable" type="text" placeholder="Nombre Responsable">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputTecSearchDateRequestFrom" id="inputTecSearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputTecSearchDateRequestTo" id="inputTecSearchDateRequestTo" type="text" placeholder="Fecha Hasta">
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

    <div id="divTecInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.tec.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblTecInbox"  class="table table-striped">
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

    <div id="divTecInboxTwo" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.tec.panel.titleInbox" text="En revisión"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblTecInboxTwo"  class="table table-striped">
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
                        	<input id="inputTecIdRequest" name="inputTecIdRequest" type="hidden" required>
	                        <label for="inputTecNumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
	                        <input class="form-control" id="inputTecNumberRequest" name="inputTecNumberRequest" type="text" required>
	                        <input name="inputTecIdOrdinance" id="inputTecIdOrdinance" type="hidden">
	                        <input name="inputTecIdResponsibleOfficial" id="inputTecIdResponsibleOfficial" type="hidden">
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="inputTecDateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
                            <input class="form-control" id="inputTecDateRequest" name="inputTecDateRequest" type="text" required
                            placeholder="DD/MM/AAAA">
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
                              <label for="inputTecNumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
                              <input class="form-control" id="inputTecNumberCatastro" name="inputTecNumberCatastro" type="text" required
                              placeholder="N° Catastro Anterior">
                        </div>
                        <div class="form-group col-sm-6">
                              <label for="inputTecNumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
                              <input class="form-control" id="inputTecNumberCatastroOld" name="inputTecNumberCatastroOld" type="text" placeholder="N° Catastro Anterior">
                        </div>
                      </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <label for="inputTecAdress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
                              <textarea class="form-control" id="inputTecAdress" rows="3" required></textarea>
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
			              	<input class="form-control" name="inputTecFee" id="inputTecFee" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputTecPaymentImput" id="inputTecPaymentImput" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha del pago"/></label>
			              	<input id="inputTecDatePayment" class="form-control" size="16" type="text" value="" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="inputTecPaymentOutput" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputTecPaymentOutput" id="inputTecPaymentOutput" type="text" required>
				        </div>
			       	</div>
			       	
                    <div class="row"><!-- selTecIdResponsibleOfficial -->
                        <div class="form-group col-sm-6">
                              <label for="inputTecResponsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
                              <input class="form-control" name="inputTecResponsable" id="inputTecResponsable" type="text" required
                              placeholder="Responsable">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputTecResponsableId" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
                              <input class="form-control" name="inputTecResponsableId" id="inputTecResponsableId" type="text" required
                              placeholder="Responsable">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputTecResponsableCiv" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
                              <input class="form-control" name="inputTecResponsableCiv" id="inputTecResponsableCiv" type="text" required
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
  
					<div class="row">
				       <div class="x_title">
				         <h2><spring:message code="requestVUF.tec.panel.titleControlReport" text="Dirección de Catastro"/></h2>
				         <div class="clearfix"></div>
				       </div>
				        <div class="form-group col-sm-3">
		              		<label for="inputTecNumberNoticeCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="N° de Catastro"/></label>
                        	<input id="inputTecIdRequestUpplementary" name="inputTecIdRequestUpplementary" type="hidden">
			              	<input class="form-control" name="inputTecNumberNoticeCatastro" id="inputTecNumberNoticeCatastro" type="text" required>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha:"/></label>
			              	<div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
				                 <input id="inputTecDateNoticeCatastro" class="form-control" size="16" type="text" value="" readonly required>
				                 <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				             </div>
				        </div>
				        <div class="form-group col-sm-2">
		              		<label for="inputTecAreaTerrain" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Area acusada:"/></label>
			              	<input class="form-control" name="inputTecAreaTerrain" id="inputTecAreaTerrain" type="text" required>
				        </div>
				        <div class="form-group col-sm-2">
		              		<label for="inputTecAreaUsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Area aprovechable"/></label>
			              	<input class="form-control" name="inputTecAreaUsable" id="inputTecAreaUsable" type="text" required>
				        </div>
				        <div class="form-group col-sm-2">
		              		<label for="inputTecPaymentOutput" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Frente de terreno"/></label>
			              	<input class="form-control" name="inputTecFrontTerrain" id="inputTecFrontTerrain" type="text" required>
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
                                <tr id="1" class="requisite">
                                  	<th scope="row">Solicitud de consulta preliminar
                                  		<input id="requestRequisite1" type="hidden"></th>
									<th><input type="radio" value="yes" name="select1" /></th>
									<th><input type="radio" value="no" name="select1" /></th>
									<th><input type="radio" value="does_not_apply" name="select1" /></th>
									<th><input type="radio" value="pending" name="select1" /></th>
                                </tr>
                                <tr id="2" class="requisite">
                                    <th scope="row">Tecumento de Propiedad
                                  		<input id="requestRequisite2" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select2" /></th>
									<th><input type="radio" value="no" name="select2" /></th>
									<th><input type="radio" value="does_not_apply" name="select2" /></th>
									<th><input type="radio" value="pending" name="select2" /></th>
                                </tr>
                                <tr id="3" class="requisite">
                                    <th scope="row">Cédula Catastral actualizada a nombre del propietario actual
                                  		<input id="requestRequisite3" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select3" /></th>
									<th><input type="radio" value="no" name="select3" /></th>
									<th><input type="radio" value="does_not_apply" name="select3" /></th>
									<th><input type="radio" value="pending" name="select3" /></th>
                                </tr>
                                <tr id="4" class="requisite">
                                    <th scope="row">Contrato de Arrendamiento
                                  		<input id="requestRequisite4" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select4" /></th>
									<th><input type="radio" value="no" name="select4" /></th>
									<th><input type="radio" value="does_not_apply" name="select4" /></th>
									<th><input type="radio" value="pending" name="select4" /></th>
                                </tr>
                                <tr id="5" class="requisite">
                                    <th scope="row">Registro Mercantil
                                  		<input id="requestRequisite5" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select5" /></th>
									<th><input type="radio" value="no" name="select5" /></th>
									<th><input type="radio" value="does_not_apply" name="select5" /></th>
									<th><input type="radio" value="pending" name="select5" /></th>
                                </tr>
                                <tr id="6" class="requisite">
                                    <th scope="row">Solvencia Municipal o Estado en cero
                                  		<input id="requestRequisite6" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select6" /></th>
									<th><input type="radio" value="no" name="select6" /></th>
									<th><input type="radio" value="does_not_apply" name="select6" /></th>
									<th><input type="radio" value="pending" name="select6" /></th>
                                </tr>
                                <tr id="7" class="requisite">
                                    <th scope="row">Solvencia del profesional presentante
                                  		<input id="requestRequisite7" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select7" /></th>
									<th><input type="radio" value="no" name="select7" /></th>
									<th><input type="radio" value="does_not_apply" name="select7" /></th>
									<th><input type="radio" value="pending" name="select7" /></th>
                                </tr>
                                <tr id="8" class="requisite">
                                    <th scope="row">Cédula del propietario y profesional responsable
                                  		<input id="requestRequisite8" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select8" /></th>
									<th><input type="radio" value="no" name="select8" /></th>
									<th><input type="radio" value="does_not_apply" name="select8" /></th>
									<th><input type="radio" value="pending" name="select8" /></th>
                                </tr>
                                <tr id="9" class="requisite">
                                    <th scope="row">Solvencia de aseo urbano emitida por SERDECO.
                                  		<input id="requestRequisite9" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select9" /></th>
								 	<th><input type="radio" value="no" name="select9" /></th>
									<th><input type="radio" value="does_not_apply" name="select9" /></th>
									<th><input type="radio" value="pending" name="select9" /></th>
                                </tr>
                                <tr id="10" class="requisite">
                                    <th scope="row">Solvencia del servicio público agua emanada del IMAS.
                                  		<input id="requestRequisite10" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select10" /></th>
									<th><input type="radio" value="no" name="select10" /></th>
									<th><input type="radio" value="does_not_apply" name="select10" /></th>
									<th><input type="radio" value="pending" name="select10" /></th>
                                </tr>
                                <tr id="11" class="requisite">
                                    <th scope="row">Poder notariado del Representante legal del propietario.
                                  		<input id="requestRequisite11" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select11" /></th>
									<th><input type="radio" value="no" name="select11" /></th>
									<th><input type="radio" value="does_not_apply" name="select11" /></th>
									<th><input type="radio" value="pending" name="select11" /></th>
                                </tr>
                                <tr id="12" class="requisite">
                                    <th scope="row">Informe de Verificación de Áreas, linderos y pendientes, emitida por la Dirección de Catastro Municipal.
                                  		<input id="requestRequisite12" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select12" /></th>
									<th><input type="radio" value="no" name="select12" /></th>
									<th><input type="radio" value="does_not_apply" name="select12" /></th>
									<th><input type="radio" value="pending" name="select12" /></th>
                                </tr>
                                <tr id="13" class="requisite">
                                    <th scope="row">Comprobante de Cancelación de las Tasas.
                                  		<input id="requestRequisite13" type="hidden"></th>
                                    <th><input type="radio" value="yes" name="select13" /></th>
									<th><input type="radio" value="no" name="select13" /></th>
									<th><input type="radio" value="does_not_apply" name="select13" /></th>
									<th><input type="radio" value="pending" name="select13" /></th>
                                </tr>
                                <tr id="14" class="requisite">
                                    <th scope="row">Planos -Tres (1) ejemplares del plano de Topografía original, con curvas de nivel a cada (2 m.) con estudio de clasificación de pendientes de 0 a 20°, de 21 a 40°, de 41o a 60° y >60°, indicando linderos y área conforme al documento de propiedad inserto en cuadro de coordenadas UTM referidas a Sistemas REGVEN.
                                  		<input id="requestRequisite14" type="hidden">
                                  		
										<div class="row">
					                        <div class="col-sm-8">
									            <div class="input-group">
									                <label class="input-group-btn">
									                    <span class="btn btn-primary">
									                        <i class="glyphicon glyphicon-paperclip"></i> Buscar&hellip; <input name="filePlano14Pdf" type="file" style="display: none;">
									                    </span>
									                </label>
									                <input name="inputPlano14Pdf" type="text" class="form-control" readonly>
									            </div>
					                        </div>
					                        
											<div class=" col-sm-4">
					                        	<label id="btnTecPlano14Clear" class="btn btn-default"  data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></label>
												<label id="btnTecUploadPlano14Excel" class="btn btn-primary"><spring:message code="btn.upload.controlReport.title" text="Subir Archivo"/></label>
											</div>
										</div>
										
				                    </th>
                                    <th><input type="radio" value="yes" name="select14" /></th>
									<th><input type="radio" value="no" name="select14" /></th>
									<th><input type="radio" value="does_not_apply" name="select14" /></th>
									<th><input type="radio" value="pending" name="select14" /></th>
                                </tr>
                                <tr id="15" class="requisite">
                                    <th scope="row">Planos -Un (01) Cd plano de Topografía original formato DWG (AUTOCAD), con curvas de nivel a cada (2 m.) con estudio de clasificación de pendientes de 0 a 20°, de 21 a 40°, de 41o a 60° y >60°, indicando linderos y área conforme al documento de propiedad.
                                  		<input id="requestRequisite15" type="hidden">    
                                  		                              		
				                        <div class="row">
					                        <div class="col-sm-8">
									            <div class="input-group">
									                <label class="input-group-btn">
									                    <span class="btn btn-primary">
									                        <i class="glyphicon glyphicon-paperclip"></i> Buscar&hellip; <input name="filePlano15Pdf" type="file" style="display: none;">
									                    </span>
									                </label>
									                <input name="inputPlano15Pdf" type="text" class="form-control" readonly>
									            </div>
					                        </div>
					                        
											<div class=" col-sm-4">
					                        	<label id=" btnTecPlano15Clear" class="btn btn-default"  data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></label>
												<label id="btnTecUploadPlano15Excel" class="btn btn-primary"><spring:message code="btn.upload.controlReport.title" text="Subir Archivo"/></label>
											</div>
										</div>
										
                        			</th>
                                    <th><input type="radio" value="yes" name="select15" /></th>
									<th><input type="radio" value="no" name="select15" /></th>
									<th><input type="radio" value="does_not_apply" name="select15" /></th>
									<th><input type="radio" value="pending" name="select15" /></th>
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
						<label id="btnTecDownload" class="btn btn-primary">
                        		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar PDF"/>
                       	</label>
						<label id="btnTecCancelControlReport" class="btn btn-warning">Cancelar</label>
						<label id="btnTecSaveControlReport" class="btn btn-success">Guardar</label>
						<label id="btnTecProcessControlReport" class="btn btn-primary">Procesar</label>
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
                <input class="form-control" id="inputTecRvNumberRequest" type="text" readonly>
                <input id="inputTecRvIdRequest" type="hidden" value="0">                
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Facha:"/></label>
                <input class="form-control" id="inputTecRvDateRequest" name="inputTecRvDateRequest" type="text" readonly>
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
                <input class="form-control" id="inputTecRvNumberCatastro" type="text" readonly>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable:"/></label>
                <input class="form-control" id="inputTecRvResponsable" type="text" readonly>
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="CI / Rif:"/></label>
                <input class="form-control" id="inputTecRvResponsableId" type="text" readonly>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUF.lbl.address" text="Dirección:"/></label>
                <input class="form-control" id="inputTecRvAddress" type="text" readonly>
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
	      <button type="button" id="btnTecReview" class="btn btn-primary"><spring:message text="Revisión"/></button><!--  code="btn.delete.title"  -->
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