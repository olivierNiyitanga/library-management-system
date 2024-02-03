/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.login;

import MyClass.Authors;
import MyClass.Member;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class MemberList extends javax.swing.JFrame {
    
 MyClass.Member member=new  MyClass.Member();
    MyClass.Func_Class func=new  MyClass.Func_Class();
    public MemberList() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1,152,117));
       jPanel1.setBorder(panelHeaderBorder);
       populatedJtabledWithMemeberList();
       
                            func.displayImage(
    90,
    60,null,
    "/com/image/member.png",
    jLabel_formTitle);
                         func.displayImage(
    170,
    170,null,
    "/com/image/blank.png",
    jLabel_image
);
   jTable_.setSelectionBackground(new Color(249,105,14));
   jTable_.setSelectionForeground(Color.white);
   jTable_.setRowHeight(30);
   jTable_.setShowGrid(false);
   jTable_.setBackground(new Color(248,248,248));
   jTable_.setShowHorizontalLines(true);
   jTable_.setGridColor(Color.orange);
   jTable_.getTableHeader().setBackground(new Color(36,37,42));
   jTable_.getTableHeader().setForeground(Color.white);
   jTable_.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,18));
   jTable_.getTableHeader().setOpaque(false);
   Border jLabel_imageBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0,0,0));
       jLabel_image.setBorder(jLabel_imageBorder);
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
        jTable_.setModel(model);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_formTitle = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ = new javax.swing.JTable();
        jButton_Search = new javax.swing.JButton();
        jLabel_image1 = new javax.swing.JLabel();
        jLabel_image = new javax.swing.JLabel();
        jLabel_full = new javax.swing.JLabel();
        jLabel_phone = new javax.swing.JLabel();
        jLabel_gender = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_formTitle.setBackground(new java.awt.Color(1, 152, 117));
        jLabel_formTitle.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel_formTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_formTitle.setText("MEMBER LIST");
        jLabel_formTitle.setOpaque(true);

        jLabel_close.setBackground(new java.awt.Color(1, 152, 117));
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

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("VALUE TO SEARCH:");

        jTextField_Search.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jTable_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_);

        jButton_Search.setText("Search");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jLabel_image1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image1.setOpaque(true);

        jLabel_image.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_image.setOpaque(true);

        jLabel_full.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_full.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_full.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_full.setText("Full Name:");

        jLabel_phone.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_phone.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_phone.setText("Phone number:");

        jLabel_gender.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_gender.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_gender.setText("gender:");

        jLabel_email.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_email.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_email.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_full, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_full, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable_.getModel();

    // Check if there is data in the table
    if (model.getRowCount() > 0) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable_.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(jTextField_Search.getText()));

        // Check if any rows match the filter
        if (jTable_.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No matching rows found.", "Search Result", 2);
        }
    } else {
        JOptionPane.showMessageDialog(this, "The table is empty.", "Search Result", 3);
    }


    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jTable_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_MouseClicked
        Member selectedMember;
        try {
            Integer rowIndex=jTable_.getSelectedRow();
            int id = Integer.parseInt(jTable_.getModel().getValueAt(rowIndex, 0).toString());
            selectedMember = member.getMemberById(id);
            if (selectedMember !=null){
                                  
        jLabel_full.setText(selectedMember.getFirstName()+" "+selectedMember.getLastName());
        jLabel_phone.setText(selectedMember.getPhone());
        jLabel_email.setText(selectedMember.getEmail());
        jLabel_gender.setText(selectedMember.getGender());

        byte[] image = selectedMember.getPicture();

        // Check if the image data is not null before displaying
      
                               func.displayImage(
    90,
    60,image,
    " ",
    jLabel_image
);  
            }
            else{
                JOptionPane.showMessageDialog(null, "NO MEBER WITH THIS ID IS FOUND ", " INVALID ID", 3); 
            }

        } catch (SQLException | NumberFormatException ex) {
           // Logger.getLogger(EditMember.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "Enter Valid Member Id", " INVALID ID", 3);
        }
    }//GEN-LAST:event_jTable_MouseClicked

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
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_formTitle;
    private javax.swing.JLabel jLabel_full;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JLabel jLabel_phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables
}
