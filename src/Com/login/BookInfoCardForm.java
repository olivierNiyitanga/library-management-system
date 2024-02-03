/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.login;

import MyClass.Authors;
import MyClass.Book;
import MyClass.Member;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rocky
 */
public class BookInfoCardForm extends javax.swing.JFrame {
    
 MyClass.Book book=new  MyClass.Book();
    MyClass.Func_Class func=new  MyClass.Func_Class();
    MyClass.Authors author=new  MyClass.Authors();
    MyClass.Genre genre=new  MyClass.Genre();
    
    public BookInfoCardForm(int book_id) {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211,84,0));
       jPanel1.setBorder(panelHeaderBorder);
       populatedJtabledWithBookList();
       
                            func.displayImage(
    90,
    60,null,
    "/com/image/bookshelf.png",
    jLabel_formTitle);
                         func.displayImage(170,
    170,null,
    "/com/image/blank.png",
    jLabel_image_
);
  
   Border jLabel_imageBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0,0,0));
       jLabel_image_.setBorder(jLabel_imageBorder);
       displayBookInfo(book_id);
    }
public void displayBookInfo(int _book_id){
     try {
         MyClass.Book selectedbook=book.getBookById(_book_id);
             if (selectedbook != null) {
        jLabel_isbn.setText(selectedbook.getIsbn());
        jLabel_name.setText(selectedbook.getName());

        MyClass.Authors bookAuthor = author.getAuthorsById(selectedbook.getAuthor_id());
        if (bookAuthor != null) {
            jLabel_author.setText(bookAuthor.getFirstName() + " " + bookAuthor.getLastName());
        } else {
            jLabel_author.setText("Unknown Author");
        }
        MyClass.Genre bookGenre = genre.getGenresById(selectedbook.getGenre_id());
         if (bookAuthor != null) {
            jLabel_genres.setText(bookGenre.getName());
        } else {
            jLabel_genres.setText("Unknown Genre");
        }
         jLabel_publisher.setText(selectedbook.getPublisher());
        jLabel_price.setText(String.valueOf(selectedbook.getPrice()));
        jLabel_quantity.setText(String.valueOf(selectedbook.getQuantity()));
        jLabel_date_received.setText(selectedbook.getDate_received());
        jTextArea_description.setText(selectedbook.getDescription());

        byte[] image = selectedbook.getCover();

        // Check if the image data is not null before displaying
        if (image != null) {
            func.displayImage(217, 290, image, " ", jLabel_image_);
        } else {
            // Handle case where image data is null
            // You might want to set a default image or display an error message
            jLabel_image_.setIcon(null); // Set the image icon to null for now
        }}
     } catch (SQLException ex) {
         Logger.getLogger(BookInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
     }
}
    
    
    
public void populatedJtabledWithBookList() {
 
    ArrayList<MyClass.Book> booklist = book.booksList( );

    
    if (booklist != null && !booklist.isEmpty()) {
        
        String[] colNames = { "ID", "ISBN", "NAME", "AUTHOR", "GENRES", "QUANTITY","PUBLISHER","PRICE","DATE_RCV" };
        Object[][] rows = new Object[booklist.size()][colNames.length];

        for (int i = 0; i < booklist.size(); i++) {
            rows[i][0] = booklist.get(i).getId();
            rows[i][1] = booklist.get(i).getIsbn();
            rows[i][2] = booklist.get(i).getName();
            rows[i][3] = booklist.get(i).getAuthor_id();
            rows[i][4] = booklist.get(i).getGenre_id();
            rows[i][5] = booklist.get(i).getQuantity();
            rows[i][6] = booklist.get(i).getPublisher();
            rows[i][7] = booklist.get(i).getPrice();
            rows[i][8] = booklist.get(i).getDate_received();
            
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
 
    } else {
        
        System.out.println("Error: memberlist is null or empty");
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_formTitle = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_image1 = new javax.swing.JLabel();
        jLabel_image_ = new javax.swing.JLabel();
        jLabel_isbn = new javax.swing.JLabel();
        jLabel_name = new javax.swing.JLabel();
        jLabel_genres = new javax.swing.JLabel();
        jLabel_author = new javax.swing.JLabel();
        jLabel_publisher = new javax.swing.JLabel();
        jLabel_date_received = new javax.swing.JLabel();
        jLabel_price = new javax.swing.JLabel();
        jLabel_quantity = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_description = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_formTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_formTitle.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel_formTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_formTitle.setText("Book info card");
        jLabel_formTitle.setOpaque(true);

        jLabel_close.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_close.setText("X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.setOpaque(true);
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jLabel_image1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image1.setOpaque(true);

        jLabel_image_.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_image_.setOpaque(true);

        jLabel_isbn.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_isbn.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_isbn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_isbn.setText("ISBN");

        jLabel_name.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel_name.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_name.setText("NAME:");

        jLabel_genres.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_genres.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_genres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_genres.setText("Genres");

        jLabel_author.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_author.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_author.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_author.setText("Author");

        jLabel_publisher.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_publisher.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_publisher.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_publisher.setText("Publisher");

        jLabel_date_received.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_date_received.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_date_received.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_date_received.setText("date_received");

        jLabel_price.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_price.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_price.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_price.setText("Price:");

        jLabel_quantity.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_quantity.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_quantity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_quantity.setText("Quantity");

        jTextArea_description.setColumns(20);
        jTextArea_description.setRows(5);
        jTextArea_description.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea_description);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_image_, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_author, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_genres, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_date_received, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 459, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_author, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_genres, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_date_received, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_image_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 573, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_closeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    // javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookInfoCardForm(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_author;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_date_received;
    private javax.swing.JLabel jLabel_formTitle;
    private javax.swing.JLabel jLabel_genres;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JLabel jLabel_image_;
    private javax.swing.JLabel jLabel_isbn;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_price;
    private javax.swing.JLabel jLabel_publisher;
    private javax.swing.JLabel jLabel_quantity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_description;
    // End of variables declaration//GEN-END:variables
}
