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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.postgresql.jdbc.PgResultSet;

/**
 *
 * @author Rocky
 */
public class Genre {
    private int id;
    private String name;
    
    public Genre(){};
    public Genre(int _id,String _name){
        this.id= _id;
        this.name= _name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public void setName(String name) {
        this.name = name;
    }
     MyClass.Func_Class func= new MyClass.Func_Class();
    public void addGenre(String _name){
        String insertquery = "INSERT INTO book_genres(name)VALUES ( ?)";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(insertquery);
            ps.setString(1,_name);
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Genre added", "add genre", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Genre not  added", "add genre", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }
    
        public void aditGenre(int _id,String _name){
        String editquery = "UPDATE book_Genres SET name = ? WHERE id = ?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(editquery);
             ps.setString(1, _name);
            ps.setInt(2, _id);
            
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Genre adited", "adit genre", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Genre not  adited", "adit genre", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }
                public void removeGenre(int _id){
        String deletequery = "DELETE FROM book_Genres WHERE id = ?";
        try {
            PreparedStatement ps =DB.getConnection().prepareStatement(deletequery);
             
            ps.setInt(1, _id);
            
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Genre deleted", "delete genre", 1);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Genre not  deleted", "delete genre", 2);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
     
    }
    

public ArrayList<Genre> genreList() {
    ArrayList<Genre> glist = new ArrayList<>();
    String selectQuery = "SELECT id, name FROM book_Genres"; // Adjust the query to select only required columns
    
    PreparedStatement ps;
    ResultSet rs;
    try {
        ps = DB.getConnection().prepareStatement(selectQuery);
        rs = ps.executeQuery();
        Genre genre;
        while (rs.next()) {
            int id = rs.getInt("id");
            String genreName = rs.getString("name"); // Assuming the column name is 'name'
            genre = new Genre(id, genreName);
            glist.add(genre);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
    }
    return glist;
}
public HashMap<String ,Integer>getGenresMap(){
    HashMap<String ,Integer>map=new HashMap<>();
    String selectQuery = "SELECT id, name FROM book_Genres"; // Adjust the query to select only required columns
    
    PreparedStatement ps;
    ResultSet rs;
    try {
        ps = DB.getConnection().prepareStatement(selectQuery);
        rs = ps.executeQuery();
        Genre genre;
        while (rs.next()) {
            int id = rs.getInt("id");
            String genreName = rs.getString("name"); // Assuming the column name is 'name'
            genre = new Genre(id, genreName);
            map.put(genre.getName(), genre.getId());
        }
    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
    }
    return map;
}

public Genre getGenresById(Integer _id) {
    ResultSet rs = func.getData("SELECT * FROM book_Genres WHERE id=" +_id);
    Genre genre = null;

    try {
        if (rs.next()) {
            genre = new Genre(rs.getInt("id"), rs.getString("Name"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
    }
    return genre;
}
    
}
