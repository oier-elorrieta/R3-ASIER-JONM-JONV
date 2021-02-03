package Modelo;

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
			System.out.println("Errorea kontroladorea kargatzerakoan");
			e.printStackTrace();
		}
	}

	public Connection conectar() {
		Connection Conexion = null;
		try {

			Conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
			System.out.println("konektatuta");

		} catch (SQLException e) {
			System.out.println("Konexio errorea");
			e.printStackTrace();
		}
		return Conexion;
	}

}
