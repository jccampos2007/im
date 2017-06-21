/**
 * 
 */


(function(){
	
	
	var currentDate = new Date();
		
	var initDate = "2016-01-01";
	var finalDate = currentDate.getFullYear()+"-12-31";
	var licence = "none";
	
	var table = $('#driver_services_table').DataTable({
		"dom": 'Bltipr',
		"lengthMenu": [[10, 25, 50, 100, 200, 1000], [10, 25, 50, 100, 200, "Todos"]],
		"processing": true,
		"paging":true,
		 "serverSide" : true,
		 "lenthChange" : true,
		 "iDisplayLength" : 10,
		 "order": [[ 5, "asc" ]],
		 buttons: [
		            {
		               extend:    'excelHtml5',
		               className: 'btn btn-primary pull-right',
		               text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
		           }
		        ],
		   "sAjaxSource" : "drivers/services/"+initDate+"/"+finalDate+"/"+licence,
		   
	        "columns": [
	            { "data": "d_driverLicense" },	                    
	            { "data": "typeServiceName" },
	            { "data": "d_firstName" },
	            { "data": "d_fathersLastName" },
	            { "data": "t_vehiclePlate" },
	            { "data": "srv_createdDate" },
	            { "data": "sr_Origen" },
	            { "data": "sr_Destino" },
	            { "data": "distanceFormatted" },
	            { "data": "srv_totalAmmount" },
	            { "data": "t_TaxiCorpName" }
	        ],
	       "language": {
	    	   "paginate": {
	    		   "first":"Primero",
	    		   "previous": "Anterior",
	    		   "next": "Siguiente",
	    		   "last":"Ultimo"
	    	   },
	    	   "lengthMenu"		: "Mostrar _MENU_",
	    	   "zeroRecords"	: "No se encontraron resultados.",
	    	   "info"			: "P&aacute;gina _PAGE_ de _PAGES_ / _TOTAL_ registros totales",
	    	   "infoEmpty"		: "No se encontraron registros.",
	    	   "infoFiltered"	: "",
	    	   "search"			: "Buscar:",
    		   "processing"		: "Procesando..."
	       },
	       "initComplete": function(settings, json) {
	    	   var options ="";
	     	   if ( table.data().count() > 0) {
	     		   		
	    	    	   var d = table.row( 0 ).data();
	    	    	   var countries = d.diverServiceVoucherTotal;
	    	    	   var i = 0;
	    	    	   
	    	    	   $('#totalAmmount').html(d.totalAmmount);
	    	    	   while (i < countries.length) {
	    					options += "<tr><td>"+countries[i].sr_ContryName+"</td><td>"+countries[i].sr_ServiceRecord_Count+"</td><td>"+countries[i].sr_serviceType_1+"</td><td>"+countries[i].sr_serviceType_2+"</td><td>"+countries[i].sr_serviceType_3+"</td><td>"+countries[i].sr_serviceType_4+"</td></tr>";
	    					i++;				
	    				}
	    	    	   
	     		}else{
	     			options += "<tr><td colspan='6'>No se encontraron resultados.</td></tr>";
	     		}
	     	   $('#driverServicesGlobal').html(options);
	       }	       
    });
	
	$('#columna0').on( 'keyup', function () {
	    table.column(0).search( this.value ).draw();
	} );
	$('#columna1').on( 'keyup', function () {
	    table.column(1).search( this.value ).draw();
	} );
	$('#columna2').on( 'keyup', function () {
	    table.column(2).search( this.value ).draw();
	} );
	$('#columna3').on( 'keyup', function () {
	    table.column(3).search( this.value ).draw();
	} );
	$('#columna4').on( 'keyup', function () {
	    table.column(4).search( this.value ).draw();
	} );
	$('#columna5').on( 'keyup', function () {
	    table.column(5).search( this.value ).draw();
	} );
	$('#columna6').on( 'keyup', function () {
	    table.column(6).search( this.value ).draw();
	} );
	$('#columna7').on( 'keyup', function () {
	    table.column(7).search( this.value ).draw();
	} );
	$('#columna8').on( 'keyup', function () {
	    table.column(8).search( this.value ).draw();
	} );
	$('#columna9').on( 'keyup', function () {
	    table.column(9).search( this.value ).draw();
	} );
	$('#columna10').on( 'keyup', function () {
	    table.column(10).search( this.value ).draw();
	} );
	
	var myCallback = function () {
		var options ="";
  	   if ( table.data().count() > 0) {
  		 
 	    	   var d = table.row( 0 ).data();
 	    	   var countries = d.diverServiceVoucherTotal;
 	    	   var i = 0;
 	    	   
 	    	  $('#totalAmmount').html(d.totalAmmount);
 	    	   while (i < countries.length) {
 					options += "<tr><td>"+countries[i].sr_ContryName+"</td><td>"+countries[i].sr_ServiceRecord_Count+"</td><td>"+countries[i].sr_serviceType_1+"</td><td>"+countries[i].sr_serviceType_2+"</td><td>"+countries[i].sr_serviceType_3+"</td><td>"+countries[i].sr_serviceType_4+"</td></tr>";
 					i++;				
 				}
 	    	   
  		}else{
 			options += "<tr><td colspan='6'>No se encontraron resultados.</td></tr>";
 		}
  	   
  	   $('#driverServicesGlobal').html(options);
	
	};
	
	
	/*
	$( "#startServiceDate" ).datepicker({
		dateFormat: "yy-mm-dd",
		 changeMonth: true, 
		 changeYear: true,
		 maxDate: 0,
		 yearRange: "-100:+0", 
	});
	
	$( "#endServiceDate" ).datepicker({
		dateFormat: "yy-mm-dd",
		 changeMonth: true, 
		 changeYear: true,
		 maxDate: 0,
		 yearRange: "-100:+0", 
		
	});
	*/
	//NUEVOS DATEPICKER
	$('#initialDateDService').datetimepicker({
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
        $('#finalDateDService').datetimepicker('setStartDate', minDate);
    });
	
	
$('#finalDateDService').datetimepicker({
		endDate: '+0d',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });

$('#searchDService').on('click', function(e){
	

	var startSearch;
	var endSearch;
	var lic;
	
	if($("#inputDriverLicence").val()==""){
		lic = "none";
	}else{
		lic = $("#inputDriverLicence").val();
	}
	
	if($("#txtInitialDate").val()==""){
		startSearch = "2016-01-01";
	}else{
		startSearch = $("#txtInitialDate").val();
	}
	
	if($("#txtFinalDate").val()==""){
		endSearch = currentDate.getFullYear()+"-"+(currentDate.getMonth()+1)+"-"+(currentDate.getDate()+1);
	}else{
		endSearch = $("#txtFinalDate").val();
	}

	
	table.ajax.url("drivers/services/"+startSearch+"/"+endSearch+"/"+lic).load(myCallback);
});
	
setInterval(function() {
	var startSearch;
	var endSearch;
	var lic;
	
	if($("#inputDriverLicence").val()==""){
		lic = "none";
	}else{
		lic = $("#inputDriverLicence").val();
	}
	
	if($("#txtInitialDate").val()==""){
		startSearch = "2016-01-01";
	}else{
		startSearch = $("#txtInitialDate").val();
	}
	
	if($("#txtFinalDate").val()==""){
		endSearch = currentDate.getFullYear()+"-"+(currentDate.getMonth()+1)+"-"+(currentDate.getDate()+1);
	}else{
		endSearch = $("#txtFinalDate").val();
	}

	
	table.ajax.url("drivers/services/"+startSearch+"/"+endSearch+"/"+lic).load(myCallback);
}, 60000);

	
})();