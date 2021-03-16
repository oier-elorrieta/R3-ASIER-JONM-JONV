package Vista;

import javax.swing.JButton;




import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.ControladorPanelHasiera;
import Controlador.ControladorPanelKomanda;
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
public class PanelKomanda extends JPanel {

	private ControladorPanelKomanda controladorPanelKomanda;
	private JButton btnExitTicket;
	private JButton btnAurreraTicket;
	private JComboBox<String> Izenak;
	private JTextField textDiruTot;
	private JButton btnAukeratu;
	private JSpinner spinnerKanti;
	


	public PanelKomanda(ControladorPanelKomanda controladorPanelKomanda) {

		setBackground(Color.LIGHT_GRAY);
		this.controladorPanelKomanda = controladorPanelKomanda;
		setLayout(null);


		JLabel lblkomanda = new JLabel("KOMANDA");
		lblkomanda.setForeground(Color.BLACK);
		lblkomanda.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblkomanda.setBounds(207, 11, 77, 14);
		add(lblkomanda);


		JLabel lblgaldera = new JLabel("Zer nahi duzu?");
		lblgaldera.setForeground(Color.BLACK);
		lblgaldera.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblgaldera.setBounds(21, 51, 111, 14);
		add(lblgaldera);

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
		this.btnAurreraTicket.addActionListener(listenerBotonAurreraTicket(this.controladorPanelKomanda));
		this.btnExitTicket.addActionListener(listenerBotonExitTicket(this.controladorPanelKomanda));
		this.btnAukeratu.addActionListener(listenerBotonAukeratu(this.controladorPanelKomanda)); 
	}
	
	private ActionListener listenerBotonAurreraTicket(ControladorPanelKomanda controladorPanelKomanda) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String emaitzafin=textDiruTot.getText();
				controladorPanelKomanda.registraroperacion(emaitzafin);
				int ID=controladorPanelKomanda.ateraID();
				controladorPanelKomanda.accionandokantisartu(ID);
				controladorPanelKomanda.accionadoBottonMostrarPanelResumen();
			}
		};
	}
	
	private ActionListener listenerBotonExitTicket(ControladorPanelKomanda controladorPanelKomanda) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Tipolocal=controladorPanelKomanda.Tipolocalateraparametrogabe();
				System.out.println(Tipolocal);
				if(Tipolocal.equals("Bar")) {
					controladorPanelKomanda.accionadoBar();
				}if(Tipolocal.equals("Restaurante")) {
					controladorPanelKomanda.accionadoBottonExit();
				}if(Tipolocal.equals("Cafeteria")) {
					controladorPanelKomanda.accionadoCafeteria();
				}
				
				controladorPanelKomanda.arrayizenaborratu();
				controladorPanelKomanda.arrayprezioborratu();
				controladorPanelKomanda.kantitateaarrayezabatu();
			}
		};
	}
	
	private ActionListener listenerBotonAukeratu(ControladorPanelKomanda controladorPanelKomanda) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String kanti=spinnerKanti.getValue().toString();
				int kantitatea=Integer.parseInt(kanti);
				String izena=Izenak.getSelectedItem().toString();
				String emaitza=controladorPanelKomanda.accionandoBottonEmaitzafin(kanti,izena);
				textDiruTot.setText(emaitza);
				controladorPanelKomanda.accionandoBottonArray(izena);
				controladorPanelKomanda.kantitateaarraysartu(kantitatea);
			}
		};
	}
}