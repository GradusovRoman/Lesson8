package BtnListeners;

import javax.script.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

import static javax.swing.JOptionPane.showMessageDialog;

public class SubmitButtonListener extends ButtonListener {

    public SubmitButtonListener(JTextField outField) {
        super(outField);
    }


     //Вычисление выражения. (ScriptEngine для вычисления математических выражений)
    @Override
    public void actionPerformed(ActionEvent e) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        try {
            Object expressionResult = scriptEngine.eval(super.getOutField().getText());
            super.getOutField().setText(expressionResult.toString());
        } catch (Exception exception) {
            showMessageDialog(null, "Ошибка. Выражение недействительно.");
        }
    }
}