package ejercicioBridge;

public class PagoTransferencia implements Pago {

	@Override
	public void pagar(double monto) {
		System.out.println("Pagando por transferencia bancaria...");
		System.out.println("monto: " + monto * 0.95);
	}

}
