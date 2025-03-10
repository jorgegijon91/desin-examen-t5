package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textApellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(29, 31, 70, 24);
		frame.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(137, 34, 96, 19);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(30, 96, 69, 19);
		frame.getContentPane().add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(137, 96, 144, 19);
		frame.getContentPane().add(textApellidos);
		textApellidos.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Mensaje de confirmación
				String msg = "Nombre: " + textNombre.getText() + "\nApellidos: " + textApellidos.getText();
				JOptionPane.showMessageDialog(null, msg);
			}
			
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAceptar.setBounds(109, 173, 137, 33);
		frame.getContentPane().add(btnAceptar);
	}
}
