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
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Eskaera extends JPanel {

	private ControladorPanelEskaera controladorPanelEskaera;
	private JLabel lblPedidos;
	private JButton btnAurreraPedido;
	private JButton btnExitPedido;
	private JTextField textDiruTot;
	
	public Eskaera(ControladorPanelEskaera controladorPanelEskaera) {
		this.controladorPanelEskaera = controladorPanelEskaera;
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		setLayout(null);
		
		lblPedidos = new JLabel("PEDIDOS");
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
		
		JButton btndomicilio = new JButton("BAI");
		btndomicilio.setBounds(351, 174, 89, 23);
		add(btndomicilio);
		
		
		
		btnAurreraPedido = new JButton("Aurrera");
		btnAurreraPedido.setBounds(254, 266, 89, 23);
		add(btnAurreraPedido);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(21, 76, 226, 21);
		add(comboBox);
		
		JLabel lbldomicilio = new JLabel("Etxera:");
		lbldomicilio.setForeground(Color.WHITE);
		lbldomicilio.setBounds(277, 179, 45, 13);
		add(lbldomicilio);
		
		JSpinner spinnerKanti = new JSpinner();
		spinnerKanti.setBounds(410, 122, 30, 20);
		add(spinnerKanti);
		
		JLabel lblKanti = new JLabel("Kantitatea:");
		lblKanti.setForeground(Color.WHITE);
		lblKanti.setBounds(277, 125, 123, 13);
		add(lblKanti);
		
		JLabel lblDiruTot = new JLabel("Daramazun dirua:");
		lblDiruTot.setForeground(Color.WHITE);
		lblDiruTot.setBounds(23, 264, 106, 13);
		add(lblDiruTot);
		
		textDiruTot = new JTextField();
		textDiruTot.setBounds(139, 251, 60, 39);
		add(textDiruTot);
		textDiruTot.setColumns(10);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAurreraPedido.addActionListener(listenerBotonAurreraPedido(this.controladorPanelEskaera));
		this.btnExitPedido.addActionListener(listenerBotonExitPedido(this.controladorPanelEskaera));
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
			}
		};
	}
}
