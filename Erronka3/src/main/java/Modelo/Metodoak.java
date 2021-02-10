package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Metodoak {

	private static PreparedStatement preparedStatement;

	public static String[] irakurriarray() {
		Produktuak a1 = new Produktuak("Esnea",1);
		Produktuak a2 = new Produktuak("Arrautza",1);
		Produktuak a3 = new Produktuak("Coca-Cola",1);
		Produktuak a4 = new Produktuak("Arroza",1);
		Produktuak a5 = new Produktuak("Gaileta",1);
		Produktuak a6 = new Produktuak("Madarina",1);
		Produktuak a7 = new Produktuak("Oilaskoa",1);
		Produktuak a8 = new Produktuak("Kafea",1);
		Produktuak a9 = new Produktuak("Ura",1);
		Produktuak a10 = new Produktuak("Tomatea",1);
		Produktuak[] arrayobj = new Produktuak[10];
		arrayobj[0] = a1;
		arrayobj[1] = a2;
		arrayobj[2] = a3;
		arrayobj[3] = a4;
		arrayobj[4] = a5;
		arrayobj[5] = a6;
		arrayobj[6] = a7;
		arrayobj[7] = a8;
		arrayobj[8] = a9;
		arrayobj[9] = a10;
		String[] produktizena = new String[10];
		
		for(int i = 0; i < arrayobj.length;i++) {
			produktizena[i] = arrayobj[i].getIzena();
		}
		return produktizena;
	}
	
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
					}
				}
			return arrayizena;
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
	
	public static boolean UsuarioaInsertatu(String izena,String pasahitza,String pasahitza2){
		boolean berdina=true;
		if(pasahitza.equals(pasahitza2)) {
			Connection conexion = ConexionBD.getConexion();
	        String query = "INSERT INTO usuarios values('"+izena+"','"+pasahitza+"')";

	        try {
	        	Statement s;
	            s=conexion.createStatement();
	            s.executeUpdate(query);
	            System.out.println("ondo");
	        } catch (SQLException e) {
	        	System.out.println("error");
	            e.printStackTrace();

	        }
		}else {
			System.out.println("Pasahitza ez dago ondo");
			berdina=false;
		}
		 return berdina;
}
}
