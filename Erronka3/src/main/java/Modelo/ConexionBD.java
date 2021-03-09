package Modelo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:33060/Erronka3";
	private static final String USUARIO = "root";
	private static final String CONTRASEÑA = "elorrieta";
<<<<<<< HEAD
	
	public static Connection getConexion() {
=======

	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Errorea kontroladorea kargatzerakoan");
			e.printStackTrace();
		}
	}

	public Connection conectar() {
>>>>>>> main
		Connection Conexion = null;
		
		try {
			Class.forName(CONTROLADOR);
			Conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
<<<<<<< HEAD
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
=======
			System.out.println("konektatuta");

		} catch (SQLException e) {
			System.out.println("Konexio errorea");
>>>>>>> main
			e.printStackTrace();
		}
		
		return Conexion;
	}
	
	public static void main(String[] arg) {
		getConexion();
	}

}
