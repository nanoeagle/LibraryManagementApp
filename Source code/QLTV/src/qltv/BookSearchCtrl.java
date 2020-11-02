/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
/**
 *
 * @author Nanoeagle
 */
public class BookSearchCtrl {
    public static void handleSearchBtn(BookSearchGUI bookSearchGUI) {
        for (JComponent jComponent : bookSearchGUI.compos) {
            if (Helper.isEmptyField((JTextComponent) jComponent, bookSearchGUI.errorLbl)) {
                return;
            }
        } 

        for (JComponent jComponent : bookSearchGUI.compos) {
            Helper.clearAllTextField((JTextComponent) jComponent);
        }

        DefaultTableModel model = (DefaultTableModel) bookSearchGUI.booksSearchTable.getModel();
        model.addRow(new Object[] {
            1, "2", "3"
        });
        model.addRow(new Object[] {
            2, "2", "3"
        });
        // model.removeRow(row);
        // Vector rowData = new Vector();
        // rowData.add()

        bookSearchGUI.booksSearchTable.setModel(model);

        bookSearchGUI.errorLbl.setText("Thành công!");
    }

    public static void handleRowSelection(BookSearchGUI bookSearchGUI) {
        /* JTable tb = bookSearchGUI.booksSearchTable;
        Boolean isRemove = (Boolean) tb.getValueAt(tb.getSelectedRow(), tb.getSelectedColumn());
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        
        if (isRemove) {
            model.removeRow(tb.getSelectedRow());
            tb.setModel(model);
        } */       

        JTabbedPane jTPane = bookSearchGUI.jTabbedPane;
        if (jTPane.getTabCount() == 2) {
            jTPane.removeTabAt(1);
        }
        jTPane.addTab("Thông tin sách", new BookInfoGUI());

    }
}
