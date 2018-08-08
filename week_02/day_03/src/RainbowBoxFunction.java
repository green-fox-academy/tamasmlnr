import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the square size and the rgb integer value:");
    {
      int x = Integer.parseInt(reader.nextLine());
      int color = Integer.parseInt(reader.nextLine());
      drawRect(x, color, graphics);
      System.out.println("Press Y if you are ready to party");
      String y = reader.nextLine();
      if (y.equals("y"))
        for (int i = 0; i < 3000; i++) {
          {
            drawMany(x, graphics);
          }
        }
      else System.out.println("Boring!");
    }
    System.out.println("Thank you!");
  }

  public static void drawRect(int x, int color, Graphics graphics) {
    graphics.setColor(new Color(color));
    graphics.fillRect(WIDTH / 2 - (x / 2), HEIGHT / 2 - (x / 2), x, x);
  }

  public static void drawMany(int x, Graphics graphics) {
    graphics.setColor(new Color((int) (Math.random() * 16777215)));
    x = (int) (Math.random() * x);
    graphics.fillRect((int) (Math.random() * 300), (int) (Math.random() * 300), x, x);

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