package ejercicioAdapter;

public class Adapter implements Empresa1 {
	private Empresa2 empresa2;

	public Adapter(Empresa2 Empresa) {
		System.out.println("aplicacion de computador adaptada a una de celular");
		this.empresa2 = Empresa;
	}

	@Override

	public void login() {
		empresa2.iniciarSesion();
	}

	@Override

	public void logout() {
		empresa2.cerrarSesion();
	}

	@Override

	public void reportes() {
		empresa2.generarDatos();
	}
}