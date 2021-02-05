package Controlador;

import Modelo.Modelo;



import Vista.Login;
import Vista.Vista;

public class ControladorPanelLogin {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private Login login;
	
	public ControladorPanelLogin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelLogin() {
		this.login = new Login(this);
		this.vista.mostrarPanel(login);
	}
	
	public void accionadoBottonAtzera() {
		this.controlador.navegarPanelNagusia();
	}
	
}
