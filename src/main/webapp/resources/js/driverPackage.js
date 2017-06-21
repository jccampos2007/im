/**
 * 
 */


(function(){
	
	var table = $('#driver_reload_table').DataTable({
		"dom": 'Bltipr',
		"processing": true,
		"paging":true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,	
		 buttons: [
            {
               extend:    'excelHtml5',
               className: 'btn btn-primary pull-right',
               text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
           }
        ],
		"sAjaxSource" : "driverReloadList",
	   
        "columns": [
            { "data": "dp_DateTime_Buy" },
            { "data": "p_name" },
            { "data": "p_realAmount" }
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
	
})();