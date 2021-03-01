package Modelo;

public class Produktuak {
	
	private String izena;
	private double prezioa;
	
	
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public double getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}
	
	
	public Produktuak(String izena, double prezioa) {
		this.izena = izena;
		this.prezioa = prezioa;
	}
	
	
	

}
