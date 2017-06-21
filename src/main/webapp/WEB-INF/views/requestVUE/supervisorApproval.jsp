<!-- abreviación Doc -->
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
                <form id="form-corporate" action="/corporate" method="POST">
                  <h4><spring:message code="lbl.title" text="Buscar N° de Solicitud"/></h4>
                    <div class="row">
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputVUESASearchNumberRequest" id="inputVUESASearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputVUESASearchResponSAble" id="inputVUESASearchResponSAble" type="text" placeholder="Nombre ResponSAble">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputVUESASearchDateRequestFrom" id="inputVUESASearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputVUESASearchDateRequestTo" id="inputVUESASearchDateRequestTo" type="text" placeholder="Fecha Hasta">
                      </div>
                      <div class="form-group col-sm-2">
                        <button type="button" id="btnVUESASearch" class="btn btn-default"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
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

    <div id="divVUESAInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblVUESAInbox"  class="table table-striped">
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

    <div id="divVUESAControlReport" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleControlReport" text="Aprobacion de solicitud"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="formVUESAControlReport" action="" method="POST">
                    <div class="row">
                        <div class="form-group col-sm-4">
                        	<input id="inputVUESAIdRequest" name="inputVUESAIdRequest" type="hidden" required>
                        	<input id="inputVUESAIdOrdinance" name="inputVUESAIdOrdinance" type="hidden" required>
	                        <label for="inputVUESANumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
	                        <input class="form-control" id="inputVUESANumberRequest" name="inputVUESANumberRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="inputVUESADateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
                            <input class="form-control" id="inputVUESADateRequest" name="inputVUESADateRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                        	<label for="selVUESAIdTypeUse" class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Uso Presentado"/></label>
                            <select class="form-control" id="selVUESAIdTypeUse" name="selVUESAIdTypeUse">
                                <c:forEach items="${typeUses}" var="typeUse">
									<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
								</c:forEach>
				            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputVUESANumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
                              <input class="form-control" id="inputVUESANumberCatastro" name="inputVUESANumberCatastro" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-6">
                              <label for="inputVUESANumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
                              <input class="form-control" id="inputVUESANumberCatastroOld" name="inputVUESANumberCatastroOld" type="text" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <label for="inputVUESAAdress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
                              <textarea class="form-control" id="inputVUESAAdress" rows="3" readonly></textarea>
                        </div>
                    </div>         
					<div class="row">
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="N° Comprobante:"/></label>
			              	<input class="form-control" name="inputVUESAFee" id="inputVUESAFee" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputVUESAPaymentImput" id="inputVUESAPaymentImput" type="text" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha del pago"/></label>
			              	<input id="inputVUESADatePayment" class="form-control" size="16" type="text" value="" readonly>
				        </div>
				        <div class="form-group col-sm-3">
		              		<label for="inputVUESAPaymentOutput" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
			              	<input class="form-control" name="inputVUESAPaymentOutput" id="inputVUESAPaymentOutput" type="text" readonly>
				        </div>
			       	</div>
                    <div class="row">
                        <div class="form-group col-sm-3">
                              <label for="selVUESAIdResponsibleOfficial" class="text-muted"><spring:message code="RequestVUF.lbl.responsibleOfficial" text="Funcionario revisor"/></label>
                              <select class="form-control" name="selVUESAIdResponsibleOfficial" id="selVUESAIdResponsibleOfficial">
                            	<option value="1" selected="selected">JUAN CAMPOS</option>
                    			<option value="2">ADELVIS UZCATEGUI</option>
	                          </select>
                        </div>
                        <div class="form-group col-sm-5">
                              <label for="inputVUESAResponsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
                              <input class="form-control" name="inputVUESAResponsable" id="inputVUESAResponsable" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputVUESAResponsableId" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
                              <input class="form-control" name="inputVUESAResponsableId" id="inputVUESAResponsableId" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputVUESAResponsableCiv" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
                              <input class="form-control" name="inputVUESAResponsableCiv" id="inputVUESAResponsableCiv" type="text" readonly>
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
                              <table id="tblVUESARequestRequisite" class="table">
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
					                        	<label id="btnVUESADownloadPlano30" class="btn btn-primary">
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
					                        	<label id="btnVUESADownloadPlano31" class="btn btn-primary">
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
					                        	<label id="btnVUESADownloadPlano32" class="btn btn-primary">
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
                                  <th scope="row" colspan="5"><textarea id="taVUESACommentRequisite" rows="" cols=""></textarea></th>
                                </tr>
                              </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="form-group col-sm-12">
                        	<label for="inputVUESACommentSupervisor" class="text-muted"><spring:message code="RequestVUF.lbl.commentSupervisor" text="Comentario"/></label>
	                        <textarea class="form-control" id="inputVUESACommentSupervisor" name="inputVUESACommentSupervisor" required></textarea>
                        </div>
                    </div>
                    <div class="row">
                   		<label id="btnVUESADownload" class="btn btn-primary">
                       		<i class="fa fa-file-pdf-o"></i> <spring:message code="btn.download.controlReport.title" text="Descargar PDF"/>
                       	</label>
                        <label id="btnVUESAApprobalControlReport" class="btn btn-success">Aprobar</label>
                       	<label id="btnVUESADenyControlReport" class="btn btn-danger">Rechazar</label>
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
