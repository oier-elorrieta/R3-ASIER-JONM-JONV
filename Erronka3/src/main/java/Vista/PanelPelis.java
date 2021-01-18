package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelPelis;
import javax.swing.JList;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class PanelPelis extends JPanel {

	private JButton btnHasiera;
	private JButton btnAtzera;
	private JLabel lblPelis;
	private JButton btnModelo;
	private JComboBox ListaAuto;
	private ControladorPanelPelis controladorPanelPelis;
	
	public PanelPelis(ControladorPanelPelis controladorPanelPelis)
	{
		this.controladorPanelPelis = controladorPanelPelis;
		setLayout(null);
		
		lblPelis = new JLabel("Panel Pelis");
		lblPelis.setBounds(58, 35, 115, 14);
		add(lblPelis);
		
		btnHasiera = new JButton("Hasiera");
		btnHasiera.setBounds(56, 60, 89, 23);
		add(btnHasiera);
		
		btnAtzera = new JButton("Atzera");
		btnAtzera.setBounds(58, 94, 89, 23);
		add(btnAtzera);
		
		btnModelo = new JButton("Modelo");
		btnModelo.setBounds(232, 60, 89, 23);
		add(btnModelo);
		
		ListaAuto = new JComboBox();
		ListaAuto.setBounds(232, 156, 104, 22);
		add(ListaAuto);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnHasiera.addActionListener(listenerBotonHasiera(this.controladorPanelPelis));
		this.btnAtzera.addActionListener(listenerBotonAtzera(this.controladorPanelPelis));
		this.btnModelo.addActionListener(listenerBotonBete(this.controladorPanelPelis));
	}
	
	private ActionListener listenerBotonHasiera(ControladorPanelPelis controladorPanelPelis) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Hasiera");
				controladorPanelPelis.accionadoBottonHasieraPanelPelis();
			}
		};
	}
	
	private ActionListener listenerBotonAtzera(ControladorPanelPelis controladorPanelPelis) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Atzera");
				controladorPanelPelis.accionadoBottonAtzeraPanelPelis();
			}
		};
	}
	
	private ActionListener listenerBotonBete(ControladorPanelPelis controladorPanelPelis) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Bete");
				String [] array=controladorPanelPelis.accionadoBottonBetePanelPelis();
				for(int i=0; array.length; i++) {
					ListaAuto.addItem(array[i]);
				}
			}
		};
	}
}
