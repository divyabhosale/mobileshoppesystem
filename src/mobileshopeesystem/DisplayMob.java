/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileshopeesystem;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author TEJU
 */
public class DisplayMob extends javax.swing.JFrame {
Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
    Session session=cluster.connect();
   public String selectphone="";
   public Welcome w=new Welcome();
   
    /**
     * Creates new form DisplayMob
     */
    public DisplayMob() throws Exception{
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mobile Shopee Management System");

        jLabel2.setText("Enter model_no u want to purchase");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Samsung galaxy S8", "Samsung galaxy on8", "Samsung Galaxy Grand", "Samsun Galaxy s3", "Moto g4", "Moto g5 plus", "Moto e3", "Moto g plus", "Samsung on7 pro", "Vivo v5", "Vivo y211", "Intex aqua q7n", "Micromax Canvas Nitro", "Oppo a37", "Honor holly2", "Lava iris fuel", "Lava a97", "Coolpad Mega", "Coolpad note5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Avialable Mobiles");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SHOW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CONFIRM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
    		Session s4=cluster.connect("mobiledata");
    		
    		//String value1=tf25.getText();
    		
    		
    		
    		String q5="select * from mobiledetails;";
    		ResultSet rs=s4.execute(q5);
    		String s=rs.all().toString().replace("Row[","[");
    		//String result1=result.replace("]","");
    		//String result2=result.replace("[","");
    		String row;
    	    System.out.println(s);
    	    
    		//String result=rs.all().toString().substring(5).replace("]", "");
    	/*  char[] resArr=result2.toCharArray();
    	  int counter=0;
    	  for(int i=0;i<resArr.length;i++)
    	  {
    		  if(resArr[i]!='[' && resArr[i]!=']')
    		  {
    			  if(resArr[i]==','){
    			  counter++;
    			  }
    		  }
    	  }
    	  System.out.println("ccccccccccccc"+counter);
    	  */
    	    
    	 // Split on this delimiter
    	    String[] rows = s.split("], \\[");
    	    for (int i = 0; i < rows.length; i++) {
    	        // Remove any beginning and ending braces and any white spaces
    	        rows[i] = rows[i].replace("[[", "").replace("]]", "").replaceAll(" ", "");
    	    }

    	    // Get the number of columns in a row
    	    int numberOfColumns = rows[0].split(",").length;

    	    // Setup your matrix
    	    String[][] matrix = new String[rows.length][numberOfColumns];

    	    // Populate your matrix
    	    for (int i = 0; i < rows.length; i++) {
    	        matrix[i] = rows[i].split(",");
    	    }
    	    // Display your matrix
    	    System.out.println(Arrays.deepToString(matrix));
    	    
    	    
            JFrame f = new JFrame("Table Example");  
              
                            String column[]={ " model_no","bcamera","color","compnay","fcamera","imei_no","os","price","processor","qty","ram","storage"};         
                           // String column[]={"ID","NAME","SALARY"};         
                            
                           // final JTable jt=new JTable(data,column);    
                            final JTable jt=new JTable(matrix,column);    
                            
                            jt.setCellSelectionEnabled(true);  
            ListSelectionModel select= jt.getSelectionModel();  
            select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
            select.addListSelectionListener(new ListSelectionListener() {  
              public void valueChanged(ListSelectionEvent e) {  
                String Data = null;  
                int[] row = jt.getSelectedRows();  
                int[] columns = jt.getSelectedColumns();  
                for (int i = 0; i < row.length; i++) {  
                  for (int j = 0; j < columns.length; j++) {  
                    Data = (String) jt.getValueAt(row[i], columns[j]);  
                  } }  
                System.out.println("Table element selected is: " + Data);    
              }       

           // @Override
           // public void valueChanged(ListSelectionEvent e) {
           //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           // }
            });
            JScrollPane sp=new JScrollPane(jt);    
            f.add(sp);  
            f.setSize(300, 200);  
            f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        selectphone=jComboBox1.getSelectedItem().toString();
        System.out.println("select"+selectphone);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String q5="select * from mobiledetails where model_no='"+selectphone+"';";
                Session s4=cluster.connect("mobiledata");
    		ResultSet rs=s4.execute(q5);
                String s=rs.all().toString().replace("Row[","[");
    		String row;
    	    //System.out.println(s);
    	    
    	    
    	 // Split on this delimiter
    	    String[] rows = s.split("], \\[");
    	    for (int i = 0; i < rows.length; i++) {
    	        // Remove any beginning and ending braces and any white spaces
    	        rows[i] = rows[i].replace("[[", "").replace("]]", "").replaceAll(" ", "");
    	    }

    	    // Get the number of columns in a row
    	    int numberOfColumns = rows[0].split(",").length;

    	    // Setup your matrix
    	    String[][] matrix = new String[rows.length][numberOfColumns];

    	    // Populate your matrix
    	    for (int i = 0; i < rows.length; i++) {
    	        matrix[i] = rows[i].split(",");
    	    }
            
    	    // Display your matrix
            
    	    System.out.println(Arrays.deepToString(matrix));
    	    for (int i = 0; i <rows.length ; i++) {System.out.println("\n");
                for (int j = 0; j < numberOfColumns; j++) {
                    System.out.println("\t"+matrix[i][j]);
                }
        }
    	    
            JFrame f = new JFrame("Table Example");  
             String column[]={ " model_no","bcamera","color","compnay","fcamera","imei_no","os","price","processor","qty","ram","storage"};         
                           final JTable jt=new JTable(matrix,column);    
                            
                            jt.setCellSelectionEnabled(true);  
            ListSelectionModel select1= jt.getSelectionModel();  
            select1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
            select1.addListSelectionListener(new ListSelectionListener() {  
              public void valueChanged(ListSelectionEvent e) {  
                String Data = null;  
                int[] row = jt.getSelectedRows();  
                int[] columns = jt.getSelectedColumns();  
                for (int i = 0; i < row.length; i++) {  
                  for (int j = 0; j < columns.length; j++) {  
                    Data = (String) jt.getValueAt(row[i], columns[j]);  
                  } }  
                System.out.println("Table element selected is: " + Data);    
              }       

           // @Override
           // public void valueChanged(ListSelectionEvent e) {
           //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           // }
            });
            JScrollPane sp=new JScrollPane(jt);    
            f.add(sp);  
            f.setSize(500, 200);  
            f.setVisible(true);
         
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
                           
    try {
         customerinfo n;                    
        n = new customerinfo(this,w);
        n.setVisible(true);
    } catch (IOException ex) {
        Logger.getLogger(DisplayMob.class.getName()).log(Level.SEVERE, null, ex);
    }
                            
            
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayMob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayMob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayMob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayMob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DisplayMob().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(DisplayMob.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
