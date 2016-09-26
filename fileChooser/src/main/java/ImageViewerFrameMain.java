import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/26.
 */
public class ImageViewerFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new ImageViewerFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Image Viewer Frame Main");
            frame.setVisible(true);
            frame.setSize(800, 600);
        });
    }
}
