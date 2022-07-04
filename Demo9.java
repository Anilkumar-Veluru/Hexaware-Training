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
		PreparedStatement Statement stmt=con.PrepareStatement("update emp set salary=?, where id=?");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Employee Id :");
		int id=sc.nextInt();
		
		System.out.print("Enter Employee Salary :");
		int sal=sc.nextInt();
		
		stmt.setInt(1, salary);
		stmt.setInt(2,id);
		
		stmt.execute();
		con.close();
		System.out.prinln("Data updated");
		}
		catch (Exception e)
		{
		System.out.prinln(e);
		}
		}
		
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+ ": "+rsgetString(2)+": "rs.getInt(3)+" : "+rs.getInt(4)+" : "rs.getString(5));
		}
	}
	catch (Exception e){
	System.out.prinln(e);
	}

}