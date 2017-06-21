/**
 * 
 */
(function(){	
var msgRequired = 'Ingrese un valor';
var msgSelect	= 'Seleccione una opci&oacute;n';
	
	var validateCorporate = $("#form-corporate").validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",
		ignore: ".ignore",
        rules: {
            "name": {
                minlength: 6
            },
            "phone":{
            	//number:true,
            	maxlength:15
            },
            "userAdminName":{
            	minlength:6,
            },
            "userAdminPassword":{
            	minlength:6,
            	maxlength:15
            },
            "cutOffDay":{
            	number:true,
            	range: [1, 30]
            }
        },
        messages: {
            "name": {
                required: msgRequired,
                minlength:"M&iacute;nimo (06) caracteres"
            },  
            "localIdNumber": {
                required: msgRequired
            },
            "phone": {
                required: msgRequired,
                //number	: 'Ingresa un numero v&acute;lido',
                maxlength: "M&aacute;ximo 15 caracteres"
            },
            "email": {
                required: msgRequired,
                email	: 'Ingresa un email v&aacute;lido'
            },
            "addressLine1": {
                required: msgRequired
            },
            "legalRepresentative": {
                required: msgRequired
            },
            "cutOffDay": {
                required: msgRequired,
                range:"Valores permitidos [1 - 30]"
            },
            "fee": {
                required: msgRequired
            },
            "status": {
                required: msgSelect
            },
            "userAdminName": {
                required: msgRequired,
                minlength:"M&iacute;nimo (06) caracteres"
            },
            "userAdminEmail": {
                required: msgRequired,
                email	: 'Ingresa un email v&aacute;lido'
            },
            "userAdminPassword": {
                required: msgRequired,
                minlength: "M&iacutenimo (06) caracteres",
           	 	maxlength: "M&aacute;ximo 15 caracteres"
            }
        }
	});	
	
	var action = $('#corp-opt-action').val();
	var message = $('#corp-opt-message').val();
	var title = $('#corp-opt-title').val();
	$('#corp-opt-action').val('');
	$('#corp-opt-message').val('');
	$('#corp-opt-title').val('');
	
	if(action === 'success-corp'){		
		new PNotify({
           title: title,
           text: message,
           type: 'success',
           hide: true,
           styling: 'bootstrap3',
           icon: 'ui-icon ui-icon-mail-closed'
       });
	}else if(action === 'fail-corp'){
		new PNotify({
           title: title,
           text: message,
           type: 'error',
           hide: true,
           styling: 'bootstrap3',
           icon: 'ui-icon ui-icon-mail-closed'
       });
	}
	
	var allowquery = $('#allow-corp-query').val();
	var allow_query = true;
	if(allowquery ==='false'){
		allow_query = false;
	}
	 var table = $('#corporate_table').DataTable({
	   "sDom": 'ltipr',
	   "processing": true,
	   "serverSide" : true,
	   "lenthChange" : false,
	   "iDisplayLength" : 10,
	   "autoWidth": false,
	   "sAjaxSource" : "corporate/list",
	   "columnDefs": [	  
	        { targets: [0], visible: true},
	        { targets: [-1], visible: allow_query},
            {
	        	"targets":-1,
	        	"orderable": false,
	        	"data":null, 
	        	"defaultContent": 
	            	'<a href="#" id="edit-corporate" class="glyphicon glyphicon-edit text-info"></a>&nbsp;'
		            //'<a href="#" id="query-corporate" class="glyphicon glyphicon-eye-open text-muted"></a>&nbsp;'+
		            //'<a href="#" id="delete-corporate" class="glyphicon glyphicon-remove text-danger"></a>'            	   
            },
            {
            	"targets": -2,
                "data": "status",
                "render": function ( data, type, full, meta ) {
                	return type === 'display' && data === 1 ? 'Activo' : 'No activo';
                }
            }
        ],
        "columns": [                    
            { "data": "idCompany", "width": "1%"},
            { "data": "name", "width": "20%" },
            { "data": "localIdNumber", "width": "10%"},
            { "data": "legalRepresentative", "width": "25%" },
            { "data": "phone", "width": "10%"},            
            { "data": "email", "width": "25%" },
            { "data": "status" },
            { "data": null}
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
	    	   "info"			: "P&aacute;gina _PAGE_ de _PAGES_",
	    	   "infoEmpty"		: "No se encontraron registros.",
	    	   "infoFiltered"	: "",
	    	   "search"			: "Buscar:",
	    	   "processing"		: "Procesando..."
	       }	       
    });	
	 
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
	$('#columna6').on( 'change', function () {
		var val = $(this).val();
		table.column(6).search(val).draw();
	} );
		 	 
	$('#corporate_table tbody').on( 'click', '#edit-corporate', function (e) {
		e.preventDefault();
        var data = table.row( $(this).parents('tr') ).data();        
               
		var url = "/corporate/"+data.idCompany;
		
		$.ajax({
		   url: url,
		   data: {
		      format: 'json'
		   },
		   error: function() {
			   alert('Corporativo Ha ocurrido un error...');
		   },
		   dataType: 'json',
		   success: function(data) {
			  $('#corp-idCompany').val(data.idCompany); 
			  $('#corp-name').val(data.name);
			  $('#corp-localIdNumber').val(data.localIdNumber);	
			  $('#corp-phone').val(data.phone);
			  $('#corp-email').val(data.email);
			  $('#corp-addressLine1').val(data.addressLine1);
			  $('#corp-legalRepresentative').val(data.legalRepresentative);
			  $('#corp-cutOffDay').val(data.cutOffDay);
			  $('#corp-fee').val(data.fee);
			  $('#corp-status').val(data.status);
			  $('#corp-statusOld').val(data.status);
			  $('#corp-userAdminName').val(data.userAdminName);
			  $('#corp-userAdminEmail').val(data.userAdminEmail);
			  $('#corp-userAdminPassword').val(data.userAdminPassword);
			  $('#corp-action').val(data.action);
			  $('#_method').val('PUT');
			  
			  $('#corp-userAdminPassword').addClass( "ignore" );
			  //deshabilitar los campos de password y repeat-password
			  $('#corp-userAdminPassword').prop('disabled', true);
			  $('#corp-userAdminName').prop('disabled', true);
			  $('#corp-userAdminEmail').prop('disabled', true);
			  validateCorporate.resetForm();
		   },
		   type: 'GET'
		});
    } );
	
	$('#corporate_table tbody').on( 'click', '#query-corporate', function () {
        var data = table.row( $(this).parents('tr') ).data();
        alert( data.name +"'s query is: "+ data.phone);
    } );
		
	$('#btn-cancel-corporate').on('click', function(e){
		e.preventDefault();
		
		$('#_method').val('POST');
		
		clearTagHTML('form-corporate');
		$('#corp-userAdminPassword').removeClass("ignore");
		$('#corp-userAdminName').prop('disabled', false);
		$('#corp-userAdminEmail').prop('disabled', false);
		$('#corp-userAdminPassword').prop('disabled', false);
		
	});
	
	$(document).ready(function(){
		/**
		 * plugin para que acepte solo numeros en los numero de telefonos
		 */
		$(".numeric").numeric({ decimal: false, negative: false });
		$(".decimal-2-places").numeric({ decimalPlaces: 2 });
		
		/**
		 * Jquery Mask Plugin
		 */
		$('#corp-phone').mask('+000-000000000');
		$('#corp-cutOffDay').mask('09');
		$('#corp-userAdminPassword').mask('AAAAAAAAAAAAAAA', {'translation': {
            A: {pattern: /[A-Za-z0-9]/}
          }
		});
	});
})();