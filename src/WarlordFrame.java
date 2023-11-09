import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WarlordFrame extends JFrame {

    public WarlordFrame(String imagePath) {
        // Load the image using a relative path so the imagepath is working regardless which computer the code runs on
        ImageIcon imageIcon = new ImageIcon(WarlordFrame.class.getResource(imagePath));

        // Create a JLabel to display the image
        JLabel imageLabel = new JLabel(imageIcon);

        // Set the frame size to match the image size
        setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());

        // Add the JLabel to the frame
        add(imageLabel);

        // Make the frame visible
        setVisible(true);

        setAlwaysOnTop(true); // set's the focus on the image

        // Close the application when the frame is closed
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


}
