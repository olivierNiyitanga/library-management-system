/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocky
 */
public class Issue_Book {
    private int book_id;
   private int member_id;
   private String status;
    private String issue_date;
   private String Return_date;
   private String note;
  

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public void setReturn_date(String Return_date) {
        this.Return_date = Return_date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getBook_id() {
        return book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public String getStatus() {
        return status;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public String getReturn_date() {
        return Return_date;
    }

    public String getNote() {
        return note;
    }

    public Book getBook() {
        return book;
    }
    public Issue_Book(){
        
    }
    public Issue_Book(int _book_id, int _member_id, String _status, String _issue_date, String _return_date, String _note){
        this.book_id=_book_id;
        this.member_id=_member_id;
        this.status=_status;
        this.issue_date=_issue_date;
        this.Return_date=_return_date;
        this.note=_note;
    }
    Func_Class func =new Func_Class();
    Book book=new Book();
public void addIssue(int _book_id, int _member_id, String _status, String _issue_date, String _return_date, String _note) {
    String insertquery = "INSERT INTO issue_book(book_id, member_id, status, issue_date, return_date, note) VALUES (?, ?, ?, ?, ?, ?)";
    try (Connection connection = DB.getConnection();
         PreparedStatement ps = connection.prepareStatement(insertquery, Statement.RETURN_GENERATED_KEYS)) {

        // Set other parameters
        ps.setInt(1, _book_id);
        ps.setInt(2, _member_id);
        ps.setString(3, _status);

        // Convert _issue_date to java.sql.Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date issueDate = new Date(dateFormat.parse(_issue_date).getTime());
        Date returnDate = new Date(dateFormat.parse(_return_date).getTime());
        ps.setDate(4, issueDate);

        ps.setDate(5, returnDate);
        ps.setString(6, _note);

        if (ps.executeUpdate() != 0) {
            JOptionPane.showMessageDialog(null, "ISSUE added", "ADD ISSUE", 1);
        } else {
            JOptionPane.showMessageDialog(null, "ISSUE not added", " NOT ADDED ISSUE", 2);
        }
    } catch (SQLException | ParseException ex) {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }
}



public void UpdateIssue(int _book_id, int _member_id, String _status,String _issue_date, String _return_date, String _note) {
    String updatequery = "update issue_book set status=?,return_date=?,note=? where book_id=? and member_id=? and issue_date=?";
    try (Connection connection = DB.getConnection();
         PreparedStatement ps = connection.prepareStatement(updatequery, Statement.RETURN_GENERATED_KEYS)) {

        // Set other parameters
     
        ps.setString(1, _status);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date returnDate = new Date(dateFormat.parse(_return_date).getTime());
        ps.setDate(2, returnDate);
        ps.setString(3, _note);
        // Convert _issue_date to java.sql.Date
        ps.setInt(4, _book_id);
        ps.setInt(5, _member_id);
        Date issueDate = new Date(dateFormat.parse(_issue_date).getTime());
        
        ps.setDate(6, issueDate);
        if (ps.executeUpdate() != 0) {
            JOptionPane.showMessageDialog(null, "Status updated", "BOOK ISSUE", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Status not updated", " BOOK ISSUE", 2);
        }
    } catch (SQLException | ParseException ex) {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public boolean checkBookAvailable(int _book_id) {
    boolean availability = false;
    try {
        Book selectedBook = book.getBookById(_book_id); 
        int quantity = selectedBook.getQuantity();
        int issueBookCount = countData(_book_id); 

        if (quantity > issueBookCount) {
            availability = true;
        } else {
            availability = false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }

    return availability;
}


public int countData(int _book_id ) {
    int total = 0;

    try {
        PreparedStatement st = DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM issue_book where book_id=? and status='issued' ");
        st.setInt(1, _book_id);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            total = rs.getInt("total");
        }

    } catch (SQLException ex) {
       Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }

    return total;
}


public ArrayList<Issue_Book> IssuedbooksList(String _status) {
    ArrayList<Issue_Book> issuedBookblist = new ArrayList<>();
    String serchQuery; 
    
    PreparedStatement ps;
    ResultSet rs;
    if (_status.equals("")){
        serchQuery = "SELECT * FROM issue_book ";
    }else{
       serchQuery="SELECT * FROM issue_book WHERE status = '" + _status + "'"; 
    }

    try {
      rs=func.getData(serchQuery);
         Issue_Book isbook ;
        while (rs.next()) {
           isbook  = new Issue_Book(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                  
            issuedBookblist.add(isbook);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }
    return issuedBookblist;
}
public void removeFromIssuedDateTable(int _book_id, int _member_id, String _issue_date) {
    String deleteQuery = "DELETE FROM issue_book WHERE book_id = ? AND member_id = ? AND issue_date = ?";
    
    try {
        // Assuming _issue_date is in "YYYY-MM-DD" format
        java.sql.Date sqlDate = java.sql.Date.valueOf(_issue_date);
        
        try (PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery)) {
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setDate(3, sqlDate);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected != 0) {
                JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete Book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Deletion Not Successful", "Delete Book", 2);
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}
