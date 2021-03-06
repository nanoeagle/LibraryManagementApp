/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Nanoeagle
 */
public class BookAddingGUI extends javax.swing.JPanel {

    /**
     * Creates new form BookInfoGUI
     */
    public BookAddingGUI() {
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
        bookTitle_TxField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        author_TxField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ddcCode_TxField = new javax.swing.JTextField();
        publishingCompany_TxField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        publishingYear_TxField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        coverPrice_TxField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addBook_btn = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 520));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Tựa sách");

        bookTitle_TxField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bookTitle_TxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTitle_TxFieldActionPerformed(evt);
            }
        });

        addBook_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBook_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Tác giả");

        author_TxField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Mã DDC");

        ddcCode_TxField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ddcCode_TxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddcCode_TxFieldActionPerformed(evt);
            }
        });

        publishingCompany_TxField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Giá bìa");

        publishingYear_TxField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Năm xuất bản");

        coverPrice_TxField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Nhà xuất bản");

        addBook_btn.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addBook_btn.setText("Thêm");

        errorLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        compos = new ArrayList<>();
        compos.add(bookTitle_TxField);
        compos.add(author_TxField);
        compos.add(ddcCode_TxField);
        compos.add(publishingCompany_TxField);
        compos.add(publishingYear_TxField);
        compos.add(coverPrice_TxField);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(bookTitle_TxField)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(author_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(ddcCode_TxField, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(publishingYear_TxField))
                                .addComponent(addBook_btn)
                                .addComponent(errorLbl))))
                    .addComponent(publishingCompany_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(coverPrice_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookTitle_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(author_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddcCode_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publishingCompany_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publishingYear_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coverPrice_TxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBook_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLbl)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookTitle_TxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTitle_TxFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTitle_TxFieldActionPerformed

    private void addBook_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTitle_TxFieldActionPerformed
        BookAddingCtrl.handleAddBookBtn(this);
    }

    private void ddcCode_TxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddcCode_TxFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddcCode_TxFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton addBook_btn;
    javax.swing.JTextField author_TxField;
    javax.swing.JTextField bookTitle_TxField;
    javax.swing.JTextField coverPrice_TxField;
    javax.swing.JTextField ddcCode_TxField;
    javax.swing.JLabel errorLbl;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JTextField publishingCompany_TxField;
    javax.swing.JTextField publishingYear_TxField;

    ArrayList<JComponent> compos;
    // End of variables declaration//GEN-END:variables
}
