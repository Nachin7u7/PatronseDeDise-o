package ejercicioBridge;

public class PagoTigo implements Pago {

	@Override
	public void pagar(double monto) {
		System.out.println("Pagando por TigoMoney...");
		System.out.println("monto: " + monto * 0.98);
	}

}
