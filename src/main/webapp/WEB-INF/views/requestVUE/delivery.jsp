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
                        <input class="form-control" name="inputVUEDelSearchNumberRequest" id="inputVUEDelSearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputVUEDelSearchResponDelble" id="inputVUEDelSearchResponDelble" type="text" placeholder="Nombre ResponDelble">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputVUEDelSearchDateRequestFrom" id="inputVUEDelSearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputVUEDelSearchDateRequestTo" id="inputVUEDelSearchDateRequestTo" type="text" placeholder="Fecha Hasta">
                      </div>
                      <div class="form-group col-sm-2">
                        <button type="button" id="btnVUEDelSearch" class="btn btn-default"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
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

    <div id="divVUEDelInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblVUEDelInbox"  class="table table-striped">
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

    <div id="divVUEDelBanlance" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleInbox" text="Validación de pago de tasa"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
       
        <div class="row">
            <div class="form-group col-sm-4">
                  <label for="inputVUEDelRequestCost" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Costo tramite"/></label>
                  <input class="form-control" id="inputVUEDelRequestCost" name="inputVUEDelRequestCost" type="text" readonly>
            </div>
            <div class="form-group col-sm-4">
                  <label for="inputVUEDelPaymentReceived" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="Pago Recibido"/></label>
                  <input class="form-control" id="inputVUEDelPaymentReceived" name="inputVUEDelPaymentReceived" type="text" readonly>
            </div>
            <div class="form-group col-sm-4">
                  <label for="inputVUEDelBalance" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="Saldo"/></label>
                  <input class="form-control" id="inputVUEDelBalance" name="inputVUEDelBalance" type="text" readonly>
            </div>
        </div>
        
		<div class="row">
	        <div class="form-group col-sm-4">
           		<label for="inputVUERecFee" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="N° Comprobante:"/></label>
              	<input class="form-control" name="inputVUERecFee" id="inputVUERecFee" type="text" required
              	placeholder="Comprobante de Pago">
	        </div>
	        <div class="form-group col-sm-2">
           		<label for="inputVUEDelFee" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="VANSAT"/></label>
              	<label id="btnVUEDeLCheckFee" class="form-control btn btn-primary" style="display: table-cell; vertical-align: bottom; float: none;">CONSULTAR
           			<i class="glyphicon glyphicon-search" style="margin-left: 5px;"></i>
           		</label>
	        </div>
	        <div class="form-group col-sm-2">
           		<label for="name" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Monto"/></label>
              	<input class="form-control" name="inputVUEDelPaymentImput" id="inputVUEDelPaymentImput" type="text" readonly>
	        </div>
	        <div class="form-group col-sm-2">
           		<label class="text-muted"><spring:message code="RequestVUF.lbl.datePayment" text="Fecha del pago"/></label>
              	<input id="inputVUEDelDatePayment" class="form-control" size="16" type="text" value="" readonly>
	        </div>
	        <div class="form-group col-sm-2">
             	<label for="inputVUEDelFee" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="."/></label>
              	<label id="btnVUEDelLoadFee" class="form-control btn btn-primary" style="display: table-cell; vertical-align: bottom; float: none;">REGISTRAR
             		<i class="glyphicon glyphicon-search" style="margin-left: 5px;"></i>
             	</label>
	        </div>
       	</div>
       	
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblVUEDelPaymentList"  class="table table-striped">
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

    <div id="divVUEDelControlReport" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUF.ma.panel.titleControlReport" text="Entrega de solicitud"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="formVUEDelControlReport" action="" method="POST">
                    <div class="row">
                        <div class="form-group col-sm-4">
                        	<input id="inputVUEDelIdRequest" name="inputVUEDelIdRequest" type="hidden" required>
                        	<input id="inputVUEDelIdOrdinance" name="inputVUEDelIdOrdinance" type="hidden" required>
                        	<input id="inputVUEDelPaymentOutput" name="inputVUEDelPaymentOutput" type="hidden" required>
                        	
							<label for="inputVUEDelNumberRequest" class="text-muted"><spring:message code="RequestVUF.lbl.nroRequest" text="N° Solicitud"/></label>
	                        <input class="form-control" id="inputVUEDelNumberRequest" name="inputVUEDelNumberRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                            <label for="inputVUEDelDateRequest" class="text-muted"><spring:message code="RequestVUF.lbl.dateRequest" text="Fecha Solicitud"/></label>
                            <input class="form-control" id="inputVUEDelDateRequest" name="inputVUEDelDateRequest" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-4">
                        	<label for="selVUEDelIdTypeUse" class="text-muted"><spring:message code="RequestVUF.lbl.typeUse" text="Uso Presentado"/></label>
                            <select class="form-control" id="selVUEDelIdTypeUse" name="selVUEDelIdTypeUse">
                                <c:forEach items="${typeUses}" var="typeUse">
									<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
								</c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputVUEDelNumberCatastro" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastro" text="N° Catastro"/></label>
                              <input class="form-control" id="inputVUEDelNumberCatastro" name="inputVUEDelNumberCatastro" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-6">
                              <label for="inputVUEDelNumberCatastroOld" class="text-muted"><spring:message code="RequestVUF.lbl.numberCatastroOld" text="N° Catastro Anterior"/></label>
                              <input class="form-control" id="inputVUEDelNumberCatastroOld" name="inputVUEDelNumberCatastroOld" type="text" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">
                              <label for="inputVUEDelAddress" class="text-muted"><spring:message code="RequestVUF.lbl.adress" text="Dirección"/></label>
                              <textarea class="form-control" id="inputVUEDelAddress" rows="3" readonly></textarea>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-3">
                              <label for="selVUEDelIdResponsibleOfficial" class="text-muted"><spring:message code="RequestVUF.lbl.responsibleOfficial" text="Funcionario revisor"/></label>
                              <select class="form-control" name="selVUEDelIdResponsibleOfficial" id="selVUEDelIdResponsibleOfficial">
	                             <c:forEach items="${responsibleOfficial}" var="official">
									<option value="${official.id_user_session}">${official.username}</option>
								 </c:forEach>
			                  </select>
                        </div>
                        <div class="form-group col-sm-5">
                              <label for="inputVUEDelResponsable" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Responsable"/></label>
                              <input class="form-control" name="inputVUEDelResponsable" id="inputVUEDelResponsable" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputVUEDelResponsableId" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="Cedula"/></label>
                              <input class="form-control" name="inputVUEDelResponsableId" id="inputVUEDelResponsableId" type="text" readonly>
                        </div>
                        <div class="form-group col-sm-2">
                              <label for="inputVUEDelResponsableCiv" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="CIV"/></label>
                              <input class="form-control" name="inputVUEDelResponsableCiv" id="inputVUEDelResponsableCiv" type="text" readonly>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-6">
                              <label for="inputVUEDelNameDelivery" class="text-muted"><spring:message code="RequestVUF.lbl.responsable" text="Nombre"/></label>
                              <input class="form-control" name="inputVUEDelNameDelivery" id="inputVUEDelNameDelivery" type="text" required
                              placeholder="Nombre">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputVUEDelIdDelivery" class="text-muted"><spring:message code="RequestVUF.lbl.responsableId" text="CI / Rif"/></label>
                              <input class="form-control" name="inputVUEDelIdDelivery" id="inputVUEDelIdDelivery" type="text" required
                              placeholder="CI / Rif">
                        </div>
                        <div class="form-group col-sm-3">
                              <label for="inputVUEDelDateDelivery" class="text-muted"><spring:message code="RequestVUF.lbl.responsableCiv" text="Fecha entrega"/></label>
                              <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input1" style="width: 100%">
				                 <input id="inputVUEDelDateDelivery" class="form-control" size="16" type="text" value="" readonly required>
				                 <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								 <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				              </div>
                        </div>
                    </div>
                    <div class="row center-block">
                    	<label id="btnVUEDelCancel" class="btn btn-warning">Cancelar</label>
                        <label id="btnVUEDelivery" class="btn btn-success">Entregar</label>
                    </div>
                </form>
            </div>
        </div>
       </div>
     </div>
    </div>
</div>
