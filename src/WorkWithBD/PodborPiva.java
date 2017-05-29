/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkWithBD;

import PrintInfoBeer.DataBM;
import PrintInfoBeer.JTabBM;
import PrintInfoBeer.ReadDataBM;


import eveningbrew.startWorkFrame;
import java.util.ArrayList;

/**
 *
 * @author Nikita
 */
public class PodborPiva extends javax.swing.JFrame {

    static PodborPiva stframe = new PodborPiva();
    static JTabBM tableBM;
    ReadDataBM z;
    ArrayList<DataBM> searchlist;
    
    public static void openframe(){
        stframe.setVisible(true);
    }
    
    public static void closeframe(){
        stframe.setVisible(false);
    }
    public PodborPiva() {
        z = new ReadDataBM();
        initComponents();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFortress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextColor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextVessel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonFortress = new javax.swing.JButton();
        jButtonColor = new javax.swing.JButton();
        jButtonVessel = new javax.swing.JButton();
        jButtonPrice = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 700));

        jPanel2.setForeground(new java.awt.Color(255, 51, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(1100, 700));
        jPanel2.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(170, 20, 110, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Название", "Крепость", "Цвет", "Упаковка","Особенности","Адрес", "Цена"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(440, 100, 630, 300);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Введите название пива:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 20, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Введите крепость:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 80, 150, 30);

        jTextFortress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFortressActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFortress);
        jTextFortress.setBounds(170, 80, 110, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Введите цвет пива:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 130, 150, 30);

        jTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextColorActionPerformed(evt);
            }
        });
        jPanel2.add(jTextColor);
        jTextColor.setBounds(170, 130, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Какая упаковка пива:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 190, 150, 30);

        jTextVessel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVesselActionPerformed(evt);
            }
        });
        jPanel2.add(jTextVessel);
        jTextVessel.setBounds(170, 190, 110, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Введите цену пива:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 250, 150, 30);

        jTextPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPriceActionPerformed(evt);
            }
        });
        jPanel2.add(jTextPrice);
        jTextPrice.setBounds(170, 250, 110, 40);

        jButton1.setText("Поиск");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(300, 20, 120, 40);

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/vyihod_78x78.png"))); // NOI18N
        jButton6.setText("Назад");
        jButton6.setActionCommand("Начать работу");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(440, 550, 280, 110);

        jButtonFortress.setText("Поиск");
        jButtonFortress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFortressActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFortress);
        jButtonFortress.setBounds(300, 80, 120, 40);

        jButtonColor.setText("Поиск");
        jPanel2.add(jButtonColor);
        jButtonColor.setBounds(300, 130, 120, 40);

        jButtonVessel.setText("Поиск");
        jPanel2.add(jButtonVessel);
        jButtonVessel.setBounds(300, 190, 120, 40);

        jButtonPrice.setText("Поиск");
        jPanel2.add(jButtonPrice);
        jButtonPrice.setBounds(300, 250, 120, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("EVENING BREW");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(760, 20, 320, 80);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/pivo2.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-90, -40, 1200, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      PodborPiva.closeframe();
      startWorkFrame.openframe();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField1.getText();
        searchlist = searchName(name,z.ReadData());
         
        jTextField1.setText("");
        jTextFortress.setText("");
        jTextColor.setText("");
        jTextVessel.setText("");
        jTextPrice.setText("");
        if(searchlist==null) jTextField1.setText("Error");
        if(searchlist.isEmpty()) {jTextField1.setText("No Data");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {           
             {null, null, null, null}
            },
         new String [] {
          "Название", "Крепость", "Цвет", "Упаковка","Особенности","Адрес",
             "Цена"
    }
));}
        else { tableBM =  new JTabBM(searchlist);
               jTable1.setModel(tableBM);      
        }
        
          
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFortressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFortressActionPerformed
       
    }//GEN-LAST:event_jTextFortressActionPerformed

    private void jTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextColorActionPerformed

    private void jTextVesselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVesselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVesselActionPerformed

    private void jTextPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPriceActionPerformed

    private void jButtonFortressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFortressActionPerformed
    String name = jTextFortress.getText();
        searchlist = searchFortress(name,z.ReadData());
         
        jTextField1.setText("");
        jTextFortress.setText("");
        jTextColor.setText("");
        jTextVessel.setText("");
        jTextPrice.setText("");
        if(searchlist==null) jTextFortress.setText("Error");
        if(searchlist.isEmpty()) {jTextFortress.setText("No Data");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {           
             {null, null, null, null}
            },
         new String [] {
          "Название", "Крепость", "Цвет", "Упаковка","Особенности","Адрес",
             "Цена"
    }
));}
        else { tableBM =  new JTabBM(searchlist);
               jTable1.setModel(tableBM);      
        }
    }//GEN-LAST:event_jButtonFortressActionPerformed
   /**
    * SD 
    * @param x - название пива, которое ищем
    * @param y - массив, по которому ищем
    * @return 
    */
    public ArrayList<DataBM> searchName(String x, ArrayList<DataBM> y){
        if(y==null) return null;
        if(x.isEmpty())   return new ArrayList<>();
        ArrayList<DataBM> result = new ArrayList<>();
        
        for(int i=0; i<y.size(); i++){
            if( y.get(i).putName().contains(x) ) 
                                           result.add(y.get(i)); 
        }
        
        return result;
    }
    
    public ArrayList<DataBM> searchFortress(String x, ArrayList<DataBM> y){
        if(y==null) return null;
        if(x.isEmpty())   return new ArrayList<>();
        ArrayList<DataBM> result = new ArrayList<>();
        
        for(int i=0; i<y.size(); i++){
            if( y.get(i).putFortress().startsWith(x) ) 
                                           result.add(y.get(i)); 
        }
        
        return result;
    }
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PodborPiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PodborPiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PodborPiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PodborPiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PodborPiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonColor;
    private javax.swing.JButton jButtonFortress;
    private javax.swing.JButton jButtonPrice;
    private javax.swing.JButton jButtonVessel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFortress;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextVessel;
    // End of variables declaration//GEN-END:variables

}
