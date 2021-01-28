package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Controlador.ControladorPanelEskaera;
import Controlador.ControladorPanelResumen;
import javax.swing.JTextField;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PanelResumen extends JPanel {

	private ControladorPanelResumen controladorPanelResumen;
	private JLabel lblLaburpena;
	private JButton btnexitResum;
	private JButton btnResumen;
	private JLabel lblNewLabel;
	
	public PanelResumen(ControladorPanelResumen controladorPanelResumen) {
		this.controladorPanelResumen = controladorPanelResumen;
		setBackground(Color.DARK_GRAY);
		
		setLayout(null);
		setLayout(null);
		
		lblLaburpena = new JLabel("LABURPENA");
		lblLaburpena.setBounds(181, 30, 106, 14);
		lblLaburpena.setForeground(Color.WHITE);
		lblLaburpena.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblLaburpena);
		
		btnexitResum = new JButton("Exit");
		btnexitResum.setBounds(351, 266, 89, 23);
		add(btnexitResum);
		
		btnResumen = new JButton("Resumen");
		btnResumen.setBounds(26, 27, 85, 21);
		add(btnResumen);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(26, 68, 400, 188);
		add(lblNewLabel);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnexitResum.addActionListener(listenerBotonExitResumen(this.controladorPanelResumen));
		this.btnResumen.addActionListener(listenerBotonResumen(this.controladorPanelResumen));
	}
	
	private ActionListener listenerBotonExitResumen(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelResumen.accionadoBottonExit();
			}
		};
	}
	
	private ActionListener listenerBotonResumen(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] arrays = new Object[10];
				arrays=PanelTicket.array;
				for(int i=0;i<arrays.length;i++) {
					lblNewLabel.setText(arrays[i].toString());;
				}
				
			}
		};
	}
}
