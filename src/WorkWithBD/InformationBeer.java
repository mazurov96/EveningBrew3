/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkWithBD;

import PrintFavorite.DataFav;
import PrintFavorite.ReadDataFav;
import PrintInfoBeer.JTabBM;
import PrintInfoBeer.ReadDataBM;
import addClasses.AddFav;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.table.TableModel;



/**
 *
 * @author Nikita
 */
public class InformationBeer extends javax.swing.JFrame {

    static InformationBeer stframe = new  InformationBeer();
    static JTabBM tableBM;
    public static void openframe(){
        stframe.setVisible(true);
        tableBM.update();
        
    
    }
    
    public static void closeframe(){
        stframe.setVisible(false);
    }
    public InformationBeer() {
        ReadDataBM data=new ReadDataBM();
        tableBM=new JTabBM(data.ReadData());
        
        
        initComponents();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 700));

        jPanel2.setForeground(new java.awt.Color(255, 51, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(1100, 700));
        jPanel2.setLayout(null);

        jTable1.setModel(tableBM);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(110, 80, 860, 410);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Для добавления в избранное наведите на название пива и нажмите правую кнопку мыши");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(110, 500, 860, 40);

        jButton1.setText("Добавить пиво");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(50, 550, 130, 30);

        jButton2.setText("Обновить таблицу");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(200, 550, 150, 30);

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Time");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(100, 340, 70, 40);

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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      jTextField1.setText("Для добавления в избранное наведите"
                  + " на название пива и нажмите правую кнопку мыши");
      InformationBeer.closeframe();
      InformBDFrame.openframe();
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ReadDataBM data=new ReadDataBM();
        tableBM=new JTabBM(data.ReadData());
        jTable1.setModel(tableBM);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("Для добавления в избранное наведите"
                  + " на название пива  и нажмите правую кнопку мыши");
        InformationBeer.closeframe();;
        AddBeers.openframe();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if(evt.getButton() == MouseEvent.BUTTON3) {
          int column = jTable1.columnAtPoint(evt.getPoint());
          int row = jTable1.rowAtPoint(evt.getPoint());
          jTable1.setColumnSelectionInterval(column, column);
          jTable1.setRowSelectionInterval(row, row);
          if(column==0){
              TableModel model = jTable1.getModel();
              Object name = model.getValueAt(row, column);
              ReadDataFav favdata = new ReadDataFav();
              if(searchName(name.toString(),favdata.ReadData())) 
                  jTextField1.setText("Это пиво уже добавлено в избранное");
              else {AddFav myfav = new AddFav();
                    Object fortress = model.getValueAt(row, 1);
                    Object color = model.getValueAt(row, 2);
                    Object vessel = model.getValueAt(row, 3);
                    Object spec = model.getValueAt(row, 4);
                    Object address = model.getValueAt(row, 5);
                    Object price = model.getValueAt(row, 6);
                    myfav.add(name.toString(), fortress.toString(), 
                              color.toString(), vessel.toString(),
                              spec.toString(), address.toString(),
                              price.toString());
                  jTextField1.setText("Пиво добавлено в избранное");
              }
              
          }
          else jTextField1.setText("Для добавления в избранное наведите"
                  + " на название пива  и нажмите правую кнопку мыши");
              
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    public boolean searchName(String x, ArrayList<DataFav> y){
        if(y==null) return false;
   
        
        for(int i=0; i<y.size(); i++){
            if( x.contains(y.get(i).putName()) ) return true; 
                                           
        }
        
        return false;
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
            java.util.logging.Logger.getLogger(InformationBeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformationBeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformationBeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformationBeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
