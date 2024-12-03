package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
private Connection cn;
public Connection Conectar() {
	try {
		cn=DriverManager.getConnection("Jdbc:mysql://localhost:3306/prueba_cris","root","");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Conectado sin Exito"+e);
	}
	return cn;
	
}
}
