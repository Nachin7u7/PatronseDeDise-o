package ejercicioBridge;

public class InstalacionAlcantarilla implements IEmpresa {

	String nombre;
	double precio;
	Pago pago;

	public InstalacionAlcantarilla(String nombre, double precio, Pago pago) {
		this.nombre = nombre;
		this.precio = precio;
		this.pago = pago;
	}

	@Override
	public void pago() {
		pago.pagar(precio);
	}

}
