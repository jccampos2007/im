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
						<h2 class="col-sm-12" style="color:#fff !important;"><spring:message code="forgot.title" text="Restablecer contrase&ntilde;a"/></h2>				
						<div class="form-group col-sm-12">
		                	<span style="color:#fff !important;"><spring:message code="forgot.detail" text="Envíe su dirección de correo electrónico y le reenviaremos un enlace para restablecer su contraseña"/></span>
		             		<p class="text-danger fade_out" style="color:red !important;">${error}&nbsp;</p>
		             		<p style="color:#fff !important;">${success} &nbsp;</p>
		             	</div>
		             	<div class="form-group col-sm-12">
			                 <input type="text" class="form-control input-lg" id="email" 
			                 	placeholder="<spring:message code="forgot.lbl.email" text="Correo Electr&oacute;nico"/>" 
			                 	name="username"/>
			            </div>
			            <div class="form-group col-sm-12">
			                <input type="submit" class="btn btn-lg btn-primary col-sm-12" value="<spring:message code="forgot.lbl.send" text="Enviar"/>">
			            </div>
			            <div class="form-group col-sm-12 pull-right text-right">
			                <a href="/" id="forgotPass"><spring:message code="forgot.title.link.login" text="Volver a intentar iniciar sesi&oacute;n"/></a>
			            </div>
					</form>    
		        </div>
			</div>
		</div>
	</div>
</div>