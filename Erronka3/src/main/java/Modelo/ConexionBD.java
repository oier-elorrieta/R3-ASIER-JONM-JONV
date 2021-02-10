package Modelo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:33060/erronka3";
	private static final String USUARIO = "root";
	private static final String CONTRASEÑA = "elorrieta";
	
	public static Connection getConexion() {
		Connection Conexion = null;
		
		try {
			Class.forName(CONTROLADOR);
			Conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
			System.out.println("Conexion establecida");
		}catch(ClassNotFoundException e){
			System.out.println("Error al cargar el a");
			e.printStackTrace();
		}catch(SQLException e){
			System.out.println("Error al cargar el b");
			e.printStackTrace();
		}
		
		return Conexion;
	}
	
	public static void main(String[] arg) {
		getConexion();
	}

}
