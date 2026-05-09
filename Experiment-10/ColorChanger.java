import javax.swing.*;
import java.awt.*;

public class ColorChanger extends JFrame {

    JButton button;

    ColorChanger() {
        setTitle("Color Changer");
        setSize(300, 200);
        setLayout(new FlowLayout());

        button = new JButton("Choose Color");
        add(button);

        button.addActionListener(e -> {
            Color c = JColorChooser.showDialog(this, "Select Color", Color.WHITE);

            // FIX 1: Check if user selected color
            if (c != null) {
                getContentPane().setBackground(c);

                // FIX 2: Force refresh
                repaint();
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}