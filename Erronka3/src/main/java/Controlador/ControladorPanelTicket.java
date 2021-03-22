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
	
	public void accionadoBar() {
		this.controlador.navegarPanelBar();
	}
	
	public void accionadoCafeteria() {
		this.controlador.navegarPanelCafeteria();
	}
	//-------------------------------------------------------------------------------------------------
	
	public String accionandoBottonEmaitzafin(String kanti,String izena) {
		return this.modelo.botonEmaitzafin(kanti,izena);
	}
	
	public void accionandoBottonArray(String izena) {
		this.modelo.botonArray(izena);
	}
	
	public void arrayizenaborratu() {
		this.modelo.arrayizenaasieratu();
	}
	
	public void arrayprezioborratu() {
		this.modelo.arrayprezioasieratu();
	}
	
	public String Tipolocalateraparametrogabe() {
		return this.modelo.AteraTipolocalmetodoa();
	}
	
	public void pedidosartu(String direccion,int ID) {
		modelo.pedidoBD(direccion,ID);
	}

	public void registraroperacion(String emaitza,String tipo) {
		 modelo.operazioaBD(emaitza,tipo);

	}
	public int ateraID() {
		return this.modelo.AteraoperazioID();
	}
	public void accionandoaparecensartu(int ID) {
		this.modelo.aparecensartu(ID);
	}
	
	public void kantitateaarraysartu(int kanti) {
		this.modelo.kantitateaarrayeansartu(kanti);
	}
	
	public void kantitateaarrayezabatu() {
		this.modelo.kantitateaarrayezabatu();
	}
}
