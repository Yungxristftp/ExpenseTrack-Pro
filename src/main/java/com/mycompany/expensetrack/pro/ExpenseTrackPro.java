
package com.mycompany.expensetrack.pro;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rashid Williams
 */
public class ExpenseTrackPro {
   

    public static void main(String[] args) throws SQLException {
        
        
try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            try {

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExpenseTrackPro","root","Football_7");
                
                 System.out.println(con);
                 String Query="select * from Users";
                 Statement st=con.createStatement();
                 ResultSet rs=st.executeQuery(Query);
                 
                 while(rs.next())
                    {
                      String UserID=rs.getString("UserID");
                      System.out.format("%s",UserID);
                    }
                 st.closeOnCompletion();
                 con.close();

            } catch (SQLException ex) {

                Logger.getLogger(ExpenseTrackPro.class.getName()).log(Level.SEVERE, null, ex);

            }

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(ExpenseTrackPro.class.getName()).log(Level.SEVERE, null, ex);

        }
     
    }
}
