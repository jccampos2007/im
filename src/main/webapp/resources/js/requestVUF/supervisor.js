/**
 * 
 */
var dataSearch = {};
var dataRequest = {};
var dataTracing = {};
$(document).ready(function(){
	$('#divSupAssignOfficial').hide();
	$('#tblSupOwner tr > *:nth-child(1)').toggle();
	var formAssignOfficial = $( "#formSupAssignOfficial" );
	$('#selSupIdTypeUse').prop( "disabled", true );
	
	var table = $('#tblSupInbox').DataTable({		
		"sDom": 'ltipr',
		"processing": true,
		"serverSide" : true,
		"lenthChange" : false,
		"iDisplayLength" : 10,
		"autoWidth": false,
		"sAjaxSource" : "/find/request/0/na/na/0/na/na/Registro/1/",
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
	            	'<a href="#" id="btnAssignOfficial" class="glyphicon glyphicon-edit text-info"></a>'            	   
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
	
	$('#btnSupSearch').on('click', function(e){
		
		var url = "/VUF/find/request";
		var NumberRequest = 'na';
		var Responsable = 'na';
		var DateRequestFrom = 'na';
		var DateRequestTo = 'na';
		if ($("#inputSupSearchNumberRequest").val()!=''){
			NumberRequest = $("#inputSupSearchNumberRequest").val();
		}
		if ($("#inputSupSearchResponsable").val()!=''){
			Responsable = $("#inputSupSearchResponsable").val();
		}
		if ($("#inputSupSearchDateRequestFrom").val()!=''){
			DateRequestFrom = $("#inputSupSearchDateRequestFrom").val();
		}
		if ($("#inputSupSearchDateRequestTo").val()!=''){
			DateRequestTo = $("#inputSupSearchDateRequestTo").val();
		}		
		table.ajax.url(url+"/0/"+NumberRequest+"/"+Responsable+"/"+DateRequestFrom+"/"+DateRequestTo+"/Registro/").load();		
		
	});
	
	
	
	$('#tblSupInbox tbody').on( 'click','#btnAssignOfficial',function (e) {
		
		var data = table.row( $(this).parents('tr') ).data();		
		//MOSTRAR divSupInbox
		$('#inputSupNumberRequest').val(data.number_request);
		$('#inputSupIdRequest').val(data.id_request);
		$('#inputSupDateRequest').val(data.format_date_request);
		$('#selSupIdTypeUse').val(data.id_type_use);
		$('#inputSupTypeUse').val(data.name_type_use);
		$('#inputSupNumberCatastro').val(data.number_catastro);
		$('#inputSupNumberCatastroOld').val(data.number_catastro_old);
		$('#inputSupResponsable').val(data.responsable);
		$('#inputSupResponsableCiv').val(data.responsable_civ);
		$('#inputSupResponsableId').val(data.responsable_id);
		$('#inputSupAddress').val(data.address);
		$('#inputSupIdOrdinance').val(data.id_ordinance);
		$('#inputSupPaymentOutput').val(data.payment_output);
		$('#divSupAssignOfficial').modal("show");
		
	} );
	
	$( "#btnSupAssignOfficial" ).click(function() {
		
		if(formAssignOfficial.valid()){
			var url = "/update/request/";
			dataRequest["id_request"] = $("#inputSupIdRequest").val();
			dataRequest['id_type_request'] = 1;//VUF
			dataRequest['number_request'] = $('#inputSupNumberRequest').val();
			dataRequest['date_request'] = $('#inputSupDateRequest').val();
			dataRequest['id_type_use'] = $('#selSupIdTypeUse').val();
			dataRequest['number_catastro'] = $('#inputSupNumberCatastro').val();
			dataRequest['number_catastro_old'] = $('#inputSupNumberCatastroOld').val();
			dataRequest['responsable'] = $('#inputSupResponsable').val();
			dataRequest['responsable_id'] = $('#inputSupResponsableId').val();
			dataRequest['responsable_civ'] = $('#inputSupResponsableCiv').val();
			dataRequest['address'] = $('#inputSupAddress').val();
			dataRequest['id_ordinance'] = $('#inputSupIdOrdinance').val();
			dataRequest['payment_output'] = $('#inputSupPaymentOutput').val();
			dataRequest["id_responsible_official"] = $("#selSupIdResponsibleOfficial").val();
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
			    	dataTracing['id_request'] = $('#inputSupIdRequest').val();
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
					    	table.ajax.url("/find/request/0/na/na/0/na/na/Registro/1/").load();
					    	$('#divSupAssignOfficial').modal('hide');
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
	
});