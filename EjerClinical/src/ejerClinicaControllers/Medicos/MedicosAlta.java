package ejerClinicaControllers.Medicos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;
import auxClinica.Mensaje;
import ejerClinicaModels.ConexionMedicos;
import ejerClinicaModels.Medicos;

/**
 * Servlet implementation class MedicosAlta
 */
@WebServlet("/MedicosAlta")
public class MedicosAlta extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson gson = new Gson();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MedicosAlta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Medicos medico = new Medicos(request.getParameter("dni"), request.getParameter("nombre"), request.getParameter("apellidos"), request.getParameter("especialidad"));
		ConexionMedicos conexionMedicos = new ConexionMedicos();
		conexionMedicos.altaMedico(medico);
		Mensaje mensaje = new Mensaje(conexionMedicos.mensaje, conexionMedicos.clasemensaje);
		String mensajejson = this.gson.toJson(mensaje);
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(mensajejson);
        out.flush();   

		
	}

}
