package jdbc;

import java.sql.*;
public class jdbc {
    public static void main(String[] args){

                String database = "jdbc:mysql://localhost:3306/demo";
                String username = "root";
                String password = "";
            try{

                // 1. Get a connection to database
                Connection myConn = DriverManager.getConnection(database,username,password);
                // 2. Create a statement
                Statement myStmt = myConn.createStatement();
                // 3. Execute SQL query
                String sql = "delete from employees where lastname = 'Manuel'";

                int rowAffected = myStmt.executeUpdate(sql);

                System.out.println("Rows affected :" + rowAffected);
                System.out.println("Delete Complete");

            }catch (Exception exc){
                exc.printStackTrace();
                System.out.println("Error");
            }
    }

}
