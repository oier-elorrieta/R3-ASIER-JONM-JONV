package Controlador;

import Modelo.Modelo;
import Vista.Eskaera;
import Vista.Vista;

public class ControladorPanelEskaera {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private Eskaera panelEskaera;
	
	public ControladorPanelEskaera(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelEskaera() {
		this.panelEskaera = new Eskaera(this);
		this.vista.mostrarPanel(panelEskaera);
	}
	
	public void accionadoBottonMostrarPanelResumen() {
		this.controlador.navegarPanelResumen();
	}
	
	public void accionadoBottonExit() {
		this.controlador.navegarPanelHasiera();
	}
	//-------------------------------------------------------------------------------------
	public String accionandoBottonEmaitzafin(String kanti) {
		return this.modelo.botonEmaitzafin(kanti);
	}
	
	public void accionandoBottonArray(String izena) {
		this.modelo.botonArray(izena);
	}
	
	public void accionandoBottonEtxera(double prezio) {
		this.modelo.botonEtxera(prezio);
	}
	
	public String emaitzaetxerekin() {
		return this.modelo.botonEtxeraemaitza();
	}
	
	public void arrayizenaborratu() {
		modelo.arrayizenaasieratu();
	}
	
	public void arrayprezioborratu() {
		modelo.arrayprezioasieratu();
	}
	
	public void pedidosartu(String direccion) {
		modelo.pedidoBD(direccion);
	}
}