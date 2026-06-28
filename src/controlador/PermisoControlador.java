package controlador;

import java.util.ArrayList;
import modelo.Permiso;

public class PermisoControlador {
	private ArrayList<Permiso> listaPermisos;

    public PermisoControlador() {
        listaPermisos = new ArrayList<>();
    }

    // Registrar un permiso
    public void registrarPermiso(Permiso permiso) {
        listaPermisos.add(permiso);
    }

    // Listar permisos
    public ArrayList<Permiso> listarPermisos() {
        return listaPermisos;
    }

}
