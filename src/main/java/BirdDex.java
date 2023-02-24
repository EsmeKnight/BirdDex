//import javax.imageio.ImageIO;
//import javax.swing.*;
//import javax.swing.border.CompoundBorder;
//import javax.swing.border.EmptyBorder;
//import javax.swing.border.LineBorder;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.net.URL;
//
//public class BirdDex {
//    private BufferedImage numPadButton1Img;
//    private BufferedImage numPadButton2Img;
//    private BufferedImage numPadButton3Img;
//    private BufferedImage numPadButton4Img;
//    private BufferedImage numPadButton5Img;
//    private BufferedImage numPadButton6Img;
//    private BufferedImage numPadButton7Img;
//    private BufferedImage numPadButton8Img;
//    private BufferedImage numPadButton9Img;
//    private BufferedImage numPadButton0Img;
//    private BufferedImage numPadButtonDotImg;
//    private BufferedImage keyAImg;
//    private BufferedImage keyBImg;
//    private BufferedImage keyCImg;
//    private BufferedImage keyDImg;
//    private BufferedImage keyEImg;
//    private BufferedImage keyFImg;
//    private BufferedImage keyGImg;
//    private BufferedImage keyHImg;
//    private BufferedImage keyIImg;
//    private BufferedImage keyJImg;
//    private BufferedImage keyKImg;
//    private BufferedImage keyLImg;
//    private BufferedImage keyMImg;
//    private BufferedImage keyNImg;
//    private BufferedImage keyOImg;
//    private BufferedImage keyPImg;
//    private BufferedImage keyQImg;
//    private BufferedImage keyRImg;
//    private BufferedImage keySImg;
//    private BufferedImage keyTImg;
//    private BufferedImage keyUImg;
//    private BufferedImage keyVImg;
//    private BufferedImage keyWImg;
//    private BufferedImage keyXImg;
//    private BufferedImage keyYImg;
//    private BufferedImage keyZImg;
//
//    private BufferedImage keyImg;
//
//
//    public BirdDex() {
//        BirdPane birdPane = new BirdPane();
//
//        birdPane.setLayout(null);
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
//                         UnsupportedLookAndFeelException ex) {
//                }
//
//                JWindow window = new JWindow();
//                window.setBackground(new Color(0, 0, 0, 0));
//                window.setContentPane(birdPane);
//                window.pack();
//                window.setLocationRelativeTo(null);
//                window.setVisible(true);
//                window.setAlwaysOnTop(true);
//            }
//        });
//    }
//
//    public class BirdPane extends JPanel {
//
//        private BufferedImage dex;
//
//        public BirdPane() {
//
//            setBorder(new CompoundBorder(
//                    new LineBorder(Color.RED),
//                    new EmptyBorder(0, 0, 250, 0)));
//
//            try {
//                System.out.println(new File("src/main/java/res/DEX.png").exists());
////                dex = ImageIO.read(getClass().getResource("/resources/DEX.png"));
//                dex = ImageIO.read(new FileInputStream("src/main/java/res/DEX.png"));
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//
//            setOpaque(false);
//
//            //text input field
//            addInput();
//
//            // add numpad buttons
//            addNumPad();
//
//            // add keyboard
//            addKeyboard();
//
//            // generate bird
//
//            //NEED THIS STRING TO COMPARE TO USER INPUT
//            String tags = new BirdTagMaker().getBirdNames();
//            generateBird(tags);
//
//        }
//
//        // called in BirdDex to create numPad
//        private void addNumPad() {
//
//            try {
//
//                numPadButton1Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton1.png"));
//                numPadButton2Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton2.png"));
//                numPadButton3Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton3.png"));
//                numPadButton4Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton4.png"));
//                numPadButton5Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton5.png"));
//                numPadButton6Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton6.png"));
//                numPadButton7Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton7.png"));
//                numPadButton8Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton8.png"));
//                numPadButton9Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton9.png"));
//                numPadButton0Img = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButton0.png"));
//                numPadButtonDotImg = ImageIO.read(new FileInputStream("src/main/java/res/numpadButtons/numPadButtonDot.png"));
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//
//            int numPadButtonWidth = 42;
//            int numPadButtonHeight = 35;
//            int numPadColumnSpacing = 58;
//            int numPadRowSpacing = 47;
//            int firstColumnX = 365;
//            int secondColumnX = firstColumnX + numPadColumnSpacing;
//            int thirdColumnX = firstColumnX + (2 * numPadColumnSpacing);
//            int firstRowY = 228;
//            int secondRowY = firstRowY + numPadRowSpacing;
//            int thirdRowY = firstRowY + (2 * numPadRowSpacing);
//            int fourthRowY = firstRowY + (3 * numPadRowSpacing);
//
//            // potential to automate
////            for (int i = 1; i < 12; i++){
////                new JImageButton(numPadButton1Img, Integer.toString(i)).setBounds();
////            }
//
//            JImageButton numPadOne = new JImageButton(numPadButton1Img, "1");
//            numPadOne.setBounds(firstColumnX, firstRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadTwo = new JImageButton(numPadButton2Img, "2");
//            numPadTwo.setBounds(secondColumnX, firstRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadThree = new JImageButton(numPadButton3Img, "3");
//            numPadThree.setBounds(thirdColumnX, firstRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadFour = new JImageButton(numPadButton4Img, "4");
//            numPadFour.setBounds(firstColumnX, secondRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadFive = new JImageButton(numPadButton5Img, "5");
//            numPadFive.setBounds(secondColumnX, secondRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadSix = new JImageButton(numPadButton6Img, "6");
//            numPadSix.setBounds(thirdColumnX, secondRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadSeven = new JImageButton(numPadButton7Img, "7");
//            numPadSeven.setBounds(firstColumnX, thirdRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadEight = new JImageButton(numPadButton8Img, "8");
//            numPadEight.setBounds(secondColumnX, thirdRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadNine = new JImageButton(numPadButton9Img, "9");
//            numPadNine.setBounds(thirdColumnX, thirdRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadZero = new JImageButton(numPadButton0Img, "0");
//            numPadZero.setBounds(secondColumnX, fourthRowY, numPadButtonWidth, numPadButtonHeight);
//
//            JImageButton numPadDot = new JImageButton(numPadButtonDotImg, ".");
//            numPadDot.setBounds(firstColumnX, fourthRowY, numPadButtonWidth, numPadButtonHeight);
//
//
//            add(numPadOne);
//            add(numPadTwo);
//            add(numPadThree);
//            add(numPadFour);
//            add(numPadFive);
//            add(numPadSix);
//            add(numPadSeven);
//            add(numPadEight);
//            add(numPadNine);
//            add(numPadDot);
//            add(numPadZero);
//        }
//
//        // called in BirdDex to create keyboard
//        private void addKeyboard() {
//
//            int keyButtonWidth = 51;
//            int keyButtonHeight = 39;
//            int keyboardColumnSpacing = 62;
//            int keyboardRowSpacing = 52;
//            int firstColumnX = 41;
//            int secondColumnX = firstColumnX + keyboardColumnSpacing;
//            int thirdColumnX = firstColumnX + (2 * keyboardColumnSpacing);
//            int fourthColumnX = firstColumnX + (3 * keyboardColumnSpacing);
//            int fifthColumnX = firstColumnX + (4 * keyboardColumnSpacing);
//            int sixthColumnX = firstColumnX + (5 * keyboardColumnSpacing);
//            int seventhColumnX = firstColumnX + (6 * keyboardColumnSpacing);
//            int firstRowY = 597;
//            int secondRowY = firstRowY + keyboardRowSpacing;
//            int thirdRowY = firstRowY + (2 * keyboardRowSpacing);
//            int fourthRowY = firstRowY + (3 * keyboardRowSpacing);
//
//
//            try {
//                keyAImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyA.png"));
//                keyBImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyB.png"));
//                keyCImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyC.png"));
//                keyDImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyD.png"));
//                keyEImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyE.png"));
//                keyFImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyF.png"));
//                keyGImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyG.png"));
//                keyHImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyH.png"));
//                keyIImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyI.png"));
//                keyJImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyJ.png"));
//                keyKImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyK.png"));
//                keyLImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyL.png"));
//                keyMImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyM.png"));
//                keyNImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyN.png"));
//                keyOImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyO.png"));
//                keyPImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyP.png"));
//                keyQImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyQ.png"));
//                keyRImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyR.png"));
//                keySImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyS.png"));
//                keyTImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyT.png"));
//                keyUImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyU.png"));
//                keyVImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyV.png"));
//                keyWImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyW.png"));
//                keyXImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyX.png"));
//                keyYImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyY.png"));
//                keyZImg = ImageIO.read(new FileInputStream("src/main/java/res/keyboardButtons/keyZ.png"));
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//            JImageButton keyA = new JImageButton(keyAImg, "A");
//            keyA.setBounds(firstColumnX
//                    , firstRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyB = new JImageButton(keyBImg, "B");
//            keyB.setBounds(secondColumnX
//                    , firstRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyC = new JImageButton(keyCImg, "C");
//            keyC.setBounds(thirdColumnX
//                    , firstRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyD = new JImageButton(keyDImg, "D");
//            keyD.setBounds(fourthColumnX
//                    , firstRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyE = new JImageButton(keyEImg, "E");
//            keyE.setBounds(fifthColumnX
//                    , firstRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyF = new JImageButton(keyFImg, "F");
//            keyF.setBounds(sixthColumnX
//                    , firstRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyG = new JImageButton(keyGImg, "G");
//            keyG.setBounds(seventhColumnX
//                    , firstRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyH = new JImageButton(keyHImg, "H");
//            keyH.setBounds(firstColumnX
//                    , secondRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyI = new JImageButton(keyIImg, "I");
//            keyI.setBounds(secondColumnX
//                    , secondRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyJ = new JImageButton(keyJImg, "J");
//            keyJ.setBounds(thirdColumnX
//                    , secondRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyK = new JImageButton(keyKImg, "K");
//            keyK.setBounds(fourthColumnX
//                    , secondRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyL = new JImageButton(keyLImg, "L");
//            keyL.setBounds(fifthColumnX
//                    , secondRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyM = new JImageButton(keyMImg, "M");
//            keyM.setBounds(sixthColumnX
//                    , secondRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyN = new JImageButton(keyNImg, "N");
//            keyN.setBounds(seventhColumnX
//                    , secondRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyO = new JImageButton(keyOImg, "O");
//            keyO.setBounds(firstColumnX
//                    , thirdRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyP = new JImageButton(keyPImg, "P");
//            keyP.setBounds(secondColumnX
//                    , thirdRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyQ = new JImageButton(keyQImg, "Q");
//            keyQ.setBounds(thirdColumnX
//                    , thirdRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyR = new JImageButton(keyRImg, "R");
//            keyR.setBounds(fourthColumnX
//                    , thirdRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyS = new JImageButton(keySImg, "S");
//            keyS.setBounds(fifthColumnX
//                    , thirdRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyT = new JImageButton(keyTImg, "T");
//            keyT.setBounds(sixthColumnX
//                    , thirdRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyU = new JImageButton(keyUImg, "U");
//            keyU.setBounds(seventhColumnX
//                    , thirdRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyV = new JImageButton(keyVImg, "V");
//            keyV.setBounds(firstColumnX
//                    , fourthRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyW = new JImageButton(keyWImg, "W");
//            keyW.setBounds(secondColumnX
//                    , fourthRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyX = new JImageButton(keyXImg, "X");
//            keyX.setBounds(thirdColumnX
//                    , fourthRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyY = new JImageButton(keyYImg, "Y");
//            keyY.setBounds(fourthColumnX
//                    , fourthRowY, keyButtonWidth, keyButtonHeight);
//            JImageButton keyZ = new JImageButton(keyZImg, "Z");
//            keyZ.setBounds(fifthColumnX
//                    , fourthRowY, keyButtonWidth, keyButtonHeight);
//
//            add(keyA);
//            add(keyB);
//            add(keyC);
//            add(keyD);
//            add(keyE);
//            add(keyF);
//            add(keyG);
//            add(keyH);
//            add(keyI);
//            add(keyJ);
//            add(keyK);
//            add(keyL);
//            add(keyM);
//            add(keyN);
//            add(keyO);
//            add(keyP);
//            add(keyQ);
//            add(keyR);
//            add(keyS);
//            add(keyT);
//            add(keyU);
//            add(keyV);
//            add(keyW);
//            add(keyX);
//            add(keyY);
//            add(keyZ);
//
//        }
//
//        // called in BirdDex to create bird image
//        // called to generate new image
//        private void generateBird(String tags) {
//            ImagePanel bird;
//
//            URL birdURL = null;
//            try {
//                birdURL = new URL(BirdImageCaller.getImgUrl(tags));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//
//            int imgDimensions = 258;
//            int imgX = 68;
//            int imgY = 237;
//            //                bird = new ImagePanel(new URL("https://via.placeholder.com/" + imgDimensions));
//            bird = new ImagePanel(birdURL);
//
//            bird.setBounds(imgX, imgY, imgDimensions, imgDimensions);
//            add(bird);
//        }
//
//        private void addInput() {
//            int inputAreaX = 77;
//            int inputAreaY = 450;
//            int inputAreaWidth = 240;
//            int inputAreaHeight = 30;
//
//            JTextField inputArea = new JTextField();
//            inputArea.setBounds(inputAreaX, inputAreaY, inputAreaWidth, inputAreaHeight);
//            inputArea.setEnabled(true);
//            inputArea.setText("TEST");
//            add(inputArea);
//        }
//
//
//        @Override
//        public Dimension getPreferredSize() {
//            return dex == null ? new Dimension(200, 200) : new Dimension(dex.getWidth(), dex.getHeight());
//        }
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            if (dex != null) {
//                Graphics2D g2d = (Graphics2D) g.create();
//                g2d.drawImage(dex, 0, 0, this);
//                g2d.dispose();
//            }
//        }
//    }
//
//}
