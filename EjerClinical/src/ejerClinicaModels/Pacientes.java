package ejerClinicaModels;

import java.io.Serializable;

public class Pacientes implements Serializable{
	private static final long serialVersionUID = 1L;
	private String dni;
	private String nombre;
	private String apellidos;
	
	public Pacientes() {
		super();
		this.dni="";
		this.nombre="";
		this.apellidos="";
	}

	public Pacientes(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
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
	
	
	

	

}
