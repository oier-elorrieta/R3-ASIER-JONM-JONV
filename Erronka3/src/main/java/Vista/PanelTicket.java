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
	public JComboBox<String> Izenak;
	private JTextField textDiruTot;
	private JButton btnAukeratu;
	private JSpinner spinnerKanti;
	static Object[] array= new Object [10];
	int emaitzatot=0;


	public PanelTicket(ControladorPanelTicket controladorPanelTicket) {
		
		setBackground(Color.DARK_GRAY);
		this.controladorPanelTicket = controladorPanelTicket;
		setLayout(null);
		
		
		JLabel lblTicket = new JLabel("TICKET");
		lblTicket.setForeground(Color.WHITE);
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTicket.setBounds(207, 11, 77, 14);
		add(lblTicket);
		
		
		JLabel lbllocal = new JLabel("Produktuak");
		lbllocal.setForeground(Color.WHITE);
		lbllocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbllocal.setBounds(22, 26, 111, 14);
		add(lbllocal);
		
		btnExitTicket = new JButton("Exit");
		btnExitTicket.setBounds(356, 266, 82, 23);
		add(btnExitTicket);
		
		btnAurreraTicket = new JButton("Aurrera");
		btnAurreraTicket.setBounds(264, 266, 84, 23);
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
		lblKanti.setForeground(Color.WHITE);
		lblKanti.setBounds(264, 80, 123, 13);
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
		btnAukeratu.setBounds(297, 117, 89, 23);
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
				controladorPanelTicket.accionadoBottonMostrarPanelResumen();
				//controladorPanelTicket.accionadoBottonMostrarArrayPanelResumen(array);
			}
		};
	}
	
	private ActionListener listenerBotonExitTicket(ControladorPanelTicket controladorPanelTicket) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelTicket.accionadoBottonExit();
			}
		};
	}
	
	private ActionListener listenerBotonAukeratu(ControladorPanelTicket controladorPanelTicket) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String kanti=spinnerKanti.getValue().toString();
				Object prodizena=Izenak.getSelectedItem();
				
				String emaitzafin=controladorPanelTicket.accionandoBottonAukeratu1(kanti,emaitzatot);
				int emaitzafinint=Integer.parseInt(emaitzafin);
				emaitzatot=emaitzatot+emaitzafinint;
				String emaitza=Integer.toString(emaitzatot);
				array=controladorPanelTicket.accionandoBottonAukeratu2(prodizena,array);
				textDiruTot.setText(emaitza);
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i]);
				}
				
				}
		};
	}
}