package ejercicioExtra;

public abstract class Duenos {
	protected Notificador canalDeComunicacion;

	public abstract void messageReceived(String mensaje);
}