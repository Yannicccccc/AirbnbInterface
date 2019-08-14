package airbnb;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tests extends JFrame {

public Tests() {
    super("label Test");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.getContentPane().setLayout(new BorderLayout());

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    BufferedImage image = null;
    Image resized_image = null;
    URL url = null;
    try {
        url = new URL("https://a0.muscache.com/im/pictures/67208511/796e06f2_original.jpg");
        image = ImageIO.read(url);
        resized_image = image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    } catch (MalformedURLException ex) {
        System.out.println("Malformed URL");
    } catch (IOException iox) {
        System.out.println("Can not load file");
    }
    JLabel label = new JLabel(new ImageIcon(resized_image));
    panel.add(label, BorderLayout.CENTER);

    this.getContentPane().add(panel, BorderLayout.CENTER);
    this.pack();
    this.setVisible(true);

}
public static void main(String[] args) {
    Tests d = new Tests();
}
}