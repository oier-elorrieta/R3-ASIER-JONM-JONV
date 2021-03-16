package Controlador;

import Modelo.Modelo;



import Vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelHasiera controladorPanelHasiera;
	private ControladorPanelTicket controladorPanelTicket;
	private ControladorPanelEskaera controladorPanelEskaera;
	private ControladorPanelResumen controladorPanelResumen;
	private ControladorPanelNagusia controladorPanelNagusia;
	private ControladorPanelLogin controladorPanelLogin;
	private ControladorPanelRegistratu controladorPanelRegistratu;
	private ControladorPanelBar controladorPanelBar;
	private ControladorPanelCafeteria controladorPanelCafeteria;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.controladorPanelHasiera = new ControladorPanelHasiera(this.modelo, this.vista, this);
		this.controladorPanelTicket = new ControladorPanelTicket(this.modelo, this.vista, this);
		this.controladorPanelEskaera = new ControladorPanelEskaera(this.modelo, this.vista, this);
		this.controladorPanelResumen = new ControladorPanelResumen(this.modelo, this.vista, this);
		this.controladorPanelNagusia = new ControladorPanelNagusia(this.modelo, this.vista, this);
		this.controladorPanelLogin = new ControladorPanelLogin(this.modelo, this.vista, this);
		this.controladorPanelRegistratu = new ControladorPanelRegistratu(this.modelo, this.vista, this);
		this.controladorPanelBar = new ControladorPanelBar(this.modelo, this.vista, this);
		this.controladorPanelCafeteria = new ControladorPanelCafeteria(this.modelo, this.vista, this);
		this.navegarPanelNagusia();
	}
	
	public void navegarPanelHasiera() {
		this.controladorPanelHasiera.mostrarPanelHasiera();
	}
	
	public void navegarPanelNagusia() {
		this.controladorPanelNagusia.mostrarPanelNagusia();
	}
	
	public void navegarPanelTicket() {
		this.controladorPanelTicket.mostrarPanelTicket();
	}
	
	public void navegarPanelEskaera() {
		this.controladorPanelEskaera.mostrarPanelEskaera();
	}
	
	public void navegarPanelResumen() {
		this.controladorPanelResumen.mostrarPanelResumen();
	}
	

	public void navegarPanelLogin() {
		this.controladorPanelLogin.mostrarPanelLogin();
	}
	
	public void navegarPanelRegistratu() {
		this.controladorPanelRegistratu.mostrarPanelRegistratu();
	}
	
	public void navegarPanelBar() {
		this.controladorPanelBar.mostrarPanelBar();
	}
	
	public void navegarPanelCafeteria() {
		this.controladorPanelCafeteria.mostrarPanelCafeteria();
	}

	
}
