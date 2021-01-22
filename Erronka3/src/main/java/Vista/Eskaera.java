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

@SuppressWarnings("serial")
public class Eskaera extends JPanel {

	private ControladorPanelEskaera controladorPanelEskaera;
	private JLabel lblPedidos;
	private JButton btnAurreraPedido;
	private JButton btnExitPedido;
	
	public Eskaera(ControladorPanelEskaera controladorPanelEskaera) {
		this.controladorPanelEskaera = controladorPanelEskaera;
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		setLayout(null);
		
		lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setBounds(134, 28, 61, 14);
		lblPedidos.setForeground(Color.WHITE);
		lblPedidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblPedidos);
		
		btnExitPedido = new JButton("Exit");
		btnExitPedido.setBounds(351, 266, 89, 23);
		add(btnExitPedido);

		
		JLabel lblproducto1 = new JLabel("Coca-Cola");
		lblproducto1.setBounds(51, 87, 61, 14);
		lblproducto1.setForeground(Color.WHITE);
		add(lblproducto1);
		
		JLabel lblproducto3 = new JLabel("Esnea");
		lblproducto3.setBounds(51, 197, 61, 14);
		lblproducto3.setForeground(Color.WHITE);
		add(lblproducto3);
		
		JLabel lblproducto2 = new JLabel("Olioa");
		lblproducto2.setBounds(51, 139, 61, 14);
		lblproducto2.setForeground(Color.WHITE);
		add(lblproducto2);
		
		JLabel lblproducto4 = new JLabel("Arrautzak");
		lblproducto4.setBounds(51, 249, 61, 14);
		lblproducto4.setForeground(Color.WHITE);
		add(lblproducto4);
		
		JLabel lblproducto5 = new JLabel("Gaileta");
		lblproducto5.setBounds(51, 275, 61, 14);
		lblproducto5.setForeground(Color.WHITE);
		add(lblproducto5);
		
		JLabel lblcant1 = new JLabel("cant1");
		lblcant1.setBounds(153, 87, 61, 14);
		lblcant1.setForeground(Color.WHITE);
		add(lblcant1);
		
		JLabel lblcant2 = new JLabel("cant2");
		lblcant2.setBounds(153, 139, 61, 14);
		lblcant2.setForeground(Color.WHITE);
		add(lblcant2);
		
		JLabel lblcant3 = new JLabel("cant3");
		lblcant3.setBounds(153, 197, 61, 14);
		lblcant3.setForeground(Color.WHITE);
		add(lblcant3);
		
		JLabel lblcant4 = new JLabel("cant4");
		lblcant4.setBounds(153, 249, 61, 14);
		lblcant4.setForeground(Color.WHITE);
		add(lblcant4);
		
		JLabel lblcant5 = new JLabel("cant5");
		lblcant5.setBounds(153, 275, 61, 14);
		lblcant5.setForeground(Color.WHITE);
		add(lblcant5);
		
		JLabel lbltipo = new JLabel("domicilio");
		lbltipo.setBounds(373, 87, 52, 14);
		lbltipo.setForeground(Color.WHITE);
		add(lbltipo);
		
		JLabel lbllocal = new JLabel("Produktuak");
		lbllocal.setBounds(23, 52, 89, 14);
		lbllocal.setForeground(Color.WHITE);
		lbllocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lbllocal);
		
		JButton btndomicilio = new JButton("BAI");
		btndomicilio.setBounds(351, 118, 89, 23);
		add(btndomicilio);
		
		JButton btnproducto4 = new JButton("Aukeratu");
		btnproducto4.setBounds(224, 245, 89, 23);
		add(btnproducto4);
	
		JButton btnproducto5 = new JButton("Aukeratu");
		btnproducto5.setBounds(234, 271, 89, 23);
		add(btnproducto5);
	
		JButton btnproducto3 = new JButton("Aukeratu");
		btnproducto3.setBounds(224, 193, 89, 23);
		add(btnproducto3);
		
		JButton btnproducto2 = new JButton("Aukeratu");
		btnproducto2.setBounds(224, 135, 89, 23);
		add(btnproducto2);
		
		JButton btnproducto1 = new JButton("Aukeratu");
		btnproducto1.setBounds(224, 83, 89, 23);
		add(btnproducto1);
		
		btnAurreraPedido = new JButton("Aurrera");
		btnAurreraPedido.setBounds(351, 230, 89, 23);
		add(btnAurreraPedido);
		
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
