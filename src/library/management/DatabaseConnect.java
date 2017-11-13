/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.sql.*;

public class DatabaseConnect {

    public static Connection connect(){    
        Connection conn = null;
        try {    
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymgt","root","");
            
            }catch(Exception ex){
                System.out.println(ex);
            }
            return conn;
    }
    
}
