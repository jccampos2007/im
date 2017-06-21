<!-- abreviación Doc -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">
    <div class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUE.page.title" text="Consulta Preliminar de variables urbanas fundamentales"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <form id="form-corporate" action="/corporate" method="POST">
                  <h4><spring:message code="lbl.title" text="Buscar N° de Solicitud"/></h4>
                    <div class="row">
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputSupSearchNumberRequest" id="inputSupSearchNumberRequest" type="text" placeholder="N° Solicitud">
                      </div>
                      <div class="form-group col-sm-3">
                        <input class="form-control" name="inputSupSearchResponsable" id="inputSupSearchResponsable" type="text" placeholder="Nombre Responsable">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputSupSearchDateRequestFrom" id="inputSupSearchDateRequestFrom" type="text" placeholder="Fecha Desde">
                      </div>
                      <div class="form-group col-sm-2">
                        <input class="form-control" name="inputSupSearchDateRequestTo" id="inputSupSearchDateRequestTo" type="text" placeholder="Fecha Hasta">
                      </div>
                      <div class="form-group col-sm-2">
                        <button type="button" id="btnSupSearch" class="btn btn-default"><spring:message code="btn.query.title" text="Consultar"/>&nbsp;
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

    <div id="divVUESupInbox" class="col-md-12 col-sm-12 col-xs-12">
     <div class="x_panel tile">
       <div class="x_title">
         <h2><spring:message code="requestVUE.sup.panel.titleInbox" text="Bandeja"/></h2>
         <div class="clearfix"></div>
       </div>
       <div class="x_content">
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
            	<table id="tblVUESupInbox"  class="table table-striped">
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
    
</div>
    
<%-- Modal --%>
<div id="divSupAssignOfficial" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
	  <form id="formSupAssignOfficial" method="POST">
	    <div class="modal-header">
	      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
	      </button>
	      <h4 class="modal-title" id="myModalLabel2">Asignar Técnico</h4>
	    </div>
	    <div class="modal-body">
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUE.lbl.numberRequest" text="N° Solicitud:"/></label>
                <input class="form-control" id="inputSupNumberRequest" name="inputSupNumberRequest" type="text" readonly>
                <input id="inputSupIdRequest" name="inputSupIdRequest" type="hidden" value="0">
                <input id="inputSupIdTypeUse" name="inputSupIdTypeUse" type="hidden">
                <input id="inputSupNumberCatastroOld" name="inputSupNumberCatastroOld" type="hidden">
                <input id="inputSupResponsableCiv" name="inputSupResponsableCiv" type="hidden">
                <input id="inputSupIdOrdinance" name="inputSupIdOrdinance" type="hidden">
                <input id="inputSupPaymentOutput" name="inputSupPaymentOutput" type="hidden">
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUE.lbl.dateRequest" text="Facha:"/></label>
                <input class="form-control" id="inputSupDateRequest" name="inputSupDateRequest" type="text" readonly>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUE.lbl.typeUse" text="Tipo de Uso:"/></label>
                <select class="form-control" name="selSupIdTypeUse" id="selSupIdTypeUse">
					<c:forEach items="${typeUses}" var="typeUse">
						<option value="${typeUse.id_type_use}">${typeUse.name_type_use}</option>
					</c:forEach>
	            </select>
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUE.lbl.numberCatastro" text="N° Catastro:"/></label>
                <input class="form-control" id="inputSupNumberCatastro" name="inputSupNumberCatastro" type="text" readonly>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUE.lbl.responsable" text="Responsable:"/></label>
                <input class="form-control" id="inputSupResponsable" name="inputSupResponsable" type="text" readonly>
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUE.lbl.numberCatastroOld" text="CI / Rif:"/></label>
                <input class="form-control" id="inputSupResponsableId" name="inputSupResponsableId" type="text" readonly>
            </div>
    	  </div>
	      <div class="row">
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUE.lbl.address" text="Dirección:"/></label>
                <input class="form-control" id="inputSupAddress" name="inputSupAddress" type="text" readonly>
            </div>
            <div class="form-group col-sm-6">
                <label class="text-muted"><spring:message code="RequestVUE.lbl.responsibleOfficial" text="Asignar Tecnico:"/></label>
                <select class="form-control" name="selSupIdResponsibleOfficial" id="selSupIdResponsibleOfficial">
                    <c:forEach items="${responsibleOfficial}" var="official">
						<option value="${official.id_user_session}">${official.username}</option>
					</c:forEach>
                </select>
	        </div>
    	  </div>
	    </div>
	    <div class="modal-footer">
	      <button type="button" class="btn btn-default" data-dismiss="modal"><spring:message code="btn.cancel.title" text="Cancelar"/></button>
	      <button type="button" id="btnVUESupAssignOfficial" class="btn btn-primary"><spring:message text="Enviar"/></button><!--  code="btn.delete.title"  -->
	    </div>
      </form>
    </div>
  </div>
</div>


