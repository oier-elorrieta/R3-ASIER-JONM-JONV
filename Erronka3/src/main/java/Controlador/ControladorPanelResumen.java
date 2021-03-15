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
	
	public String accionadoBottonResumen() {
		return this.modelo.arrayresumenbistaratu();
	}
	
	public void accionadoBar() {
		this.controlador.navegarPanelBar();
	}
	
	public void accionadoCafeteria() {
		this.controlador.navegarPanelCafeteria();
	}
	
	public void arrayizenaborratu() {
		modelo.arrayizenaasieratu();
	}
	
	public void arrayprezioborratu() {
		modelo.arrayprezioasieratu();
	}
	
	public String preziofinbistaratu() {
		return modelo.Emaitzafinenresumen();
	}
	
	public String Tipolocalateraparametrogabe() {
		return this.modelo.AteraTipolocalmetodoa();
	}
	
	public void kantitateaarrayezabatu() {
		this.modelo.kantitateaarrayezabatu();
	}
}
