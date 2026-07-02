package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionSQL {

	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=bd_plan;encrypt=false;";
    private static final String USUARIO = "sa";
    private static final String CLAVE = "system";


    public Connection getConexion() {
        Connection conexion = null;
        try {
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
          
            
        } catch (ClassNotFoundException e) {
            System.err.println("Error: ¡No se encontró el driver de SQL Server! " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
        
        return conexion;
    }

	    
	    public  void desconectar(Connection conexion) {
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

	
