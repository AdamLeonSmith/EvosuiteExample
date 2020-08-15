package algorithm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class NumButtonListener implements ActionListener {
    private JTextArea Input;
    private JTextArea Output;

    public NumButtonListener(JTextArea Input, JTextArea Output) {
        this.Input = Input;
        this.Output = Output;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionC = e.getActionCommand();
        if (Input.getText().equals("Invalid Input"))
            Input.setText("");
        if (actionC.equals("1"))
            Input.setText(Input.getText() + "1");
        else if (actionC.equals("2"))
            Input.setText(Input.getText() + "2");
        else if (actionC.equals("3"))
            Input.setText(Input.getText() + "3");
        else if (actionC.equals("4"))
            Input.setText(Input.getText() + "4");
        else if (actionC.equals("5"))
            Input.setText(Input.getText() + "5");
        else if (actionC.equals("6"))
            Input.setText(Input.getText() + "6");
        else if (actionC.equals("7"))
            Input.setText(Input.getText() + "7");
        else if (actionC.equals("8"))
            Input.setText(Input.getText() + "8");
        else if (actionC.equals("9"))
            Input.setText(Input.getText() + "9");
        else if (actionC.equals("0"))
            Input.setText(Input.getText() + "0");
        else if (actionC.equals("C"))
            Input.setText(Input.getText().substring(0, Input.getText().length() - 1));
        else if (actionC.equals("AC")) {
            Input.setText("");
            Output.setText("");
        } else if (actionC.equals("(")) {
            Input.setText(Input.getText() + "(");
        } else if (actionC.equals(")")) {
            Input.setText(Input.getText() + ")");
        } else if (actionC.equals("."))
            Input.setText(Input.getText() + ".");

    }
}