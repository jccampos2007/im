/**
 * 
 */

var x = "";

(function(){
	var currentDate = new Date();
	
	//var initDate = currentDate.getFullYear()+"-"+(currentDate.getMonth()+1)+"-"+currentDate.getDate();
	//var finalDate = currentDate.getFullYear()+"-"+(currentDate.getMonth()+1)+"-"+(currentDate.getDate()+1);
	
	var initDate = "2016-01-01";
	var finalDate = currentDate.getFullYear()+"-12-31";

	var table = $('#river_services_table').DataTable({
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
		"sAjaxSource" : "riders/services/"+initDate+"/"+finalDate,		   
        "columns": [
            { "data": "serviceTypeName" },
            { "data": "r_names" },
            { "data": "r_lastNames" },
            { "data": "r_email" },
            { "data": "r_mobile" },
            { "data": "sr_Origen" },
            { "data": "sr_Destino" },
            { "data": "srv_createdDate" },
            { "data": "sr_statusServiceRecord" },
            { "data": "d_name" },
            { "data": "r_corporative" }
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
    	    	   var countries = d.riderVoucherTotal;
    	    	   var i = 0;
    	    	   
    	    	   
    	    	   while (i < countries.length) {
    					options += "<tr><td>"+countries[i].sr_ContryName+"</td><td>"+countries[i].sr_ServiceRecord_Count+"</td><td>"+countries[i].sr_serviceType_1+"</td><td>"+countries[i].sr_serviceType_2+"</td><td>"+countries[i].sr_serviceType_3+"</td><td>"+countries[i].sr_serviceType_4+"</td></tr>";
    					i++;				
    				}
    	    	   
     		}else{
     			options += "<tr><td colspan='6'>No se encontraron resultados.</td></tr>";
     		}
     	   $('#riderServiceGlobal').html(options);
       }	       
    });
	
	var myCallback = function () {
		 var options ="";
   	   if ( table.data().count() > 0) {
   		 
  	    	   var d = table.row( 0 ).data();
  	    	   var countries = d.riderVoucherTotal;
  	    	   var i = 0;
  	    	   
  	    	   
  	    	   while (i < countries.length) {
  	    		 options += "<tr><td>"+countries[i].sr_ContryName+"</td><td>"+countries[i].sr_ServiceRecord_Count+"</td><td>"+countries[i].sr_serviceType_1+"</td><td>"+countries[i].sr_serviceType_2+"</td><td>"+countries[i].sr_serviceType_3+"</td><td>"+countries[i].sr_serviceType_4+"</td></tr>";
  					i++;				
  				}
  	    	   
   		}else{
 			options += "<tr><td colspan='6'>No se encontraron resultados.</td></tr>";
 		}
   	   $('#riderServiceGlobal').html(options);
	
	};
	
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
	
	$( "#startServiceDate" ).datepicker({
		dateFormat: "yy-mm-dd",
		 changeMonth: true, 
		 changeYear: true,
		 //maxDate: 0,
		 //yearRange: "-100:+0",
		 onClose: function(selectedDate) {
	          table.fnDraw();}
	});
	
	
	$("#endServiceDate" ).datepicker({
		dateFormat: "yy-mm-dd",
		 changeMonth: true, 
		 changeYear: true,
		 //maxDate: 0,
		 //yearRange: "-100:+0", 
		 onSelect: function(date){

		        var selectedDate = new Date(date);
		        var msecsInADay = 86400000;
		        var endDate = new Date(selectedDate.getTime() + msecsInADay);

		        $("#endDate").val(endDate);

		    }
		 
	}).datepicker("setDate", new Date());

	$('#searchService').on('click', function(e){
		
		var startSearch;
		var endSearch;
		
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
		
		table.ajax.url("riders/services/"+startSearch+"/"+endSearch).load(myCallback);
	});
	
	setInterval(function() {
		var startSearch;
		var endSearch;
		
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
		
		table.ajax.url("riders/services/"+startSearch+"/"+endSearch).load(myCallback);
	}, 60000);
	
	//NUEVO FORMATO DATEPICKER
	
	var d = new Date();

	var month = d.getMonth()+1;
	var day = d.getDate();


	$('#initialDateDiv').datetimepicker({
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
        $('#finalDateDiv').datetimepicker('setStartDate', minDate);
    });
	
	
	$('#finalDateDiv').datetimepicker({
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