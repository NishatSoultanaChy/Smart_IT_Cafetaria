 
package smart_it_cafeteria_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin2 extends javax.swing.JFrame {

    Admin2() {
        initComponents();
        //getConnection();
        Show_workersdetails_in_JTable();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextWName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPasswordWPass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_workersdetails = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextWPost = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextWSalary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextWContactNumber = new javax.swing.JTextField();
        jBtnAdd = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextWID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 153));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("G:\\1_mJToUnCZHkMQZVb2SLKU5A.jpeg")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 3, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Welcome Admin!!!!!!");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setText("Submit");

        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(601, 601, 601)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Home", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Name :");

        jTextWName.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextWName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextWNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("Password :");

        jPasswordWPass.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jPasswordWPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordWPassActionPerformed(evt);
            }
        });

        jTable_workersdetails.setBackground(new java.awt.Color(153, 255, 153));
        jTable_workersdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Post", "Salary", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_workersdetails);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Post : ");

        jTextWPost.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextWPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextWPostActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("Salary : ");

        jTextWSalary.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("Contact Number  : ");

        jTextWContactNumber.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jBtnAdd.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jBtnAdd.setText("Add");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnDelete.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jBtnDelete.setText("Delete");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnUpdate.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jBtnUpdate.setText("Update");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel14.setText("ID:");

        jTextWID.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextWID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextWIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextWName)
                            .addComponent(jPasswordWPass)
                            .addComponent(jTextWPost)
                            .addComponent(jTextWSalary)
                            .addComponent(jTextWContactNumber)
                            .addComponent(jTextWID, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextWID)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextWName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordWPass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextWPost, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextWSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextWContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Workers", jPanel4);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1240, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextWIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextWIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextWIDActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        if(checkInput() && jTextWID.getText()!= null)
        {
            String UpdateQuery = null;
            PreparedStatement ps = null;

            try{
                Connection con = getConnection();

                UpdateQuery = "UPDATE workersdetails SET Name = ?, Password = ?, Post = ?, Salary = ?, Contact_Number= ? WHERE ID = ?  ";
                ps = con.prepareStatement(UpdateQuery);
                
                ps.setString(1, jTextWName.getText());
                ps.setString(2, jPasswordWPass.getText());
                ps.setString(3, jTextWPost.getText());
                ps.setDouble(4, Double.parseDouble(jTextWSalary.getText()));
                ps.setString(5, jTextWContactNumber.getText());
                ps.setInt(6, Integer.parseInt(jTextWID.getText()));
                ps.executeUpdate();
                Show_workersdetails_in_JTable();

                JOptionPane.showMessageDialog(null, "Data Updated");
            }catch(Exception ex){
                Logger.getLogger(Admin2.class.getName()).log(Level.SEVERE,null,ex);
                //JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"One or more fields are empty or wrong");
        }
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed

        if(checkInput())
        {
            try{
                Connection con = getConnection();

                PreparedStatement ps = con.prepareStatement("INSERT INTO workersdetails(ID, Name, Password, Post, Salary, Contact_Number) values(?,?,?,?,?,?)");

                ps.setInt(1, Integer.parseInt(jTextWID.getText()));
                ps.setString(2, jTextWName.getText());
                ps.setString(3, jPasswordWPass.getText());
                ps.setString(4, jTextWPost.getText());
                ps.setDouble(5, Double.parseDouble(jTextWSalary.getText()));
                ps.setString(6, jTextWContactNumber.getText());
               
                
                ps.executeUpdate();
                Show_workersdetails_in_JTable();

                JOptionPane.showMessageDialog(null, "Data Inserted");

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        else
        {
            JOptionPane.showMessageDialog(null, "One or more field are empty");
        }
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jTextWPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextWPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextWPostActionPerformed

    private void jPasswordWPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordWPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordWPassActionPerformed

    private void jTextWNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextWNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextWNameActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        if(!jTextWID.getText().equals(""))
        {
            try{
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("DELETE FROM workersdetails WHERE ID = ?");
                int id = Integer.parseInt(jTextWID.getText());
                ps.setInt(1, id);
                ps.executeUpdate();
                Show_workersdetails_in_JTable();
                
                JOptionPane.showMessageDialog(null, "Data Deleted");
            }catch(SQLException ex){
                
                Logger.getLogger(Admin2.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Data Not Deleted");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Data Not Deleted: No ID To Delete ");
        }
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Welcome obj = new Welcome();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

     public Connection getConnection()
    {
        Connection con = null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/workersdb","root", "");
          
            return con;
        } catch (SQLException ex){
            Logger.getLogger(Admin2.class.getName()).log(Level.SEVERE,null,ex);
           
            return null;
        }
        
    }
     
     public boolean checkInput()
     {
         if(jTextWID.getText()== null ||jTextWName.getText()== null ||
                 jPasswordWPass.getText()== null ||jTextWPost.getText()== null ||
                 jTextWSalary.getText()== null ||jTextWContactNumber.getText()== null )
         {
             return false;
         }
         else {
             try{
                 Float.parseFloat(jTextWSalary.getText());
                 return true;
             }catch(Exception ex)
             {
                 return false;
             }
         }
             
     }
     
     //Display data in jtable
     // 1- fill arraylist with the data
     
     public ArrayList<workersAdd> getWorkersList()
     {
         ArrayList<workersAdd> workersList = new ArrayList<workersAdd>(); 
         Connection con = getConnection();
         String query = "SELECT * FROM workersdetails";
         
         Statement st;
         ResultSet rs;
         
         try{
             st = con.createStatement();
             rs = st.executeQuery(query);
             workersAdd workrsadd;
             
             while(rs.next())
             {
                 workrsadd = new workersAdd(rs.getInt("ID"), rs.getString("Name"), rs.getString("Post"), Double.parseDouble(rs.getString("Salary")), rs.getString("Contact_Number"));
                 workersList.add(workrsadd);
                 
             }
             
             
         }catch(SQLException ex){
             Logger.getLogger(Admin2.class.getName()).log(Level.SEVERE,null, ex);
         } 
         return workersList;
     }
     
     
     //2-populate the jtable
     public void Show_workersdetails_in_JTable()
     {
         ArrayList<workersAdd> list = getWorkersList();
         DefaultTableModel model = (DefaultTableModel)jTable_workersdetails.getModel();
         
         model.setRowCount(0);
         
         Object[] row = new Object[5];
         
         for(int i=0; i< list.size(); i++)
         {
             row[0] = list.get(i).getId();
             row[1] = list.get(i).getName();
             row[2] = list.get(i).getPost();
             row[3] = list.get(i).getSalary();
             row[4] = list.get(i).getContact();
             
             model.addRow(row);
             
         }
     }

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordWPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_workersdetails;
    private javax.swing.JTextField jTextWContactNumber;
    private javax.swing.JTextField jTextWID;
    private javax.swing.JTextField jTextWName;
    private javax.swing.JTextField jTextWPost;
    private javax.swing.JTextField jTextWSalary;
    // End of variables declaration//GEN-END:variables
}
