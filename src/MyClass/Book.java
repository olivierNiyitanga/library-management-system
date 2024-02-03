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
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocky
 */
public class Book {
    private Integer id;
    private String isbn;
    private String name;
    private Integer author_id;
    private Integer genre_id;
    private Integer quantity;
    private String publisher;
    private double price;
    private String date_received;
    private String description ;
    private byte[] cover;
    public Book(){
        
    }
    public Book(Integer _id,String _isbn,String _name,Integer _author_id,Integer _genre_id,Integer _quantity,String _publisher,double _price,String _date_received,String _description,byte[] _cover){
        this.id=_id;
        this.isbn=_isbn;
       this.name=_name;
       this.author_id=_author_id;
       this.genre_id=_genre_id;
       this.quantity=_quantity;
       this.publisher=_publisher;
       this.price=_price;
       this.date_received=_date_received;
       this.description=_description;
       this.cover=_cover;
       
       
    }

    public Integer getId() {
        return id;
    }
    

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate_received(String date_received) {
        this.date_received = date_received;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public String  getDate_received() {
        return date_received;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getCover() {
        return cover;
    }
    Func_Class func = new Func_Class();
    public void addBook(String _isbn,String _name,Integer _author_id,Integer _genre_id,Integer _quantity,String _publisher,double _price,String _date_received,String _description,byte[] _cover) {
        String insertQuery = "INSERT INTO books(isbn, name, author_id, genre_id, quantity, publisher, price, date_received,description, cover_image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

        try (Connection connection = DB.getConnection();
             PreparedStatement ps = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {

            // Set other parameters
            ps.setString(1, _isbn);
            ps.setString(2, _name);
            ps.setInt(3, _author_id);
            ps.setInt(4, _genre_id);
            ps.setInt(5, _quantity);
            ps.setString(6, _publisher);
            ps.setDouble(7, _price);
            ps.setDate(8, java.sql.Date.valueOf(_date_received));
            ps.setString(9, _description);
            ps.setBytes(10, _cover);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "BOOK added", "ADD BOOK", 1);
            } else {
                JOptionPane.showMessageDialog(null, "BOOK not added", "ADD BOOK", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void editBook(Integer _id,String _name,Integer _author_id,Integer _genre_id,Integer _quantity,String _publisher,double _price,String _date_received,String _description,byte[] _cover) {
           
            
           try {
    String updateQuery = "UPDATE books SET name = ?, author_id = ?, genre_id = ?, quantity = ?, publisher = ?, price = ?, date_received = ?, description = ?, cover_image = ? WHERE id = ?";
    
    try (PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery)) {
        if (_cover != null) {
            // Set parameters for the prepared statement
            ps.setString(1, _name);
            ps.setInt(2, _author_id);
            ps.setInt(3, _genre_id);
            ps.setInt(4, _quantity);
            ps.setString(5, _publisher);
            ps.setDouble(6, _price);
            ps.setDate(7, java.sql.Date.valueOf(_date_received));
            ps.setString(8, _description);
            ps.setBytes(9, _cover);
            ps.setInt(10, _id);
        } else {
            // Set parameters excluding the cover_image field
            ps.setString(1, _name);
            ps.setInt(2, _author_id);
            ps.setInt(3, _genre_id);
            ps.setInt(4, _quantity);
            ps.setString(5, _publisher);
            ps.setDouble(6, _price);
            ps.setDate(7, java.sql.Date.valueOf(_date_received));
            ps.setString(8, _description);
            ps.setBytes(9, _cover);
            ps.setInt(10, _id);
        }

        // Execute the update
        int rowsAffected = ps.executeUpdate();

        // Check the result if needed
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "BOOK edited", "EDIT BOOK", 1);
        } else {
            JOptionPane.showMessageDialog(null, "BOOK not edited", "EDIT BOOK", 2);
        }
    }
} catch (SQLException ex) {
    Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
}
    }
    
               public void removeBook(int _id){
        String deletequery = "DELETE FROM books WHERE id = ?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(deletequery);
             
            ps.setInt(1, _id);
            
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Book deleted", "delete BOOK", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Book not  deleted", "delete BOOK", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }  
    
    
    
    
  public boolean isIsbnexists(String _isbn){
      String query="select * from books where isbn='"+_isbn+ "'";
      Func_Class func=new Func_Class();
      func.getData(query);
      ResultSet rs=func.getData(query);
        try {
            if (rs.next()){
                return true;
            }
            else {
                return false; 
            } } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
         return true;
  }  
public Book searchBookById_isbn(int _id, String _isbn) {
    String query = "SELECT * FROM books WHERE id = ? ";
    Func_Class func=new Func_Class();
    ResultSet rs = func.getData(query, _id);
    Book book = null;

    try {
        if (rs.next()) {
            book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),
                    rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getBytes(11));
        } else {
            return book;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }
    return book;
}

public ArrayList<Book> booksList() {
    ArrayList<Book> blist = new ArrayList<>();
    String selectQuery = "SELECT * FROM books"; 
    
    PreparedStatement ps;
    ResultSet rs;
    try {
        ps = DB.getConnection().prepareStatement(selectQuery);
        rs = ps.executeQuery();
        
        while (rs.next()) {
          Book  book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),
                    rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getBytes(11));
            blist.add(book);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
    }
    return blist;
}
   
public Book getBookById(Integer _id) throws SQLException  {
    //Func_Class func = new Func_Class();
    String Query = "SELECT * FROM books WHERE id = ?";
    ResultSet rs=func.getData(Query,_id);

   
        if (rs.next()) {
             
           return new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),
                    rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getBytes(11)); 
            
        }
        else{
            return null;
}     
}

public void displayBooksCovers(JLabel[] labels_tab)
{
 

    try {
        Statement st = DB.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select cover_image from  books order by id desc LIMIT 5");
        
        int i=0;
        while (rs.next()) {
            byte[] coverImage = rs.getBytes("cover_image");
            func.displayImage(labels_tab[i].getWidth(),labels_tab[i].getHeight(), coverImage, name, labels_tab[i]);
            i++;
        }

    } catch (SQLException ex) {
       Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }

    
  
}

public void setQuantity_Minus_One(int _book_id,int _quantity){
          
           try {
    String updateQuantityQuery = "UPDATE books SET  quantity = ? WHERE id = ?";
    
    try (PreparedStatement ps = DB.getConnection().prepareStatement(updateQuantityQuery )) {
      
            // Set parameters for the prepared statement
            
            ps.setInt(1, _quantity);
             ps.setInt(2, _book_id);
       
      

        
        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "This book is set Lost->Quantity = Quantity -1", "EDIT BOOK QUANTITY", 1);
        } else {
            JOptionPane.showMessageDialog(null, "BOOK QUANTITY not edited", "EDIT BOOK QUANTITY", 2);
        }
    }
} catch (SQLException ex) {
    Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
}
    }
    
}



