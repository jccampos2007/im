<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="role" value="${user.role_by_module}"/>

<div class="left_col scroll-view col-sm-12" style="padding: 0px;">
    <div class="navbar nav_title site_title" style="border: 0;">
        <img src="${pageContext.request.contextPath}/resources/images/resized_330x50/taxinet.jpg" alt="..."><span style="color:#000;">Sucre</span>
    </div>

    <div class="clearfix"></div>

    <br />

    <!-- sidebar menu -->
    <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
      <div class="menu_section">
        <h3>&nbsp;</h3>
        <ul class="nav side-menu">
	     <li><a><i class="fa fa-home"></i> Panel Principal <span class="fa fa-chevron-down"></span></a>
         	<ul class="nav child_menu">
             <li><a href="/panel">Panel</a></li>
           </ul>
         </li>
         <li><a><i class="fa fa-edit"></i> Solicitud VUF <span class="fa fa-chevron-down"></span></a>
           <ul class="nav child_menu">
            <c:forEach var="item" items="${role}">
              <c:if test="${item.id_module==1}">
           	    <li><a href="/VUF/recorder">Registro</a></li>
           	  </c:if>
              <c:if test="${item.id_module==2}">
	           	<li><a href="/VUF/supervisor">Supervisor</a></li>
           	  </c:if>
              <c:if test="${item.id_module==3}">
	           	<li><a href="/VUF/technical">Técnico</a></li>
           	  </c:if>
              <c:if test="${item.id_module==4}">
	           	<li><a href="/VUF/supervisorApproval">Aprobación Supervisor</a></li>
           	  </c:if>
              <c:if test="${item.id_module==5}">
	           	<li><a href="/VUF/managerApproval">Aprobación Director</a></li>
           	  </c:if>
              <c:if test="${item.id_module==6}">
	           	<li><a href="/VUF/delivery">Entrega</a></li>
           	  </c:if>
           	</c:forEach>
           </ul>
         </li>
         <li><a><i class="fa fa-edit"></i> Solicitud VUE <span class="fa fa-chevron-down"></span></a>
           <ul class="nav child_menu">
            <c:forEach var="itemVUE" items="${role}">
              <c:if test="${itemVUE.id_module==7}">
           	    <li><a href="/VUE/recorder">Registro</a></li>
           	  </c:if>
              <c:if test="${itemVUE.id_module==8}">
	           	<li><a href="/VUE/supervisor">Supervisor</a></li>
           	  </c:if>
              <c:if test="${itemVUE.id_module==9}">
	           	<li><a href="/VUE/technical">Técnico</a></li>
           	  </c:if>
              <c:if test="${itemVUE.id_module==10}">
	           	<li><a href="/VUE/supervisorApproval">Aprobación Supervisor</a></li>
           	  </c:if>
              <c:if test="${itemVUE.id_module==11}">
	           	<li><a href="/VUE/managerApproval">Aprobación Director</a></li>
           	  </c:if>
              <c:if test="${itemVUE.id_module==12}">
	           	<li><a href="/VUE/delivery">Entrega</a></li>
           	  </c:if>
           	</c:forEach>
           </ul>
         </li>
        </ul>
      </div>
    </div>
  </div>