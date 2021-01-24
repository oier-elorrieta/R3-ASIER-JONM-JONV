package Vista;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.ControladorPanelHasiera;
import Controlador.ControladorPanelTicket;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

@SuppressWarnings("serial")
public class PanelTicket extends JPanel {

	private ControladorPanelTicket controladorPanelTicket;
	private JButton btnExitTicket;
	private JButton btnAurreraTicket;

	public PanelTicket(ControladorPanelTicket controladorPanelTicket) {
		
		setBackground(Color.DARK_GRAY);
		this.controladorPanelTicket = controladorPanelTicket;
		setLayout(null);
		
		
		JLabel lblTicket = new JLabel("TICKET");
		lblTicket.setForeground(Color.WHITE);
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTicket.setBounds(207, 11, 77, 14);
		add(lblTicket);
		
		JLabel lblproducto1 = new JLabel("Coca-Cola");
		lblproducto1.setForeground(Color.WHITE);
		lblproducto1.setBounds(22, 50, 83, 14);
		add(lblproducto1);
		
		JLabel lblproducto3 = new JLabel("Esnea");
		lblproducto3.setForeground(Color.WHITE);
		lblproducto3.setBounds(235, 50, 83, 14);
		add(lblproducto3);
		
		JLabel lblproducto2 = new JLabel("Olioa");
		lblproducto2.setForeground(Color.WHITE);
		lblproducto2.setBounds(22, 92, 83, 14);
		add(lblproducto2);
		
		JLabel lblproducto4 = new JLabel("Arrautzak");
		lblproducto4.setForeground(Color.WHITE);
		lblproducto4.setBounds(235, 92, 83, 14);
		add(lblproducto4);
		
		JLabel lblproducto5 = new JLabel("Gaileta");
		lblproducto5.setForeground(Color.WHITE);
		lblproducto5.setBounds(22, 138, 83, 14);
		add(lblproducto5);
		
		JLabel lbllocal = new JLabel("Produktuak");
		lbllocal.setForeground(Color.WHITE);
		lbllocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbllocal.setBounds(22, 26, 111, 14);
		add(lbllocal);
		
		JButton btnproducto4 = new JButton("Aukeratu");
		btnproducto4.setBounds(327, 46, 102, 23);
		add(btnproducto4);
		
		JButton btnproducto5 = new JButton("Aukeratu");
		btnproducto5.setBounds(123, 88, 102, 23);
		add(btnproducto5);
		
		JButton btnproducto3 = new JButton("Aukeratu");
		btnproducto3.setBounds(327, 88, 102, 23);
		add(btnproducto3);
		
		JButton btnproducto2 = new JButton("Aukeratu");
		btnproducto2.setBounds(123, 134, 102, 23);
		add(btnproducto2);
		
		JButton btnproducto1 = new JButton("Aukeratu");
		btnproducto1.setBounds(123, 46, 102, 23);
		add(btnproducto1);
		
		btnExitTicket = new JButton("Exit");
		btnExitTicket.setBounds(356, 266, 82, 23);
		add(btnExitTicket);
		
		btnAurreraTicket = new JButton("Aurrera");
		btnAurreraTicket.setBounds(264, 266, 84, 23);
		add(btnAurreraTicket);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(83, 48, 30, 20);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(83, 90, 30, 20);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(83, 136, 30, 20);
		add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(288, 48, 30, 20);
		add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(288, 90, 30, 20);
		add(spinner_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(235, 139, 45, 13);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(22, 185, 45, 13);
		add(lblNewLabel_1);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(288, 136, 30, 20);
		add(spinner_5);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(327, 138, 102, 21);
		add(btnNewButton);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(83, 182, 30, 20);
		add(spinner_6);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(123, 181, 85, 21);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(235, 185, 45, 13);
		add(lblNewLabel_2);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(288, 182, 30, 20);
		add(spinner_7);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(327, 181, 85, 21);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(22, 227, 45, 13);
		add(lblNewLabel_3);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(83, 224, 30, 20);
		add(spinner_8);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(123, 223, 85, 21);
		add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(235, 227, 45, 13);
		add(lblNewLabel_4);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(288, 224, 30, 20);
		add(spinner_9);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(327, 223, 85, 21);
		add(btnNewButton_4);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnAurreraTicket.addActionListener(listenerBotonAurreraTicket(this.controladorPanelTicket));
		this.btnExitTicket.addActionListener(listenerBotonExitTicket(this.controladorPanelTicket));
	}
	
	private ActionListener listenerBotonAurreraTicket(ControladorPanelTicket controladorPanelTicket) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelTicket.accionadoBottonMostrarPanelResumen();
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
}