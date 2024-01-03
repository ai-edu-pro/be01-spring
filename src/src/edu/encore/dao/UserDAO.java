package edu.encore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import edu.encore.model.UserVO;

public abstract class UserDAO { // 추상클래스 - controller

	// DB 연결 관련 메소드
	public abstract Connection getConnection() throws Exception; // 추상메소드

	// 3. 사용(DML 명령어)
	// insert
	public void insert(UserVO vo) throws Exception {
		Connection conn = getConnection();
		String sql = "INSERT INTO USERS(ID, NAME, PASSWORD) VALUES(?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getName());
		pstmt.setString(3, vo.getPassword());

		int result = pstmt.executeUpdate();
		System.out.println(result + " 개 입력 성공!!!");
		conn.commit();

		pstmt.close();
		conn.close();
	} // end insert()

	// selectAll - 구현하기
	public void selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM USERS");

			System.out.println("\nID \t  Name \t   PWD");
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String pwd = rs.getString("password");
				System.out.println(id + "\t" + name + "\t" + pwd);
			} // while end

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // try end
	} // end selectAll()

	// selectById

	// update
	public void update() throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection conn = getConnection();
		String sql = "UPDATE USERS SET name = ?, password= ? WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println("수정 할 id를 입력하시오");
		pstmt.setString(3, sc.next());
		System.out.println("바뀔 name을 작성하시오");
		pstmt.setString(1, sc.next());
		System.out.println("바뀔 password을 작성하시오");
		pstmt.setString(2, sc.next());
		
		pstmt.executeUpdate();
		conn.commit();
		
		pstmt.close();		conn.close();	
	}

	// delete
	public void delete(UserVO vo) throws Exception {
		Connection conn = getConnection();

		String sql = "DELETE From users WHERE id =? ;";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());

		int result = pstmt.executeUpdate();
		System.out.println(result + " 객체 데이터 삭제 성공함");
		
		conn.commit();
		
		pstmt.close();		conn.close();
	}

	// menu
	public void menu() {
		System.out.println("선택하세요: \n1.Insert ");
		System.out.println("2.SelectAll \n3.SelectById \n4.Update \n5.Delete ");
	}
}
