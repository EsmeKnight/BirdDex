import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumPadPanel extends JPanel {

    NumPadButton numPadOne;
    NumPadButton numPadTwo;
    NumPadButton numPadThree;
    NumPadButton numPadFour;
    NumPadButton numPadFive;
    NumPadButton numPadSix;
    NumPadButton numPadSeven;
    NumPadButton numPadEight;
    NumPadButton numPadNine;
    NumPadButton numPadZero;
    NumPadButton numPadDot;

    Action onePress;
    Action twoPress;
    Action threePress;
    Action fourPress;
    Action fivePress;
    Action sixPress;
    Action sevenPress;
    Action eightPress;
    Action ninePress;
    Action zeroPress;
    Action dotPress;

    public NumPadPanel() {
        onePress = new onePress();
        twoPress = new twoPress();
        threePress = new threePress();
        fourPress = new fourPress();
        fivePress = new fivePress();
        sixPress = new sixPress();
        sevenPress = new sevenPress();
        eightPress = new eightPress();
        ninePress = new ninePress();
        zeroPress = new zeroPress();
        dotPress = new dotPress();

        addNumPad();
        setLayout(new GridLayout(4, 3, 3, 1));
        setBackground(new Color(0, 0, 0, 0));

        setBounds(360, 223, 170, 190);


        getInputMap().put(KeyStroke.getKeyStroke('1'), "oneAction");
        getActionMap().put("oneAction", onePress);
        getInputMap().put(KeyStroke.getKeyStroke('2'), "twoAction");
        getActionMap().put("twoAction", twoPress);
        getInputMap().put(KeyStroke.getKeyStroke('3'), "threeAction");
        getActionMap().put("threeAction", threePress);
        getInputMap().put(KeyStroke.getKeyStroke('4'), "fourAction");
        getActionMap().put("fourAction", fourPress);
        getInputMap().put(KeyStroke.getKeyStroke('5'), "fiveAction");
        getActionMap().put("fiveAction", fivePress);
        getInputMap().put(KeyStroke.getKeyStroke('6'), "sixAction");
        getActionMap().put("sixAction", sixPress);
        getInputMap().put(KeyStroke.getKeyStroke('7'), "sevenAction");
        getActionMap().put("sevenAction", sevenPress);
        getInputMap().put(KeyStroke.getKeyStroke('8'), "eightAction");
        getActionMap().put("eightAction", eightPress);
        getInputMap().put(KeyStroke.getKeyStroke('9'), "nineAction");
        getActionMap().put("nineAction", ninePress);
        getInputMap().put(KeyStroke.getKeyStroke('0'), "zeroAction");
        getActionMap().put("zeroAction", zeroPress);
        getInputMap().put(KeyStroke.getKeyStroke('.'), "dotAction");
        getActionMap().put("dotAction", dotPress);
    }

    private void addNumPad() {

        numPadOne = new NumPadButton("1");
        numPadTwo = new NumPadButton("2");
        numPadThree = new NumPadButton("3");
        numPadFour = new NumPadButton("4");
        numPadFive = new NumPadButton("5");
        numPadSix = new NumPadButton("6");
        numPadSeven = new NumPadButton("7");
        numPadEight = new NumPadButton("8");
        numPadNine = new NumPadButton("9");
        numPadZero = new NumPadButton("0");
        numPadDot = new NumPadButton(".");

        add(numPadOne);
        add(numPadTwo);
        add(numPadThree);
        add(numPadFour);
        add(numPadFive);
        add(numPadSix);
        add(numPadSeven);
        add(numPadEight);
        add(numPadNine);
        add(numPadDot);
        add(numPadZero);
    }

    public class onePress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("1 KEY PRESSED");
            numPadOne.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton1Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadOne.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton1.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class twoPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("2 KEY PRESSED");
            numPadTwo.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton2Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadTwo.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton2.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class threePress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("3 KEY PRESSED");
            numPadThree.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton3Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadThree.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton3.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class fourPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("4 KEY PRESSED");
            numPadFour.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton4Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadFour.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton4.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class fivePress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("5 KEY PRESSED");
            numPadFive.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton5Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadFive.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton5.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class sixPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("6 KEY PRESSED");
            numPadSix.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton6Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadSix.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton6.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class sevenPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("7 KEY PRESSED");
            numPadSeven.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton7Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadSeven.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton7.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class eightPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("8 KEY PRESSED");
            numPadEight.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton8Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadEight.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton8.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class ninePress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("9 KEY PRESSED");
            numPadNine.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton9Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadNine.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton9.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class zeroPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("0 KEY PRESSED");
            numPadZero.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton0Pressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadZero.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButton0.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class dotPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(". KEY PRESSED");
            numPadDot.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButtonDotPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    numPadDot.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/numpadButtons/numPadButtonDot.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }
}
