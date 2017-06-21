/**
 * 
 */


(function(){
	
	
	
	var driverLicence="none";

	var table = $('#rating_table').DataTable({
		"dom": 'Bltipr',
		"lengthMenu": [[10, 25, 50, 100, 200, 1000], [10, 25, 50, 100, 200, "Todos"]],
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
		   "sAjaxSource" : "review/list/"+driverLicence,
		   /*
		   "columnDefs": [
                //{ targets: [0], visible: false},
	            {
		        	"targets":-1,
		        	"data":null, 
		        	"defaultContent": 
		        		
			            '<a href="#" id="query" class="glyphicon glyphicon-eye-open text-muted"></a>&nbsp;'        	   
	            }
	        ],
	        */
	        "columns": [

	            { "data": "d_driverLicense"},
	            { "data": "d_firstName" },
	            { "data": "d_fathersLastName" },
	            { "data": "d_email" },
	            { "data": "d_mobile" },
	            { "data": "ratingStars" },
	            { "data": "d_WorkCityName" }
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
	    	   "infoFiltered"	: "_MAX_ registros totales",
	    	   "search"			: "Buscar:",
    		   "processing"		: "Procesando..."
	       },
	       "initComplete": function(settings, json) {
	    	   var options ="";
	     	   if ( table.data().count() > 0) {
	     		 
	    	    	   var d = table.row( 0 ).data();
	    	    	   var globals = d.driverReviewTotal;
	    	    	   var i = 0;
	    	    	   
	    	    	   
	    	    	   while (i < globals.length) {
	    	    		   options += "<tr><td>"+globals[i].d_WorkContryName+"</td><td>"+globals[i].d_Driver_Count+"</td><td>"+globals[i].d_Rate_Excelente+"</td><td>"+globals[i].d_Rate_Bueno+"</td><td>"+globals[i].d_Rate_Malo+"</td><td>"+globals[i].d_Rate_SinCalificar+"</td></tr>";
	    					i++;				
	    				}
	    	    	   
	     		}else{
	     			options += "<tr><td colspan='6'>No se encontraron resultados.</td></tr>";
	     		}
	     	   
	     	   $('#globalReview').html(options);
	    	
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
	
	var myCallback = function () {
		var options ="";
 	   if ( table.data().count() > 0) {
 		 
	    	   var d = table.row( 0 ).data();
	    	   var globals = d.driverReviewTotal;
	    	   var i = 0;
	    	   
	    	   
	    	   while (i < globals.length) {
					options += "<tr><td>"+globals[i].d_WorkContryName+"</td><td>"+globals[i].d_Driver_Count+"</td><td>"+globals[i].d_Rate_Excelente+"</td><td>"+globals[i].d_Rate_Bueno+"</td><td>"+globals[i].d_Rate_Malo+"</td><td>"+globals[i].d_Rate_SinCalificar+"</td></tr>";
					i++;				
				}
	    	   
 		}
 	   $('#globalReview').html(options);
	
	};
	
$('#searchReview').on('click', function(e){
		
		
		var license = "none";
		/*
		if($("#driverLicense").val()==""){
			license = "none";
		}else{
			license = $("#driverLicense").val();
		}*/
		
		table.ajax.url("review/list/"+license).load(myCallback);
	});

setInterval(function() {
	var license = "none";
	
	/*if($("#driverLicense").val()==""){
		license = "none";
	}else{
		license = $("#driverLicense").val();
	}*/
	
	table.ajax.url("review/list/"+license).load(myCallback);
}, 10000);
	
	$('#rating_table tbody').on( 'click', '#query', function () {
        var data = table.row( $(this).parents('tr') ).data();
        $('#driverName').html(data.driverNames+" "+data.driverLastNames);
        $('#modalRating').modal({show:true});
    } );
	
	
})();