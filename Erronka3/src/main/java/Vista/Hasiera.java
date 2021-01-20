package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Hasiera extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hasiera frame = new Hasiera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hasiera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnpedidos = new JButton("Pedidos");
		btnpedidos.setBounds(70, 62, 111, 23);
		contentPane.add(btnpedidos);
		
		JButton btncomandas = new JButton("Comandas");
		btncomandas.setBounds(221, 62, 121, 23);
		contentPane.add(btncomandas);
		
		JButton btntickets = new JButton("Tickets");
		btntickets.setBounds(70, 164, 111, 23);
		contentPane.add(btntickets);
		
		JButton btnaprovisionamiento = new JButton("Aprovisionamiento");
		btnaprovisionamiento.setBounds(221, 164, 121, 23);
		contentPane.add(btnaprovisionamiento);
		
		JLabel lbloperatividad = new JLabel("OPERATIVIDAD");
		lbloperatividad.setForeground(Color.WHITE);
		lbloperatividad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbloperatividad.setBounds(165, 11, 85, 14);
		contentPane.add(lbloperatividad);
	}

}
