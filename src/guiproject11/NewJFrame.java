package guiproject11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author Dr. Milind
 */

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void Connect()
    {
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/credit_bank","root","root");
    	}
    	catch (ClassNotFoundException | SQLException ex)
    	{
    		Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE,null,ex);
    	}
    }
    
    
    
    
//    public Connection getConnection()
//    {
//    	Connection con;
//    	try 
//    	{
//    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/credit_bank","root","root");
//    		return con;
//    	}
//    	catch (Exception e)
//    	{
//    		e.printStackTrace();
//    		return null;
//    	}
//    }

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NAME :");

        jLabel2.setText("STUDENT ID :");

        jLabel3.setText("AADHAR NUMBER :");

        jLabel4.setText("CURRENT SEM :");

        jLabel5.setText("12th Board Roll No.:");

        jLabel6.setText("Branch :");

        jLabel7.setText("Phone no :");

        jButton1.setText("Register");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    /*private void registerbtnActionPerformed(java.awt.event.ActionEvent evt)
    {
//    	String jTextField1 = jTextField1.getText();
//    	int jTextField2 = Integer.parseInt(jTextField2);
//    	String jTextField2 = jTextField2.getText();
    	
    	try 
    	{
    		Connect();
    		String query = "select * from studentinformation where studentId=?";
    		String s2 = jTextField2.getText();
        	String s4 = jTextField4.getText();
    		
    		pst = con.prepareStatement(query);
    		pst.setString(1,jTextField1.getText());
        	pst.setInt(2,Integer.parseInt(s2));
        	pst.setString(3,jTextField3.getText());
        	pst.setInt(4,Integer.parseInt(s4));
        	pst.setString(5,jTextField5.getText());
        	pst.setString(6,jTextField6.getText());
        	pst.setString(7,jTextField7.getText());
//        	pst.executeUpdate();
        	
        	rs = pst.executeQuery();
        	if(rs.next())
        	{
        		String msg = "Registration Successful";
        		JOptionPane.showMessageDialog(this, msg);
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(this, "Not Registered");
        	}       	
        	
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    }*/
    
    
//    void loadSampleData ()
//    {
//    	try {
//    		Class.forName("com.jdbc.mysql.Driver");
//    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/credit_bank","root","root");
//    		java.sql.Statement st = con.createStatement();
//    		ResultSet rs = st.executeQuery("INSERT INTO `credit_bank`.`studentinformation` (`studentId`,`studentName`,`studentAadhar`,`studentAddress`,`currentSem`,`studentPhoneNo`,`branch`)VALUES(?,?,?,?,?,?,?)");
//    		
//    		
//    		
//    	}
//    	catch (Exception ex)
//    	{
//    		
//    	}
//    }
    
    

    
//    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt)
//    {
//    	try {
//    	Connection con;
//    	JDBCMySQLConnector registercon = new JDBCMySQLConnector();
//    	con = registercon.getRegisterConnection();
//    	String s2 = jTextField2.getText();
//    	String s4 = jTextField4.getText();
//    	String query = "INSERT INTO `credit_bank`.`studentinformation` (`studentId`,`studentName`,`studentAadhar`,`studentAddress`,`currentSem`,`studentPhoneNo`,`branch`)VALUES(?,?,?,?,?,?,?)";
//
//    	java.sql.PreparedStatement pst = con.prepareStatement(query);
//    	pst.setString(1,jTextField1.getText());
//    	pst.setInt(2,Integer.parseInt(s2));
//    	pst.setString(3,jTextField3.getText());
//    	pst.setInt(4,Integer.parseInt(s4));
//    	pst.setString(5,jTextField5.getText());
//    	pst.setString(6,jTextField6.getText());
//    	pst.setString(7,jTextField7.getText());
//    	pst.executeUpdate();
//    	
//    	JOptionPane.showMessageDialog(rootPane, "User Registration Succesfull");
//    	}
//    	catch (SQLException ex) {
//    		Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE,null,ex);
//    	}
//    }
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
