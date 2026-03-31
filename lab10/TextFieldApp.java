import javax.swing.*;

public class TextFieldApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Example");

        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        JLabel label = new JLabel("");

        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
