/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.login;

import MyClass.Func_Class;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;


/**
 *
 * @author Rocky
 */
public class dashboardJFrame extends javax.swing.JFrame {

  Border buttonBorder1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE);
   Border buttonBorder0 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(36,37,42));
   MyClass.Func_Class func = new Func_Class();
   MyClass.Book book= new MyClass.Book();
   
   JLabel[] labels_tab= new JLabel[5];
    public dashboardJFrame() {
        initComponents();
        
       this.setLocationRelativeTo(null);
     func.displayImage(
    jLabel1_dashboard_logo.getWidth(),
    jLabel1_dashboard_logo.getHeight(),null,
    "/com/image/bookshelf.png",
    jLabel1_dashboard_logo
);

        
       Border panelHeaderBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);
       jPanel4_header.setBorder(panelHeaderBorder);
       Border panelHeader_1_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255,125,22));
       jPanel_1_header.setBorder(panelHeader_1_Border);
     Border panelHeader_2_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(26,138,32));
       jPanel_2_header.setBorder(panelHeader_2_Border);
       Border panelHeader_3_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(115,40,125));
       jPanel_3_header.setBorder(panelHeader_3_Border);
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(58,83,155));
       jPanel_4_header.setBorder(panelHeader_4_Border);
       buttonsHoverEffects();
       addBorders();
       displayCount();
       labels_tab[0]=jLabel_image_1;
       labels_tab[1]=jLabel_image_2;
       labels_tab[2]=jLabel_image_3;
       labels_tab[3]=jLabel_image_4;
       labels_tab[4]=jLabel_image_5;
     book.displayBooksCovers(labels_tab);
      
    }

public void addBorders(){
      Component[] comps= jPanel_menu.getComponents();
    for(Component comp:comps)
{
    if (comp instanceof JButton){
       JButton button =(JButton) comp; 
     button.setBorder(buttonBorder0);
    
}
}    
}
public void buttonsHoverEffects(){
    Component[] comps= jPanel_menu.getComponents();
    for(Component comp:comps)
{
    if (comp instanceof JButton){
       JButton button =(JButton) comp; 
       button.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseEntered(MouseEvent evt){
               button.setBorder(buttonBorder1);
               
           }
            @Override
           public void mouseExited(MouseEvent evt){
               button.setBorder(buttonBorder0);
               
           }
  

           
       });
    
}
}
}

public void displayCount(){
         
          jLabel_books_Count.setText(String.valueOf(func.countData("books")));  
           jLabel_authorCount.setText(String.valueOf(func.countData("authors")));
            jLabel_memberCount.setText(String.valueOf(func.countData("members")));
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_menu = new javax.swing.JPanel();
        jPanel4_header = new javax.swing.JPanel();
        jLabel1_dashboard_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_addMember = new javax.swing.JButton();
        jButton_edit_member = new javax.swing.JButton();
        jButton_deletemember = new javax.swing.JButton();
        jButton_memberList = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton_manage_author = new javax.swing.JButton();
        jButton_manages_genres = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton_addbook = new javax.swing.JButton();
        jButton_edit_book = new javax.swing.JButton();
        jButton_delete_book = new javax.swing.JButton();
        jButton_booklist = new javax.swing.JButton();
        jLabel_circulation = new javax.swing.JLabel();
        jButton_returnBook = new javax.swing.JButton();
        jButton_issue_book = new javax.swing.JButton();
        jLabel_line = new javax.swing.JLabel();
        jButton_manage_user = new javax.swing.JButton();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_books_Count = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_authorCount = new javax.swing.JLabel();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_memberCount = new javax.swing.JLabel();
        jPanel_5 = new javax.swing.JPanel();
        jPanel_4_header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_image_2 = new javax.swing.JLabel();
        jLabel_image_3 = new javax.swing.JLabel();
        jLabel_image_1 = new javax.swing.JLabel();
        jLabel_image_5 = new javax.swing.JLabel();
        jLabel_image_4 = new javax.swing.JLabel();
        jLabel_welcome_username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_menu.setBackground(new java.awt.Color(36, 37, 42));

        jPanel4_header.setBackground(new java.awt.Color(1, 50, 67));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("library");

        javax.swing.GroupLayout jPanel4_headerLayout = new javax.swing.GroupLayout(jPanel4_header);
        jPanel4_header.setLayout(jPanel4_headerLayout);
        jPanel4_headerLayout.setHorizontalGroup(
            jPanel4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_dashboard_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4_headerLayout.setVerticalGroup(
            jPanel4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4_headerLayout.createSequentialGroup()
                .addGroup(jPanel4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jLabel1_dashboard_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENRES");

        jButton_addMember.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_addMember.setForeground(new java.awt.Color(255, 255, 255));
        jButton_addMember.setText("ADD MEMBER");
        jButton_addMember.setContentAreaFilled(false);
        jButton_addMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addMemberActionPerformed(evt);
            }
        });

        jButton_edit_member.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_edit_member.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit_member.setText("EDIT MEMBER");
        jButton_edit_member.setContentAreaFilled(false);
        jButton_edit_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_memberActionPerformed(evt);
            }
        });

        jButton_deletemember.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_deletemember.setForeground(new java.awt.Color(255, 255, 255));
        jButton_deletemember.setText("DELETE MEMBER");
        jButton_deletemember.setContentAreaFilled(false);
        jButton_deletemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletememberActionPerformed(evt);
            }
        });

        jButton_memberList.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_memberList.setForeground(new java.awt.Color(255, 255, 255));
        jButton_memberList.setText("MEMBER LIST");
        jButton_memberList.setContentAreaFilled(false);
        jButton_memberList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_memberListActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MEMBERS");

        jButton_manage_author.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_manage_author.setForeground(new java.awt.Color(255, 255, 255));
        jButton_manage_author.setText("MANAGE AUTHORS");
        jButton_manage_author.setContentAreaFilled(false);
        jButton_manage_author.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_manage_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_manage_authorActionPerformed(evt);
            }
        });

        jButton_manages_genres.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_manages_genres.setForeground(new java.awt.Color(255, 255, 255));
        jButton_manages_genres.setText("MANAGE GENRES");
        jButton_manages_genres.setContentAreaFilled(false);
        jButton_manages_genres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_manages_genres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_manages_genresActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AUTHORS");

        jLabel11.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BOOKS");

        jButton_addbook.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_addbook.setForeground(new java.awt.Color(255, 255, 255));
        jButton_addbook.setText("ADD BOOK");
        jButton_addbook.setContentAreaFilled(false);
        jButton_addbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addbookActionPerformed(evt);
            }
        });

        jButton_edit_book.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_edit_book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit_book.setText("EDIT BOOK");
        jButton_edit_book.setContentAreaFilled(false);
        jButton_edit_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_edit_bookActionPerformed(evt);
            }
        });

        jButton_delete_book.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_delete_book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete_book.setText("DELETE BOOK");
        jButton_delete_book.setContentAreaFilled(false);
        jButton_delete_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_bookActionPerformed(evt);
            }
        });

        jButton_booklist.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_booklist.setForeground(new java.awt.Color(255, 255, 255));
        jButton_booklist.setText("BOOK LIST");
        jButton_booklist.setContentAreaFilled(false);
        jButton_booklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_booklistActionPerformed(evt);
            }
        });

        jLabel_circulation.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel_circulation.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_circulation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_circulation.setText("Circulation");

        jButton_returnBook.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_returnBook.setForeground(new java.awt.Color(255, 255, 255));
        jButton_returnBook.setText("Return Book");
        jButton_returnBook.setContentAreaFilled(false);
        jButton_returnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_returnBookActionPerformed(evt);
            }
        });

        jButton_issue_book.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton_issue_book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_issue_book.setText("Issue Book");
        jButton_issue_book.setContentAreaFilled(false);
        jButton_issue_book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_issue_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_issue_bookActionPerformed(evt);
            }
        });

        jLabel_line.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_line.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_line.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_line.setText("|");

        jButton_manage_user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_manage_user.setForeground(new java.awt.Color(255, 255, 255));
        jButton_manage_user.setText("Manage Users");
        jButton_manage_user.setContentAreaFilled(false);
        jButton_manage_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_manage_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_manage_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_circulation, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_menuLayout.createSequentialGroup()
                                .addComponent(jButton_issue_book)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_line)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_returnBook))
                            .addGroup(jPanel_menuLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton_manage_user, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menuLayout.createSequentialGroup()
                        .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_booklist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_delete_book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jButton_addbook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_edit_book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                        .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton_memberList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_deletemember, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton_edit_member, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jButton_addMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_manage_author)
                    .addComponent(jButton_manages_genres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addComponent(jPanel4_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_manages_genres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_manage_author)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_addMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_edit_member)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_deletemember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_memberList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_addbook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_edit_book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_delete_book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_booklist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_circulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_issue_book, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_line)
                    .addComponent(jButton_returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_manage_user, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_1.setBackground(new java.awt.Color(255, 178, 41));

        jPanel_1_header.setBackground(new java.awt.Color(246, 145, 16));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOKS");

        javax.swing.GroupLayout jPanel_1_headerLayout = new javax.swing.GroupLayout(jPanel_1_header);
        jPanel_1_header.setLayout(jPanel_1_headerLayout);
        jPanel_1_headerLayout.setHorizontalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel_1_headerLayout.setVerticalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("books");

        jLabel_books_Count.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel_books_Count.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_books_Count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_books_Count.setText("00532");

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_books_Count, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel_books_Count, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );

        jPanel_3.setBackground(new java.awt.Color(155, 89, 182));

        jPanel_3_header.setBackground(new java.awt.Color(125, 60, 155));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AUTHORS");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_3_headerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_authorCount.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel_authorCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_authorCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_authorCount.setText("18");

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_authorCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel_authorCount, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        jPanel_2.setBackground(new java.awt.Color(75, 192, 18));

        jPanel_2_header.setBackground(new java.awt.Color(65, 160, 10));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEMBERS");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_memberCount.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel_memberCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_memberCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_memberCount.setText("11398");

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_memberCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel_memberCount, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );

        jPanel_5.setBackground(new java.awt.Color(44, 130, 201));

        jPanel_4_header.setBackground(new java.awt.Color(58, 108, 179));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Latest Books");

        javax.swing.GroupLayout jPanel_4_headerLayout = new javax.swing.GroupLayout(jPanel_4_header);
        jPanel_4_header.setLayout(jPanel_4_headerLayout);
        jPanel_4_headerLayout.setHorizontalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_4_headerLayout.setVerticalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(27, 27, 27))
        );

        jLabel_image_2.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image_2.setOpaque(true);

        jLabel_image_3.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image_3.setOpaque(true);

        jLabel_image_1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image_1.setOpaque(true);

        jLabel_image_5.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image_5.setOpaque(true);

        jLabel_image_4.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image_4.setOpaque(true);

        javax.swing.GroupLayout jPanel_5Layout = new javax.swing.GroupLayout(jPanel_5);
        jPanel_5.setLayout(jPanel_5Layout);
        jPanel_5Layout.setHorizontalGroup(
            jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_4_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_image_5, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_5Layout.setVerticalGroup(
            jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5Layout.createSequentialGroup()
                .addComponent(jPanel_4_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_image_2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jLabel_image_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_image_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_image_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_image_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        jLabel_welcome_username.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel_welcome_username.setText("Welcome back username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_welcome_username, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_welcome_username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_manages_genresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_manages_genresActionPerformed
        ManageGenresForm mgGenres = new ManageGenresForm();
        mgGenres.setVisible(true);
    }//GEN-LAST:event_jButton_manages_genresActionPerformed

    private void jButton_manage_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_manage_authorActionPerformed
        ManageAuthorsForm1 mgAuthors = new ManageAuthorsForm1();
        mgAuthors.setVisible(true);
    }//GEN-LAST:event_jButton_manage_authorActionPerformed

    private void jButton_addMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addMemberActionPerformed
         AddMember addmember = new AddMember();
         addmember.setVisible(true);
    }//GEN-LAST:event_jButton_addMemberActionPerformed

    private void jButton_edit_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_memberActionPerformed
        EditMember editmember = new  EditMember();
         editmember.setVisible(true);
    }//GEN-LAST:event_jButton_edit_memberActionPerformed

    private void jButton_deletememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletememberActionPerformed
          deleteMember deleteMember = new  deleteMember();
         deleteMember.setVisible(true);
    }//GEN-LAST:event_jButton_deletememberActionPerformed

    private void jButton_memberListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_memberListActionPerformed
        MemberList mlist = new   MemberList();
         mlist.setVisible(true);
    }//GEN-LAST:event_jButton_memberListActionPerformed

    private void jButton_addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addbookActionPerformed
       AddBookForm addbook= new AddBookForm();
       addbook.setVisible(true);
    }//GEN-LAST:event_jButton_addbookActionPerformed

    private void jButton_edit_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_edit_bookActionPerformed
         EditBookForm editbook = new  EditBookForm();
        editbook.setVisible(true);
    }//GEN-LAST:event_jButton_edit_bookActionPerformed

    private void jButton_delete_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_bookActionPerformed
         DeleteBookForm deletebook = new   DeleteBookForm();
        deletebook.setVisible(true);
    }//GEN-LAST:event_jButton_delete_bookActionPerformed

    private void jButton_booklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_booklistActionPerformed
         BookListForm booklist = new BookListForm();
          booklist.setVisible(true);

    }//GEN-LAST:event_jButton_booklistActionPerformed

    private void jButton_returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_returnBookActionPerformed
         ReturnBookForm returnbook = new ReturnBookForm();
          returnbook.setVisible(true);
    }//GEN-LAST:event_jButton_returnBookActionPerformed

    private void jButton_issue_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_issue_bookActionPerformed
       issueBookForm issuebook = new issueBookForm();
          issuebook.setVisible(true);
    }//GEN-LAST:event_jButton_issue_bookActionPerformed

    private void jButton_manage_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_manage_userActionPerformed
        ManageUserForm mnguser = new ManageUserForm();
          mnguser.setVisible(true);
    }//GEN-LAST:event_jButton_manage_userActionPerformed

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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addMember;
    private javax.swing.JButton jButton_addbook;
    private javax.swing.JButton jButton_booklist;
    private javax.swing.JButton jButton_delete_book;
    private javax.swing.JButton jButton_deletemember;
    private javax.swing.JButton jButton_edit_book;
    private javax.swing.JButton jButton_edit_member;
    public javax.swing.JButton jButton_issue_book;
    private javax.swing.JButton jButton_manage_author;
    public javax.swing.JButton jButton_manage_user;
    private javax.swing.JButton jButton_manages_genres;
    private javax.swing.JButton jButton_memberList;
    public javax.swing.JButton jButton_returnBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1_dashboard_logo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_authorCount;
    private javax.swing.JLabel jLabel_books_Count;
    public javax.swing.JLabel jLabel_circulation;
    private javax.swing.JLabel jLabel_image_1;
    private javax.swing.JLabel jLabel_image_2;
    private javax.swing.JLabel jLabel_image_3;
    private javax.swing.JLabel jLabel_image_4;
    private javax.swing.JLabel jLabel_image_5;
    public javax.swing.JLabel jLabel_line;
    private javax.swing.JLabel jLabel_memberCount;
    public javax.swing.JLabel jLabel_welcome_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4_header;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_header;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4_header;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
}
