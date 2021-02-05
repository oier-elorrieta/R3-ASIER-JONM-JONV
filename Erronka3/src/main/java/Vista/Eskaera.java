package Vista;

import java.awt.Color;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Controlador.ControladorPanelEskaera;
import Controlador.ControladorPanelTicket;
import Modelo.Metodoak;

import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Eskaera extends JPanel {

	private ControladorPanelEskaera controladorPanelEskaera;;
	private JButton btnAurreraPedido;
	private JButton btnExitPedido;
	private JComboBox<String> Izenak;
	private JTextField textDiruTot;
	private JButton btndomicilio;
	private JSpinner spinnerKanti;
	private JButton btnAukeratu;
	
	public Eskaera(ControladorPanelEskaera controladorPanelEskaera) {
		this.controladorPanelEskaera = controladorPanelEskaera;
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		setLayout(null);
		
		JLabel lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setBounds(205, 21, 103, 14);
		lblPedidos.setForeground(Color.WHITE);
		lblPedidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblPedidos);
		
		btnExitPedido = new JButton("Exit");
		btnExitPedido.setBounds(351, 266, 89, 23);
		add(btnExitPedido);

		
		
		
		JLabel lbllocal = new JLabel("Produktuak");
		lbllocal.setBounds(23, 52, 122, 14);
		lbllocal.setForeground(Color.WHITE);
		lbllocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lbllocal);
		
		btndomicilio = new JButton("BAI");
		btndomicilio.setBounds(332, 212, 89, 23);
		add(btndomicilio);
		
		
		
		btnAurreraPedido = new JButton("Aurrera");
		btnAurreraPedido.setBounds(254, 266, 89, 23);
		add(btnAurreraPedido);
		
		Izenak = new JComboBox();
		Izenak.setBounds(21, 76, 226, 21);
		add(Izenak);
		String[] arrayizenak = Metodoak.irakurriarray();
		for(int i = 0;i < arrayizenak.length;i++) {
			Izenak.addItem(arrayizenak[i]);
		}
		
		JLabel lbldomicilio = new JLabel("Etxera:");
		lbldomicilio.setForeground(Color.WHITE);
		lbldomicilio.setBounds(254, 217, 45, 13);
		add(lbldomicilio);
		
		spinnerKanti = new JSpinner();
		spinnerKanti.setBounds(362, 76, 30, 20);
		add(spinnerKanti);
		
		JLabel lblKanti = new JLabel("Kantitatea:");
		lblKanti.setForeground(Color.WHITE);
		lblKanti.setBounds(254, 80, 123, 13);
		add(lblKanti);
		
		JLabel lblDiruTot = new JLabel("Daramazun dirua:");
		lblDiruTot.setForeground(Color.WHITE);
		lblDiruTot.setBounds(23, 264, 106, 13);
		add(lblDiruTot);
		
		textDiruTot = new JTextField();
		textDiruTot.setBounds(139, 251, 60, 39);
		add(textDiruTot);
		textDiruTot.setColumns(10);
		
		btnAukeratu = new JButton("Aukeratu");
		btnAukeratu.setBounds(288, 116, 89, 23);
		add(btnAukeratu);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAurreraPedido.addActionListener(listenerBotonAurreraPedido(this.controladorPanelEskaera));
		this.btnExitPedido.addActionListener(listenerBotonExitPedido(this.controladorPanelEskaera));
		this.btnAukeratu.addActionListener(listenerBotonAukeratu(this.controladorPanelEskaera));
		this.btndomicilio.addActionListener(listenerBotonEtxera(this.controladorPanelEskaera));
	}
	
	private ActionListener listenerBotonAurreraPedido(ControladorPanelEskaera controladorPanelEskarera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelEskaera.accionadoBottonMostrarPanelResumen();
			}
		};
	}
	
	private ActionListener listenerBotonExitPedido(ControladorPanelEskaera controladorPanelEskarera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelEskaera.accionadoBottonExit();
				controladorPanelEskaera.arrayizenaborratu();
				controladorPanelEskaera.arrayprezioborratu();
			}
		};
	}
	
	private ActionListener listenerBotonAukeratu(ControladorPanelEskaera controladorPanelEskaera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String kanti=spinnerKanti.getValue().toString();
				String emaitza=controladorPanelEskaera.accionandoBottonEmaitzafin(kanti);
				textDiruTot.setText(emaitza);
				String izena=Izenak.getSelectedItem().toString();
				controladorPanelEskaera.accionandoBottonArray(izena);				
				}
		};
}
	private ActionListener listenerBotonEtxera(ControladorPanelEskaera controladorPanelEskaera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double prezioetxera=2.5;
				controladorPanelEskaera.accionandoBottonEtxera(prezioetxera);
				String emaitza=controladorPanelEskaera.emaitzaetxerekin();
				textDiruTot.setText(emaitza);
				String izena="Etxera";
				controladorPanelEskaera.accionandoBottonArray(izena);				
				}
		};
}
}
