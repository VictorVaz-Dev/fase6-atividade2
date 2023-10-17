package dao;

import java.sql.Connection;
import dao.DataSource;

public class TesteCon {
	
	DataSource datasource = new DataSource();
	private Connection con;
	
			//teste conexão
	
	private void status() {
		try {
			con = datasource.conectar();
			if (con == null) {
				System.out.println("erro de conexao");
			} else {
				System.out.println("conectado com sucesso");
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
