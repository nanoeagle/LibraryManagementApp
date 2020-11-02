/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import java.util.Vector;
import java.awt.event.*;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
/**
 *
 * @author Nanoeagle
 */
public class BorrowHandlingCtrl {
    public static void handleBorrowBtn(BorrowHandlingGUI borrowHandlingGUI) {
        if (Helper.isEmptyField(borrowHandlingGUI.readerBoHaSearch_TxField, borrowHandlingGUI.errorReader)) {
            return;
        }
        if (borrowHandlingGUI.brwHdlingTable.getRowCount() == 0) {
            borrowHandlingGUI.errorReader.setText("Phải thêm sách!"); 
            return;       
        }

        for (JComponent jComponent : borrowHandlingGUI.compos) {
            Helper.clearAllTextField((JTextComponent) jComponent);
        }
        
        borrowHandlingGUI.brwHdlingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã cuốn sách", "Tựa sách", "Tác giả", "Giá bìa", "Xóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        borrowHandlingGUI.errorReader.setText("Thành công!");
    }

    public static void handleAddBtn(BorrowHandlingGUI borrowHandlingGUI) {
        if (Helper.isEmptyField(borrowHandlingGUI.bookBoHaSearch_TxField1, borrowHandlingGUI.errorBook)) {
            return;
        }
        
        // Found
        borrowHandlingGUI.bookBoHaSearch_TxField1.setText("");

        DefaultTableModel model = (DefaultTableModel) borrowHandlingGUI.brwHdlingTable.getModel();
        model.addRow(new Object[] {
            1, "2", "3", "4", false
        });
        model.addRow(new Object[] {
            2, "2", "3", "4", false
        });
        // model.removeRow(row);
        // Vector rowData = new Vector();
        // rowData.add()

        borrowHandlingGUI.brwHdlingTable.setModel(model);
    }

    public static void handleRowSelection(BorrowHandlingGUI borrowHandlingGUI) {
        JTable tb = borrowHandlingGUI.brwHdlingTable;
        Boolean isRemove = (Boolean) tb.getValueAt(tb.getSelectedRow(), tb.getSelectedColumn());
        DefaultTableModel model = (DefaultTableModel) tb.getModel();

        if (isRemove) {
            model.removeRow(tb.getSelectedRow());
            tb.setModel(model);
        }      
    }
}
