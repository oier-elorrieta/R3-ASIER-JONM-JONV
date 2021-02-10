package Vista;

import javax.swing.JPanel;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controlador.ControladorPanelLogin;
import Controlador.ControladorPanelRegistratu;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelRegistratu extends JPanel {
	
	private JTextField textIzena;
	private JTextField textpasahitza;
	private JButton btnAtzera;
	private JButton btnLoeginErre;
	private ControladorPanelRegistratu controladorPanelRegistratu;
	private JTextField textpasahitza2;


	public PanelRegistratu(ControladorPanelRegistratu controladorPanelRegistratu) {
		
		setBackground(Color.DARK_GRAY);
		this.controladorPanelRegistratu = controladorPanelRegistratu;
		setLayout(null);
		
		JLabel lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzena.setForeground(Color.WHITE);
		lblIzena.setBounds(87, 78, 80, 14);
		add(lblIzena);
		
		JLabel lblpasahitza = new JLabel("Pasahitza");
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
		
		btnLoeginErre = new JButton("Login");
		btnLoeginErre.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLoeginErre.setBounds(351, 266, 89, 23);
		add(btnLoeginErre);
		
		JLabel lblpasahitza_2 = new JLabel("Pasahitza");
		lblpasahitza_2.setForeground(Color.WHITE);
		lblpasahitza_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpasahitza_2.setBounds(87, 180, 80, 14);
		add(lblpasahitza_2);
		
		textpasahitza2 = new JTextField();
		textpasahitza2.setColumns(10);
		textpasahitza2.setBounds(226, 179, 86, 20);
		add(textpasahitza2);
		
		btnAtzera = new JButton("Atzera");
		btnAtzera.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAtzera.setBounds(252, 266, 89, 23);
		add(btnAtzera);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAtzera.addActionListener(listenerBotonAtzeraRegistatu(this.controladorPanelRegistratu));
		this.btnLoeginErre.addActionListener(listenerBotonLogin(this.controladorPanelRegistratu));
	}
	
	private ActionListener listenerBotonAtzeraRegistatu(ControladorPanelRegistratu controladorPanelRegistratu) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelRegistratu.accionadoBottonAtzera();
			}
		};
	}
	
	private ActionListener listenerBotonLogin(ControladorPanelRegistratu controladorPanelRegistratu) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Izena=textIzena.getText();
				String pasahitza=textpasahitza.getText();
				String pasahitza2=textpasahitza2.getText();
				boolean berdina=controladorPanelRegistratu.BottonErregistratu(Izena,pasahitza,pasahitza2);
				if(berdina==true) {
					controladorPanelRegistratu.accionadoBottonLogin();
				}else {
					JOptionPane.showInternalMessageDialog(null,"Pasahitzak ez dute koinziditzen");
					textpasahitza.setText("");
					textpasahitza2.setText("");
				}
			}
		};
	}
}
