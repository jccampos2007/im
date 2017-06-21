/**
 * 
 */
(function(){
	
	var msgRequired = 'Ingrese un valor';
	var msgSelect	= 'Seleccione un opci&oacute;n';
	//var numOfCharactersToGo = 6 - parseInt($('#password').val().length);
	
	
	var txtpassword = $('#password').val();
	
	
	if (txtpassword  !== undefined ) {
		var numOfCharactersToGo = 6 - parseInt($('#password').val().length);
		
		jQuery.extend(jQuery.validator.messages, {
		    minlength: jQuery.validator.format("Introduzca al menos {0} caracteres. ")
		});
	}
		
	
	$("#form-rider").validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",
        rules: {
			"email": {
	            email: true
	        },
            "password": {
                minlength: 6
            },
            "limit": {
                number: true
            }
        },
        messages: {
            "names": {
                required: msgRequired
            },  
            "lastNames": {
                required: msgRequired
            },
            "email": {
                required: msgRequired,
                email: 'Ingresa un email valido'
            },
            "password": {
                required: msgRequired
            },
            "idDepartment": {
                required: msgRequired
            },
            "limit": {
                required: msgSelect,
                email: 'Ingresa un Monto'
            }
        }
	});
			
	var table = $('#riders_table').DataTable({
	   "sDom": 'ltipr',
	   "processing": true,
	   "serverSide" : true,
	   "lenthChange" : false,
	   "iDisplayLength" : 10,
	   "autoWidth": false,
	   "sAjaxSource" : "corporate/riders",
	   "columnDefs": [	        
	        {
	        	"targets":-1,
	        	"data":null, 
	        	"defaultContent": 
	            	'<a href="#" id="edit" class="glyphicon glyphicon-edit text-info"></a>&nbsp;'+
		            '<a href="#" id="delete" class="glyphicon glyphicon-remove text-danger"></a>'            	   
	        }
	    ],
	    "columns": [
	        { "data": "countryNameRider" },
	        { "data": "cityName" },
	        { "data": "namesRider" },
	        { "data": "lastNamesRider" },
	        { "data": "departmentName" },
	        { "data": "limitUserCompany" },
	        { "data": null}
	    ],
        "language": {
    	   "paginate": {
    		   "first":"Primero",
    		   "previous": "Anterior",
    		   "next": "Siguiente",
    		   "last":"Ultimo"
    	   },
    	   "lengthMenu"		: "Mostrar _MENU_",
    	   "zeroRecords"	: "No se encontraron resultados.",
    	   "info"			: "P&aacute;gina _PAGE_ de _PAGES_",
    	   "infoEmpty"		: "No se encontraron registros.",
    	   "infoFiltered"	: "",
    	   "search"			: "Buscar:",
    	   "processing"		: "Procesando..."
        }	       
	});
	 
	$('#columna0').on( 'keyup', function () {
	    table.column(0).search( this.value ).draw();
	} );	 
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
	 
	$('#riders_table tbody').on( 'click', '#edit', function () {
        var data = table.row( $(this).parents('tr') ).data();
        $('#idCountryCatalog').val(data.idCountryRider);
        $('#idRider').val(data.idRider);
        $('#idUserRider').val(data.idUserRider);
        $('#names').val(data.namesRider);
        $('#lastNames').val(data.lastNamesRider);
        $('#email').val(data.username);
        $("#password").prop('disabled', true);
        $('#phoneNumber').val(data.mobileRider);
        $('#idDepartment').val(data.idDepartment);
        $('#limit').val(data.limitUserCompany);
        if (data.statusUserCompany){
            $('#statusUserCompany').val(1);
        }else{
            $('#statusUserCompany').val(0);
        }
    } );

	$('#riders_table tbody').on( 'click', '#delete', function () {
        var data = table.row( $(this).parents('tr') ).data();
        $('#form-idUserRider').val(data.idUserRider);
        $('#id').html(data.idUserRider);
        $('#namesRider').html(data.namesRider + ' ' + data.lastNamesRider);
        $('.modal').modal({show:true});
    } );
	 
	$('#btn-delete').on('click', function(e){
		e.preventDefault();
		var action = "/corporate/rider/"+$('#form-idUserRider').val()+"/delete"
		$('.modal').modal('hide');
		$('#form-delete').attr('action', action);
		$('#form-delete').submit();		
	});
	
	$('#btn-cancel').on('click', function(e){
		e.preventDefault();
		$("#form-rider :input").each(function(){
		var input = $(this);
		switch (input.attr('type')) {
			case 'text':
				input.val('');
				break;
			case 'password':
				input.val('');
				input.prop('disabled', false);
				break;
			case 'hidden':
				input.val('');
				break;
			default:
				break;
			}
		});
		
		$("#form-rider select").each(function(){
		 var input = $(this);
		 input.prop("selectedIndex", 0);	 
		});
	});
	
	$('#phoneNumber').mask('+000-0-0000000');
	
})();