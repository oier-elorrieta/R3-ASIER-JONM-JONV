package Controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	public static void main(String[] args) {
		ConexionBD conexion = new ConexionBD();
		Connection cn = null;
		Statement stm =null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM ola");
			
			while (rs.next()) {
				int idola = rs.getInt(1);
				String olacol = rs.getString(2);
				String olacol1 = rs.getString(3);
				
				System.out.println(idola+"-"+olacol+"-"+olacol1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stm != null) {
					stm.close();
				}
				if(cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
