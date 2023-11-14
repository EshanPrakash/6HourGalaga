import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class MyFrame extends JFrame implements KeyListener, ActionListener{

    Timer timer;
    JLabel shiplabel;
    Random rand = new Random();

    //zako variables
    JLabel zakolabel;
    JLabel zakolabel1;
    JLabel zakolabel2;
    JLabel zakolabel3;
    JLabel zakolabel4;
    JLabel zakolabel5;
    JLabel zakolabel6;
    JLabel zakolabel7;
    JLabel zakolabel8;
    JLabel zakolabel9;

    int zakoy = (rand.nextInt(3) + 4) * 100;
    int zakoy1 = (rand.nextInt(3) + 4) * 100;
    int zakoy2 = (rand.nextInt(3) + 4) * 100;
    int zakoy3 = (rand.nextInt(3) + 4) * 100;
    int zakoy4 = (rand.nextInt(3) + 4) * 100;
    int zakoy5 = (rand.nextInt(3) + 4) * 100;
    int zakoy6 = (rand.nextInt(3) + 4) * 100;
    int zakoy7 = (rand.nextInt(3) + 4) * 100;
    int zakoy8 = (rand.nextInt(3) + 4) * 100;
    int zakoy9 = (rand.nextInt(3) + 4) * 100;

    int zakovelocity = 15;
    int zakovelocity1 = 15;
    int zakovelocity2 = 15;
    int zakovelocity3 = 15;
    int zakovelocity4 = 15;
    int zakovelocity5 = 15;
    int zakovelocity6 = 15;
    int zakovelocity7 = 15;
    int zakovelocity8 = 15;
    int zakovelocity9 = 15;

    int masterzakohealth = 1;
    int zakohealth = 1;
    int zakohealth1 = 1;
    int zakohealth2 = 1;
    int zakohealth3 = 1;
    int zakohealth4 = 1;
    int zakohealth5 = 1;
    int zakohealth6 = 1;
    int zakohealth7 = 1;
    int zakohealth8 = 1;
    int zakohealth9 = 1;

    //goei variables
    JLabel goeilabel;
    JLabel goeilabel1;
    JLabel goeilabel2;
    JLabel goeilabel3;
    JLabel goeilabel4;
    JLabel goeilabel5;
    JLabel goeilabel6;
    JLabel goeilabel7;
    JLabel goeilabel8;
    JLabel goeilabel9;

    int goeiy = (rand.nextInt(4)) * 100;
    int goeiy1 = (rand.nextInt(4)) * 100;
    int goeiy2 = (rand.nextInt(4)) * 100;
    int goeiy3 = (rand.nextInt(4)) * 100;
    int goeiy4 = (rand.nextInt(4)) * 100;
    int goeiy5 = (rand.nextInt(4)) * 100;
    int goeiy6 = (rand.nextInt(4)) * 100;
    int goeiy7 = (rand.nextInt(4)) * 100;
    int goeiy8 = (rand.nextInt(4)) * 100;
    int goeiy9 = (rand.nextInt(4)) * 100;

    int goeivelocity = 20;
    int goeivelocity1 = 20;
    int goeivelocity2 = 20;
    int goeivelocity3 = 20;
    int goeivelocity4 = 20;
    int goeivelocity5 = 20;
    int goeivelocity6 = 20;
    int goeivelocity7 = 20;
    int goeivelocity8 = 20;
    int goeivelocity9 = 20;

    int mastergoeihealth = 3;
    int goeihealth = 3;
    int goeihealth1 = 3;
    int goeihealth2 = 3;
    int goeihealth3 = 3;
    int goeihealth4 = 3;
    int goeihealth5 = 3;
    int goeihealth6 = 3;
    int goeihealth7 = 3;
    int goeihealth8 = 3;
    int goeihealth9 = 3;

    //boss galaga variables
    JLabel galagalabel;
    JLabel galagablastlabel;

    int galagay = 700;
    int galagax = 0;

    int galagavelocityy = -13;
    int galagavelocityx = 9;

    int galagamasterhealth = 10;
    int galagahealth = 10;

    boolean galagaappearance = false;
    boolean galagablastfired = false;


    //labels and icons

    JLabel bulletlabel;
    JLabel bulletlabel1;
    JLabel bulletlabel2;
    JLabel bulletlabel3;
    JLabel bulletlabel4;
    JLabel bulletlabel5;
    JLabel bulletlabel6;
    JLabel scorelabel;
    JLabel healthlabel;
    JLabel shipsremaininglabel;
    JLabel wavelabel;
    ImageIcon spaceship;
    ImageIcon zako;
    ImageIcon goei;
    ImageIcon bossgalaga;
    ImageIcon galagablast;


    int shipvelocity = 25;



    int bulletvelocity = 60;
    int score = 0;
    int shiphealth = 5;
    int shipsremaining = 3;



    boolean bulletfired = false;
    boolean bulletfired1 = false;
    boolean bulletfired2 = false;
    boolean bulletfired3 = false;
    boolean bulletfired4 = false;
    boolean bulletfired5 = false;
    boolean bulletfired6 = false;

    boolean wavedone = false;
    int wavescompleted = 0;


    MyFrame() {

        //creates the JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setLayout(null);
        this.addKeyListener(this);

        spaceship = new ImageIcon("spaceship100x118.png");
        zako = new ImageIcon("zako.png");
        goei = new ImageIcon("goei.png");
        bossgalaga =  new ImageIcon("bossgalaga.png");
        galagablast = new ImageIcon("galagablast.png");
        shiplabel = new JLabel();
        shiplabel.setBounds(450, 800, 100, 118);
        shiplabel.setIcon(spaceship);
        //zakos
        zakolabel = new JLabel();
        zakolabel.setBounds(0,zakoy,112,84);
        zakolabel.setIcon(zako);
        zakolabel1 = new JLabel();
        zakolabel1.setBounds(200, zakoy1, 112, 84);
        zakolabel1.setIcon(zako);
        zakolabel2 = new JLabel();
        zakolabel2.setBounds(400, zakoy2, 112, 84);
        zakolabel2.setIcon(zako);
        zakolabel3 = new JLabel();
        zakolabel3.setBounds(600, zakoy3, 112, 84);
        zakolabel3.setIcon(zako);
        zakolabel4 = new JLabel();
        zakolabel4.setBounds(800, zakoy4, 112, 84);
        zakolabel4.setIcon(zako);
        zakolabel5 = new JLabel();
        zakolabel5.setBounds(0, zakoy5, 112, 84);
        zakolabel5.setIcon(zako);
        zakolabel6 = new JLabel();
        zakolabel6.setBounds(200, zakoy6, 112, 84);
        zakolabel6.setIcon(zako);
        zakolabel7 = new JLabel();
        zakolabel7.setBounds(400, zakoy7, 112, 84);
        zakolabel7.setIcon(zako);
        zakolabel8 = new JLabel();
        zakolabel8.setBounds(600, zakoy8, 112, 84);
        zakolabel8.setIcon(zako);
        zakolabel9 = new JLabel();
        zakolabel9.setBounds(800, zakoy9, 112, 84);
        zakolabel9.setIcon(zako);
        //goeis
        goeilabel = new JLabel();
        goeilabel.setBounds(0, goeiy, 112, 84);
        goeilabel.setIcon(goei);
        goeilabel1 = new JLabel();
        goeilabel1.setBounds(200, goeiy1,  112, 84);
        goeilabel1.setIcon(goei);
        goeilabel2 = new JLabel();
        goeilabel2.setBounds(400, goeiy2, 112, 84);
        goeilabel2.setIcon(goei);
        goeilabel3 = new JLabel();
        goeilabel3.setBounds(600, goeiy3, 112, 84);
        goeilabel3.setIcon(goei);
        goeilabel4 = new JLabel();
        goeilabel4.setBounds(800, goeiy4, 112, 84);
        goeilabel4.setIcon(goei);
        goeilabel5 = new JLabel();
        goeilabel5.setBounds(0, goeiy5, 112, 84);
        goeilabel5.setIcon(goei);
        goeilabel6 = new JLabel();
        goeilabel6.setBounds(200, goeiy6, 112, 84);
        goeilabel6.setIcon(goei);
        goeilabel7 = new JLabel();
        goeilabel7.setBounds(400, goeiy7, 112, 84);
        goeilabel7.setIcon(goei);
        goeilabel8 = new JLabel();
        goeilabel8.setBounds(600, goeiy8, 112, 84);
        goeilabel8.setIcon(goei);
        goeilabel9 = new JLabel();
        goeilabel9.setBounds(800, goeiy9, 112, 84);
        goeilabel9.setIcon(goei);
        //galaga
        galagalabel = new JLabel();
        galagalabel.setBounds(galagax, galagay, 126, 126);
        galagalabel.setIcon(bossgalaga);
        galagablastlabel = new JLabel();
        galagablastlabel.setBounds(galagax, galagay, 196, 273);
        galagablastlabel.setIcon(galagablast);
        //score bar
        scorelabel = new JLabel();
        scorelabel.setBounds(0,940,100,30);
        scorelabel.setBackground(Color.GREEN);
        scorelabel.setText(" Score: " + score);
        scorelabel.setOpaque(true);
        //health bar
        healthlabel = new JLabel();
        healthlabel.setBounds(0,910,100,30);
        healthlabel.setBackground(Color.RED);
        healthlabel.setText(" Health: " + shiphealth);
        healthlabel.setOpaque(true);
        //life bar
        shipsremaininglabel = new JLabel();
        shipsremaininglabel.setBounds(0,880,100,30);
        shipsremaininglabel.setBackground(Color.BLUE);
        shipsremaininglabel.setText(" Ships: " + shipsremaining);
        shipsremaininglabel.setOpaque(true);
        //wave bar
        wavelabel = new JLabel();
        wavelabel.setBounds(0,850,100,30);
        wavelabel.setBackground(Color.YELLOW);
        wavelabel.setText(" Waves: " + wavescompleted);
        wavelabel.setOpaque(true);
        //bullets
        bulletlabel = new JLabel();
        bulletlabel.setBounds(497,840,5,60);
        bulletlabel.setBackground(Color.RED);
        bulletlabel.setOpaque(true);
        bulletlabel1 = new JLabel();
        bulletlabel1.setBounds(497,840,5,60 );
        bulletlabel1.setBackground(Color.RED);
        bulletlabel1.setOpaque(true);
        bulletlabel2 = new JLabel();
        bulletlabel2.setBounds(497,840,5,60 );
        bulletlabel2.setBackground(Color.RED);
        bulletlabel2.setOpaque(true);
        bulletlabel3 = new JLabel();
        bulletlabel3.setBounds(497,840,5,60 );
        bulletlabel3.setBackground(Color.RED);
        bulletlabel3.setOpaque(true);
        bulletlabel4 = new JLabel();
        bulletlabel4.setBounds(497,840,5,60 );
        bulletlabel4.setBackground(Color.RED);
        bulletlabel4.setOpaque(true);
        bulletlabel5 = new JLabel();
        bulletlabel5.setBounds(497,840,5,60 );
        bulletlabel5.setBackground(Color.RED);
        bulletlabel5.setOpaque(true);
        bulletlabel6 = new JLabel();
        bulletlabel6.setBounds(497,840,5,60 );
        bulletlabel6.setBackground(Color.RED);
        bulletlabel6.setOpaque(true);
        //timer
        timer = new Timer(100, this);
        timer.start();

        //add labels to JFrame
        this.getContentPane().setBackground(Color.BLACK);
        this.add(shiplabel);
        //add zakos
        this.add(zakolabel);
        this.add(zakolabel1);
        this.add(zakolabel2);
        this.add(zakolabel3);
        this.add(zakolabel4);
        this.add(zakolabel5);
        this.add(zakolabel6);
        this.add(zakolabel7);
        this.add(zakolabel8);
        this.add(zakolabel9);
        //add goeis
        this.add(goeilabel);
        this.add(goeilabel1);
        this.add(goeilabel2);
        this.add(goeilabel3);
        this.add(goeilabel4);
        this.add(goeilabel5);
        this.add(goeilabel6);
        this.add(goeilabel7);
        this.add(goeilabel8);
        this.add(goeilabel9);
        //add galaga
        this.add(galagalabel);
        this.add(galagablastlabel);
        //stat bars
        this.add(scorelabel);
        this.add(healthlabel);
        this.add(shipsremaininglabel);
        //add bullets
        this.add(bulletlabel);
        this.add(bulletlabel1);
        this.add(bulletlabel2);
        this.add(bulletlabel3);
        this.add(bulletlabel4);
        this.add(bulletlabel5);
        this.add(bulletlabel6);
        //add wave labels
        this.add(wavelabel);

        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        //detects A and D for left and right movement
        switch(e.getKeyChar()) {
            case'a': shiplabel.setLocation(shiplabel.getX()-shipvelocity,shiplabel.getY());
                //System.out.println(shiplabel.getX());
                break;
            case'd': shiplabel.setLocation(shiplabel.getX()+shipvelocity,shiplabel.getY());
                //System.out.println(shiplabel.getX());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //detects left and right arrow for left and right movement
        switch(e.getKeyCode()) {
            case 37: shiplabel.setLocation(shiplabel.getX()-shipvelocity,shiplabel.getY());
                //System.out.println(shiplabel.getX());
                break;
            case 39: shiplabel.setLocation(shiplabel.getX()+shipvelocity,shiplabel.getY());
                //System.out.println(shiplabel.getX());
                break;
        }

        if (e.getKeyCode() == 32 && !bulletfired) {
            //System.out.println("Spacebar Pressed!");
            bulletfired = true;
        } else if (e.getKeyCode() == 32 && bulletfired && !bulletfired1) {
            //System.out.println("Spacebar Pressed Again!");
            bulletfired1 = true;
        } else if (e.getKeyCode() == 32 && bulletfired && bulletfired1 && !bulletfired2) {
            //System.out.println("Spacebar Pressed Again (2)!");
            bulletfired2 = true;
        } else if (e.getKeyCode() == 32 && bulletfired && bulletfired1 && bulletfired2 && !bulletfired3) {
            //System.out.println("Spacebar Pressed Again (3)!");
            bulletfired3 = true;
        } else if (e.getKeyCode() == 32 && bulletfired && bulletfired1 && bulletfired2 && bulletfired3 && !bulletfired4) {
            //System.out.println("Spacebar Pressed Again (4)!");
            bulletfired4 = true;
        } else if (e.getKeyCode() == 32 && bulletfired && bulletfired1 && bulletfired2 && bulletfired3 && bulletfired4 && !bulletfired5) {
            //System.out.println("Spacebar Pressed Again (5)!");
            bulletfired5 = true;
        } else if (e.getKeyCode() == 32 && bulletfired && bulletfired1 && bulletfired2 && bulletfired3 && bulletfired4 && bulletfired5 && !bulletfired6) {
            //System.out.println("Spacebar Pressed Again (6)!");
            bulletfired6 = true;
        }




    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Un-comment these to check what keys are being released by the user
        //System.out.println("You released key char: " + e.getKeyChar());
        //System.out.println("You released key code: " + e.getKeyCode());
        /*if (e.getKeyCode() == 32) {
            //System.out.println("Spacebar Released!");

        }*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //goei animations
        if(goeilabel.getX() >= 888 || goeilabel.getX() < 0) {
            goeivelocity = goeivelocity * - 1;
            goeilabel.setLocation(goeilabel.getX(), goeilabel.getY() + 100);
        }
        if(goeilabel1.getX() >= 888 || goeilabel1.getX() < 0) {
            goeivelocity1 = goeivelocity1 * - 1;
            goeilabel1.setLocation(goeilabel1.getX(), goeilabel1.getY() + 100);
        }
        if(goeilabel2.getX() >= 888 || goeilabel2.getX() < 0) {
            goeivelocity2 = goeivelocity2 * - 1;
            goeilabel2.setLocation(goeilabel2.getX(), goeilabel2.getY() + 100);
        }
        if(goeilabel3.getX() >= 888 || goeilabel3.getX() < 0) {
            goeivelocity3 = goeivelocity3 * - 1;
            goeilabel3.setLocation(goeilabel3.getX(), goeilabel3.getY() + 100);
        }
        if(goeilabel4.getX() >= 888 || goeilabel4.getX() < 0) {
            goeivelocity4 = goeivelocity4 * - 1;
            goeilabel4.setLocation(goeilabel4.getX(), goeilabel4.getY() + 100);
        }
        if(goeilabel5.getX() >= 888 || goeilabel5.getX() < 0) {
            goeivelocity5 = goeivelocity5 * - 1;
            goeilabel5.setLocation(goeilabel5.getX(), goeilabel5.getY() + 100);
        }
        if(goeilabel6.getX() >= 888 || goeilabel6.getX() < 0) {
            goeivelocity6 = goeivelocity6 * - 1;
            goeilabel6.setLocation(goeilabel6.getX(), goeilabel6.getY() + 100);
        }
        if(goeilabel7.getX() >= 888 || goeilabel7.getX() < 0) {
            goeivelocity7 = goeivelocity7 * - 1;
            goeilabel7.setLocation(goeilabel7.getX(), goeilabel7.getY() + 100);
        }
        if(goeilabel8.getX() >= 888 || goeilabel8.getX() < 0) {
            goeivelocity8 = goeivelocity8 * - 1;
            goeilabel8.setLocation(goeilabel8.getX(), goeilabel8.getY() + 100);
        }
        if(goeilabel9.getX() >= 888 || goeilabel9.getX() < 0) {
            goeivelocity9 = goeivelocity9 * - 1;
            goeilabel9.setLocation(goeilabel9.getX(), goeilabel9.getY() + 100);
        }
        if(goeihealth <= 0) {
            goeilabel.setLocation(goeilabel.getX(), -1000);
        }
        if(goeihealth1 <= 0) {
            goeilabel1.setLocation(goeilabel1.getX(), -1000);
        }
        if(goeihealth2 <=0) {
            goeilabel2.setLocation(goeilabel2.getX(), -1000);
        }
        if(goeihealth3 <=0) {
            goeilabel3.setLocation(goeilabel3.getX(), -1000);
        }
        if(goeihealth4 <=0) {
            goeilabel4.setLocation(goeilabel4.getX(), -1000);
        }
        if(goeihealth5 <= 0) {
            goeilabel5.setLocation(goeilabel5.getX(), -1000);
        }
        if(goeihealth6 <= 0) {
            goeilabel6.setLocation(goeilabel6.getX(), -1000);
        }
        if(goeihealth7 <=0) {
            goeilabel7.setLocation(goeilabel7.getX(), -1000);
        }
        if(goeihealth8 <=0) {
            goeilabel8.setLocation(goeilabel8.getX(), -1000);
        }
        if(goeihealth9 <=0) {
            goeilabel9.setLocation(goeilabel9.getX(), -1000);
        }
        //zako animations
        if(zakolabel.getX() >= 888 || zakolabel.getX() < 0) {
            zakovelocity = zakovelocity *-1;
            //zakolabel.setLocation(zakolabel.getX(), zakolabel.getY() + 100);
        }
        if(zakolabel1.getX() >= 888 || zakolabel1.getX() < 0) {
            zakovelocity1 = zakovelocity1 *-1;
            //zakolabel.setLocation(zakolabel.getX(), zakolabel.getY() + 100);
        }
        if(zakolabel2.getX() >= 888 || zakolabel2.getX() <0) {
            zakovelocity2 = zakovelocity2 *-1;
        }
        if(zakolabel3.getX() >= 888 || zakolabel3.getX() <0) {
            zakovelocity3 = zakovelocity3 *-1;
        }
        if(zakolabel4.getX() >= 888 || zakolabel4.getX() <0) {
            zakovelocity4 = zakovelocity4 *-1;
        }
        if(zakolabel5.getX() >= 888 || zakolabel5.getX() <0) {
            zakovelocity5 = zakovelocity5 *-1;
        }
        if(zakolabel6.getX() >= 888 || zakolabel6.getX() <0) {
            zakovelocity6 = zakovelocity6 *-1;
        }
        if(zakolabel7.getX() >= 888 || zakolabel7.getX() <0) {
            zakovelocity7 = zakovelocity7 *-1;
        }
        if(zakolabel8.getX() >= 888 || zakolabel8.getX() <0) {
            zakovelocity8 = zakovelocity8 *-1;
        }
        if(zakolabel9.getX() >= 888 || zakolabel9.getX() <0) {
            zakovelocity9 = zakovelocity9 *-1;
        }

        if(zakohealth <= 0) {
            zakolabel.setLocation(zakolabel.getX(), -1000);
        }
        if(zakohealth1 <= 0) {
            zakolabel1.setLocation(zakolabel1.getX(), -1000);
        }
        if(zakohealth2 <= 0) {
            zakolabel2.setLocation(zakolabel2.getX(), -1000);
        }
        if(zakohealth3 <= 0) {
            zakolabel3.setLocation(zakolabel3.getX(), -1000);
        }
        if(zakohealth4 <= 0) {
            zakolabel4.setLocation(zakolabel4.getX(), -1000);
        }
        if(zakohealth5 <= 0) {
            zakolabel5.setLocation(zakolabel5.getX(), -1000);
        }
        if(zakohealth6 <= 0) {
            zakolabel6.setLocation(zakolabel6.getX(), -1000);
        }
        if(zakohealth7 <= 0) {
            zakolabel7.setLocation(zakolabel7.getX(), -1000);
        }
        if(zakohealth8 <= 0) {
            zakolabel8.setLocation(zakolabel8.getX(), -1000);
        }
        if(zakohealth9 <= 0) {
            zakolabel9.setLocation(zakolabel9.getX(), -1000);
        }

        //galaga animations

        if(galagalabel.getY() <= 0 || galagalabel.getY() > 700) {
            galagavelocityy = galagavelocityy * - 1;
        }
        if(galagalabel.getX() >= 888 || galagalabel.getX() <0) {
            galagavelocityx = galagavelocityx * - 1;
        }

        if(galagahealth <= 0) {
            galagaappearance = false;
        }

        //ship animations
        if(shiplabel.getX() < 0) {
            shiplabel.setLocation(900, shiplabel.getY());
        }
        if(shiplabel.getX() > 900) {
            shiplabel.setLocation(0, shiplabel.getY());
        }

        //bullet animations
        if(!bulletfired) {
            bulletlabel.setLocation(shiplabel.getX()+47,shiplabel.getY()+40);
        }
        if(!bulletfired1) {
            bulletlabel1.setLocation(shiplabel.getX()+47,shiplabel.getY()+40);
        }
        if(!bulletfired2) {
            bulletlabel2.setLocation(shiplabel.getX()+47,shiplabel.getY()+40);
        }
        if(!bulletfired3) {
            bulletlabel3.setLocation(shiplabel.getX()+47,shiplabel.getY()+40);
        }
        if(!bulletfired4) {
            bulletlabel4.setLocation(shiplabel.getX()+47,shiplabel.getY()+40);
        }
        if(!bulletfired5) {
            bulletlabel5.setLocation(shiplabel.getX()+47,shiplabel.getY()+40);
        }
        if(!bulletfired6) {
            bulletlabel6.setLocation(shiplabel.getX()+47,shiplabel.getY()+40);
        }
        if(bulletfired) {
            bulletlabel.setLocation(bulletlabel.getX(),bulletlabel.getY()-bulletvelocity);
            //System.out.println("Bullet firing");
        }
        if(bulletfired1) {
            bulletlabel1.setLocation(bulletlabel1.getX(),bulletlabel1.getY()-bulletvelocity);
            //System.out.println("Bullet 1 firing");
        }
        if(bulletfired2) {
            bulletlabel2.setLocation(bulletlabel2.getX(),bulletlabel2.getY()-bulletvelocity);
            //System.out.println("Bullet 2 firing");
        }
        if(bulletfired3) {
            bulletlabel3.setLocation(bulletlabel3.getX(),bulletlabel3.getY()-bulletvelocity);
            //System.out.println("Bullet 3 firing");
        }
        if(bulletfired4) {
            bulletlabel4.setLocation(bulletlabel4.getX(),bulletlabel4.getY()-bulletvelocity);
            //System.out.println("Bullet 4 firing");
        }
        if(bulletfired5) {
            bulletlabel5.setLocation(bulletlabel5.getX(),bulletlabel5.getY()-bulletvelocity);
            //System.out.println("Bullet 5 firing");
        }
        if(bulletfired6) {
            bulletlabel6.setLocation(bulletlabel6.getX(),bulletlabel6.getY()-bulletvelocity);
            //System.out.println("Bullet 6 firing");
        }

        //Hitbox detection

        //Missed shots
        if(bulletlabel.getY() <=0) {
            bulletfired = false;
            score-=5;
            //System.out.println("MISS");
        }
        if(bulletlabel1.getY() <=0) {
            bulletfired1 = false;
            score-=5;
            //System.out.println("MISS");
        }
        if(bulletlabel2.getY() <=0) {
            bulletfired2 = false;
            score-=5;
            //System.out.println("MISS");
        }
        if(bulletlabel3.getY() <=0) {
            bulletfired3 = false;
            score-=5;
            //System.out.println("MISS");
        }
        if(bulletlabel4.getY() <=0) {
            bulletfired4 = false;
            score-=5;
            //System.out.println("MISS");
        }
        if(bulletlabel5.getY() <=0) {
            bulletfired5 = false;
            score-=5;
            //System.out.println("MISS");
        }
        if(bulletlabel6.getY() <=0) {
            bulletfired6 = false;
            score-=5;
            //System.out.println("MISS");
        }

        //Goei hitboxes
        if((bulletlabel.getY() >= goeilabel.getY() && bulletlabel.getY() <= goeilabel.getY()+84 && bulletlabel.getX() >= goeilabel.getX() && bulletlabel.getX() <= goeilabel.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI");
            score+=20;
            //System.out.println(score);
            goeihealth-=1;
            //System.out.println(goeihealth);
        }
        if((bulletlabel1.getY() >= goeilabel.getY() && bulletlabel1.getY() <= goeilabel.getY()+84 && bulletlabel1.getX() >= goeilabel.getX() && bulletlabel1.getX() <= goeilabel.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI");
            score+=20;
            //System.out.println(score);
            goeihealth-=1;
            //System.out.println(goeihealth);
        }
        if((bulletlabel2.getY() >= goeilabel.getY() && bulletlabel2.getY() <= goeilabel.getY()+84 && bulletlabel2.getX() >= goeilabel.getX() && bulletlabel2.getX() <= goeilabel.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI");
            score+=20;
            //System.out.println(score);
            goeihealth-=1;
            //System.out.println(goeihealth);
        }
        if((bulletlabel3.getY() >= goeilabel.getY() && bulletlabel3.getY() <= goeilabel.getY()+84 && bulletlabel3.getX() >= goeilabel.getX() && bulletlabel3.getX() <= goeilabel.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI");
            score+=20;
            //System.out.println(score);
            goeihealth-=1;
            //System.out.println(goeihealth);
        }
        if((bulletlabel4.getY() >= goeilabel.getY() && bulletlabel4.getY() <= goeilabel.getY()+84 && bulletlabel4.getX() >= goeilabel.getX() && bulletlabel4.getX() <= goeilabel.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI");
            score+=20;
            //System.out.println(score);
            goeihealth-=1;
            //System.out.println(goeihealth);
        }
        if((bulletlabel5.getY() >= goeilabel.getY() && bulletlabel5.getY() <= goeilabel.getY()+84 && bulletlabel5.getX() >= goeilabel.getX() && bulletlabel5.getX() <= goeilabel.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI");
            score+=20;
            //System.out.println(score);
            goeihealth-=1;
            //System.out.println(goeihealth);
        }
        if((bulletlabel6.getY() >= goeilabel.getY() && bulletlabel6.getY() <= goeilabel.getY()+84 && bulletlabel6.getX() >= goeilabel.getX() && bulletlabel6.getX() <= goeilabel.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI");
            score+=20;
            //System.out.println(score);
            goeihealth-=1;
            //System.out.println(goeihealth);
        }

        if((bulletlabel.getY() >= goeilabel1.getY() && bulletlabel.getY() <= goeilabel1.getY()+84 && bulletlabel.getX() >= goeilabel1.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI1");
            score+=20;
            //System.out.println(score);
            goeihealth1-=1;
            //System.out.println(goeihealth1);
        }
        if((bulletlabel1.getY() >= goeilabel1.getY() && bulletlabel1.getY() <= goeilabel1.getY()+84 && bulletlabel1.getX() >= goeilabel1.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI1");
            score+=20;
            //System.out.println(score);
            goeihealth1-=1;
            //System.out.println(goeihealth1);
        }
        if((bulletlabel2.getY() >= goeilabel1.getY() && bulletlabel2.getY() <= goeilabel1.getY()+84 && bulletlabel2.getX() >= goeilabel1.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI1");
            score+=20;
            //System.out.println(score);
            goeihealth1-=1;
            //System.out.println(goeihealth1);
        }
        if((bulletlabel3.getY() >= goeilabel1.getY() && bulletlabel3.getY() <= goeilabel1.getY()+84 && bulletlabel3.getX() >= goeilabel1.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI1");
            score+=20;
            //System.out.println(score);
            goeihealth1-=1;
            //System.out.println(goeihealth1);
        }
        if((bulletlabel4.getY() >= goeilabel1.getY() && bulletlabel4.getY() <= goeilabel1.getY()+84 && bulletlabel4.getX() >= goeilabel1.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI1");
            score+=20;
            //System.out.println(score);
            goeihealth1-=1;
            //System.out.println(goeihealth1);
        }
        if((bulletlabel5.getY() >= goeilabel1.getY() && bulletlabel5.getY() <= goeilabel1.getY()+84 && bulletlabel5.getX() >= goeilabel1.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI1");
            score+=20;
            //System.out.println(score);
            goeihealth1-=1;
            //System.out.println(goeihealth1);
        }
        if((bulletlabel6.getY() >= goeilabel1.getY() && bulletlabel6.getY() <= goeilabel1.getY()+84 && bulletlabel6.getX() >= goeilabel1.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI1");
            score+=20;
            //System.out.println(score);
            goeihealth1-=1;
            //System.out.println(goeihealth1);
        }

        if((bulletlabel.getY() >= goeilabel2.getY() && bulletlabel.getY() <= goeilabel2.getY()+84 && bulletlabel.getX() >= goeilabel2.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI2");
            score+=20;
            //System.out.println(score);
            goeihealth2-=1;
            //System.out.println(goeihealth2);
        }
        if((bulletlabel1.getY() >= goeilabel2.getY() && bulletlabel1.getY() <= goeilabel2.getY()+84 && bulletlabel1.getX() >= goeilabel2.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI2");
            score+=20;
            //System.out.println(score);
            goeihealth2-=1;
            //System.out.println(goeihealth2);
        }
        if((bulletlabel2.getY() >= goeilabel2.getY() && bulletlabel2.getY() <= goeilabel2.getY()+84 && bulletlabel2.getX() >= goeilabel2.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI2");
            score+=20;
            //System.out.println(score);
            goeihealth2-=1;
            //System.out.println(goeihealth2);
        }
        if((bulletlabel3.getY() >= goeilabel2.getY() && bulletlabel3.getY() <= goeilabel2.getY()+84 && bulletlabel3.getX() >= goeilabel2.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI2");
            score+=20;
            //System.out.println(score);
            goeihealth2-=1;
            //System.out.println(goeihealth2);
        }
        if((bulletlabel4.getY() >= goeilabel2.getY() && bulletlabel4.getY() <= goeilabel2.getY()+84 && bulletlabel4.getX() >= goeilabel2.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI2");
            score+=20;
            //System.out.println(score);
            goeihealth2-=1;
            //System.out.println(goeihealth2);
        }
        if((bulletlabel5.getY() >= goeilabel2.getY() && bulletlabel5.getY() <= goeilabel2.getY()+84 && bulletlabel5.getX() >= goeilabel2.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI2");
            score+=20;
            //System.out.println(score);
            goeihealth2-=1;
            //System.out.println(goeihealth2);
        }
        if((bulletlabel6.getY() >= goeilabel2.getY() && bulletlabel6.getY() <= goeilabel2.getY()+84 && bulletlabel6.getX() >= goeilabel2.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI2");
            score+=20;
            //System.out.println(score);
            goeihealth2-=1;
            //System.out.println(goeihealth2);
        }

        if((bulletlabel.getY() >= goeilabel3.getY() && bulletlabel.getY() <= goeilabel3.getY()+84 && bulletlabel.getX() >= goeilabel3.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI3");
            score+=20;
            //System.out.println(score);
            goeihealth3-=1;
            //System.out.println(goeihealth3);
        }
        if((bulletlabel1.getY() >= goeilabel3.getY() && bulletlabel1.getY() <= goeilabel3.getY()+84 && bulletlabel1.getX() >= goeilabel3.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI3");
            score+=20;
            //System.out.println(score);
            goeihealth3-=1;
            //System.out.println(goeihealth3);
        }
        if((bulletlabel2.getY() >= goeilabel3.getY() && bulletlabel2.getY() <= goeilabel3.getY()+84 && bulletlabel2.getX() >= goeilabel3.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI3");
            score+=20;
            //System.out.println(score);
            goeihealth3-=1;
            //System.out.println(goeihealth3);
        }
        if((bulletlabel3.getY() >= goeilabel3.getY() && bulletlabel3.getY() <= goeilabel3.getY()+84 && bulletlabel3.getX() >= goeilabel3.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI3");
            score+=20;
            //System.out.println(score);
            goeihealth3-=1;
            //System.out.println(goeihealth3);
        }
        if((bulletlabel4.getY() >= goeilabel3.getY() && bulletlabel4.getY() <= goeilabel3.getY()+84 && bulletlabel4.getX() >= goeilabel3.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI3");
            score+=20;
            //System.out.println(score);
            goeihealth3-=1;
            //System.out.println(goeihealth3);
        }
        if((bulletlabel5.getY() >= goeilabel3.getY() && bulletlabel5.getY() <= goeilabel3.getY()+84 && bulletlabel5.getX() >= goeilabel3.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI3");
            score+=20;
            //System.out.println(score);
            goeihealth3-=1;
            //System.out.println(goeihealth3);
        }
        if((bulletlabel6.getY() >= goeilabel3.getY() && bulletlabel6.getY() <= goeilabel3.getY()+84 && bulletlabel6.getX() >= goeilabel3.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI3");
            score+=20;
            //System.out.println(score);
            goeihealth3-=1;
            //System.out.println(goeihealth3);
        }

        if((bulletlabel.getY() >= goeilabel4.getY() && bulletlabel.getY() <= goeilabel4.getY()+84 && bulletlabel.getX() >= goeilabel4.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI4");
            score+=20;
            //System.out.println(score);
            goeihealth4-=1;
            //System.out.println(goeihealth4);
        }
        if((bulletlabel1.getY() >= goeilabel4.getY() && bulletlabel1.getY() <= goeilabel4.getY()+84 && bulletlabel1.getX() >= goeilabel4.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI4");
            score+=20;
            //System.out.println(score);
            goeihealth4-=1;
            //System.out.println(goeihealth4);
        }
        if((bulletlabel2.getY() >= goeilabel4.getY() && bulletlabel2.getY() <= goeilabel4.getY()+84 && bulletlabel2.getX() >= goeilabel4.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI4");
            score+=20;
            //System.out.println(score);
            goeihealth4-=1;
            //System.out.println(goeihealth4);
        }
        if((bulletlabel3.getY() >= goeilabel4.getY() && bulletlabel3.getY() <= goeilabel4.getY()+84 && bulletlabel3.getX() >= goeilabel4.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI4");
            score+=20;
            //System.out.println(score);
            goeihealth4-=1;
            //System.out.println(goeihealth4);
        }
        if((bulletlabel4.getY() >= goeilabel4.getY() && bulletlabel4.getY() <= goeilabel4.getY()+84 && bulletlabel4.getX() >= goeilabel4.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI4");
            score+=20;
            //System.out.println(score);
            goeihealth4-=1;
            //System.out.println(goeihealth4);
        }
        if((bulletlabel5.getY() >= goeilabel4.getY() && bulletlabel5.getY() <= goeilabel4.getY()+84 && bulletlabel5.getX() >= goeilabel4.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI4");
            score+=20;
            //System.out.println(score);
            goeihealth4-=1;
            //System.out.println(goeihealth4);
        }
        if((bulletlabel6.getY() >= goeilabel4.getY() && bulletlabel6.getY() <= goeilabel4.getY()+84 && bulletlabel6.getX() >= goeilabel4.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI4");
            score+=20;
            //System.out.println(score);
            goeihealth4-=1;
            //System.out.println(goeihealth4);
        }

        if((bulletlabel.getY() >= goeilabel5.getY() && bulletlabel.getY() <= goeilabel5.getY()+84 && bulletlabel.getX() >= goeilabel5.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI5");
            score+=20;
            //System.out.println(score);
            goeihealth5-=1;
            //System.out.println(goeihealth5);
        }
        if((bulletlabel1.getY() >= goeilabel5.getY() && bulletlabel1.getY() <= goeilabel5.getY()+84 && bulletlabel1.getX() >= goeilabel5.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI5");
            score+=20;
            //System.out.println(score);
            goeihealth5-=1;
            //System.out.println(goeihealth5);
        }
        if((bulletlabel2.getY() >= goeilabel5.getY() && bulletlabel2.getY() <= goeilabel5.getY()+84 && bulletlabel2.getX() >= goeilabel5.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI5");
            score+=20;
            //System.out.println(score);
            goeihealth5-=1;
            //System.out.println(goeihealth5);
        }
        if((bulletlabel3.getY() >= goeilabel5.getY() && bulletlabel3.getY() <= goeilabel5.getY()+84 && bulletlabel3.getX() >= goeilabel5.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI5");
            score+=20;
            //System.out.println(score);
            goeihealth5-=1;
            //System.out.println(goeihealth5);
        }
        if((bulletlabel4.getY() >= goeilabel5.getY() && bulletlabel4.getY() <= goeilabel5.getY()+84 && bulletlabel4.getX() >= goeilabel5.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI5");
            score+=20;
            //System.out.println(score);
            goeihealth5-=1;
            //System.out.println(goeihealth5);
        }
        if((bulletlabel5.getY() >= goeilabel5.getY() && bulletlabel5.getY() <= goeilabel5.getY()+84 && bulletlabel5.getX() >= goeilabel5.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI5");
            score+=20;
            //System.out.println(score);
            goeihealth5-=1;
            //System.out.println(goeihealth5);
        }
        if((bulletlabel6.getY() >= goeilabel5.getY() && bulletlabel6.getY() <= goeilabel5.getY()+84 && bulletlabel6.getX() >= goeilabel5.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI5");
            score+=20;
            //System.out.println(score);
            goeihealth5-=1;
            //System.out.println(goeihealth5);
        }

        if((bulletlabel.getY() >= goeilabel6.getY() && bulletlabel.getY() <= goeilabel6.getY()+84 && bulletlabel.getX() >= goeilabel6.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI6");
            score+=20;
            //System.out.println(score);
            goeihealth6-=1;
            //System.out.println(goeihealth6);
        }
        if((bulletlabel1.getY() >= goeilabel6.getY() && bulletlabel1.getY() <= goeilabel6.getY()+84 && bulletlabel1.getX() >= goeilabel6.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI6");
            score+=20;
            //System.out.println(score);
            goeihealth6-=1;
            //System.out.println(goeihealth6);
        }
        if((bulletlabel2.getY() >= goeilabel6.getY() && bulletlabel2.getY() <= goeilabel6.getY()+84 && bulletlabel2.getX() >= goeilabel6.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI6");
            score+=20;
            //System.out.println(score);
            goeihealth6-=1;
            //System.out.println(goeihealth6);
        }
        if((bulletlabel3.getY() >= goeilabel6.getY() && bulletlabel3.getY() <= goeilabel6.getY()+84 && bulletlabel3.getX() >= goeilabel6.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI6");
            score+=20;
            //System.out.println(score);
            goeihealth6-=1;
            //System.out.println(goeihealth6);
        }
        if((bulletlabel4.getY() >= goeilabel6.getY() && bulletlabel4.getY() <= goeilabel6.getY()+84 && bulletlabel4.getX() >= goeilabel6.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI6");
            score+=20;
            //System.out.println(score);
            goeihealth6-=1;
            //System.out.println(goeihealth6);
        }
        if((bulletlabel5.getY() >= goeilabel6.getY() && bulletlabel5.getY() <= goeilabel6.getY()+84 && bulletlabel5.getX() >= goeilabel6.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI6");
            score+=20;
            //System.out.println(score);
            goeihealth6-=1;
            //System.out.println(goeihealth6);
        }
        if((bulletlabel6.getY() >= goeilabel6.getY() && bulletlabel6.getY() <= goeilabel6.getY()+84 && bulletlabel6.getX() >= goeilabel6.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI6");
            score+=20;
            //System.out.println(score);
            goeihealth6-=1;
            //System.out.println(goeihealth6);
        }

        if((bulletlabel.getY() >= goeilabel7.getY() && bulletlabel.getY() <= goeilabel7.getY()+84 && bulletlabel.getX() >= goeilabel7.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI7");
            score+=20;
            //System.out.println(score);
            goeihealth7-=1;
            //System.out.println(goeihealth7);
        }
        if((bulletlabel1.getY() >= goeilabel7.getY() && bulletlabel1.getY() <= goeilabel7.getY()+84 && bulletlabel1.getX() >= goeilabel7.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI7");
            score+=20;
            //System.out.println(score);
            goeihealth7-=1;
            //System.out.println(goeihealth7);
        }
        if((bulletlabel2.getY() >= goeilabel7.getY() && bulletlabel2.getY() <= goeilabel7.getY()+84 && bulletlabel2.getX() >= goeilabel7.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI7");
            score+=20;
            //System.out.println(score);
            goeihealth7-=1;
            //System.out.println(goeihealth7);
        }
        if((bulletlabel3.getY() >= goeilabel7.getY() && bulletlabel3.getY() <= goeilabel7.getY()+84 && bulletlabel3.getX() >= goeilabel7.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI7");
            score+=20;
            //System.out.println(score);
            goeihealth7-=1;
            //System.out.println(goeihealth7);
        }
        if((bulletlabel4.getY() >= goeilabel7.getY() && bulletlabel4.getY() <= goeilabel7.getY()+84 && bulletlabel4.getX() >= goeilabel7.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI7");
            score+=20;
            //System.out.println(score);
            goeihealth7-=1;
            //System.out.println(goeihealth7);
        }
        if((bulletlabel5.getY() >= goeilabel7.getY() && bulletlabel5.getY() <= goeilabel7.getY()+84 && bulletlabel5.getX() >= goeilabel7.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI7");
            score+=20;
            //System.out.println(score);
            goeihealth7-=1;
            //System.out.println(goeihealth7);
        }
        if((bulletlabel6.getY() >= goeilabel7.getY() && bulletlabel6.getY() <= goeilabel7.getY()+84 && bulletlabel6.getX() >= goeilabel7.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI7");
            score+=20;
            //System.out.println(score);
            goeihealth7-=1;
            //System.out.println(goeihealth7);
        }

        if((bulletlabel.getY() >= goeilabel8.getY() && bulletlabel.getY() <= goeilabel8.getY()+84 && bulletlabel.getX() >= goeilabel8.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI8");
            score+=20;
            //System.out.println(score);
            goeihealth8-=1;
            //System.out.println(goeihealth8);
        }
        if((bulletlabel1.getY() >= goeilabel8.getY() && bulletlabel1.getY() <= goeilabel8.getY()+84 && bulletlabel1.getX() >= goeilabel8.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI8");
            score+=20;
            //System.out.println(score);
            goeihealth8-=1;
            //System.out.println(goeihealth8);
        }
        if((bulletlabel2.getY() >= goeilabel8.getY() && bulletlabel2.getY() <= goeilabel8.getY()+84 && bulletlabel2.getX() >= goeilabel8.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI8");
            score+=20;
            //System.out.println(score);
            goeihealth8-=1;
            //System.out.println(goeihealth8);
        }
        if((bulletlabel3.getY() >= goeilabel8.getY() && bulletlabel3.getY() <= goeilabel8.getY()+84 && bulletlabel3.getX() >= goeilabel8.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI8");
            score+=20;
            //System.out.println(score);
            goeihealth8-=1;
            //System.out.println(goeihealth8);
        }
        if((bulletlabel4.getY() >= goeilabel8.getY() && bulletlabel4.getY() <= goeilabel8.getY()+84 && bulletlabel4.getX() >= goeilabel8.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI8");
            score+=20;
            //System.out.println(score);
            goeihealth8-=1;
            //System.out.println(goeihealth8);
        }
        if((bulletlabel5.getY() >= goeilabel8.getY() && bulletlabel5.getY() <= goeilabel8.getY()+84 && bulletlabel5.getX() >= goeilabel8.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI8");
            score+=20;
            //System.out.println(score);
            goeihealth8-=1;
            //System.out.println(goeihealth8);
        }
        if((bulletlabel6.getY() >= goeilabel8.getY() && bulletlabel6.getY() <= goeilabel8.getY()+84 && bulletlabel6.getX() >= goeilabel8.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI8");
            score+=20;
            //System.out.println(score);
            goeihealth8-=1;
            //System.out.println(goeihealth8);
        }

        if((bulletlabel.getY() >= goeilabel9.getY() && bulletlabel.getY() <= goeilabel9.getY()+84 && bulletlabel.getX() >= goeilabel9.getX() && bulletlabel.getX() <= goeilabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT GOEI9");
            score+=20;
            //System.out.println(score);
            goeihealth9-=1;
            //System.out.println(goeihealth9);
        }
        if((bulletlabel1.getY() >= goeilabel9.getY() && bulletlabel1.getY() <= goeilabel9.getY()+84 && bulletlabel1.getX() >= goeilabel9.getX() && bulletlabel1.getX() <= goeilabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT GOEI9");
            score+=20;
            //System.out.println(score);
            goeihealth9-=1;
            //System.out.println(goeihealth9);
        }
        if((bulletlabel2.getY() >= goeilabel9.getY() && bulletlabel2.getY() <= goeilabel9.getY()+84 && bulletlabel2.getX() >= goeilabel9.getX() && bulletlabel2.getX() <= goeilabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT GOEI9");
            score+=20;
            //System.out.println(score);
            goeihealth9-=1;
            //System.out.println(goeihealth9);
        }
        if((bulletlabel3.getY() >= goeilabel9.getY() && bulletlabel3.getY() <= goeilabel9.getY()+84 && bulletlabel3.getX() >= goeilabel9.getX() && bulletlabel3.getX() <= goeilabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT GOEI9");
            score+=20;
            //System.out.println(score);
            goeihealth9-=1;
            //System.out.println(goeihealth9);
        }
        if((bulletlabel4.getY() >= goeilabel9.getY() && bulletlabel4.getY() <= goeilabel9.getY()+84 && bulletlabel4.getX() >= goeilabel9.getX() && bulletlabel4.getX() <= goeilabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT GOEI9");
            score+=20;
            //System.out.println(score);
            goeihealth9-=1;
            //System.out.println(goeihealth9);
        }
        if((bulletlabel5.getY() >= goeilabel9.getY() && bulletlabel5.getY() <= goeilabel9.getY()+84 && bulletlabel5.getX() >= goeilabel9.getX() && bulletlabel5.getX() <= goeilabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT GOEI9");
            score+=20;
            //System.out.println(score);
            goeihealth9-=1;
            //System.out.println(goeihealth9);
        }
        if((bulletlabel6.getY() >= goeilabel9.getY() && bulletlabel6.getY() <= goeilabel9.getY()+84 && bulletlabel6.getX() >= goeilabel9.getX() && bulletlabel6.getX() <= goeilabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT GOEI9");
            score+=20;
            //System.out.println(score);
            goeihealth9-=1;
            //System.out.println(goeihealth9);
        }


        //Zako hitboxes
        if((bulletlabel.getY() <= zakolabel.getY()+84 && bulletlabel.getX() >= zakolabel.getX() && bulletlabel.getX() <= zakolabel.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO");
            score+=10;
            //System.out.println(score);
            zakohealth-=1;
            //System.out.println(zakohealth);
        }
        if((bulletlabel1.getY() <= zakolabel.getY()+84 && bulletlabel1.getX() >= zakolabel.getX() && bulletlabel1.getX() <= zakolabel.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO");
            score+=10;
            //System.out.println(score);
            zakohealth-=1;
            //System.out.println(zakohealth);
        }
        if((bulletlabel2.getY() <= zakolabel.getY()+84 && bulletlabel2.getX() >= zakolabel.getX() && bulletlabel2.getX() <= zakolabel.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO");
            score+=10;
            //System.out.println(score);
            zakohealth-=1;
            //System.out.println(zakohealth);
        }
        if((bulletlabel3.getY() <= zakolabel.getY()+84 && bulletlabel3.getX() >= zakolabel.getX() && bulletlabel3.getX() <= zakolabel.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO");
            score+=10;
            //System.out.println(score);
            zakohealth-=1;
            //System.out.println(zakohealth);
        }
        if((bulletlabel4.getY() <= zakolabel.getY()+84 && bulletlabel4.getX() >= zakolabel.getX() && bulletlabel4.getX() <= zakolabel.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO");
            score+=10;
            //System.out.println(score);
            zakohealth-=1;
            //System.out.println(zakohealth);
        }
        if((bulletlabel5.getY() <= zakolabel.getY()+84 && bulletlabel5.getX() >= zakolabel.getX() && bulletlabel5.getX() <= zakolabel.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO");
            score+=10;
            //System.out.println(score);
            zakohealth-=1;
            //System.out.println(zakohealth);
        }
        if((bulletlabel6.getY() <= zakolabel.getY()+84 && bulletlabel6.getX() >= zakolabel.getX() && bulletlabel6.getX() <= zakolabel.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO");
            score+=10;
            //System.out.println(score);
            zakohealth-=1;
            //System.out.println(zakohealth);
        }

        if((bulletlabel.getY() <= zakolabel1.getY()+84 && bulletlabel.getX() >= zakolabel1.getX() && bulletlabel.getX() <= zakolabel1.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO1");
            score+=10;
            //System.out.println(score);
            zakohealth1-=1;
            //System.out.println(zakohealth1);
        }
        if((bulletlabel1.getY() <= zakolabel1.getY()+84 && bulletlabel1.getX() >= zakolabel1.getX() && bulletlabel1.getX() <= zakolabel1.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO1");
            score+=10;
            //System.out.println(score);
            zakohealth1-=1;
            //System.out.println(zakohealth1);
        }
        if((bulletlabel2.getY() <= zakolabel1.getY()+84 && bulletlabel2.getX() >= zakolabel1.getX() && bulletlabel2.getX() <= zakolabel1.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO1");
            score+=10;
            //System.out.println(score);
            zakohealth1-=1;
            //System.out.println(zakohealth1);
        }
        if((bulletlabel3.getY() <= zakolabel1.getY()+84 && bulletlabel3.getX() >= zakolabel1.getX() && bulletlabel3.getX() <= zakolabel1.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO1");
            score+=10;
            //System.out.println(score);
            zakohealth1-=1;
            //System.out.println(zakohealth1);
        }
        if((bulletlabel4.getY() <= zakolabel1.getY()+84 && bulletlabel4.getX() >= zakolabel1.getX() && bulletlabel4.getX() <= zakolabel1.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO1");
            score+=10;
            //System.out.println(score);
            zakohealth1-=1;
            //System.out.println(zakohealth1);
        }
        if((bulletlabel5.getY() <= zakolabel1.getY()+84 && bulletlabel5.getX() >= zakolabel1.getX() && bulletlabel5.getX() <= zakolabel1.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO1");
            score+=10;
            //System.out.println(score);
            zakohealth1-=1;
            //System.out.println(zakohealth1);
        }
        if((bulletlabel6.getY() <= zakolabel1.getY()+84 && bulletlabel6.getX() >= zakolabel1.getX() && bulletlabel6.getX() <= zakolabel1.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO1");
            score+=10;
            //System.out.println(score);
            zakohealth1-=1;
            //System.out.println(zakohealth1);
        }

        if((bulletlabel.getY() <= zakolabel2.getY()+84 && bulletlabel.getX() >= zakolabel2.getX() && bulletlabel.getX() <= zakolabel2.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO2");
            score+=10;
            //System.out.println(score);
            zakohealth2-=1;
            //System.out.println(zakohealth2);
        }
        if((bulletlabel1.getY() <= zakolabel2.getY()+84 && bulletlabel1.getX() >= zakolabel2.getX() && bulletlabel1.getX() <= zakolabel2.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO2");
            score+=10;
            //System.out.println(score);
            zakohealth2-=1;
            //System.out.println(zakohealth2);
        }
        if((bulletlabel2.getY() <= zakolabel2.getY()+84 && bulletlabel2.getX() >= zakolabel2.getX() && bulletlabel2.getX() <= zakolabel2.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO2");
            score+=10;
            //System.out.println(score);
            zakohealth2-=1;
            //System.out.println(zakohealth2);
        }
        if((bulletlabel3.getY() <= zakolabel2.getY()+84 && bulletlabel3.getX() >= zakolabel2.getX() && bulletlabel3.getX() <= zakolabel2.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO2");
            score+=10;
            //System.out.println(score);
            zakohealth2-=1;
            //System.out.println(zakohealth2);
        }
        if((bulletlabel4.getY() <= zakolabel2.getY()+84 && bulletlabel4.getX() >= zakolabel2.getX() && bulletlabel4.getX() <= zakolabel2.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO2");
            score+=10;
            //System.out.println(score);
            zakohealth2-=1;
            //System.out.println(zakohealth2);
        }
        if((bulletlabel5.getY() <= zakolabel2.getY()+84 && bulletlabel5.getX() >= zakolabel2.getX() && bulletlabel5.getX() <= zakolabel2.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO2");
            score+=10;
            //System.out.println(score);
            zakohealth2-=1;
            //System.out.println(zakohealth2);
        }
        if((bulletlabel6.getY() <= zakolabel2.getY()+84 && bulletlabel6.getX() >= zakolabel2.getX() && bulletlabel6.getX() <= zakolabel2.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO2");
            score+=10;
            //System.out.println(score);
            zakohealth2-=1;
            //System.out.println(zakohealth2);
        }

        if((bulletlabel.getY() <= zakolabel3.getY()+84 && bulletlabel.getX() >= zakolabel3.getX() && bulletlabel.getX() <= zakolabel3.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO3");
            score+=10;
            //System.out.println(score);
            zakohealth3-=1;
            //System.out.println(zakohealth3);
        }
        if((bulletlabel1.getY() <= zakolabel3.getY()+84 && bulletlabel1.getX() >= zakolabel3.getX() && bulletlabel1.getX() <= zakolabel3.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO3");
            score+=10;
            //System.out.println(score);
            zakohealth3-=1;
            //System.out.println(zakohealth3);
        }
        if((bulletlabel2.getY() <= zakolabel3.getY()+84 && bulletlabel2.getX() >= zakolabel3.getX() && bulletlabel2.getX() <= zakolabel3.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO3");
            score+=10;
            //System.out.println(score);
            zakohealth3-=1;
            //System.out.println(zakohealth3);
        }
        if((bulletlabel3.getY() <= zakolabel3.getY()+84 && bulletlabel3.getX() >= zakolabel3.getX() && bulletlabel3.getX() <= zakolabel3.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO3");
            score+=10;
            //System.out.println(score);
            zakohealth3-=1;
            //System.out.println(zakohealth3);
        }
        if((bulletlabel4.getY() <= zakolabel3.getY()+84 && bulletlabel4.getX() >= zakolabel3.getX() && bulletlabel4.getX() <= zakolabel3.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO3");
            score+=10;
            //System.out.println(score);
            zakohealth3-=1;
            //System.out.println(zakohealth3);
        }
        if((bulletlabel5.getY() <= zakolabel3.getY()+84 && bulletlabel5.getX() >= zakolabel3.getX() && bulletlabel5.getX() <= zakolabel3.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO3");
            score+=10;
            //System.out.println(score);
            zakohealth3-=1;
            //System.out.println(zakohealth3);
        }
        if((bulletlabel6.getY() <= zakolabel3.getY()+84 && bulletlabel6.getX() >= zakolabel3.getX() && bulletlabel6.getX() <= zakolabel3.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO3");
            score+=10;
            //System.out.println(score);
            zakohealth3-=1;
            //System.out.println(zakohealth3);
        }

        if((bulletlabel.getY() <= zakolabel4.getY()+84 && bulletlabel.getX() >= zakolabel4.getX() && bulletlabel.getX() <= zakolabel4.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO4");
            score+=10;
            //System.out.println(score);
            zakohealth4-=1;
            //System.out.println(zakohealth4);
        }
        if((bulletlabel1.getY() <= zakolabel4.getY()+84 && bulletlabel1.getX() >= zakolabel4.getX() && bulletlabel1.getX() <= zakolabel4.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO4");
            score+=10;
            //System.out.println(score);
            zakohealth4-=1;
            //System.out.println(zakohealth4);
        }
        if((bulletlabel2.getY() <= zakolabel4.getY()+84 && bulletlabel2.getX() >= zakolabel4.getX() && bulletlabel2.getX() <= zakolabel4.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO4");
            score+=10;
            //System.out.println(score);
            zakohealth4-=1;
            //System.out.println(zakohealth4);
        }
        if((bulletlabel3.getY() <= zakolabel4.getY()+84 && bulletlabel3.getX() >= zakolabel4.getX() && bulletlabel3.getX() <= zakolabel4.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO4");
            score+=10;
            //System.out.println(score);
            zakohealth4-=1;
            //System.out.println(zakohealth4);
        }
        if((bulletlabel4.getY() <= zakolabel4.getY()+84 && bulletlabel4.getX() >= zakolabel4.getX() && bulletlabel4.getX() <= zakolabel4.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO4");
            score+=10;
            //System.out.println(score);
            zakohealth4-=1;
            //System.out.println(zakohealth4);
        }
        if((bulletlabel5.getY() <= zakolabel4.getY()+84 && bulletlabel5.getX() >= zakolabel4.getX() && bulletlabel5.getX() <= zakolabel4.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO4");
            score+=10;
            //System.out.println(score);
            zakohealth4-=1;
            //System.out.println(zakohealth4);
        }
        if((bulletlabel6.getY() <= zakolabel4.getY()+84 && bulletlabel6.getX() >= zakolabel4.getX() && bulletlabel6.getX() <= zakolabel4.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO4");
            score+=10;
            //System.out.println(score);
            zakohealth4-=1;
            //System.out.println(zakohealth4);
        }

        if((bulletlabel.getY() <= zakolabel5.getY()+84 && bulletlabel.getX() >= zakolabel5.getX() && bulletlabel.getX() <= zakolabel5.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO5");
            score+=10;
            //System.out.println(score);
            zakohealth5-=1;
            //System.out.println(zakohealth5);
        }
        if((bulletlabel1.getY() <= zakolabel5.getY()+84 && bulletlabel1.getX() >= zakolabel5.getX() && bulletlabel1.getX() <= zakolabel5.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO5");
            score+=10;
            //System.out.println(score);
            zakohealth5-=1;
            //System.out.println(zakohealth5);
        }
        if((bulletlabel2.getY() <= zakolabel5.getY()+84 && bulletlabel2.getX() >= zakolabel5.getX() && bulletlabel2.getX() <= zakolabel5.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO5");
            score+=10;
            //System.out.println(score);
            zakohealth5-=1;
            //System.out.println(zakohealth5);
        }
        if((bulletlabel3.getY() <= zakolabel5.getY()+84 && bulletlabel3.getX() >= zakolabel5.getX() && bulletlabel3.getX() <= zakolabel5.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO5");
            score+=10;
            //System.out.println(score);
            zakohealth5-=1;
            //System.out.println(zakohealth5);
        }
        if((bulletlabel4.getY() <= zakolabel5.getY()+84 && bulletlabel4.getX() >= zakolabel5.getX() && bulletlabel4.getX() <= zakolabel5.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO5");
            score+=10;
            //System.out.println(score);
            zakohealth5-=1;
            //System.out.println(zakohealth5);
        }
        if((bulletlabel5.getY() <= zakolabel5.getY()+84 && bulletlabel5.getX() >= zakolabel5.getX() && bulletlabel5.getX() <= zakolabel5.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO5");
            score+=10;
            //System.out.println(score);
            zakohealth5-=1;
            //System.out.println(zakohealth5);
        }
        if((bulletlabel6.getY() <= zakolabel5.getY()+84 && bulletlabel6.getX() >= zakolabel5.getX() && bulletlabel6.getX() <= zakolabel5.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO5");
            score+=10;
            //System.out.println(score);
            zakohealth5-=1;
            //System.out.println(zakohealth5);
        }

        if((bulletlabel.getY() <= zakolabel6.getY()+84 && bulletlabel.getX() >= zakolabel6.getX() && bulletlabel.getX() <= zakolabel6.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO6");
            score+=10;
            //System.out.println(score);
            zakohealth6-=1;
            //System.out.println(zakohealth6);
        }
        if((bulletlabel1.getY() <= zakolabel6.getY()+84 && bulletlabel1.getX() >= zakolabel6.getX() && bulletlabel1.getX() <= zakolabel6.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO6");
            score+=10;
            //System.out.println(score);
            zakohealth6-=1;
            //System.out.println(zakohealth6);
        }
        if((bulletlabel2.getY() <= zakolabel6.getY()+84 && bulletlabel2.getX() >= zakolabel6.getX() && bulletlabel2.getX() <= zakolabel6.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO6");
            score+=10;
            //System.out.println(score);
            zakohealth6-=1;
            //System.out.println(zakohealth6);
        }
        if((bulletlabel3.getY() <= zakolabel6.getY()+84 && bulletlabel3.getX() >= zakolabel6.getX() && bulletlabel3.getX() <= zakolabel6.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO6");
            score+=10;
            //System.out.println(score);
            zakohealth6-=1;
            //System.out.println(zakohealth6);
        }
        if((bulletlabel4.getY() <= zakolabel6.getY()+84 && bulletlabel4.getX() >= zakolabel6.getX() && bulletlabel4.getX() <= zakolabel6.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO6");
            score+=10;
            //System.out.println(score);
            zakohealth6-=1;
            //System.out.println(zakohealth6);
        }
        if((bulletlabel5.getY() <= zakolabel6.getY()+84 && bulletlabel5.getX() >= zakolabel6.getX() && bulletlabel5.getX() <= zakolabel6.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO6");
            score+=10;
            //System.out.println(score);
            zakohealth6-=1;
            //System.out.println(zakohealth6);
        }
        if((bulletlabel6.getY() <= zakolabel6.getY()+84 && bulletlabel6.getX() >= zakolabel6.getX() && bulletlabel6.getX() <= zakolabel6.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO6");
            score+=10;
            //System.out.println(score);
            zakohealth6-=1;
            //System.out.println(zakohealth6);
        }

        if((bulletlabel.getY() <= zakolabel7.getY()+84 && bulletlabel.getX() >= zakolabel7.getX() && bulletlabel.getX() <= zakolabel7.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO7");
            score+=10;
            //System.out.println(score);
            zakohealth7-=1;
            //System.out.println(zakohealth7);
        }
        if((bulletlabel1.getY() <= zakolabel7.getY()+84 && bulletlabel1.getX() >= zakolabel7.getX() && bulletlabel1.getX() <= zakolabel7.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO7");
            score+=10;
            //System.out.println(score);
            zakohealth7-=1;
            //System.out.println(zakohealth7);
        }
        if((bulletlabel2.getY() <= zakolabel7.getY()+84 && bulletlabel2.getX() >= zakolabel7.getX() && bulletlabel2.getX() <= zakolabel7.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO7");
            score+=10;
            //System.out.println(score);
            zakohealth7-=1;
            //System.out.println(zakohealth7);
        }
        if((bulletlabel3.getY() <= zakolabel7.getY()+84 && bulletlabel3.getX() >= zakolabel7.getX() && bulletlabel3.getX() <= zakolabel7.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO7");
            score+=10;
            //System.out.println(score);
            zakohealth7-=1;
            //System.out.println(zakohealth7);
        }
        if((bulletlabel4.getY() <= zakolabel7.getY()+84 && bulletlabel4.getX() >= zakolabel7.getX() && bulletlabel4.getX() <= zakolabel7.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO7");
            score+=10;
            //System.out.println(score);
            zakohealth7-=1;
            //System.out.println(zakohealth7);
        }
        if((bulletlabel5.getY() <= zakolabel7.getY()+84 && bulletlabel5.getX() >= zakolabel7.getX() && bulletlabel5.getX() <= zakolabel7.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO7");
            score+=10;
            //System.out.println(score);
            zakohealth7-=1;
            //System.out.println(zakohealth7);
        }
        if((bulletlabel6.getY() <= zakolabel7.getY()+84 && bulletlabel6.getX() >= zakolabel7.getX() && bulletlabel6.getX() <= zakolabel7.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO7");
            score+=10;
            //System.out.println(score);
            zakohealth7-=1;
            //System.out.println(zakohealth7);
        }

        if((bulletlabel.getY() <= zakolabel8.getY()+84 && bulletlabel.getX() >= zakolabel8.getX() && bulletlabel.getX() <= zakolabel8.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO8");
            score+=10;
            //System.out.println(score);
            zakohealth8-=1;
            //System.out.println(zakohealth8);
        }
        if((bulletlabel1.getY() <= zakolabel8.getY()+84 && bulletlabel1.getX() >= zakolabel8.getX() && bulletlabel1.getX() <= zakolabel8.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO8");
            score+=10;
            //System.out.println(score);
            zakohealth8-=1;
            //System.out.println(zakohealth8);
        }
        if((bulletlabel2.getY() <= zakolabel8.getY()+84 && bulletlabel2.getX() >= zakolabel8.getX() && bulletlabel2.getX() <= zakolabel8.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO8");
            score+=10;
            //System.out.println(score);
            zakohealth8-=1;
            //System.out.println(zakohealth8);
        }
        if((bulletlabel3.getY() <= zakolabel8.getY()+84 && bulletlabel3.getX() >= zakolabel8.getX() && bulletlabel3.getX() <= zakolabel8.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO8");
            score+=10;
            //System.out.println(score);
            zakohealth8-=1;
            //System.out.println(zakohealth8);
        }
        if((bulletlabel4.getY() <= zakolabel8.getY()+84 && bulletlabel4.getX() >= zakolabel8.getX() && bulletlabel4.getX() <= zakolabel8.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO8");
            score+=10;
            //System.out.println(score);
            zakohealth8-=1;
            //System.out.println(zakohealth8);
        }
        if((bulletlabel5.getY() <= zakolabel8.getY()+84 && bulletlabel5.getX() >= zakolabel8.getX() && bulletlabel5.getX() <= zakolabel8.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO8");
            score+=10;
            //System.out.println(score);
            zakohealth8-=1;
            //System.out.println(zakohealth8);
        }
        if((bulletlabel6.getY() <= zakolabel8.getY()+84 && bulletlabel6.getX() >= zakolabel8.getX() && bulletlabel6.getX() <= zakolabel8.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO8");
            score+=10;
            //System.out.println(score);
            zakohealth8-=1;
            //System.out.println(zakohealth8);
        }

        if((bulletlabel.getY() <= zakolabel9.getY()+84 && bulletlabel.getX() >= zakolabel9.getX() && bulletlabel.getX() <= zakolabel9.getX() + 112)) {
            bulletfired = false;
            //System.out.println("HIT ZAKO9");
            score+=10;
            //System.out.println(score);
            zakohealth9-=1;
            //System.out.println(zakohealth9);
        }
        if((bulletlabel1.getY() <= zakolabel9.getY()+84 && bulletlabel1.getX() >= zakolabel9.getX() && bulletlabel1.getX() <= zakolabel9.getX() + 112)) {
            bulletfired1 = false;
            //System.out.println("HIT ZAKO9");
            score+=10;
            //System.out.println(score);
            zakohealth9-=1;
            //System.out.println(zakohealth9);
        }
        if((bulletlabel2.getY() <= zakolabel9.getY()+84 && bulletlabel2.getX() >= zakolabel9.getX() && bulletlabel2.getX() <= zakolabel9.getX() + 112)) {
            bulletfired2 = false;
            //System.out.println("HIT ZAKO9");
            score+=10;
            //System.out.println(score);
            zakohealth9-=1;
            //System.out.println(zakohealth9);
        }
        if((bulletlabel3.getY() <= zakolabel9.getY()+84 && bulletlabel3.getX() >= zakolabel9.getX() && bulletlabel3.getX() <= zakolabel9.getX() + 112)) {
            bulletfired3 = false;
            //System.out.println("HIT ZAKO9");
            score+=10;
            //System.out.println(score);
            zakohealth9-=1;
            //System.out.println(zakohealth9);
        }
        if((bulletlabel4.getY() <= zakolabel9.getY()+84 && bulletlabel4.getX() >= zakolabel9.getX() && bulletlabel4.getX() <= zakolabel9.getX() + 112)) {
            bulletfired4 = false;
            //System.out.println("HIT ZAKO9");
            score+=10;
            //System.out.println(score);
            zakohealth9-=1;
            //System.out.println(zakohealth9);
        }
        if((bulletlabel5.getY() <= zakolabel9.getY()+84 && bulletlabel5.getX() >= zakolabel9.getX() && bulletlabel5.getX() <= zakolabel9.getX() + 112)) {
            bulletfired5 = false;
            //System.out.println("HIT ZAKO9");
            score+=10;
            //System.out.println(score);
            zakohealth9-=1;
            //System.out.println(zakohealth9);
        }
        if((bulletlabel6.getY() <= zakolabel9.getY()+84 && bulletlabel6.getX() >= zakolabel9.getX() && bulletlabel6.getX() <= zakolabel9.getX() + 112)) {
            bulletfired6 = false;
            //System.out.println("HIT ZAKO9");
            score+=10;
            //System.out.println(score);
            zakohealth9-=1;
            //System.out.println(zakohealth9);
        }

        //galaga hitboxes

        if(bulletlabel.getY() >= galagalabel.getY() && bulletlabel.getY() <= galagalabel.getY()+126 && bulletlabel.getX() >= galagalabel.getX() && bulletlabel.getX() <= galagalabel.getX() + 126 && galagaappearance) {
            bulletfired = false;
            //System.out.println("HIT BOSS GALAGA");
            score+=50;
            //System.out.println(score);
            galagahealth-=1;
            //System.out.println(galagahealth);
        }
        if(bulletlabel1.getY() >= galagalabel.getY() && bulletlabel1.getY() <= galagalabel.getY()+126 && bulletlabel1.getX() >= galagalabel.getX() && bulletlabel1.getX() <= galagalabel.getX() + 126 && galagaappearance) {
            bulletfired1 = false;
            //System.out.println("HIT BOSS GALAGA");
            score+=50;
            //System.out.println(score);
            galagahealth-=1;
            //System.out.println(galagahealth);
        }
        if(bulletlabel2.getY() >= galagalabel.getY() && bulletlabel2.getY() <= galagalabel.getY()+126 && bulletlabel2.getX() >= galagalabel.getX() && bulletlabel2.getX() <= galagalabel.getX() + 126 && galagaappearance) {
            bulletfired2 = false;
            //System.out.println("HIT BOSS GALAGA");
            score+=50;
            //System.out.println(score);
            galagahealth-=1;
            //System.out.println(galagahealth);
        }
        if(bulletlabel3.getY() >= galagalabel.getY() && bulletlabel3.getY() <= galagalabel.getY()+126 && bulletlabel3.getX() >= galagalabel.getX() && bulletlabel3.getX() <= galagalabel.getX() + 126 && galagaappearance) {
            bulletfired3 = false;
            //System.out.println("HIT BOSS GALAGA");
            score+=50;
            //System.out.println(score);
            galagahealth-=1;
            //System.out.println(galagahealth);
        }
        if(bulletlabel4.getY() >= galagalabel.getY() && bulletlabel4.getY() <= galagalabel.getY()+126 && bulletlabel4.getX() >= galagalabel.getX() && bulletlabel4.getX() <= galagalabel.getX() + 126 && galagaappearance) {
            bulletfired4 = false;
            //System.out.println("HIT BOSS GALAGA");
            score+=50;
            //System.out.println(score);
            galagahealth-=1;
            //System.out.println(galagahealth);
        }
        if(bulletlabel5.getY() >= galagalabel.getY() && bulletlabel5.getY() <= galagalabel.getY()+126 && bulletlabel5.getX() >= galagalabel.getX() && bulletlabel5.getX() <= galagalabel.getX() + 126 && galagaappearance) {
            bulletfired5 = false;
            //System.out.println("HIT BOSS GALAGA");
            score+=50;
            //System.out.println(score);
            galagahealth-=1;
            //System.out.println(galagahealth);
        }
        if(bulletlabel6.getY() >= galagalabel.getY() && bulletlabel6.getY() <= galagalabel.getY()+126 && bulletlabel6.getX() >= galagalabel.getX() && bulletlabel6.getX() <= galagalabel.getX() + 126 && galagaappearance) {
            bulletfired6 = false;
            //System.out.println("HIT BOSS GALAGA");
            score+=50;
            //System.out.println(score);
            galagahealth-=1;
            //System.out.println(galagahealth);
        }

        //ship hitboxes

        if (goeilabel.getY() >= 800) {
            shiphealth -= 1;
            goeihealth = 0;
        }
        if (goeilabel1.getY() >= 800) {
            shiphealth -= 1;
            goeihealth1 = 0;
        }
        if (goeilabel2.getY() >= 800) {
            shiphealth -= 1;
            goeihealth2 = 0;
        }
        if (goeilabel3.getY() >= 800) {
            shiphealth -= 1;
            goeihealth3 = 0;
        }
        if (goeilabel4.getY() >= 800) {
            shiphealth -= 1;
            goeihealth4 = 0;
        }
        if (goeilabel5.getY() >= 800) {
            shiphealth -= 1;
            goeihealth5 = 0;
        }
        if (goeilabel6.getY() >= 800) {
            shiphealth -= 1;
            goeihealth6 = 0;
        }
        if (goeilabel7.getY() >= 800) {
            shiphealth -= 1;
            goeihealth7 = 0;
        }
        if (goeilabel8.getY() >= 800) {
            shiphealth -= 1;
            goeihealth8 = 0;
        }
        if (goeilabel9.getY() >= 800) {
            shiphealth -= 1;
            goeihealth9 = 0;
        }



        if (zakolabel.getY() >= 800) {
            shiphealth -= 1;
            zakohealth = 0;
        }
        if (zakolabel1.getY() >= 800) {
            shiphealth -= 1;
            zakohealth1 = 0;
        }
        if (zakolabel2.getY() >= 800) {
            shiphealth -= 1;
            zakohealth2 = 0;
        }
        if (zakolabel3.getY() >= 800) {
            shiphealth -= 1;
            zakohealth3 = 0;
        }
        if (zakolabel4.getY() >= 800) {
            shiphealth -= 1;
            zakohealth4 = 0;
        }
        if (zakolabel5.getY() >= 800) {
            shiphealth -= 1;
            zakohealth5 = 0;
        }
        if (zakolabel6.getY() >= 800) {
            shiphealth -= 1;
            zakohealth6 = 0;
        }
        if (zakolabel7.getY() >= 800) {
            shiphealth -= 1;
            zakohealth7 = 0;
        }
        if (zakolabel8.getY() >= 800) {
            shiphealth -= 1;
            zakohealth8 = 0;
        }
        if (zakolabel9.getY() >= 800) {
            shiphealth -= 1;
            zakohealth9 = 0;
        }

        if (galagablastfired && shiplabel.getX() >= galagablastlabel.getX() && shiplabel.getX() <= galagablastlabel.getX()+196 && shiplabel.getY() >= galagablastlabel.getY() && shiplabel.getY() <= galagablastlabel.getY() + 273) {
            shipsremaining -= 1;
            galagalabel.setLocation(400, 1);
        }

        //goei velocity
        goeilabel.setLocation(goeilabel.getX()+goeivelocity,goeilabel.getY());
        goeilabel1.setLocation(goeilabel1.getX()+goeivelocity1,goeilabel1.getY());
        goeilabel2.setLocation(goeilabel2.getX()+goeivelocity2,goeilabel2.getY());
        goeilabel3.setLocation(goeilabel3.getX()+goeivelocity3,goeilabel3.getY());
        goeilabel4.setLocation(goeilabel4.getX()+goeivelocity4,goeilabel4.getY());
        goeilabel5.setLocation(goeilabel5.getX()+goeivelocity5,goeilabel5.getY());
        goeilabel6.setLocation(goeilabel6.getX()+goeivelocity6,goeilabel6.getY());
        goeilabel7.setLocation(goeilabel7.getX()+goeivelocity7,goeilabel7.getY());
        goeilabel8.setLocation(goeilabel8.getX()+goeivelocity8,goeilabel8.getY());
        goeilabel9.setLocation(goeilabel9.getX()+goeivelocity9,goeilabel9.getY());
        //zako velocity
        zakolabel.setLocation(zakolabel.getX()+zakovelocity,zakolabel.getY());
        zakolabel1.setLocation(zakolabel1.getX()+zakovelocity1,zakolabel1.getY());
        zakolabel2.setLocation(zakolabel2.getX()+zakovelocity2,zakolabel2.getY());
        zakolabel3.setLocation(zakolabel3.getX()+zakovelocity3,zakolabel3.getY());
        zakolabel4.setLocation(zakolabel4.getX()+zakovelocity4,zakolabel4.getY());
        zakolabel5.setLocation(zakolabel5.getX()+zakovelocity5,zakolabel5.getY());
        zakolabel6.setLocation(zakolabel6.getX()+zakovelocity6,zakolabel6.getY());
        zakolabel7.setLocation(zakolabel7.getX()+zakovelocity7,zakolabel7.getY());
        zakolabel8.setLocation(zakolabel8.getX()+zakovelocity8,zakolabel8.getY());
        zakolabel9.setLocation(zakolabel9.getX()+zakovelocity9,zakolabel9.getY());
        //galaga velocity
        galagalabel.setLocation(galagalabel.getX()+galagavelocityx, galagalabel.getY()+galagavelocityy);
        galagablastlabel.setLocation(galagalabel.getX()-43+galagavelocityx , galagalabel.getY()+126+galagavelocityy);

        scorelabel.setText(" Score: " + score);
        healthlabel.setText(" Health: " + shiphealth);
        shipsremaininglabel.setText(" Ships: " + shipsremaining);
        wavelabel.setText(" Waves: " + wavescompleted);

        //Endless wave generation

        if (zakohealth <= 0 && zakohealth1 <= 0 && zakohealth2 <= 0 && zakohealth3 <= 0 && zakohealth4 <= 0 && zakohealth5 <= 0 && zakohealth6 <= 0 && zakohealth7 <= 0 && zakohealth8 <= 0 && zakohealth9 <= 0 && goeihealth <= 0 && goeihealth1 <= 0 && goeihealth2 <= 0 && goeihealth3 <= 0 && goeihealth4 <= 0 && goeihealth5 <= 0 && goeihealth6 <= 0 && goeihealth7 <= 0 && goeihealth8 <= 0 && goeihealth9 <= 0 && !wavedone && !galagaappearance) {

            wavedone = true;
            wavescompleted +=1;

            //increase velocities and health and re-randomize the enemy generation

            zakovelocity+=2;
            zakovelocity1+=2;
            zakovelocity2+=2;
            zakovelocity3+=2;
            zakovelocity4+=2;
            zakovelocity5+=2;
            zakovelocity6+=2;
            zakovelocity7+=2;
            zakovelocity8+=2;
            zakovelocity9+=2;

            if (wavescompleted % 2 == 0) {
                goeivelocity+=3;
                goeivelocity1+=3;
                goeivelocity2+=3;
                goeivelocity3+=3;
                goeivelocity4+=3;
                goeivelocity5+=3;
                goeivelocity6+=3;
                goeivelocity7+=3;
                goeivelocity8+=3;
                goeivelocity9+=3;
            }
            //galaga appearance every 3rd and 5th level
            if (wavescompleted % 3 == 0 || wavescompleted % 5 == 0) {
                galagamasterhealth += 2;
                if (galagavelocityy < 0) {
                    galagavelocityy -=3;
                } else {
                    galagavelocityy +=3;
                }
                if (galagavelocityx < 0) {
                    galagavelocityx -=2;
                } else {
                    galagavelocityx +=2;
                }
                galagahealth = galagamasterhealth;
            }

            masterzakohealth+=1;
            zakohealth=masterzakohealth;
            zakohealth1=masterzakohealth;
            zakohealth2=masterzakohealth;
            zakohealth3=masterzakohealth;
            zakohealth4=masterzakohealth;
            zakohealth5=masterzakohealth;
            zakohealth6=masterzakohealth;
            zakohealth7=masterzakohealth;
            zakohealth8=masterzakohealth;
            zakohealth9=masterzakohealth;

            mastergoeihealth+=1;
            goeihealth=mastergoeihealth;
            goeihealth1=mastergoeihealth;
            goeihealth2=mastergoeihealth;
            goeihealth3=mastergoeihealth;
            goeihealth4=mastergoeihealth;
            goeihealth5=mastergoeihealth;
            goeihealth6=mastergoeihealth;
            goeihealth7=mastergoeihealth;
            goeihealth8=mastergoeihealth;
            goeihealth9=mastergoeihealth;

            zakoy = (rand.nextInt(3) + 4) * 100;
            zakoy1 = (rand.nextInt(3) + 4) * 100;
            zakoy2 = (rand.nextInt(3) + 4) * 100;
            zakoy3 = (rand.nextInt(3) + 4) * 100;
            zakoy4 = (rand.nextInt(3) + 4) * 100;
            zakoy5 = (rand.nextInt(3) + 4) * 100;
            zakoy6 = (rand.nextInt(3) + 4) * 100;
            zakoy7 = (rand.nextInt(3) + 4) * 100;
            zakoy8 = (rand.nextInt(3) + 4) * 100;
            zakoy9 = (rand.nextInt(3) + 4) * 100;

            goeiy = (rand.nextInt(4)) * 100;
            goeiy1 = (rand.nextInt(4)) * 100;
            goeiy2 = (rand.nextInt(4)) * 100;
            goeiy3 = (rand.nextInt(4)) * 100;
            goeiy4 = (rand.nextInt(4)) * 100;
            goeiy5 = (rand.nextInt(4)) * 100;
            goeiy6 = (rand.nextInt(4)) * 100;
            goeiy7 = (rand.nextInt(4)) * 100;
            goeiy8 = (rand.nextInt(4)) * 100;
            goeiy9 = (rand.nextInt(4)) * 100;

            zakolabel.setLocation(0,zakoy);
            zakolabel1.setLocation(200,zakoy1);
            zakolabel2.setLocation(400,zakoy2);
            zakolabel3.setLocation(600,zakoy3);
            zakolabel4.setLocation(800,zakoy4);
            zakolabel5.setLocation(0,zakoy5);
            zakolabel6.setLocation(200,zakoy6);
            zakolabel7.setLocation(400,zakoy7);
            zakolabel8.setLocation(600,zakoy8);
            zakolabel9.setLocation(800,zakoy9);

            goeilabel.setLocation(0,goeiy);
            goeilabel1.setLocation(200,goeiy1);
            goeilabel2.setLocation(400,goeiy2);
            goeilabel3.setLocation(600,goeiy3);
            goeilabel4.setLocation(800,goeiy4);
            goeilabel5.setLocation(0,goeiy5);
            goeilabel6.setLocation(200,goeiy6);
            goeilabel7.setLocation(400,goeiy7);
            goeilabel8.setLocation(600,goeiy8);
            goeilabel9.setLocation(800,goeiy9);



            wavedone = false;

        }

        //boss galaga appearance
        if ((wavescompleted%3==0 && wavescompleted!=0|| wavescompleted%5 == 0 && wavescompleted != 0) && galagahealth > 0) {
            galagaappearance = true;
        } else {
            galagaappearance = false;
        }
        if (galagaappearance) {
            this.add(galagalabel);
        } else {
            this.remove(galagalabel);
        }

        if (galagalabel.getY() > 500 && galagaappearance) {
            galagablastfired = true;
        } else {
            galagablastfired = false;
        }

        if (galagablastfired) {
            this.add(galagablastlabel);
        } else {
            this.remove(galagablastlabel);
        }

        //health and game over conditions
        if (shiphealth <= 0) {
            shipsremaining -= 1;
            shiphealth = 5;
        }
        if (shipsremaining <= 0) {
            this.remove(shiplabel);
            this.remove(bulletlabel);
            this.remove(bulletlabel1);
            this.remove(bulletlabel2);
            this.remove(bulletlabel3);
            this.remove(bulletlabel4);
            this.remove(bulletlabel5);
            this.remove(bulletlabel6);
            timer.stop();
        }

    }

}
