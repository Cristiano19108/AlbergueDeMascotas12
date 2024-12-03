package Modelo;

public class Usuario {
	private int IdUsuario;
private String Usuario;
private boolean Contraseña;
public String getUsuario() {
	return Usuario;
}
public void setUsuario(String usuario) {
	Usuario = usuario;
}
public boolean isContraseña() {
	return Contraseña;
}
public void setContraseña(boolean contraseña) {
	Contraseña = contraseña;
}
public Usuario(String usuario, boolean contraseña) {
	super();
	Usuario = usuario;
	Contraseña = contraseña;
}
public Usuario() {
	super();
	// TODO Auto-generated constructor stub
}
public int getIdUsuario() {
	return IdUsuario;
}
public void setIdUsuario(int idUsuario) {
	IdUsuario = idUsuario;
}
public Usuario(int idUsuario, String usuario, boolean contraseña) {
	super();
	IdUsuario = idUsuario;
	Usuario = usuario;
	Contraseña = contraseña;
}

}
