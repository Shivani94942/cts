package com.mycompany.booking.airbooking.fp;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

public class App {
	static Logger logger = Logger.getLogger("com.mycompany.jdbcdemo2.App");

	public static void main(String[] args) throws SQLException {
		Properties properties = new Properties();
		properties.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/hr");
		properties.setProperty("jdbc.user", "root");
		properties.setProperty("jdbc.password", "welcome");
		logger.info("started.");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "welcome");
		logger.info("sucess");
		DatabaseMetaData mData=connection.getMetaData();
		ResultSet rs=mData.getTables(null, null, "CUSTOMER", null);
		if(rs.next())
		{
			System.out.println("table exists");
		}
		else
		{
			System.out.println("not exists");
		}
		StringBuffer buffer=new StringBuffer();
		buffer.append(mData.getDatabaseProductName());
		buffer.append(mData.getDatabaseProductVersion());
		buffer.append(mData.getDriverName());
		buffer.append(mData.getURL());
		buffer.append(mData.getUserName());
		System.out.println(buffer.toString());
		Statement statement=connection.createStatement();
		rs=statement.executeQuery("select * from customer");
		ResultSetMetaData rmData=rs.getMetaData();
		System.out.println(rmData.getColumnCount());
		System.out.println(rmData.getColumnName(3));
		System.out.println(rmData.isAutoIncrement(1));;
	}
}