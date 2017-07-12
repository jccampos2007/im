/**
 * 
 */
var dataSearch = {};
var dataRequest = {};
var dataTracing = {};
var dataPayment = {};
var requestAttachedList = {};
$(document).ready(function(){
	
	var formVUEDelControlReport = $("#formVUEDelControlReport");//FORM BUSCAR CS	
	formVUEDelControlReport.validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",

        rules: {
			"inputVUEDelNameDelivery": {
				required:true
	        },
			"inputVUEDelIdDelivery": {
				required:true
		    },
			"inputVUEDelDateDelivery": {
				required:true
		    }
        },
        messages: {
            "inputVUEDelNameDelivery": {
                required: 'El Nombre es Requerido'
            },
	        "inputVUEDelIdDelivery": {
	            required: 'La CI / Rif es Requerido'
	        },
	        "inputVUEDelDateDelivery": {
	            required: 'La Fecha entrega es Requerido'
	        }
        }
	});
	
	$('#divVUEDelBanlance').hide();
	$('#divVUEDelControlReport').hide();
	$('#selVUEDelIdTypeUse').prop( "disabled", true );
	$('#selVUEDelIdResponsibleOfficial').prop( "disabled", true );
	
	$('.form_date').datetimepicker({
		startDate: '+0d',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });

	var table = $('#tblVUEDelInbox').DataTable({
		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/Remision Atencion Ciudadano/2/",
		"buttons": [
			{
				extend:    'excelHtml5',
				className: 'btn btn-primary pull-right',
				text:      'Descargar <i class="glyphicon glyphicon-export"></i>'
			}
        ],
        "columnDefs": [
           	{targets:[0],visible:false},
 	        {
	        	"targets":-1,
	        	"data":null, 
	        	"defaultContent": 
	            	'<a href="#" id="btnWork" class="glyphicon glyphicon-edit text-info"></a>'            	   
	        }
	    ],
        "columns": [
            { "data": "id_request" },
            { "data": "number_request" },
            { "data": "responsable" },
            { "data": null }
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
	
	$('#btnVUEDelSearch').on('click', function(e){
		
		var url = "/VUF/find/request";
		var NumberRequest = 'na';
		var Responsable = 'na';
		var DateRequestFrom = 'na';
		var DateRequestTo = 'na';
		if ($("#inputVUEDelSearchNumberRequest").val()!=''){
			NumberRequest = $("#inputVUEDelSearchNumberRequest").val();
		}
		if ($("#inputVUEDelSearchResponsable").val()!=''){
			Responsable = $("#inputVUEDelSearchResponsable").val();
		}
		if ($("#inputVUEDelSearchDateRequestFrom").val()!=''){
			DateRequestFrom = $("#inputVUEDelSearchDateRequestFrom").val();
		}
		if ($("#inputVUEDelSearchDateRequestTo").val()!=''){
			DateRequestTo = $("#inputVUEDelSearchDateRequestTo").val();
		}		
		table.ajax.url(url+"/0/"+NumberRequest+"/"+Responsable+"/"+DateRequestFrom+"/"+DateRequestTo+"/Remision Atencion Ciudadano/").load();		
		
	});
	
	$('#tblVUEDelInbox tbody').on( 'click','#btnWork',function (e) {
		
		var data = table.row( $(this).parents('tr') ).data();		
		//MOSTRAR ACTA CONROL
		var url = "/find/request/"+data.id_request+"/2/";
		$.ajax({
		   url: url,
		   data: {
		      format: 'json'
		   },
		   error: function() {
			   console.log('Ha ocurrido un error...');
		   },
		   dataType: 'json',
		   success: function(data) {
			   
			   var result = data.responseData[0];
			   console.log(result);
			   $('#inputVUEDelIdRequest').val(result.id_request);
			   $('#inputVUEDelNumberRequest').val(result.number_request);
			   $('#inputVUEDelDateRequest').val(result.format_date_request);
			   $('#selVUEDelIdTypeUse').val(result.id_type_use);
			   $('#inputVUEDelNumberCatastro').val(result.number_catastro);
			   $('#inputVUEDelNumberCatastroOld').val(result.number_catastro_old);
			   $('#inputVUEDelResponsableId').val(result.responsable_id);
			   $('#inputVUEDelResponsableCiv').val(result.responsable_civ);
			   $('#inputVUEDelAddress').val(result.address);
			   $('#inputVUEDelIdOrdinance').val(result.id_ordinance);
			   $('#inputVUEDelPaymentOutput').val(result.payment_output);
			   $('#inputVUEDelRequestCost').val(result.payment_output);
			   $('#selVUEDelIdResponsibleOfficial').val(result.id_responsible_official);
			   
			   var requestPaymentList = result.responseRequestPaymentList;		   
			   $('#tblVUEDelPaymentList tbody').html('');
			   var paymentReceived = 0;
			   var balance = 0;
			   for(var i =0;i < requestPaymentList.length;i++){
					var item = requestPaymentList[i];
					var html = '<tr>'
					+ '<th>'+item.fee+'</th>'
					+ '<th>'+item.date_payment+'</th>'
					+ '<th>'+item.amount+'</th>'
					+ '</tr>';
					$('#tblVUEDelPaymentList tbody').append(html);
					paymentReceived += parseFloat(item.amount);
			   }
			   $('#inputVUEDelPaymentReceived').val(paymentReceived);
			   balance = parseFloat(result.payment_output) - parseFloat(paymentReceived);
			   $('#inputVUEDelBalance').val(balance);
			   
			   requestAttachedList = result.requestAttachedList;
			   
			   $('#divVUEDelBanlance').show();
			   if(balance == 0){
				   $('#divVUEDelControlReport').show();
			   }
				
		   },
		   type: 'GET'
		});
		
		
	} );
	
	$('#btnLoadFee').on('click', function(e){
		
		var url = "/add/payment/";
		dataPayment["id_request_payment"] = 0;
		dataPayment["id_request"] = $("#inputVUEDelIdRequest").val();
		dataPayment["fee"] = $("#inputRecFee").val();
		dataPayment["date_payment"] = $("#inputRecDatePayment").val();
		dataPayment["amount"] = $("#inputRecPaymentImput").val();
		dataPayment["active"] = true;
		
		$.ajax({
			headers: { 
				'Accept': 'application/json',
				'Content-Type': 'application/json' 
			},
			url: url,
		    data: JSON.stringify(dataPayment),
		    error: function() {
				return false;
		    },
		    dataType: 'json',
		    success: function(data) {

				var paymentReceived = parseFloat($('#inputVUEDelPaymentReceived').val()) + parseFloat(dataPayment["amount"]);
				var balance = 0;				   
				var html = '<tr>'
					+ '<th>'+dataPayment["fee"]+'</th>'
					+ '<th>'+dataPayment["date_payment"]+'</th>'
					+ '<th>'+dataPayment["amount"]+'</th>'
					+ '</tr>';
				$('#tblVUEDelPaymentList tbody').append(html);
				$('#inputVUEDelPaymentReceived').val(paymentReceived);
				balance = parseFloat($('#inputVUEDelRequestCost').val()) - parseFloat(paymentReceived);
				$('#inputVUEDelBalance').val(balance);
				
				if(balance == 0){
					$('#divVUEDelControlReport').show();
				}
				
		    },
		    type: 'POST'
		});
		
		
	} );
	
	$( "#btnVUEDelivery" ).click(function() {

		if(formVUEDelControlReport.valid()){
			var url = "/update/request/";
			dataRequest["id_request"] = $("#inputVUEDelIdRequest").val();
			dataRequest['id_type_request'] = 2;//VUE
			dataRequest['number_request'] = $('#inputVUEDelNumberRequest').val();
			dataRequest['date_request'] = $('#inputVUEDelDateRequest').val();
			dataRequest['id_type_use'] = $('#selVUEDelIdTypeUse').val();
			dataRequest['number_catastro'] = $('#inputVUEDelNumberCatastro').val();
			dataRequest['number_catastro_old'] = $('#inputVUEDelNumberCatastroOld').val();
			dataRequest['responsable'] = $('#inputVUEDelResponsable').val();
			dataRequest['responsable_id'] = $('#inputVUEDelResponsableId').val();
			dataRequest['responsable_civ'] = $('#inputVUEDelResponsableCiv').val();
			dataRequest['address'] = $('#inputVUEDelAddress').val();
			dataRequest['id_ordinance'] = $('#inputVUEDelIdOrdinance').val();
			dataRequest['payment_output'] = $('#inputVUEDelPaymentOutput').val();
			dataRequest["id_responsible_official"] = $("#selVUEDelIdResponsibleOfficial").val();
			dataRequest["name_delivery"] = $("#inputVUEDelNameDelivery").val();
			dataRequest["id_delivery"] = $("#inputVUEDelIdDelivery").val();
			dataRequest["date_delivery"] = $("#inputVUEDelDateDelivery").val();
			dataRequest["id_ordinance"] = $("#inputVUEDelIdOrdinance").val();
			var id_owners = [];
			dataRequest['id_owners'] = id_owners;
			var id_requisites = [];
			dataRequest['id_requisites'] = id_requisites;
			$.ajax({
				headers: { 
				'Accept': 'application/json',
				'Content-Type': 'application/json' 
				},
			    url: url,
			    data: JSON.stringify(dataRequest),
			    error: function() {
					return false;
			    },
			    dataType: 'json',
			    success: function(data) {
			    	
			    	url = "/process/request/";
			    	dataTracing['id_request'] = $('#inputVUEDelIdRequest').val();
			    	dataTracing['decision'] = 1;
			    	dataTracing['comment_supervisor'] = "";
			    	dataTracing['comment_manager'] = "";
					
					$.ajax({
						headers: { 
						'Accept': 'application/json',
						'Content-Type': 'application/json' 
						},
					    url: url,
					    data: JSON.stringify(dataTracing),
					    error: function() {
							return false;
					    },
					    dataType: 'json',
					    success: function(data) {
					    	new PNotify({
								title: 'Procesar Solicitud',
								text: 'Se proceso la solicitud con exito.',
								type: 'success',
								hide: true,
								styling: 'bootstrap3',
								icon: 'ui-icon ui-icon-mail-closed'
							});
					    	table.ajax.url("/find/request/0/na/na/0/na/na/Remision Atencion Ciudadano/2/").load();
					    	$('#divVUEDelControlReport').hide();
					    	$('#divVUEDelBanlance').hide();
					    	
					    	
					    	/*DEFINIR ADELVIS
					    	 * var url = "/VUF/print/" + $('#inputVUEDelIdRequest').val();
					    	
							$.ajax({
							   url: url,
							   data: {
							      format: 'json'
							   },
							   error: function() {
								   console.log('Ha ocurrido un error...');
							   },
							   dataType: 'json',
							   success: function(data) {
								   var href ="../file_request/" 
							    		+ $('#inputVUEDelIdRequest').val() + "/"
							    		+ $('#inputVUEDelNumberRequest').val() + "VUF.pdf";
							    		//link.click();
						    		window.open(href, '_blank', '', true);
							   },
								type: 'GET'
							});*/

					    },
					    type: 'POST'
					});
			    },
			    type: 'POST'
			});			
		}else{
			return false;
		}
		
	});
	
	$('#btnVUEDelDownload').on('click', function() {

		
    	
    });
	
	//Buscar archivos
	function findFilesSA(callback){
		var url = "/printer/excel/" 
			+ $('#inputVUEDelIdRequest').val() + "/"
			+ $('#inputVUEDelIdOrdinance').val() + "/2/query";
	
		$.ajax({
		   url: url,
		   data: {
		      format: 'json'
		   },
		   error: function() {
			   console.log('Ha ocurrido un error...');
		   },
		   dataType: 'json',
		   success: function(data) {
			   callback(data.responseData[0]);
		},
			type: 'GET'
		});
	}
});