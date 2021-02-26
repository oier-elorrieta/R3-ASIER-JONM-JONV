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
	private JTextField textNIF;


	public PanelRegistratu(ControladorPanelRegistratu controladorPanelRegistratu) {

		setBackground(Color.LIGHT_GRAY);
		this.controladorPanelRegistratu = controladorPanelRegistratu;
		setLayout(null);

		JLabel lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIzena.setForeground(Color.BLACK);
		lblIzena.setBounds(34, 67, 80, 14);
		add(lblIzena);

		JLabel lblpasahitza = new JLabel("Pasahitza");
		lblpasahitza.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpasahitza.setForeground(Color.BLACK);
		lblpasahitza.setBounds(34, 117, 80, 14);
		add(lblpasahitza);

		textIzena = new JTextField();
		textIzena.setBounds(124, 66, 86, 20);
		add(textIzena);
		textIzena.setColumns(10);

		textpasahitza = new JPasswordField();
		textpasahitza.setBounds(124, 116, 86, 20);
		add(textpasahitza);
		textpasahitza.setColumns(10);

		btnLoeginErre = new JButton("Login");
		btnLoeginErre.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLoeginErre.setBounds(351, 266, 89, 23);
		btnLoeginErre.setBackground(new java.awt.Color(130, 130, 130));
		btnLoeginErre.setOpaque(true);
		btnLoeginErre.setBorderPainted(false);
		add(btnLoeginErre);

		JLabel lblpasahitza_2 = new JLabel("Pasahitza");
		lblpasahitza_2.setForeground(Color.BLACK);
		lblpasahitza_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpasahitza_2.setBounds(34, 180, 80, 14);
		add(lblpasahitza_2);

		textpasahitza2 = new JPasswordField();
		textpasahitza2.setColumns(10);
		textpasahitza2.setBounds(124, 179, 86, 20);
		add(textpasahitza2);

		btnAtzera = new JButton("Atzera");
		btnAtzera.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAtzera.setBounds(252, 266, 89, 23);
		btnAtzera.setBackground(new java.awt.Color(130, 130, 130));
		btnAtzera.setOpaque(true);
		btnAtzera.setBorderPainted(false);
		add(btnAtzera);

		JLabel lblNIF = new JLabel("NIF");
		lblNIF.setForeground(Color.BLACK);
		lblNIF.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNIF.setBounds(305, 69, 80, 14);
		add(lblNIF);

		textNIF = new JTextField();
		textNIF.setColumns(10);
		textNIF.setBounds(283, 111, 86, 20);
		add(textNIF);

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
				String NIF=textNIF.getText();
				boolean berdina=controladorPanelRegistratu.BottonErregistratu(Izena,pasahitza,pasahitza2,NIF);
				if(berdina==true) {
					String Tipolocal=controladorPanelRegistratu.Tipolocalateranif(NIF);
					System.out.println(Tipolocal);
					System.out.println("va");

					if(Tipolocal.equals("Bar")) {
						controladorPanelRegistratu.accionadoBar();
					}if(Tipolocal.equals("Restaurante")) {
						controladorPanelRegistratu.accionadoBottonLogin();
					}if(Tipolocal.equals("Cafeteria")) {
						controladorPanelRegistratu.accionadoCafeteria();
					}
					
				}else {
					JOptionPane.showInternalMessageDialog(null,"Pasahitzak ez dute koinziditzen");
					textpasahitza.setText("");
					textpasahitza2.setText("");
				}
				
			}
		};
	}
}
