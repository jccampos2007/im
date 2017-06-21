/**
 * 
 */


(function(){
	
	
	var table = $('#table_connections').DataTable({
		   "sDom": 'Bltipr',
		   "processing": true,
		   "serverSide" : true,
		   "lengthMenu": [[10, 25, 50, 100, 200, 1000], [10, 25, 50, 100, 200, "Todos"]],
		   "iDisplayLength" : 10,
		   "autoWidth": false,
		 "iDisplayLength" : 10,
		buttons: [
		            {
		               extend:    'excelHtml5',
		               className: 'btn btn-primary  pull-right',
		               text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
		           }
		        ],
		        
		   "sAjaxSource" : "connection/list",
		   
	        "columns": [
	            { "data": "p_WorkContryName" },
	            { "data": "p_WorkStateName" },
	            { "data": "p_WorkCityName" },
	            { "data": "d_firstName" },
	            { "data": "d_fathersLastName" },
	            { "data": "d_driverLicense" },
	            { "data": "statusDriverName" },
	            { "data": "d_statusDriverTime" },
	            { "data": "tc_TaxiCorpName" }
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
	    	    	   var countries = d.driverOnlineTotal;
	    	    	   var i = 0;
	    	    	   
	    	    	   
	    	    	   while (i < countries.length) {
	    					options += "<tr><td>"+countries[i].p_WorkContryName+"</td><td>"+countries[i].driver_Count+"</td><td>"+countries[i].d_StatusOnline+"</td><td>"+countries[i].d_StatusOnlinePCT+"</td></tr>";
	    					i++;				
	    				}
	    	    	   
	     		}
	     	   $('#connectionGlobal').html(options);
	       }		       
 });
	
	var myCallback = function () {
		var options ="";
  	   if ( table.data().count() > 0) {
  		 
 	    	   var d = table.row( 0 ).data();
 	    	   var countries = d.driverOnlineTotal;
 	    	   var i = 0;
 	    	   
 	    	   
 	    	   while (i < countries.length) {
 					options += "<tr><td>"+countries[i].p_WorkContryName+"</td><td>"+countries[i].driver_Count+"</td><td>"+countries[i].d_StatusOnline+"</td><td>"+countries[i].d_StatusOnlinePCT+"</td></tr>";
 					i++;				
 				}
 	    	   
  		}
  	   $('#connectionGlobal').html(options);
	};
	
	
	setInterval(function() {
			table.ajax.url("connection/list").load(myCallback);
	}, 10000);
	
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
	
	
})();