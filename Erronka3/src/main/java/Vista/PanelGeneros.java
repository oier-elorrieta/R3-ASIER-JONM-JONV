package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelGeneros;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnPelis;
	private JLabel lblGeneros;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros)
	{
		this.controladorPanelGeneros = controladorPanelGeneros;
		
		setLayout(null);
		
		lblGeneros = new JLabel("Panel Generos");
		lblGeneros.setBounds(58, 35, 115, 14);
		add(lblGeneros);
		
		btnPelis = new JButton("Pelis");
		btnPelis.setBounds(58, 62, 89, 23);
		add(btnPelis);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnPelis.addActionListener(listenerBotonPelis(this.controladorPanelGeneros));
	}
	
	private ActionListener listenerBotonPelis(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton pelis");
				controladorPanelGeneros.accionadoBottonPelis();
			}
		};
	}
}
