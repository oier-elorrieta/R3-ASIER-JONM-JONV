package Modelo;
import java.util.ArrayList;

import java.sql.Connection;

public class Modelo {
	private ArrayList arrayprezio = new ArrayList<Double>();
	private ArrayList arrayizena = new ArrayList<String>();
	private ArrayList kantitateak = new ArrayList<Integer>();
	Usuario nif = new Usuario(null,null);
	
	public String[] arrayirakurri() {
		return Metodoak.irakurriarray();
	}
	
	public String[] arrayirakurrikomanda() {
		return Metodoak.irakurriarraykomanda();
	}
	
	public String botonEmaitzafin(String kanti,String izena) {
		return Metodoak.daramanprezioaagertzea(kanti,arrayprezio,izena);
		
	}
	
	public String botonEmaitzafinhorni(String kanti,String izena) {
		return Metodoak.daramanprezioaagertzeahorni(kanti,arrayprezio,izena);
		
	}
	
	public String Emaitzafinenresumen() {
		return Metodoak.emaitzaetxerekin(arrayprezio);
		
	}
	
	public ArrayList<String> botonArray(String prodizena) {
		return Metodoak.produktuenarray(prodizena,arrayizena);
	}
	
	public String arrayresumenbistaratu() {
		return Metodoak.arrayresuemnbueltatu(arrayizena,arrayprezio);
	}
	
	public void botonEtxera(double emaitza) {
		 Metodoak.sartuprezioa(emaitza,arrayprezio);
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
	
	public void operazioaBD(String emaitza,String tipo) {
		 Metodoak.operazioaBDsartu(emaitza,nif,tipo);
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
	}
	
	public void aparecensartu(int ID) {
		Metodoak.aparecensartuBD(ID,arrayprezio,arrayizena,kantitateak);
	}
	
	public void kantitateaarrayeansartu(int kanti) {
		Metodoak.kantisartuarray(kanti,kantitateak);
	}
	
	public void kantitateaarrayezabatu() {
		Metodoak.kantisartuarrayclear(kantitateak);
	}
	
	public void stockgehitumetodoa() {
		Metodoak.stockgehitu();
	}
	
	public int stockkomprobatu(String izena,int kanti) {
		return Metodoak.stockbegiratu(nif, izena, kanti);
	}
}
