package ejercicioExtra;

//(Extra) Se tiene una empresa que realiza servicio t�cnico de reparaci�n de

//computadoras a domicilio, dependiendo el tipo de computadora que va a reparar lleva el
//kit de herramientas necesario (para laptops, para pc, tablets) el precio de reparaci�n
//var�a en cuesti�n al tama�o de la computadora, una vez realizado el servicio t�cnico, el
//pago se realiza en una cuenta �nica con el detalle del servicio recibido, el pago puede
//ser recibido al mismo tiempo por diferentes clientes, cabe recabar que los due�os de la
//empresa : presidente, vicepresidente, contabilidad reciben una notificaci�n cada vez
//que se paga en la cuenta �nica.

final class Cliente {

	public static void main(String[] args) {

		Duenos presidente = new Presidente("Juan");
		Duenos vicePresidente = new VicePresidente("Pablo");
		Duenos contador = new Contabilidad("Messi");

		CuentaBancaria cuenta = CuentaBancaria.getInstance();

		cuenta.addDueno(presidente);
		cuenta.addDueno(vicePresidente);
		cuenta.addDueno(contador);

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				cuenta.pagar(cuenta.repararComputador(new PC(40, "Asus 2019")));
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				cuenta.pagar(cuenta.repararComputador(new Tablet(15, "HP 3000")));

			}
		});

		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				cuenta.pagar(cuenta.repararComputador(new Laptop(30, "Toshiba 250g")));

			}
		});

		thread1.run();
		thread2.run();
		thread3.run();

	}

}
