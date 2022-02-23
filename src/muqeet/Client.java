package muqeet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Client implements ActionListener, Runnable{
    public String apples,oranges,grapes,banana,strawberry,peach;
    public String ocrish,fish,mutton,chicken,camal,beef;
    public String cauliflower,landyfinger,eggplant,redchilly,potato,onion;
    public int[] o=new int[18];int a=0;
    BufferedWriter writer;
    BufferedReader reader;
    
     public void onMessage(){}
    Client(){
        JFrame f1=new JFrame();
        JMenuBar menuBar = new JMenuBar();
            JMenu menuFile = new JMenu("File");
            JMenuItem menuItemExit = new JMenuItem("Exit");
            menuFile.add(menuItemExit);
            menuBar.add(menuFile);
 	// adds menu bar to the frame
            f1.setJMenuBar(menuBar);
            JFrame jf= new JFrame();
     // JButton b = new JButton("Apple",new ImageIcon("D:\\muq.JFIF"));
            JButton b1,b2,b3,b4,b5,b6;
            Image icon = new javax.swing.ImageIcon("D:\\Shop2.JFIF").getImage();
      f1.setIconImage(icon);
      ImageIcon i = new ImageIcon("D:\\Shop2.JFIF");
      JLabel l = new JLabel("",i,JLabel.CENTER);
      l.setBounds(0,0,770,500);
            b1 = new JButton(new ImageIcon("Fruits.PNG"));
            b2 = new JButton(new ImageIcon("Vegetable.PNG"));
            b3 = new JButton(new ImageIcon("meat.PNG"));
            b4 = new JButton("add item");
            b1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame f1=new JFrame();
                    JMenuBar menuBar = new JMenuBar();
                    JMenu menuFile = new JMenu("File");
                    JMenuItem menuItemExit = new JMenuItem("Exit");
                    menuFile.add(menuItemExit);
                    menuBar.add(menuFile);
 	// adds menu bar to the frame
            f1.setJMenuBar(menuBar);
            ImageIcon i = new ImageIcon("D:\\sar.JPG");
            JLabel l = new JLabel("",i,JLabel.CENTER);
            l.setBounds(0,0,1000,750);
     // JButton b = new JButton("Apple",new ImageIcon("D:\\muq.JFIF"));
            JButton b1,b2,b3,b4,b5,b6;
            b1 = new JButton(new ImageIcon("apple.PNG"));
            b2 = new JButton(new ImageIcon("orange.JFIF"));
            b3 = new JButton(new ImageIcon("grape.PNG"));
            b4 = new JButton(new ImageIcon("banana.PNG"));
            b5 = new JButton(new ImageIcon("strawberry.PNG"));
            b6 = new JButton(new ImageIcon("peach.JFIF"));
             b1.setBounds(20,130,240,240);//x axis, y axis,width,heigth
             b2.setBounds(335,130,240,240);
             b3.setBounds(650,130,240,240);
             b4.setBounds(20,380,240,240);
             b5.setBounds(335,380,240,240);
             b6.setBounds(650,380,240,240);
             l.add(b1);l.add(b2);l.add(b3);l.add(b4);l.add(b5);l.add(b6);
             f1.add(l);
             
             //apples
            b1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[0] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //orange
            b2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[1] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Grapes
            b3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[2] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //banana
            b4.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[3] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //strawberry
            b5.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[4] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //peach
            b6.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[5] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);f1.add(b6);
            f1.setLayout(null);
            f1.setSize(1000,800);
            f1.setVisible(true);//making the frame visible
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
            );
            //Vegetables
            b2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){   
                    JFrame f1=new JFrame();
                    JMenuBar menuBar = new JMenuBar();
                     JMenu menuFile = new JMenu("File");
            JMenuItem menuItemExit = new JMenuItem("Exit");
            menuFile.add(menuItemExit);
            menuBar.add(menuFile);
 	// adds menu bar to the frame
            f1.setJMenuBar(menuBar);

     // JButton b = new JButton("Apple",new ImageIcon("D:\\muq.JFIF"));
            JButton b1,b2,b3,b4,b5,b6;
            b1 = new JButton(new ImageIcon("Cauliflower.JFIF"));
            b2 = new JButton(new ImageIcon("Landyfinger.JFIF"));
            b3 = new JButton(new ImageIcon("Eggplant.PNG"));
            b4 = new JButton(new ImageIcon("Redchilly.JFIF"));
            b5 = new JButton(new ImageIcon("Potato.JFIF"));
            b6 = new JButton(new ImageIcon("Onion.PNG"));
            //CauliFlower
            b1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[6] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //LandyFinger
            b2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[7] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Eggplant
            b3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[8] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Redchilly
            b4.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[9] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //photato
            b5.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[10] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Onion
            b6.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[11] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //addition of vegetables
            f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);f1.add(b6);
            f1.setLayout(new GridLayout(2,3));
            f1.setSize(600,600);
            f1.setVisible(true);//making the frame visible
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
            );
             
            
            
            
            
            //Meal
            b3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame f1=new JFrame();
                    JMenuBar menuBar = new JMenuBar();
                    JMenu menuFile = new JMenu("File");
            JMenuItem menuItemExit = new JMenuItem("Exit");
            menuFile.add(menuItemExit);
            menuBar.add(menuFile);
 	// adds menu bar to the frame
            f1.setJMenuBar(menuBar);

     // JButton b = new JButton("Apple",new ImageIcon("D:\\muq.JFIF"));
            JButton b1,b2,b3,b4,b5,b6;
            b1 = new JButton(new ImageIcon("ostrich.JFIF"));
            b2 = new JButton(new ImageIcon("fish.JFIF"));
            b3 = new JButton(new ImageIcon("mutton.JFIF"));
            b4 = new JButton(new ImageIcon("chicken.JFIF"));
            b5 = new JButton(new ImageIcon("camal.JFIF"));
            b6 = new JButton(new ImageIcon("beef.PNG"));
            //Ostrich
            b1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[12] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Fish
            b2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[13] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Mutton
            b3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[14] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Chicken
            b4.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[15] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Camal
            b5.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[16] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            //Beef
            b6.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                   JFrame f=new JFrame();//creating instance of JFrame
            JButton b = new JButton("click");//creating instance of JButton
            TextField tf2 = new TextField();
            tf2.setBounds(30,50,300,30);
            f.add(tf2);
      b.setBounds(130,100,100,40);//x axis, y axis,width,heigth
      f.add(b);//adding button in JFrame
      f.setSize(300,300);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        int quantity = Integer.parseInt(tf2.getText());
        o[17] = quantity;
        f.setVisible(false);
                }
            }
            );
                }
            }
            );
            f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);f1.add(b6);
            f1.setLayout(new GridLayout(2,3));
            f1.setSize(600,600);
            f1.setVisible(true);//making the frame visible
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
            );
            b4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    for (int pl=0; pl<18; pl++){
                System.out.println(o[pl]);
            }
                    int total=o[0]*112+o[1]*100+o[2]*200+o[3]*40+o[4]*250+o[5]*50+o[6]*15+o[7]*50+o[8]*20+o[9]*10+o[10]*25+o[11]*45+o[12]*450+o[13]*350+o[14]*900+o[15]*300+o[16]*1500+o[17]*600;
                    System.out.println(total);
                    String.valueOf(total);
                    try{
                        writer.write(total);
                        writer.write("\n\r\n");
                        writer.flush();
                    }
                    catch(Exception e){
                    e.printStackTrace();}
        }});
            b1.setBounds(20,130,240,240);//x axis, y axis,width,heigth
            b2.setBounds(265,130,240,240);
            b3.setBounds(510,130,240,240);
            b4.setBounds(340,400,100,20);
            l.add(b4);
            l.add(b1);l.add(b2);l.add(b3);//f1.add(b4);f1.add(b5);f1.add(b6);
            f1.add(l);
            f1.setLayout(null);
            
            f1.setSize(780,550);
            f1.setVisible(true);//making the frame visible
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
       try{
           Socket socketClient = new Socket("localhost", 8081);
           writer = new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));
           reader = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
       }catch(Exception e){}
    }
    @Override
    public void actionPerformed(ActionEvent ae){}
    public void run(){}
    
    public static void main(String[] args){
        Client one = new Client();
        Thread t1 = new Thread(one);
        t1.start();       
    }
}