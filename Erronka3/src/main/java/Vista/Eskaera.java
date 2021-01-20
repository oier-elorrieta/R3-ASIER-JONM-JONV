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

public class Eskaera extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eskaera frame = new Eskaera();
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
	public Eskaera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 509);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPedidos = new JLabel("PEDIDOS");
		lblPedidos.setForeground(Color.WHITE);
		lblPedidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPedidos.setBounds(134, 28, 61, 14);
		contentPane.add(lblPedidos);
		
		JButton btndeslog = new JButton("Exit");
		btndeslog.setBounds(240, 436, 89, 23);
		contentPane.add(btndeslog);
		
		JLabel lblNtran = new JLabel("83247523h");
		lblNtran.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNtran.setForeground(Color.WHITE);
		lblNtran.setBounds(23, 58, 89, 14);
		contentPane.add(lblNtran);
		
		JLabel lblfecha = new JLabel("18/01/2021");
		lblfecha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblfecha.setForeground(Color.WHITE);
		lblfecha.setBounds(240, 11, 86, 14);
		contentPane.add(lblfecha);

		
		JLabel lblproducto1 = new JLabel("producto1");
		lblproducto1.setForeground(Color.WHITE);
		lblproducto1.setBounds(51, 125, 61, 14);
		contentPane.add(lblproducto1);
		
		JLabel lblproducto3 = new JLabel("producto3");
		lblproducto3.setForeground(Color.WHITE);
		lblproducto3.setBounds(51, 175, 61, 14);
		contentPane.add(lblproducto3);
		
		JLabel lblproducto6 = new JLabel("producto6");
		lblproducto6.setForeground(Color.WHITE);
		lblproducto6.setBounds(51, 250, 61, 14);
		contentPane.add(lblproducto6);
		
		JLabel lblproducto7 = new JLabel("producto7");
		lblproducto7.setForeground(Color.WHITE);
		lblproducto7.setBounds(51, 275, 61, 14);
		contentPane.add(lblproducto7);
		
		JLabel lblproducto2 = new JLabel("producto2");
		lblproducto2.setForeground(Color.WHITE);
		lblproducto2.setBounds(51, 150, 61, 14);
		contentPane.add(lblproducto2);
		
		JLabel lblproducto4 = new JLabel("producto4");
		lblproducto4.setForeground(Color.WHITE);
		lblproducto4.setBounds(51, 200, 61, 14);
		contentPane.add(lblproducto4);
		
		JLabel lblproducto5 = new JLabel("producto5");
		lblproducto5.setForeground(Color.WHITE);
		lblproducto5.setBounds(51, 225, 61, 14);
		contentPane.add(lblproducto5);
		
		JLabel lblproducto8 = new JLabel("producto8");
		lblproducto8.setForeground(Color.WHITE);
		lblproducto8.setBounds(51, 300, 61, 14);
		contentPane.add(lblproducto8);
		
		JLabel lblproducto9 = new JLabel("producto9");
		lblproducto9.setForeground(Color.WHITE);
		lblproducto9.setBounds(51, 325, 61, 14);
		contentPane.add(lblproducto9);
		
		JLabel lblproducto10 = new JLabel("producto10");
		lblproducto10.setForeground(Color.WHITE);
		lblproducto10.setBounds(51, 350, 61, 14);
		contentPane.add(lblproducto10);
		
		JLabel lblcant1 = new JLabel("cant1");
		lblcant1.setForeground(Color.WHITE);
		lblcant1.setBounds(153, 125, 61, 14);
		contentPane.add(lblcant1);
		
		JLabel lblcant2 = new JLabel("cant2");
		lblcant2.setForeground(Color.WHITE);
		lblcant2.setBounds(153, 150, 61, 14);
		contentPane.add(lblcant2);
		
		JLabel lblcant3 = new JLabel("cant3");
		lblcant3.setForeground(Color.WHITE);
		lblcant3.setBounds(153, 175, 61, 14);
		contentPane.add(lblcant3);
		
		JLabel lblcant4 = new JLabel("cant4");
		lblcant4.setForeground(Color.WHITE);
		lblcant4.setBounds(153, 200, 61, 14);
		contentPane.add(lblcant4);
		
		JLabel lblcant5 = new JLabel("cant5");
		lblcant5.setForeground(Color.WHITE);
		lblcant5.setBounds(153, 225, 61, 14);
		contentPane.add(lblcant5);
		
		JLabel lblcant6 = new JLabel("cant6");
		lblcant6.setForeground(Color.WHITE);
		lblcant6.setBounds(153, 250, 61, 14);
		contentPane.add(lblcant6);
		
		JLabel lblcant7 = new JLabel("cant7");
		lblcant7.setForeground(Color.WHITE);
		lblcant7.setBounds(153, 275, 61, 14);
		contentPane.add(lblcant7);
		
		JLabel lblcant8 = new JLabel("cant8");
		lblcant8.setForeground(Color.WHITE);
		lblcant8.setBounds(153, 300, 61, 14);
		contentPane.add(lblcant8);
		
		JLabel lblcant9 = new JLabel("cant9");
		lblcant9.setForeground(Color.WHITE);
		lblcant9.setBounds(153, 325, 61, 14);
		contentPane.add(lblcant9);
		
		JLabel lblCant10 = new JLabel("cant10");
		lblCant10.setForeground(Color.WHITE);
		lblCant10.setBounds(153, 350, 61, 14);
		contentPane.add(lblCant10);
		
		JLabel lbltipo = new JLabel("recoger o domicilio");
		lbltipo.setForeground(Color.WHITE);
		lbltipo.setBounds(81, 392, 99, 14);
		contentPane.add(lbltipo);
		
		JLabel lbllocal = new JLabel("Lokala");
		lbllocal.setForeground(Color.WHITE);
		lbllocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbllocal.setBounds(23, 83, 46, 14);
		contentPane.add(lbllocal);
	}
}
