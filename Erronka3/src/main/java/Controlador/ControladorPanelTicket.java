package Controlador;

import Modelo.Modelo;
import Vista.PanelTicket;
import Vista.Vista;

public class ControladorPanelTicket {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelTicket panelTicket;
	
	public ControladorPanelTicket(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelTicket() {
		this.panelTicket = new PanelTicket(this);
		this.vista.mostrarPanel(panelTicket);
	}
	
	public void accionadoBottonMostrarPanelResumen() {
		this.controlador.navegarPanelResumen();
	}
	
	public void accionadoBottonExit() {
		this.controlador.navegarPanelHasiera();
	}
}
