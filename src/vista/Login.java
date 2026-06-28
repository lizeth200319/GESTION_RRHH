package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.ConexionSQL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasenia;

	/**
	 * Launch the application.
	 */
	ConexionSQL con = new ConexionSQL();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 352);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenidos!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(62, 54, 126, 23);
		contentPane.add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(45, 131, 154, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JButton btnImgresar = new JButton("INGRESAR");
		
		btnImgresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnImgresar.setBounds(57, 235, 106, 23);
		contentPane.add(btnImgresar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Usuario");
		lblNewLabel_1_1.setBounds(45, 105, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contraseña");
		lblNewLabel_1_2.setBounds(45, 162, 69, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtContrasenia = new JPasswordField();
		txtContrasenia.setEchoChar('*');
		txtContrasenia.setBounds(45, 187, 154, 20);
		contentPane.add(txtContrasenia);
		//metodos del login
		btnImgresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user=txtUsuario.getText();
				char[] contrasenia = txtContrasenia.getPassword();

				String password = new String(contrasenia);
		
				if(user.equals("") && password.equals("")) {
					MenuPrincipal menu= new MenuPrincipal();
					dispose();
					con.getConexion();
					menu.setVisible(true);
				}
			}
		});
	}
}
