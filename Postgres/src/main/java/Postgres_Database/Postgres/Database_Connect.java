package Postgres_Database.Postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Database_Connect {

	@Test
	public static void main( String[] args ) throws SQLException
    {
        Connection db = DriverManager.getConnection("jdbc:postgresql://hausgsgpa0138c/dvdrental", "postgres","postgres");
        Statement st = db.createStatement();
        System.out.println("am here ");
        ResultSet rs = st.executeQuery("Select * from dvdrental.public.actor where last_name ='Neeson'");
       
       while (rs.next())
        {
    	   System.out.println(rs.getString(1));	
        }
        rs.close();
        st.close();
    }

}
