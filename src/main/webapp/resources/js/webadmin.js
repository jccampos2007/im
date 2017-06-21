/**
 * 
 */
$(document).ready(function() {
     $('#tabla').DataTable( {
        "sDom": 'rltpi',
        "language": {
             "paginate": {
                  "previous": "Anterior",
                  "next": "Siguiente",
                },

            "lengthMenu": "Mostrar _MENU_",

            "zeroRecords": "No se encontraron resultados.",
            "info": "", //"Página _PAGE_ de _PAGES_",
            "infoEmpty": "No se encontraron registros.",
            "infoFiltered": " "
        }
     } ); 
     
     // alert
     $("#bs-example-modal-lg").on("shown.bs.modal", function () {
        google.maps.event.trigger(map, "resize");
     });
     
     // catalogMngmt
     $(function() {

    	  // We can attach the `fileselect` event to all file inputs on the page
    	  $(document).on('change', ':file', function() {
    	    var input = $(this),
    	        numFiles = input.get(0).files ? input.get(0).files.length : 1,
    	        label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
    	    input.trigger('fileselect', [numFiles, label]);
    	  });

    	  // We can watch for our custom `fileselect` event like this
    	  $(document).ready( function() {
    	      $(':file').on('fileselect', function(event, numFiles, label) {

    	          var input = $(this).parents('.input-group').find(':text'),
    	              log = numFiles > 1 ? numFiles + ' files selected' : label;

    	          if( input.length ) {
    	              input.val(log);
    	          } 
    	          /*else {
    	              if( log )  alert(log);
    	          }*/

    	      });
    	  });
    	  
    	});
     

     //PANEL PRINCIPAL
     $('#btnPanelConsultar').click(function() {
     	$('#citySelected').val($('#city').val());
     	
     	var geocoder =  new google.maps.Geocoder();
     	address = $('#country option:selected' ).text() + ", "+ $('#state option:selected' ).text() + ", "+ $('#city option:selected' ).text();
     	
		geocoder.geocode( { 'address': address}, function(results, status) {
			if (status == google.maps.GeocoderStatus.OK) {
				initMap(results[0].geometry.location.lat(), results[0].geometry.location.lng())
			}
		});
     	
     });
     
     //myTimer();
     
    
});

// package
function obtenerSuma()
{
    //inputQuantity inputPackageValue inputCommission
    document.getElementById('inputCommission').value=parseFloat(document.getElementById('inputQuantity').value)+parseFloat(document.getElementById('inputPackageValue').value);
}



//inputs solo letras
function val(e) {
    tecla = (document.all) ? e.keyCode : e.which;
    if (tecla==8) return true;
    patron =/[A-Za-z]/;
    te = String.fromCharCode(tecla);
    return patron.test(te);
}

$('#country').change(function(){
	       
	var url = "/state/"+$('#country').val();
	
	$.ajax({
	   url: url,
	   data: {
	      format: 'json'
	   },
	   error: function() {		   
		   console.log('ajax -> /state/'+$('#country').val()+', Ha ocurrido un error...');
	   },
	   dataType: 'json',
	   success: function(data) {
		  //$('#idUser').val(data.idStaff);
		   var i = 0;
		   var options ="";
		   
		   
		   while (i < data.length) {
				options += "<option value='"+data[i].idState+"'>"+data[i].stateName+"</option>";
				i++;				
			}
		   $('#city').html('<option hidden disabled selected="selected">Seleccione Ciudad</option>');
		   $('#state').html('<option hidden disabled selected="selected">Seleccione Provincia</option>');
		   $('#state').append(options);
	   },
	   type: 'GET'
	});
});


$('#state').change(function(){
	
	var url = "/city/"+$('#country').val()+"/"+$('#state').val();
	
	$.ajax({
	   url: url,
	   data: {
	      format: 'json'
	   },
	   error: function() {
		   console.log('ajax -> /city/'+$('#country').val()+'/'+$('#state').val()+', Ha ocurrido un error...');
	   },
	   dataType: 'json',
	   success: function(data) {
		  //$('#idUser').val(data.idStaff);
		   var i = 0;
		   var options ="";
		   
		   
		   while (i < data.length) {
				options += "<option value='"+data[i].idCity+"'>"+data[i].cityName+"</option>";
				i++;				
			}
		   $('#city').html('<option hidden disabled selected="selected">Seleccione Ciudad</option>');
		   $('#city').append(options);
	   },
	   type: 'GET'
	});
});


/**
 * Inicializa y limpia todos los Tag Inputs y Sel
 * @param form_target
 */
function clearTagHTML(form_target){
	
	var form_input 	= '#'+form_target+' :input';
	var form_select = '#'+form_target+' select';
	
	$(form_input).each(function(){
		 var input = $(this);
		 switch (input.attr('type')) {
			case 'text':
				input.val('');
				break;
			case 'password':
				input.val('');
				break;
			case 'email':
				input.val('');
				break;
			default:
				break;
			}		 
		});
		
		$(form_select).each(function(){
		 var input = $(this);
		 input.prop("selectedIndex", 0);	 
		});
}