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
                        <input class="form-control" name="inputVUEMASearchNumberRequest" id="inputVUEMASearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputVUEMASearchResponMAble" id="inputVUEMASearchResponMAble" type="text" placeholder="Nombre ResponMAble">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputVUEMASearchDateRequestFrom" id="inputVUEMASearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputVUEMASearchDateRequestTo" id="inputVUEMASearchDateRequestTo" type="text" placeholder="Fecha Hasta">
                      </div>
                      <div class="form-group col-sm-2">
                        <button type="button" id="btnVUEMASearch" class="btn btn-default"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
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

    <div id="divVUEMAInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblVUEMAInbox"  class="table table-striped">
            		<thead>
            			<tr>
            				<td>id_request</td>
            				<td>N° de Solicitud</td>
            				<td>ResponMAble</td>
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

    <div id="divVUEMAControlReport" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleControlReport" text="Aprobacion de solicitud"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="formVUEMAControlReport" action="" method="POST">
                    <div class="row">
                        <div class="form-group col-sm-4">
                        	<input id="inputVUEMAIdRequest" name="inputVUEMAIdRequest" type="hidden" required>
	                        <input id="inputVUEMAIdOrdinance" name="inputVUEMAIdOrdinance" type="hidden" required>
	                        <label for="inputVUEMANumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
	                        <input class="form-control" id="inputVUEMANumberRequest" name="inputVUEMANumberRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="inputVUEMADateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
                            <input class="form-control" id="inputVUEMADateRequest" name="inputVUEMADateRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                        	<label for="selVUEMAIdTypeUse" class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Uso Presentado"/></label>
                            <select class="form-control" id="selVUEMAIdTypeUse" name="selVUEMAIdTypeUse">
                              <c:forEach items="${typeUses}" var="typeUse">
									<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
								</c:forEach>
				            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputVUEMANumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
                              <input class="form-control" id="inputVUEMANumberCatastro" name="inputVUEMANumberCatastro" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-6">
                              <label for="inputVUEMANumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
                              <input class="form-control" id="inputVUEMANumberCatastroOld" name="inputVUEMANumberCatastroOld" type="text" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <label for="inputVUEMAAdress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
                              <textarea class="form-control" id="inputVUEMAAdress" rows="3"></textarea>
                        </div>
                    </div>         
					<div class="row">
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="N° Comprobante:"/></label>
			              	<input class="form-control" name="inputVUEMAFee" id="inputVUEMAFee" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputVUEMAPaymentImput" id="inputVUEMAPaymentImput" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha del pago"/></label>
			              	<input id="inputVUEMADatePayment" class="form-control" size="16" type="text" value="" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="inputVUEMAPaymentOutput" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputVUEMAPaymentOutput" id="inputVUEMAPaymentOutput" type="text" readonly>
				        </div>
			       	</div>
                    <div class="row">
                        <div class="form-group col-sm-3">
                              <label for="selVUEMAIdResponsibleOfficial" class="text-muted"><spring:message code="RequestVUF.lbl.responsibleOfficial" text="Funcionario revisor"/></label>
                              <select class="form-control" name="selVUEMAIdResponsibleOfficial" id="selVUEMAIdResponsibleOfficial">
	                              <option value="1" selected="selected">JUAN CAMPOS</option>
                    			  <option value="2">ADELVIS UZCATEGUI</option>
	                          </select>
                        </div>
                        <div class="form-group col-sm-5">
                              <label for="inputVUEMAResponsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
                              <input class="form-control" name="inputVUEMAResponsable" id="inputVUEMAResponsable" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputVUEMAResponsableId" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
                              <input class="form-control" name="inputVUEMAResponsableId" id="inputVUEMAResponsableId" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputVUEMAResponsableCiv" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
                              <input class="form-control" name="inputVUEMAResponsableCiv" id="inputVUEMAResponsableCiv" type="text" readonly>
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
                              <table id="tblVUEMARequestRequisite" class="table">
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
				                    <th><input type="radio" value="does_not_apply" name="selec28" /></th>
				                    <th><input type="radio" value="pending" name="select28" /></th>
				                  </tr>
				                  <tr id="29" class="requisite">
				                    <th scope="row">Oficio de Asignación de Variables Urbanas Fundamentales o de la Constancia de Cumplimiento de variables urbanas fundamentales en edificaciones o copia de la carátula del permiso Clase A o B, según sea el caso
				                    <input id="requestRequisite29" type="hidden"></th>
				                    <th><input type="radio" value="yes" name="select29" /></th>
				                    <th><input type="radio" value="no" name="select29" /></th>
				                    <th><input type="radio" value="does_not_apply" name="selec29" /></th>
				                    <th><input type="radio" value="pending" name="select29" /></th>
				                  </tr>
                                <tr id="30" class="requisite">
                                    <th scope="row">Planos - Dos (02) ejemplares del levantamiento Arquitectónico
                                  		<input id="requestRequisite30" type="hidden">
                                  		
										<div class="row">
											<div class=" col-sm-2">
					                        	<label id="btnVUEMADownloadPlano30" class="btn btn-primary">
					                        		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar"/>
					                        	</label>
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
											<div class=" col-sm-2">
					                        	<label id="btnVUEMADownloadPlano31" class="btn btn-primary">
					                        		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar"/>
					                        	</label>
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
											<div class=" col-sm-2">
					                        	<label id="btnVUEMADownloadPlano32" class="btn btn-primary">
					                        		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar"/>
					                        	</label>
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
                                  <th scope="row" colspan="5"><textarea id="taVUEMACommentRequisite" rows="" cols=""></textarea></th>
                                </tr>
                              </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="form-group col-sm-12">
                        	<label for="inputVUEMACommentManager" class="text-muted"><spring:message code="RequestVUF.lbl.commentSupervisor" text="Comentario"/></label>
	                        <textarea class="form-control" id="inputVUEMACommentManager" name="inputVUEMACommentManager"></textarea>
                        </div>
                    </div>
                    <div class="row">
                    	<label id="btnVUEMADownload" class="btn btn-primary">
                       		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar PDF"/>
                       	</label>
                        <label id="btnVUEMAApprobalControlReport" class="btn btn-success">Aprobar</label>
                       	<label id="btnVUEMADenyControlReport" class="btn btn-danger">Rechazar</label>
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
