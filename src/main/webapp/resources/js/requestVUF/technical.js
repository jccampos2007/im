/**
 * 
 */
var dataSearch = {};
var dataRequest = {};
var dataTracing = {};
var dataAttached = {};
$(document).ready(function(){

	var inputPlano14Pdf = $('[name="inputPlano14Pdf"]');
	var inputPlano15Pdf = $('[name="inputPlano15Pdf"]');
	var file3 = $('[name="file3"]');
	var inputWordPdf = $('[name="inputWordPdf"]');
	
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
			"inputTecNumberRequest": {
				required:true
	        },
            "inputTecDateRequest": {
				required:true
            },
            "inputTecNumberCatastro": {
				required:true
            },
            "inputTecAdress": {
				required:true
            },
            "inputTecPaymentOutput": {
				required:true
            }
        },
        messages: {
            "inputTecNumberRequest": {
                required: 'El Nro. Solicitud es Requerido'
            },  
            "inputTecDateRequest": {
                required: 'La Fecha Solicitud es Requerida'
            },
            "inputTecNumberCatastro": {
                required: 'El Nro. Catastro es Requerido'
            },
            "inputTecAdress": {
                required: 'La Dirección es Requerida'
            },
            "inputTecPaymentOutput": {
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
	
	var table = $('#tblTecInbox').DataTable({
		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/Asignacion de Tecnico/1/",
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
		
		var url = "/VUF/find/request";
		var NumberRequest = 'na';
		var Responsable = 'na';
		var DateRequestFrom = 'na';
		var DateRequestTo = 'na';
		if ($("#inputTecSearchNumberRequest").val()!=''){
			NumberRequest = $("#inputTecSearchNumberRequest").val();
		}
		if ($("#inputTecSearchResponsable").val()!=''){
			Responsable = $("#inputTecSearchResponsable").val();
		}
		if ($("#inputTecSearchDateRequestFrom").val()!=''){
			DateRequestFrom = $("#inputTecSearchDateRequestFrom").val();
		}
		if ($("#inputTecSearchDateRequestTo").val()!=''){
			DateRequestTo = $("#inputTecSearchDateRequestTo").val();
		}		
		table.ajax.url(url+"/0/"+NumberRequest+"/"+Responsable+"/"+DateRequestFrom+"/"+DateRequestTo+"/Asignacion de Tecnico/").load();		
		
	});
	
	var tableTwo = $('#tblTecInboxTwo').DataTable({
		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/En Revision Tecnica/1/",
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
	
	$('#tblTecInbox tbody').on( 'click','#btnWork',function (e) {
		
		var data = table.row( $(this).parents('tr') ).data();
		$('#inputTecRvIdRequest').val(data.id_request);
		$('#inputTecRvNumberRequest').val(data.number_request);
		$('#inputTecRvDateRequest').val(data.format_date_request);
		$('#selTecIdTypeUse').val(data.id_type_use);
		$('#inputTecRvNumberCatastro').val(data.number_catastro);
		$('#inputTecRvResponsable').val(data.responsable);
		$('#inputTecRvResponsableId').val(data.responsable_id);
		$('#inputTecRvAddress').val(data.address);
		$('#selTecRvIdResponsibleOfficial').val(data.id_responsible_official);
		
		$('#divTecReview').modal({show:true});
		
	});
	
	$('#tblTecInboxTwo tbody').on( 'click','#btnWork',function (e) {
		
		var data = tableTwo.row( $(this).parents('tr') ).data();		
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
			   $('#inputTecIdRequest').val(result.id_request);
			   $('#inputTecNumberRequest').val(result.number_request);
			   $('#inputTecDateRequest').val(result.format_date_request);
			   $('#selTecIdTypeUse').val(result.id_type_use);
			   $('#inputTecNumberCatastro').val(result.number_catastro);
			   $('#inputTecNumberCatastroOld').val(result.number_catastro_old);
			   $('#inputTecResponsable').val(result.responsable);
			   $('#inputTecResponsableId').val(result.responsable_id);
			   $('#inputTecResponsableCiv').val(result.responsable_civ);
			   $('#inputTecAdress').val(result.address);
			   $('#inputTecIdResponsibleOfficial').val(result.id_responsible_official);
			   $('#taTecCommentRequisite').html(result.comment_requisite);
			   $('#selIdZone').val(result.id_zone).change();
			   $('#selIdOrdinance').val(result.id_ordinance);
			   
			   $('#inputTecPaymentImput').val(result.payment_imput);
			   $('#inputTecPaymentOutput').val(result.payment_output);

			   var Payment = result.responseRequestPaymentList;
			   $('#inputTecFee').val(Payment[0].fee);
			   $('#inputTecDatePayment').val(result.format_date_payment);
			   
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
			   $('#inputTecIdRequestUpplementary').val(Upplementary.id_request_upplementary);
			   $('#inputTecNumberNoticeCatastro').val(Upplementary.number_notice_catastro);
			   $('#inputTecDateNoticeCatastro').val(result.format_date_notice_catastro);
			   $('#inputTecAreaTerrain').val(Upplementary.area_terrain);
			   $('#inputTecFrontTerrain').val(Upplementary.front_terrain);
			   $('#inputTecAreaUsable').val(Upplementary.area_usable);
			   
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
	
	$( "#btnTecReview" ).click(function() {
		
		url = "/process/request/";
    	dataTracing['id_request'] = $('#inputTecRvIdRequest').val();
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
		    	table.ajax.url("/find/request/0/na/na/0/na/na/Asignacion de Tecnico/1/").load();
		    	tableTwo.ajax.url("/find/request/0/na/na/0/na/na/En Revision Tecnica/1/").load();
		    	$('#divTecReview').modal('hide');
		    },
		    type: 'POST'
		});
		
	});
	
	$( "#btnTecSaveControlReport" ).click(function() {
		
		if(formTecControlReport.valid()){
			var url = "/update/request/";		
			dataRequest['id_request'] = $('#inputTecIdRequest').val();
			dataRequest['id_type_request'] = 1;//VUF
			dataRequest['number_request'] = $('#inputTecNumberRequest').val();
			dataRequest['date_request'] = $('#inputTecDateRequest').val();
			dataRequest['id_type_use'] = $('#selTecIdTypeUse').val();
			dataRequest['number_catastro'] = $('#inputTecNumberCatastro').val();
			dataRequest['number_catastro_old'] = $('#inputTecNumberCatastroOld').val();
			dataRequest['responsable'] = $('#inputTecResponsable').val();
			dataRequest['responsable_id'] = $('#inputTecResponsableId').val();
			dataRequest['responsable_civ'] = $('#inputTecResponsableCiv').val();
			dataRequest['address'] = $('#inputTecAdress').val();
			dataRequest['id_ordinance'] = $('#selIdOrdinance').val();
			dataRequest['payment_output'] = $('#inputTecPaymentOutput').val();
			dataRequest['date_payment'] = $('#inputTecDatePayment').val();
			dataRequest['id_responsible_official'] = $('#inputTecIdResponsibleOfficial').val();
			dataRequest['comment_requisite'] = $('#taTecCommentRequisite').val();
			
			dataRequest['area_terrain']=$('#inputTecAreaTerrain').val();
			dataRequest['area_usable']=$('#inputTecAreaUsable').val();
			dataRequest['date_notice_catastro']=$('#inputTecDateNoticeCatastro').val();
			dataRequest['front_terrain']=$('#inputTecFrontTerrain').val();
			dataRequest['id_request_upplementary']=$('#inputTecIdRequestUpplementary').val();
			dataRequest['number_notice_catastro']=$('#inputTecNumberNoticeCatastro').val();			
						
			
			var id_owners = [];
			$("#tableOwnerList tbody tr").each(function (index) {
				id_owners.push($(this).find('th:eq(0)').text()
						+'-'+$(this).find('th:eq(1)').text());
			});
			dataRequest['id_owners'] = id_owners;
			
			var i= 1;
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
	
	$( "#btnTecProcessControlReport" ).click(function() {
		
		$( "#btnTecSaveControlReport" ).click();

		var url = "/process/request/";
		dataRequest['id_request'] = $('#inputTecIdRequest').val();
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
		    	tableTwo.ajax.url("/find/request/0/na/na/0/na/na/En Revision Tecnica/1/").load();
		    	$('#divTecControlReport').hide();
		    },
		    type: 'POST'
		});
		
	});
    
    $('#btnTecDownload').on('click', function() {
        
    	var url = "/VUF/print/VUFR1/" + $('#inputTecIdRequest').val();
	
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
					+ $('#inputTecIdRequest').val() + "/"
					+ $('#inputTecNumberRequest').val() + "VUFTemp.pdf";
					//link.click();
			   window.open(href, '_blank', '', true);
		   },
			type: 'GET'
		});
        
    });
    
    //Buscar archivos
	function findFiles(typePrint, callback){
		var url = "/printer/excel/" 
			+ $('#inputTecIdRequest').val() + "/"
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
	
	$('#btnTecUploadPlano14Excel').on('click', function() {
		
		var url = "/add/requestAttached/";
		uploadFiles('filePlano14Pdf',function(response){

			dataAttached['id_request_attached'] = 0;
			dataAttached['id_request_requisite'] = $("#requestRequisite14").val();
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
	
	$('#btnTecUploadPlano15Excel').on('click', function() {
		
		var url = "/add/requestAttached/";
		uploadFiles('filePlano15Pdf',function(response){
			
			dataAttached['id_request_attached'] = 0;
			dataAttached['id_request_requisite'] = $("#requestRequisite15").val();
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
			var nameFile = $('#inputTecNumberRequest').val() + "_"
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
			var nameFile = $('#inputTecNumberRequest').val() + "_"
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
		
		if (typeFile == 'filePlano14Pdf'){
			filename = $.trim(inputPlano14Pdf.val());
			formData.append('file', $('input[type=file]')[0].files[0]);
		}else if (typeFile == 'filePlano15Pdf'){
			filename = $.trim(inputPlano15Pdf.val());
			formData.append('file', $('input[type=file]')[1].files[0]);
		}else if (typeFile == 'fileExcelPdf'){
			filename = $.trim(file3.val());
			formData.append('file', $('input[type=file]')[2].files[0]);
		}else if(typeFile == 'fileWordPdf'){
			filename = $.trim(inputWordPdf.val());
			/*findFiles('query', function(response) {
				rename = response.replace("docx", "pdf");
			})*/
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
			url: '/echofile/' + $('#inputTecIdRequest').val(),
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
	
});