package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelo.Usuario;

public class DataUsuario {
	private Conexion cn=new Conexion();
	private Connection con;
	private PreparedStatement ps;
	public boolean Guardar(Usuario usu) {
		 boolean guarda=false;
		 String sql ="insert into usuarios values(?,?,?)";
		con=cn.Conectar();
		 try {
			ps=con.prepareStatement(sql);
			ps.setInt(1,usu.getIdUsuario());
			ps.setString(2,usu.getUsuario());
			ps.setBoolean(3,usu.isContraseña());
			int guar=ps.executeUpdate();
			if(guar>0) {
				guarda=true;
				JOptionPane.showMessageDialog(null,"Guardado con Exito");
			}else {
				JOptionPane.showMessageDialog(null,"Guardado sin Exito");
				con.close();
				ps.close();
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error al Guardar"+e);
		}
		 
		return guarda;
		 
	 }
}
