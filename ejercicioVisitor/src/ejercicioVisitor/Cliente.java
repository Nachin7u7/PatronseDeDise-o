package ejercicioVisitor;

//	(Visitor) Se tiene una aplicaci�n que obtiene el estado de los componentes f�sicos de

//	diferentes artefactos electr�nicos donde esta de visita y va recomendando tipos de
//	mantenimiento, si el objeto electr�nico es un celular mostrar todos los atributos del
//	celular y mencionar un mantenimiento preventivo, si el objeto electr�nico es una
//	computadora en base a un n�mero rand�mico sugerir un tipo de mantenimiento (si es
//	par= mantenimiento preventivo, si es impar= mantenimiento correctivo), si la aplicaci�n
//	visita un televisor imprimir caracter�sticas del televisor.

public class Cliente {

	public static void main(String[] args) {

		Celular celular = new Celular("A2", "80Gb", "30 Mpx", "4Gb", "Android");
		Computadora computadora = new Computadora("Asus", "1024Gb", "16Gb");
		Televisor televisor = new Televisor("Sony xperia", "Quality FX", "2 a�os", true);

		AppMantenimiento app = new AppMantenimiento();

		celular.recibirMantenimiento(app);
		computadora.recibirMantenimiento(app);
		televisor.recibirMantenimiento(app);

	}

}
