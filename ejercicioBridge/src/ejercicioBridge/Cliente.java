package ejercicioBridge;
//

//(Bridge) Se tiene una empresa que realiza instalacion electrica (agregar atributos,
//precio) , instalación de agua(agregar atributos,precio) e instalación de alcantarillado
//(agregar atributos, precio), originalmente solo acepta pagos de estos servicios en
//efectivo, pero luego se necesita tener nuevas formas de pago que no necesita presencia
//como ser: pago por transferencia bancaria (tiene descuento del 5% del precio de la
//instalación), pago por tigo money (tiene descuento del 2%), pago usando la aplicación
//de la empresa(tiene descuento de 10%)
//nota: tome en cuenta que posteriormente se pueden agregar mas formas de pago

public class Cliente {

	public static void main(String[] args) {

		IEmpresa Empresa1 = new InstalacionAgua("Emapa", 100, new PagoEfectivo());
		IEmpresa Empresa2 = new InstalacionAgua("Emapa", 100, new PagoTransferencia());
		IEmpresa Empresa3 = new InstalacionAgua("Emapa", 100, new PagoTigo());
		IEmpresa Empresa4 = new InstalacionAgua("Emapa", 100, new PagoApp());

		Empresa1.pago();
		Empresa2.pago();
		Empresa3.pago();
		Empresa4.pago();

		IEmpresa Empresa5 = new InstalacionAlcantarilla("Epsas", 150, new PagoEfectivo());
		IEmpresa Empresa6 = new InstalacionAlcantarilla("Epsas", 150, new PagoTransferencia());
		IEmpresa Empresa7 = new InstalacionAlcantarilla("Epsas", 150, new PagoTigo());
		IEmpresa Empresa8 = new InstalacionAlcantarilla("Epsas", 150, new PagoApp());

		Empresa5.pago();
		Empresa6.pago();
		Empresa7.pago();
		Empresa8.pago();

		IEmpresa Empresa9 = new InstalacionElectricidad("Electropaz", 200, new PagoEfectivo());
		IEmpresa Empresa10 = new InstalacionElectricidad("Electropaz", 200, new PagoEfectivo());
		IEmpresa Empresa11 = new InstalacionElectricidad("Electropaz", 200, new PagoTigo());
		IEmpresa Empresa12 = new InstalacionElectricidad("Electropaz", 200, new PagoApp());

		Empresa9.pago();
		Empresa10.pago();
		Empresa11.pago();
		Empresa12.pago();

	}

}
