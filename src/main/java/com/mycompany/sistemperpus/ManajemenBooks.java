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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author user
 */
public class ManajemenBooks extends javax.swing.JFrame {

    /**
     * Creates new form ManajemenBooks
     */
    public ManajemenBooks() {
        initComponents();
        TableBooks();
        scaleImage();
    }
    public void TableBooks(){        
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try{
            // menggabungkan tabel loan_items dan books
            String sql = "SELECT * from books";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet result = preparedStatement.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
            tableModel.setRowCount(0);
            while(result.next()){
                String bookID = result.getString("book_id");
                String title = result.getString("title");
                String author = result.getString("author");
                int years = result.getInt("publication_year");
                int stock = result.getInt("available_stock");
                
                //memasukkan data ke dalam tabel
                String tableData[] = {bookID, title, author, Integer.toString(years), Integer.toString(stock)};
                tableModel.addRow(tableData);
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something wrong", "Error", JOptionPane.ERROR_MESSAGE);
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

        LabelDaftarBuku = new javax.swing.JLabel();
        LabelJudulbuku = new javax.swing.JLabel();
        LabelKodebuku = new javax.swing.JLabel();
        LabelPenulisbuku = new javax.swing.JLabel();
        LabelJumlahbukutersedia = new javax.swing.JLabel();
        InputJudulBuku = new javax.swing.JTextField();
        InputBukuId = new javax.swing.JTextField();
        InputPenulisBuku = new javax.swing.JTextField();
        InputTersedia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ButtonTambah = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        InputTahun = new javax.swing.JTextField();
        LabelTahun = new javax.swing.JLabel();
        gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelDaftarBuku.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LabelDaftarBuku.setForeground(new java.awt.Color(255, 255, 255));
        LabelDaftarBuku.setText("Daftar Buku");
        getContentPane().add(LabelDaftarBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 12, 138, -1));

        LabelJudulbuku.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelJudulbuku.setForeground(new java.awt.Color(255, 255, 255));
        LabelJudulbuku.setText("Judul Buku                    :");
        getContentPane().add(LabelJudulbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 96, 130, -1));

        LabelKodebuku.setBackground(new java.awt.Color(255, 255, 255));
        LabelKodebuku.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelKodebuku.setForeground(new java.awt.Color(255, 255, 255));
        LabelKodebuku.setText("Book ID                        :");
        getContentPane().add(LabelKodebuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 56, 128, -1));

        LabelPenulisbuku.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelPenulisbuku.setForeground(new java.awt.Color(255, 255, 255));
        LabelPenulisbuku.setText("Penulis Buku                 :");
        getContentPane().add(LabelPenulisbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 142, 130, -1));

        LabelJumlahbukutersedia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelJumlahbukutersedia.setForeground(new java.awt.Color(255, 255, 255));
        LabelJumlahbukutersedia.setText("Jumlah Buku Tersedia  :");
        getContentPane().add(LabelJumlahbukutersedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 222, 140, -1));
        getContentPane().add(InputJudulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 93, 321, -1));
        getContentPane().add(InputBukuId, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 53, 321, -1));

        InputPenulisBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPenulisBukuActionPerformed(evt);
            }
        });
        getContentPane().add(InputPenulisBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 139, 321, -1));
        getContentPane().add(InputTersedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 219, 321, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Judul Buku", "Penulis Buku", "Tahun Terbit", "Jumlah Buku Tersedia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 317, 689, -1));

        ButtonTambah.setBackground(new java.awt.Color(255, 153, 153));
        ButtonTambah.setText("Tambah");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 276, -1, -1));

        ButtonEdit.setBackground(new java.awt.Color(255, 153, 153));
        ButtonEdit.setText("Edit");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 276, -1, -1));

        ButtonHapus.setBackground(new java.awt.Color(255, 153, 153));
        ButtonHapus.setText("Hapus");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 276, -1, -1));

        ButtonBack.setBackground(new java.awt.Color(255, 153, 153));
        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 276, -1, -1));
        getContentPane().add(InputTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 179, 321, -1));

        LabelTahun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelTahun.setForeground(new java.awt.Color(255, 255, 255));
        LabelTahun.setText("Tahun Terbit                 :");
        getContentPane().add(LabelTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 182, 130, -1));
        getContentPane().add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 760, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InputPenulisBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPenulisBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPenulisBukuActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        String bookID = InputJudulBuku.getText();
        String judulBuku = InputBukuId.getText();
        String penulisBuku = InputPenulisBuku.getText();
        String tahun = InputTahun.getText();
        String tersedia = InputTersedia.getText();
        
        Connection connection = DatabaseConnection.getConnection();
        try{
            String sql = "INSERT into books (book_id, title, author, publication_year, available_stock) value (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bookID);
            preparedStatement.setString(2, judulBuku);
            preparedStatement.setString(3, penulisBuku);
            preparedStatement.setString(4, tahun);
            preparedStatement.setString(5, tersedia);
            preparedStatement.executeUpdate();
            TableBooks();
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Something wrong", "Error", JOptionPane.ERROR_MESSAGE);
            
        } 
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        String bookID = InputJudulBuku.getText();
        String judulBuku = InputBukuId.getText();
        String penulisBuku = InputPenulisBuku.getText();
        String tahun = InputTahun.getText();
        String tersedia = InputTersedia.getText();
        // mengambil memberID lama dari tabel
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String lastBookID = model.getValueAt(i, 0).toString();
        Connection connection = DatabaseConnection.getConnection();
        try{
            String sql = "UPDATE books SET book_id=?, title=?, author=?, publication_year=?, available_stock=? WHERE book_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bookID);
            preparedStatement.setString(2, judulBuku);
            preparedStatement.setString(3, penulisBuku);
            preparedStatement.setString(4, tahun);
            preparedStatement.setString(5, tersedia);
            preparedStatement.setString(6, lastBookID);
            preparedStatement.executeUpdate();
            InputJudulBuku.setText("");
            InputBukuId.setText("");
            InputPenulisBuku.setText("");
            InputTahun.setText("");
            InputTersedia.setText("");
            TableBooks();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        InputJudulBuku.setText(model.getValueAt(i, 1).toString());
        InputBukuId.setText(model.getValueAt(i, 0).toString());
        InputPenulisBuku.setText(model.getValueAt(i, 2).toString());
        InputTahun.setText(model.getValueAt(i, 3).toString());
        InputTersedia.setText(model.getValueAt(i, 4).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        String bookID = InputBukuId.getText();
        Connection connection = DatabaseConnection.getConnection();
        try{
            String sql = "DELETE FROM `books` WHERE `book_id` = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bookID);
            preparedStatement.executeUpdate();
            InputJudulBuku.setText("");
            InputBukuId.setText("");
            InputPenulisBuku.setText("");
            InputTahun.setText("");
            InputTersedia.setText("");
            TableBooks();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Something wrong", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }     
    }//GEN-LAST:event_ButtonHapusActionPerformed

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
            java.util.logging.Logger.getLogger(ManajemenBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajemenBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajemenBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajemenBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManajemenBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JTextField InputBukuId;
    private javax.swing.JTextField InputJudulBuku;
    private javax.swing.JTextField InputPenulisBuku;
    private javax.swing.JTextField InputTahun;
    private javax.swing.JTextField InputTersedia;
    private javax.swing.JLabel LabelDaftarBuku;
    private javax.swing.JLabel LabelJudulbuku;
    private javax.swing.JLabel LabelJumlahbukutersedia;
    private javax.swing.JLabel LabelKodebuku;
    private javax.swing.JLabel LabelPenulisbuku;
    private javax.swing.JLabel LabelTahun;
    private javax.swing.JLabel gambar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
