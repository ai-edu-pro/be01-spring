package edu.encore.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleUserDAOImpl extends UserDAO {

	@Override
	public Connection getConnection() throws Exception {
		// oracle 관련 연결

		// 1. Driver load.....exception
		Class.forName("oracle.jdbc.OracleDriver ");

		// 2. Connection & Open
		String url = "jdbc:oracle:thin:@localhsot:port:orcl";
		String uid = "kingsmile";
		String pwd = "oracle";

		Connection conn = DriverManager.getConnection(url, uid, pwd);

		return conn;
	}

}
