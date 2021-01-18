package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;

@SuppressWarnings("serial")
public class PanelTicket extends JPanel {
	private JTextField textField;
	private JLabel lblPeziotot;
	private JComboBox comboBox;
	private JButton btnTickAmaitu;
	
	public PanelTicket()
	{
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(294, 124, 86, 51);
		add(textField);
		textField.setColumns(10);
		
		lblPeziotot = new JLabel("Daramazun prezioa");
		lblPeziotot.setBounds(294, 83, 99, 30);
		add(lblPeziotot);
		
		comboBox = new JComboBox();
		comboBox.setBounds(41, 91, 209, 22);
		add(comboBox);
		
		btnTickAmaitu = new JButton("Amaitu");
		btnTickAmaitu.setBounds(294, 242, 89, 23);
		add(btnTickAmaitu);
		
		
		//initializeEvents();
	}
}