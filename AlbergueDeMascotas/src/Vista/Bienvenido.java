package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.DataUsuario;
import Modelo.Usuario;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Bienvenido extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TXTUsuario;
	private JTextField TXTIdUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenido frame = new Bienvenido();
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
	public Bienvenido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 329, 374);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 11, 293, 313);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setBounds(69, 222, 65, 14);
		panel.add(lblNewLabel);
		
		TXTUsuario = new JTextField();
		TXTUsuario.setBounds(144, 220, 86, 20);
		panel.add(TXTUsuario);
		TXTUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblContrasea.setBounds(55, 253, 76, 14);
		panel.add(lblContrasea);
		
		JLabel lblAlbergueDeMascotas = new JLabel("Albergue De Mascotas");
		lblAlbergueDeMascotas.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblAlbergueDeMascotas.setBounds(45, 0, 193, 29);
		panel.add(lblAlbergueDeMascotas);
		
		JButton btnEntrarMenu = new JButton("Entrar");
		btnEntrarMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guardar();
				Menu m=new Menu();
				m.setVisible(true);
				Bienvenido.this.dispose();
			}
		});
		btnEntrarMenu.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnEntrarMenu.setBounds(45, 278, 89, 23);
		panel.add(btnEntrarMenu);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(102, 205, 170));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Vanessa\\Downloads\\Icono.png"));
		lblNewLabel_1.setBounds(45, 27, 183, 156);
		panel.add(lblNewLabel_1);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnSalir.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnSalir.setBounds(141, 279, 89, 23);
		panel.add(btnSalir);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblId.setBounds(69, 196, 65, 14);
		panel.add(lblId);
		
		TXTIdUsuario = new JTextField();
		TXTIdUsuario.setColumns(10);
		TXTIdUsuario.setBounds(144, 194, 86, 20);
		panel.add(TXTIdUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 251, 86, 20);
		panel.add(passwordField);
	}
	public boolean Guardar() {
		DataUsuario du=new DataUsuario();
		int idUsuario=Integer.parseInt(TXTIdUsuario.getText());
		String Usuario=TXTUsuario.getText();
		boolean Contraseña=passwordField.getText() != null;
		Usuario usu=new Usuario(idUsuario,Usuario,Contraseña);
		return du.Guardar(usu);
		
	}
}
