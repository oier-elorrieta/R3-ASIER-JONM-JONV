package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Metodoak {

	private static PreparedStatement preparedStatement;

	public static String[] irakurriarray() {
		Produktuak a1 = new Produktuak("coca-cola", 1);
		Produktuak a2 = new Produktuak("kas", 1);
		Produktuak a3 = new Produktuak("cafe con leche", 1);
		Produktuak a4 = new Produktuak("Zumo", 1);
		Produktuak a5 = new Produktuak("Pintxo tortilla", 1);
		Produktuak[] arrayobj = new Produktuak[5];
		arrayobj[0] = a1;
		arrayobj[1] = a2;
		arrayobj[2] = a3;
		arrayobj[3] = a4;
		arrayobj[4] = a5;

		String[] produktizena = new String[5];

		for (int i = 0; i < arrayobj.length; i++) {
			produktizena[i] = arrayobj[i].getIzena();
		}
		return produktizena;
	}

	public static String daramanprezioaagertzea(String kanti, double[] arrayprezio) {// prezio fin egin
		int kantiint = Integer.parseInt(kanti);
		int emaitzaint = 1 * kantiint;
		arrayprezio = Metodoak.sartuprezioa(emaitzaint, arrayprezio);
		double emaitzatot = 0;
		for (int i = 0; i < arrayprezio.length; i++) {
			emaitzatot = emaitzatot + arrayprezio[i];
		}
		String emaitza = Double.toString(emaitzatot);

		return emaitza;
	}

	public static double[] sartuprezioa(double emaitzaint, double[] arrayprezio) {
		for (int i = 0; i < arrayprezio.length; i++) {
			if (arrayprezio[i] == 0) {
				arrayprezio[i] = emaitzaint;
				break;
			}
		}
		return arrayprezio;
	}

	public static String emaitzaetxerekin(double[] arrayprezio) {
		double emaitzatot = 0;
		for (int i = 0; i < arrayprezio.length; i++) {
			emaitzatot = emaitzatot + arrayprezio[i];
		}
		String emaitza = Double.toString(emaitzatot);

		return emaitza;
	}

	public static String[] produktuenarray(String prodizena, String[] arrayizena) {
		
		for (int i = 0; i < arrayizena.length; i++) {
			if (arrayizena[i] == null) {
				arrayizena[i] = prodizena;
				break;
			}
		}
		return arrayizena;
	}

	public static String arrayresuemnbueltatu(String[] array, double[] arrayprezio) {
		String resumen = "";
		for (int kont = 0; array[kont] != null; kont++) {
			resumen = resumen + "<html>" + array[kont] + ".............................." + arrayprezio[kont] + "euro"
					+ "<br><html>";
		}
		return resumen;
	}

	public static String[] asieratuarrayizena(String[] arrayizena) {
		for (int i = 0; i < arrayizena.length; i++) {
			arrayizena[i] = null;
		}
		return arrayizena;
	}

	public static double[] asieratuarrayprezioa(double[] arrayprezio) {
		for (int i = 0; i < arrayprezio.length; i++) {
			arrayprezio[i] = 0;
		}
		return arrayprezio;
	}

	public static boolean UsuarioaInsertatu(String izena, String pasahitza, String pasahitza2, String NIF) {
		boolean berdina = true;
		if (pasahitza.equals(pasahitza2)) {
			Connection conexion = ConexionBD.getConexion();
			String query = "INSERT INTO usuarios values('" + izena + "','" + pasahitza + "','" + NIF + "')";//usuario berri bat insertatzen du 

			try {
				Statement s;
				s = conexion.createStatement();
				s.executeUpdate(query);
				System.out.println("ondo");
			} catch (SQLException e) {
				System.out.println("error");
				e.printStackTrace();

			}
		} else {
			System.out.println("Pasahitza ez dago ondo");
			berdina = false;
		}
		return berdina;
	}

	public static boolean UsuariaBerifikatu(String izena, String pasahitza,Usuario nif) {
		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT * FROM usuarios WHERE Usuario='" + izena + "'and Contraseña='" + pasahitza + "'";//datu basetik usuario espesifiko bat artzen du
		boolean badago = true;
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			System.out.println("ondo");
				if (resul.next()) {
					badago = true;
				} else {
					badago = false;
				}
			 

		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();

		}
		return badago;
	}

	public static void AteraNIF(String Izena, String pasahitza,Usuario NIF) {
		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT NIF FROM usuarios WHERE Usuario='" + Izena + "'";//usuarioa lokalen dagoen nif ateratzen du
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			while (resul.next()) {
				NIF.setNif(resul.getString("NIF"));
				System.out.println(NIF.getNif());
			}
			System.out.println(NIF);

		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}

	public static void operazioaBDsartu(String emaitza,Usuario nif) {
		String NIF=nif.getNif();
		Connection conexion = ConexionBD.getConexion();
		String query = "INSERT INTO operaciones(PrecioTotalOp,NIF) values('" + emaitza + "','" + NIF + "')";//operazio tablan datuak insertatzen ditu

		try {
			Statement s;
			s = conexion.createStatement();
			s.executeUpdate(query);
			System.out.println("ondo");
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();

		}
	}
	
	public static int operazioID() {

		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT max(IDOperaciones) FROM operaciones";//usuarioa lokalen dagoen nif ateratzen du
		int ID=0;
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			while (resul.next()) {
				ID=resul.getInt("max(IDOperaciones)");
				
			}

		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return ID;
	}

	public static void pedidoBDsartu(String direccion,int ID) {
		String etxera = " ";
		if (direccion.equals(null) || direccion.equals("Ez dago")) {
			etxera = "NO";
			direccion = "Ez dago";
		} else {
			etxera = "SI";
		}
		System.out.println(direccion);
		Connection conexion = ConexionBD.getConexion();
		String query = "INSERT INTO pedido(ID,DomicilioSioNo,DirDomicilio) values('" + ID + "','" + etxera + "','" + direccion + "')";//pedido tablan datuak insertatzen du

		try {
			Statement s;
			s = conexion.createStatement();
			s.executeUpdate(query);
			System.out.println("ondo");
		} catch (SQLException e) {
			System.out.println("errorereri");
			e.printStackTrace();

		}
	}
	
	public static String TipoLocalAtera(Usuario NIFa) {
		String nif=NIFa.getNif();
		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT TipoDeNegocio FROM local WHERE NIF='" + nif + "'";//lokalaren nif-rekin lokal tipoa ateratzen du
		String Tipolocal = "";
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			while (resul.next()) {
				Tipolocal = resul.getString("TipoDeNegocio");
			}
			System.out.println("ondo");

		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return Tipolocal;
	}
	
	public static String TipoLocalAteranif(String NIF,Usuario NIFa) {
		
		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT TipoDeNegocio FROM local WHERE NIF='" + NIF + "'";//lokalaren nif-rekin lokal tipoa ateratzen du
		String Tipolocal = "";
		NIFa.setNif(NIF);
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			while (resul.next()) {
				Tipolocal = resul.getString("TipoDeNegocio");
			}
			System.out.println("ondo");

		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		return Tipolocal;
	}
	
}
