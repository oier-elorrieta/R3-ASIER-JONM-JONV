package Modelo;

public class Modelo {
	public String[] autoakJaso() {
		return Metodoak.irakurriarray();
	}
	
	public String botonaukeratu1(String kanti,int emaitzatot) {
		return Metodoak.daramanprezioaagertzea(kanti,emaitzatot);
	}
	
	public Object[] botonaukeratu2(Object prodizena,Object[] arrayresumen) {
		return Metodoak.produktuenarray(prodizena,arrayresumen);
	}
	
	
	
	/*public void  mostrarPanelResumen(String[] array) {
		return Metodoak.bueltatuarray(array);
	}
	
	public void  arraystringmodelo(String[] array) {
		return Metodoak.bueltatuarray(array);
	}*/
}
