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
public class ReaderSearchCtrl {
    public static void handleSearchBtn(ReaderSearchGUI readerSearchGUI) {
        for (JComponent jComponent : readerSearchGUI.compos) {
            if (Helper.isEmptyField((JTextComponent) jComponent, readerSearchGUI.errorLbl)) {
                return;
            }
        } 

        for (JComponent jComponent : readerSearchGUI.compos) {
            Helper.clearAllTextField((JTextComponent) jComponent);
        }
        
        readerSearchGUI.errorLbl.setText("Thành công!");
    }
}
