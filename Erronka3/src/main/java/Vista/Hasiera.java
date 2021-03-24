package Vista;


import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControladorPanelHasiera;
import Modelo.Metodoak;
import Modelo.Usuario;

import java.awt.Color;
import java.awt.Font;


@SuppressWarnings("serial")
public class Hasiera extends JPanel {
	
	private JButton btnpedido;
	private JButton btncomandas;
	private JButton btntickets;
	private JButton btnhornikuntza;
	private JLabel lbloperatividad;
	private JButton btnDeslogeatu;
	private ControladorPanelHasiera controladorPanelHasiera;
	private JTextField lbldata;
	private int anyo;
	private int mes;
	private int dia;
	Calendar fecha = new GregorianCalendar();
	
	
	public Hasiera(ControladorPanelHasiera controladorPanelHasiera) {
		this.controladorPanelHasiera = controladorPanelHasiera;

		setLayout(null);
		
		anyo = fecha.get(Calendar.YEAR);
		mes = fecha.get(Calendar.MONTH);
		dia = fecha.get(Calendar.DAY_OF_MONTH);

		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.DARK_GRAY);
		setLayout(null);

		btntickets = new JButton("Ticket");
		btntickets.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btntickets.setBackground(Color.WHITE);
		btntickets.setBounds(28, 11, 182, 114);
		btntickets.setBackground(new java.awt.Color(130, 130, 130));
		btntickets.setOpaque(true);
		btntickets.setBorderPainted(false);
		add(btntickets);

		btnpedido = new JButton("Pedido");
		btnpedido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnpedido.setBounds(245, 11, 178, 114);
		btnpedido.setBackground(new java.awt.Color(130, 130, 130));
		btnpedido.setOpaque(true);
		btnpedido.setBorderPainted(false);
		add(btnpedido);

		btncomandas = new JButton("Comandas");
		btncomandas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btncomandas.setBounds(28, 136, 182, 114);
		btncomandas.setBackground(new java.awt.Color(130, 130, 130));
		btncomandas.setOpaque(true);
		btncomandas.setBorderPainted(false);
		add(btncomandas);

		btnhornikuntza = new JButton("Hornikuntza");
		btnhornikuntza.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnhornikuntza.setBounds(245, 136, 178, 114);
		btnhornikuntza.setBackground(new java.awt.Color(130, 130, 130));
		btnhornikuntza.setOpaque(true);
		btnhornikuntza.setBorderPainted(false);
		add(btnhornikuntza);

		btnDeslogeatu = new JButton("Deslogeatu");
		btnDeslogeatu.setBounds(301, 266, 122, 23);
		btnDeslogeatu.setBackground(new java.awt.Color(130, 130, 130));
		btnDeslogeatu.setOpaque(true);
		btnDeslogeatu.setBorderPainted(false);
		add(btnDeslogeatu);
		
		lbldata  = new JTextField(dia + "/" + (mes + 1) + "/" + anyo); 
		lbldata.setBounds(28, 275, 82, 14);
		add(lbldata);

		initializeEvents();
		}

	
	
	
	private void initializeEvents() {
		this.btntickets.addActionListener(listenerBotonticket(this.controladorPanelHasiera));
		this.btnpedido.addActionListener(listenerBotonpedido(this.controladorPanelHasiera));
		this.btnhornikuntza.addActionListener(listenerBotonhornikuntza(this.controladorPanelHasiera));
		this.btncomandas.addActionListener(listenerBotonkomanda(this.controladorPanelHasiera));
		this.btnDeslogeatu.addActionListener(listenerBotonDeslogeatu(this.controladorPanelHasiera));
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
	
	private ActionListener listenerBotonhornikuntza(ControladorPanelHasiera controladorPanelHasiera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelHasiera.accionadoBottonMostrarPanelhornikuntza();
			}
		};
	}
	
	private ActionListener listenerBotonkomanda(ControladorPanelHasiera controladorPanelHasiera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelHasiera.accionadoBottonMostrarPanelkomanda();
			}
		};
	}
	
	private ActionListener listenerBotonDeslogeatu(ControladorPanelHasiera controladorPanelHasiera) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelHasiera.accionadoBottonMostrarPanelNagusia();
			}
		};
	}
}
