package geekbrains.lesson8_homework;
import BtnListeners.ClearButtonListener;
import BtnListeners.SubmitButtonListener;
import BtnListeners.ActionButtonListener;
import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame mainFrame;
    public Calculator() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Calculator");
        mainFrame.setBounds(100, 100, 300, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(4, 3));

        mainFrame.add(top, BorderLayout.NORTH);
        mainFrame.add(bottom, BorderLayout.CENTER);

        JTextField outField = new JTextField();
        outField.setEditable(false);
        top.add(outField, BorderLayout.CENTER);

        ActionButtonListener abListener = new ActionButtonListener(outField);
        SubmitButtonListener sbmListener = new SubmitButtonListener(outField);
        ClearButtonListener clbtnListener = new ClearButtonListener(outField);

        for (int i = 0; i <= 9; i++) {
            JButton digitBtn = new JButton(String.valueOf(i));
            bottom.add(digitBtn);
            digitBtn.addActionListener(abListener);
        }

        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(abListener);
        bottom.add(plusBtn);
        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(abListener);
        bottom.add(minusBtn);
        JButton multiplyBtn = new JButton("*");
        multiplyBtn.addActionListener(abListener);
        bottom.add(multiplyBtn);
        JButton divideBtn = new JButton("/");
        divideBtn.addActionListener(abListener);
        bottom.add(divideBtn);

        JButton cancelBtn = new JButton("C");
        bottom.add(cancelBtn);
        cancelBtn.addActionListener(clbtnListener);
        JButton submitBtn = new JButton("Submit");
        bottom.add(submitBtn);
        submitBtn.addActionListener(sbmListener);


        mainFrame.setVisible(true);
    }
}