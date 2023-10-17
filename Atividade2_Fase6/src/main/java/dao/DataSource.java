package dao;

import java.sql.Connection;
import java.sql.DriverManager;



public class DataSource {
	

		private Connection con;
		private String driver = "com.mysql.cj.jdbc.Driver";
		private String url = "jdbc:mysql://localhost:3306/atividade2_fase6";
		private String username = "root";
		private String password = "$Fe26leo14$";
				
		public Connection conectar (){
			try {
				Class.forName(driver);				
				con = DriverManager.getConnection(url,username,password);
				return con; 
				
			} catch(Exception e) { 
				System.out.println(e);
				return null;
			}
		}
}


