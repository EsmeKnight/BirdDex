import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

class JImageButton extends JComponent implements MouseListener {
    private BufferedImage img = null;
    private String text = null;

    public JImageButton(String text) throws IOException {
        int numPadButtonWidth = 42;
        int numPadButtonHeight = 35;
        this.img = ImageIO.read(new FileInputStream("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton" + text + ".png"));
        //setMinimumSize(new Dimension(img.getWidth(), img.getHeight()));
        setSize(numPadButtonWidth, numPadButtonHeight);
        setOpaque(true);
        addMouseListener(this);
        this.text = text;

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == text.charAt(0)){
                    System.out.println(text);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    public JImageButton(BufferedImage img) {
        this.img = img;
        setMinimumSize(new Dimension(img.getWidth(), img.getHeight()));
        setOpaque(false);
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), null);
    }

    public String getButtonText(){
        return text;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(getButtonText());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

}