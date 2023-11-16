/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemperpus;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
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
        scaleImage();
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
        ButtonBack = new javax.swing.JButton();
        LabelInformasiKontak1 = new javax.swing.JLabel();
        LabelAlamatAnggota1 = new javax.swing.JLabel();
        inputMemberID = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        inputPhoneNumber = new javax.swing.JTextField();
        inputAddress = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        memberTable = new javax.swing.JTable();
        gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelDaftarAnggota1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        LabelDaftarAnggota1.setForeground(new java.awt.Color(255, 255, 255));
        LabelDaftarAnggota1.setText("Daftar Anggota");
        getContentPane().add(LabelDaftarAnggota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 38, -1, -1));

        buttonTambah.setBackground(new java.awt.Color(255, 153, 153));
        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        LabelIDAnggota1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelIDAnggota1.setForeground(new java.awt.Color(255, 255, 255));
        LabelIDAnggota1.setText("ID Anggota         :");
        getContentPane().add(LabelIDAnggota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 86, 100, 30));

        buttonEdit.setBackground(new java.awt.Color(255, 153, 153));
        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        LabelNamaAnggota1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelNamaAnggota1.setForeground(new java.awt.Color(255, 255, 255));
        LabelNamaAnggota1.setText("Nama Anggota   :");
        getContentPane().add(LabelNamaAnggota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, -1));

        buttonHapus.setBackground(new java.awt.Color(255, 153, 153));
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        ButtonBack.setBackground(new java.awt.Color(255, 153, 153));
        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        LabelInformasiKontak1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelInformasiKontak1.setForeground(new java.awt.Color(255, 255, 255));
        LabelInformasiKontak1.setText("Informasi Kontak :");
        getContentPane().add(LabelInformasiKontak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 186, -1, -1));

        LabelAlamatAnggota1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelAlamatAnggota1.setForeground(new java.awt.Color(255, 255, 255));
        LabelAlamatAnggota1.setText("Alamat Anggota :");
        getContentPane().add(LabelAlamatAnggota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 226, 100, -1));

        inputMemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMemberIDActionPerformed(evt);
            }
        });
        getContentPane().add(inputMemberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 93, 296, -1));
        getContentPane().add(inputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 296, -1));
        getContentPane().add(inputPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 183, 296, -1));

        inputAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddressActionPerformed(evt);
            }
        });
        getContentPane().add(inputAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 223, 296, -1));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 317, 632, -1));
        getContentPane().add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -5, 680, 790));

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
            inputMemberID.setText("");
            inputName.setText("");
            inputPhoneNumber.setText("");
            inputAddress.setText("");
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
            inputMemberID.setText("");
            inputName.setText("");
            inputPhoneNumber.setText("");
            inputAddress.setText("");
            TableMember();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed
public void scaleImage(){
        ImageIcon icon = new ImageIcon("2.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(gambar.getWidth(), gambar.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        gambar.setIcon(scaledIcon);
    }
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
    private javax.swing.JButton ButtonBack;
    private javax.swing.JLabel LabelAlamatAnggota1;
    private javax.swing.JLabel LabelDaftarAnggota1;
    private javax.swing.JLabel LabelIDAnggota1;
    private javax.swing.JLabel LabelInformasiKontak1;
    private javax.swing.JLabel LabelNamaAnggota1;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel gambar;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputMemberID;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhoneNumber;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable memberTable;
    // End of variables declaration//GEN-END:variables
}
