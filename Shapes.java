/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
     // g.setColor(Color.red);
      //g.fillOval(100, 100, 50, 50);
      //g.fillRect(200, 200, 25, 25);
      //g.setColor(Color.green);
      //g.fillRect(100, 100, 25, 25);
      //this.drawBullsEye(g);
      this.olympicRings(g);
      //this.trafficLight(g);
      


      

   }
   
   public void drawBullsEye(Graphics g){
      g.setColor(Color.red);
      g.fillOval(100, 100, 100, 100);
      g.setColor(Color.black);
      g.fillOval(113, 113, 75, 75);
      g.setColor(Color.red);
      g.fillOval(125 , 125, 50, 50);
      g.setColor(Color.black);
      g.fillOval(138, 138, 25, 25);
      g.setColor(Color.red);
      g.fillOval(145, 145, 10, 10);


   }

   public void olympicRings(Graphics g){
      g.setColor(Color.blue);
      g.drawOval(50, 50, 50, 50);
      g.setColor(Color.yellow);
      g.drawOval(50, 50, 50, 50);
      g.setColor(Color.black);
      g.drawOval(50, 50, 50, 50);
      g.setColor(Color.blue);
      g.drawOval(50, 50, 50, 50);
      g.setColor(Color.blue);
      g.drawOval(50, 50, 50, 50);

   }

   public void trafficLight(Graphics g){

   }
   
   
   

}
