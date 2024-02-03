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
public class issueBookForm extends javax.swing.JFrame {
    
 MyClass.Member member=new  MyClass.Member();
    MyClass.Func_Class func=new  MyClass.Func_Class();
    MyClass.Genre genre=new  MyClass.Genre();
    MyClass.Book book=new  MyClass.Book();
    MyClass.Issue_Book issue=new  MyClass.Issue_Book();
    boolean book_exist=false;
    boolean member_exist=false;
    HashMap<String,Integer> genreMap=genre.getGenresMap();
    String imagePath="";
    public issueBookForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(108,122,137));
       jPanel1.setBorder(panelHeaderBorder);
       
                            func.displayImage(
    90,
    60,null,
    "/com/image/organizer.png",
    jLabel_formTitle);
           
   setBorderToJlabel(jLabel_book_name,Color.WHITE);
   setBorderToJlabel(jLabel_fullName,Color.WHITE);
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
        jButton_cancel = new javax.swing.JButton();
        jDateChooser_Returndate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel_book_name = new javax.swing.JLabel();
        jLabel_available = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser_issueDate = new com.toedter.calendar.JDateChooser();
        jButton_issue = new javax.swing.JButton();
        jButton_search_book_id = new javax.swing.JButton();
        jButton_search_member = new javax.swing.JButton();
        jSpinner_book_id = new javax.swing.JSpinner();
        jSpinner_member_id = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_note = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_formTitle.setBackground(new java.awt.Color(108, 122, 137));
        jLabel_formTitle.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel_formTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_formTitle.setText("ISSUE BOOK");
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
        jLabel3.setText("Enter Member Id:");

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("RETURN DATE:");

        jButton_cancel.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton_cancel.setText("CANCEL");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Enter Book id");

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

        jLabel_available.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_available.setForeground(new java.awt.Color(0, 153, 255));
        jLabel_available.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_available.setText("YES-OR-NO");

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Is book available:");

        jLabel12.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("ISUUE DATE:");

        jButton_issue.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton_issue.setText("Issue");
        jButton_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_issueActionPerformed(evt);
            }
        });

        jButton_search_book_id.setText("search book id");
        jButton_search_book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_book_idActionPerformed(evt);
            }
        });

        jButton_search_member.setText("search member");
        jButton_search_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_search_memberActionPerformed(evt);
            }
        });

        jSpinner_book_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jSpinner_member_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jTextArea_note.setColumns(20);
        jTextArea_note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_note);

        jLabel13.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Note:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(278, 278, 278)
                                .addComponent(jButton_search_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_available, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jSpinner_book_id)
                                                        .addGap(18, 18, 18))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jSpinner_member_id, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)))
                                                .addComponent(jButton_search_member, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_fullName)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser_Returndate, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton_issue, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser_issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 435, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_search_book_id)
                    .addComponent(jSpinner_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_book_name)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_search_member)
                    .addComponent(jSpinner_member_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_available, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser_Returndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_issue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(0, 5, Short.MAX_VALUE))
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

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
    this.dispose();
     

    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jButton_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_issueActionPerformed
int _book_id = (int) jSpinner_book_id.getValue();
int _member_id = (int) jSpinner_member_id.getValue();
String _note = jTextArea_note.getText();
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

try {
    String _issue_date = dateFormat.format(jDateChooser_issueDate.getDate());
    String _return_date = dateFormat.format(jDateChooser_Returndate.getDate());
    
    Date issuedate = dateFormat.parse(_issue_date);
    Date rtndate = dateFormat.parse(_return_date);
    if(!book_exist){
      JOptionPane.showMessageDialog(null, "you need to check if book exist first by clicking search book button", "Check if book exist", 2);  
    }else if (!member_exist){
      JOptionPane.showMessageDialog(null, "you need to check if member exist first by clicking search member button", "Check if member exist", 2);
    }
    else if(!issue.checkBookAvailable(_book_id)){
       JOptionPane.showMessageDialog(null, "this book is not available right now", "Book not available", 2); 
    }

    if (rtndate.before(issuedate)) {
        JOptionPane.showMessageDialog(null, "Return date must be after issue date", "Wrong Return Date", 2);
    } else {
        issue.addIssue(_book_id, _member_id, "issued", _issue_date, _return_date, _note);
        jSpinner_book_id.setValue(0);
        jSpinner_member_id.setValue(0);
        jLabel_book_name.setText("Book Name");
        jLabel_fullName.setText("Member Full-Name");
        jLabel_available.setText("YES-OR-NO");
        jLabel_available.setForeground(new Color(51,102,255));
        jDateChooser_issueDate.setDate(new Date());
        jDateChooser_Returndate.setDate(new Date());
        book_exist=false;
        member_exist=false;
    }
} catch (HeadlessException|NullPointerException |ParseException  ex) {
    JOptionPane.showMessageDialog(null, "Select issue date and return date ", "SELECT DATE", 2);
    
}
        
    }//GEN-LAST:event_jButton_issueActionPerformed

    private void jButton_search_book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_book_idActionPerformed
          int book_id= (int)jSpinner_book_id.getValue();
        
        try {
         MyClass.Book selectedbook =book.getBookById(book_id);
         if (selectedbook!=null){
           jLabel_book_name.setText(selectedbook.getName()); 
           book_exist=true;
           if(issue.checkBookAvailable(book_id)){
              jLabel_available.setText("YES");
              jLabel_available.setForeground(Color.green);
           }else
            {
              jLabel_available.setText("NO");
              jLabel_available.setForeground(Color.red);
           }
           
         }
         else{
             JOptionPane.showMessageDialog(null,"the book of that id doesn't exist","BOOK NOT FOUND",2); 
             book_exist=false;
             jLabel_available.setText("YES-OR-NO");
             jLabel_available.setForeground(new Color(51,102,255));
         }
     } catch (SQLException ex) {
         Logger.getLogger(issueBookForm.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jButton_search_book_idActionPerformed

    private void jButton_search_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_search_memberActionPerformed
                 int member_id= (int)jSpinner_member_id.getValue();
        
        try {
         MyClass.Member selectedmember =member.getMemberById(member_id);
         if (selectedmember!=null){
           jLabel_fullName.setText(selectedmember.getFirstName()+" "+selectedmember.getLastName()); 
           member_exist=true;
         }
         else{
             JOptionPane.showMessageDialog(null,"the Member of that id doesn't exist","MEMBER NOT FOUND",2); 
             jLabel_fullName.setText("Member full-Name");
             member_exist=false;
             
         }
     } catch (SQLException ex) {
         Logger.getLogger(issueBookForm.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jButton_search_memberActionPerformed

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
            java.util.logging.Logger.getLogger(issueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issueBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_issue;
    private javax.swing.JButton jButton_search_book_id;
    private javax.swing.JButton jButton_search_member;
    private com.toedter.calendar.JDateChooser jDateChooser_Returndate;
    private com.toedter.calendar.JDateChooser jDateChooser_issueDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_available;
    private javax.swing.JLabel jLabel_book_name;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_formTitle;
    private javax.swing.JLabel jLabel_fullName;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_book_id;
    private javax.swing.JSpinner jSpinner_member_id;
    private javax.swing.JTextArea jTextArea_note;
    // End of variables declaration//GEN-END:variables
}
