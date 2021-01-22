package Vista;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelHasiera;
import java.awt.Color;


@SuppressWarnings("serial")
public class Hasiera extends JPanel {
	
	private JButton btnpedido;
	private JButton btncomandas;
	private JButton btntickets;
	private JButton btnaprovisionamiento;
	private JLabel lbloperatividad;
	private ControladorPanelHasiera controladorPanelHasiera;
	private JLabel lblAukerak;
	
	public Hasiera(ControladorPanelHasiera controladorPanelHasiera) {
		this.controladorPanelHasiera = controladorPanelHasiera;
		
		setLayout(null);
		
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		setLayout(null);
		
		btntickets = new JButton("Ticket");
		btntickets.setBounds(87, 84, 89, 23);
		add(btntickets);
		
		btnpedido = new JButton("Pedido");
		btnpedido.setBounds(262, 84, 89, 23);
		add(btnpedido);
		
		btncomandas = new JButton("Comandas");
		btncomandas.setBounds(87, 196, 89, 23);
		add(btncomandas);
		
		btnaprovisionamiento = new JButton("Aprovisionamientos");
		btnaprovisionamiento.setBounds(262, 196, 125, 23);
		add(btnaprovisionamiento);
		
		lblAukerak = new JLabel("Aukeratu");
		lblAukerak.setForeground(Color.WHITE);
		lblAukerak.setBackground(Color.WHITE);
		lblAukerak.setBounds(196, 22, 46, 14);
		add(lblAukerak);
		
		initializeEvents();
	}

	
	
	
	private void initializeEvents() {
		this.btntickets.addActionListener(listenerBotonticket(this.controladorPanelHasiera));
		this.btnpedido.addActionListener(listenerBotonpedido(this.controladorPanelHasiera));
	}
	
	private ActionListener listenerBotonticket(ControladorPanelHasiera controladorPanelHasiera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelHasiera.accionadoBottonMostrarPanelTicket();
			}
		};
	}
	
	private ActionListener listenerBotonpedido(ControladorPanelHasiera controladorPanelHasiera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelHasiera.accionadoBottonMostrarPanelEskaera();
			}
		};
	}

}
