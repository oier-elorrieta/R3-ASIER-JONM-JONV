package Modelo;

public class Produktuak {
	
	private String izena;
	private int prezioa;
	
	
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public int getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}
	
	
	public Produktuak(String izena, int prezioa) {
		this.izena = izena;
		this.prezioa = prezioa;
	}
	
	
	

}
