/**
 * 
 */
var markers = [];
(function(){
	var table = $('#family_rider_tabla').DataTable({
	   "sDom": 'ltipr',
	   "processing": true,
	   "serverSide" : true,
	   "lenthChange" : false,
	   "iDisplayLength" : 10,
	   "autoWidth": false,
	   "sAjaxSource" : "familyList",
	   "columnDefs": [
            {
	        	"targets":-1,
	        	"data":null, 
	        	"defaultContent": 
		            '<a href="#" id="btn-delete" class="glyphicon glyphicon-remove text-danger"></a>&nbsp;'           	   
            }
        ],
        "columns": [
            { "data": "names" },
            { "data": "lastNames" },
            { "data": "email" },
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
	
	$("#form-addFamilyRider").validate({
		//set this to false if you don't what to set focus on the first invalid input
        //focusInvalid: false,
        //by default validation will run on input keyup and focusout
        //set this to false to validate on submit only
        //onkeyup: false,
        //onfocusout: false,
        //errorClass: "invalid",

        rules: {
            email: {
                required: true,
                email: true
              }
        },
        messages: {
            "email": {
                required: 'El Correo es Requerido'
            }
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
	
	$('#family_rider_tabla tbody').on( 'click', '#btn-delete', function () {
        var data = table.row( $(this).parents('tr') ).data();
        $('#idRiderParent').val(data.idFamilyRider);
        $('#idRiderSon').val(data.idRider);
        $('#fullNames').html(data.names+" "+data.lastNames+" ("+data.email+")");
        $('#deleteFamilyRider').modal({show:true});
    } );

	$('#btn-delete-family-rider').on('click', function(e){
		e.preventDefault();
		var action = "/rider/delete/"+$('#idRiderSon').val()+"/"+$('#idRiderParent').val()
		$('.modal').modal('hide');
		$('#form-delete-family-rider').attr('action', action);
		$('#form-delete-family-rider').submit();
	});
	
})();