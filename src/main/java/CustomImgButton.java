import javax.swing.*;
import java.awt.*;

public class CustomImgButton extends JButton {
    private String name;
    public CustomImgButton() {
    }

    public CustomImgButton(Icon icon) {
        super(icon);
    }

    public CustomImgButton(String text) {
        super(text);
        this.name = text;
        setText(null);
        setLayout(null);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setForeground(new Color(0,0,0,0));
        setBackground(new Color(0,0,0,0));
//        addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(getName());
//            }
//        });

    }

    public CustomImgButton(Action a) {
        super(a);
    }

    public CustomImgButton(String text, Icon icon) {
        super(text, icon);
    }

    public String getName(){
        return name;
    }
}
