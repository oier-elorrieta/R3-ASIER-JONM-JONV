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
	private JTextField textpreziotot;
	private JLabel lblresumen;
	
	public PanelResumen(ControladorPanelResumen controladorPanelResumen) {
		this.controladorPanelResumen = controladorPanelResumen;
		setBackground(Color.LIGHT_GRAY);

		setLayout(null);
		

		lblLaburpena = new JLabel("LABURPENA");
		lblLaburpena.setBounds(181, 30, 106, 14);
		lblLaburpena.setForeground(Color.BLACK);
		lblLaburpena.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblLaburpena);

		btnexitResum = new JButton("Exit");
		btnexitResum.setBounds(351, 266, 89, 23);
		btnexitResum.setBackground(new java.awt.Color(130, 130, 130));
		btnexitResum.setOpaque(true);
		btnexitResum.setBorderPainted(false);
		add(btnexitResum);

		btnResumen = new JButton("Resumen");
		btnResumen.setBounds(26, 27, 106, 21);
		btnResumen.setBackground(new java.awt.Color(130, 130, 130));
		btnResumen.setOpaque(true);
		btnResumen.setBorderPainted(false);
		add(btnResumen);

		JLabel lbllinea_1 = new JLabel("----------------------------------------------------------------------------------------------------");
		lbllinea_1.setForeground(Color.BLACK);
		lbllinea_1.setBounds(26, 43, 400, 14);
		add(lbllinea_1);

		JLabel lblline_2 = new JLabel("----------------------------------------------------------------------------------------------------");
		lblline_2.setForeground(Color.BLACK);
		lblline_2.setBounds(26, 55, 400, 14);
		add(lblline_2);

		JLabel lblpreziotot = new JLabel("Prezio totala");
		lblpreziotot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpreziotot.setForeground(Color.BLACK);
		lblpreziotot.setBounds(36, 247, 111, 14);
		add(lblpreziotot);

		textpreziotot = new JTextField();
		textpreziotot.setBounds(340, 244, 86, 20);
		add(textpreziotot);
		textpreziotot.setColumns(10);

		lblresumen = new JLabel("");
		lblresumen.setForeground(Color.WHITE);
		lblresumen.setBounds(26, 81, 400, 155);
		add(lblresumen);

		JLabel lblline_2_1 = new JLabel("----------------------------------------------------------------------------------------------------");
		lblline_2_1.setForeground(Color.BLACK);
		lblline_2_1.setBounds(26, 225, 400, 14);
		add(lblline_2_1);

		initializeEvents();
		}
	
	private void initializeEvents() {
		this.btnexitResum.addActionListener(listenerBotonExitResumen(this.controladorPanelResumen));
		this.btnResumen.addActionListener(listenerBotonResumen(this.controladorPanelResumen));
	}
	
	private ActionListener listenerBotonExitResumen(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Tipolocal=controladorPanelResumen.Tipolocalateraparametrogabe();
				if(Tipolocal.equals("Bar")) {
					controladorPanelResumen.accionadoBar();
				}if(Tipolocal.equals("Restaurante")) {
					controladorPanelResumen.accionadoBottonExit();
				}if(Tipolocal.equals("Cafeteria")) {
					controladorPanelResumen.accionadoCafeteria();
				}
				
				controladorPanelResumen.arrayizenaborratu();
				controladorPanelResumen.arrayprezioborratu();
				controladorPanelResumen.kantitateaarrayezabatu();
			}
		};
	}
	
	private ActionListener listenerBotonResumen(ControladorPanelResumen controladorPanelResumen) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String resumen = controladorPanelResumen.accionadoBottonResumen();
				lblresumen.setText(resumen);
				String emaitza=controladorPanelResumen.preziofinbistaratu();
				textpreziotot.setText(emaitza);
			}
		};
	}
}
