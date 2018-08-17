import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic {


  public static void mainDraw(Graphics graphics) {
    fractalFunction(graphics, 0, 0,WIDTH);
  }

  private static void fractalFunction(Graphics graphics, int x, int y, int d) {
    graphics.drawRect(x, y + d/3, d/3, d/3);
    graphics.drawRect(x + d/3, y, d/3, d/3);
    graphics.drawRect(x + d/3, y + 2 * d/3, d/3, d/3);
    graphics.drawRect(x + 2 * d/3, y + d/3, d/3, d/3);
    if (d > 5) {
      fractalFunction(graphics, x, y + d/3, d/3);
      fractalFunction(graphics, x + d/3, y, d/3);
      fractalFunction(graphics, x + d/3, y + 2 * d/3, d/3);
      fractalFunction(graphics, x + 2 * d/3, y + d/3, d/3);
    }
  }

  // Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(WIDTH, HEIGHT);
    jFrame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.yellow);
      mainDraw(graphics);
    }
  }
}