package com.csi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo4 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/jdbc2";
	String username="root";
	String password="system";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement ps=con.prepareStatement("delete from Employee where id=?");
	ps.setInt(1, 107);
int i=	ps.executeUpdate();
System.out.println(i+" "+"record deleted successfully");
con.close();
}
}
