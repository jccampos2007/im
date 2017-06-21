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
                        <input class="form-control" name="inputDelSearchNumberRequest" id="inputDelSearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputDelSearchResponDelble" id="inputDelSearchResponDelble" type="text" placeholder="Nombre ResponDelble">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputDelSearchDateRequestFrom" id="inputDelSearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputDelSearchDateRequestTo" id="inputDelSearchDateRequestTo" type="text" placeholder="Fecha Hasta">
                      </div>
                      <div class="form-group col-sm-2">
                        <button type="button" id="btnDelSearch" class="btn btn-default"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
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

    <div id="divDelInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblDelInbox"  class="table table-striped">
            		<thead>
            			<tr>
            				<td>id_request</td>
            				<td>N° de Solicitud</td>
            				<td>ResponDelble</td>
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

    <div id="divDelBanlance" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleInbox" text="Validación de pago de tasa"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
       
        <div class="row">
            <div class="form-group col-sm-4">
                  <label for="inputDelRequestCost" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Costo tramite"/></label>
                  <input class="form-control" id="inputDelRequestCost" name="inputDelRequestCost" type="text" readonly>
            </div>
            <div class="form-group col-sm-4">
                  <label for="inputDelPaymentReceived" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Pago Recibido"/></label>
                  <input class="form-control" id="inputDelPaymentReceived" name="inputDelPaymentReceived" type="text" readonly>
            </div>
            <div class="form-group col-sm-4">
                  <label for="inputDelBalance" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Saldo"/></label>
                  <input class="form-control" id="inputDelBalance" name="inputDelBalance" type="text" readonly>
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
	        <div class="form-group col-sm-2">
             		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
              	<input class="form-control" name="inputRecPaymentImput" id="inputRecPaymentImput" type="text" readonly>
	        </div>
	        <div class="form-group col-sm-2">
             		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha del pago"/></label>
              	<input id="inputRecDatePayment" class="form-control" size="16" type="text" value="" readonly>
	        </div>
	        <div class="form-group col-sm-2">
             	<label for="inputRecFee" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="."/></label>
              	<label id="btnLoadFee" class="form-control btn btn-primary" style="display: table-cell; vertical-align: bottom; float: none;">REGISTRAR
             		<i class="glyphicon glyphicon-search" style="margin-left: 5px;"></i>
             	</label>
	        </div>
       	</div>
       	
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblDelPaymentList"  class="table table-striped">
            		<thead>
            			<tr>
            				<td>N° de Tasa</td>
            				<td>Fecha</td>
            				<td>Monto</td>
            			</tr>
            		</thead>
            		<tbody></tbody>
            	</table>
            </div>
        </div>
        
       </div>
     </div>
    </div>

    <div id="divDelControlReport" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleControlReport" text="Entrega de solicitud"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="formDelControlReport" action="" method="POST">
                    <div class="row">
                        <div class="form-group col-sm-4">
                        	<input id="inputDelIdRequest" name="inputDelIdRequest" type="hidden" required>
                        	<input id="inputDelIdOrdinance" name="inputDelIdOrdinance" type="hidden" required>
                        	<input id="inputDelPaymentOutput" name="inputDelPaymentOutput" type="hidden" required>
                        	
							<label for="inputDelNumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
	                        <input class="form-control" id="inputDelNumberRequest" name="inputDelNumberRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="inputDelDateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
                            <input class="form-control" id="inputDelDateRequest" name="inputDelDateRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                        	<label for="selDelIdTypeUse" class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Uso Presentado"/></label>
                            <select class="form-control" id="selDelIdTypeUse" name="selDelIdTypeUse">
                                <c:forEach items="${typeUses}" var="typeUse">
									<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
								</c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputDelNumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
                              <input class="form-control" id="inputDelNumberCatastro" name="inputDelNumberCatastro" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-6">
                              <label for="inputDelNumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
                              <input class="form-control" id="inputDelNumberCatastroOld" name="inputDelNumberCatastroOld" type="text" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <label for="inputDelAddress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
                              <textarea class="form-control" id="inputDelAddress" rows="3" readonly></textarea>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-3">
                              <label for="selDelIdResponsibleOfficial" class="text-muted"><spring:message code="RequestVUF.lbl.responsibleOfficial" text="Funcionario revisor"/></label>
                              <select class="form-control" name="selDelIdResponsibleOfficial" id="selDelIdResponsibleOfficial">
	                             <c:forEach items="${responsibleOfficial}" var="official">
									<option value="${official.id_user_session}">${official.username}</option>
								 </c:forEach>
			                  </select>
                        </div>
                        <div class="form-group col-sm-5">
                              <label for="inputDelResponsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
                              <input class="form-control" name="inputDelResponsable" id="inputDelResponsable" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputDelResponsableId" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
                              <input class="form-control" name="inputDelResponsableId" id="inputDelResponsableId" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputDelResponsableCiv" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
                              <input class="form-control" name="inputDelResponsableCiv" id="inputDelResponsableCiv" type="text" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputDelNameDelivery" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Nombre"/></label>
                              <input class="form-control" name="inputDelNameDelivery" id="inputDelNameDelivery" type="text" required
                              placeholder="Nombre">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputDelIdDelivery" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="CI / Rif"/></label>
                              <input class="form-control" name="inputDelIdDelivery" id="inputDelIdDelivery" type="text" required
                              placeholder="CI / Rif">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputDelDateDelivery" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="Fecha entrega"/></label>
                              <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
				                 <input id="inputDelDateDelivery" class="form-control" size="16" type="text" value="" readonly required>
				                 <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								 <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				              </div>
                        </div>
                    </div>
                    <div class="row center-block">
                    	<label id="btnDelCancel" class="btn btn-warning">Cancelar</label>
                        <label id="btnDelivery" class="btn btn-success">Entregar</label>
                    </div>
                </form>
            </div>
        </div>
       </div>
     </div>
    </div>
</div>
