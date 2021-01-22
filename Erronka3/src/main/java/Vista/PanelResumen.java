package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controlador.ControladorPanelResumen;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelResumen extends JPanel {

	private ControladorPanelResumen controladorPanelResumen;
	private JLabel lblLaburpena;
	private JTextField textField;
	
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
		
		JButton btndeslog = new JButton("Exit");
		btndeslog.setBounds(351, 266, 89, 23);
		add(btndeslog);
		
		textField = new JTextField();
		textField.setBounds(10, 54, 430, 201);
		add(textField);
		textField.setColumns(10);
		
		//initializeEvents();
	}
}
