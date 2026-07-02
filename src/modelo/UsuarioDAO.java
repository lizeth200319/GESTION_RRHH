package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import Datos.ConexionSQL;

public class UsuarioDAO {

	private ConexionSQL conexion = new ConexionSQL();

	public Usuario validarUsuario(String user, String contrasenia) {

		Usuario usuario = null;

		try (Connection con = conexion.getConexion();
				CallableStatement cs = con.prepareCall("{call PR_TA_LOGI(?, ?)}")) {

			cs.setString(1, user);
			cs.setString(2, contrasenia);

			try (ResultSet rs = cs.executeQuery()) {
				if (rs.next()) {

					usuario = new Usuario();
					usuario.setUsuario("usuario");
					usuario.setContrasena("contrasenia");
				}
			}

		} catch (SQLException ex) {
			System.out.println("Error al validar usuario: " + ex.getMessage());
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Error general: " + ex.getMessage());
		}

		return usuario;
	}
	/*
	 * public List<Usuario> listarUsuarios() {
	 * 
	 * }
	 * 
	 * public void insertarUsuario(Usuario usario) {
	 * 
	 * }
	 * 
	 * public void modificarUsuario() {
	 * 
	 * }
	 * 
	 * public void eliminarUsuario() {
	 * 
	 * }
	 */
}
