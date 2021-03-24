package Vista;


import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;




import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControladorPanelBar;
import Modelo.Metodoak;

import java.awt.Color;
import java.awt.Font;


@SuppressWarnings("serial")
public class PanelBar extends JPanel {
	private JLabel lbloperatividad;
	private JButton btnhornikuntza;
	private JButton btntickets;
	private JButton btnDeslogeatu;
	private ControladorPanelBar controladorPanelBar;
	private JTextField lbldata;
	private int anyo;
	private int mes;
	private int dia;
	Calendar fecha = new GregorianCalendar();
	
	
	public PanelBar(ControladorPanelBar controladorPanelBar) {
		this.controladorPanelBar = controladorPanelBar;
		
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		
		anyo = fecha.get(Calendar.YEAR);
		mes = fecha.get(Calendar.MONTH);
		dia = fecha.get(Calendar.DAY_OF_MONTH);
		
		btnhornikuntza = new JButton("Hornikuntza");
		btnhornikuntza.setOpaque(true);
		btnhornikuntza.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnhornikuntza.setBorderPainted(false);
		btnhornikuntza.setBackground(new Color(130, 130, 130));
		btnhornikuntza.setBounds(145, 135, 178, 114);
		add(btnhornikuntza);
		
		btntickets = new JButton("Ticket");
		btntickets.setOpaque(true);
		btntickets.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btntickets.setBorderPainted(false);
		btntickets.setBackground(Color.GRAY);
		btntickets.setBounds(141, 11, 182, 114);
		add(btntickets);
		
		btnDeslogeatu = new JButton("Deslogeatu");
		btnDeslogeatu.setOpaque(true);
		btnDeslogeatu.setBorderPainted(false);
		btnDeslogeatu.setBackground(new Color(130, 130, 130));
		btnDeslogeatu.setBounds(318, 267, 122, 23);
		add(btnDeslogeatu);
		
		lbldata  = new JTextField(dia + "/" + (mes + 1) + "/" + anyo); 
		lbldata.setBounds(26, 271, 82, 14);
		add(lbldata);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btntickets.addActionListener(listenerBotonticket(this.controladorPanelBar));
		this.btnDeslogeatu.addActionListener(listenerBotonDeslogeatu(this.controladorPanelBar));
	}
	
	private ActionListener listenerBotonticket(ControladorPanelBar controladorPanelBar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelBar.accionadoBottonMostrarPanelTicket();
			}
		};
	}
	
	private ActionListener listenerBotonDeslogeatu(ControladorPanelBar controladorPanelBar) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelBar.accionadoBottonMostrarPanelNagusia();
			}
		};
	}
}
