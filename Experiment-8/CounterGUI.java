import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Counter");
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Counter:");
        JTextField textField = new JTextField("0", 10);

        JButton upBtn = new JButton("Count Up");
        JButton downBtn = new JButton("Count Down");
        JButton resetBtn = new JButton("Reset");

        // Count Up
        upBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                value++;
                textField.setText(String.valueOf(value));
            }
        });

        // Count Down
        downBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                value--;
                textField.setText(String.valueOf(value));
            }
        });

        // Reset
        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(upBtn);
        frame.add(downBtn);
        frame.add(resetBtn);

        frame.setVisible(true);
    }
}