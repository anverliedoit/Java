package jdbc;

import java.sql.*;
public class jdbc {
    public static void main(String[] args){
            try{
                // 1. Get a connection to database
                System.out.println("Connecting...");
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
                // 2. Create a statement
                Statement myStmt = myConn.createStatement();
                // 3. Execute SQL query
                ResultSet myRs = myStmt.executeQuery("select * from employees");
                //4. Process the result set
           while(myRs.next()){
               System.out.println(myRs.getString("lastname") + "," + myRs.getString("firstname"));
                }

            }catch (Exception exc){
                exc.printStackTrace();
                System.out.println("Error");
            }
    }

}
