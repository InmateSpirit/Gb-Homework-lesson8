import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class calculation implements ActionListener {
    private final JTextField textField;

    public calculation(JTextField textField) {
        this.textField = textField;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        String[] s = text.split( " ");
        int a;
        int b;
        for (int i = 0; i < s.length-2; i +=2) {
            a = Integer.parseInt(s[i]);
            b = Integer.parseInt(s[i+2]);
            if(s[i+1].equals("+")){
                b += a;
            } else if (s[i+1].equals("-")){
                b -= a;
            } else if (s[i+1].equals("/")){
                b = a / b;
            } else b = a * b;
            s[i+2] = String.valueOf(b);
        } textField.setText(s[s.length-1]);
    }
}
