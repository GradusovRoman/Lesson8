package BtnListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClearButtonListener extends ButtonListener {

    public ClearButtonListener(JTextField outField) {
        super(outField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {  //кнопка "С" - очищение строки
        super.getOutField().setText("");
    }
}