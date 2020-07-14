import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFrame extends JFrame {
    public GUIFrame() {
        setTitle("Calc");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        GridLayout gridLayout = new GridLayout(4, 4);
        setLayout(gridLayout);

        JTextField textField = new JTextField();
        add(textField);
        ButtonListener buttonListener = new ButtonListener(textField);
        clearActionHandler clear = new clearActionHandler(textField);
        calculation calc = new calculation(textField);

        for (int i = 1; i <= 9; i++) {
            JButton jButton = new JButton(String.valueOf(i));
            jButton.addActionListener(buttonListener);
            add(jButton);
        }
        JButton jButton = new JButton(String.valueOf(0));
        jButton.addActionListener(buttonListener);
        add(jButton);


        JButton pushButton = new JButton("Push");
        pushButton.addActionListener(calc);
        JButton increaseButton = new JButton(" + ");
        increaseButton.addActionListener(buttonListener);
        JButton decreaseButton = new JButton(" - ");
        decreaseButton.addActionListener(buttonListener);
        JButton multiButton = new JButton(" * ");
        multiButton.addActionListener(buttonListener);
        JButton divisionButton = new JButton(" / ");
        divisionButton.addActionListener(buttonListener);
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(clear);



        add(pushButton);
        add(increaseButton);
        add(decreaseButton);
        add(multiButton);
        add(divisionButton);
        add(resetButton);

        setVisible(true);
    }
}
