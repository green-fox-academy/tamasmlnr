import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {


  public static void mainDraw(Graphics graphics) {
    for (int y = 0; y < HEIGHT; y += 20) {
      for (int x = 20; x < WIDTH; x += 20){
        drawToMiddle(x, HEIGHT, graphics);
        drawToMiddle(WIDTH, y, graphics);
        drawToMiddle(0, y, graphics);
        drawToMiddle(x, 0, graphics);
      }
    }
  }
  public static void drawToMiddle(int x, int y, Graphics graphics) {
    graphics.setColor(Color.black);
    graphics.drawLine(x, y, HEIGHT / 2, WIDTH / 2);
  }


  // Don't touch the code below
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}