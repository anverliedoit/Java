package jdbc;

import java.sql.*;
public class jdbc {
    public static void main(String[] args){
            try{
                // 1. Get a connection to database
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
                // 2. Create a statement
                Statement myStmt = myConn.createStatement();
                // 3. Execute SQL query
                String sql = "update employees "
                        + "set email= 'demo@luv2code.com'"
                        +"where id = 3";
                myStmt.executeUpdate(sql);
                System.out.println("Upodate Complete");

            }catch (Exception exc){
                exc.printStackTrace();
                System.out.println("Error");
            }
    }

}
