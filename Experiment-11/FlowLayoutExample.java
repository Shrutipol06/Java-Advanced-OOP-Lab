import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("FlowLayout Example");

        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        frame.add(new JCheckBox("Java"));
        frame.add(new JCheckBox("Python"));
        frame.add(new JCheckBox("C++"));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}