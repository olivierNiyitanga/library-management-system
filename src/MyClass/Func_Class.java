/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClass;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rocky
 */
public class Func_Class {
    public void displayImage(int width, int height, byte[] imageByte, String imagePath, JLabel label) {
      
            ImageIcon imgIcon;

            if (imageByte != null) {
                imgIcon= new ImageIcon(imageByte);
            }  
            else {
                
                try{
                  imgIcon= new ImageIcon(getClass().getResource(imagePath));  
                }
               catch (Exception e){
                imgIcon= new ImageIcon(imagePath);     
               }
            }

            Image image = imgIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(image));
        
        }
    
    public String selectImage(){
                JFileChooser fileChooser= new JFileChooser();
        fileChooser.setDialogTitle("select profile picture");
        fileChooser.setCurrentDirectory(new File("C:\\images"));
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("image",".PNG",".JPG","JPEG");
        fileChooser.addChoosableFileFilter(extensionFilter);
        int filestate=fileChooser.showSaveDialog(null);
        String path="";
        if (filestate == JFileChooser.APPROVE_OPTION){
           path=fileChooser.getSelectedFile().getAbsolutePath();
           
        }
       return path; 
    }
public ResultSet getData(String query, Object... params) {
    PreparedStatement ps;
    ResultSet rs = null;

    try {
        ps = DB.getConnection().prepareStatement(query);

        // Set parameters
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }

        rs = ps.executeQuery();
    } catch (SQLException ex) {
        Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
    }

    return rs;
}
public int countData( String tableName) {
    int total = 0;

    try {
        Statement st = DB.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT COUNT(*) as total FROM " + tableName);

        // Process the ResultSet and retrieve the count
        if (rs.next()) {
            total = rs.getInt("total");
        }

    } catch (SQLException ex) {
       Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
    }

    return total;
}
    
    }



    

