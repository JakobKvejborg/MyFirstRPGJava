import java.awt.*;
import javax.swing.*;

public class WarlordFrame extends JFrame {

//    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();

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

        // Get the screen dimensions
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle bounds = defaultScreen.getDefaultConfiguration().getBounds();

        // Set frame location to the right upper corner
        int x = bounds.width - getWidth();
        int y = 0;

        setLocation(x, y);
        add(panel, BorderLayout.CENTER);
    }


}
