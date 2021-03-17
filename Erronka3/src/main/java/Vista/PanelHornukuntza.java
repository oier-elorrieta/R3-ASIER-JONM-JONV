package Vista;

import javax.swing.JButton;




import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.ControladorPanelHasiera;
import Controlador.ControladorPanelHornikuntza;
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
public class PanelHornukuntza extends JPanel {

	private ControladorPanelHornikuntza controladorPanelHornikuntza;
	private JButton btnExitTicket;
	private JButton btnAurreraTicket;
	private JComboBox<String> Izenak;
	private JButton btnAukeratu;
	private JSpinner spinnerKanti;
	


	public PanelHornukuntza(ControladorPanelHornikuntza controladorPanelHornikuntza) {

		setBackground(Color.LIGHT_GRAY);
		this.controladorPanelHornikuntza = controladorPanelHornikuntza;
		setLayout(null);


		JLabel lblHornikuntza = new JLabel("HORNIKUNTZA");
		lblHornikuntza.setForeground(Color.BLACK);
		lblHornikuntza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHornikuntza.setBounds(207, 11, 114, 14);
		add(lblHornikuntza);


		JLabel lblproduktuak = new JLabel("Produktu bat aukeratu?");
		lblproduktuak.setForeground(Color.BLACK);
		lblproduktuak.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblproduktuak.setBounds(21, 51, 200, 14);
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
		Izenak.setBounds(122, 76, 226, 21);
		add(Izenak);
		String[] arrayizenak = Metodoak.irakurriarray();
		for(int i = 0;i < arrayizenak.length;i++) {
		Izenak.addItem(arrayizenak[i]);
		}


		spinnerKanti = new JSpinner();
		spinnerKanti.setBounds(220, 158, 50, 32);
		add(spinnerKanti);

		btnAukeratu = new JButton("Aukeratu");
		btnAukeratu.setBounds(210, 223, 89, 23);
		btnAukeratu.setBackground(new java.awt.Color(130, 130, 130));
		btnAukeratu.setOpaque(true);
		btnAukeratu.setBorderPainted(false);
		add(btnAukeratu);
		
		JLabel lblProduktoHorretaikZnbat = new JLabel("Produkto horretatik zenbat eskatu nahi dituzu?");
		lblProduktoHorretaikZnbat.setForeground(Color.BLACK);
		lblProduktoHorretaikZnbat.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProduktoHorretaikZnbat.setBounds(21, 121, 278, 14);
		add(lblProduktoHorretaikZnbat);

		initializeEvents();
		}
	
	private void initializeEvents() {
		this.btnAurreraTicket.addActionListener(listenerBotonAurreraTicket(this.controladorPanelHornikuntza));
		this.btnExitTicket.addActionListener(listenerBotonExitTicket(this.controladorPanelHornikuntza));
		this.btnAukeratu.addActionListener(listenerBotonAukeratu(this.controladorPanelHornikuntza)); 
	}
	
	private ActionListener listenerBotonAurreraTicket(ControladorPanelHornikuntza controladorPanelHornikuntza) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*String emaitzafin=textDiruTot.getText();
				controladorPanelHornikuntza.registraroperacion(emaitzafin);
				int ID=controladorPanelHornikuntza.ateraID();
				controladorPanelHornikuntza.accionandokantisartu(ID);*/
				controladorPanelHornikuntza.accionadoBottonMostrarPanelResumen();
			}
		};
	}
	
	private ActionListener listenerBotonExitTicket(ControladorPanelHornikuntza controladorPanelHornikuntza) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Tipolocal=controladorPanelHornikuntza.Tipolocalateraparametrogabe();
				System.out.println(Tipolocal);
				if(Tipolocal.equals("Bar")) {
					controladorPanelHornikuntza.accionadoBar();
				}if(Tipolocal.equals("Restaurante")) {
					controladorPanelHornikuntza.accionadoBottonExit();
				}if(Tipolocal.equals("Cafeteria")) {
					controladorPanelHornikuntza.accionadoCafeteria();
				}
				
				controladorPanelHornikuntza.arrayizenaborratu();
				controladorPanelHornikuntza.arrayprezioborratu();
				controladorPanelHornikuntza.kantitateaarrayezabatu();
			}
		};
	}
	
	private ActionListener listenerBotonAukeratu(ControladorPanelHornikuntza controladorPanelHornikuntza) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String kanti=spinnerKanti.getValue().toString();
				int kantitatea=Integer.parseInt(kanti);
				String izena=Izenak.getSelectedItem().toString();
				/*String emaitza=controladorPanelHornikuntza.accionandoBottonEmaitzafin(kanti,izena);
				textDiruTot.setText(emaitza);*/
				controladorPanelHornikuntza.accionandoBottonArray(izena);
				controladorPanelHornikuntza.kantitateaarraysartu(kantitatea);
			}
		};
	}
}