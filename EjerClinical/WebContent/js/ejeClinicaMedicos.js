var medicos = [];

$( document ).ready(function() {
	cargaMedicos ();
	cargaEspecialidades ();
});

function modificaMedico(i) {
	$("#dnim").val(medicos[i].dni);
	$("#nombrem").val(medicos[i].nombre);
	$("#apellidosm").val(medicos[i].apellidos);
	$("#especialidadm").val(medicos[i].especialidad);
	$("#modificacion").modal("show");
	$("#guardarMedicom").click(function() {
		$.post( "MedicosModificacion", { dni: $("#dnim").val(), nombre: $("#nombrem").val(), apellidos: $("#apellidosm").val(), especialidad: $("#especialidadm").val() })
			.done(function( data ) {
			$("<p class=\"p-3 mb-2 "+data.clase+" text-white\" id=\"textomensaje\">"+data.mensaje+"</p>").appendTo( "#mensaje" );
			$("#alta").modal("hide");
			$("#textomensaje").delay( 1000 ).fadeOut( 400 );
			setTimeout(location.reload.bind(location), 1200);
			});
	});
	
	
}



function guardaMedico () {
	$.post( "MedicosAlta", { dni: $("#dni").val(), nombre: $("#nombre").val(), apellidos: $("#apellidos").val(), especialidad: $("#especialidad").val() })
	  .done(function( data ) {
		  $("<p class=\"p-3 mb-2 "+data.clase+" text-white\" id=\"textomensaje\">"+data.mensaje+"</p>").appendTo( "#mensaje" );
		  $("#alta").modal("hide");
		  $("#textomensaje").delay( 1000 ).fadeOut( 400 );
		  setTimeout(location.reload.bind(location), 1200);
		  
	    
	  });
	
	};
	
	

function eliminarMedico (i) {
	$("#advertencia").modal("show");
	$("#si").click(function() {
		$.post( "MedicosBaja", { dni: medicos[i].dni, nombre: medicos[i].nombre, apellidos: medicos[i].apellidos, especialidad: medicos[i].especialidad })
		  .done(function( data ) {
			  $("<p class=\"p-3 mb-2 "+data.clase+" text-white\" id=\"textomensaje\">"+data.mensaje+"</p>").appendTo( "#mensaje" );
			  $("#advertencia").modal("hide");
			  $("#textomensaje").delay( 1000 ).fadeOut( 400 );
			  setTimeout(location.reload.bind(location), 1200);
			  
		    
		  });
	 });
		
		};

function cargaMedicos () {
	$.getJSON( "MedicosLista", function( data ) {
		  medicos = data;
		  for(var i in medicos) {
     	  $('<tr><td>'+medicos[i].dni+'</td><td>'+medicos[i].apellidos+'</td><td>'+medicos[i].nombre+'</td><td>'+medicos[i].especialidad+'</td>\
     			 <td><a href="#" onclick = "modificaMedico('+i+')"><i class="fas fa-edit"></i></a></td><td><a href="#" onclick = "eliminarMedico('+i+')"><i class="fas fa-trash-alt"></i></a></td></tr> ').appendTo( ".elemTabla" );
		  }

		  });
}

function cargaEspecialidades () {
	$.getJSON( "ListaEspecialidades", function( data ) {
		  
		  for(var i in data) {
			  if(i==0){
				  $('<option selected>'+data[i]+'</option>').appendTo( "#especialidad" );
			  } else {
   	  $('<option>'+data[i]+'</option>').appendTo( "#especialidad" );
			}
		  }

		  });
	$.getJSON( "ListaEspecialidades", function( data ) {
		  
		  for(var i in data) {
			  if(i==0){
				  $('<option selected>'+data[i]+'</option>').appendTo( "#especialidadm" );
			  } else {
   	  $('<option>'+data[i]+'</option>').appendTo( "#especialidadm" );
			}
		  }

		  });
}