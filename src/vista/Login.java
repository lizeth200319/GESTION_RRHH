package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.ConexionSQL;
import Datos.ControladorSeguridad;
import controlador.UsuarioControlador;
import modelo.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasenia;

	/**
	 * Launch the application.
	 */
	ConexionSQL con = new ConexionSQL();
	UsuarioControlador userController = new UsuarioControlador();
	// ControladorSeguridad seguridad = new ControladorSeguridad();

	Usuario PR_TA_USUA;

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
		btnImgresar.setForeground(new Color(255, 255, 240));
		btnImgresar.setContentAreaFilled(false);
		btnImgresar.setOpaque(true);
		btnImgresar.setBackground(new Color(0, 0, 128));

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

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBounds(57, 269, 106, 23);
		btnSalir.setBackground(new Color(0, 0, 128));
		btnSalir.setContentAreaFilled(false);
		btnSalir.setOpaque(true);
		contentPane.add(btnSalir);

		// metodos del login
		btnImgresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String user = txtUsuario.getText();
				char[] contrasenia = txtContrasenia.getPassword();
				String password = new String(contrasenia);

				// String passHash= seguridad.hashearPassword(password);

				if (user.equals("") || password == "") {
					JOptionPane.showMessageDialog(null, "Tiene que completar los campos");
					return;
				}

				PR_TA_USUA = userController.validarUsuario(user, password);

				if (PR_TA_USUA != null) {
					System.out.print(PR_TA_USUA.getUsuario());
					MenuPrincipal menu = new MenuPrincipal();
					menu.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error de Autenticación",
							JOptionPane.ERROR_MESSAGE);
					txtUsuario.setText("");
					txtContrasenia.setText("");

				}
			}
		});
	}
}
