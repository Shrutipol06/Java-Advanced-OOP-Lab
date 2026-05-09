import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends Applet implements ActionListener {

    TextField input, result;
    Button btn;

    public void init() {
        add(new Label("Enter Number:"));
        input = new TextField(10);
        add(input);

        btn = new Button("Find Factorial");
        add(btn);

        add(new Label("Result:"));
        result = new TextField(10);
        add(result);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(input.getText());
        int fact = 1;

        for (int i = 1; i <= num; i++)
            fact *= i;

        result.setText(String.valueOf(fact));
    }
}