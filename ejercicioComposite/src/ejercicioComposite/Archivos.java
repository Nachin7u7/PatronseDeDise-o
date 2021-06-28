package ejercicioComposite;

public class Archivos extends Disco {

	public Archivos(String contenido) {
		this.contenido = contenido;
		this.palabras = contenido.split(" ").length;
	}

	@Override
	public void show() {
		System.out.println("Numero de palabras: " + palabras);
	}

	@Override
	public void add(Disco component) {
		System.out.println("NA");
	}

	@Override
	public void remove(Disco component) {
		System.out.println("NA");
	}

	@Override
	public void getChild(int position) {
		System.out.println("NA");
	}
}