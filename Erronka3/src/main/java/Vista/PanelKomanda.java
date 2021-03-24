package Vista;

import javax.swing.JButton;
import java.util.Calendar;
import java.util.GregorianCalendar;





import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	Calendar fecha = new GregorianCalendar();
	private ControladorPanelKomanda controladorPanelKomanda;
	private JButton btnExitTicket;
	private JButton btnAurreraTicket;
	private JComboBox<String> Izenak;
	private JComboBox<String> Izenakprod;
	private JTextField textDiruTot;
	private JButton btnAukeratu;
	private JButton btnAukeratu1;
	private JSpinner spinnerKanti;
	private JSpinner spinnerKanti_1;
	private JTextField lbldata;
	private int anyo;
	private int mes;
	private int dia; 
	private JLabel lblKanti_1;


	public PanelKomanda(ControladorPanelKomanda controladorPanelKomanda) {

		setBackground(Color.LIGHT_GRAY);
		this.controladorPanelKomanda = controladorPanelKomanda;
		setLayout(null);
		
		anyo = fecha.get(Calendar.YEAR);
		mes = fecha.get(Calendar.MONTH);
		dia = fecha.get(Calendar.DAY_OF_MONTH);

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
		String[] arrayizenak = Metodoak.irakurriarraykomanda();
		for(int i = 0;i < arrayizenak.length;i++) {
		Izenak.addItem(arrayizenak[i]);
		}

		Izenakprod = new JComboBox();
		Izenakprod.setBounds(21, 156, 226, 21);
		add(Izenakprod);
		String[] arrayproduktu=Metodoak.irakurriarray();
		for(int i = 0;i < arrayproduktu.length;i++) {
			Izenakprod.addItem(arrayproduktu[i]);
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
		
		lbldata  = new JTextField(dia + "/" + (mes + 1) + "/" + anyo); 
		lbldata.setBounds(356, 11, 82, 14);
		add(lbldata);
		
		JLabel lblZerProduktuNahi = new JLabel("Zer produktu nahi duzu?");
		lblZerProduktuNahi.setForeground(Color.BLACK);
		lblZerProduktuNahi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblZerProduktuNahi.setBounds(21, 131, 151, 14);
		add(lblZerProduktuNahi);
		
		lblKanti_1 = new JLabel("Kantitatea:");
		lblKanti_1.setForeground(Color.BLACK);
		lblKanti_1.setBounds(264, 159, 123, 13);
		add(lblKanti_1);
		
		spinnerKanti_1 = new JSpinner();
		spinnerKanti_1.setBounds(356, 156, 30, 20);
		add(spinnerKanti_1);
		
		btnAukeratu1 = new JButton("Aukeratu");
		btnAukeratu1.setOpaque(true);
		btnAukeratu1.setBorderPainted(false);
		btnAukeratu1.setBackground(new Color(130, 130, 130));
		btnAukeratu1.setBounds(297, 196, 89, 23);
		add(btnAukeratu1);

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
				String tipo="comanda";
				controladorPanelKomanda.registraroperacion(emaitzafin,tipo);
				int ID=controladorPanelKomanda.ateraID();
				controladorPanelKomanda.registrarkomanda(ID);
				//controladorPanelKomanda.accionandoaparecensartu(ID);
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
				String kanti1=spinnerKanti_1.getValue().toString();
				int kantitatea1=Integer.parseInt(kanti1);
				String izena1=Izenakprod.getSelectedItem().toString();
				String emaitza=controladorPanelKomanda.accionandoBottonEmaitzafin(kanti,izena);
				textDiruTot.setText(emaitza);
				controladorPanelKomanda.accionandoBottonArray(izena);
				controladorPanelKomanda.kantitateaarraysartu(kantitatea);
			}
		};
	}
}