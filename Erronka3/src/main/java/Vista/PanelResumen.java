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

@SuppressWarnings("serial")
public class PanelResumen extends JPanel {

	private ControladorPanelResumen controladorPanelResumen;
	private JLabel lblLaburpena;
	private JTextField textField;
	private JButton btnexitResum;
	
	public PanelResumen(ControladorPanelResumen controladorPanelResumen) {
		this.controladorPanelResumen = controladorPanelResumen;
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		setLayout(null);
		
		lblLaburpena = new JLabel("LABURPENA");
		lblLaburpena.setBounds(181, 30, 106, 14);
		lblLaburpena.setForeground(Color.WHITE);
		lblLaburpena.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblLaburpena);
		
		btnexitResum = new JButton("Exit");
		btnexitResum.setBounds(351, 266, 89, 23);
		add(btnexitResum);
		
		textField = new JTextField();
		textField.setBounds(10, 54, 430, 201);
		add(textField);
		textField.setColumns(10);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnexitResum.addActionListener(listenerBotonExitResumen(this.controladorPanelResumen));
	}
	
	private ActionListener listenerBotonExitResumen(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelResumen.accionadoBottonExit();
			}
		};
	}
}
