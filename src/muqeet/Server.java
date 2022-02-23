/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muqeet;


import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Server implements Runnable{
    
    Socket socket;
    
    public static Vector client = new Vector();
    
    public Server(Socket socket){
        try{
            this.socket = socket;
        }catch(Exception e){}
    }
    
    private void onMessage(String message){
        JFrame f=new JFrame();
        JButton b ,b1;
      b= new JButton(new ImageIcon("Press2.JFIF"));//creating instance of JButton
      b.setBackground(Color.LIGHT_GRAY);
      TextField tf2 = new TextField();
        tf2.setBounds(300,242,500,300);
        ImageIcon i = new ImageIcon("Bill.jpg");
        JLabel l = new JLabel("",i,JLabel.CENTER);
        l.setBounds(0,0,300,600);
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    tf2.setText(message);
                    System.out.println("Welcome");
                      
        }});
        f.add(tf2);
      b.setBounds(400,30,300,200);//x axis, y axis,width,heigth
     // f.add(b);//adding button in JFrame
     f.add(l);f.add(b);
      f.setSize(800,600);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void run(){
        
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            
            client.add(writer);
            
            while(true){
                String data = reader.readLine().trim();
                System.out.println("Received "+data);
               // onMessage(data);
                JFrame f=new JFrame();//creating instance of JFrame
      JButton b ,b1;
      b= new JButton("Bill",new ImageIcon("Press2.JFIF"));//creating instance of JButton
      b.setBackground(Color.LIGHT_GRAY);
      TextField tf2 = new TextField();
        tf2.setBounds(300,242,500,300);
        ImageIcon i = new ImageIcon("Bill.jpg");
        JLabel l = new JLabel("",i,JLabel.CENTER);
        l.setBounds(0,0,300,600);
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent a){
                    int quantity = Integer.parseInt(data);
  //               int totalamount = price*quantity;
                 tf2.setText(data);
                    System.out.println("Welcome");
                    
                    //tf2.setText(data);
                    System.out.println("Welcome");
                      
        }});
        f.add(tf2);
      b.setBounds(400,30,300,200);//x axis, y axis,width,heigth
     // f.add(b);//adding button in JFrame
     f.add(l);f.add(b);
      f.setSize(800,600);//300 width and 200 height
      f.setLayout(null);//using layout manager
      f.setVisible(true);//making the frame visible
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                } 
                
            
        }catch(Exception e){}
        
    }
    
    
    public static void main(String[] args) throws Exception{
        ServerSocket s = new ServerSocket(8081);
        while(true){
            Socket socket = s.accept();
            Server server = new Server(socket);
            Thread thread = new Thread(server);
            thread.start();
        }
    }
}
