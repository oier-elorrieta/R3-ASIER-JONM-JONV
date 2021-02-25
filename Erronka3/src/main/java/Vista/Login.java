package Vista;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JButton btnLogin;
	private JLabel lblpasahitza;
	private JLabel lblIzena;
	private ControladorPanelLogin controladorPanelLogin;


	public Login(ControladorPanelLogin controladorPanelLogin) {
		setBackground(Color.LIGHT_GRAY);
		this.controladorPanelLogin = controladorPanelLogin;
		setLayout(null);

		lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzena.setForeground(Color.BLACK);
		lblIzena.setBounds(87, 105, 80, 14);
		add(lblIzena);

		lblpasahitza = new JLabel("Pasahitza");
		lblpasahitza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpasahitza.setForeground(Color.BLACK);
		lblpasahitza.setBounds(87, 171, 80, 14);
		add(lblpasahitza);

		textIzena = new JTextField();
		textIzena.setBounds(226, 104, 86, 20);
		add(textIzena);
		textIzena.setColumns(10);

		textpasahitza = new JPasswordField();
		textpasahitza.setBounds(226, 170, 86, 20);
		add(textpasahitza);
		textpasahitza.setColumns(10);

		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBounds(351, 266, 89, 23);
		btnLogin.setBackground(new java.awt.Color(130, 130, 130));
		btnLogin.setOpaque(true);
		btnLogin.setBorderPainted(false);
		add(btnLogin);

		btnAtzera = new JButton("Atzera");
		btnAtzera.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAtzera.setBounds(252, 266, 89, 23);
		btnAtzera.setBackground(new java.awt.Color(130, 130, 130));
		btnAtzera.setOpaque(true);
		btnAtzera.setBorderPainted(false);
		add(btnAtzera);

		initializeEvents();
		}

	
	private void initializeEvents() {
		this.btnAtzera.addActionListener(listenerBotonAtzeraLogin(this.controladorPanelLogin));
		this.btnLogin.addActionListener(listenerBotonLogin(this.controladorPanelLogin));
	}
	
	private ActionListener listenerBotonAtzeraLogin(ControladorPanelLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelLogin.accionadoBottonAtzera();
			}
		};
	}
	
	private ActionListener listenerBotonLogin(ControladorPanelLogin controladorPanelLogin) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Izena=textIzena.getText();
				String pasahitza=textpasahitza.getText();
				boolean badago=controladorPanelLogin.BottonLoginBeri(Izena,pasahitza);
				if(badago==true) {
					String NIF="";
					NIF=controladorPanelLogin.NIFatera(Izena, pasahitza,NIF);
					
					String Tipolocal=controladorPanelLogin.Tipolocalatera(NIF);
					System.out.println(Tipolocal);

					if(Tipolocal.equals("Bar")) {
						controladorPanelLogin.accionadoBar();
					}if(Tipolocal.equals("Restaurante")) {
						controladorPanelLogin.accionadoBottonLogin();
					}if(Tipolocal.equals("Cafeteria")) {
						controladorPanelLogin.accionadoCafeteria();
					}
				}else {
					JOptionPane.showInternalMessageDialog(null,"Usuarioa ez da existitzen");
					textpasahitza.setText("");
					textIzena.setText("");
				}	
			}
			
		};
	}
}
