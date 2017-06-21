/**
 * 
 */


(function(){
	
var currentDate = new Date();
	
//var initDate = currentDate.getFullYear()+"-"+(currentDate.getMonth()+1)+"-"+currentDate.getDate();
//var finalDate = currentDate.getFullYear()+"-"+(currentDate.getMonth()+1)+"-"+(currentDate.getDate()+1);

var initDate = "none";
var finalDate = "none";
var licence = "none";

var downloading = false;
var downloadTimestamp = null;
	var table = $('#table_connections_history').DataTable({
		"dom": 'Bltipr',
		 buttons: [
		            {
		               extend:    'excelHtml5',
		               className: 'btn btn-primary pull-right',
		               text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
		           }
		        ],
        //"order": [[ 6, "asc" ]],
		"processing": true,
		"paging":true,
		"order": [[ 2, "asc" ]],
		"lengthMenu": [[10, 25, 50, 100, 200, 1000], [10, 25, 50, 100, 200, "Todos"]],
		 "serverSide" : true,
		 "lenthChange" : true,
		  // "iDisplayLength" : 10,		   
		   "sAjaxSource" : "driverConnectionHistory/list/"+initDate+"/"+finalDate+"/"+licence,
		   
	        "columns": [
	            { "data": "d_statusName" },
	            { "data": "dh_statusDriverTime" },
	            { "data": "dh_statusDate_start" }
	        ],
	       "language": {
	    	   "paginate": {
	    		   "first":"Primero",
	    		   "previous": "Anterior",
	    		   "next": "Siguiente",
	    		   "last":"Ultimo"
	    	   },
	    	   "lengthMenu"		: "Mostrar _MENU_ ",
	    	   "zeroRecords"	: "No se encontraron resultados.",
	    	   "info"			: "P&aacute;gina _PAGE_ de _PAGES_ / _TOTAL_ registros totales",
	    	   "infoEmpty"		: "No se encontraron registros.",
	    	   "infoFiltered"	: "",
	    	   "search"			: "Buscar:",
    		   "processing"		: "Procesando..."
	       }
    });
	
	$('#columna0').on( 'keyup', function () {
	    table.column(0).search( this.value ).draw();
	} );
	$('#columna1').on( 'keyup', function () {
	    table.column(1).search( this.value ).draw();
	} );
	$('#columna2').on( 'keyup', function () {
	    table.column(1).search( this.value ).draw();
	} );
	
	
	var myCallback = function () {
		var options ="";
  	   if ( table.data().count() > 0) {
  		 
 	    	   var d = table.row( 0 ).data();
 	    	   
 	    	   
 	    	   $('#name').html(d.d_name);
 	    	   $('#lastName').html(d.d_lastName);
 	    	   $('#licence').html(d.d_licence);
 	    	   $('#currentStatus').html(d.currentStatusName);
 	    	  $('#driverInfo').show();
 	    	   
  		}else{
  			options = ""
  		}
	};
	
$('#searchStatus').on('click', function(e){
		

		var startSearch;
		var endSearch;
		var licenceSearch;
		
		if($("#txtInitialDate").val()==""){
			startSearch = "none";
		}else{
			startSearch = $("#txtInitialDate").val();
		}
		
		if($("#txtFinalDate").val()==""){
			endSearch = "none";
		}else{
			endSearch = $("#txtFinalDate").val();
		}
		
		if($("#driverLicense").val()==""){
			licenceSearch = "none";
		}else{
			licenceSearch = $("#driverLicense").val();
		}
	
		
		table.ajax.url("driverConnectionHistory/list/"+startSearch+"/"+endSearch+"/"+licenceSearch).load(myCallback);
	});

$('#initialDateStatus').datetimepicker({
		endDate: '+0d',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    }).on('changeDate', function (selected) {
        var minDate = new Date(selected.date.valueOf());
        $("#txtFinalDate").val("");
        $('#finalDateStatus').datetimepicker('setStartDate', minDate);
    });
	
	
$('#finalDateStatus').datetimepicker({
		endDate: '+0d',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
	
	
})();