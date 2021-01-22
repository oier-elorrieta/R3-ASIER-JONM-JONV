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
		lblTicket.setBounds(207, 11, 39, 14);
		add(lblTicket);
		
		btnExitTicket = new JButton("Exit");
		btnExitTicket.setBounds(387, 266, 51, 23);
		add(btnExitTicket);

		
		JLabel lblproducto1 = new JLabel("Coca-Cola");
		lblproducto1.setForeground(Color.WHITE);
		lblproducto1.setBounds(22, 62, 49, 14);
		add(lblproducto1);
		
		JLabel lblproducto3 = new JLabel("Esnea");
		lblproducto3.setForeground(Color.WHITE);
		lblproducto3.setBounds(22, 103, 29, 14);
		add(lblproducto3);
		
		JLabel lblproducto2 = new JLabel("Olioa");
		lblproducto2.setForeground(Color.WHITE);
		lblproducto2.setBounds(22, 152, 24, 14);
		add(lblproducto2);
		
		JLabel lblproducto4 = new JLabel("Arrautzak");
		lblproducto4.setForeground(Color.WHITE);
		lblproducto4.setBounds(22, 202, 47, 14);
		add(lblproducto4);
		
		JLabel lblproducto5 = new JLabel("Gaileta");
		lblproducto5.setForeground(Color.WHITE);
		lblproducto5.setBounds(22, 245, 33, 14);
		add(lblproducto5);
		
		JLabel lblcant1 = new JLabel("cant1");
		lblcant1.setForeground(Color.WHITE);
		lblcant1.setBounds(115, 62, 27, 14);
		add(lblcant1);
		
		JLabel lblcant2 = new JLabel("cant2");
		lblcant2.setForeground(Color.white);
		lblcant2.setBounds(115, 103, 27, 14);
		add(lblcant2);
		
		JLabel lblcant3 = new JLabel("cant3");
		lblcant3.setForeground(Color.WHITE);
		lblcant3.setBounds(115, 152, 27, 14);
		add(lblcant3);
		
		JLabel lblcant4 = new JLabel("cant4");
		lblcant4.setForeground(Color.WHITE);
		lblcant4.setBounds(115, 202, 27, 14);
		add(lblcant4);
		
		JLabel lblcant5 = new JLabel("cant5");
		lblcant5.setForeground(Color.WHITE);
		lblcant5.setBounds(115, 245, 27, 14);
		add(lblcant5);
		
		JLabel lbllocal = new JLabel("Produktuak");
		lbllocal.setForeground(Color.WHITE);
		lbllocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbllocal.setBounds(20, 37, 66, 14);
		add(lbllocal);
		
		JButton btnproducto4 = new JButton("Aukeratu");
		btnproducto4.setBounds(227, 99, 77, 23);
		add(btnproducto4);
		
		JButton btnproducto5 = new JButton("Aukeratu");
		btnproducto5.setBounds(227, 148, 77, 23);
		add(btnproducto5);
		
		JButton btnproducto3 = new JButton("Aukeratu");
		btnproducto3.setBounds(227, 198, 77, 23);
		add(btnproducto3);
		
		JButton btnproducto2 = new JButton("Aukeratu");
		btnproducto2.setBounds(227, 241, 77, 23);
		add(btnproducto2);
		
		JButton btnproducto1 = new JButton("Aukeratu");
		btnproducto1.setBounds(227, 58, 77, 23);
		add(btnproducto1);
		
		btnAurreraTicket = new JButton("Aurrera");
		btnAurreraTicket.setBounds(371, 232, 69, 23);
		add(btnAurreraTicket);
		
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