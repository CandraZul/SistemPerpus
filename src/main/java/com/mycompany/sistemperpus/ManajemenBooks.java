/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemperpus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        JawabanJumlahBukuTersedia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ButtonTambah = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelDaftarBuku.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        LabelDaftarBuku.setText("Daftar Buku");

        LabelJudulbuku.setText("Judul Buku                    :");

        LabelKodebuku.setText("Book ID                        :");

        LabelPenulisbuku.setText("Penulis Buku                 :");

        LabelJumlahbukutersedia.setText("Jumlah Buku Tersedia  :");

        InputPenulisBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPenulisBukuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Judul Buku", "Book ID", "Penulis Buku", "Tahun Terbit", "Jumlah Buku Tersedia"
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

        ButtonTambah.setText("Tambah");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        ButtonEdit.setText("Edit");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        ButtonHapus.setText("Hapus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelDaftarBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelJumlahbukutersedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelPenulisbuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelKodebuku, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(LabelJudulbuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InputJudulBuku)
                            .addComponent(InputBukuId)
                            .addComponent(InputPenulisBuku)
                            .addComponent(JawabanJumlahBukuTersedia, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(ButtonTambah)
                        .addGap(55, 55, 55)
                        .addComponent(ButtonEdit)
                        .addGap(52, 52, 52)
                        .addComponent(ButtonHapus)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(LabelDaftarBuku)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJudulbuku)
                    .addComponent(InputJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKodebuku)
                    .addComponent(InputBukuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPenulisbuku)
                    .addComponent(InputPenulisBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJumlahbukutersedia)
                    .addComponent(JawabanJumlahBukuTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonTambah)
                    .addComponent(ButtonEdit)
                    .addComponent(ButtonHapus))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InputPenulisBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPenulisBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPenulisBukuActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        InputJudulBuku.setText(model.getValueAt(i, 0).toString());
        InputBukuId.setText(model.getValueAt(i, 1).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

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
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JTextField InputBukuId;
    private javax.swing.JTextField InputJudulBuku;
    private javax.swing.JTextField InputPenulisBuku;
    private javax.swing.JTextField JawabanJumlahBukuTersedia;
    private javax.swing.JLabel LabelDaftarBuku;
    private javax.swing.JLabel LabelJudulbuku;
    private javax.swing.JLabel LabelJumlahbukutersedia;
    private javax.swing.JLabel LabelKodebuku;
    private javax.swing.JLabel LabelPenulisbuku;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
