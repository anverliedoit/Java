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
                String sql = "insert into employees"
                        + "(lastname,firstname,email)"
                        + "values ('Brow','David', 'davidbrown@foo.com')";
                myStmt.executeUpdate(sql);
                System.out.println("Complete");

            }catch (Exception exc){
                exc.printStackTrace();
                System.out.println("Error");
            }
    }

}
