
package com.mycompany.expensetrack.pro;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 * @author Rashid Williams
 */
public class ExpenseTrackPro {
    
    private static final Logger logger = LogManager.getLogger(ExpenseTrackPro.class);
   
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
                      logger.info("Print Out Successful");
                    }
                 st.closeOnCompletion();
                 con.close();

            } catch (SQLException ex) {

                logger.warn("Sql Failed");

            }

        } catch (ClassNotFoundException ex) {

            logger.warn("Sql Failed");

        }
     
    }
}
