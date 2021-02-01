package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Controlador.ControladorPanelEskaera;
import Controlador.ControladorPanelResumen;
import javax.swing.JTextField;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PanelResumen extends JPanel {

	private ControladorPanelResumen controladorPanelResumen;
	private JLabel lblLaburpena;
	private JButton btnexitResum;
	private JButton btnResumen;
	private JLabel lblResumen;
	
	public PanelResumen(ControladorPanelResumen controladorPanelResumen) {
		this.controladorPanelResumen = controladorPanelResumen;
		setBackground(Color.DARK_GRAY);
		
		setLayout(null);
		setLayout(null);
		
		lblLaburpena = new JLabel("LABURPENA");
		lblLaburpena.setBounds(181, 30, 106, 14);
		lblLaburpena.setForeground(Color.WHITE);
		lblLaburpena.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblLaburpena);
		
		btnexitResum = new JButton("Exit");
		btnexitResum.setBounds(351, 266, 89, 23);
		add(btnexitResum);
		
		btnResumen = new JButton("Resumen");
		btnResumen.setBounds(26, 27, 106, 21);
		add(btnResumen);
		
		lblResumen = new JLabel("New label");
		lblResumen.setForeground(Color.WHITE);
		lblResumen.setBounds(26, 68, 400, 188);
		add(lblResumen);
		
		JLabel lblNewLabel_1 = new JLabel("----------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(26, 43, 400, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("----------------------------------------------------------------------------------------------------");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(26, 55, 400, 14);
		add(lblNewLabel_1_1);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnexitResum.addActionListener(listenerBotonExitResumen(this.controladorPanelResumen));
		this.btnResumen.addActionListener(listenerBotonResumen(this.controladorPanelResumen));
	}
	
	private ActionListener listenerBotonExitResumen(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelResumen.accionadoBottonExit();
			}
		};
	}
	
	private ActionListener listenerBotonResumen(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[]array=PanelTicket.array;
				String[] arrayresumen = controladorPanelResumen.accionadoBottonResumen(array);//aurrera botoian jarri metodo hau
				for(int i=0;i<arrayresumen.length;i++) {
					//lblResumen.add(arrayresumen[i]);
				}
			}
		};
	}
}
