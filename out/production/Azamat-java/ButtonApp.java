import javax.swing.*;

public class ButtonApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");

        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("");

        button.addActionListener(e -> label.setText("Button clicked!"));

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

