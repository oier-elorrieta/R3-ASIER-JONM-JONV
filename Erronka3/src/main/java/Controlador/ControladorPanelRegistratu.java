package Controlador;

import Modelo.Modelo;



import Vista.PanelRegistratu;
import Vista.Vista;

public class ControladorPanelRegistratu {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelRegistratu panelRegistratu;
	
	public ControladorPanelRegistratu(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelRegistratu() {
		this.panelRegistratu = new PanelRegistratu(this);
		this.vista.mostrarPanel(panelRegistratu);
	}
	
	public void accionadoBottonAtzera() {
		this.controlador.navegarPanelNagusia();
	}
	
	public void accionadoBottonLogin() {
		this.controlador.navegarPanelHasiera();
	}
	
	public boolean BottonErregistratu(String Izena,String pasahitza,String pasahitza2,String NIF) {
		return this.modelo.UsuarioInsert(Izena,pasahitza,pasahitza2,NIF);
	}
}
