import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    JButton[] numButtons = new JButton[10];
    JButton add, sub, mul, div, equal, clear;

    double num1, num2, result;
    char operator;

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        add(tf, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            panel.add(numButtons[i]);
        }

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("C");

        JButton[] ops = {add, sub, mul, div, equal, clear};

        for (JButton b : ops) {
            b.addActionListener(this);
            panel.add(b);
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                tf.setText(tf.getText() + i);
            }
        }

        if (e.getSource() == add) {
            num1 = Double.parseDouble(tf.getText());
            operator = '+';
            tf.setText("");
        }

        if (e.getSource() == sub) {
            num1 = Double.parseDouble(tf.getText());
            operator = '-';
            tf.setText("");
        }

        if (e.getSource() == mul) {
            num1 = Double.parseDouble(tf.getText());
            operator = '*';
            tf.setText("");
        }

        if (e.getSource() == div) {
            num1 = Double.parseDouble(tf.getText());
            operator = '/';
            tf.setText("");
        }

        if (e.getSource() == equal) {
            num2 = Double.parseDouble(tf.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            tf.setText(String.valueOf(result));
        }

        if (e.getSource() == clear) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}