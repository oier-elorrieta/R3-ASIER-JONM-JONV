package Modelo;

public class Modelo {
	private double[] arrayprezio= new double [10];
	private String[] arrayizena= new String [10];
	
	public String[] autoakJaso() {
		return Metodoak.irakurriarray();
	}
	
	public String botonEmaitzafin(String kanti) {
		return Metodoak.daramanprezioaagertzea(kanti,arrayprezio);
		
	}
	
	public String Emaitzafinenresumen() {
		return Metodoak.daramanprezioaagertzearesumen(arrayprezio);
		
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
	
}
