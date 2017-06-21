/**
 * 
 */
var dataSearch = {};
var dataRequest = {};
$(document).ready(function(){
	//$('#divControlReport').hide();DEMO
	$('#divOrdinance').hide();
	var formVUERecSearchCS = $("#formVUERecSearchCS");//FORM BUSCAR CS
	var formVUERecControlReport = $("#formVUERecControlReport");//FORM BUSCAR CS
	
	//defaultDate:dateNow
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
	
	formVUERecControlReport.validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",

        rules: {
			"inputVUERecNumberRequest": {
				required:true
	        },
            "inputVUERecDateRequest": {
				required:true
            },
            "inputVUERecNumberCatastro": {
				required:true
            },
            "inputVUERecAdress": {
				required:true
            },
            "inputVUERecFee": {
				required:true
            }
        },
        messages: {
            "inputVUERecNumberRequest": {
                required: 'El Nro. Solicitud es Requerido'
            },  
            "inputVUERecDateRequest": {
                required: 'La Fecha Solicitud es Requerida'
            },
            "inputVUERecNumberCatastro": {
                required: 'El Nro. Catastro es Requerido'
            },
            "inputVUERecAdress": {
                required: 'La DiVUEReccion es Requerida'
            },
            "inputVUERecFee": {
                required: 'Debe verificar la tasa es Requerida'
            }
        }
	});
	
	$('#btnVUERecRequestSearch').on('click', function(e){
		return false;//DEMO
		if(formVUERecSearchCS.valid()){
			var url = "/VUF/find/CS/"+$('#inputVUERecRequestNroCS').val();		
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
				   var result = data.responseData;
				   $('#inputVUERecAdress').val(result.address);
				   $('#inputVUERecNumberCatastro').val(result.nroCatastro);
				   $('#inputVUERecResponsable').val(result.responsable);
				   $('#inputVUERecResponsableId').val(result.responsable_id);
				   $('#inputVUERecResponsableCiv').val(result.responsable_civ);					
			   },
			   type: 'GET'
			});
			$('#divControlReport').toggle();
		}else{
			return false;
		}
	});
	
	$('#btnVUERecCancel').on('click', function(e){
		//$('#divControlReport').hide();DEMO
		$(':input').val('');
		$(':radio').prop('checked', false);
	});
	
	$('#btnVUERecProcess').on('click', function(e){
		
		if(formVUERecControlReport.valid()){
			var url = "/update/request/";
			var fecha = $('#inputVUERecDateRequest').val();
			var res = fecha.split(" ");
			dataRequest['id_request'] = 0;
			dataRequest['id_type_request'] = 2;//VUE
			dataRequest['id_request_parent'] = 0;//VUE
			dataRequest['number_request'] = $('#inputVUERecNumberRequest').val();
			dataRequest['date_request'] = res[0];
			dataRequest['id_type_use'] = $('#selVUERecIdTypeUse').val();
			dataRequest['number_catastro'] = $('#inputVUERecNumberCatastro').val();
			dataRequest['number_catastro_old'] = $('#inputVUERecNumberCatastroOld').val();
			dataRequest['responsable'] = $('#inputVUERecResponsable').val();
			dataRequest['responsable_id'] = $('#inputVUERecResponsableId').val();
			dataRequest['responsable_civ'] = $('#inputVUERecResponsableCiv').val();
			dataRequest['address'] = $('#inputVUERecAdress').val();
			dataRequest['id_responsible_official'] = 0;
			dataRequest['comment_requisite'] = $('#taVUERecCommentRequisite').val();
			
			dataRequest['id_ordinance'] = $('#selIdOrdinance').val();
			dataRequest['fee'] = $('#inputRecFee').val();
			dataRequest['date_payment'] = $('#inputRecDatePayment').val();
			dataRequest['payment_imput'] = $('#inputRecPaymentImput').val();
			
			var id_owners = [];
			$("#tableOwnerList tbody tr").each(function (index) {
				id_owners.push($(this).find('th:eq(0)').text()
						+ '-' + $(this).find('th:eq(1)').text());
			});
			dataRequest['id_owners'] = id_owners;		
			
			var i= 16;
			var id_requisites = [];
			var row_requisites = '';
			$('#tblVUERecRequestRequisite > tbody  > tr').each(function () {
				if($(this).find('th input:radio:checked').val()!== undefined){
					row_requisites = i+'-0-'+$(this).find('th input:checked').val();
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
			    	if(data.responseCode == 200 && data.errorCode == 0){		    	    
				    	new PNotify({
							title: 'Actualizar Solicitud',
							text: 'Se actualizo la solicitud con exito.',
							type: 'success',
							hide: true,
							styling: 'bootstrap3',
							icon: 'ui-icon ui-icon-mail-closed'
						});
			    	}else{
			    		new PNotify({
							title: 'Actualizar Solicitud',
							text: 'No se actualizo la solicitud intente de nuevo.',
							type: 'error',
							hide: true,
							styling: 'bootstrap3',
							icon: 'ui-icon ui-icon-mail-closed'
	                    });
			    	}
			    },
			    type: 'POST'
			});		
			//$('#divControlReport').hide();DEMO
			$(':input').val('');
			$(':radio').prop('checked', false);
		}else{
			return false;
		}
	});
	
});