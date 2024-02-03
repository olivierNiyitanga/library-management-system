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
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
public class ReturnBookForm extends javax.swing.JFrame {
    
 MyClass.Member member=new  MyClass.Member();
    MyClass.Func_Class func=new  MyClass.Func_Class();
    MyClass.Genre genre=new  MyClass.Genre();
    MyClass.Book book=new  MyClass.Book();
    MyClass.Issue_Book issue=new  MyClass.Issue_Book();
    boolean book_exist=false;
    boolean member_exist=false;
    HashMap<String,Integer> genreMap=genre.getGenresMap();
    String imagePath="";
    public ReturnBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(108,122,137));
       jPanel1.setBorder(panelHeaderBorder);
       
                            func.displayImage(
    90,
    60,null,
    "/com/image/organizer.png",
    jLabel_formTitle);
      jTable_issuedBooks.setSelectionBackground(new Color(249,105,14));
   jTable_issuedBooks.setSelectionForeground(Color.white);
   jTable_issuedBooks.setRowHeight(30);
   jTable_issuedBooks.setShowGrid(false);
   jTable_issuedBooks.setBackground(new Color(248,248,248));
   jTable_issuedBooks.setShowHorizontalLines(true);
   jTable_issuedBooks.setGridColor(Color.orange);
   jTable_issuedBooks.getTableHeader().setBackground(new Color(34,167,240));
   jTable_issuedBooks.getTableHeader().setForeground(Color.white);
   jTable_issuedBooks.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,14));
   jTable_issuedBooks.getTableHeader().setOpaque(false);
           
   setBorderToJlabel(jLabel_book_name,Color.WHITE);
   setBorderToJlabel(jLabel_fullName,Color.WHITE);
   populatedJtabledWithIssuedBooks("");
    }
    
    public void populatedJtabledWithIssuedBooks(String _status) {
   
    ArrayList<MyClass.Issue_Book> issBookslist = issue.IssuedbooksList(_status);
    
    String[] colNames = { "Book_id", "Member_id", "STATUS", "Issued date", "Return date","Note" };
        Object[][] rows = new Object[issBookslist.size()][colNames.length];
        
        for (int i = 0; i < issBookslist.size(); i++) {
            rows[i][0] = issBookslist.get(i).getBook_id();
            rows[i][1] = issBookslist.get(i).getMember_id();
            rows[i][2] = issBookslist.get(i).getStatus();
            rows[i][3] = issBookslist.get(i).getIssue_date();
            rows[i][4] = issBookslist.get(i).getReturn_date();
            rows[i][5] = issBookslist.get(i).getNote();
            
           
       
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_issuedBooks.setModel(model);
    } 
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_formTitle = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_image1 = new javax.swing.JLabel();
        jLabel_fullName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser_Returndate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel_book_name = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser_issueDate = new com.toedter.calendar.JDateChooser();
        jButton_return = new javax.swing.JButton();
        jSpinner_book_id = new javax.swing.JSpinner();
        jSpinner_member_id = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_note_ = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_issuedBooks = new javax.swing.JTable();
        jButton_lost = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_Status_ = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_formTitle.setBackground(new java.awt.Color(108, 122, 137));
        jLabel_formTitle.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel_formTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_formTitle.setText("RETURN BOOK");
        jLabel_formTitle.setOpaque(true);

        jLabel_close.setBackground(new java.awt.Color(108, 122, 137));
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

        jLabel_fullName.setBackground(new java.awt.Color(0, 102, 255));
        jLabel_fullName.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel_fullName.setForeground(new java.awt.Color(0, 153, 255));
        jLabel_fullName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_fullName.setText("Member FullName");
        jLabel_fullName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_fullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_fullNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_fullNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_fullNameMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText(" Member Id:");

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("RETURN DATE:");

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Book id");

        jLabel_book_name.setBackground(new java.awt.Color(0, 102, 255));
        jLabel_book_name.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel_book_name.setForeground(new java.awt.Color(0, 153, 255));
        jLabel_book_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_book_name.setText("book name");
        jLabel_book_name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_book_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_book_nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_book_nameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_book_nameMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("ISUUE DATE:");

        jDateChooser_issueDate.setEnabled(false);

        jButton_return.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton_return.setText("Return");
        jButton_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_returnActionPerformed(evt);
            }
        });

        jSpinner_book_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jSpinner_book_id.setEnabled(false);

        jSpinner_member_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jSpinner_member_id.setEnabled(false);

        jTextArea_note_.setColumns(20);
        jTextArea_note_.setRows(5);
        jScrollPane1.setViewportView(jTextArea_note_);

        jLabel13.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Note:");

        jTable_issuedBooks.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        jTable_issuedBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_issuedBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_issuedBooksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_issuedBooks);

        jButton_lost.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton_lost.setText("Lost");
        jButton_lost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lostActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Select Book Status:");

        jComboBox_Status_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "issued", "Returned", "Lost" }));
        jComboBox_Status_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Status_ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addGap(283, 283, 283))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_book_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner_book_id, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner_member_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_issueDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_Returndate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_fullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_return, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jButton_lost, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Status_, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 687, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel_book_name)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_member_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_Returndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_return, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_lost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jComboBox_Status_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 520, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jButton_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_returnActionPerformed
int _book_id = (int) jSpinner_book_id.getValue();
int _member_id = (int) jSpinner_member_id.getValue();
String _note = jTextArea_note_.getText();
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

try {
    
    String _return_date = dateFormat.format(jDateChooser_Returndate.getDate());
    String _issue_date = dateFormat.format(jDateChooser_issueDate.getDate());
  
    Date rtndate = dateFormat.parse(_return_date);
    Date issuedate = dateFormat.parse(_issue_date);
    
    if (rtndate.before(issuedate)) {
        JOptionPane.showMessageDialog(null, "Return date must be after issue date", "Wrong Return Date", 2);
    } else {
        issue.UpdateIssue(_book_id, _member_id, "Returned", _issue_date, _return_date, _note);
        jSpinner_book_id.setValue(0);
        jSpinner_member_id.setValue(0);
        jLabel_book_name.setText("Book Name");
        jLabel_fullName.setText("Member Full-Name");
        jDateChooser_issueDate.setDate(new Date());
        jDateChooser_Returndate.setDate(new Date());
        jTextArea_note_.setText("");
    }
} catch (HeadlessException|NullPointerException |ParseException  ex) {
    JOptionPane.showMessageDialog(null, "Select  an item from a table ", "SELECT ITEM", 2);
    
}
        
    }//GEN-LAST:event_jButton_returnActionPerformed

    private void jLabel_book_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_book_nameMouseClicked
          int book_id=(int)jSpinner_book_id.getValue();
        BookInfoCardForm bookinfocard = new BookInfoCardForm(book_id);
        bookinfocard.setVisible(true);
    }//GEN-LAST:event_jLabel_book_nameMouseClicked

    private void jLabel_fullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_fullNameMouseClicked
        int member_id=(int)jSpinner_member_id.getValue();
        MemberInfoCardForm memberinfocard = new MemberInfoCardForm(member_id);
        memberinfocard .setVisible(true);  
    }//GEN-LAST:event_jLabel_fullNameMouseClicked

    private void jLabel_book_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_book_nameMouseEntered
     
       setBorderToJlabel(jLabel_book_name,new Color(51,102,255));
    }//GEN-LAST:event_jLabel_book_nameMouseEntered

    private void jLabel_book_nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_book_nameMouseExited
        
       setBorderToJlabel(jLabel_book_name,Color.WHITE);
    }//GEN-LAST:event_jLabel_book_nameMouseExited

    private void jLabel_fullNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_fullNameMouseEntered
        setBorderToJlabel(jLabel_fullName,new Color(51,102,255));
    }//GEN-LAST:event_jLabel_fullNameMouseEntered

    private void jLabel_fullNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_fullNameMouseExited
       setBorderToJlabel(jLabel_fullName,Color.WHITE);
    }//GEN-LAST:event_jLabel_fullNameMouseExited

    private void jTable_issuedBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_issuedBooksMouseClicked
       int index =jTable_issuedBooks.getSelectedRow();
        int book_id=Integer.parseInt(jTable_issuedBooks.getValueAt(index,0).toString());
        int member_id=Integer.parseInt(jTable_issuedBooks.getValueAt(index,1).toString());
        MyClass.Book selectedbook;
        MyClass.Member selectedmember ;
     try {
         selectedbook=book.getBookById(book_id);
         jSpinner_book_id.setValue(selectedbook.getId());
         jLabel_book_name.setText(selectedbook.getName());
         selectedmember=member.getMemberById(member_id);
         jSpinner_member_id.setValue(selectedmember.getId());
        jLabel_fullName.setText(selectedmember.getFirstName()+" "+selectedmember.getLastName());
        String issued_date=jTable_issuedBooks.getValueAt(index,3).toString();
        String return_date=jTable_issuedBooks.getValueAt(index,4).toString();
        //String status=jTable_issuedBooks.getValueAt(index,4).toString();
        String note=jTable_issuedBooks.getValueAt(index,5).toString();
        Date issDate = new SimpleDateFormat("yyyy-MM-dd").parse(issued_date);
        jDateChooser_issueDate.setDate(issDate);
        Date rtnDate = new SimpleDateFormat("yyyy-MM-dd").parse(return_date);
        jDateChooser_Returndate.setDate(rtnDate);
        jTextArea_note_.setText(note);
     } catch (SQLException ex) {
         Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ParseException ex) {
         Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
     }
     
        
        
    }//GEN-LAST:event_jTable_issuedBooksMouseClicked

    private void jButton_lostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lostActionPerformed
        int _book_id = (int) jSpinner_book_id.getValue();
int _member_id = (int) jSpinner_member_id.getValue();
String _note = jTextArea_note_.getText();
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

try {
    
    String _return_date = dateFormat.format(jDateChooser_Returndate.getDate());
    String _issue_date = dateFormat.format(jDateChooser_issueDate.getDate());
     issue.UpdateIssue(_book_id, _member_id, "Lost", _issue_date, _return_date, _note);
      int quantity=new MyClass.Book().getBookById(_book_id).getQuantity();
        book.setQuantity_Minus_One(_book_id,quantity-1);
        jSpinner_book_id.setValue(0);
        jSpinner_member_id.setValue(0);
        jLabel_book_name.setText("Book Name");
        jLabel_fullName.setText("Member Full-Name");
        jDateChooser_issueDate.setDate(new Date());
        jDateChooser_Returndate.setDate(new Date());
        jTextArea_note_.setText("");
    
} catch (HeadlessException|NullPointerException  ex) {
    JOptionPane.showMessageDialog(null, "Select  an item from a table ", "SELECT ITEM", 2);
    
}    catch (SQLException ex) {
         Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jButton_lostActionPerformed

    private void jComboBox_Status_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Status_ActionPerformed
        String status=jComboBox_Status_.getSelectedItem().toString();
        if(status.equals("All")){
            status="";
        }
        populatedJtabledWithIssuedBooks(status);
    }//GEN-LAST:event_jComboBox_Status_ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int index =jTable_issuedBooks.getSelectedRow();
        try{
        int book_id=Integer.parseInt(jTable_issuedBooks.getValueAt(index,0).toString());
        int member_id=Integer.parseInt(jTable_issuedBooks.getValueAt(index,1).toString());
        String _issued_date=jTable_issuedBooks.getValueAt(index,3).toString();
        issue.removeFromIssuedDateTable(book_id, member_id, _issued_date);
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Select Element you want to delete from table "+ex.getMessage(),"Delete error",2);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
public void setBorderToJlabel(JLabel label,Color color){
     Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, color);
       label.setBorder(border);
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
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_lost;
    private javax.swing.JButton jButton_return;
    private javax.swing.JComboBox<String> jComboBox_Status_;
    private com.toedter.calendar.JDateChooser jDateChooser_Returndate;
    private com.toedter.calendar.JDateChooser jDateChooser_issueDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_book_name;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_formTitle;
    private javax.swing.JLabel jLabel_fullName;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_book_id;
    private javax.swing.JSpinner jSpinner_member_id;
    private javax.swing.JTable jTable_issuedBooks;
    private javax.swing.JTextArea jTextArea_note_;
    // End of variables declaration//GEN-END:variables
}
