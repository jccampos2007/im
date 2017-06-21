<!-- abreviación Doc -->
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
                <form id="form-corporate" action="/corporate" method="POST">
                  <h4><spring:message code="lbl.title" text="Buscar N° de Solicitud"/></h4>
                    <div class="row">
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputSASearchNumberRequest" id="inputSASearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputSASearchResponSAble" id="inputSASearchResponSAble" type="text" placeholder="Nombre ResponSAble">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputSASearchDateRequestFrom" id="inputSASearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputSASearchDateRequestTo" id="inputSASearchDateRequestTo" type="text" placeholder="Fecha Hasta">
                      </div>
                      <div class="form-group col-sm-2">
                        <button type="button" id="btnSASearch" class="btn btn-default"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
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

    <div id="divSAInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblSAInbox"  class="table table-striped">
            		<thead>
            			<tr>
            				<td>id_request</td>
            				<td>N° de Solicitud</td>
            				<td>ResponSAble</td>
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

    <div id="divSAControlReport" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleControlReport" text="Aprobacion de solicitud"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="formSAControlReport" action="" method="POST">
                    <div class="row">
                        <div class="form-group col-sm-4">
                        	<input id="inputSAIdRequest" name="inputSAIdRequest" type="hidden" required>
                        	<input id="inputSAIdOrdinance" name="inputSAIdOrdinance" type="hidden" required>
	                        <label for="inputSANumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
	                        <input class="form-control" id="inputSANumberRequest" name="inputSANumberRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="inputSADateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
                            <input class="form-control" id="inputSADateRequest" name="inputSADateRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                        	<label for="selSAIdTypeUse" class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Uso Presentado"/></label>
                            <select class="form-control" id="selSAIdTypeUse" name="selSAIdTypeUse">
                                <c:forEach items="${typeUses}" var="typeUse">
									<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
								</c:forEach>
				            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputSANumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
                              <input class="form-control" id="inputSANumberCatastro" name="inputSANumberCatastro" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-6">
                              <label for="inputSANumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
                              <input class="form-control" id="inputSANumberCatastroOld" name="inputSANumberCatastroOld" type="text" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <label for="inputSAAdress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
                              <textarea class="form-control" id="inputSAAdress" rows="3" readonly></textarea>
                        </div>
                    </div>         
					<div class="row">
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="N° Comprobante:"/></label>
			              	<input class="form-control" name="inputSAFee" id="inputSAFee" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputSAPaymentImput" id="inputSAPaymentImput" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha del pago"/></label>
			              	<input id="inputSADatePayment" class="form-control" size="16" type="text" value="" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="inputSAPaymentOutput" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputSAPaymentOutput" id="inputSAPaymentOutput" type="text" readonly>
				        </div>
			       	</div>
                    <div class="row">
                        <div class="form-group col-sm-3">
                              <label for="selSAIdResponsibleOfficial" class="text-muted"><spring:message code="RequestVUF.lbl.responsibleOfficial" text="Funcionario revisor"/></label>
                              <select class="form-control" name="selSAIdResponsibleOfficial" id="selSAIdResponsibleOfficial">
                            	<option value="1" selected="selected">JUAN CAMPOS</option>
                    			<option value="2">ADELVIS UZCATEGUI</option>
	                          </select>
                        </div>
                        <div class="form-group col-sm-5">
                              <label for="inputSAResponsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
                              <input class="form-control" name="inputSAResponsable" id="inputSAResponsable" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputSAResponsableId" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
                              <input class="form-control" name="inputSAResponsableId" id="inputSAResponsableId" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputSAResponsableCiv" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
                              <input class="form-control" name="inputSAResponsableCiv" id="inputSAResponsableCiv" type="text" readonly>
                        </div>
                    </div>
                    
                    <div class="row">
				        <div class="form-group col-sm-12">
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
			       	</div>
			       	
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <table id="tblSARequestRequisite" class="table">
                              <thead>
                                <tr>
                                  <th>RECAUDOS</th>
							      <th>SI</th>
							      <th>NO</th>
							      <th>N.A</th>
                                  <th>PENDIENTE</th>
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
					                        <div class=" col-sm-2">
					                        	<h4><spring:message code="requestVUF.tec.panel.titleControlReport" text="Formato Excel"/></h4>
					                        </div>
											<div class=" col-sm-2">
					                        	<label id="btnSADownloadPlano14Pdf" class="btn btn-primary">
					                        		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar"/>
					                        	</label>
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
					                        <div class=" col-sm-2">
					                        	<h4><spring:message code="requestVUF.tec.panel.titleControlReport" text="Formato Excel"/></h4>
					                        </div>
											<div class=" col-sm-2">
					                        	<label id="btnSADownloadPlano15Pdf" class="btn btn-primary">
					                        		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar"/>
					                        	</label>
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
                                  <th scope="row" colspan="5"><textarea rows="" cols=""></textarea></th>
                                </tr>
                              </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="form-group col-sm-12">
                        	<label for="inputSACommentSupervisor" class="text-muted"><spring:message code="RequestVUF.lbl.commentSupervisor" text="Comentario"/></label>
	                        <textarea class="form-control" id="inputSACommentSupervisor" name="inputSACommentSupervisor" required></textarea>
                        </div>
                    </div>
                    <div class="row">
                   		<label id="btnSADownload" class="btn btn-primary">
                       		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar PDF"/>
                       	</label>
                        <label id="btnSAApprobalControlReport" class="btn btn-success">Aprobar</label>
                       	<label id="btnSADenyControlReport" class="btn btn-danger">Rechazar</label>
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
 		$('input[type = "radio"]').attr("readonly","true");
	});
</script>
<!--END SCRIPT-->
