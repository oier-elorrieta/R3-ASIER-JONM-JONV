package Modelo;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Metodoak {

	private static PreparedStatement preparedStatement;
	
	public static String[] irakurriarray() {
		int id=1;
		
		Connection conexion = ConexionBD.getConexion();
		int zenbat= Zenbatproduktu();
		Produktuak[] arrayobj = new Produktuak[zenbat];
		for(int i=0;i<id;i++) {
			String query = "SELECT NomProd,PrecioVentaProd FROM productos WHERE IDProducto='"+id+"'";// produktuak base datutik ateratzen du
			String NomProd = "";
			double PrecioVentaProd = 0;
			try {
				PreparedStatement pre;
				ResultSet resul;

				pre = conexion.prepareStatement(query);
				resul = pre.executeQuery();
				
					while (resul.next()) {

						NomProd = resul.getString("NomProd");
						PrecioVentaProd = resul.getDouble("PrecioVentaProd");
						Produktuak a = new Produktuak(NomProd, PrecioVentaProd);

						arrayobj[i] = a;
						id++;
					}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

		String[] produktizena = new String[zenbat];

		for (int i = 0; i < zenbat; i++) {
			produktizena[i] = arrayobj[i].getIzena();
		}
		return produktizena;
	}
	
	public static int Zenbatproduktu() {
		int zenbat=0;
		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT count(NomProd) FROM productos";
		
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			if(resul.next()) {
				zenbat=resul.getInt(1);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return zenbat;
	}

	public static String daramanprezioaagertzea(String kanti, ArrayList<Double> arrayprezio,String izena) {// prezio fin egin
		Connection conexion = ConexionBD.getConexion();
		
			String query = "SELECT PrecioVentaProd FROM productos WHERE NomProd='"+izena+"'";// lokalaren nif-rekin lokal tipoa ateratzen du
			double PrecioVentaProd = 0;
			try {
				PreparedStatement pre;
				ResultSet resul;
				pre = conexion.prepareStatement(query);
				resul = pre.executeQuery();
				
					while (resul.next()) {
						PrecioVentaProd = resul.getDouble("PrecioVentaProd");
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		int kantiint = Integer.parseInt(kanti);
		double emaitzaint = PrecioVentaProd * kantiint;
		arrayprezio = Metodoak.sartuprezioa(emaitzaint, arrayprezio);
		double emaitzatot = 0;
		for (int i = 0; i < arrayprezio.size(); i++) {
			emaitzatot = emaitzatot + arrayprezio.get(i);
		}
		String emaitza = Double.toString(emaitzatot);

		return emaitza;
	}

	public static ArrayList<Double> sartuprezioa(double emaitzaint, ArrayList<Double> arrayprezio) {
		/*for (int i = 0; i < arrayprezio.size(); i++) {
			if (arrayprezio.get(i) == 0) {*/
				arrayprezio.add(emaitzaint);
				//break;
			//}
		//}
		return arrayprezio;
	}

	public static String emaitzaetxerekin(ArrayList<Double> arrayprezio) {
		double emaitzatot = 0;
		for (int i = 0; i < arrayprezio.size(); i++) {
			emaitzatot = emaitzatot + arrayprezio.get(i);
		}
		String emaitza = Double.toString(emaitzatot);

		return emaitza;
	}

	public static ArrayList<String> produktuenarray(String prodizena, ArrayList<String> arrayizena) {
		
		/*for (int i = 0; i < arrayizena.size(); i++) {
			if (arrayizena.get(i) == null) {*/
				arrayizena.add(prodizena);
			//	break;
		//	}
		//}
		return arrayizena;
	}

	public static String arrayresuemnbueltatu(ArrayList<String> array, ArrayList<Double> arrayprezio) {
		String resumen = "";
		for (int kont = 0; kont<array.size(); kont++) {
			resumen = resumen + "<html>" + array.get(kont) + "....................................................................................." + arrayprezio.get(kont) + "euro"
					+ "<br><html>";
		}
		return resumen;
	}

	public static ArrayList<String> asieratuarrayizena(ArrayList<String> arrayizena) {
		for (int i = 0; i < arrayizena.size(); i++) {
			arrayizena.clear();
		}
		return arrayizena;
	}

	public static ArrayList<Double> asieratuarrayprezioa(ArrayList<Double> arrayprezio) {
			arrayprezio.clear();
		return arrayprezio;
	}

	public static boolean UsuarioaInsertatu(String izena, String pasahitza, String pasahitza2, String NIF) {
		boolean berdina = false;
		boolean badago=izenaBerifikatu( izena);
		if(badago!=true) {
			if (pasahitza.equals(pasahitza2)) {
				berdina = true;
				Connection conexion = ConexionBD.getConexion();
				String query = "INSERT INTO usuarios values('" + izena + "','" + pasahitza + "','" + NIF + "')";//usuario berri bat insertatzen du 

				try {
					Statement s;
					s = conexion.createStatement();
					s.executeUpdate(query);
				} catch (SQLException e) {
					e.printStackTrace();

				}
			}
		}
		return berdina;
	}

	public static boolean UsuariaBerifikatu(String izena, String pasahitza) {
		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT * FROM usuarios WHERE Usuario='" + izena + "'and Contraseña='" + pasahitza + "'";//datu basetik usuarioa badagon berifikatzen du
		boolean badago = false;
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
				if (resul.next()) {
					badago = true;
				}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return badago;
	}
	
	public static boolean izenaBerifikatu(String izena) {
		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT * FROM usuarios WHERE Usuario='" + izena + "'";//datu basetik usuarioa errepikatuta badagoen ikusten du
		boolean badago = false;
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
				if (resul.next()) {
					badago = true;
				}
		} catch (SQLException e) {
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
			}

		} catch (SQLException e) {
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
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public static int operazioID() {

		Connection conexion = ConexionBD.getConexion();
		String query = "SELECT max(IDOperaciones) FROM operaciones";//usuarioa operazioan dagoen id ateratzen du
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
		Connection conexion = ConexionBD.getConexion();
		String query = "INSERT INTO pedido(ID,DomicilioSioNo,DirDomicilio) values('" + ID + "','" + etxera + "','" + direccion + "')";//pedido tablan datuak insertatzen du

		try {
			Statement s;
			s = conexion.createStatement();
			s.executeUpdate(query);
		} catch (SQLException e) {
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

		} catch (SQLException e) {
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

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Tipolocal;
	}
	
}
