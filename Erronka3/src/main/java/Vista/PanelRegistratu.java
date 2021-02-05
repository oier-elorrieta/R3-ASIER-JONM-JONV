package Vista;

import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controlador.ControladorPanelLogin;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelRegistratu extends JPanel {
	
	private JTextField textIzena;
	private JTextField textpasahitza;
	private ControladorPanelLogin controladorPanelLogin;
	private JTextField textpasahitza2;


	public PanelRegistratu(ControladorPanelLogin controladorPanelLogin) {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JLabel lblIzena = new JLabel("Username");
		lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzena.setForeground(Color.WHITE);
		lblIzena.setBounds(87, 78, 80, 14);
		add(lblIzena);
		
		JLabel lblpasahitza = new JLabel("Password");
		lblpasahitza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpasahitza.setForeground(Color.WHITE);
		lblpasahitza.setBounds(87, 130, 80, 14);
		add(lblpasahitza);
		
		textIzena = new JTextField();
		textIzena.setBounds(226, 77, 86, 20);
		add(textIzena);
		textIzena.setColumns(10);
		
		textpasahitza = new JTextField();
		textpasahitza.setBounds(226, 129, 86, 20);
		add(textpasahitza);
		textpasahitza.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(351, 266, 89, 23);
		add(btnNewButton);
		
		JLabel lblpasahitza_2 = new JLabel("Password");
		lblpasahitza_2.setForeground(Color.WHITE);
		lblpasahitza_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpasahitza_2.setBounds(87, 197, 80, 14);
		add(lblpasahitza_2);
		
		textpasahitza2 = new JTextField();
		textpasahitza2.setColumns(10);
		textpasahitza2.setBounds(226, 196, 86, 20);
		add(textpasahitza2);
		
		
	}
}
