package controlador;

import modelo.Usuario;
import modelo.UsuarioDAO;

public class UsuarioControlador {

	UsuarioDAO userDao = new UsuarioDAO();

	public  Usuario validarUsuario(String user, String pass) {
		return userDao.validarUsuario(user, pass);
	}

}
