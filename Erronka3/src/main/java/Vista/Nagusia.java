package Vista;

import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controlador.ControladorPanelNagusia;

@SuppressWarnings("serial")
public class Nagusia extends JPanel {

	private ControladorPanelNagusia controladorPanelNagusia;
	private JButton btnLogin;
	private JButton btnSingup;
	
	public Nagusia(ControladorPanelNagusia controladorPanelNagusia) {
		
		setBounds(100, 100, 450, 300);
		setBackground(Color.DARK_GRAY);
		
		setLayout(null);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBounds(86, 117, 97, 23);
		add(btnLogin);
		
		btnSingup = new JButton("Sign Up");
		btnSingup.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSingup.setBounds(243, 117, 97, 23);
		add(btnSingup);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnLogin.addActionListener(listenerBotonLogeatu(this.controladorPanelNagusia));
		this.btnSingup.addActionListener(listenerBotonRegistratu(this.controladorPanelNagusia)); 
	}
	
	private ActionListener listenerBotonLogeatu(ControladorPanelNagusia controladorPanelNagusia) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelNagusia.accionadoBottonMostrarPanelLogin();
			}
		};
	}
	
	private ActionListener listenerBotonRegistratu(ControladorPanelNagusia controladorPanelNagusia) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelNagusia.accionadoBottonMostrarPanelRegistratu();
			}
		};
	}

}
