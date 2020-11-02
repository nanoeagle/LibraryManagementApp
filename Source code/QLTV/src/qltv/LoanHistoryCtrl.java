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
public class LoanHistoryCtrl {
    public static void handleSearchBtn(LoanHistoryGUI loanHistoryGUI) {
        for (JComponent jComponent : loanHistoryGUI.compos) {
            if (Helper.isEmptyField((JTextComponent) jComponent, loanHistoryGUI.errorLbl)) {
                return;
            }
        } 

        for (JComponent jComponent : loanHistoryGUI.compos) {
            Helper.clearAllTextField((JTextComponent) jComponent);
        }
        
        loanHistoryGUI.errorLbl.setText("Thành công!");
    }
}
