package algorithm;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class Button extends JButton{

    public void changeSettings(Color c,Font f,ActionListener As)
    {
        this.setBackground(c);
        this.setFont(f);
        this.addActionListener(As);
    }

    public void setText(String t)
    {
        this.setActionCommand(t);
        super.setText(t);
    }
}