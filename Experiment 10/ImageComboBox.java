import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageComboBox extends JFrame implements ItemListener {

    JComboBox<String> combo;
    JLabel label;

    String[] imageNames = {"nature.jpg", "sun.jpg", "sunset.jpg"};

    ImageComboBox() {
        setTitle("Image Viewer");
        setSize(400, 350);
        setLayout(new FlowLayout());

        combo = new JComboBox<>(imageNames);

        label = new JLabel();

        // 👉 Show first image by default
        setImage(imageNames[0]);
        
       

        combo.addItemListener(this);

        add(combo);
        add(label);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // 👉 Method to set image
   public void setImage(String filename) {

    String path = "images/" + filename;

    ImageIcon icon = new ImageIcon(path);

    // Check if image loaded properly
    if (icon.getIconWidth() == -1) {
        System.out.println("Image not found: " + path);
        return;
    }

    Image img = icon.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH);

    label.setIcon(new ImageIcon(img));
}

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selected = (String) combo.getSelectedItem();
            setImage(selected);
        }
    }

    public static void main(String[] args) {
        new ImageComboBox();
    }
}