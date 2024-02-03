/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.login;

import MyClass.DB;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Rocky
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
        initComponents();
        this.setResizable(false);
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("user.PNG")));
    Border jlabelBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black);
    jLabel_login.setBorder(jlabelBorder);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
    
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jLabel_login = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 480, 130));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/image/Library (2).png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 80));

        jLabel2.setBackground(new java.awt.Color(0, 51, 255));
        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Library management system");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 290, 40));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 230, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 140));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOG IN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("USERNAME:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 36, 120, -1));

        jTextField_username.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextField_username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel4.add(jTextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 420, 40));

        jPasswordField_1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jPasswordField_1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel4.add(jPasswordField_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, 40));

        jLabel_login.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_login.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_login.setText("Login>>>");
        jLabel_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_login.setOpaque(true);
        jLabel_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_loginMouseReleased(evt);
            }
        });
        jPanel4.add(jLabel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 210, 40));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("password:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 480, 240));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseClicked
       String username = jTextField_username.getText();
String password =String.valueOf(jPasswordField_1.getPassword());


if (jTextField_username.getText().trim().isEmpty() || new String(jPasswordField_1.getPassword()).trim().isEmpty()) {
    JOptionPane.showMessageDialog(null,"Enter username and password ","empty fields", 2);
    
} else {
MyClass.Users users= new MyClass.Users().trylogin(username, password);
 if( users!=null){
dashboardJFrame dash = new dashboardJFrame(); 
if(users.getUserType().equals("admin")){
dash.jButton_manage_user.setVisible(false);
 }
else if(users.getUserType().equals("user")){
 dash.jButton_issue_book.setVisible(false);
dash.jButton_returnBook.setVisible(false);
dash.jLabel_line.setVisible(false);
dash.jLabel_circulation.setVisible(false);
 dash.jButton_manage_user.setVisible(false); 
                        
 }
dash.jLabel_welcome_username.setText("Welcome back "+users.getUsername());
dash.setVisible(true);
 this.dispose();
 }else{
JOptionPane.showMessageDialog(null,"invalid username and password ","wrong data", 2);
}
}
    }//GEN-LAST:event_jLabel_loginMouseClicked

    private void jLabel_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseEntered
       jLabel_login.setBackground(new Color(236,240,241));
    }//GEN-LAST:event_jLabel_loginMouseEntered

    private void jLabel_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseExited
        jLabel_login.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabel_loginMouseExited

    private void jLabel_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMousePressed
        jLabel_login.setBackground(new Color(108,122,137));
    }//GEN-LAST:event_jLabel_loginMousePressed

    private void jLabel_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_loginMouseReleased
        jLabel_login.setBackground(new Color(236,240,241));
    }//GEN-LAST:event_jLabel_loginMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
