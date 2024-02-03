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
public class BookListForm extends javax.swing.JFrame {
    
 MyClass.Book book=new  MyClass.Book();
    MyClass.Func_Class func=new  MyClass.Func_Class();
    MyClass.Authors author=new  MyClass.Authors();
    MyClass.Genre genre=new  MyClass.Genre();
    public BookListForm() {
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
   jTable_books.setSelectionBackground(new Color(249,105,14));
   jTable_books.setSelectionForeground(Color.white);
   jTable_books.setRowHeight(30);
   jTable_books.setShowGrid(false);
   jTable_books.setBackground(new Color(248,248,248));
   jTable_books.setShowHorizontalLines(true);
   jTable_books.setGridColor(Color.orange);
   jTable_books.getTableHeader().setBackground(new Color(36,37,42));
   jTable_books.getTableHeader().setForeground(Color.white);
   jTable_books.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,18));
   jTable_books.getTableHeader().setOpaque(false);
   Border jLabel_imageBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0,0,0));
       jLabel_image_.setBorder(jLabel_imageBorder);
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
        jTable_books.setModel(model);
    } 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_formTitle = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_books = new javax.swing.JTable();
        jLabel_image1 = new javax.swing.JLabel();
        jLabel_image_ = new javax.swing.JLabel();
        jLabel_isbn = new javax.swing.JLabel();
        jLabel_name = new javax.swing.JLabel();
        jLabel_genres = new javax.swing.JLabel();
        jLabel_author = new javax.swing.JLabel();
        jLabel_publisher = new javax.swing.JLabel();
        jLabel_price = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_SearchByname = new javax.swing.JButton();
        jTextField_SearchName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton_SearchDate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser_date_1 = new com.toedter.calendar.JDateChooser();
        jDateChooser_date_2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_formTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_formTitle.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel_formTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_formTitle.setText("BOOK LIST");
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

        jTable_books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_booksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_books);

        jLabel_image1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image1.setOpaque(true);

        jLabel_image_.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_image_.setOpaque(true);

        jLabel_isbn.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_isbn.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_isbn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_isbn.setText("ISBN");

        jLabel_name.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
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

        jLabel_price.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_price.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_price.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_price.setText("Price:");

        jButton_SearchByname.setText("Search");
        jButton_SearchByname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchBynameActionPerformed(evt);
            }
        });

        jTextField_SearchName.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextField_SearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("VALUE TO SEARCH:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("[search by Book Name or Description]");

        jButton_SearchDate.setText("Search");
        jButton_SearchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchDateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("date received between:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("[search  book between Date ]");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("And");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_date_1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser_date_2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jDateChooser_date_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_date_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_SearchDate)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_SearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SearchByname, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(226, 226, 226)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_SearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_SearchByname))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_author, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_isbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_genres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_publisher, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jLabel_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_image_, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 1082, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_image_, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 699, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextField_SearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchNameActionPerformed
    /*
        DefaultTableModel model = (DefaultTableModel) jTable_books.getModel();
if (model.getRowCount() > 0) {
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    jTable_books.setRowSorter(sorter);
    int dateColumnIndex = -1;
    for (int i = 0; i < model.getColumnCount(); i++) {
        if (model.getColumnName(i).equals("Date")) { // Replace "Date" with the actual name of the date column
            dateColumnIndex = i;
            break;
        }
    }
    if (dateColumnIndex == -1) {
        JOptionPane.showMessageDialog(this, "The table does not have a date column.", "Search Result", JOptionPane.WARNING_MESSAGE);
        return;
    }
    Date startDate = jDateChooser_date_1.getDate();
    Date endDate = jDateChooser_date_2.getDate();
    if (startDate == null || endDate == null) {
        JOptionPane.showMessageDialog(this, "Please select a start and end date.", "Search Result", JOptionPane.WARNING_MESSAGE);
        return;
    }
    RowFilter<DefaultTableModel, Object> dateFilter;
          dateFilter = RowFilter.andFilter(
                   RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, startDate, dateColumnIndex),
                    RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, endDate, dateColumnIndex)
            );
   sorter.setRowFilter(dateFilter);
    if (jTable_books.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No matching rows found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, "The table is empty.", "Search Result", JOptionPane.WARNING_MESSAGE);
}*/


    }//GEN-LAST:event_jTextField_SearchNameActionPerformed

    private void jButton_SearchBynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchBynameActionPerformed
       
       DefaultTableModel model = (DefaultTableModel) jTable_books.getModel();

    // Check if there is data in the table
    if (model.getRowCount() > 0) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable_books.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(jTextField_SearchName.getText()));

        // Check if any rows match the filter
        if (jTable_books.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No matching rows found.", "Search Result", 2);
        }
    } else {
        JOptionPane.showMessageDialog(this, "The table is empty.", "Search Result", 3);
    }
     
    


    }//GEN-LAST:event_jButton_SearchBynameActionPerformed

    private void jTable_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_booksMouseClicked
   
MyClass.Book selectbook;
        try {
    Integer rowIndex = jTable_books.getSelectedRow();
    int id = Integer.parseInt(jTable_books.getModel().getValueAt(rowIndex, 0).toString());
    selectbook = book.getBookById(id);
    int code=Integer.parseInt(jTable_books.getModel().getValueAt(rowIndex, 0).toString());

    if (selectbook != null) {
        jLabel_isbn.setText(selectbook.getIsbn());
        jLabel_name.setText(selectbook.getName());

        MyClass.Authors bookAuthor = author.getAuthorsById(selectbook.getAuthor_id());
        if (bookAuthor != null) {
            jLabel_author.setText(bookAuthor.getFirstName() + " " + bookAuthor.getLastName());
        } else {
            jLabel_author.setText("Unknown Author");
        }
        MyClass.Genre bookGenre = genre.getGenresById(selectbook.getGenre_id());
         if (bookAuthor != null) {
            jLabel_genres.setText(bookGenre.getName());
        } else {
            jLabel_genres.setText("Unknown Genre");
        }
         jLabel_publisher.setText(selectbook.getPublisher());
        jLabel_price.setText(String.valueOf(selectbook.getPrice()));

        byte[] image = selectbook.getCover();

        // Check if the image data is not null before displaying
        if (image != null) {
            func.displayImage(190, 160, image, " ", jLabel_image_);
        } else {
            // Handle case where image data is null
            // You might want to set a default image or display an error message
            jLabel_image_.setIcon(null); // Set the image icon to null for now
        }
    } else {
        JOptionPane.showMessageDialog(null, "NO BOOK WITH THIS ID IS FOUND", "INVALID ID", 3);
    }

} catch (Exception ex) {
    ex.printStackTrace(); // Print the stack trace to help identify the issue during development
    JOptionPane.showMessageDialog(null, "Enter Valid Book Id", "INVALID ID", 3);
}
    }//GEN-LAST:event_jTable_booksMouseClicked

    private void jButton_SearchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SearchDateActionPerformed

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
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SearchByname;
    private javax.swing.JButton jButton_SearchDate;
    private com.toedter.calendar.JDateChooser jDateChooser_date_1;
    private com.toedter.calendar.JDateChooser jDateChooser_date_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_author;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_formTitle;
    private javax.swing.JLabel jLabel_genres;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JLabel jLabel_image_;
    private javax.swing.JLabel jLabel_isbn;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_price;
    private javax.swing.JLabel jLabel_publisher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_books;
    private javax.swing.JTextField jTextField_SearchName;
    // End of variables declaration//GEN-END:variables
}
