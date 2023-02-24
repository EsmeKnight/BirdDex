import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

public class BirdFrame extends JFrame {

    Container c;
    BackgroundPanel bg;

    JTextField inputArea;

    public BirdFrame() throws IOException {

        c = getContentPane();
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        bg = new BackgroundPanel(ImageIO.read(new FileInputStream("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/DEX.png")));
        bg.setBackground(new Color(0, 0, 0, 0));

        FrameFiller ff = new FrameFiller();
        ff.setSize(591,863);
        add(ff);

        setSize(591, 863);
        setLocation(600, 150);
        c.add(bg);


    }

    private void addInput() {
        int inputAreaX = 77;
        int inputAreaY = 450;
        int inputAreaWidth = 240;
        int inputAreaHeight = 30;

        JTextField inputArea = new JTextField();
        inputArea.setBounds(inputAreaX, inputAreaY, inputAreaWidth, inputAreaHeight);
        inputArea.setEnabled(true);
        add(inputArea);
    }

}

