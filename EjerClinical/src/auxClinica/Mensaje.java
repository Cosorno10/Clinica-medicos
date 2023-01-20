package auxClinica;

public class Mensaje {
	private String mensaje;
	private String clase;
	
	public Mensaje() {
		super();
		this.mensaje="";
		this.clase="";		
	}

	public Mensaje(String mensaje, String clase) {
		super();
		this.mensaje = mensaje;
		this.clase = clase;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	
	
	

}
