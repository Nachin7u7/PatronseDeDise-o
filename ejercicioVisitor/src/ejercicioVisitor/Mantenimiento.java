package ejercicioVisitor;

public interface Mantenimiento {

	void mantenimiento(Artefacto art);

	void mantenimiento(Celular celular);

	void mantenimiento(Computadora computadora);

	void mantenimiento(Televisor televisor);

}
