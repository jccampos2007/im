<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="contaier" style="padding-top: 10%">
	<div class="row">
		<div class="col-sm-6 col-sm-offset-3">
			<div class="row" style="background: #fff">
				<div class="col-sm-4" id="loginLogo">
		             <div class="container col-sm-12 logo-cont">
		                 <img src="resources/images/login_img.png" align="center">
		             </div>
		        </div>
		        <div class="col-sm-8" id="form-login">
					<form id="form_login" action="/login" method="post">
						<div class="col-sm-12"><h2 class="col-sm-10" style="color:#fff !important;" ><spring:message code="login.title" text="Iniciar Sesi&oacute;n"/></h2></div>
						<div class="text-center">
							<p id="errorContainer" class="text-danger fade_out" style="color:red !important;">${error}&nbsp;</p>
						</div>				
						<div class="form-group col-sm-12">
		                	<input class="form-control input-lg"
		                		placeholder="<spring:message code="login.lbl.username" text="Usuario"/>" 
		                		name="username" id="usernaame"/>
		             	</div>
		             	<div class="form-group col-sm-12">
			                 <input type="password" class="form-control input-lg" 
			                 	placeholder="<spring:message code="login.lbl.password" text="Contraseña"/>" 
			                 	name="password" id="password"/>
			            </div>
						<div class="form-group col-sm-6 pull-left text-left">
			                <input type="checkbox" name="remember" class="text-muted" value=""/>&nbsp;<span style="color:#fff !important;"><spring:message code="login.lbl.remember" text="Recuerdame"/></span>
			            </div>
			            <div class="form-group col-sm-6 pull-right text-right">
			                <a href="/forgot" id="forgotPass"><spring:message code="login.lbl.forgot.pass" text="&iquest;Olvid&oacute; su Contrase&#241;a&#63;"/></a>
			            </div>
			            <div class="form-group col-sm-12">
			                <input type="submit" class="btn btn-lg btn-success col-sm-12" value="<spring:message code="login.btn.login" text="Ingresar"/>">
			            </div>
					</form>    
		        </div>
			</div>
		</div>
	</div>
</div>