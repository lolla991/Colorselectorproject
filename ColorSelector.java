import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorSelector extends JFrame implements ActionListener {
    private JLabel label;
    private JRadioButton redButton, blueButton, greenButton, blackButton;
    private ButtonGroup bg;

    public ColorSelector() {
        setTitle("Color Selector");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Color is selected");
        label.setPreferredSize(new Dimension(150, 100));
        label.setOpaque(true);
        label.setBackground(Color.BLUE);  // Default color

        redButton = new JRadioButton("Red");
        blueButton = new JRadioButton("Blue", true);
        greenButton = new JRadioButton("Green");
        blackButton = new JRadioButton("Black");

        bg = new ButtonGroup();
        bg.add(redButton);
        bg.add(blueButton);
        bg.add(greenButton);
        bg.add(blackButton);

        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);
        blackButton.addActionListener(this);

        add(label);
        add(redButton);
        add(blueButton);
        add(greenButton);
        add(blackButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == redButton) {
            label.setBackground(Color.RED);
        } else if (source == blueButton) {
            label.setBackground(Color.BLUE);
        } else if (source == greenButton) {
            label.setBackground(Color.GREEN);
        } else if (source == blackButton) {
            label.setBackground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorSelector().setVisible(true);
        });
    }
}
