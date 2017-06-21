/**
 * 
 */
var dataSearch = {};
var dataRequest = {};
var requestAttachedList = {};
$(document).ready(function(){
	
	var formMAControlReport = $("#formMAControlReport");//FORM BUSCAR CS
	
	formMAControlReport.validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",

        rules: {
			"inputMACommentManager": {
				required:true
	        }
        },
        messages: {
            "inputMACommentManager": {
                required: 'El Comentario es Requerido'
            }
        }
	});
	
	$('#divMAControlReport').hide();
	$('#selMAIdTypeUse').prop( "disabled", true );
	$('#selMAIdResponsibleOfficial').prop( "disabled", true );
	
	var table = $('#tblMAInbox').DataTable({
		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/Por revision de Director/1/",
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
	
	$('#btnMASearch').on('click', function(e){
		
		var url = "/VUF/find/request";
		var NumberRequest = 'na';
		var Responsable = 'na';
		var DateRequestFrom = 'na';
		var DateRequestTo = 'na';
		if ($("#inputMASearchNumberRequest").val()!=''){
			NumberRequest = $("#inputMASearchNumberRequest").val();
		}
		if ($("#inputMASearchResponsable").val()!=''){
			Responsable = $("#inputMASearchResponsable").val();
		}
		if ($("#inputMASearchDateRequestFrom").val()!=''){
			DateRequestFrom = $("#inputMASearchDateRequestFrom").val();
		}
		if ($("#inputMASearchDateRequestTo").val()!=''){
			DateRequestTo = $("#inputMASearchDateRequestTo").val();
		}		
		table.ajax.url(url+"/0/"+NumberRequest+"/"+Responsable+"/"+DateRequestFrom+"/"+DateRequestTo+"/Por revision de Director/").load();		
		
	});
	
	$('#tblMAInbox tbody').on( 'click','#btnWork',function (e) {
		
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
			   $('#inputMAIdRequest').val(result.id_request);
			   $('#inputMANumberRequest').val(result.number_request);
			   $('#inputMADateRequest').val(result.format_date_request);
			   $('#selMAIdTypeUse').val(result.id_type_use);
			   $('#inputMANumberCatastro').val(result.number_catastro);
			   $('#inputMANumberCatastroOld').val(result.number_catastro_old);
			   $('#inputMAResponsable').val(result.responsable);
			   $('#inputMAResponsableId').val(result.responsable_id);
			   $('#inputMAResponsableCiv').val(result.responsable_civ);
			   $('#inputMAAdress').val(result.address);
			   $('#selMAIdResponsibleOfficial').val(result.id_responsible_official);
			   $('#inputMAIdOrdinance').val(result.id_ordinance);

			   $('#inputMAPaymentImput').val(result.payment_imput);
			   $('#inputMAPaymentOutput').val(result.payment_output);

			   var Payment = result.responseRequestPaymentList;
			   $('#inputMAFee').val(Payment[0].fee);
			   $('#inputMADatePayment').val(result.format_date_payment);
			   
			   var requestOwnerList = result.requestOwnerList;
			   var requestRequisiteList = result.requestRequisiteList;		   
			   $('#tableOwnerList tbody').html('');
			   for(var i =0;i < requestOwnerList.length;i++){
						var item = requestOwnerList[i];
						var html = '<tr>'
					+ '<th style="display: none;">'+item.id_owner+'</th>'
					+ '<th style="display: none;">'+item.id_request_owner+'</th>'
					+ '<th>'+item.name_owner+'</th>'
					+ '<th>'+item.owner_id+'</th>'
					+ '<th>'+item.email_owner+'</th>'
					+ '<th>'+item.phone_owner
					+' / '+item.mobile_owner+'</th>'
					+ '</tr>';
					$('#tableOwnerList tbody').append(html);
			   }
				   
			   for(var i =0;i < requestRequisiteList.length;i++){
				   
					var item = requestRequisiteList[i];
					if(item.yes){
						$("input[name=select" + item.id_requisite + "][value=yes]").prop('checked', true);
					}else if(item.no){
						$("input[name=select" + item.id_requisite + "][value=no]").prop('checked', true);
					}else if(item.does_not_apply){
						$("input[name=select" + item.id_requisite + "][value=does_not_apply]").prop('checked', true);
					}else if(item.pending){
						$("input[name=select" + item.id_requisite + "][value=pending]").prop('checked', true);
					}
			    	
			   }
			   
			   requestAttachedList = result.requestAttachedList;
			   
			   $('#divMAControlReport').show();
				
		   },
		   type: 'GET'
		});
		
	} );
	
	
	
	$( "#btnMAApprobalControlReport" ).click(function() {

		var url = "/process/request/";
		dataRequest['id_request'] = $('#inputMAIdRequest').val();
		dataRequest['decision'] = 1;//approval
		dataRequest['comment_supervisor'] = "";
		dataRequest['comment_manager'] = $('#inputMACommentManager').val();

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
		    	new PNotify({
					title: 'Actualizar Solicitud',
					text: 'Se actualizo la solicitud con exito.',
					type: 'success',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
		    	table.ajax.url("/find/request/0/na/na/0/na/na/Por revision de Director/1/").load();		
				$('#divMAControlReport').hide();
		    },
		    type: 'POST'
		});			
		
	});
	
	$( "#btnMADenyControlReport" ).click(function() {

		if(formMAControlReport.valid()){
			var url = "/process/request/";
			dataRequest['id_request'] = $('#inputMAIdRequest').val();		
			dataRequest['decision'] = 2;//Deny
			dataRequest['comment_supervisor'] = "";
			dataRequest['comment_manager'] = $('#inputMACommentManager').val();
	
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
			    	new PNotify({
						title: 'Actualizar Solicitud',
						text: 'Se actualizo la solicitud con exito.',
						type: 'success',
						hide: true,
						styling: 'bootstrap3',
						icon: 'ui-icon ui-icon-mail-closed'
					});
			    	table.ajax.url("/find/request/0/na/na/0/na/na/Por revision de Director/1/").load();		
					$('#divMAControlReport').hide();
			    },
			    type: 'POST'
			});			
		}else{
			return false;
		}
	});
	
	$('#btnMADownloadPlano14Pdf').on('click', function() {
		
		for(var i =0;i < requestAttachedList.length;i++){			   
			var item = requestAttachedList[i];
			if (item.id_requisite == 14){				
				var href ="../file_request/" 
					+ $('#inputMAIdRequest').val() + "/"
					+ item.url;
					//link.click();
					window.open(href, '_blank', '', true);
				$("#requestRequisite" + item.id_requisite).val(item.id_request_requisite);
			}				
		}
	
    });
	
	$('#btnMADownloadPlano15Pdf').on('click', function() {

		for(var i =0;i < requestAttachedList.length;i++){			   
			var item = requestAttachedList[i];
			if (item.id_requisite == 15){
				var href ="../file_request/" 
					+ $('#inputMAIdRequest').val() + "/"
					+ item.url;
					//link.click();
					window.open(href, '_blank', '', true);
				$("#requestRequisite" + item.id_requisite).val(item.id_request_requisite);
			}				
		}		
    	
    });
	
	$('#btnMADownload').on('click', function() {
		
		var link=document.createElement('a');
		document.body.appendChild(link);
		var href ="../file_request/" 
		+ $('#inputMAIdRequest').val() + "/"
		+ $('#inputMANumberRequest').val() + "VUFTemp.pdf";
		//link.click();
		window.open(href, '_blank', '', true);
    	
    });
	
	//Buscar archivos
	function findFilesMA(callback){
		var url = "/printer/excel/" 
			+ $('#inputMAIdRequest').val() + "/"
			+ $('#inputMAIdOrdinance').val() + "/query";
	
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