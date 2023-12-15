import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JButton button1 = new JButton("Test");
    private JButton button2 = new JButton("Button2");
    private JButton button3 = new JButton("Test");
    private JButton button4 = new JButton("Button3");
    private JButton heroNameButton = new JButton("Set Hero Name");
    private JTextField heroNameField = new JTextField(20);
    private JLabel label = new JLabel();
    private int count = 0;
    private String[] messages = {"first", "second", "You rule", "I'm learning"};
    private int clickCount;


    public GUI() {

        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.add(panel, BorderLayout.CENTER);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("RPG Jakob Kvejborg");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1800, 1800);
        frame.setLocationRelativeTo(null);
        frame.add(panel, BorderLayout.CENTER);


        panel.setBorder(BorderFactory.createEmptyBorder(130, 130, 110, 110)); // 30, 30, 10, 10
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button1);
        panel.add(label);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        panel.add(new JLabel("Enter a name for your hero: "));
        panel.add(heroNameField);
        panel.add(heroNameButton);



        heroNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String heroName = heroNameField.getText();
                // Do something with the heroName
                heroNameButton.setVisible(false);
                heroNameField.setVisible(false);
                Component[] components = panel.getComponents();
                for (Component component : components) {
                    if (component instanceof JLabel) {
                        JLabel label = (JLabel) component;
                        if (label.getText().equals("Enter a name for your hero: ")) {
                            label.setVisible(false);
                            break;
                        }
                    }
                }
            }
        });

    }

    public void showWelcomeMessage() {
        String welcomeText = """
                _________________________________________________________
                                       Welcome to                       \s
                         ~~ "A Programmers Console Adventure!" ~~     \s
                                        A C T   1                       \s
                - Made by Jakob Kvejborg                               \s
                _________________________________________________________""";

        label.setText(welcomeText);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        count++;
//        label.setText("Number of clicks: " + count);
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (clickCount < messages.length) {
            label.setText(messages[clickCount]);
            clickCount++;
        } else {
            label.setText("No more messages!");
        }
    }

    public String askForHeroName() {

        JTextField textField = new JTextField(20);

        // Create a panel to hold components
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter a name for your hero: "));
        inputPanel.add(textField);

        // Show an input dialog
        String res = null;
        int result = JOptionPane.showConfirmDialog(null, inputPanel, "Enter a name for your hero:",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            res = textField.getText();
        }
        return res;
    }
}
