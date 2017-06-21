/**
 * 
 */
var dataSearch = {};
var dataRequest = {};
var requestAttachedList = {};
$(document).ready(function(){
	
	var formSAControlReport = $("#formSAControlReport");//FORM BUSCAR CS
	
	formSAControlReport.validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",

        rules: {
			"inputSACommentSupervisor": {
				required:true
	        }
        },
        messages: {
            "inputSACommentSupervisor": {
                required: 'El Comentario es Requerido'
            }
        }
	});
	$('#divSAControlReport').hide();
	$('#selSAIdTypeUse').prop( "disabled", true );
	$('#selSAIdResponsibleOfficial').prop( "disabled", true );
	
	var table = $('#tblSAInbox').DataTable({
		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/En revision Jefe de Division/1/",
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
	
	$('#btnSASearch').on('click', function(e){
		
		var url = "/VUF/find/request";
		var NumberRequest = 'na';
		var Responsable = 'na';
		var DateRequestFrom = 'na';
		var DateRequestTo = 'na';
		if ($("#inputSASearchNumberRequest").val()!=''){
			NumberRequest = $("#inputSASearchNumberRequest").val();
		}
		if ($("#inputSASearchResponsable").val()!=''){
			Responsable = $("#inputSASearchResponsable").val();
		}
		if ($("#inputSASearchDateRequestFrom").val()!=''){
			DateRequestFrom = $("#inputSASearchDateRequestFrom").val();
		}
		if ($("#inputSASearchDateRequestTo").val()!=''){
			DateRequestTo = $("#inputSASearchDateRequestTo").val();
		}		
		table.ajax.url(url+"/0/"+NumberRequest+"/"+Responsable+"/"+DateRequestFrom+"/"+DateRequestTo+"/En revision Jefe de Division/").load();		
		
	});
	
	
	
	$('#tblSAInbox tbody').on( 'click','#btnWork',function (e) {
		
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
			   $('#inputSAIdRequest').val(result.id_request);
			   $('#inputSANumberRequest').val(result.number_request);
			   $('#inputSADateRequest').val(result.format_date_request);
			   $('#selSAIdTypeUse').val(result.id_type_use);
			   $('#inputSANumberCatastro').val(result.number_catastro);
			   $('#inputSANumberCatastroOld').val(result.number_catastro_old);
			   $('#inputSAResponsable').val(result.responsable);
			   $('#inputSAResponsableId').val(result.responsable_id);
			   $('#inputSAResponsableCiv').val(result.responsable_civ);
			   $('#inputSAAdress').val(result.address);
			   $('#selSAIdResponsibleOfficial').val(result.id_responsible_official);
			   $('#inputSAIdOrdinance').val(result.id_ordinance);
			   
			   $('#inputSAPaymentImput').val(result.payment_imput);
			   $('#inputSAPaymentOutput').val(result.payment_output);

			   var Payment = result.responseRequestPaymentList;
			   $('#inputSAFee').val(Payment[0].fee);
			   $('#inputSADatePayment').val(result.format_date_payment);
			   
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
				
			   $('#divSAControlReport').show();
				
		   },
		   type: 'GET'
		});
		
	} );
	
	
	
	$( "#btnSAApprobalControlReport" ).click(function() {

		var url = "/process/request/";
		dataRequest['id_request'] = $('#inputSAIdRequest').val();		
		dataRequest['decision'] = 1;//approval
		dataRequest['comment_supervisor'] = $('#inputSACommentSupervisor').val();
		dataRequest['comment_manager'] = "";

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
					title: 'Aprobacion',
					text: 'Se aprobo la solicitud con exito.',
					type: 'success',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
		    	table.ajax.url("/find/request/0/na/na/0/na/na/En revision Jefe de Division/1/").load();
		    	$('#divSAControlReport').hide();
		    },
		    type: 'POST'
		});			
		
	});
	
	$( "#btnSADenyControlReport" ).click(function() {

		if(formSAControlReport.valid()){
			var url = "/process/request/";
			dataRequest['id_request'] = $('#inputSAIdRequest').val();
			dataRequest['decision'] = 2;//Deny
			dataRequest['comment_supervisor'] = "";
			dataRequest['comment_manager'] = $('#inputSACommentManager').val();
	
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
						title: 'Aprobaci&aacute;n',
						text: 'Se rechazo la solicitud con exito.',
						type: 'success',
						hide: true,
						styling: 'bootstrap3',
						icon: 'ui-icon ui-icon-mail-closed'
					});
			    	table.ajax.url("/find/request/0/na/na/0/na/na/En revision Jefe de Division/1/").load();
			    	$('#divSAControlReport').hide();
			    },
			    type: 'POST'
			});			
		}else{
			return false;
		}
	});
	
	$('#btnSADownloadPlano14Pdf').on('click', function() {
		
		for(var i =0;i < requestAttachedList.length;i++){			   
			var item = requestAttachedList[i];
			if (item.id_requisite == 14){				
				var href ="../file_request/" 
					+ $('#inputSAIdRequest').val() + "/"
					+ item.url;
					//link.click();
					window.open(href, '_blank', '', true);
				$("#requestRequisite" + item.id_requisite).val(item.id_request_requisite);
			}				
		}
	
    });
	
	$('#btnSADownloadPlano15Pdf').on('click', function() {

		for(var i =0;i < requestAttachedList.length;i++){			   
			var item = requestAttachedList[i];
			if (item.id_requisite == 15){
				var href ="../file_request/" 
					+ $('#inputSAIdRequest').val() + "/"
					+ item.url;
					//link.click();
					window.open(href, '_blank', '', true);
				$("#requestRequisite" + item.id_requisite).val(item.id_request_requisite);
			}				
		}		
    	
    });
	
	$('#btnSADownload').on('click', function() {
		
		var link=document.createElement('a');
		document.body.appendChild(link);
		var href ="../file_request/" 
		+ $('#inputSAIdRequest').val() + "/"
		+ $('#inputSANumberRequest').val() + "VUFTemp.pdf";
		window.open(href, '_blank', '', true);
    	
    });
	
	//Buscar archivos
	function findFilesSA(callback){
		var url = "/printer/excel/" 
			+ $('#inputSAIdRequest').val() + "/"
			+ $('#inputSAIdOrdinance').val() + "/query";
	
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