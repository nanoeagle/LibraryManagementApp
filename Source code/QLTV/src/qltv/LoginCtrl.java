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
public class LoginCtrl {
    public static void handleLoginBtn(LoginGUI loginGUI) {
        for (JComponent jComponent : loginGUI.compos) {
            if (Helper.isEmptyField((JTextComponent) jComponent, loginGUI.loginErr_Lbl)) {
                return;
            }
        } 

        new AccountGUI().setVisible(true);
        loginGUI.setVisible(false);
    }
}
