import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    //Customize triangle properties with these variables (starting X,Y side length and triangle drawing rows)
    int fromX = WIDTH / 2;
    int fromY = 50;
    int side = 30;
    int howManyTimes = 10;
    for (int x = 0; x <= howManyTimes; x += 1) {
      for (int y = 0; y < x; y += 1) {
        drawTriangle(graphics, fromX, fromY, side);
        fromX += side;
      }
      fromX = WIDTH / 2 - side / 2 * x;
      fromY += (int) (0.866 * side);
    }
  }

  public static void drawTriangle(Graphics graphics, int drawFromX, int drawFromY, int side) {
    int[] x = {drawFromX, drawFromX + side / 2, drawFromX + side, drawFromX};
    int[] y = {drawFromY, drawFromY - (int) (0.866 * side), drawFromY,drawFromY};
    graphics.drawPolygon(x, y, x.length);
  }

  // Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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