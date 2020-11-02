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
public class ReaderRegistrationCtrl {
    public static void handleReaderRegisBtn(ReaderRegistrationGUI readerRegistrationGUI) {
        for (JComponent jComponent : readerRegistrationGUI.compos) {
            if (Helper.isEmptyField((JTextComponent) jComponent, readerRegistrationGUI.error_Lbl)) {
                return;
            }
        } 

        if ( !Helper.isNumber(readerRegistrationGUI.phoneNumber_TxField, readerRegistrationGUI.error_Lbl) ) {
            return;
        }

        for (JComponent jComponent : readerRegistrationGUI.compos) {
            Helper.clearAllTextField((JTextComponent) jComponent);
        }
        
        readerRegistrationGUI.error_Lbl.setText("Thành công!");
    }
}
