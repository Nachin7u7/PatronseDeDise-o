package ejercicioAdapter;

public class WindowsPhone implements Empresa1 {

	@Override
	public void login() {
		System.out.println("Login en WindowsPhone");
	}

	@Override
	public void logout() {
		System.out.println("Logout en WindowsPhone");
	}

	@Override
	public void reportes() {
		System.out.println("generando datos en WindowsPhone");
	}
}