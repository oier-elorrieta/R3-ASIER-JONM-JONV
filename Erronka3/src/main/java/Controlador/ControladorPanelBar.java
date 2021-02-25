package Controlador;

import Modelo.Modelo;



import Vista.PanelBar;
import Vista.Vista;

public class ControladorPanelBar {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelBar panelBar;
	
	public ControladorPanelBar(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelBar() {
		this.panelBar = new PanelBar(this);
		this.vista.mostrarPanel(panelBar);
	}
	
	public void accionadoBottonMostrarPanelTicket() {
		this.controlador.navegarPanelTicket();
	}
	
	public void accionadoBottonMostrarPanelNagusia() {
		this.controlador.navegarPanelNagusia();
	}
}
