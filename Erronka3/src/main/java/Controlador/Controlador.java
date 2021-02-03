package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelHasiera controladorPanelHasiera;
	private ControladorPanelTicket controladorPanelTicket;
	private ControladorPanelEskaera controladorPanelEskaera;
	private ControladorPanelResumen controladorPanelResumen;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorPanelHasiera = new ControladorPanelHasiera(this.modelo, this.vista, this);
		this.controladorPanelTicket = new ControladorPanelTicket(this.modelo, this.vista, this);
		this.controladorPanelEskaera = new ControladorPanelEskaera(this.modelo, this.vista, this);
		this.controladorPanelResumen = new ControladorPanelResumen(this.modelo, this.vista, this);
		this.navegarPanelHasiera();
	}
	
	public void navegarPanelHasiera() {
		System.out.println("Navegar panel Bienvenida");
		this.controladorPanelHasiera.mostrarPanelHasiera();
	}
	
	public void navegarPanelTicket() {
		this.controladorPanelTicket.mostrarPanelTicket();
	}
	
	public void navegarPanelEskaera() {
		this.controladorPanelEskaera.mostrarPanelEskaera();
	}
	
	public void navegarPanelResumen() {
		this.controladorPanelResumen.mostrarPanelResumen();
	}
	
	/*public void navegarArrayIzenaTicket(String[] array) {
		this.controladorPanelResumen.ArrayIzenaTicket(array);
	}
	
	public void navegarArrayPrezioTicket(double[] arrayprezio) {
		this.controladorPanelResumen.ArrayPrezioTicket(arrayprezio);
	}*/
	
}
