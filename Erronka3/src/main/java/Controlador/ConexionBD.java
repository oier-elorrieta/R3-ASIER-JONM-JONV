package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:33060/erronka3";
	private static final String USUARIO = "root";
	private static final String CONTRASEÑA = "elorrieta";

	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}

	public Connection conectar() {
		Connection Conexion = null;
		try {

			Conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
			System.out.println("Conexion establecida");

		} catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		return Conexion;
	}

}
