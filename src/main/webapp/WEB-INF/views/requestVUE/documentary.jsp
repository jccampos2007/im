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
                        <input class="form-control" name="inputDocSearchNumberRequest" id="inputDocSearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputDocSearchResponsable" id="inputDocSearchResponsable" type="text" placeholder="Nombre Responsable">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputDocSearchDateRequestFrom" id="inputDocSearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputDocSearchDateRequestTo" id="inputDocSearchDateRequestTo" type="text" placeholder="Fecha Hasta">
                      </div>
                      <div class="form-group col-sm-2">
                        <button type="button" id="btnDocSearch" class="btn btn-default"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
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

    <div id="divDocInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.doc.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblDocInbox"  class="table table-striped">
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

    <div id="divDocControlReport" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.doc.panel.titleControlReport" text="Acta Control"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="formControlReport" action="" method="POST">
                    <div class="row">
                        <div class="form-group col-sm-4">
                        	<input id="inputDocIdRequest" name="inputDocIdRequest" type="hidden" required>
	                        <label for="inputDocNumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
	                        <input class="form-control" id="inputDocNumberRequest" name="inputDocNumberRequest" type="text" required>
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="inputDocDateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
                              <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
				                 <input id="inputDocDateRequest" class="form-control" size="16" type="text" value="" readonly>
				                 <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				             </div>
                        </div>
                        <div class="form-group col-sm-4">
                        	<label for="selDocIdTypeUse" class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Uso Presentado"/></label>
                            <select class="form-control" id="selDocIdTypeUse" name="selDocIdTypeUse">
                              <option value="1" selected="selected">Comercial</option>
                              <option value="2">Oficina</option>
                              <option value="3">Residencial</option>
                            </select>
                        </div>
                       </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputDocNumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
                              <input class="form-control" id="inputDocNumberCatastro" name="inputDocNumberCatastro" type="text" required
                              placeholder="N° Catastro Anterior">
                        </div>
                        <div class="form-group col-sm-6">
                              <label for="inputDocNumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
                              <input class="form-control" id="inputDocNumberCatastroOld" name="inputDocNumberCatastroOld" type="text" required
                              placeholder="N° Catastro Anterior">
                        </div>
                      </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <label for="inputDocAdress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
                              <textarea class="form-control" id="inputDocAdress" rows="3"></textarea>
                        </div>
                       </div>
                    <div class="row">
                        <!-- <div class="form-group col-sm-3">
                              <label for="selDocIdResponsibleOfficial" class="text-muted"><spring:message code="RequestVUF.lbl.responsibleOfficial" text="Funcionario revisor"/></label>
                              <select class="form-control" name="selDocIdResponsibleOfficial" id="selDocIdResponsibleOfficial">
	                              <option value="1" selected="selected">XXXXXXX</option>
	                              <option value="2">XXXXXXX</option>
	                              <option value="3">XXXXXXX</option>
	                          </select>
                        </div> -->
                        <div class="form-group col-sm-6">
                              <label for="inputDocResponsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
                              <input class="form-control" name="inputDocResponsable" id="inputDocResponsable" type="text" required
                              placeholder="Responsable">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputDocResponsableId" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
                              <input class="form-control" name="inputDocResponsableId" id="inputDocResponsableId" type="text" required
                              placeholder="Responsable">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputDocResponsableCiv" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
                              <input class="form-control" name="inputDocResponsableCiv" id="inputDocResponsableCiv" type="text" required
                              placeholder="Responsable">
                        </div>
                       </div>
                    <div class="row">
                        <div class="form-group col-sm-10">
                        	<table id="tableOwnerList" class="table">
                              <thead>
                                <tr>
                                  <th>id_owner</th>
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
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <table id="tblDocRequestRequisite" class="table">
                              <thead>
                                <tr>
                                  <th>RECAUDOS</th>
                                  <th>SI</th>
                                  <th>NO</th>
                                  <th>N.A</th>
                                </tr>
                              </thead>
                              <tbody>
                                <tr id="1" class="requisite">
                                  	<th scope="row">Solicitud de consulta preliminar</th>
									<th><input type="radio" value="yes" name="select1" /></th>
									<th><input type="radio" value="no" name="select1" /></th>
									<th><input type="radio" value="does_not_apply" name="select1" /></th>
                                </tr>
                                <tr id="2" class="requisite">
                                    <th scope="row">Documento de Propiedad</th>
                                    <th><input type="radio" value="yes" name="select2" /></th>
									<th><input type="radio" value="no" name="select2" /></th>
									<th><input type="radio" value="does_not_apply" name="select2" /></th>
                                </tr>
                                <tr id="3" class="requisite">
                                    <th scope="row">Cédula Catastral actualizada a nombre del propietario actual</th>
                                    <th><input type="radio" value="yes" name="select3" /></th>
									<th><input type="radio" value="no" name="select3" /></th>
									<th><input type="radio" value="does_not_apply" name="select3" /></th>
                                </tr>
                                <tr id="4" class="requisite">
                                    <th scope="row">Contrato de Arrendamiento</th>
                                    <th><input type="radio" value="yes" name="select4" /></th>
									<th><input type="radio" value="no" name="select4" /></th>
									<th><input type="radio" value="does_not_apply" name="select4" /></th>
                                </tr>
                                <tr id="5" class="requisite">
                                    <th scope="row">Registro Mercantil</th>
                                    <th><input type="radio" value="yes" name="select5" /></th>
									<th><input type="radio" value="no" name="select5" /></th>
									<th><input type="radio" value="does_not_apply" name="select5" /></th>
                                </tr>
                                <tr id="6" class="requisite">
                                  <th scope="row">Solvencia Municipal o Estado en cero</th>
                                  <th><input type="radio" value="yes" name="select6" /></th>
									<th><input type="radio" value="no" name="select6" /></th>
									<th><input type="radio" value="does_not_apply" name="select6" /></th>
                                </tr>
                                <tr id="7" class="requisite">
                                  <th scope="row">Solvencia del profesional presentante</th>
                                 <th><input type="radio" value="yes" name="select7" /></th>
									<th><input type="radio" value="no" name="select7" /></th>
									<th><input type="radio" value="does_not_apply" name="select7" /></th>
                                </tr>
                                <tr id="8" class="requisite">
                                  <th scope="row">Cédula del propietario y profesional responsable</th>
                                 <th><input type="radio" value="yes" name="select8" /></th>
									<th><input type="radio" value="no" name="select8" /></th>
									<th><input type="radio" value="does_not_apply" name="select8" /></th>
                                </tr>
                                <tr id="9" class="requisite">
                                  <th scope="row">Solvencia de aseo urbano emitida por SERDECO.</th>
                                  <th><input type="radio" value="yes" name="select9" /></th>
									<th><input type="radio" value="no" name="select9" /></th>
									<th><input type="radio" value="does_not_apply" name="select9" /></th>
                                </tr>
                                <tr id="10" class="requisite">
                                  <th scope="row">Solvencia del servicio público agua emanada del IMAS.</th>
                                  <th><input type="radio" value="yes" name="select10" /></th>
									<th><input type="radio" value="no" name="select10" /></th>
									<th><input type="radio" value="does_not_apply" name="select10" /></th>
                                </tr>
                                <tr id="11" class="requisite">
                                  <th scope="row">Poder notariado del Representante legal del propietario.</th>
                                  <th><input type="radio" value="yes" name="select11" /></th>
									<th><input type="radio" value="no" name="select11" /></th>
									<th><input type="radio" value="does_not_apply" name="select11" /></th>
                                </tr>
                                <tr id="12" class="requisite">
                                  <th scope="row">aprobación y autorización por parte del Instituto de Patrimonio Cultural IPC.</th>
                                  <th><input type="radio" value="yes" name="select12" /></th>
									<th><input type="radio" value="no" name="select12" /></th>
									<th><input type="radio" value="does_not_apply" name="select12" /></th>
                                </tr>
                                <tr id="13" class="requisite">
                                  <th scope="row">Oficio de Asignación de Variables Urbanas Fundamentales o de la Constancia de Cumplimiento de variables urbanas fundamentales en edificaciones o copia de la carátula del permiso Clase A o B, según sea el caso.</th>
                                  <th><input type="radio" value="yes" name="select13" /></th>
									<th><input type="radio" value="no" name="select13" /></th>
									<th><input type="radio" value="does_not_apply" name="select13" /></th>
                                </tr>
                                <tr id="14" class="requisite">
                                  <th scope="row">Comprobante de Cancelación de las Tasas por concepto de Revisión</th>
                                  <th><input type="radio" value="yes" name="select14" /></th>
									<th><input type="radio" value="no" name="select14" /></th>
									<th><input type="radio" value="does_not_apply" name="select14" /></th>
                                </tr>
                                <tr id="15" class="requisite">
                                  <th scope="row">Dos (02) ejemplares del levantamiento Arquitectónico</th>
                                  <th><input type="radio" value="yes" name="select15" /></th>
									<th><input type="radio" value="no" name="select15" /></th>
									<th><input type="radio" value="does_not_apply" name="select15" /></th>
                                </tr>
                                <tr id="16" class="requisite">
                                  <th scope="row">Un (01) Cd del levantamiento Arquitectónico en Autocad</th>
                                  <th><input type="radio" value="yes" name="select16" /></th>
									<th><input type="radio" value="no" name="select16" /></th>
									<th><input type="radio" value="does_not_apply" name="select16" /></th>
                                </tr>
                                <tr id="17" class="requisite">
                                  <th scope="row">Dos (02) memorias descriptivas </th>
                                  <th><input type="radio" value="yes" name="select17" /></th>
									<th><input type="radio" value="no" name="select17" /></th>
									<th><input type="radio" value="does_not_apply" name="select17" /></th>
                                 </tr>
                                <tr>
                                  <th scope="row" colspan="4">OBSERVACIONES:</th>
                                </tr>
                                <tr>
                                  <th scope="row" colspan="4"><textarea rows="" cols=""></textarea></th>
                                </tr>
                              </tbody>
                            </table>
                        </div>
                       </div>
                       <div class="row">
                       	<label id="btnDocCancelControlReport" class="btn btn-warning">Cancelar</label>
                        <label id="btnDocSaveControlReport" class="btn btn-success">Guardar</label>
                       	<label id="btnDocProcessControlReport" class="btn btn-primary">Procesar</label>
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
                <input class="form-control" id="inputDocOwnerId" name="inputDocOwnerId" type="text" required
                placeholder="CI / Rif">
            </div>
            <div class="form-group col-sm-2">
                <button type="button" id="btnFindOwner" class="btn btn-primary"><spring:message text="Consultar"/></button><!--  code="btn.delete.title"  -->
            </div>
            <div class="form-group col-sm-6">
                <input class="form-control" id="inputDocNameOwner" name="inputDocNameOwner" type="text" required
                placeholder="Nombre">
                <input id="inputDocIdOwner" name="inputDocIdOwner" type="hidden" value="0">
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label for="inputDocEmailOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Correo:"/></label>
                <input class="form-control" id="inputDocEmailOwner" name="inputDocEmailOwner" type="text" required
                >
            </div>
            <div class="form-group col-sm-6">
                <label for="selDocNationalityOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Nacionalidad:"/></label>
                <select class="form-control" name="selDocNationalityOwner" id="selDocNationalityOwner">
                     <option value="1" selected="selected">V</option>
                     <option value="2">E</option>
                 </select>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label for="inputDocPhoneOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Teléfono Hab.:"/></label>
                <input class="form-control" id="inputDocPhoneOwner" name="inputDocPhoneOwner" type="text" required
                >
            </div>
            <div class="form-group col-sm-6">
                <label for="inputDocMobileOwner" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Teléfono Celular:"/></label>
                <input class="form-control" id="inputDocMobileOwner" name="inputDocMobileOwner" type="text" required
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