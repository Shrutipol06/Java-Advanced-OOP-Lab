import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends JFrame implements ActionListener {

    JTextField input, result;
    JButton binary, octal, hex;

    BorderLayoutExample() {
        setTitle("BorderLayout Example");
        setSize(300, 200);
        setLayout(new BorderLayout());

        // Top Panel
        JPanel top = new JPanel();
        top.add(new JLabel("Enter Number:"));
        input = new JTextField(10);
        top.add(input);
        add(top, BorderLayout.NORTH);

        // Center Panel
        JPanel center = new JPanel();
        binary = new JButton("Binary");
        octal = new JButton("Octal");
        hex = new JButton("Hex");

        center.add(binary);
        center.add(octal);
        center.add(hex);

        add(center, BorderLayout.CENTER);

        // Bottom Panel
        JPanel bottom = new JPanel();
        bottom.add(new JLabel("Result:"));
        result = new JTextField(10);
        bottom.add(result);
        add(bottom, BorderLayout.SOUTH);

        // Events
        binary.addActionListener(this);
        octal.addActionListener(this);
        hex.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(input.getText());

        if (e.getSource() == binary)
            result.setText(Integer.toBinaryString(num));

        if (e.getSource() == octal)
            result.setText(Integer.toOctalString(num));

        if (e.getSource() == hex)
            result.setText(Integer.toHexString(num));
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}