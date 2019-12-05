package com.csi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseDemo2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","system");
	PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
	ps.setInt(1,700 );
	ps.setString(2, "Ajay");
	ps.setString(3, "EVS");
	
int i=ps.executeUpdate();

System.out.println(i+" record inserted");
con.close();
}
}
