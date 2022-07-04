package com;
import java.util.Scanner;
import java.sql.*;

public class Demo8{
	public static void main(String[]args)
	{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","Password123");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+ ": "+rsgetString(2)+": "rs.getInt(3)+" : "+rs.getInt(4)+" : "rs.getString(5));
		}
	}
	catch (Exception e){
	System.out.prinln(e);
	}
	}
}