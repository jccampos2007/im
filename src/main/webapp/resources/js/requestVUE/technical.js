/**
 * 
 */
var dataSearch = {};
var dataRequest = {};
var dataTracing = {};
var dataAttached = {};
var dataAttached = {};
var dataNoticeMotive = {};
var dataNoticePending = {};
var dataRequestVariableNumeral = [];
var dataRequestObservationPending = [];
var tableVariableNumeral = '';
$(document).ready(function(){

	var inputPdfPlano30 = $('[name="inputPdfPlano30"]');
	var inputPdfPlano31 = $('[name="inputPdfPlano31"]');
	var inputPdfPlano32 = $('[name="inputPdfPlano32"]');
	var file3 = $('[name="file3"]');
	var inputWordPdf = $('[name="inputWordPdf"]');
	$('#divNoticeMotivated').hide();
	$('#divNoticePending').hide();
	$('input:radio[name=notice][value=0]').attr('checked', true);
	
	var isPdf = function(name) {
		//alert(name);
	    return name.match(/PDF$/i)
	};
	var formTecControlReport = $("#formTecControlReport");//FORM BUSCAR CS
	
	formTecControlReport.validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",

        rules: {
			"inputVUETecNumberRequest": {
				required:true
	        },
            "inputVUETecDateRequest": {
				required:true
            },
            "inputVUETecNumberCatastro": {
				required:true
            },
            "inputVUETecAdress": {
				required:true
            },
            "inputVUETecPaymentOutput": {
				required:true
            }
        },
        messages: {
            "inputVUETecNumberRequest": {
                required: 'El Nro. Solicitud es Requerido'
            },  
            "inputVUETecDateRequest": {
                required: 'La Fecha Solicitud es Requerida'
            },
            "inputVUETecNumberCatastro": {
                required: 'El Nro. Catastro es Requerido'
            },
            "inputVUETecAdress": {
                required: 'La Dirección es Requerida'
            },
            "inputVUETecPaymentOutput": {
                required: 'El Monto es Requerida'
            }
        }
	});

	$('#divTecControlReport').hide();
	$('#tblTecOwner tr > *:nth-child(1)').toggle();
	var file = $('[name="file"]');
	$('#selTecRvIdTypeUse').prop( "disabled", true );
	$('#selTecRvIdResponsibleOfficial').prop( "disabled", true );

	var isXls = function(name) {
	    return name.match(/xls$/i)
	};
	
	var isXlsx = function(name) {
	    return name.match(/xlsx$/i)
	};
	
	var table = $('#tblVUETecInbox').DataTable({
		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/Asignacion de Tecnico/2/",
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
	
	$('#btnTecSearch').on('click', function(e){
		
		var url = "/find/request";
		var NumberRequest = 'na';
		var Responsable = 'na';
		var DateRequestFrom = 'na';
		var DateRequestTo = 'na';
		if ($("#inputVUETecSearchNumberRequest").val()!=''){
			NumberRequest = $("#inputVUETecSearchNumberRequest").val();
		}
		if ($("#inputVUETecSearchResponsable").val()!=''){
			Responsable = $("#inputVUETecSearchResponsable").val();
		}
		if ($("#inputVUETecSearchDateRequestFrom").val()!=''){
			DateRequestFrom = $("#inputVUETecSearchDateRequestFrom").val();
		}
		if ($("#inputVUETecSearchDateRequestTo").val()!=''){
			DateRequestTo = $("#inputVUETecSearchDateRequestTo").val();
		}		
		table.ajax.url(url+"/0/"+NumberRequest+"/"+Responsable+"/"+DateRequestFrom+"/"+DateRequestTo+"/Asignacion de Tecnico/2/").load();		
		
	});
	
	var tableTwo = $('#tblVUETecInboxTwo').DataTable({
		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/En Revision Tecnica/2/",
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
	
	$('#tblVUETecInbox tbody').on( 'click','#btnWork',function (e) {
		
		var data = table.row( $(this).parents('tr') ).data();
		alert(data.number_request);
		$('#inputVUETecRvIdRequest').val(data.id_request);
		$('#inputVUETecRvNumberRequest').val(data.number_request);
		$('#inputVUETecRvDateRequest').val(data.format_date_request);
		$('#selTecRvIdTypeUse').val(data.id_type_use);
		$('#inputVUETecRvNumberCatastro').val(data.number_catastro);
		$('#inputVUETecRvResponsable').val(data.responsable);
		$('#inputVUETecRvResponsableId').val(data.responsable_id);
		$('#inputVUETecRvAddress').val(data.address);
		$('#selTecRvIdResponsibleOfficial').val(data.id_responsible_official);
		
		$('#divTecReview').modal({show:true});
		
	});
	
	$('#tblVUETecInboxTwo tbody').on( 'click','#btnWork',function (e) {
		
		var data = tableTwo.row( $(this).parents('tr') ).data();		
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
			   $('#inputVUETecIdRequest').val(result.id_request);
			   $('#inputVUETecNumberRequest').val(result.number_request);
			   $('#inputVUETecDateRequest').val(result.format_date_request);
			   $('#selTecIdTypeUse').val(result.id_type_use);
			   $('#inputVUETecNumberCatastro').val(result.number_catastro);
			   $('#inputVUETecNumberCatastroOld').val(result.number_catastro_old);
			   $('#inputVUETecResponsable').val(result.responsable);
			   $('#inputVUETecResponsableId').val(result.responsable_id);
			   $('#inputVUETecResponsableCiv').val(result.responsable_civ);
			   $('#inputVUETecAdress').val(result.address);
			   $('#inputVUETecIdResponsibleOfficial').val(result.id_responsible_official);
			   $('#taTecCommentRequisite').html(result.comment_requisite);
			   $('#selIdZone').val(result.id_zone).change();
			   $('#selIdOrdinance').val(result.id_ordinance);
			   
			   $('#inputVUETecPaymentImput').val(result.payment_imput);
			   $('#inputVUETecPaymentOutput').val(result.payment_output);

			   var Payment = result.responseRequestPaymentList;
			   $('#inputVUETecFee').val(Payment[0].fee);
			   $('#inputVUETecDatePayment').val(result.format_date_payment);
			   
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
						 + '<th><a href="#" id="btnEditOwner" class="glyphicon glyphicon-edit text-info"></a> '
						 +'<a href="#" id="btnDeleteRequestOwner" class="glyphicon glyphicon-remove text-info"></a></th>'
						 + '</tr>';
			    	$('#tableOwnerList tbody').append(html);
			    	
			   }
			   
			   var Upplementary = result.requestUpplementaryList;
			   $('#inputVUETecIdRequestUpplementary').val(Upplementary.id_request_upplementary);
			   $('#inputVUETecNumberNoticeCatastro').val(Upplementary.number_notice_catastro);
			   $('#inputVUETecDateNoticeCatastro').val(result.format_date_notice_catastro);
			   $('#inputVUETecAreaTerrain').val(Upplementary.area_terrain);
			   $('#inputVUETecFrontTerrain').val(Upplementary.front_terrain);
			   $('#inputVUETecAreaUsable').val(Upplementary.area_usable);
			   
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
					$("#requestRequisite" + item.id_requisite).val(item.id_request_requisite);
			    	
			   }
			   $('#divTecControlReport').show();
				
		   },
		   type: 'GET'
		});

	});
	
	$( "#btnVUETecReview" ).click(function() {
		
		url = "/process/request/";
    	dataTracing['id_request'] = $('#inputVUETecRvIdRequest').val();
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
		    	table.ajax.url("/find/request/0/na/na/0/na/na/Asignacion de Tecnico/2/").load();
		    	tableTwo.ajax.url("/find/request/0/na/na/0/na/na/En Revision Tecnica/2/").load();
		    	$('#divTecReview').modal('hide');
		    },
		    type: 'POST'
		});
		
	});
	
	$( "#btnVUETecSaveControlReport" ).click(function() {
		
		if(formTecControlReport.valid()){
			var url = "/update/request/";		
			dataRequest['id_request'] = $('#inputVUETecIdRequest').val();
			dataRequest['id_type_request'] = 2;//VUE
			dataRequest['number_request'] = $('#inputVUETecNumberRequest').val();
			dataRequest['date_request'] = $('#inputVUETecDateRequest').val();
			dataRequest['id_type_use'] = $('#selTecIdTypeUse').val();
			dataRequest['number_catastro'] = $('#inputVUETecNumberCatastro').val();
			dataRequest['number_catastro_old'] = $('#inputVUETecNumberCatastroOld').val();
			dataRequest['responsable'] = $('#inputVUETecResponsable').val();
			dataRequest['responsable_id'] = $('#inputVUETecResponsableId').val();
			dataRequest['responsable_civ'] = $('#inputVUETecResponsableCiv').val();
			dataRequest['address'] = $('#inputVUETecAdress').val();
			dataRequest['id_ordinance'] = $('#selIdOrdinance').val();
			dataRequest['payment_output'] = $('#inputVUETecPaymentOutput').val();
			dataRequest['date_payment'] = $('#inputVUETecDatePayment').val();
			dataRequest['id_responsible_official'] = $('#inputVUETecIdResponsibleOfficial').val();
			dataRequest['comment_requisite'] = $('#taTecCommentRequisite').val();
			
			var id_owners = [];
			$("#tableOwnerList tbody tr").each(function (index) {
				id_owners.push($(this).find('th:eq(0)').text()
						+'-'+$(this).find('th:eq(1)').text());
			});
			dataRequest['id_owners'] = id_owners;
			
			var i= 16;
			var id_requisites = [];
			var row_requisites = '';
			$('#tblTecRequestRequisite > tbody  > tr').each(function () {
				if($(this).find('th input:radio:checked').val()!== undefined){
					row_requisites = i + '-'
					+ $("#requestRequisite" + i).val() + '-'
					+ $(this).find('th input:checked').val();
					id_requisites.push(row_requisites);
					i++;
				}
			});
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
			    	new PNotify({
						title: 'Actualizar Solicitud',
						text: 'Se actualizo la solicitud con exito.',
						type: 'success',
						hide: true,
						styling: 'bootstrap3',
						icon: 'ui-icon ui-icon-mail-closed'
					});
			    },
			    type: 'POST'
			});			
		}else{
			return false;
		}
	});
	
	$( "#btnVUETecProcessControlReport" ).click(function() {
		
		$( "#btnTecSaveControlReport" ).click();

		var url = "/process/request/";
		dataRequest['id_request'] = $('#inputVUETecIdRequest').val();
		dataRequest['decision'] = 1;
		dataRequest['comment_supervisor'] = "";
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
					title: 'Procesar Solicitud',
					text: 'Se proceso la solicitud con exito.',
					type: 'success',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
		    	tableTwo.ajax.url("/find/request/0/na/na/0/na/na/En Revision Tecnica/2/").load();
		    	$('#divTecControlReport').hide();
		    },
		    type: 'POST'
		});
		
	});
    
    $('#btnTecDownload').on('click', function() {
        
    	var url = "/VUF/print/VUFR1/" + $('#inputVUETecIdRequest').val();
	
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
					+ $('#inputVUETecIdRequest').val() + "/"
					+ $('#inputVUETecNumberRequest').val() + "VUFTemp.pdf";
					//link.click();
			   window.open(href, '_blank', '', true);
		   },
			type: 'GET'
		});
        
    });
    
    //Buscar archivos
	function findFiles(typePrint, callback){
		var url = "/printer/excel/" 
			+ $('#inputVUETecIdRequest').val() + "/"
			+ $('#selIdOrdinance').val() + "/"
			+ typePrint;
	
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
	
	$('#btnTecUploadPlano30').on('click', function() {
		
		var url = "/add/requestAttached/";
		uploadFiles('filePlano30',function(response){

			dataAttached['id_request_attached'] = 0;
			dataAttached['id_request_requisite'] = $("#requestRequisite30").val();
			dataAttached['url'] = response;
			
			$.ajax({
				headers: { 
				'Accept': 'application/json',
				'Content-Type': 'application/json' 
				},
			    url: url,
			    data: JSON.stringify(dataAttached),
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
			    },
			    type: 'POST'
			});
			
		});
		
	});
	
	$('#btnTecUploadPlano31').on('click', function() {
		
		var url = "/add/requestAttached/";
		uploadFiles('filePlano31',function(response){
			
			dataAttached['id_request_attached'] = 0;
			dataAttached['id_request_requisite'] = $("#requestRequisite31").val();
			dataAttached['url'] = response;
			
			$.ajax({
				headers: { 
				'Accept': 'application/json',
				'Content-Type': 'application/json' 
				},
			    url: url,
			    data: JSON.stringify(dataAttached),
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
			    },
			    type: 'POST'
			});			
		});
			
	});
	
	$('#btnTecUploadPlano32').on('click', function() {
		
		var url = "/add/requestAttached/";
		uploadFiles('filePlano32',function(response){
			
			dataAttached['id_request_attached'] = 0;
			dataAttached['id_request_requisite'] = $("#requestRequisite32").val();
			dataAttached['url'] = response;
			
			$.ajax({
				headers: { 
				'Accept': 'application/json',
				'Content-Type': 'application/json' 
				},
			    url: url,
			    data: JSON.stringify(dataAttached),
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
			    },
			    type: 'POST'
			});			
		});
			
	});
	
	$('#btnTecUploadExcel').on('click', function() {
		findFiles('query', function(response) {			
			var nameFile = $('#inputVUETecNumberRequest').val() + "_"
				+ response.name_file.replace("xlsx", "pdf");
			if (nameFile == $.trim(file3.val())){
				uploadFiles('fileExcelPdf',function(response){});
			}else{
				new PNotify({
					title: 'Procesar Solicitud',
					text: 'Nombre de archivo incorrecto.',
					type: 'danger',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
			}
		})
	});
	
	$('#btnTecUploadWord').on('click', function() {
		findFiles('query', function(response) {
			var nameFile = $('#inputVUETecNumberRequest').val() + "_"
			+ response.name_file2.replace("docx", "pdf");
			//alert(nameFile + "  ==  " + $.trim(inputWordPdf.val()));
			if (nameFile == $.trim(inputWordPdf.val())){
				uploadFiles('fileWordPdf',function(response){});
			}else{
				new PNotify({
					title: 'Procesar Solicitud',
					text: 'Nombre de archivo incorrecto.',
					type: 'danger',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
			}
		})
	});
    
    $('.btnTecClear').on('click', function() {
        file.val('');
    });
    
    //Buscar archivos
	function uploadFiles(typeFile, callback){

		var filename = '';
		var formData = new FormData();
		
		if (typeFile == 'filePlano30'){
			filename = $.trim(inputPdfPlano30.val());
			formData.append('file', $('input[type=file]')[0].files[0]);
		}else if (typeFile == 'filePlano31'){
			filename = $.trim(inputPdfPlano31.val());
			formData.append('file', $('input[type=file]')[1].files[0]);
		}else if (typeFile == 'filePlano32'){
			filename = $.trim(inputPdfPlano32.val());
			formData.append('file', $('input[type=file]')[2].files[0]);
		}else if(typeFile == 'fileWordPdf'){
			filename = $.trim(inputWordPdf.val());
			formData.append('file', $('input[type=file]')[3].files[0]);
		}
		
		if (!(isPdf(filename))) {
			new PNotify({
				title: 'Carga de Archivo PDF',
				text: 'Debe seleccionar un tipo de archivo PDF.',
				type: 'danger',
				hide: true,
				styling: 'bootstrap3',
				icon: 'ui-icon ui-icon-mail-closed'
			});
		    return;
		}		

		$.ajax({
			url: '/echofile/' + $('#inputVUETecIdRequest').val(),
			type: "POST",
			data: formData,
			enctype: 'multipart/form-data',
			processData: false,
			contentType: false
		}).done(function(data) {
			callback(filename);
		}).fail(function(jqXHR, textStatus) {
			new PNotify({
				title: 'Carga de Archivo PDF',
				text: 'File upload failed ...'+jqXHR+ ' - '+textStatus,
				type: 'danger',
				hide: true,
				styling: 'bootstrap3',
				icon: 'ui-icon ui-icon-mail-closed'
			});
		});
	}

	
	$('#btnVUETecNotice').on('click', function() {
        $('#divNoticeMotivated').hide();
    	$('#divNoticePending').hide();
    });
	
	$('#btnVUETecNoticeMotivated').on('click', function() {
        $('#divNoticeMotivated').show();
    	$('#divNoticePending').hide();
    });
	
	$('#btnVUETecNoticePending').on('click', function() {
        $('#divNoticeMotivated').hide();
    	$('#divNoticePending').show();
    });	
	
	$('#btnTecVUEAddRequestVariableNumeral').on('click', function() {
		dataRequestVariableNumeral.push({
            id_request_notice_motive: 0,
            id_request_variable_numeral: $('#selTecVUFIdVariableNumeral').val(),
            name_variable_regulation: $('#inputTecVUENameVariableRegulation').val(),
            comment_request_variable: $('#taTecVUECommentRequestVariable').val(),
            conclusion_request_variable: $('#taTecVUEConclusionRequestVariable').val(),
            value_regulation: $('#inputTecVUEValueRegulation').val(),
            percentage_regulation: $('#inputTecVUEPercentageRegulation').val(),
            value_presentee: $('#inputTecVUEValuePresentee').val(),
            percentage_presentee: $('#inputTecVUEPercentagePresentee').val(),
            value_difference: $('#inputTecVUEValueDifference').val(),
            percentage_difference: $('#inputTecVUEPercentageDifference').val()
        });
		
		var html = '<tr>'
			 + '<th>'+$("#selTecVUFIdVariableNumeral option:selected").text()+'</th>'
			 + '<th>'+$('#inputTecVUENameVariableRegulation').val()+'</th>'
			 + '<th>'+$('#inputTecVUEValueRegulation').val()+'</th>'
			 + '<th>'+$('#inputTecVUEValuePresentee').val()+'</th>'
			 + '<th>'+$('#inputTecVUEValueDifference').val()+'</th>'
			 + '<th><a href="#" id="btnEditOwner" class="glyphicon glyphicon-edit text-info"></a> '
			 +'<a href="#" id="btnDeleteRequestOwner" class="glyphicon glyphicon-remove text-info"></a></th>'
			 + '</tr>';
		
		$('#tableTecVUERequestVariableNumeral tbody').append(html);

		$('.vn:input').val('');
		$('#selTecVUFIdVariableNumeral').val($("#selTecVUFIdVariableNumeral option:first").val());
		
    });
	
	
	$('#btnTecVUEAddRequestObservationPending').on('click', function() {
		dataRequestObservationPending.push({
			id_request_observation_pending: 0,
			id_request:$('#inputVUETecIdRequest').val(),
			description_observation: $('#taTecVUEDescriptionObservationPending').val()
        });
		
		var html = '<tr>'
			 + '<th>'+$('#taTecVUEDescriptionObservationPending').val()+'</th>'
			 + '<th><a href="#" id="btnEditOwner" class="glyphicon glyphicon-edit text-info"></a> '
			 +'<a href="#" id="btnDeleteRequestOwner" class="glyphicon glyphicon-remove text-info"></a></th>'
			 + '</tr>';
		
		$('#tableTecVUERequestObservationPending tbody').append(html);

		$('#taTecVUEDescriptionObservationPending').val('');
    });
	
	$('#btnTecVUEAddRequestNoticeMotive').on('click', function() {
		
		var url = "/VUE/NoticeMotive/";
		dataNoticeMotive['area_accused'] = $('#inputTecVUEAreaAccused').val();
		dataNoticeMotive['date_gaceta_zoning'] = $('#inputTecVUEDateGacetaZoning').val();
		dataNoticeMotive['description_parcel'] = $('#inputTecVUEDescriptionParcel').val();
		dataNoticeMotive['id_request'] = $('#inputVUETecIdRequest').val();
		dataNoticeMotive['id_request_notice_motive'] = 0;
		dataNoticeMotive['name_zoning'] = $('#inputTecVUENameZoning').val();
		dataNoticeMotive['number_gaceta_zoning'] = $('#inputTecVUENumberGacetaZoning').val();
		dataNoticeMotive['requestVar'] = dataRequestVariableNumeral;
		dataNoticeMotive['section_zoning'] = $('#inputTecVUESectionZoning').val();
		
		$.ajax({
			headers: { 
			'Accept': 'application/json',
			'Content-Type': 'application/json' 
			},
		    url: url,
		    data: JSON.stringify(dataNoticeMotive),
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
		    },
		    type: 'POST'
		});
	});
	
	$('#btnTecVUEAddRequestNoticePending').on('click', function() {
		
		var url = "/VUE/NoticePending/";
		dataNoticePending['area_accused'] = $('#inputTecVUEAreaAccusedPending').val();
		dataNoticePending['date_notice_request_previous'] = $('#inputTecVUEDateNoticeRequestPrevious').val();
		dataNoticePending['description_plane'] = $('#inputTecVUEDescriptionPlane').val();
		dataNoticePending['id_request'] = $('#inputVUETecIdRequest').val();
		dataNoticePending['id_request_notice_pending'] = 0;
		dataNoticePending['name_zoning'] = $('#inputTecVUENameZoningPending').val();
		dataNoticePending['notice_request_previous'] = $('#inputTecVUENoticeRequestPrevious').val();
		dataNoticePending['requestObserPending'] = dataRequestObservationPending;
		
		$.ajax({
			headers: { 
			'Accept': 'application/json',
			'Content-Type': 'application/json' 
			},
		    url: url,
		    data: JSON.stringify(dataNoticePending),
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
		    },
		    type: 'POST'
		});
	});
	
	$('#btnVUERequestParent').on('click', function() {
		var url = "/find/request/number/"+$('#inputVUERequestParent').val()+"/1/";
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
		    	$('#lblVUESuccessful').html("Solicitud valida");
		    	$('#inputVUEIdRequestParent').val(result.id_request);
		    	new PNotify({
					title: 'Procesar Solicitud',
					text: 'Se proceso la solicitud con exito.',
					type: 'success',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
		    },
		    type: 'GET'
		});
	});
	
});