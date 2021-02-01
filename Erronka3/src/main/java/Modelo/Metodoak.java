package Modelo;

public class Metodoak {

	 static Object[] array= new Object [10];
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
	
	public static String daramanprezioaagertzea(String kanti,int emaitzatot) {
		//dirua kalkulatu
		int kantiint=Integer.parseInt(kanti);
		int emaitzaint=1*kantiint;
		//emaitzatot=emaitzatot+emaitzaint;
		String emaitzafin=Integer.toString(emaitzaint);
		return emaitzafin;
	}
	
	
	public static Object[] produktuenarray(Object prodizena,Object[] arrayresumen) {
		//Produktuaren izena arrayera sartu
			for(int i=0;i<arrayresumen.length;i++) {
				if(arrayresumen[i]==null) {
					arrayresumen[i]=prodizena;
						break;
					}
				}
			return arrayresumen;
	}
	
}
