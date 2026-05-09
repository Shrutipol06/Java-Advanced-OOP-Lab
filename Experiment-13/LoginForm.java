import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm {

    public static void main(String[] args) {

        JFrame f = new JFrame("Login Form");

        JLabel l1 = new JLabel("Username");
        JLabel l2 = new JLabel("Password");

        JTextField t1 = new JTextField();
        JPasswordField p1 = new JPasswordField();

        JButton b1 = new JButton("Login");

        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);

        t1.setBounds(150, 50, 150, 30);
        p1.setBounds(150, 100, 150, 30);

        b1.setBounds(120, 160, 100, 30);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(p1);
        f.add(b1);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String user = t1.getText();
                String pass = p1.getText();

                JOptionPane.showMessageDialog(f,
                        "Username: " + user +
                        "\nPassword: " + pass);
            }
        });
    }
}