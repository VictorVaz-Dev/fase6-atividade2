package view;

import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.DataSource;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CadastroUsuario extends JFrame {
	
	DataSource datasource = new DataSource();
	private Connection con;
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuario frame = new CadastroUsuario();
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
	public CadastroUsuario() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				status();
			}
		});
		setTitle("Cadastro Usuário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}
	
	private void status() {
		try {
			con = datasource.conectar();
			if (con == null) {
				System.out.println("Erro de Conexão!");
			} else {
				System.out.println("Banco de Dados Conectado!");
				con.close();
			}
		}catch (Exception e) {
			System.out.println(e);
			
			
						
		}
	
		
	}

}
