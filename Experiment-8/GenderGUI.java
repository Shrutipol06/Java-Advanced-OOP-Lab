import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GenderGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Select Gender:");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        // Grouping radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JButton submit = new JButton("Submit");
        JLabel result = new JLabel("");

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (male.isSelected()) {
                    result.setText("Selected: Male");
                } else if (female.isSelected()) {
                    result.setText("Selected: Female");
                } else {
                    result.setText("Please select gender");
                }
            }
        });

        frame.add(label);
        frame.add(male);
        frame.add(female);
        frame.add(submit);
        frame.add(result);

        frame.setVisible(true);
    }
}