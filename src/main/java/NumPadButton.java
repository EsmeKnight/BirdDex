import javax.swing.*;
import java.awt.*;

public class NumPadButton extends CustomImgButton {
    public NumPadButton(String text) {
        super(text);
        if (text == ".") {
            this.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButtonDot.png"));
        } else {
            this.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton" + text + ".png"));
        }

        setLayout(null);
        setPreferredSize(new Dimension(42,36));

    }

//    public void buttonPressed(){
//        System.out.println(this.getText());
//    }
}
