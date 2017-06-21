/**
 * 
 */

(function(){
	
	
	
	var table = $('#river_report_table').DataTable({
		   "sDom": 'Bltipr',
		   "lengthMenu": [[10, 25, 50, 100, 200, 1000], [10, 25, 50, 100, 200, "Todos"]],
		   "processing": true,
		   "paging":true,
		   "serverSide" : true,
		   "lenthChange" : true,
		   "order": [[ 6, "asc" ]],
		   "iDisplayLength" : 10,	
		   buttons: [
			            {
			               extend:    'excelHtml5',
			               className: 'btn btn-primary  pull-right',
			               text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
			           }
			        ],		
		   "sAjaxSource" : "riderInf/list",
		   
	        "columns": [
	            { "data": "r_names" },
	            { "data": "r_lastNames" },
	            { "data": "u_username" },
	            { "data": "r_email" },
	            { "data": "r_mobile" },
	            { "data": "r_CountryName" },
	            { "data": "r_createdDate" },
	            { "data": "c_name" },
	            { "data": "r_statusName" }
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
	    	   "infoEmpty"		: "No se Encontraron Registros.",
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