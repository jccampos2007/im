/**
 * 
 */
var dataSearch = {};
var dataRequest = {};
var dataTracing = {};
var dataPayment = {};
var requestAttachedList = {};
$(document).ready(function(){
	
	var formDelControlReport = $("#formDelControlReport");//FORM BUSCAR CS	
	formDelControlReport.validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",

        rules: {
			"inputDelNameDelivery": {
				required:true
	        },
			"inputDelIdDelivery": {
				required:true
		    },
			"inputDelDateDelivery": {
				required:true
		    }
        },
        messages: {
            "inputDelNameDelivery": {
                required: 'El Nombre es Requerido'
            },
	        "inputDelIdDelivery": {
	            required: 'La CI / Rif es Requerido'
	        },
	        "inputDelDateDelivery": {
	            required: 'La Fecha entrega es Requerido'
	        }
        }
	});
	
	$('#divDelBanlance').hide();
	$('#divDelControlReport').hide();
	$('#selDelIdTypeUse').prop( "disabled", true );
	$('#selDelIdResponsibleOfficial').prop( "disabled", true );
	
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

	var table = $('#tblDelInbox').DataTable({
		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/Remision Atencion Ciudadano/1/",
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
	
	$('#btnDelSearch').on('click', function(e){
		
		var url = "/VUF/find/request";
		var NumberRequest = 'na';
		var Responsable = 'na';
		var DateRequestFrom = 'na';
		var DateRequestTo = 'na';
		if ($("#inputDelSearchNumberRequest").val()!=''){
			NumberRequest = $("#inputDelSearchNumberRequest").val();
		}
		if ($("#inputDelSearchResponsable").val()!=''){
			Responsable = $("#inputDelSearchResponsable").val();
		}
		if ($("#inputDelSearchDateRequestFrom").val()!=''){
			DateRequestFrom = $("#inputDelSearchDateRequestFrom").val();
		}
		if ($("#inputDelSearchDateRequestTo").val()!=''){
			DateRequestTo = $("#inputDelSearchDateRequestTo").val();
		}		
		table.ajax.url(url+"/0/"+NumberRequest+"/"+Responsable+"/"+DateRequestFrom+"/"+DateRequestTo+"/Remision Atencion Ciudadano/").load();		
		
	});
	
	$('#tblDelInbox tbody').on( 'click','#btnWork',function (e) {
		
		var data = table.row( $(this).parents('tr') ).data();		
		//MOSTRAR ACTA CONROL
		var url = "/find/request/"+data.id_request+"/1/";
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
			   $('#inputDelIdRequest').val(result.id_request);
			   $('#inputDelNumberRequest').val(result.number_request);
			   $('#inputDelDateRequest').val(result.format_date_request);
			   $('#selDelIdTypeUse').val(result.id_type_use);
			   $('#inputDelNumberCatastro').val(result.number_catastro);
			   $('#inputDelNumberCatastroOld').val(result.number_catastro_old);
			   $('#inputDelResponsableId').val(result.responsable_id);
			   $('#inputDelResponsableCiv').val(result.responsable_civ);
			   $('#inputDelAddress').val(result.address);
			   $('#inputDelIdOrdinance').val(result.id_ordinance);
			   $('#inputDelPaymentOutput').val(result.payment_output);
			   $('#inputDelRequestCost').val(result.payment_output);
			   $('#selDelIdResponsibleOfficial').val(result.id_responsible_official);
			   
			   var requestPaymentList = result.responseRequestPaymentList;		   
			   $('#tblDelPaymentList tbody').html('');
			   var paymentReceived = 0;
			   var balance = 0;
			   for(var i =0;i < requestPaymentList.length;i++){
					var item = requestPaymentList[i];
					var html = '<tr>'
					+ '<th>'+item.fee+'</th>'
					+ '<th>'+item.date_payment+'</th>'
					+ '<th>'+item.amount+'</th>'
					+ '</tr>';
					$('#tblDelPaymentList tbody').append(html);
					paymentReceived += parseFloat(item.amount);
			   }
			   $('#inputDelPaymentReceived').val(paymentReceived);
			   balance = parseFloat(result.payment_output) - parseFloat(paymentReceived);
			   $('#inputDelBalance').val(balance);
			   
			   requestAttachedList = result.requestAttachedList;
			   
			   $('#divDelBanlance').show();
			   if(balance == 0){
				   $('#divDelControlReport').show();
			   }
				
		   },
		   type: 'GET'
		});
		
		
	} );
	
	$('#btnLoadFee').on('click', function(e){
		
		var url = "/add/payment/";
		dataPayment["id_request_payment"] = 0;
		dataPayment["id_request"] = $("#inputDelIdRequest").val();
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

				var paymentReceived = parseFloat($('#inputDelPaymentReceived').val()) + parseFloat(dataPayment["amount"]);
				var balance = 0;				   
				var html = '<tr>'
					+ '<th>'+dataPayment["fee"]+'</th>'
					+ '<th>'+dataPayment["date_payment"]+'</th>'
					+ '<th>'+dataPayment["amount"]+'</th>'
					+ '</tr>';
				$('#tblDelPaymentList tbody').append(html);
				$('#inputDelPaymentReceived').val(paymentReceived);
				balance = parseFloat($('#inputDelRequestCost').val()) - parseFloat(paymentReceived);
				$('#inputDelBalance').val(balance);
				
				if(balance == 0){
					$('#divDelControlReport').show();
				}
				
		    },
		    type: 'POST'
		});
		
		
	} );
	
	$( "#btnDelivery" ).click(function() {

		if(formDelControlReport.valid()){
			var url = "/update/request/";
			dataRequest["id_request"] = $("#inputDelIdRequest").val();
			dataRequest['id_type_request'] = 1;//VUF
			dataRequest['number_request'] = $('#inputDelNumberRequest').val();
			dataRequest['date_request'] = $('#inputDelDateRequest').val();
			dataRequest['id_type_use'] = $('#selDelIdTypeUse').val();
			dataRequest['number_catastro'] = $('#inputDelNumberCatastro').val();
			dataRequest['number_catastro_old'] = $('#inputDelNumberCatastroOld').val();
			dataRequest['responsable'] = $('#inputDelResponsable').val();
			dataRequest['responsable_id'] = $('#inputDelResponsableId').val();
			dataRequest['responsable_civ'] = $('#inputDelResponsableCiv').val();
			dataRequest['address'] = $('#inputDelAddress').val();
			dataRequest['id_ordinance'] = $('#inputDelIdOrdinance').val();
			dataRequest['payment_output'] = $('#inputDelPaymentOutput').val();
			dataRequest["id_responsible_official"] = $("#selDelIdResponsibleOfficial").val();
			dataRequest["name_delivery"] = $("#inputDelNameDelivery").val();
			dataRequest["id_delivery"] = $("#inputDelIdDelivery").val();
			dataRequest["date_delivery"] = $("#inputDelDateDelivery").val();
			dataRequest["id_ordinance"] = $("#inputDelIdOrdinance").val();
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
			    	dataTracing['id_request'] = $('#inputDelIdRequest').val();
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
					    	table.ajax.url("/find/request/0/na/na/0/na/na/Remision Atencion Ciudadano/1/").load();
					    	$('#divDelControlReport').hide();
					    	$('#divDelBanlance').hide();
					    	
					    	
					    	var url = "/VUF/print/" + $('#inputDelIdRequest').val();
					    	
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
							    		+ $('#inputDelIdRequest').val() + "/"
							    		+ $('#inputDelNumberRequest').val() + "VUF.pdf";
							    		//link.click();
						    		window.open(href, '_blank', '', true);
							   },
								type: 'GET'
							});

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
	
	$('#btnDelDownload').on('click', function() {

		
    	
    });
	
	//Buscar archivos
	function findFilesSA(callback){
		var url = "/printer/excel/" 
			+ $('#inputDelIdRequest').val() + "/"
			+ $('#inputDelIdOrdinance').val() + "/query";
	
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