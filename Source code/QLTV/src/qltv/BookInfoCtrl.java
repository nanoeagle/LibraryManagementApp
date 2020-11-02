/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Nanoeagle
 */
public class BookInfoCtrl {
    public static void handleEditBtn(BookInfoGUI bookInfoGUI) {
        if (bookInfoGUI.modifyBooks_btn.getText().equals("Sửa")) {
            bookInfoGUI.modifyBooks_btn.setText("Lưu");
            bookInfoGUI.deleteBooks_btn.setVisible(false);
            bookInfoGUI.cancel_btn.setVisible(true);

            for (JComponent component : bookInfoGUI.compos) {
                Helper.setEditable((JTextComponent) component, true);
            }
            
            return;
        }
        
        for (JComponent component : bookInfoGUI.compos) {
            if (Helper.isEmptyField((JTextComponent) component, bookInfoGUI.errorLbl)) {
                return;
            }
        }

        // Lưu nhưng hủy
        if ( !Helper.isContinued(bookInfoGUI )) {
            return;
        }

        // lưu
        // bookInfoGUI.modifyBooks_btn.setText("Sửa");
        
        
        // OK, load thông tin mới
        // DefaultTableModel model = (DefaultTableModel) bookInfoGUI.brwHdlingTable.getModel();
        // model.addRow(new Object[] {
        //     1, "2", "3", "4", false
        // });
        // model.addRow(new Object[] {
        //     2, "2", "3", "4", false
        // });
        // model.removeRow(row);
        // Vector rowData = new Vector();
        // rowData.add()

        // bookInfoGUI.brwHdlingTable.setModel(model);

        for (JComponent component : bookInfoGUI.compos) {
            Helper.setEditable((JTextComponent) component, false);
        }
        bookInfoGUI.errorLbl.setText("Thành công!");
        bookInfoGUI.modifyBooks_btn.setText("Sửa");
        bookInfoGUI.deleteBooks_btn.setVisible(true);
        bookInfoGUI.cancel_btn.setVisible(false);
    }

    public static void handleCancelBtn(BookInfoGUI bookInfoGUI) {
        if (bookInfoGUI.modifyBooks_btn.isVisible()) {
            for (JComponent component : bookInfoGUI.compos) {
                Helper.setEditable((JTextComponent) component, false);
            }
            bookInfoGUI.modifyBooks_btn.setText("Sửa");
            bookInfoGUI.deleteBooks_btn.setVisible(true);
            bookInfoGUI.cancel_btn.setVisible(false);

            return;
        }

        bookInfoGUI.modifyBooks_btn.setVisible(true);
        bookInfoGUI.cancel_btn.setVisible(false);
    }

    public static void handleDeleteBtn(BookInfoGUI bookInfoGUI) {
        if (bookInfoGUI.modifyBooks_btn.isVisible()) {
            bookInfoGUI.modifyBooks_btn.setVisible(false);
            bookInfoGUI.cancel_btn.setVisible(true);

            // do stuff
            return;
        }

        // Lưu nhưng hủy
        if ( !Helper.isContinued(bookInfoGUI )) {
            return;
        }
        
        // ok
        bookInfoGUI.errorLbl.setText("Thành công!");
        bookInfoGUI.modifyBooks_btn.setVisible(true);
        bookInfoGUI.cancel_btn.setVisible(false);
    }
}
