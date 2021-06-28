package ejercicioProxy;

public class Usuario {

	public Usuario(int id, String usuario, String contrasena) {
		this.id = id;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	int id;
	String usuario;
	String contrasena;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void show() {
		System.out.println();
		System.out.println("Id: " + id);
		System.out.println("Usuario: " + usuario);

	}
}