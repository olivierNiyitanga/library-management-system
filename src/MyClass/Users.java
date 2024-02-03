/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClass;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocky
 */
public class Users {
   private int id;
   private String firstname;
   private String lastname;
   private String username;
   private String password;
   private  String userType;

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
     public String getUserType() {
        return userType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
      public void setUserType(String userType) {
        this.userType = userType;
    }

    public Users() {
    }

    public Users(int _id, String _firstname, String _lastname, String _username, String _password,String _userType) {
        this.id = _id;
        this.firstname = _firstname;
        this.lastname = _lastname;
        this.username = _username;
        this.password = _password;
        this.userType=_userType;
    }
  
    MyClass.Func_Class func= new MyClass.Func_Class();
    public void addUsers(String _fname,String _lname,String _username,String _password,String _user_type){
       String insertQuery = "INSERT INTO users_table (firstname, lastname, username, password,user_type) VALUES (?, ?, ?, ?,?) ";

        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_username);
            ps.setString(4, _password);
            ps.setString(5, _user_type);
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "User added", "add User", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "User not  added", "add User", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        } 
   
    }
    
    public boolean checkUsernameExists(int _id,String _username) {
    ResultSet rs = func.getData("SELECT * FROM users_table WHERE username= '" +_username +"' and id<>"+_id);
    boolean Exists=false;

    try {
        if (rs.next()) {
            Exists=true;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
    }
    return Exists;
}
   
    public void editUsers(int _id,String _fname,String _lname,String _username,String _password,String _user_type){
        String editquery = "UPDATE users_table SET firstname=?, lastname=?, username=?, password=?,user_type=? WHERE id=?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(editquery);
           ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_username);
            ps.setString(4, _password);
            ps.setString(5, _user_type);
              ps.setInt(6, _id);
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "User adited", "Edit User ", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "User  not  adited", "Edit User ", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }
    
    
      public void removeUsers(int _id){
        String deletequery = "DELETE FROM users_table WHERE id = ?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(deletequery);
             
            ps.setInt(1, _id);
            
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "User deleted", "delete User", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "User not  deleted", "delete User", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }
    
    
    public ArrayList<Users> UsersList() {
    ArrayList<Users> ulist = new ArrayList<>();
    String selectQuery = "SELECT * FROM users_table where user_type<>'owner'"; 
    
    PreparedStatement ps;
    ResultSet rs;
    try {
        ps = DB.getConnection().prepareStatement(selectQuery);
        rs = ps.executeQuery();
        Users user;
        while (rs.next()) {
         user = new Users(rs.getInt("id"),rs.getString("firstname"), rs.getString("lastname"),rs.getString("username"), 
                    rs.getString("password"),rs.getString("user_type"));
            ulist.add(user);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
    }
    return ulist;
}
  
    
 public Users trylogin(String _username,String _password){
   
     
    ResultSet rs = func.getData("SELECT * FROM users_table WHERE username='" +_username +"'and password='" +_password+"'");
    Users users = null;

    try {
        if (rs.next()) {
            users = new Users(rs.getInt("id"),rs.getString("firstname"), rs.getString("lastname"),rs.getString("username"), 
                    rs.getString("password"),rs.getString("user_type"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     
     
     return users;
 }
}
