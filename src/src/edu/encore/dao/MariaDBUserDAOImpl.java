package edu.encore.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariaDBUserDAOImpl extends UserDAO {

	@Override
	public Connection getConnection() throws Exception {
		// mariadb 관련 연결
		//1. Driver load.....exception
		Class.forName("org.mariadb.jdbc.Driver");
		
		//2. Connection & Open
					// driver://IP:portNumber/DBName
		String url="jdbc:mariadb://127.0.0.1:3306/sampledb";
		String uid = "root";
		String pwd ="maria";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
//		System.out.println("driver load & connection success!!!");
		
		return conn;
	}

}
