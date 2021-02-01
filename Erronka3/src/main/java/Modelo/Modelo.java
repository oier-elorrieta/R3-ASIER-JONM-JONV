package Modelo;

public class Modelo {
	public String[] autoakJaso() {
		return Metodoak.irakurriarray();
	}
	
	public String botonEmaitzafin(String kanti,int emaitzatot) {
		return Metodoak.daramanprezioaagertzea(kanti,emaitzatot);
	}
	
	public Object[] botonArray(Object prodizena,Object[] arrayresumen) {
		return Metodoak.produktuenarray(prodizena,arrayresumen);
	}
	
	public String[] arrayresumenbistaratu(Object[] array) {
		return Metodoscarrito.arrayresuemnbueltatu(array);
	}
}
