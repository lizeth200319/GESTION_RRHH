package Datos;

import org.mindrot.jbcrypt.BCrypt;

public class ControladorSeguridad {
	
	
    public  String hashearPassword(String passwordPlano) {
       
        return BCrypt.hashpw(passwordPlano, BCrypt.gensalt(12));
    }

    
    public static boolean verificarPassword(String passwordIngresado, String hashDeLaBaseDatos) {
        try {
           
            return BCrypt.checkpw(passwordIngresado, hashDeLaBaseDatos);
        } catch (Exception e) {
            return false;
        }
    }

}
