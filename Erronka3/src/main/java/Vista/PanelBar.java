package Vista;


import java.awt.event.ActionEvent;



import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelBar;
import Modelo.Metodoak;

import java.awt.Color;
import java.awt.Font;


@SuppressWarnings("serial")
public class PanelBar extends JPanel {
	
	private JButton btnpedido;
	private JButton btntickets;
	private JLabel lbloperatividad;
	private JButton btnDeslogeatu;
	private ControladorPanelBar controladorPanelBar;
	
	
	public PanelBar(ControladorPanelBar controladorPanelBar) {
		this.controladorPanelBar = controladorPanelBar;
		
		setLayout(null);
		
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		setLayout(null);
		
		btntickets = new JButton("Ticket");
		btntickets.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btntickets.setBackground(Color.WHITE);
		btntickets.setBounds(28, 11, 182, 114);
		add(btntickets);
		
		btnpedido = new JButton("Pedido");
		btnpedido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnpedido.setBounds(245, 11, 178, 114);
		add(btnpedido);
		
		btnDeslogeatu = new JButton("Deslogeatu");
		btnDeslogeatu.setBounds(301, 266, 122, 23);
		add(btnDeslogeatu);
		
		//initializeEvents();
	}

	
	
	
	/*private void initializeEvents() {
		this.btntickets.addActionListener(listenerBotonticket(this.controladorPanelBar));
		this.btnpedido.addActionListener(listenerBotonpedido(this.controladorPanelBar));
		this.btnDeslogeatu.addActionListener(listenerBotonDeslogeatu(this.controladorPanelBar));
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
	
	private ActionListener listenerBotonDeslogeatu(ControladorPanelHasiera controladorPanelHasiera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelHasiera.accionadoBottonMostrarPanelNagusia();
			}
		};
	}*/
}
