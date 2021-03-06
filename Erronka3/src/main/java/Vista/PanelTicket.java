package Vista;

import javax.swing.JButton;



import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.ControladorPanelHasiera;
import Controlador.ControladorPanelTicket;
import Modelo.Metodoak;
import Modelo.Produktuak;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSpinner;

@SuppressWarnings("serial")
public class PanelTicket extends JPanel {

	private ControladorPanelTicket controladorPanelTicket;
	private JButton btnExitTicket;
	private JButton btnAurreraTicket;
	private JComboBox<String> Izenak;
	private JTextField textDiruTot;
	private JButton btnAukeratu;
	private JSpinner spinnerKanti;
	


	public PanelTicket(ControladorPanelTicket controladorPanelTicket) {

		setBackground(Color.LIGHT_GRAY);
		this.controladorPanelTicket = controladorPanelTicket;
		setLayout(null);


		JLabel lblTicket = new JLabel("TICKET");
		lblTicket.setForeground(Color.BLACK);
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTicket.setBounds(207, 11, 77, 14);
		add(lblTicket);


		JLabel lblproduktuak = new JLabel("Produktuak");
		lblproduktuak.setForeground(Color.BLACK);
		lblproduktuak.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblproduktuak.setBounds(22, 26, 111, 14);
		add(lblproduktuak);

		btnExitTicket = new JButton("Exit");
		btnExitTicket.setBounds(356, 266, 82, 23);
		btnExitTicket.setBackground(new java.awt.Color(130, 130, 130));
		btnExitTicket.setOpaque(true);
		btnExitTicket.setBorderPainted(false);
		add(btnExitTicket);

		btnAurreraTicket = new JButton("Aurrera");
		btnAurreraTicket.setBounds(264, 266, 84, 23);
		btnAurreraTicket.setBackground(new java.awt.Color(130, 130, 130));
		btnAurreraTicket.setOpaque(true);
		btnAurreraTicket.setBorderPainted(false);
		add(btnAurreraTicket);

		Izenak = new JComboBox();
		Izenak.setBounds(21, 76, 226, 21);
		add(Izenak);
		String[] arrayizenak = Metodoak.irakurriarray();
		for(int i = 0;i < arrayizenak.length;i++) {
		Izenak.addItem(arrayizenak[i]);
		}


		spinnerKanti = new JSpinner();
		spinnerKanti.setBounds(356, 76, 30, 20);
		add(spinnerKanti);

		JLabel lblKanti = new JLabel("Kantitatea:");
		lblKanti.setForeground(Color.BLACK);
		lblKanti.setBounds(264, 80, 123, 13);
		add(lblKanti);

		JLabel lblDiruTot = new JLabel("Daramazun dirua:");
		lblDiruTot.setForeground(Color.BLACK);
		lblDiruTot.setBounds(23, 264, 106, 13);
		add(lblDiruTot);

		textDiruTot = new JTextField();
		textDiruTot.setBounds(139, 251, 60, 39);
		add(textDiruTot);
		textDiruTot.setColumns(10);

		btnAukeratu = new JButton("Aukeratu");
		btnAukeratu.setBounds(297, 117, 89, 23);
		btnAukeratu.setBackground(new java.awt.Color(130, 130, 130));
		btnAukeratu.setOpaque(true);
		btnAukeratu.setBorderPainted(false);
		add(btnAukeratu);

		initializeEvents();
		}
	
	private void initializeEvents() {
		this.btnAurreraTicket.addActionListener(listenerBotonAurreraTicket(this.controladorPanelTicket));
		this.btnExitTicket.addActionListener(listenerBotonExitTicket(this.controladorPanelTicket));
		this.btnAukeratu.addActionListener(listenerBotonAukeratu(this.controladorPanelTicket)); 
	}
	
	private ActionListener listenerBotonAurreraTicket(ControladorPanelTicket controladorPanelTicket) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String emaitzafin=textDiruTot.getText();
				controladorPanelTicket.registraroperacion(emaitzafin);
				int ID=controladorPanelTicket.ateraID();
				controladorPanelTicket.accionandokantisartu(ID);
				controladorPanelTicket.accionadoBottonMostrarPanelResumen();
			}
		};
	}
	
	private ActionListener listenerBotonExitTicket(ControladorPanelTicket controladorPanelTicket) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Tipolocal=controladorPanelTicket.Tipolocalateraparametrogabe();
				System.out.println(Tipolocal);
				if(Tipolocal.equals("Bar")) {
					controladorPanelTicket.accionadoBar();
				}if(Tipolocal.equals("Restaurante")) {
					controladorPanelTicket.accionadoBottonExit();
				}if(Tipolocal.equals("Cafeteria")) {
					controladorPanelTicket.accionadoCafeteria();
				}
				
				controladorPanelTicket.arrayizenaborratu();
				controladorPanelTicket.arrayprezioborratu();
				controladorPanelTicket.kantitateaarrayezabatu();
			}
		};
	}
	
	private ActionListener listenerBotonAukeratu(ControladorPanelTicket controladorPanelTicket) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String kanti=spinnerKanti.getValue().toString();
				int kantitatea=Integer.parseInt(kanti);
				String izena=Izenak.getSelectedItem().toString();
				String emaitza=controladorPanelTicket.accionandoBottonEmaitzafin(kanti,izena);
				textDiruTot.setText(emaitza);
				controladorPanelTicket.accionandoBottonArray(izena);
				controladorPanelTicket.kantitateaarraysartu(kantitatea);
			}
		};
	}
}