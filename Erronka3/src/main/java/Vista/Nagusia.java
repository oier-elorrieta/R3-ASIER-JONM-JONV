package Vista;

import java.awt.BorderLayout;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controlador.ControladorPanelNagusia;
import Controlador.ControladorPanelLogin;

@SuppressWarnings("serial")
public class Nagusia extends JPanel {

	private ControladorPanelNagusia controladorPanelNagusia;
	private JButton btnLogin;
	private JButton btnSingup;
	
	public Nagusia(ControladorPanelNagusia controladorPanelNagusia) {
		this.controladorPanelNagusia = controladorPanelNagusia;
		setBounds(100, 100, 450, 300);
		setBackground(Color.LIGHT_GRAY);
		
		setLayout(null);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setBounds(23, 44, 197, 220);
		btnLogin.setBackground(new java.awt.Color(130, 130, 130)); 
		btnLogin.setOpaque(true); 
		btnLogin.setBorderPainted(false);
		add(btnLogin);
		
		btnSingup = new JButton("Sign Up");
		btnSingup.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSingup.setBounds(230, 44, 187, 220);
		btnSingup.setBackground(new java.awt.Color(130, 130, 130)); 
		btnSingup.setOpaque(true); 
		btnSingup.setBorderPainted(false);
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
