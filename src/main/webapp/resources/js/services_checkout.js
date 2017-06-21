/**
 * 
 */

$(document).ready(function(){
	
	var form = $( "#form-ServicesCheckout" );
	
	var table = $('#tabla_services_checkout').DataTable({
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
	   "sAjaxSource" : "finishedServicesList/na/na",
		buttons: [
		            {
		               extend:    'excelHtml5',
		               className: 'btn btn-primary  pull-right',
		               text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
		           }
		],
	   "columnDefs": [
            {
	        	"targets":-1,
	        	"data":null, 
	        	"defaultContent": 
		            '<a href="#" id="btn_view" class="glyphicon glyphicon-eye-open text-muted"></a>&nbsp;'           	   
            }
        ],
        "columns": [
            { "data": "formatPickUpDate" },
            { "data": "formatPickUpTime" },
            { "data": "pickUpLocation" },
            { "data": "dropOffLocation" },
            { "data": "adminFinishedServicesAditional.username" },
            { "data": "totalAmmount" },
            { "data": null}
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
       },
       "success" : function(data){
           //do stuff here
            fnCallback(data);
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
	
	$('#tabla_services_checkout tbody').on( 'click', '#btn_view', function () {
		var data = table.row( $(this).parents('tr') ).data();

		$('#lbl_pickupdate').html(data.formatPickUpDate);
		$('#lbl_pickuptime').html(data.formatPickUpTime);
		$('#lbl_username').html(data.adminFinishedServicesAditional.username);
		$('#lbl_pickUpLocation').html(data.pickUpLocation);
		$('#lbl_dropOffLocation').html(data.dropOffLocation);
		$('#lbl_totalAmmount').html(data.totalAmmount);
		
		$('.modal').modal({show:true});

	});
	
	$('#searchServicesCheckout').on('click', function(e){

		if(form.valid()){
			var startSearch;
			var endSearch;
			
			if ($("#txtDateIni").val() == ''){
				startSearch = "na";
				endSearch = "na";
			}else{
				startSearch = $("#txtDateIni").val();
				startSearch = startSearch.split("/").reverse().join("-");

				endSearch = $("#txtDateEnd").val();
				endSearch = endSearch.split("/").reverse().join("-");
			}
			
			table.ajax.url("finishedServicesList/"+startSearch+"/"+endSearch).load();
		}
		
	});
});