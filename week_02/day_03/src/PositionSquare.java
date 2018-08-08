import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two coordinates - 3 times, so 6 in total");
    for (int i = 0; i < 3; i++) {
      int x = Integer.parseInt(reader.nextLine());
      int y = Integer.parseInt(reader.nextLine());
      drawSquare(x, y, graphics);
    }
    System.out.println("Thank you!");
  }

  public static void drawSquare(int x, int y, Graphics graphics) {
    graphics.setColor(Color.ORANGE);
    graphics.drawRect(x, y, 50, 50);
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}