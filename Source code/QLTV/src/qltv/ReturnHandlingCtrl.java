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
public class ReturnHandlingCtrl {
    public static void handleAddBtn(ReturnHandlingGUI returnHandlingGUI) {
        if (Helper.isEmptyField(returnHandlingGUI.bookRtnSearch_TxField1, returnHandlingGUI.errorBook)) {
            return;
        }
        
        // Found
        returnHandlingGUI.bookRtnSearch_TxField1.setText("");

        DefaultTableModel model = (DefaultTableModel) returnHandlingGUI.rtnHdlingTable.getModel();
        model.addRow(new Object[] {
            1, "2", "3", "4", false
        });
        model.addRow(new Object[] {
            2, "2", "3", "4", false
        });
        // model.removeRow(row);
        // Vector rowData = new Vector();
        // rowData.add()

        returnHandlingGUI.rtnHdlingTable.setModel(model);
    }

    public static void handleReturnBtn(ReturnHandlingGUI returnHandlingGUI) {
        if (Helper.isEmptyField(returnHandlingGUI.readerID_TxField, returnHandlingGUI.errorReader)) {
            return;
        }
        if (returnHandlingGUI.rtnHdlingTable.getRowCount() == 0) {
            returnHandlingGUI.errorReader.setText("Phải thêm sách!"); 
            return;       
        }

        for (JComponent jComponent : returnHandlingGUI.compos) {
            Helper.clearAllTextField((JTextComponent) jComponent);
        }
        
        returnHandlingGUI.rtnHdlingTable.setModel(new javax.swing.table.DefaultTableModel(
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

        returnHandlingGUI.errorReader.setText("Thành công!");
    }

    public static void handleRowSelection(ReturnHandlingGUI returnHandlingGUI) {
        JTable tb = returnHandlingGUI.rtnHdlingTable;
        Boolean isRemove = (Boolean) tb.getValueAt(tb.getSelectedRow(), tb.getSelectedColumn());
        DefaultTableModel model = (DefaultTableModel) tb.getModel();

        if (isRemove) {
            model.removeRow(tb.getSelectedRow());
            tb.setModel(model);
        }      
    }
}
