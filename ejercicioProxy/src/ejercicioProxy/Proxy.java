package ejercicioProxy;

import java.util.LinkedList;
import java.util.*;

public class Proxy implements IApp {
	List<Usuario> usuarios;
	IApp servidor1;
	IApp servidor2;
	int numeroUsuarios;

	public Proxy(IApp servidor1, IApp servidor2) {
		usuarios = new LinkedList<Usuario>();
		this.servidor1 = servidor1;
		this.servidor2 = servidor2;
		numeroUsuarios = 0;
	}

	public void registrar(String usuario, String contrasena) {
		numeroUsuarios++;
		usuarios.add(new Usuario(numeroUsuarios, usuario, contrasena));
	}

	@Override
	public void login(String usuario, String contrasena) {
		for (Usuario u : usuarios) {
			if (u.getUsuario().equals(usuario)) {
				if (u.getContrasena().equals(contrasena)) {
					if (u.id % 2 == 0) {
						System.out.println("El servidor 2 esta atendiendo a los usuarios");
						servidor2.login(usuario, contrasena);
					} else {
						System.out.println("El servidor 1 est� atendiendo a los usuarios");
						servidor1.login(usuario, contrasena);
					}
				} else {
					System.out.println("La contrase�a introducida es incorrecta");
				}
			}
		}
	}
}