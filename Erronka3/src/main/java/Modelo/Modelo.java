package Modelo;

import java.sql.Connection;

public class Modelo {
	private double[] arrayprezio= new double [10];
	private String[] arrayizena= new String [10];
	Usuario nif = new Usuario(null);
	public String[] autoakJaso() {
		return Metodoak.irakurriarray();
	}
	
	public String botonEmaitzafin(String kanti) {
		return Metodoak.daramanprezioaagertzea(kanti,arrayprezio);
		
	}
	
	public String Emaitzafinenresumen() {
		return Metodoak.emaitzaetxerekin(arrayprezio);
		
	}
	
	public String[] botonArray(String prodizena) {
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
		 return Metodoak.UsuariaBerifikatu(izena,pasahitza,nif);	
	}
	
	public boolean UsuarioInsert(String izena, String pasahitza,String pasahitza2,String NIF) {
		return Metodoak.UsuarioaInsertatu(izena,pasahitza,pasahitza2,NIF);	
	}
	
	public void operazioaBD(String emaitza) {
		 Metodoak.operazioaBDsartu(emaitza,nif);
	}
	
	public void pedidoBD(String direccion) {
		 Metodoak.pedidoBDsartu(direccion);
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
}
