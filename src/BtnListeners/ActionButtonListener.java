package BtnListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionButtonListener extends ButtonListener {
    private StringBuilder sb = new StringBuilder();

    public ActionButtonListener(JTextField outField) {
        super(outField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String expression = sb.append(super.getOutField().getText())
                .append(jButton.getText())
                .toString();
        super.getOutField().setText(expression);
        sb.setLength(0);
    }
}