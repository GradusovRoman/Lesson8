package BtnListeners;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class ButtonListener implements ActionListener {
    private JTextField outField;

    public ButtonListener(JTextField outField) {
        this.outField = outField;
    }
    public JTextField getOutField() {
        return outField;
    }
}