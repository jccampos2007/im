<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
  <head>	
  	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>Sucre - Ingenieria Municipal</title>
    
    <link rel="shortcut icon" href="<c:url value="/resources/images/favicon.ico"/>" type="image/x-icon">
	<link rel="icon" href="<c:url value="/resources/images/favicon.ico"/>" type="image/x-icon">

    <!-- Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">    
    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet"> 
    <!-- Datatable -->
    <link href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css" rel="stylesheet">  
    <!-- PNotifiy -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/pnotify/3.0.0/pnotify.min.css" rel="stylesheet">  
    <!-- Custom Theme Style -->
    <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/custom-style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/multi-level.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-datetimepicker.min.css" />" rel="stylesheet">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css">
    
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
   
  </head>
  
  <input type="hidden" name="opt-action" id="opt-action" value="${action}"/>
  <input type="hidden" name="opt-message" id="opt-message" value="${message}"/>
  <input type="hidden" name="opt-title" id="opt-title" value="${title}"/>
  
  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
      	<!-- side menu -->
      	<div class="col-md-3 left_col">      		
  			<tiles:insertAttribute name="menu" ignore="true" />
		</div> 
		
		<!-- top navigation -->
		<div class="top_nav">     	
      		<tiles:insertAttribute name="header" ignore="true" />
      	</div>
        
        <!-- page content -->
        <div class="right_col" role="main"> 
        	<tiles:insertAttribute name="body"/>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <tiles:insertAttribute name="footer" ignore="true" />
        </footer>
        <!-- /footer content -->
      </div>
    </div>

	<!-- jQuery -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <!-- JQueryUI -->
    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
    <!-- JQuery-Validate -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.15.1/jquery.validate.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.15.0/additional-methods.min.js"></script>
    <!-- Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>	
	<!-- FastClick -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/fastclick/1.0.6/fastclick.min.js"></script>
    <!-- DataTable -->
    <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js "></script>
    <!-- PNotify -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pnotify/3.0.0/pnotify.min.js" type="text/javascript"></script>
	
    <script src="https://cdn.datatables.net/buttons/1.2.4/js/dataTables.buttons.min.js" type="text/javascript"></script>
    <script src="https://cdn.datatables.net/buttons/1.2.4/js/buttons.flash.min.js" type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js" type="text/javascript"></script>
    <script src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js" type="text/javascript"></script>
    <script src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js" type="text/javascript"></script>
    <script src="https://cdn.datatables.net/buttons/1.2.4/js/buttons.html5.min.js" type="text/javascript"></script>
    <script src="https://cdn.datatables.net/buttons/1.2.4/js/buttons.print.min.js" type="text/javascript"></script>
    
               
    <!-- Custom Theme Scripts -->
    
    <script src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment-with-locales.js"></script>
    <script src="<c:url value="/resources/js/bootstrap-datetimepicker.js" />"></script>
    
    <script src="<c:url value="/resources/dist/js/custom.1.0.0.min.js" />"></script>
    
    <script src="<c:url value="/resources/js/desplegable.js" />"></script>
    <%--Jquery-Plugin Numeric --%>
    <script src="<c:url value="/resources/dist/js/jquery.numeric.min.js" />"></script>
    <%--Jquery Mask Plugin --%>    
    <script src="<c:url value="/resources/dist/js/jquery.mask.min.js" />"></script>
    <script src="<c:url value="/resources/dist/js/webadmin.2.0.1.min.js" />"></script>    
    
    
    <script src="<c:url value="/resources/js/common.js?V=0.18" />"></script>
    <script src="<c:url value="/resources/js/requestVUF/recorder.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUF/supervisor.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUF/technical.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUF/supervisorApproval.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUF/managerApproval.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUF/delivery.js?V=0.012" />"></script>
    
    
    <script src="<c:url value="/resources/js/requestVUE/recorder.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUE/supervisor.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUE/technical.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUE/supervisorApproval.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUE/managerApproval.js?V=0.012" />"></script>
    <script src="<c:url value="/resources/js/requestVUE/delivery.js?V=0.012" />"></script>

  </body>
</html>