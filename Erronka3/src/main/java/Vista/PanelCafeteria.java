package Vista;


import java.awt.event.ActionEvent;





import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelCafeteria;
import Modelo.Metodoak;

import java.awt.Color;
import java.awt.Font;


@SuppressWarnings("serial")
public class PanelCafeteria extends JPanel {
	private JLabel lbloperatividad;
	private JButton btntickets;
	private JButton btnhornikuntza;
	private JButton btnpedido;
	private JButton btnDeslogeatu;
	private ControladorPanelCafeteria controladorPanelCafeteria;
	
	
	public PanelCafeteria(ControladorPanelCafeteria controladorPanelCafeteria) {
		this.controladorPanelCafeteria = controladorPanelCafeteria;
		
		setLayout(null);
		
		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.DARK_GRAY);
		setLayout(null);
		
		btnpedido = new JButton("Pedido");
		btnpedido.setOpaque(true);
		btnpedido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnpedido.setBorderPainted(false);
		btnpedido.setBackground(new Color(130, 130, 130));
		btnpedido.setBounds(245, 11, 178, 114);
		add(btnpedido);
		
		btnhornikuntza = new JButton("Hornikuntza");
		btnhornikuntza.setOpaque(true);
		btnhornikuntza.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnhornikuntza.setBorderPainted(false);
		btnhornikuntza.setBackground(new Color(130, 130, 130));
		btnhornikuntza.setBounds(139, 135, 178, 114);
		add(btnhornikuntza);
		
		btntickets = new JButton("Ticket");
		btntickets.setOpaque(true);
		btntickets.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btntickets.setBorderPainted(false);
		btntickets.setBackground(Color.GRAY);
		btntickets.setBounds(26, 11, 182, 114);
		add(btntickets);
		
		btnDeslogeatu = new JButton("Deslogeatu");
		btnDeslogeatu.setOpaque(true);
		btnDeslogeatu.setBorderPainted(false);
		btnDeslogeatu.setBackground(new Color(130, 130, 130));
		btnDeslogeatu.setBounds(318, 267, 122, 23);
		add(btnDeslogeatu);
		
		initializeEvents();
	}

	
	
	
	private void initializeEvents() {
		this.btntickets.addActionListener(listenerBotonticket(this.controladorPanelCafeteria));
		this.btnpedido.addActionListener(listenerBotonpedido(this.controladorPanelCafeteria));
		this.btnDeslogeatu.addActionListener(listenerBotonDeslogeatu(this.controladorPanelCafeteria));
	}
	
	private ActionListener listenerBotonticket(ControladorPanelCafeteria controladorPanelCafeteria) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelCafeteria.accionadoBottonMostrarPanelTicket();
			}
		};
	}
	
	private ActionListener listenerBotonpedido(ControladorPanelCafeteria controladorPanelCafeteria) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelCafeteria.accionadoBottonMostrarPanelEskaera();
			}
		};
	}
	
	private ActionListener listenerBotonDeslogeatu(ControladorPanelCafeteria controladorPanelCafeteria) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelCafeteria.accionadoBottonMostrarPanelNagusia();
			}
		};
	}
}
