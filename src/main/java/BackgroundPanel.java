import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class BackgroundPanel extends JPanel {
    BufferedImage icon;

    public BackgroundPanel(BufferedImage icon) {
        this.icon = icon;
    }

    public void setIcon(BufferedImage icon) {
        this.icon = icon;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.icon != null) {
            g.drawImage(icon, 0,0, this);
        } else {
            System.out.println("THIS.ICON == NULL");
        }
    }
}
