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
}
