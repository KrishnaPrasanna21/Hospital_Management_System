
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ChangePassword extends javax.swing.JFrame {
    Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        psdo = new javax.swing.JPasswordField();
        psdn = new javax.swing.JPasswordField();
        psdc = new javax.swing.JPasswordField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Old Password");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("New Password");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Confirm Password");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        psdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psdnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(psdo)
                            .addComponent(psdn)
                            .addComponent(psdc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(psdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(psdn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(psdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
         String Newpass=String.valueOf(psdn.getText());
         String ConfPass=String.valueOf(psdc.getText());
        String OldPass=String.valueOf(psdo.getText());
        String uName=txtUsername.getText();
        if (uName.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Please enter a username");
                return;
               
            } else if (OldPass.equals("")) {
            
                JOptionPane.showMessageDialog( this, "Please enter a old password");
                return;
               
            } else if (Newpass.equals("")) {
              
                JOptionPane.showMessageDialog( this, "Please enter a new password");
                return;
                
            } else if (ConfPass.equals("")) {
               
                JOptionPane.showMessageDialog( this, "Please enter a confirmed password");
                return;
            } 
               else if (Newpass.length()< 5) {
               
                JOptionPane.showMessageDialog(this,"The New Password Should be of Atleast 5 Characters");
                return;
               }
            
           
            
            else if ((Newpass).equals(OldPass)) {
                
               JOptionPane.showMessageDialog(this, "Password is same..Re-enter new password");
               return;
            }
    else if (!(Newpass).equals(ConfPass)) {
               
                JOptionPane.showMessageDialog(this,"New Password doesn't match with Confirmed Password");
                return;
            }
       
      con=Connect.ConnectDB();
      String sql= "select user_name,password from users where user_name='" + txtUsername.getText() + "' and password= '" + psdo.getText() + "'";
      pst=con.prepareStatement(sql);
      rs= pst.executeQuery();
      while(rs.next())
        {
            String usrname = rs.getString("user_name").trim();
            String passwd = rs.getString("password").trim();
            if(uName.equals(usrname) && OldPass.equals(passwd))
            {
                con=Connect.ConnectDB();
                 String sql1= "update users set password= '" + Newpass + "' where user_name= '" + uName + "' and password = '" + OldPass + "'";
                 Statement stmt = con.createStatement();
                 stmt.execute(sql1.toString());
                 stmt.close();
                 JOptionPane.showMessageDialog(this,"Password Successfully Changed");
                 this.dispose();
                 return;
              }
            else
            {
             JOptionPane.showMessageDialog(this,"invalid user name or password");   
             txtUsername.setText("");
             psdo.setText("");
             psdn.setText("");
             psdc.setText("");
             return;
            }
        }    
        }catch(SQLException | HeadlessException ex){
           JOptionPane.showMessageDialog(this,ex); 
        }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void psdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psdnActionPerformed
        
    }//GEN-LAST:event_psdnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField psdc;
    private javax.swing.JPasswordField psdn;
    private javax.swing.JPasswordField psdo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
