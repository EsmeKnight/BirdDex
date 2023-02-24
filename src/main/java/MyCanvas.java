//import javax.swing.*;
//import java.awt.*;
//import java.io.IOException;
//import java.net.URL;
//
//public class MyCanvas extends Canvas{
//
//    public void paint(Graphics g) {
//
//        Toolkit t=Toolkit.getDefaultToolkit();
//        Image i= null;
//        try {
//            i = t.getImage(new URL(BirdImageCaller.getImgUrl()));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        g.drawImage(i, 120,100,this);
//
//    }
//    public static void main(String[] args) {
//        MyCanvas m=new MyCanvas();
//        JFrame f=new JFrame();
//        f.add(m);
//        f.setSize(400,400);
//        f.setVisible(true);
//    }
//
//}
