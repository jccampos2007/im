/**
 * 
 */

$(document).ready(function(){
	
	var form = $( "#form-userCompanyServiceList" );
	
	$('#divDateIni').datetimepicker({
		endDate: '+0d',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
		
		
	$('#divDateEnd').datetimepicker({
		endDate: '+0d',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
	
	var table = $('#tabla_user_company_services').DataTable({
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
		"sAjaxSource" : "corporate/userCompanyServiceList/na/na",
		"columns": [
            { "data": "sr_pickUpTime" },
            { "data": "uc_DepartmentName" },
            { "data": "r_names" },
            { "data": "r_email" },
            { "data": "sr_pickUpLocation" },
            { "data": "sr_dropOffLocation" },
            { "data": "srv_totalAmmountFormatted" }
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
	    "initComplete": function(settings, json) {
		   var total = 0;
		   if ( table.data().count() > 0) {
			 
	    	   var d = table.column(6).data();
	    	   var i = 0;	    	   
	    	   
	    	   while (i < d.length) {
	    		   total += parseFloat(d[i].replace(",","."));
	    		   i++;				
	    	   }
		   }
		   
		   $('#lblTotal').html('$'+total);
	   }
    });
	
	form.validate({

        rules: {
        	"dateIni": {
	            required: true
	          },
	        "dateEnd": {
		        required: true
		      }
        },
        messages: {
            "dateIni": {
                required: 'La Fecha Inicio de Movimiento es Requerida'
            },
            "dateEnd": {
                required: 'La Fecha Fin de Movimiento es Requerida'
            }
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
	
	$('#searchUserCompanyServiceList').on('click', function(e){

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
			
			table.ajax.url("corporate/userCompanyServiceList/"+startSearch+"/"+endSearch).load(myCallback);
		}
		
	});

	var myCallback = function () {
		var total = 0;
 		if ( table.data().count() > 0) {
	 
		   var d = table.column(6).data();
		   var i = 0;	    	   
	   
		   while (i < d.length) {
			   total += d[i];
			   i++;				
		   }
 		}
   
 		$('#lblTotal').html('$'+total);

	};
	
});

