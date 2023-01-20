<div class="modal" id="advertencia" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Baja de Persona</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>¿Está seguro que desea eliminar?</p>
      </div>
      <div class="modal-footer">
        <button type="button" id="si" class="btn btn-primary">Sí</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
      </div>
    </div>
  </div>
</div>
<div class="modal fade" id="alta" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
  <form method="post" action="javascript:guardaMedico()">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Añadir Medico</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <i class="fas fa-times-circle"></i>
        </button>
      </div>
      <div class="modal-body">
        <label for="dni">Dni</label>
			<input type="text" class="form-control" name="dni" id="dni" required>
			<label for="nombre">Nombre</label>
			<input type="text" class="form-control" name="nombre" id="nombre" required>
			<label for="apellidos">Apellidos</label>
			<input type="text" class="form-control" name="apellidos" id="apellidos" required>
			<label for="especialidad">Especialidad</label>
			<select class="especialidad form-control" name="especialidad" id="especialidad"></select>
			
      </div>
      <div class="modal-footer">
        <button type="submit" class="btn btn-primary" id="guardarMedico">Guardar</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
      </div>
    </div>
    </form>
  </div>
</div><div class="modal fade" id="modificacion" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
  <form>
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modificar Medico</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <i class="fas fa-times-circle"></i>
        </button>
      </div>
      <div class="modal-body">
        <label for="dni">Dni</label>
			<input type="text" class="form-control" name="dni" id="dnim" disabled>
			<label for="nombre">Nombre</label>
			<input type="text" class="form-control" name="nombre" id="nombrem" required>
			<label for="apellidos">Apellidos</label>
			<input type="text" class="form-control" name="apellidos" id="apellidosm" required>
			<label for="especialidad">Especialidad</label>
			<select class="especialidad form-control" name="especialidad" id="especialidadm"></select>
			
      </div>
      <div class="modal-footer">
        <button type="submit" class="btn btn-primary" id="guardarMedicom">Guardar</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
      </div>
    </div>
    </form>
  </div>
</div>