
package MyClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rocky
 */
public class Member {
    private int id;
    private String firstName;
    private String lastName;
     private String phone;
    private String email;
    private String gender;
    private byte[]picture;
    public  Member(){
        
    }
     public Member(int _id,String _fname,String _lname,String _phone,String _email,String _gender,byte[] _picture){
        this.id=_id;
        this.firstName=_fname;
        this.lastName=_lname;
        this.phone=_phone;
        this.email=_email;
        this.gender=_gender;
        this.picture=_picture;
        
    }

    public int getId() {
        return id;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getPicture() {
        return picture;
    }
  public void addMember(String _fname, String _lname, String _phone, String _email, String _gender, byte[] _picture) {
        String insertQuery = "INSERT INTO members(firstname, lastname, phone, email, gender, picture) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DB.getConnection();
             PreparedStatement ps = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {

            // Set other parameters
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _picture);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member added", "Member Authors", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member not added", "Member Authors", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

           public void editMember(int _id,String _fname,String _lname,String _phone,String _email,String _gender,byte[]_picture){
        String editquery = "UPDATE members SET  firstname=?, lastname=?, phone=?, email=?, gender=?, picture=? WHERE id=?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(editquery);
             ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _picture);
              ps.setInt(7, _id);
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Member adited", "EDITED Member ", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Member  not  adited", "NO EDITED Member", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }
public Member getMemberById(Integer _id) throws SQLException  {
    Func_Class func = new Func_Class();
    String Query = "SELECT * FROM members WHERE id = ?";
    ResultSet rs=func.getData(Query,_id);

   
        if (rs.next()) {
             
           return new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBytes(0b111)); 
            
        }
        else{
            return null;
}     
}
            
             public void removeMember(int _id){
        String deletequery = "DELETE FROM members WHERE id = ?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(deletequery);
             
            ps.setInt(1, _id);
            
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Member deleted", "delete Member", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Member not  deleted", "Member genre", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }       
public ArrayList<Member> memberList() {
    ArrayList<Member> mlist = new ArrayList<>();
    String selectQuery = "SELECT id, firstname, lastname, phone, email, gender, picture FROM members"; 

    PreparedStatement ps;
    ResultSet rs;
    try {
        ps = DB.getConnection().prepareStatement(selectQuery);
        rs = ps.executeQuery();
        Member member;
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstName = rs.getString("firstname");
            String lastName = rs.getString("lastname");
            String phone = rs.getString("phone");
            String email = rs.getString("email");
            String gender = rs.getString("gender");
            byte[] picture = rs.getBytes("picture"); // Corrected to byte[]

            // Create a new Member object and set the retrieved data
            member = new Member();
            member.setId(id);
            member.setFirstName(firstName);
            member.setLastName(lastName);
            member.setPhone(phone);
            member.setEmail(email);
            member.setGender(gender);
            member.setPicture(picture);

            // Add the Member object to the list
            mlist.add(member);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
    }
    return mlist;
}


//these err
private List<Member> searchMembersByName(List<Member> members, String nameToSearch) {
    List<Member> searchResults = new ArrayList<>();
    
    for (Member member : members) {
        String fullName = member.getFirstName().toLowerCase() + " " + member.getLastName().toLowerCase();
        if (fullName.contains(nameToSearch)) {
            searchResults.add(member);
        }
    }
    
    return searchResults;
}




//err
}
