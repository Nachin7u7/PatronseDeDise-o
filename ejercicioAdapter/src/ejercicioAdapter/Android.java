package ejercicioAdapter;

public class Android implements Empresa1 {
	@Override
	public void login() {
		System.out.println("Login en Android");
	}

	@Override
	public void logout() {
		System.out.println("Logout en Android");
	}

	@Override
	public void reportes() {
		System.out.println("Reportando en Android");
	}
}