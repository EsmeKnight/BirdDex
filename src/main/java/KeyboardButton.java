import javax.swing.*;

public class KeyboardButton  extends CustomImgButton{
    public KeyboardButton(String text) {
        super(text);
        this.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/key" + text + ".png"));
    }
}
