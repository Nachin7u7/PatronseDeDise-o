package ejercicioAdapter;

public class IOS implements Empresa1 {
	@Override
	public void login() {
		System.out.println("Login en IOS");
	}

	@Override
	public void logout() {
		System.out.println("Logout en IOS");
	}

	@Override
	public void reportes() {
		System.out.println("reportando en IOS");
	}
}
