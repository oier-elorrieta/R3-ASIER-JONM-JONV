package Vista;

import javax.swing.JPanel;


import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controlador.ControladorPanelLogin;
import Controlador.ControladorPanelTicket;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Login extends JPanel {
	
	private JTextField textIzena;
	private JTextField textpasahitza;
	private JButton btnAtzera;
	private ControladorPanelLogin controladorPanelLogin;


	public Login(ControladorPanelLogin controladorPanelLogin) {
		setBackground(Color.DARK_GRAY);
		this.controladorPanelLogin = controladorPanelLogin;
		setLayout(null);
		
		JLabel lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzena.setForeground(Color.WHITE);
		lblIzena.setBounds(87, 105, 80, 14);
		add(lblIzena);
		
		JLabel lblpasahitza = new JLabel("Pasahitza");
		lblpasahitza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpasahitza.setForeground(Color.WHITE);
		lblpasahitza.setBounds(87, 171, 80, 14);
		add(lblpasahitza);
		
		textIzena = new JTextField();
		textIzena.setBounds(226, 104, 86, 20);
		add(textIzena);
		textIzena.setColumns(10);
		
		textpasahitza = new JTextField();
		textpasahitza.setBounds(226, 170, 86, 20);
		add(textpasahitza);
		textpasahitza.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(351, 266, 89, 23);
		add(btnNewButton);
		
		btnAtzera = new JButton("Atzera");
		btnAtzera.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAtzera.setBounds(252, 266, 89, 23);
		add(btnAtzera);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAtzera.addActionListener(listenerBotonAtzeraLogin(this.controladorPanelLogin));
	}
	
	private ActionListener listenerBotonAtzeraLogin(ControladorPanelLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelLogin.accionadoBottonAtzera();
			}
		};
	}
}
