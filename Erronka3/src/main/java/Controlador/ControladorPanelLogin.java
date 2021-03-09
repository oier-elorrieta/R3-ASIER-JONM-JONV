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
	
	public void accionadoBottonLogin() {
		this.controlador.navegarPanelHasiera();
	}
	
	public void accionadoBar() {
		this.controlador.navegarPanelBar();
	}
	
	public void accionadoCafeteria() {
		this.controlador.navegarPanelCafeteria();
	}
	
	public boolean BottonLoginBeri(String izena, String pasahitza) {
		return this.modelo.BeriUsuario(izena,pasahitza);
	}
	
	public void NIFatera(String Izena, String pasahitza) {
		  this.modelo.AteraNIFmetodoa(Izena,pasahitza);
	}
	
	public String Tipolocalatera() {
		return this.modelo.AteraTipolocalmetodoa();
	}
}
