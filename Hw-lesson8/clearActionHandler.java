import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clearActionHandler implements ActionListener {
    private final JTextField textField;

    public clearActionHandler(JTextField textField) {
        this.textField = textField;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("");
    }
}
