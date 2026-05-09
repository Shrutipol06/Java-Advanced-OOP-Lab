import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[6];
    String[] numbers = {"1", "2", "3", "4", "5", "6"};

    GridLayoutExample() {
        setTitle("GridLayout Example");
        setSize(300, 200);
        setLayout(new GridLayout(2, 3));

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(numbers[i]);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        String temp = clicked.getText();
        clicked.setText(buttons[0].getText());
        buttons[0].setText(temp);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}