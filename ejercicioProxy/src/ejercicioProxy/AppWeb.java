package ejercicioProxy;

public class AppWeb implements IApp {

	@Override

	public void login(String usuario, String contrasena) {
		System.out.println();
		System.out.println("Nuestro servidor atiende al usuario " + usuario);
	}

}