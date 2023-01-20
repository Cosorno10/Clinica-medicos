<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="cabecera.jsp" %>
<script src="js/ejeClinicaMedicos.js"></script>
</head>
<body>
<div class="hueco" style="height:50px;">


</div>
<div class="row mt-2 mb-2">
	<div class="col col-10 offset-1 text-right">
	<a href="#" data-toggle="modal" data-target="#alta" class="btn btn-primary" id="fAnadirm"><i class="fas fa-user-plus"></i> Añadir Medico</a>
	</div>
	<div class="col-5 offset-1 text-left" id="mensaje">
	</div>
</div>
<div class="row">
	<div class="col-10 offset-1">
	<table class="table table-striped table-hover">
		<thead class="thead-dark">
		<tr>	
	<th>Dni</th>
	<th>Apellidos</th>
	<th>Nombre</th>
	<th>Especialidad</th>
	<th>Modificar</th>
	<th>Eliminar</th>
</tr>
</thead>

<tbody class="elemTabla">

</tbody>

</table>

</div>
</div>
<%@ include file="modalMedicos.jsp" %>
</div>
</body>
</html>
