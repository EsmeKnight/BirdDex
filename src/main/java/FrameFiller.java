import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;

public class FrameFiller extends JPanel {

    String tags;
    ImagePanel bird;
    Color transparent = new Color(0, 0, 0, 0);

    String setting = "guess";
    
    CustomImgButton guess;
    CustomImgButton search;
    JTextField inputArea;
    //<editor-fold desc="numPadButtons and Actions">
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
    //</editor-fold>

    //<editor-fold desc="keyboardButtons and Actions">
    KeyboardButton keyA;
    KeyboardButton keyB;
    KeyboardButton keyC;
    KeyboardButton keyD;
    KeyboardButton keyE;
    KeyboardButton keyF;
    KeyboardButton keyG;
    KeyboardButton keyH;
    KeyboardButton keyI;
    KeyboardButton keyJ;
    KeyboardButton keyK;
    KeyboardButton keyL;
    KeyboardButton keyM;
    KeyboardButton keyN;
    KeyboardButton keyO;
    KeyboardButton keyP;
    KeyboardButton keyQ;
    KeyboardButton keyR;
    KeyboardButton keyS;
    KeyboardButton keyT;
    KeyboardButton keyU;
    KeyboardButton keyV;
    KeyboardButton keyW;
    KeyboardButton keyX;
    KeyboardButton keyY;
    KeyboardButton keyZ;
    CustomImgButton spacebar;
    CustomImgButton lightningBoltButton;
    CustomImgButton leftButton;
    CustomImgButton rightButton;
    CustomImgButton upButton;
    CustomImgButton downButton;

    Action aPress;
    Action bPress;
    Action cPress;
    Action dPress;
    Action ePress;
    Action fPress;
    Action gPress;
    Action hPress;
    Action iPress;
    Action jPress;
    Action kPress;
    Action lPress;
    Action mPress;
    Action nPress;
    Action oPress;
    Action pPress;
    Action qPress;
    Action rPress;
    Action sPress;
    Action tPress;
    Action uPress;
    Action vPress;
    Action wPress;
    Action xPress;
    Action yPress;
    Action zPress;
    Action spacePress;
    Action enterPress;
    Action leftPress;
    Action rightPress;
    Action upPress;
    Action downPress;
    Action backspacePress;

    //</editor-fold>

    public FrameFiller() {
        tags = new BirdTagMaker().getBirdNames();
        setLayout(null);
        addComponents();
        setBackground(transparent);
        setPreferredSize(new Dimension(591, 863));
        Timer timer = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                grabFocus();
            }
        });
        timer.setRepeats(true);
        timer.start(); // Go go go!

    }

    private void addComponents() {
        generateBird();
        int inputAreaX = 77;
        int inputAreaY = 450;
        int inputAreaWidth = 240;
        int inputAreaHeight = 30;

        inputArea = new JTextField();
        inputArea.setBounds(inputAreaX, inputAreaY, inputAreaWidth, inputAreaHeight);
        inputArea.setEnabled(true);
        add(inputArea);

        NumPadPanel numPadPanel = new NumPadPanel();
        numPadPanel.setBounds(359, 222, 172, 190);
        add(numPadPanel);


        KeyboardPanel keyboardPanel = new KeyboardPanel();
        keyboardPanel.setBounds(37, 592, 433, 205);
        add(keyboardPanel);

        leftButton = new CustomImgButton();
        leftButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/directionalPadButtons/leftbutton.png"));
        leftButton.setBackground(transparent);
        leftButton.setContentAreaFilled(false);
        leftButton.setBorderPainted(false);
        leftButton.setBounds(356, 445, 47, 73);
        add(leftButton);
        rightButton = new CustomImgButton();
        rightButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/directionalPadButtons/rightbutton.png"));
        rightButton.setBackground(transparent);
        rightButton.setContentAreaFilled(false);
        rightButton.setBorderPainted(false);
        rightButton.setBounds(488, 445, 47, 73);
        add(rightButton);
        upButton = new CustomImgButton();
        upButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/directionalPadButtons/upbutton.png"));
        upButton.setBackground(transparent);
        upButton.setContentAreaFilled(false);
        upButton.setBorderPainted(false);
        upButton.setBounds(394, 423, 102, 31);
        add(upButton);
        downButton = new CustomImgButton();
        downButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/directionalPadButtons/downbutton.png"));
        downButton.setBackground(transparent);
        downButton.setContentAreaFilled(false);
        downButton.setBorderPainted(false);
        downButton.setBounds(394, 510, 102, 31);
        add(downButton);

        enterPress = new enterPress();
        lightningBoltButton = new CustomImgButton();
        lightningBoltButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/lightningbutton.png"));
        lightningBoltButton.setLayout(null);
        lightningBoltButton.setBackground(transparent);
        lightningBoltButton.setContentAreaFilled(false);
        lightningBoltButton.setPreferredSize(new Dimension(69, 141));
        lightningBoltButton.setBounds(475, 600, 69, 141);
        lightningBoltButton.setBorderPainted(false);
        add(lightningBoltButton);
        spacePress = new spacePress();
        spacebar = new CustomImgButton();
        spacebar.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/spacebar.png"));
        spacebar.setLayout(null);
        spacebar.setBackground(transparent);
        spacebar.setContentAreaFilled(false);
        spacebar.setPreferredSize(new Dimension(193, 40));
        spacebar.setBounds(350, 755, 193, 40);
        spacebar.setBorderPainted(false);
        add(spacebar);
        
        guess = new CustomImgButton();
        guess.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/trianglebutton/trianglebuttonguess.png"));
        guess.setLayout(null);
        guess.setBackground(transparent);
        guess.setContentAreaFilled(false);
        guess.setPreferredSize(new Dimension(90,48));
        guess.setBounds(305,136,90,48);
        guess.setBorderPainted(false);
        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSetting("guess");
            }
        });
        add(guess);

        search = new CustomImgButton();
        search.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/trianglebutton/trianglebuttonsearch.png"));
        search.setLayout(null);
        search.setBackground(transparent);
        search.setContentAreaFilled(false);
        search.setPreferredSize(new Dimension(90,48));
        search.setBounds(408,136,90,48);
        search.setBorderPainted(false);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSetting("search");
            }
        });
        add(search);

        leftPress = new leftPress();
        rightPress = new rightPress();
        upPress = new upPress();
        downPress = new downPress();

        backspacePress = new backspacePress();


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

        getInputMap().put(KeyStroke.getKeyStroke('a'), "aAction");
        getActionMap().put("aAction", aPress);
        getInputMap().put(KeyStroke.getKeyStroke('b'), "bAction");
        getActionMap().put("bAction", bPress);
        getInputMap().put(KeyStroke.getKeyStroke('c'), "cAction");
        getActionMap().put("cAction", cPress);
        getInputMap().put(KeyStroke.getKeyStroke('d'), "dAction");
        getActionMap().put("dAction", dPress);
        getInputMap().put(KeyStroke.getKeyStroke('e'), "eAction");
        getActionMap().put("eAction", ePress);
        getInputMap().put(KeyStroke.getKeyStroke('f'), "fAction");
        getActionMap().put("fAction", fPress);
        getInputMap().put(KeyStroke.getKeyStroke('g'), "gAction");
        getActionMap().put("gAction", gPress);
        getInputMap().put(KeyStroke.getKeyStroke('h'), "hAction");
        getActionMap().put("hAction", hPress);
        getInputMap().put(KeyStroke.getKeyStroke('i'), "iAction");
        getActionMap().put("iAction", iPress);
        getInputMap().put(KeyStroke.getKeyStroke('j'), "jAction");
        getActionMap().put("jAction", jPress);
        getInputMap().put(KeyStroke.getKeyStroke('k'), "kAction");
        getActionMap().put("kAction", kPress);
        getInputMap().put(KeyStroke.getKeyStroke('l'), "lAction");
        getActionMap().put("lAction", lPress);
        getInputMap().put(KeyStroke.getKeyStroke('m'), "mAction");
        getActionMap().put("mAction", mPress);
        getInputMap().put(KeyStroke.getKeyStroke('n'), "nAction");
        getActionMap().put("nAction", nPress);
        getInputMap().put(KeyStroke.getKeyStroke('o'), "oAction");
        getActionMap().put("oAction", oPress);
        getInputMap().put(KeyStroke.getKeyStroke('p'), "pAction");
        getActionMap().put("pAction", pPress);
        getInputMap().put(KeyStroke.getKeyStroke('q'), "qAction");
        getActionMap().put("qAction", qPress);
        getInputMap().put(KeyStroke.getKeyStroke('r'), "rAction");
        getActionMap().put("rAction", rPress);
        getInputMap().put(KeyStroke.getKeyStroke('s'), "sAction");
        getActionMap().put("sAction", sPress);
        getInputMap().put(KeyStroke.getKeyStroke('t'), "tAction");
        getActionMap().put("tAction", tPress);
        getInputMap().put(KeyStroke.getKeyStroke('u'), "uAction");
        getActionMap().put("uAction", uPress);
        getInputMap().put(KeyStroke.getKeyStroke('v'), "vAction");
        getActionMap().put("vAction", vPress);
        getInputMap().put(KeyStroke.getKeyStroke('w'), "wAction");
        getActionMap().put("wAction", wPress);
        getInputMap().put(KeyStroke.getKeyStroke('x'), "xAction");
        getActionMap().put("xAction", xPress);
        getInputMap().put(KeyStroke.getKeyStroke('y'), "yAction");
        getActionMap().put("yAction", yPress);
        getInputMap().put(KeyStroke.getKeyStroke('z'), "zAction");
        getActionMap().put("zAction", zPress);
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "spaceAction");
        getActionMap().put("spaceAction", spacePress);
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "enterAction");
        getActionMap().put("enterAction", enterPress);
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "backspaceAction");
        getActionMap().put("backspaceAction", backspacePress);


        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "leftAction");
        getActionMap().put("leftAction", leftPress);
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "rightAction");
        getActionMap().put("rightAction", rightPress);
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "upAction");
        getActionMap().put("upAction", upPress);
        getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "downAction");
        getActionMap().put("downAction", downPress);

    }

    public void generateBird() {
        URL birdURL = null;
        try {
            birdURL = new URL(BirdImageCaller.getImgUrl());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int imgDimensions = 258;
        int imgX = 68;
        int imgY = 237;
        //                bird = new ImagePanel(new URL("https://via.placeholder.com/" + imgDimensions));
        bird = new ImagePanel(birdURL);

        bird.setBounds(imgX, imgY, imgDimensions, imgDimensions);
        add(bird);
    }

    public void generateBird(String tags) {
        URL birdURL = null;
        try {
            birdURL = new URL(BirdImageCaller.getImgUrl(tags));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int imgDimensions = 258;
        int imgX = 68;
        int imgY = 237;
        //                bird = new ImagePanel(new URL("https://via.placeholder.com/" + imgDimensions));
        bird = new ImagePanel(birdURL);

        bird.setBounds(imgX, imgY, imgDimensions, imgDimensions);
        add(bird);
    }


    public class NumPadPanel extends JPanel {

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

            setLayout(new GridLayout(4, 6, 1, 1));
            addNumPad();
            setBackground(transparent);
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

    }

    public class KeyboardPanel extends JPanel {
        public KeyboardPanel() {

            aPress = new aPress();
            bPress = new bPress();
            cPress = new cPress();
            dPress = new dPress();
            ePress = new ePress();
            fPress = new fPress();
            gPress = new gPress();
            hPress = new hPress();
            iPress = new iPress();
            jPress = new jPress();
            kPress = new kPress();
            lPress = new lPress();
            mPress = new mPress();
            nPress = new nPress();
            oPress = new oPress();
            pPress = new pPress();
            qPress = new qPress();
            rPress = new rPress();
            sPress = new sPress();
            tPress = new tPress();
            uPress = new uPress();
            vPress = new vPress();
            wPress = new wPress();
            xPress = new xPress();
            yPress = new yPress();
            zPress = new zPress();

            addKeyboard();
            setLayout(new GridLayout(4, 3, 3, 1));
            setBackground(transparent);

        }

        public void addKeyboard() {
            keyA = new KeyboardButton("A");
            keyB = new KeyboardButton("B");
            keyC = new KeyboardButton("C");
            keyD = new KeyboardButton("D");
            keyE = new KeyboardButton("E");
            keyF = new KeyboardButton("F");
            keyG = new KeyboardButton("G");
            keyH = new KeyboardButton("H");
            keyI = new KeyboardButton("I");
            keyJ = new KeyboardButton("J");
            keyK = new KeyboardButton("K");
            keyL = new KeyboardButton("L");
            keyM = new KeyboardButton("M");
            keyN = new KeyboardButton("N");
            keyO = new KeyboardButton("O");
            keyP = new KeyboardButton("P");
            keyQ = new KeyboardButton("Q");
            keyR = new KeyboardButton("R");
            keyS = new KeyboardButton("S");
            keyT = new KeyboardButton("T");
            keyU = new KeyboardButton("U");
            keyV = new KeyboardButton("V");
            keyW = new KeyboardButton("W");
            keyX = new KeyboardButton("X");
            keyY = new KeyboardButton("Y");
            keyZ = new KeyboardButton("Z");

            add(keyA);
            add(keyB);
            add(keyC);
            add(keyD);
            add(keyE);
            add(keyF);
            add(keyG);
            add(keyH);
            add(keyI);
            add(keyJ);
            add(keyK);
            add(keyL);
            add(keyM);
            add(keyN);
            add(keyO);
            add(keyP);
            add(keyQ);
            add(keyR);
            add(keyS);
            add(keyT);
            add(keyU);
            add(keyV);
            add(keyW);
            add(keyX);
            add(keyY);
            add(keyZ);
        }

    }

    public class onePress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "1");
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
            inputArea.setText(inputArea.getText() + "2");
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
            inputArea.setText(inputArea.getText() + "3");
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
            inputArea.setText(inputArea.getText() + "4");
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
            inputArea.setText(inputArea.getText() + "5");
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
            inputArea.setText(inputArea.getText() + "6");
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
            inputArea.setText(inputArea.getText() + "7");
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
            inputArea.setText(inputArea.getText() + "8");
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
            inputArea.setText(inputArea.getText() + "9");
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
            inputArea.setText(inputArea.getText() + "0");
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
            inputArea.setText(inputArea.getText() + ".");
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

    public class aPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "a");
            keyA.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyAPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyA.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyA.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class bPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "b");
            keyB.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyBPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyB.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyB.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class cPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "c");
            keyC.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyCPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyC.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyC.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class dPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "d");
            keyD.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyDPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyD.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyD.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class ePress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "e");
            keyE.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyEPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyE.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyE.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class fPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "f");
            keyF.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyFPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyF.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyF.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class gPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "g");
            keyG.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyGPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyG.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyG.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class hPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "h");
            keyH.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyHPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyH.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyH.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class iPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "i");
            keyI.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyIPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyI.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyI.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class jPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "j");
            keyJ.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyJPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyJ.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyJ.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class kPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "k");
            keyK.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyKPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyK.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyK.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class lPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "l");
            keyL.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyLPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyL.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyL.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class mPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "m");
            keyM.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyMPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyM.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyM.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class nPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "n");
            keyN.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyNPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyN.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyN.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class oPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "o");
            keyO.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyOPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyO.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyO.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class pPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "p");
            keyP.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyPPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyP.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyP.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class qPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "q");
            keyQ.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyQPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyQ.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyQ.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class rPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "r");
            keyR.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyRPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyR.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyR.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class sPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "s");
            keyS.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keySPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyS.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyS.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class tPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "t");
            keyT.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyTPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyT.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyT.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class uPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "u");
            keyU.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyUPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyU.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyU.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class vPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "v");
            keyV.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyVPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyV.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyV.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class wPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "w");
            keyW.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyWPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyW.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyW.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class xPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "x");
            keyX.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyXPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyX.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyX.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class yPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "y");
            keyY.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyYPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyY.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyY.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class zPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + "z");
            keyZ.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyZPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    keyZ.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/keyZ.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class spacePress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText() + " ");
            spacebar.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/spacebarPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    spacebar.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/spacebar.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class enterPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (setting == "guess") {
                String common = tags.split(",")[1].toLowerCase();
                if (common.contains("-") || common.contains("'")) {
                    common = common.replace("-", " ");
                    common = common.replace("'", " ");
                }
                System.out.println(common);
                String scientfic = tags.split(",")[0].toLowerCase();
                if (Objects.equals(inputArea.getText(), common) || inputArea.getText().toLowerCase() == scientfic) {
                    System.out.println("MATCH");
                    tags = new BirdTagMaker().getBirdNames();
                    generateBird();
                    bird.revalidate();
                    bird.repaint();
                }

                inputArea.setText("");
                inputArea.repaint();

                lightningBoltButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/lightningbuttonPressed.png"));
                Timer timer = new Timer(250, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        lightningBoltButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/lightningbutton.png"));
                    }
                });
                timer.setRepeats(false); // Only execute once
                timer.start(); // Go go go!
            } else if (setting == "search") {
                tags = inputArea.getText();

                try (Stream<String> stream = Files.lines(Paths.get("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/ebird.csv"))) {
                    tags = stream.filter(lines -> lines.contains(tags)).findFirst().get();
//                            .forEach(System.out::println);

//                    System.out.println(tags);
                    generateBird(tags);
                    bird.revalidate();
                    bird.repaint();

                } catch (IOException | NoSuchElementException evnt) {
                    evnt.printStackTrace();
                }

                inputArea.setText("");
                inputArea.repaint();

                lightningBoltButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/lightningbuttonPressed.png"));
                Timer timer = new Timer(250, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        lightningBoltButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/lightningbutton.png"));
                    }
                });
                timer.setRepeats(false); // Only execute once
                timer.start(); // Go go go!
            }
        }


    }

    public class leftPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            leftButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/leftbuttonPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    leftButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/leftbutton.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class rightPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            rightButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/rightPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    rightButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/rightbutton.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class upPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            upButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/upbuttonPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    upButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/upbutton.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class downPress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            downButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/downbuttonPressed.png"));
            Timer timer = new Timer(250, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    downButton.setIcon(new ImageIcon("C:/Users/esmee/Desktop/BIRDDEX/src/main/java/res/keyboardButtons/downbutton.png"));
                }
            });
            timer.setRepeats(false); // Only execute once
            timer.start(); // Go go go!
        }
    }

    public class backspacePress extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputArea.setText(inputArea.getText().substring(0, inputArea.getText().length() - 1));
        }
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }
}
