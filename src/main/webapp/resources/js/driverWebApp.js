/**
 * 
 */


$(document).ready(function(){
	
	var table = $('#driver_services_webApp_table').DataTable({
		"dom": 'Bltipr',
		"processing": true,
		"paging":true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,	
		"sAjaxSource" : "driverServicesWebApp",
		"order": [[ 0, "desc" ]],
		 buttons: [
            {
               extend:    'excelHtml5',
               className: 'btn btn-primary pull-right',
               text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
           }
        ],
		buttons: [
            {
               extend:    'excelHtml5',
               className: 'btn btn-primary pull-right',
               text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
           }
		], 
		"columnDefs": [	  
   	       { targets: [0], visible: false}
        ],
        "columns": [
            { "data": "idServiceRecord" },
            { "data": "typeServiceName" },
            { "data": "t_VehiclePlate" },
            { "data": "createdDateFormat" },
            { "data": "pickUpLocation" },
            { "data": "dropOffLocation" },
            { "data": "srv_distance" },
            { "data": "srv_totalAmmount" }
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
    	   "info"			: "P&aacute;gina _PAGE_ de _PAGES_",
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
	
});