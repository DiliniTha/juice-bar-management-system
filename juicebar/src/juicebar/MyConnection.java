/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juicebar;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dilini
 */
class MyConnection {
    public static Connection getConnection() throws SQLException{

    Connection con=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/juicebar/registration","root","");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println(ex.getMessage());
    }
    
return con;
}}
