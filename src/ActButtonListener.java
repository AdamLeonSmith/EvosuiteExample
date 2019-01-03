import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class ActButtonListener implements ActionListener {
    private JTextArea Input;
    private JTextArea Output;

    public ActButtonListener(JTextArea Input, JTextArea Output) {
        this.Input = Input;
        this.Output = Output;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionC = e.getActionCommand();
        if(Input.getText().equals("Invalid Input"))
            Input.setText("");
        if (actionC.equals("+")) {
            Input.setText(Input.getText() + "+");
        } else if (actionC.equals("-")) {
            Input.setText(Input.getText() + "-");
        } else if (actionC.equals("x")) {
            Input.setText(Input.getText() + "x");
        } else if (actionC.equals("/")) {
            Input.setText(Input.getText() + "/");
        } else if (actionC.equals("="))
            AlgoritmExpresie.CalculeazaExpresia(Input, Output);

    }
}