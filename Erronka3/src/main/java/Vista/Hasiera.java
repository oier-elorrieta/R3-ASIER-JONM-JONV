package Vista;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelHasiera;
import Modelo.Metodoak;

import java.awt.Color;
import java.awt.Font;


@SuppressWarnings("serial")
public class Hasiera extends JPanel {
	
	private JButton btnpedido;
	private JButton btncomandas;
	private JButton btntickets;
	private JButton btnaprovisionamiento;
	private JLabel lbloperatividad;
	private ControladorPanelHasiera controladorPanelHasiera;
	
	
	public Hasiera(ControladorPanelHasiera controladorPanelHasiera) {
		this.controladorPanelHasiera = controladorPanelHasiera;
		
		setLayout(null);
		
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		setLayout(null);
		
		btntickets = new JButton("Ticket");
		btntickets.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btntickets.setBackground(Color.WHITE);
		btntickets.setBounds(28, 30, 182, 114);
		add(btntickets);
		
		btnpedido = new JButton("Pedido");
		btnpedido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnpedido.setBounds(245, 30, 178, 114);
		add(btnpedido);
		
		btncomandas = new JButton("Comandas");
		btncomandas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btncomandas.setBounds(28, 175, 182, 114);
		add(btncomandas);
		
		btnaprovisionamiento = new JButton("Aprovisionamientos");
		btnaprovisionamiento.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnaprovisionamiento.setBounds(245, 175, 178, 114);
		add(btnaprovisionamiento);
		
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
