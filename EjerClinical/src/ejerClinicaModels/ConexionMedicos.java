package ejerClinicaModels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class ConexionMedicos {
	
	public Connection con;
	public String database="clinica";
	public String url="jdbc:mysql://192.168.0.197/";
	public String user="root";
	public String pswd="kkb2chmy";
	public String mensaje;
	public String clasemensaje;
	
	public void cargardriver()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void conectar()
	{
		try {
			this.con=DriverManager.getConnection(this.url+this.database, this.user, this.pswd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void altaMedico(Medicos m) {
		this.cargardriver();
		this.conectar();
		PreparedStatement pstmt = null;
		try {
			pstmt=this.con.prepareStatement("insert into medicos values (?,?,?,?);");
			pstmt.setString(1, m.getDni());
			pstmt.setString(2, m.getNombre());
			pstmt.setString(3, m.getApellidos());
			pstmt.setString(4, m.getEspecialidad());
			int numero=pstmt.executeUpdate();
			if(numero>0) {
				this.mensaje="Medico añadido correctamente";
				this.clasemensaje="bg-success";
			}
			else
			{
				this.mensaje="No se insertó el registro";
				this.clasemensaje="bg-danger";

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	

	}

	
	public void modificacionMedico(Medicos m) {
		this.cargardriver();
		this.conectar();
		PreparedStatement pstmt = null;
		try {
			pstmt=this.con.prepareStatement("update medicos set nombre=?, apellidos=?, especialidad=? where dni=?;");
			pstmt.setString(1, m.getNombre());
			pstmt.setString(2, m.getApellidos());
			pstmt.setString(3, m.getEspecialidad());
			pstmt.setString(4, m.getDni());
			int numero=pstmt.executeUpdate();
			if(numero>0) {
				this.mensaje="Medico modificado correctamente";
				this.clasemensaje="bg-success";
			}
			else
			{
				this.mensaje="No se modificó el registro";
				this.clasemensaje="bg-danger";

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	

	}

	public void borrarMedico(Medicos m) {
		this.cargardriver();
		this.conectar();
		PreparedStatement pstmt = null;
		try {
			pstmt=this.con.prepareStatement("delete from medicos where dni=?;");
			pstmt.setString(1, m.getDni());
			int numero=pstmt.executeUpdate();
			if(numero>0) {
				this.mensaje="Medico borrado correctamente";
				this.clasemensaje="bg-success";

			}			
			else
			{
				this.mensaje="No se borró el registro";
				this.clasemensaje="bg-danger";

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	

	}

	public ArrayList<Medicos> listaMedicos()
	{
		ArrayList<Medicos> listmed = new ArrayList<>();
		Medicos m;
		this.cargardriver();
		this.conectar();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt=con.createStatement();
			String sql = "select * from medicos order by apellidos, nombre;";
			rs=stmt.executeQuery(sql);
				while(rs.next())
				{
					m =new Medicos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
					
					listmed.add(m);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}	
		}
				
		return listmed;
		
	}
	
	public void altaEspecialidad(String es) {
		this.cargardriver();
		this.conectar();
		PreparedStatement pstmt = null;
		try {
			pstmt=this.con.prepareStatement("insert into especialidades values (?);");
			pstmt.setString(1, es);
			int numero=pstmt.executeUpdate();
			if(numero>0)
				this.mensaje="Especialidad insertada correctamente";
			else
			{
				this.mensaje="No se insertó el registro";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt!=null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	

	}

	public ArrayList<String> listaEspecialidades()
	{
		ArrayList<String> listesp = new ArrayList<>();
		String esp;
		this.cargardriver();
		this.conectar();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt=con.createStatement();
			String sql = "select * from especialidades order by especialidad";
			rs=stmt.executeQuery(sql);
				while(rs.next())
				{
					esp =rs.getString(1);
					
					listesp.add(esp);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}	
		}
				
		return listesp;
		
	}



}
