import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter Number:");
        JTextField inputField = new JTextField(10);

        JButton btn = new JButton("Reverse");

        JLabel resultLabel = new JLabel("Result:");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num = inputField.getText();
                String reversed = "";

                for (int i = num.length() - 1; i >= 0; i--) {
                    reversed += num.charAt(i);
                }

                resultLabel.setText("Result: " + reversed);
            }
        });

        frame.add(label);
        frame.add(inputField);
        frame.add(btn);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}