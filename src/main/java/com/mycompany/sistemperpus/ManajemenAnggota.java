/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemperpus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author HP
 */
public class ManajemenAnggota extends javax.swing.JFrame {

    /**
     * Creates new form ManajemenAnggota
     */
    public ManajemenAnggota() {
        initComponents();
        TableMember();
    }
    
    public void TableMember(){
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = null;
        try{
            statement = connection.createStatement();
            String sql = "SELECT * FROM member";
            ResultSet result = statement.executeQuery(sql);
            
            // memasukkan model tabel ke dalam tabel model
            DefaultTableModel tableModel = (DefaultTableModel) memberTable.getModel();
            tableModel.setRowCount(0);
            while(result.next()){
                String memberID = result.getString("member_id");
                String name = result.getString("name");
                String phoneNumber = result.getString("phone_number");
                String address = result.getString("address");
                
                // memasukkan data ke dalam tabel
                String tableData[] = {memberID, name, phoneNumber, address};
                tableModel.addRow(tableData);
            }
        }catch(SQLException e){
            System.out.println(e);
        }   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelDaftarAnggota1 = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        LabelIDAnggota1 = new javax.swing.JLabel();
        buttonEdit = new javax.swing.JButton();
        LabelNamaAnggota1 = new javax.swing.JLabel();
        buttonHapus = new javax.swing.JButton();
        LabelInformasiKontak1 = new javax.swing.JLabel();
        LabelAlamatAnggota1 = new javax.swing.JLabel();
        inputMemberID = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        inputPhoneNumber = new javax.swing.JTextField();
        inputAddress = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        memberTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelDaftarAnggota1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        LabelDaftarAnggota1.setText("Daftar Anggota");

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        LabelIDAnggota1.setText("ID Anggota         :");

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        LabelNamaAnggota1.setText("Nama Anggota   :");

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        LabelInformasiKontak1.setText("Informasi Kontak :");

        LabelAlamatAnggota1.setText("Alamat Anggota :");

        inputMemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMemberIDActionPerformed(evt);
            }
        });

        inputAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddressActionPerformed(evt);
            }
        });

        memberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Anggota", "Nama Anggota", "Informasi Kontak", "Alamat Anggota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        memberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(memberTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 257, Short.MAX_VALUE)
                .addComponent(LabelDaftarAnggota1)
                .addGap(256, 256, 256))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelInformasiKontak1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelAlamatAnggota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelIDAnggota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelNamaAnggota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputMemberID)
                            .addComponent(inputName)
                            .addComponent(inputPhoneNumber)
                            .addComponent(inputAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(buttonTambah)
                        .addGap(69, 69, 69)
                        .addComponent(buttonEdit)
                        .addGap(70, 70, 70)
                        .addComponent(buttonHapus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LabelDaftarAnggota1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelIDAnggota1)
                    .addComponent(inputMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNamaAnggota1)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelInformasiKontak1)
                    .addComponent(inputPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAlamatAnggota1)
                    .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonEdit)
                    .addComponent(buttonHapus))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        String memberID = inputMemberID.getText();
        Connection connection = DatabaseConnection.getConnection();
        try{
            String sql = "DELETE FROM member WHERE member_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberID);
            preparedStatement.executeUpdate();
            TableMember();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something wrong", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void inputAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAddressActionPerformed

    private void inputMemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMemberIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMemberIDActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // menambahkan data saat button tambah dipencet
        String memberID = inputMemberID.getText();
        String name = inputName.getText();
        String phoneNumber = inputPhoneNumber.getText();
        String address = inputAddress.getText();
        
        Connection connection = DatabaseConnection.getConnection();
        try{
            String sql = "INSERT into member (member_id, name, phone_number, address) value (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberID);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, phoneNumber);
            preparedStatement.setString(4, address);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Member successfully added", "Success", JOptionPane.INFORMATION_MESSAGE);
            TableMember();
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Something wrong", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void memberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberTableMouseClicked
        // meletakkan baris data di tabel ke dalam text field saat diklik
        int i = memberTable.getSelectedRow();
        TableModel model = memberTable.getModel();
        inputMemberID.setText(model.getValueAt(i, 0).toString());
        inputName.setText(model.getValueAt(i, 1).toString());
        inputPhoneNumber.setText(model.getValueAt(i, 2).toString());
        inputAddress.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_memberTableMouseClicked

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        String memberID = inputMemberID.getText();
        String name = inputName.getText();
        String phoneNumber = inputPhoneNumber.getText();
        String address = inputAddress.getText();
        
        // mengambil memberID lama dari tabel
        int i = memberTable.getSelectedRow();
        TableModel model = memberTable.getModel();
        String lastMemberID = model.getValueAt(i, 0).toString();
        
        Connection connection = DatabaseConnection.getConnection();
        try{
            String sql = "UPDATE member SET member_id=?, name=?, phone_number=?, address=? WHERE member_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberID);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, phoneNumber);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, lastMemberID);
            preparedStatement.executeUpdate();
            TableMember();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(ManajemenAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajemenAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajemenAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajemenAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ManajemenAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAlamatAnggota1;
    private javax.swing.JLabel LabelDaftarAnggota1;
    private javax.swing.JLabel LabelIDAnggota1;
    private javax.swing.JLabel LabelInformasiKontak1;
    private javax.swing.JLabel LabelNamaAnggota1;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputMemberID;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhoneNumber;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable memberTable;
    // End of variables declaration//GEN-END:variables
}
