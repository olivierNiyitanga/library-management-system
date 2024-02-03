/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClass;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.ds.PGSimpleDataSource;

/**
 *
 * @author Rocky
 */
public class DB {
 private static String serverName = "localhost";
 private static String user = "postgres";
   private static String dbName = "Library_system"; 
   private static Integer portNumber =5432; 
   private  static String pass;
   public static Connection getConnection(){
       Connection con = null;
       PGSimpleDataSource dataSource = new PGSimpleDataSource();
       dataSource.setUser(user);
        dataSource.setPassword(pass);
        dataSource.setServerName(serverName);
        dataSource.setDatabaseName(dbName);
     try {
         con = dataSource.getConnection();
     } catch (SQLException ex) {
         Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
     }
        return con;
   }
    
    
}
