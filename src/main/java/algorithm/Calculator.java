package algorithm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator extends JFrame {

    public static final int WIDTH = 380;
    public static final int HEIGHT = 560;
    JTextArea Input = new JTextArea("", 2, 10);
    JTextArea Output = new JTextArea("", 2, 10);
    Button[] butoane;

    public Calculator() {

        setVisible(true);
        setTitle("Calculator");
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setIconImage((new ImageIcon("../Resources/logo.png")).getImage());

        
        JPanel northPanel = new JPanel(new GridLayout(2, 1));

        // Input section of the Calculator
        Input.setEditable(false);

        // Output section of the Calculator
        Output.setEditable(false);

        Input.setFont(new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE, 30));
        Input.setEditable(false);
        northPanel.add(Input);

        Output.setFont(new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE, 30));
        Output.setEditable(false);
        northPanel.add(Output);
        add(northPanel, BorderLayout.NORTH);

        // Here we create the button array
        butoane = new Button[20];

        // Creating the button label
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));
        add(buttonPanel,BorderLayout.CENTER);

        for (int i = 0; i < 20; i++) {
            butoane[i] = new Button();
            if ((i + 1) % 4 != 0)
                {butoane[i].changeSettings(new Color(202, 203, 204), new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE, 30),
                        new NumButtonListener(Input, Output));
                    butoane[i].setText(""+i);
                }
            else
                butoane[i].changeSettings(new Color(246,132,16), new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE, 30),
                        new ActButtonListener(Input, Output));
            buttonPanel.add(butoane[i]);
        }
        setButtonsNames();
        revalidate();
        
    }
    
    private void setButtonsNames()
    {
        butoane[0].setText("AC");
        butoane[1].setText("(");
        butoane[2].setText(")");
        butoane[3].setText("/");
        butoane[4].setText("7");
        butoane[5].setText("8");
        butoane[6].setText("9");
        butoane[7].setText("x");
        butoane[8].setText("4");
        butoane[9].setText("5");
        butoane[10].setText("6");
        butoane[11].setText("-");
        butoane[12].setText("1");
        butoane[13].setText("2");
        butoane[14].setText("3");
        butoane[15].setText("+");
        butoane[16].setText("C");
        butoane[17].setText("0");
        butoane[18].setText(".");
        butoane[19].setText("=");
    }

    /**
     * Test main method
     */
        public static void main(String[] args) {
        Calculator GUI = new Calculator();
    }

}