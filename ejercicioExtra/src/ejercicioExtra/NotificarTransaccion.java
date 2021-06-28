package ejercicioExtra;

import java.util.*;

public class NotificarTransaccion implements Notificador {
	List<Duenos> dueno;

	public NotificarTransaccion() {
		dueno = new LinkedList<Duenos>();
	}

	public void addDueno(Duenos nuevoDueno) {
		dueno.add(nuevoDueno);
	}

	@Override
	public void enviar(String mensaje) {
		for (Duenos duenos : dueno) {
			duenos.messageReceived(mensaje);
		}
	}

}