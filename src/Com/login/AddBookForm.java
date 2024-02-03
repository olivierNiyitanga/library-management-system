/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.login;

import static Com.login.AuthorListForm.jTable_authors;
import MyClass.Authors;
import MyClass.Member;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rocky
 */
public class AddBookForm extends javax.swing.JFrame {
    
 MyClass.Member member=new  MyClass.Member();
    MyClass.Func_Class func=new  MyClass.Func_Class();
    MyClass.Genre genre=new  MyClass.Genre();
    HashMap<String,Integer> genreMap=genre.getGenresMap();
    String imagePath="";
    public AddBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211,84,0));
       jPanel1.setBorder(panelHeaderBorder);
       
   

Border jlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
jLabel_image_.setBorder(jlabelImageBorder);
       populatedJtabledWithMemeberList();
       
                            func.displayImage(
    90,
    60,null,
    "/com/image/bookshelf.png",
    jLabel_formTitle);
          fiilComboWithGenres();            
   
    }

public void populatedJtabledWithMemeberList() {
    Member member = new Member();
    
    ArrayList<Member> memberlist = member.memberList();

    
    if (memberlist != null && !memberlist.isEmpty()) {
        String[] colNames = { "ID", "FIRSTNAME", "LASTNAME", "PHONE", "EMAIL", "GENDER" };
        Object[][] rows = new Object[memberlist.size()][colNames.length];

        for (int i = 0; i < memberlist.size(); i++) {
            rows[i][0] = memberlist.get(i).getId();
            rows[i][1] = memberlist.get(i).getFirstName();
            rows[i][2] = memberlist.get(i).getLastName();
            rows[i][3] = memberlist.get(i).getPhone();
            rows[i][4] = memberlist.get(i).getEmail();
            rows[i][5] = memberlist.get(i).getGender();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
       // jTable_.setModel(model);
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
        jTextField_Isbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_author = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_publisher = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_author_id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_description = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel_image_ = new javax.swing.JLabel();
        jButton_select_image = new javax.swing.JButton();
        jLabel_image_path_ = new javax.swing.JLabel();
        jButton_cancel = new javax.swing.JButton();
        jButton_addbook = new javax.swing.JButton();
        jComboBox_genres = new javax.swing.JComboBox<>();
        jDateChooser_date = new com.toedter.calendar.JDateChooser();
        jSpinner_quantity = new javax.swing.JSpinner();
        jButton_selectAuthor = new javax.swing.JButton();
        jLabel_bookCover = new javax.swing.JLabel();
        jLabel_genres_id = new javax.swing.JLabel();
        jButton_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_formTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_formTitle.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel_formTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_formTitle.setText("ADD BOOK");
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

        jTextField_Isbn.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextField_Isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IsbnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ISBN:");

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("NAME:");

        jTextField_name.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("AUTHOR:");

        jTextField_author.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextField_author.setEnabled(false);
        jTextField_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_authorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("QUANTITY:");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("PUBLISHER:");

        jTextField_publisher.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextField_publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_publisherActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("PRICE:");

        jTextField_price.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextField_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_priceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("BOOK DESCRIPTION:");

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("GENRES:");

        jLabel_author_id.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel_author_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_author_id.setText("ID");

        jTextArea_description.setColumns(20);
        jTextArea_description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_description);

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("DATE RECEIVED:");

        jLabel_image_.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image_.setOpaque(true);

        jButton_select_image.setBackground(new java.awt.Color(0, 153, 153));
        jButton_select_image.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_select_image.setForeground(new java.awt.Color(255, 255, 255));
        jButton_select_image.setText("SELECT PICTURE");
        jButton_select_image.setContentAreaFilled(false);
        jButton_select_image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_select_image.setOpaque(true);
        jButton_select_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_select_imageActionPerformed(evt);
            }
        });

        jLabel_image_path_.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_image_path_.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_image_path_.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_image_path_.setText("PICTURE PATH");

        jButton_cancel.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton_cancel.setText("CANCEL");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jButton_addbook.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton_addbook.setText("ADD BOOK");
        jButton_addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addbookActionPerformed(evt);
            }
        });

        jComboBox_genres.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jComboBox_genres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_genresActionPerformed(evt);
            }
        });

        jButton_selectAuthor.setText("select author");
        jButton_selectAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_selectAuthorActionPerformed(evt);
            }
        });

        jLabel_bookCover.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel_bookCover.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_bookCover.setText("BOOK COVER:");

        jLabel_genres_id.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel_genres_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_genres_id.setText("ID");

        jButton_clear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton_clear.setText("CLEAR");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Isbn, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(jTextField_name)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_price, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_publisher, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner_quantity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_genres, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_author, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser_date, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton_addbook)
                                .addGap(71, 71, 71)
                                .addComponent(jButton_clear)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_author_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_selectAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_genres_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton_select_image, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(jLabel_image_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_image_path_, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(593, Short.MAX_VALUE)
                    .addComponent(jLabel_bookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(214, 214, 214)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_selectAuthor)
                            .addComponent(jLabel_author_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox_genres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_genres_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel_image_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel_image_path_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_select_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_addbook, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 468, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(312, Short.MAX_VALUE)
                    .addComponent(jLabel_bookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(278, 278, 278)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jTextField_IsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IsbnActionPerformed

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jTextField_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_authorActionPerformed

    private void jTextField_publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_publisherActionPerformed

    private void jTextField_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_priceActionPerformed

    private void jButton_select_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_select_imageActionPerformed
           String path=func.selectImage();
            jLabel_image_path_.setText(path);
            func.displayImage(158,158,null,path,jLabel_image_);
            imagePath=path;
       
    }//GEN-LAST:event_jButton_select_imageActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
    this.dispose();
     

    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jButton_addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addbookActionPerformed
  MyClass.Book book=new  MyClass.Book();
  String isbn =jTextField_Isbn.getText();
 if (!verif()){
     JOptionPane.showMessageDialog(null, "one or more fields are empty", "EMPTY DATA ", 2);
 }
 else if(book.isIsbnexists(isbn)){
     JOptionPane.showMessageDialog(null, "This isbn is already exists", "WRONG ISBN ", 2);
 }
 else {
     

try {

String name =jTextField_name.getText();
String publisher =jTextField_publisher.getText();
String description=jTextArea_description.getText();

Integer author_id=Integer.parseInt(jLabel_author_id.getText());
Integer genre_id=Integer.parseInt(jLabel_genres_id.getText());
Integer quantity=Integer.parseInt(jSpinner_quantity.getValue().toString());

Double price =Double.parseDouble(jTextField_price.getText());
Path path = Paths.get(imagePath);
    SimpleDateFormat dateFormat=new SimpleDateFormat ("yyyy-MM-dd"); 
    String received_date=dateFormat.format(jDateChooser_date.getDate());
    byte[] img = Files.readAllBytes(path);
     
  book.addBook(isbn, name, author_id, genre_id, quantity, publisher,price, received_date, description, img);
} catch (IOException ex) {
    JOptionPane.showMessageDialog(null, "MAKE SURE YOU ADD PICTURE ON COVER IMAGE", "NO COVER IMAGE FOUND ", 2);
}
catch (NumberFormatException ex) {
   // Logger.getLogger(AddBookForm.class.getName()).log(Level.SEVERE, null, ex);
   JOptionPane.showMessageDialog(null, "YOU ENTERED WRONG DATA IN NUMBER FIELD", "WRONG DATA ", 2);
   
}
catch (NullPointerException ex) {
   // Logger.getLogger(AddBookForm.class.getName()).log(Level.SEVERE, null, ex);
   JOptionPane.showMessageDialog(null, "YOU NEED TO SELECT DATE", "SELECT DATE ", 2);
}
    }
    }//GEN-LAST:event_jButton_addbookActionPerformed

    private void jButton_selectAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selectAuthorActionPerformed
        AuthorListForm authorform=new  AuthorListForm ();
        authorform.setVisible(true);
      
       
    }//GEN-LAST:event_jButton_selectAuthorActionPerformed

    private void jComboBox_genresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_genresActionPerformed
        try {
    int genreId = genreMap.get(jComboBox_genres.getSelectedItem().toString());
    jLabel_genres_id.setText(String.valueOf(genreId));
} catch (Exception ex) {
    System.out.println("Error occurred in combobox: " + ex.getMessage());
}
    }//GEN-LAST:event_jComboBox_genresActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        jTextField_Isbn.setText("");
        jTextField_name.setText("");
        jTextField_author.setText("");
        jLabel_author_id.setText("ID");
        jComboBox_genres.setSelectedIndex(0);
        jLabel_genres_id.setText("ID");
        jTextField_publisher.setText("");
        jTextField_price.setText("");
        jTextArea_description.setText("");
        jSpinner_quantity.setValue(0);
        jDateChooser_date.setDate(new java.util.Date());
        jLabel_image_.setIcon(null);
        jLabel_image_path_.setText("picture path.....");
        
    }//GEN-LAST:event_jButton_clearActionPerformed
public static void displayAuthorData(int id,String FullName){
    jTextField_author.setText(FullName);
    jLabel_author_id.setText(String.valueOf(id));
}
public boolean verif(){
    if(jTextField_Isbn.getText().equals("")||jTextField_author.getText().equals("")||jTextField_price.getText().equals("")
            ||jTextField_name.getText().equals("")||jLabel_genres_id.getText().equals("ID")){
        return false;
    }
    else{
        return true;
    }
}
public void fiilComboWithGenres(){
  for ( String genreName : genreMap.keySet())
{
jComboBox_genres.addItem(genreName);
}
}




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
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addbook;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_selectAuthor;
    private javax.swing.JButton jButton_select_image;
    private javax.swing.JComboBox<String> jComboBox_genres;
    private com.toedter.calendar.JDateChooser jDateChooser_date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_author_id;
    private javax.swing.JLabel jLabel_bookCover;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_formTitle;
    private javax.swing.JLabel jLabel_genres_id;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JLabel jLabel_image_;
    private javax.swing.JLabel jLabel_image_path_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_quantity;
    private javax.swing.JTextArea jTextArea_description;
    private javax.swing.JTextField jTextField_Isbn;
    private static javax.swing.JTextField jTextField_author;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_publisher;
    // End of variables declaration//GEN-END:variables
}
