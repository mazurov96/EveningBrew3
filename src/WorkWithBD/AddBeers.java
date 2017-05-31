/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkWithBD;


import PrintInfoBeer.DataBM;
import PrintInfoBeer.ReadDataBM;
import addClasses.AddBeer;

import java.util.ArrayList;

/**
 *
 * @author Nikita
 */
public class AddBeers extends javax.swing.JFrame {

    static AddBeers stframe = new AddBeers();
    
    public static void openframe(){
        stframe.setVisible(true);
    }
    
    public static void closeframe(){
        stframe.setVisible(false);
    }
    public AddBeers() {
        initComponents();
    }
    public void currentTime(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaName = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaFortress = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaColor = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaVessel = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreSpec = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaPrice = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 700));

        jPanel2.setForeground(new java.awt.Color(255, 51, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(1100, 700));
        jPanel2.setLayout(null);

        jTextAreaName.setColumns(20);
        jTextAreaName.setRows(5);
        jScrollPane1.setViewportView(jTextAreaName);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(120, 10, 400, 100);

        jTextAreaFortress.setColumns(20);
        jTextAreaFortress.setRows(5);
        jScrollPane2.setViewportView(jTextAreaFortress);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(700, 10, 400, 100);

        jTextAreaColor.setColumns(20);
        jTextAreaColor.setRows(5);
        jScrollPane3.setViewportView(jTextAreaColor);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(120, 140, 400, 110);

        jTextAreaVessel.setColumns(20);
        jTextAreaVessel.setRows(5);
        jScrollPane4.setViewportView(jTextAreaVessel);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(700, 140, 400, 110);

        jTextAreSpec.setColumns(20);
        jTextAreSpec.setRows(5);
        jScrollPane5.setViewportView(jTextAreSpec);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(120, 470, 980, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Название");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 30, 90, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Крепость");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(590, 30, 90, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Цвет");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 160, 90, 70);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Упаковка");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(580, 160, 110, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Особенности");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 490, 100, 70);

        jButton9.setBackground(new java.awt.Color(51, 51, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 51, 51));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/vyihod_78x78.png"))); // NOI18N
        jButton9.setText("Назад");
        jButton9.setActionCommand("Начать работу");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(280, 590, 320, 90);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Занести пиво в базу");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 600, 230, 70);

        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setRows(5);
        jScrollPane6.setViewportView(jTextAreaInfo);

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(720, 590, 330, 100);

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(5);
        jScrollPane7.setViewportView(jTextAreaAddress);

        jPanel2.add(jScrollPane7);
        jScrollPane7.setBounds(120, 280, 400, 110);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Адрес производства");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 300, 110, 70);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Цена");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(580, 300, 110, 70);

        jTextAreaPrice.setColumns(20);
        jTextAreaPrice.setRows(5);
        jScrollPane8.setViewportView(jTextAreaPrice);

        jPanel2.add(jScrollPane8);
        jScrollPane8.setBounds(700, 280, 400, 110);

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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    jTextAreaName.setText("");
    jTextAreaFortress.setText("");
    jTextAreaColor.setText("");
    jTextAreaVessel.setText("");;
    jTextAreSpec.setText("");
    jTextAreaAddress.setText("");
    jTextAreaPrice.setText("");
    jTextAreaInfo.setText("");
    AddBeers.closeframe();
    InformationBeer.openframe();
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextAreaInfo.setText("");
        ReadDataBM data=new ReadDataBM();
        ArrayList<DataBM> mydata = data.ReadData(); 
        String id = mydata.get(mydata.size()-1).putId();     
        Integer intid = Integer.parseInt(id);
        intid=intid+1;  
        id=intid.toString();
        String name = jTextAreaName.getText();
        String fortress = jTextAreaFortress.getText();
        String color =jTextAreaColor.getText();
        String vessel =jTextAreaVessel.getText();
        String spec = jTextAreSpec.getText();
        String address  =jTextAreaAddress.getText();
        String price =jTextAreaPrice.getText();
        
        
        
        if( name.isEmpty() ||
            fortress.isEmpty()||
            color.isEmpty()||
            vessel.isEmpty()||
            spec.isEmpty()||
            price.isEmpty()||
            address.isEmpty() )  jTextAreaInfo.setText("Введены не все данные");
         
        else{  
        
              if(searchName(name,mydata)) 
                 jTextAreaInfo.setText("Такое пиво уже существует");
              else {
                    AddBeer instance= new AddBeer();
                    instance.add(id,name,fortress,color,vessel,spec,address,price);
                    jTextAreaInfo.setText("Пиво занесёно");
              }
             
        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
     public boolean searchName(String x, ArrayList<DataBM> y){
        if(y==null) return false;
   
        
        for(int i=0; i<y.size(); i++){
            if( x.equalsIgnoreCase(y.get(i).putName()) ) return true; 
                                           
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
            java.util.logging.Logger.getLogger(AddBeers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBeers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBeers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBeers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AddBeers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextAreSpec;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextArea jTextAreaColor;
    private javax.swing.JTextArea jTextAreaFortress;
    private javax.swing.JTextArea jTextAreaInfo;
    private javax.swing.JTextArea jTextAreaName;
    private javax.swing.JTextArea jTextAreaPrice;
    private javax.swing.JTextArea jTextAreaVessel;
    // End of variables declaration//GEN-END:variables
}
