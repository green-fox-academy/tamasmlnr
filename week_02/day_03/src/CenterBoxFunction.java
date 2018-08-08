import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.

      Scanner reader = new Scanner(System.in);
      System.out.println("Enter the square size - 3 times, so 6 in total");
      for (int i = 0; i < 3; i++) {
        int x = Integer.parseInt(reader.nextLine());
        drawSquare(x,graphics);
      }
      System.out.println("Thank you!");
    }

    public static void drawSquare(int x, Graphics graphics) {
      graphics.setColor(Color.ORANGE);
      //the center of the canvas is in the center of the squares instead of the upper left corner
      graphics.drawRect(WIDTH/2-(x/2), HEIGHT/2-(x/2), x, x);
    }


  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}