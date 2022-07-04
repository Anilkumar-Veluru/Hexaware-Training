package com;
import java.util.Scanner;
import java.sql.*;

public class Demo{
	public static void main(String[]args)
	{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employ","root","Password123");
		PreparedStatement Statement stmt=con.PrepareStatement("delete from emp where id=?");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Employee Id :");
		int id=sc.nextInt();
		
		stmt.setInt(1, id);
		System.ou.prinln("do you really want to delete ? yes / no");
		String ch = sc.next();
		if(ch.equalsIgnoreCase("yes"))
		{
		stmt.execute();
		System.out.prinln("Data deleted");
		}
		else
		{
		System.out.prinln("Not deleted");
		}
		con.close();
	}	
}