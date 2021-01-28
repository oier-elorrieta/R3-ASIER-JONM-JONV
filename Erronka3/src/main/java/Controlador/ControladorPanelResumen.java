package Controlador;

import Modelo.Modelo;

import Vista.PanelResumen;
import Vista.Vista;

public class ControladorPanelResumen {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelResumen panelResumen;
	
	public ControladorPanelResumen(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelResumen() {
		this.panelResumen = new PanelResumen(this);
		this.vista.mostrarPanel(panelResumen);
	}
	
	public void accionadoBottonExit() {
		this.controlador.navegarPanelHasiera();
	}

	/*public String arraystring() {
		this.modelo.arraystringmodelo();
	}*/
}
