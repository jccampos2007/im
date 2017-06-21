/**
 * 
 */
$(document).ready(function(){
	var formAddOwner = $( "#formAddOwner" );
	var formEditOwner = $( "#formEditOwner" );
	$('#tableOwnerList tr > *:nth-child(1)').toggle();
	$('#tableOwnerList tr > *:nth-child(2)').toggle();
	
	formAddOwner.validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",

        rules: {
			"inputAddOwnerId": {
				required:true
	        },
            "inputAddNameOwner": {
				required:true
            },
            "inputAddEmailOwner": {
                required: true,
                email: true
            },
            "inputAddPhoneOwner": {
				required:true
            },
            "inputAddMobileOwner": {
				required:true
            }
        },
        messages: {
            "inputAddOwnerId": {
                required: 'La CI / Rif es Requerido.'
            },  
            "inputAddNameOwner": {
                required: 'El Nombre es Requerida.'
            },
            "inputAddEmailOwner": {
                required: 'El Correo es Requerido.',
                email: 'Debe ser un Correo valido.'
            },
            "inputAddPhoneOwner": {
                required: 'El Telefono Hab. es Requerida.'
            },
            "inputAddMobileOwner": {
                required: 'El Telefono Celular es Requerida.'
            }
        }
	});
	
	$('#btnAddOwner').on('click', function(e){
		
		initOwner();
		$('#divAddOwner').modal({show:true});
		
	});
	
	$('#tableOwnerList tbody').on( 'click', '#btnEditOwner', function () {
		
		initOwner();
		var id_owner = $(this).closest('tr').find('th').eq(0).html();
		var url = "/find/ownerById/" + id_owner;
		$.get(url, function(data, status){			
			var response = data.responseData[0];
			$("#inputEditOwnerId").val(response.owner_id);
			$("#inputEditNameOwner").val(response.name_owner);
			$("#inputEditIdOwner").val(response.id_owner);
			$("#inputEditEmailOwner").val(response.email_owner);
			$("#selEditNationalityOwner").val(response.nationality_owner);
			$("#inputEditPhoneOwner").val(response.phone_owner);
			$("#inputEditMobileOwner").val(response.mobile_owner);
			$('#divEditOwner').modal({show:true});
	    });
		
	});
	
	$( "#btnAddDataOwner" ).click(function() {
		
		var url = "/add/owner/";
		dataRequest["id_owner"] = $("#inputAddIdOwner").val();
		dataRequest["name_owner"] = $("#inputAddNameOwner").val();
		dataRequest["owner_id"] = $("#inputAddOwnerId").val();
		dataRequest["email_owner"] = $("#inputAddEmailOwner").val();
		dataRequest["nationality_owner"] = $("#selAddNationalityOwner").val();
		dataRequest["phone_owner"] = $("#inputAddPhoneOwner").val();
		dataRequest["mobile_owner"] = $("#inputAddMobileOwner").val();		
		if(formAddOwner.valid()){
			if ($("#inputAddIdOwner").val() == ''){
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
							title: 'Agregar Propietario',
							text: 'El Propietario se agrego con exito.',
							type: 'success',
							hide: true,
							styling: 'bootstrap3',
							icon: 'ui-icon ui-icon-mail-closed'
						});
				    	var response = data.responseData;
				    	var html = '<tr>'
					     	 + '<th style="display: none;">'+response.id_owner+'</th>'
					     	 + '<th style="display: none;">0</th>'
							 + '<th>'+dataRequest["name_owner"]+'</th>'
							 + '<th>'+dataRequest["owner_id"]+'</th>'
							 + '<th>'+dataRequest["email_owner"]+'</th>'
							 + '<th>'+dataRequest["phone_owner"]
			    			 +' / '+dataRequest["mobile_owner"]+'</th>'
							 + '<th><a href="#" id="btnEditOwner" class="glyphicon glyphicon-edit text-info"></a> '
							 +'<a href="#" id="btnDeleteRequestOwner" class="glyphicon glyphicon-remove text-info"></a></th>'
							 + '</tr>';
				    	$('#tableOwnerList tbody').append(html);
				    	$('#divAddOwner').modal('hide');
				    },
				    type: 'POST'
				});
				
			}else{				
				var html = '<tr>'
			     	 + '<th style="display: none;">'+dataRequest["id_owner"]+'</th>'
			     	 + '<th style="display: none;">0</th>'
					 + '<th>'+dataRequest["name_owner"]+'</th>'
					 + '<th>'+dataRequest["owner_id"]+'</th>'
					 + '<th>'+dataRequest["email_owner"]+'</th>'
					 + '<th>'+dataRequest["phone_owner"]
	    			 +' / '+dataRequest["mobile_owner"]+'</th>'
					 + '<th><a href="#" id="btnEditOwner" class="glyphicon glyphicon-edit text-info"></a> '
					 +'<a href="#" id="btnDeleteRequestOwner" class="glyphicon glyphicon-remove text-info"></a></th>'
					 + '</tr>';
		    	$('#tableOwnerList tbody').append(html);
		    	$('#divAddOwner').modal('hide');		    	
			}
		}else{
			return false;
		}
		
	});

	$( "#btnEditDataOwner" ).click(function() {
		
		var url = "/add/owner/";
		dataRequest["id_owner"] = $("#inputEditIdOwner").val();
		dataRequest["name_owner"] = $("#inputEditNameOwner").val();
		dataRequest["owner_id"] = $("#inputEditOwnerId").val();
		dataRequest["email_owner"] = $("#inputEditEmailOwner").val();
		dataRequest["nationality_owner"] = $("#selEditNationalityOwner").val();
		dataRequest["phone_owner"] = $("#inputEditPhoneOwner").val();
		dataRequest["mobile_owner"] = $("#inputEditMobileOwner").val();		
		if(formEditOwner.valid()){
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
						title: 'Modifico Propietario',
						text: 'El Propietario se agrego con exito.',
						type: 'success',
						hide: true,
						styling: 'bootstrap3',
						icon: 'ui-icon ui-icon-mail-closed'
					});
			    	
			    	$('#tableOwnerList tr').each(function(){
			            if($(this).find('td').eq(0).text() == dataRequest["id_owner"]){
			            	$(this).eq(2).empty().html(dataRequest["name_owner"]);
			            	$(this).eq(3).empty().html(dataRequest["owner_id"]);
			            	$(this).eq(4).empty().html(dataRequest["email_owner"]);
			            	$(this).eq(5).empty().html(dataRequest["phone_owner"] 
			            	+ " / " + dataRequest["mobile_owner"]);
			            }
			        }); 
			        
			    	$('#divEditOwner').modal('hide');
			    },
			    type: 'POST'
			});
		}else{
			return false;
		}
		
	});
	
	$('#btnFindOwner').on('click', function(e){
		var url = "/find/owner/" + $("#inputAddOwnerId").val();
		initOwner();
		$.get(url, function(data, status){
			if(data.responseCode == 200 && data.errorCode == 0 && data.responseData.length > 0){
				var response = data.responseData[0];
				new PNotify({
					title: 'Consultar Propietario',
					text: 'Propietario registrado.',
					type: 'success',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
				$("#inputAddNameOwner").val(response.name_owner);
				$("#inputAddIdOwner").val(response.id_owner);
				$("#inputAddEmailOwner").val(response.email_owner);
				$("#selAddNationalityOwner").val(response.nationality_owner);
				$("#inputAddPhoneOwner").val(response.phone_owner);
				$("#inputAddMobileOwner").val(response.mobile_owner);
			}else{
				$(".inputOwner").prop('disabled', false);
				new PNotify({
					title: 'Consultar Propietario',
					text: 'No se encuentra el propietario registrado.',
					type: 'notice',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
			}
	    });
	});
	

	
	$('#tableOwnerList tbody').on( 'click', '#btnDeleteRequestOwner', function () {
		
		var id_request_owner = $(this).closest('tr').find('th').eq(1).html();
		var url = "/delete/requestOwner/" + id_request_owner;
		$.get(url, function(data, status){
			if(data.responseCode == 200 && data.errorCode == 0){
				var response = data.responseData[0];
				new PNotify({
					title: 'Consultar Propietario',
					text: 'Se elimino propietario corectamente.',
					type: 'success',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
				$(this).parents('tr').first().remove();
			}else{
				$(".inputOwner").prop('disabled', false);
				new PNotify({
					title: 'Consultar Propietario',
					text: 'No se elimino propietario corectamente.',
					type: 'error',
					hide: true,
					styling: 'bootstrap3',
					icon: 'ui-icon ui-icon-mail-closed'
				});
			}
	    });
	});
	
	function initOwner(){
		//ADD
		$("#inputAddNameOwner").val('');
		$("#inputAddIdOwner").val('');
		$("#inputAddEmailOwner").val('');
		$("#selAddNationalityOwner").val('V');
		$("#inputAddPhoneOwner").val('');
		$("#inputAddMobileOwner").val('');
		
		//EDIT
		$("#inputEditNameOwner").val('');
		$("#inputEditIdOwner").val('');
		$("#inputEditEmailOwner").val('');
		$("#selEditNationalityOwner").val('V');
		$("#inputEditPhoneOwner").val('');
		$("#inputEditMobileOwner").val('');
		
		$(".inputOwner").prop('disabled', true);
    }
	
	initOwner();

	$('#chkSelectAllYes').change(function() {
        if($(this).is(":checked")) {
        	$("input[value='yes']").prop('checked', true);
        	$("input[value='no']").prop('checked', false);
        	$("input[value='does_not_apply']").prop('checked', false);
        }else{
        	$("input[value='yes']").prop('checked', false);
        	$("input[value='no']").prop('checked', false);
        	$("input[value='does_not_apply']").prop('checked', false);
        }
    });
	
	$('#chkSelectAllNo').change(function() {
        if($(this).is(":checked")) {
        	$("input[value='yes']").prop('checked', false);
        	$("input[value='no']").prop('checked', true);
        	$("input[value='does_not_apply']").prop('checked', false);
        }else{
        	$("input[value='yes']").prop('checked', false);
        	$("input[value='no']").prop('checked', false);
        	$("input[value='does_not_apply']").prop('checked', false);
        }
    });
	
	$('#chkSelectAllNa').change(function() {
        if($(this).is(":checked")) {
        	$("input[value='yes']").prop('checked', false);
        	$("input[value='no']").prop('checked', false);
        	$("input[value='does_not_apply']").prop('checked', true);
        }else{
        	$("input[value='yes']").prop('checked', false);
        	$("input[value='no']").prop('checked', false);
        	$("input[value='does_not_apply']").prop('checked', false);
        }
    });
	
	$('#chkSelectAllPending').change(function() {
		
        if($(this).is(":checked")) {
        	$("input[value='yes']").prop('checked', false);
        	$("input[value='no']").prop('checked', false);
        	$("input[value='does_not_apply']").prop('checked', false);
        	$("input[value='pending']").prop('checked', true);
        }else{
        	$("input[value='yes']").prop('checked', false);
        	$("input[value='no']").prop('checked', false);
        	$("input[value='does_not_apply']").prop('checked', false);
        	$("input[value='pending']").prop('checked', false);
        }
        
    });
	
	$('#selIdZone').change(function(){
	       
		var url = "/ordinance/"+$('#selIdZone').val();
		$('#selIdOrdinance').html('');
		$.ajax({
		   url: url,
		   data: {
		      format: 'json'
		   },
		   error: function() {		   
			   console.log('ajax -> /ordinance/'+$('#selIdZone').val()+', Ha ocurrido un error...');
		   },
		   dataType: 'json',
		   success: function(data) {
			   var i = 0;
			   var options ="";
		   
		   
			   while (i < data.length) {
				   options += "<option value='"+data[i].id_ordinance+"'>"+data[i].name_ordinance+"</option>";
				   i++;				
			   }
			   $('#selIdOrdinance').append(options);
		   },
		   type: 'GET'
		});
		
	});

	$('#btnCheckFee').on('click', function(e){
		
		var url = "/find/paymentVansat/"+$('#inputRecFee').val();
		$.ajax({
		   url: url,
		   data: {
		      format: 'json'
		   },
		   error: function() {		   
			   console.log("/find/paymentVansat/"+$('#inputRecFee').val()+', Ha ocurrido un error...');
		   },
		   dataType: 'json',
		   success: function(data) {
				$('#inputRecPaymentImput').val(data.amount);
				$('#inputRecDatePayment').val(data.format_date);
		   },
		   type: 'GET'
		});
	});
	
});