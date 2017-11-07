/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmyshow;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */

public class connection {
    Connection con;
    Statement st=null;
    ResultSet rs=null;
    
    public void connect()throws ClassNotFoundException
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      String servername="localhost";
      String portnumber="1521";
      String sid="orcl";
      String username="system";
      String password="Lulz1234";
      
        try {
         String url="jdbc:oracle:thin:@"+servername+":"+portnumber+":"+sid;
            con=DriverManager.getConnection(url,username, password);
            st=con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     System.out.println("ok");
    }
    
   /* public ResultSet search(String q) throws SQLException
    {
    st=con.createStatement();
    rs=st.executeQuery(q);
    return(rs); 
    
}*/
    public void insert(String q) throws SQLException
    {
        st=con.createStatement();
        st.executeUpdate(q);
        
    }
}