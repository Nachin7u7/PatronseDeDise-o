package ejercicioAdapter;

//(Adapter) Se tiene un empresa que desarrolla aplicaciones m�viles para Android,
//IOS y WindowsPhone cuando se va desarrollando dichas aplicaciones estos
//generalmente tienen los m�todos de login, logout, reportes. Esta empresa compra otra
//empresa que desarrolla aplicaciones Web y de Escritorio estas aplicaciones
//generalmente tienen los m�todos de iniciar sesi�n, cerrar sesi�n y generaci�n de
//datos,se desea adaptar las aplicaciones m�viles de la empresa1 a la empresa2

public class Cliente {
	public static void main(String[] arg) {

		WindowsPhone windowsPhone = new WindowsPhone();
		IOS ios = new IOS();
		Android android = new Android();

		Adapter adapter1 = new Adapter(new Escritorio());
		Adapter adapter = new Adapter(new Web());

		android.login();
		android.logout();
		android.reportes();

		ios.login();
		ios.logout();
		ios.reportes();

		windowsPhone.login();
		windowsPhone.logout();
		windowsPhone.reportes();

		adapter.login();
		adapter.logout();
		adapter.reportes();

		adapter1.login();
		adapter1.logout();
		adapter1.reportes();
	}
}
