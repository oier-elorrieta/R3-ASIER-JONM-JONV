package Controlador;

import Modelo.Modelo;
import Vista.Hasiera;
import Vista.Nagusia;
import Vista.Vista;

public class ControladorPanelNagusia {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private Nagusia nagusia;
	
	public ControladorPanelNagusia(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelNagusia() {
		this.nagusia = new Nagusia(this);
		this.vista.mostrarPanel(this.nagusia);
	}
	
	public void accionadoBottonMostrarPanelLogin() {
		this.controlador.navegarPanelLogin();
	}
	
	public void accionadoBottonMostrarPanelRegistratu() {
		this.controlador.navegarPanelRegistratu();
	}

}
