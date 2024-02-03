
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
public class Authors {
    private int id;
    private String firstName;
    private String lastName;
     private String field_of_expertise;
    private String about;
    public  Authors(){
        
    }
     public Authors(int _id,String _fname,String _lname,String _expertise,String _about){
        this.id=_id;
        this.firstName=_fname;
        this.lastName=_lname;
        this.field_of_expertise=_expertise;
        this.about=_about;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setField_of_expertise(String field_of_expertise) {
        this.field_of_expertise = field_of_expertise;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getField_of_expertise() {
        return field_of_expertise;
    }

    public String getAbout() {
        return about;
    }
    MyClass.Func_Class func= new MyClass.Func_Class();
    public void addAuthors(String _fname,String _lname,String _expertise,String _about){
       String insertQuery = "INSERT INTO authors (firstname, lastname, expertise, about) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_expertise);
            ps.setString(4, _about);
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Authors added", "add Authors", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Authors not  added", "add Authors", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        } 
   
    }
            public void editAuthors(int _id,String _fname,String _lname,String _expertise,String _about){
        String editquery = "UPDATE authors SET firstname=?, lastname=?, expertise=?, about=? WHERE id=?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(editquery);
           ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_expertise);
            ps.setString(4, _about);
              ps.setInt(5, _id);
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Authors adited", "adit Authors ", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Authors  not  adited", "adit Authors ", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }
             public void removeAuthors(int _id){
        String deletequery = "DELETE FROM authors WHERE id = ?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(deletequery);
             
            ps.setInt(1, _id);
            
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Authors deleted", "delete Authors", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Authors not  deleted", "delete Authors", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }
public ArrayList<Authors> AuthorList() {
    ArrayList<Authors> alist = new ArrayList<>();
    String selectQuery = "SELECT * FROM authors"; 
    
    PreparedStatement ps;
    ResultSet rs;
    try {
        ps = DB.getConnection().prepareStatement(selectQuery);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstName = rs.getString("firstname"); // Assuming the correct column names
            String lastName = rs.getString("lastname");
            String Expertise = rs.getString("expertise");
            String about = rs.getString("about");
            
            Authors author = new Authors(id, firstName, lastName, Expertise, about);
            alist.add(author);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
    }
    return alist;
}
public Authors getAuthorsById(Integer _id) {
    ResultSet rs = func.getData("SELECT * FROM authors WHERE id=" +_id);
    Authors author = null;

    try {
        if (rs.next()) {
            author = new Authors(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("expertise"), rs.getString("about"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
    }
    return author;
}

}
