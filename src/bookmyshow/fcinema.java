/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fcinema.java
 *
 * Created on Jan 17, 2017, 12:33:01 AM
 */

package bookmyshow;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author students
 */
public class fcinema extends javax.swing.JFrame {
    
    public fcinema() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        check = new javax.swing.JButton();
        film = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        seat = new javax.swing.JTextField();
        morningshow = new javax.swing.JRadioButton();
        matinee = new javax.swing.JRadioButton();
        firstshow = new javax.swing.JRadioButton();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        check.setText("CHECK");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));
        getContentPane().add(film, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 193, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FILM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 62, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DATE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NO OF SEATS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 104, -1, 30));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 124, -1));
        getContentPane().add(seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 50, -1));

        morningshow.setText("MORNING SHOW");
        morningshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                morningshowActionPerformed(evt);
            }
        });
        getContentPane().add(morningshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        matinee.setText("MATINEE");
        matinee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matineeActionPerformed(evt);
            }
        });
        getContentPane().add(matinee, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        firstshow.setText("FIRST SHOW");
        firstshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstshowActionPerformed(evt);
            }
        });
        getContentPane().add(firstshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 318, -1, -1));

        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 547, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookmyshow/movie-film-background-in-abstract-style_23-2147506185 (4).jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
        String str1=film.getText();
        status.fn=str1;
        String str2=seat.getText();
        int s=Integer.parseInt(str2);
        status.seat=s;
        String str3=date.getText();
        status.dat=str3;
        
        this.dispose();
        new bookshow().setVisible(true);
        
}//GEN-LAST:event_checkActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new usermain().setVisible(true);
        
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new entry().setVisible(true);
        
    }//GEN-LAST:event_logoutActionPerformed

    private void morningshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morningshowActionPerformed
        // TODO add your handling code here:
        String a="morn";
        status.ch=a;
    }//GEN-LAST:event_morningshowActionPerformed

    private void matineeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matineeActionPerformed
        // TODO add your handling code here:
        String a="mat";
        status.ch=a;
    }//GEN-LAST:event_matineeActionPerformed

    private void firstshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstshowActionPerformed
        // TODO add your handling code here:
        String a="first";
        status.ch=a;
    }//GEN-LAST:event_firstshowActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fcinema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton back;
    javax.swing.JButton check;
    javax.swing.JTextField date;
    javax.swing.JTextField film;
    javax.swing.JRadioButton firstshow;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JButton logout;
    javax.swing.JRadioButton matinee;
    javax.swing.JRadioButton morningshow;
    javax.swing.JTextField seat;
    // End of variables declaration//GEN-END:variables

}
