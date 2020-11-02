/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import javax.swing.JComponent;
import javax.swing.text.JTextComponent;
/**
 *
 * @author Nanoeagle
 */
public class BookAddingCtrl {
    public static void handleAddBookBtn(BookAddingGUI bookAddingGUI) {
        for (JComponent jComponent : bookAddingGUI.compos) {
            if (Helper.isEmptyField((JTextComponent) jComponent, bookAddingGUI.errorLbl)) {
                return;
            }
        } 

        if ( !Helper.isNumber(bookAddingGUI.coverPrice_TxField, bookAddingGUI.errorLbl) ) {
            return;
        }

        for (JComponent jComponent : bookAddingGUI.compos) {
            Helper.clearAllTextField((JTextComponent) jComponent);
        }
        
        bookAddingGUI.errorLbl.setText("Thành công!");
    }
}
