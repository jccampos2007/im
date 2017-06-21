<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="contaier" style="padding-top: 10%">
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3">
			<div class="row" style="background: #ffd500">
				<div class="col-sm-4" id="loginLogo">
		             <div class="container col-sm-12 logo-cont">
		                 <img src="resources/images/login_img.png" align="center">
		             </div>
		        </div>
		        <div class="col-sm-8" id="form-login">
					<form id="form-login-forgot" action="/forgot" method="post">
						<h2 class="col-sm-12" style="color:#fff !important;"><spring:message code="session.timeout.title" text="Sesi&oacute;n expirada"/></h2>				
						<div class="form-group col-sm-12">
		                	<span style="color:#fff !important;"><spring:message code="session.timeout.detail" text="El tiempo de la sesión a expirado, por favor debe hacer login de nuevo"/></span>
		             	</div>
			            <div class="form-group col-sm-12">&nbsp;</div>
			            <div class="form-group col-sm-12">&nbsp;</div>
			            <div class="form-group col-sm-12 text-center">
			                <a href="/" id="forgotPass"><spring:message code="session.timeout.link" text="Volver al inicio de sesi&oacute;n"/></a>
			            </div>
			            <div class="form-group col-sm-12">&nbsp;</div>
			            <div class="form-group col-sm-12">&nbsp;</div> 
					</form>    
		        </div>
			</div>
		</div>
	</div>
</div>