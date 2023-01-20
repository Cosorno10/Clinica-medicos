package ejerClinicaModels;

public class Medicos {
	private String dni;
	private String nombre;
	private String apellidos;
	private String especialidad;
	
	public Medicos() {
		super();
		this.dni="";
		this.nombre="";
		this.apellidos="";
		this.especialidad="";
	}
	
	

	public Medicos(String dni, String nombre, String apellidos, String especialidad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	}



	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	

}
