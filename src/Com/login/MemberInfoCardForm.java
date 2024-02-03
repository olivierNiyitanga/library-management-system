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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rocky
 */
public class MemberInfoCardForm extends javax.swing.JFrame {
    
 MyClass.Member member=new   MyClass.Member();
    MyClass.Func_Class func=new  MyClass.Func_Class();
    MyClass.Authors author=new  MyClass.Authors();
    MyClass.Genre genre=new  MyClass.Genre();
    
    public MemberInfoCardForm(int member_id) {
        initComponents();
        this.setLocationRelativeTo(null);
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1,152,117));
       jPanel1.setBorder(panelHeaderBorder);
                            func.displayImage(
    90,
    60,null,
    "/com/image/member.png",
    jLabel_formTitle);
                         func.displayImage(170,
    170,null,
    "/com/image/blank.png",
    jLabel_image_
);
  
   Border jLabel_imageBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0,0,0));
       jLabel_image_.setBorder(jLabel_imageBorder);
       displayMemberInfo(member_id);
    }
public void displayMemberInfo(int _member_id){
try {
    MyClass.Member selectedmember = member.getMemberById(_member_id);
    if (selectedmember != null) {
        jLabel_id.setText(String.valueOf(selectedmember.getId()));
        jLabel_fillname.setText(selectedmember.getFirstName() + " " + selectedmember.getLastName());
        jLabel_Gender.setText(selectedmember.getGender());
        jLabel_phone.setText(selectedmember.getPhone());
        jLabel_email.setText(selectedmember.getEmail());

        byte[] image = selectedmember.getPicture();
        if (image != null) {
            func.displayImage(217, 290, image, " ", jLabel_image_);
        } else {
            jLabel_image_.setIcon(null);
        }
    } else {
        
        jLabel_image_.setIcon(null); 
    }
} catch (SQLException ex) {
    Logger.getLogger(MemberInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel_id = new javax.swing.JLabel();
        jLabel_fillname = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_phone = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_formTitle.setBackground(new java.awt.Color(1, 152, 117));
        jLabel_formTitle.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel_formTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_formTitle.setText("Member info card");
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

        jLabel_image1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image1.setOpaque(true);

        jLabel_image_.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_image_.setOpaque(true);

        jLabel_id.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_id.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_id.setText("ID");

        jLabel_fillname.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel_fillname.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_fillname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_fillname.setText("FullName");

        jLabel_email.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_email.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_email.setText("Email:");

        jLabel_phone.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_phone.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_phone.setText("Phone:");

        jLabel_Gender.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel_Gender.setForeground(new java.awt.Color(0, 102, 153));
        jLabel_Gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Gender.setText("Gender:");

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
                .addComponent(jLabel_image_, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_fillname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 473, Short.MAX_VALUE)))
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
                        .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_fillname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_image_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_image1)
                    .addGap(0, 322, Short.MAX_VALUE)))
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
            java.util.logging.Logger.getLogger(MemberInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MemberInfoCardForm(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_fillname;
    private javax.swing.JLabel jLabel_formTitle;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JLabel jLabel_image_;
    private javax.swing.JLabel jLabel_phone;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
