package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentTest {
	
	@Autowired
		private JdbcTemplate jdbctemplate;
	
	public void createtable() {
		
		System.out.println("Helo shri done yaar...");
		
		String query = "CREATE TABLE CUSTOMERS(\r\n"
				+ "   ID   INT              NOT NULL,\r\n"
				+ "   NAME VARCHAR (20)     NOT NULL,\r\n"
				+ "   AGE  INT              NOT NULL,\r\n"
				+ "   ADDRESS  CHAR (25) ,\r\n"
				+ "   SALARY   DECIMAL (18, 2),       \r\n"
				+ "   PRIMARY KEY (ID)\r\n"
				+ ");";
					 
		int update =this.jdbctemplate.update(query);
		System.out.println("result == " + update);
		
		
	}
	
	
	public void insertdata() {
		
		System.out.println("Helo shri done yaar...");
		
		String query = "INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)\r\n"
				+ "VALUES (5, 'Shri', 32, 'Ahmedabad', 2000.00 );\r\n"
				+ "\r\n"
				+ "INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)\r\n"
				+ "VALUES (6, 'umesh', 25, 'Delhi', 1500.00 );\r\n"
				+ "\r\n"
				+ "INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)\r\n"
				+ "VALUES (7, 'dabbu', 23, 'Kota', 2000.00 );\r\n"
				+ "\r\n"
				+ "INSERT INTO CUSTOMERS (ID,NAME,AGE,ADDRESS,SALARY)\r\n"
				+ "VALUES (8, 'Chaitali', 25, 'Mumbai', 6500.00 ); ";
					 
		int update =this.jdbctemplate.update(query);
		System.out.println("result == " + update);
		
		
	}
	
	
public void update() {
		
		System.out.println("Helo shri done yaar...");
		
		String query = "UPDATE CUSTOMERS\r\n"
				+ "SET ADDRESS = 'Pune'\r\n"
				+ "WHERE ID = 6;";
					 
		int update =this.jdbctemplate.update(query);
		System.out.println("result == " + update);
		
		
	}


 
}
