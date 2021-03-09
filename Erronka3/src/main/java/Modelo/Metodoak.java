package Modelo;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Metodoak {

<<<<<<< HEAD
	
	
=======
>>>>>>> main
	public static String[] irakurriarray() {
		int id=1;
		
		Connection conexion = ConexionBD.getConexion();
		int zenbat= Zenbatproduktu();
		Produktuak[] arrayobj = new Produktuak[zenbat];
		for(int i=0;i<id;i++) {
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
	
<<<<<<< HEAD
	public static int Zenbatproduktu() {
		int zenbat=0;
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectProduktuKantitatea;
		
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
		
			String query = kontsultak.selectProdukturenprezioa + "'" + izena + "'";// lokalaren nif-rekin lokal tipoa ateratzen du
			double PrecioVentaProd = 0;
			try {
				PreparedStatement pre;
				ResultSet resul;
				pre = conexion.prepareStatement(query);
				resul = pre.executeQuery();
				
					while (resul.next()) {
						PrecioVentaProd = resul.getDouble("PrecioVentaProd");
=======
	public static String daramanprezioaagertzea(String kanti,double[] arrayprezio) {//prezio fin egin
		int kantiint=Integer.parseInt(kanti);
		int emaitzaint=1*kantiint;
		arrayprezio=Metodoak.sartuprezioa(emaitzaint, arrayprezio);
		double emaitzatot=0;
		for(int i=0;i<arrayprezio.length;i++) {
			 emaitzatot= emaitzatot+arrayprezio[i];
		}
		String emaitza=Double.toString(emaitzatot);
		
		return emaitza;
	}
	
	public static double[] sartuprezioa(double emaitzaint,double[] arrayprezio) {//prezioa array sartu
		for(int i=0;i<arrayprezio.length;i++) {
			if(arrayprezio[i]==0) {
				arrayprezio[i]=emaitzaint;
					break;
				}
		}
		return arrayprezio;
	}
	
	public static String emaitzaetxerekin(double[] arrayprezio) {
		double emaitzatot=0;
		for(int i=0;i<arrayprezio.length;i++) {
			 emaitzatot= emaitzatot+arrayprezio[i];
		}
		String emaitza=Double.toString(emaitzatot);
		
		return emaitza;
	}
	
	public static String[] produktuenarray(String prodizena,String[] arrayizena) {
			for(int i=0;i<arrayizena.length;i++) {
				if(arrayizena[i]==null) {
					arrayizena[i]=prodizena;
						break;
>>>>>>> main
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
			arrayprezio.add(emaitzaint);
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
			arrayizena.add(prodizena);
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
				String query = kontsultak.insertDatuak+"('" + izena + "', '" + pasahitza + "','" + NIF+ "')"; ;//usuario berri bat insertatzen du 

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
		String query =kontsultak.selectUsuario + "'" + izena + "'and Contraseña='" + pasahitza + "'";//datu basetik usuarioa badagon berifikatzen du
		boolean badago = false;
		try {
			PreparedStatement pre;
			ResultSet resul;

			pre = conexion.prepareStatement(query);
			resul = pre.executeQuery();
				if (resul.next()) {
					badago = true;
				}
<<<<<<< HEAD
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return badago;
	}
	
	public static boolean izenaBerifikatu(String izena) {
		Connection conexion = ConexionBD.getConexion();
		String query = kontsultak.selectUsuario + "'" + izena + "'";//datu basetik usuarioa errepikatuta badagoen ikusten du
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
		String query = kontsultak.selectUsuarioNif+ "'" + Izena + "'";//usuarioa lokalen dagoen nif ateratzen du
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
		String query = kontsultak.insertOperaciones+"('" + emaitza + "','" + NIF + "')";//operazio tablan datuak insertatzen ditu

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
		String query = kontsultak.selectMaxID;//usuarioa operazioan dagoen id ateratzen du
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
		String query = kontsultak.insertPedido+"('" + ID + "','" + etxera + "','" + direccion + "')";//pedido tablan datuak insertatzen du

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
		String query = kontsultak.selectTipoLocal+ "'" + nif + "'";//lokalaren nif-rekin lokal tipoa ateratzen du
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
		String query = kontsultak.selectTipoLocal+ "'" + NIF + "'";//lokalaren nif-rekin lokal tipoa ateratzen du
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
=======
			return arrayizena;
>>>>>>> main
	}
	
	public static String arrayresuemnbueltatu(String[] array,double[] arrayprezio) {//arrayak bistaratu
		String resumen ="";
		for(int kont=0;array[kont]!=null;kont++) {
			 resumen=resumen+"<html>"+ array[kont]+".............................."+arrayprezio[kont]+"euro"+"<br><html>";
		}
		return resumen;
	}
	
	public static String[] asieratuarrayizena(String[] arrayizena) {
			for(int i=0;i<arrayizena.length;i++) {
					arrayizena[i]=null;
				}
			return arrayizena;
	}
	
	public static double[] asieratuarrayprezioa(double[] arrayprezio) {
			for(int i=0;i<arrayprezio.length;i++) {
				arrayprezio[i]=0;
				}
			return arrayprezio;
	}
}
