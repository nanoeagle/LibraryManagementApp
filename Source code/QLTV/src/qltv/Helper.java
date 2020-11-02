/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;

/**
 *
 * @author Nanoeagle
 */
public class Helper {
    public static boolean isEmptyField(JTextComponent compo, JLabel label) {
        if (compo.getText().equals("")) {
            label.setText("Không được bỏ trống trường nào");
            return true;
        }

        label.setText("");;
        return false;
    }

    public static boolean isNumber(JTextComponent compo, JLabel label) {
        String text = compo.getText();

        for (int i = 0; i < text.length(); i++) {
            if ( !((text.charAt(i) >= '0') && (text.charAt(i) <= '9')) ) {
                label.setText("Để ý kiểu số");
                return false;
            }
        }

        label.setText("");;
        return true;
    }

    public static void clearAllTextField(JTextComponent compo) {
        compo.setText("");
    }

    public static boolean isContinued(Component component) {
        int response = JOptionPane.showConfirmDialog(
            component, "Tiếp tục lựa chọn này ?", "Xác nhận", 
            JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE
        );

        if (response == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    public static void setEditable(JTextComponent component, boolean editable) {
        component.setEditable(editable);
    }
}
