package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 53, 804, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Configuraciones");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_2 = new JMenu("Configuraciòn 1");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_1 = new JMenu("Empleados");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		menuBar.add(mnNewMenu_3);
		
		Panel panel = new Panel();
		panel.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(0, 0, 784, 47);
		contentPane.add(panel);
		
		Label label = new Label("Bienvenidos al Sistema!");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(null);
		panel.add(label);
		setLocationRelativeTo(null);
		setTitle("Menù Principal");
		JOptionPane.showMessageDialog(null, "¡Bienvenidos!");
	}
}
