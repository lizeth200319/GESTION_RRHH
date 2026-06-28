package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionSQL {

	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=bd_plan;encrypt=false;";
    private static final String USUARIO = "sa";
    private static final String CLAVE = "system";


	    public static Connection getConexion() {
	        Connection conexion = null;
	        try {
	          
	            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
	            System.out.println("¡Conexión exitosa a la base de datos!");
	            
	  	        } catch (SQLException e) {
	            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
	            e.printStackTrace();
	        }
	        return conexion;
	    }

	    
	    public static void desconectar(Connection conexion) {
	        if (conexion != null) {
	            try {
	                conexion.close();
	                System.out.println("Conexión cerrada correctamente.");
	            } catch (SQLException e) {
	                System.out.println("Error al cerrar la conexión: " + e.getMessage());
	            }
	        }
	    }

	}

	
