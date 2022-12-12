package misBilletes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import util.Database;

/**
 * Clase main desde dónde se ejecutará toda la aplicación
 * 
 * @author mabel
 *
 */
public class Main {

	private static final long serialVersionUID = -6552335381124566727L;
	private JFrame frame;

	/**
	 * Lanza la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crear la aplicación
	 */
	public Main() {
		initialize();
	}

	/**
	 * Inicializar los contenidos del frame
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Lanzador de prueba");
		frame.setBounds(0, 0, 800, 482);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		// Inicializar la base de datos
		JButton btnInicializarBaseDeDatos = new JButton("Inicializar Base de Datos en Blanco");
		btnInicializarBaseDeDatos.setBounds(200, 300, 200, 20);
		btnInicializarBaseDeDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database db = new Database();
				db.createDatabase(false);
			}
		});
		frame.getContentPane().add(btnInicializarBaseDeDatos);

	}

	public JFrame getFrame() {
		return this.frame;
	}

}
