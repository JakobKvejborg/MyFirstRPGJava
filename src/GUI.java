import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    public JFrame frame;
    public JButton button1;
    public JPanel panel;
    public JLabel label1;
    public JTextField textField;
    private StoryText storyText;
    private int currentIndex;


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if (currentIndex < storyText.textList.size())
            updateLabel1(storyText.textList.get(currentIndex));
            currentIndex++;
        }
    }

    public GUI(StoryText storyText) {
        this.storyText = storyText;
        this.currentIndex = 0;

        textField = new JTextField();
        panel = new JPanel();
        frame = new JFrame();

        textField.setVisible(true);
        textField.setText("                             ");

        label1 = new JLabel();
        label1.setVisible(true);
        label1.setText(" ");

        button1 = new JButton("Next");
        button1.setVisible(true);
        button1.addActionListener(this);

        panel.setVisible(true);
        panel.setLayout(new FlowLayout());
        panel.add(textField);
        panel.add(button1);
        panel.add(label1);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null); // centers the frame to the middle of the screen
        frame.setTitle("~~ \"H e r o  C o r r u p t e d\" ~~   ");
        
    }
    
    public void updateLabel1(String newText) {
        label1.setText(newText);

    }


}