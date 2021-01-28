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
	
	/*public void accionadoBottonMostrarArrayPanelResumen(String[] array) {
		this.modelo.mostrarPanelResumen(array);
	}*/

	public void accionadoBottonExit() {
		this.controlador.navegarPanelHasiera();
	}
	
	public String accionandoBottonAukeratu1(String kanti,int emaitzatot) {
		return this.modelo.botonaukeratu1(kanti,emaitzatot);
	}
	
	public Object[] accionandoBottonAukeratu2(Object prodizena,Object[] arrayresumen) {
		return this.modelo.botonaukeratu2(prodizena, arrayresumen);
	}
}
