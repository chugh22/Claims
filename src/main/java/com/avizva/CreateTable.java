package com.avizva;


import java.sql.*;
import java.sql.DriverManager;

public class CreateTable {

	public static void main(String[] args) {
		Connection c = null ;
		Statement s = null ;
		try{
			Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://182.75.84.118:5432/miebms?currentSchema=mibenefits","ebuser", "Avi@123");
	         System.out.println("Opened database successfully");
	         s = c.createStatement() ;
	         String sql = "" ;
	         sql = "CREATE TABLE Claims ( "
	         		+ "claimId TEXT PRIMARY KEY , "
	         		+ "product TEXT  , "
	         		+ "patientName TEXT , "
	         		+ "provide TEXT , "
	         		+ "dateOfService TEXT ,  "
	         		+ "amountBilled INT , "
	         		+ "discountAdjustment INT ,  "
	         		+ "yourResponsibility INT , "
	         		+ "ineligibleAmount INT , "
	         		+ "planPaid INT , "
	         		+ "checkNumbers TEXT , "
	         		+ "checkIssueDate TEXT ,  "
	         		+ "state TEXT , "
	         		+ "stage TEXT ) ;" ;
	         	s.executeUpdate(sql) ;

		}catch(Exception e){
			e.printStackTrace(); 
		}

	}

}
