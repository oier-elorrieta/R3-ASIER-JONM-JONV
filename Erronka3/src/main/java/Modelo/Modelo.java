package Modelo;
import java.util.ArrayList;

import java.sql.Connection;

public class Modelo {
<<<<<<< HEAD
	private ArrayList arrayprezio = new ArrayList<Double>();
	private ArrayList arrayizena = new ArrayList<String>();
	Usuario nif = new Usuario(null);
	
	public String[] arrayirakurri() {
		return Metodoak.irakurriarray();
	}
	
	public String botonEmaitzafin(String kanti,String izena) {
		return Metodoak.daramanprezioaagertzea(kanti,arrayprezio,izena);
=======
	private double[] arrayprezio= new double [10];
	private String[] arrayizena= new String [10];
	
	public String[] autoakJaso() {
		return Metodoak.irakurriarray();
	}
	
	public String botonEmaitzafin(String kanti) {
		return Metodoak.daramanprezioaagertzea(kanti,arrayprezio);
>>>>>>> main
		
	}
	
	public String Emaitzafinenresumen() {
		return Metodoak.emaitzaetxerekin(arrayprezio);
		
	}
	
<<<<<<< HEAD
	public ArrayList<String> botonArray(String prodizena) {
=======
	public String[] botonArray(String prodizena) {
>>>>>>> main
		return Metodoak.produktuenarray(prodizena,arrayizena);
	}
	
	public String arrayresumenbistaratu() {
		return Metodoak.arrayresuemnbueltatu(arrayizena,arrayprezio);
	}
	
	public void botonEtxera(double emaitza) {
		 Metodoak.sartuprezioa(emaitza,arrayprezio);
<<<<<<< HEAD
	}
	
	public String botonEtxeraemaitza() {
		 return Metodoak.emaitzaetxerekin(arrayprezio);
	}
	
	public void arrayizenaasieratu() {
		 Metodoak.asieratuarrayizena(arrayizena);
	}
	
	public void arrayprezioasieratu() {
		 Metodoak.asieratuarrayprezioa(arrayprezio);
	}
	
	public boolean BeriUsuario(String izena, String pasahitza) {
		 return Metodoak.UsuariaBerifikatu(izena,pasahitza);	
	}
	
	public boolean UsuarioInsert(String izena, String pasahitza,String pasahitza2,String NIF) {
		return Metodoak.UsuarioaInsertatu(izena,pasahitza,pasahitza2,NIF);	
	}
	
	public void operazioaBD(String emaitza) {
		 Metodoak.operazioaBDsartu(emaitza,nif);
	}
	
	public void pedidoBD(String direccion,int ID) {
		 Metodoak.pedidoBDsartu(direccion,ID);
	}
	
	public void AteraNIFmetodoa(String Izena,String pasahitza) {
		  Metodoak.AteraNIF(Izena,pasahitza,nif);
	}
	
	public String AteraTipolocalmetodoa() {
		return Metodoak.TipoLocalAtera(nif);
	}
	
	public String AteraTipolocalmetodoanif(String NIF) {
		return Metodoak.TipoLocalAteranif(NIF,nif);
	}
	
	public int AteraoperazioID() {
		return Metodoak.operazioID();
=======
	}
	
	public String botonEtxeraemaitza() {
		 return Metodoak.emaitzaetxerekin(arrayprezio);
	}
	
	public void arrayizenaasieratu() {
		 Metodoak.asieratuarrayizena(arrayizena);
>>>>>>> main
	}
	
	public void arrayprezioasieratu() {
		 Metodoak.asieratuarrayprezioa(arrayprezio);
	}
	
}
