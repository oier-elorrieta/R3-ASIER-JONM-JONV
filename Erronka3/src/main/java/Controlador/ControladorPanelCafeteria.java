package Controlador;

import Modelo.Modelo;




import Vista.PanelCafeteria;
import Vista.Vista;

public class ControladorPanelCafeteria {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelCafeteria panelCafeteria;
	
	public ControladorPanelCafeteria(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelCafeteria() {
		this.panelCafeteria = new PanelCafeteria(this);
		this.vista.mostrarPanel(panelCafeteria);
	}
	
	public void accionadoBottonMostrarPanelTicket() {
		this.controlador.navegarPanelTicket();
	}
	
	public void accionadoBottonMostrarPanelEskaera() {
		this.controlador.navegarPanelEskaera();
	}
	
	public void accionadoBottonMostrarPanelNagusia() {
		this.controlador.navegarPanelNagusia();
	}
}
