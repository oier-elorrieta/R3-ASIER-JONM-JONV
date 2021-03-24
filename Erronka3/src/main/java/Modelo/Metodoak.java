package Modelo;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Metodoak {

	//produktuak kombobox-ean sartzeko
	//**********************************************************************************************
	public static String[] irakurriarray() {
		int id = 1;

		Connection conexion = ConexionBD.getConexion();
		int zenbat = Zenbatproduktu();
		Produktuak[] arrayobj = new Produktuak[zenbat];
		for (int i = 0; i < id; i++) {
			String query = kontsultak.selectProdiktuenizena + "'" + id + "'";// produktuak base datutik ateratzen du
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
		int zenbat = 0;
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectProduktuKantitatea;

		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			if (resul.next()) {
				zenbat = resul.getInt(1);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return zenbat;
	}
	//daraman prezioa gehitzen du(emaitza finala lortzeko)
	//**********************************************************************************************
	public static String daramanprezioaagertzea(String kanti, ArrayList<Double> arrayprezio, String izena) {
		Connection conexion = ConexionBD.getConexion();

		String query = kontsultak.selectProdukturenprezioa + "'" + izena + "'";// lokalaren nif-rekin lokal tipoa
																				// ateratzen du
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
	//produktuen prezioa arraylist-ean sartzen du
	public static ArrayList<Double> sartuprezioa(double emaitzaint, ArrayList<Double> arrayprezio) {
		arrayprezio.add(emaitzaint);
		return arrayprezio;
	}
	//etxera eskatzen badu gehitu egiten du emaitza finalerako
	public static String emaitzaetxerekin(ArrayList<Double> arrayprezio) {
		double emaitzatot = 0;
		for (int i = 0; i < arrayprezio.size(); i++) {
			emaitzatot = emaitzatot + arrayprezio.get(i);
		}
		String emaitza = Double.toString(emaitzatot);

		return emaitza;
	}
	//produktuak arraylist-ean sartzen du
	//**********************************************************************************************
	public static ArrayList<String> produktuenarray(String prodizena, ArrayList<String> arrayizena) {
		arrayizena.add(prodizena);
		return arrayizena;
	}

	public static String arrayresuemnbueltatu(ArrayList<String> array, ArrayList<Double> arrayprezio) {
		String resumen = "";
		for (int kont = 0; kont < array.size(); kont++) {
			resumen = resumen + "<html>" + array.get(kont)
					+ "....................................................................................."
					+ arrayprezio.get(kont) + "euro" + "<br><html>";
		}
		return resumen;
	}
	//produktu izenen arraylist-a hasieratzen du
	//**********************************************************************************************
	public static ArrayList<String> asieratuarrayizena(ArrayList<String> arrayizena) {
		for (int i = 0; i < arrayizena.size(); i++) {
			arrayizena.clear();
		}
		return arrayizena;
	}
	//produktuen prezioaren arraylist-a hasieratzen du
	//**********************************************************************************************
	public static ArrayList<Double> asieratuarrayprezioa(ArrayList<Double> arrayprezio) {
		arrayprezio.clear();
		return arrayprezio;
	}
	//usuario berri bat BD-an insertatzen du(pasahitza koinsiditzen badute eta izena ez bada agetzen BDan)
	//**********************************************************************************************
	public static boolean UsuarioaInsertatu(String izena, String pasahitza, String pasahitza2, String NIF) {
		boolean berdina = false;
		boolean badago = izenaBerifikatu(izena);
		if (badago != true) {
			if (pasahitza.equals(pasahitza2)) {
				berdina = true;
				Connection conexion = ConexionBD.getConexion();
				String query = kontsultak.insertDatuak + "('" + izena + "', '" + pasahitza + "','" + NIF + "')";
				;

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
	//usuarioa BD-an dagoela berifikatzen du
	public static boolean UsuariaBerifikatu(String izena, String pasahitza) {
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectUsuario + "'" + izena + "'and Contraseña='" + pasahitza + "'";
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
	//usuarioaren izena BD-an dagoela berifikatzen du (ez errepikatzeko)
	public static boolean izenaBerifikatu(String izena) {
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectUsuario + "'" + izena + "'";
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
	//usuario baten nif-a ateratzen du
	//**********************************************************************************************
	public static void AteraNIF(String Izena, String pasahitza, Usuario NIF) {
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectUsuarioNif + "'" + Izena + "'";// usuarioa lokalen dagoen nif ateratzen du
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
	//operazio tablan datuak isertatzen du
	//**********************************************************************************************
	public static void operazioaBDsartu(String emaitza, Usuario nif) {
		String NIF = nif.getNif();
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.insertOperaciones + "('" + emaitza + "','" + NIF + "')";

		try {
			Statement s;
			s = conexion.createStatement();
			s.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	// usuarioa operazioan dagoen id ateratzen du
	//**********************************************************************************************
	public static int operazioID() {

		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectMaxID;
		int ID = 0;
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			while (resul.next()) {
				ID = resul.getInt("max(IDOperaciones)");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ID;
	}
	//pedido tablan datuak insertatzen ditu
	//**********************************************************************************************
	public static void pedidoBDsartu(String direccion, int ID) {
		String etxera = " ";
		if (direccion.equals("")) {
			etxera = "NO";
			direccion = "Ez dago";
		} else {
			etxera = "SI";
		}

		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.insertPedido + "('" + ID + "','" + etxera + "','" + direccion + "')";

		try {
			Statement s;
			s = conexion.createStatement();
			s.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	// lokalaren nif-rekin lokal tipoa ateratzen du
	//**********************************************************************************************
	public static String TipoLocalAtera(Usuario NIFa) {
		String nif = NIFa.getNif();
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectTipoLocal + "'" + nif + "'";// lokalaren nif-rekin lokal tipoa ateratzen du
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
	// registratzean sartzen duen nif-arekin lokal tipoa ateratzen du
	//**********************************************************************************************
	public static String TipoLocalAteranif(String NIF, Usuario NIFa) {

		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectTipoLocal + "'" + NIF + "'";
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
	//datuak 'aparecen' tablan sartzen du
	//**********************************************************************************************
	public static void kantisartuBD(int ID, ArrayList<Double> arrayprezio, ArrayList<String> array,ArrayList<Integer> kantitatea) {
			int i = 0;
			int kont = 1;
			while (kont <= arrayprezio.size()) {
				int idproducto = IDproducto(array, i);
				System.out.println(idproduktuadago(idproducto,ID));
				if(idproduktuadago(idproducto,ID)==false) {
					Connection conexion = ConexionBD.getConexion();

					String query = kontsultak.insertAparecen + "('" + ID + "','" + idproducto + "','" + kantitatea.get(i)
							+ "','" + arrayprezio.get(i)/kantitatea.get(i) + "','" + arrayprezio.get(i) + "')";

					try {
						Statement s;
						s = conexion.createStatement();
						s.executeUpdate(query);
					} catch (SQLException e) {
						e.printStackTrace();

					}
					i++;
					kont++;
				}else {
					idproduktukantigehitu(kantitatea,i,idproducto,arrayprezio);
					break;
				}
			}

		}
	//produktuaren id-a ateratzen du
	public static int IDproducto(ArrayList<String> array, int i) {
		int IDProducto = 0;
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectIDproducto + "'" + array.get(i) + "'";
		
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			while (resul.next()) {
				IDProducto = resul.getInt("IDProducto");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return IDProducto;

	}
	//id produktua eta ID oprezioarena errepikatuta badago ikusten du
	public static boolean idproduktuadago(int idproduktua,int ID) {
		boolean badago=false;
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectIDaparecen + "'" + idproduktua + "'and  ID= '" + ID + "'";
		
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
			while (resul.next()) {
				badago=true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return badago;
	}
	//id produktu berdina bada kantitatea eta prezo totala aldatzen du
	public static void idproduktukantigehitu(ArrayList<Integer> kantitatea,int i,int idproducto,ArrayList<Double> arrayprezio) {
		Connection conexion = ConexionBD.getConexion();
		String query=kontsultak.updateaparecen + "NumUniPorProd +'" + kantitatea.get(i) + "',PrecioTotPorProd=PrecioTotPorProd + '" + arrayprezio.get(i) + "' where IDProducto = '" + idproducto + "'";
		
		try {
			Statement s;
			s = conexion.createStatement();
			s.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//produktu bakoitzen kantitatea arraylist-ean sartzen du
	public static void kantisartuarray(int kanti, ArrayList<Integer> kantitatea) {
		kantitatea.add(kanti);
	}
	//produktuen kantitatearen arralist-a ezabatzen du
	public static void kantisartuarrayclear(ArrayList<Integer> kantitatea) {
		kantitatea.clear();
	}
}