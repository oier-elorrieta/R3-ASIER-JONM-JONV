package Controlador;

import Modelo.Modelo;

import Vista.Hasiera;
import Vista.Vista;

public class ControladorPanelHasiera {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private Hasiera panelHasiera;
	
	public ControladorPanelHasiera(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelHasiera() {
		this.panelHasiera = new Hasiera(this);
		this.vista.mostrarPanel(this.panelHasiera);
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
	
	public void accionadoBottonMostrarPanelhornikuntza() {
		this.controlador.navegarPanelhornikuntza();
	}
	
	public void accionadoBottonMostrarPanelkomanda() {
		this.controlador.navegarPanelkomanda();
	}
}
