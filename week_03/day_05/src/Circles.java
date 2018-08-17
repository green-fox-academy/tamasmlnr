import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

  public static void mainDraw(Graphics graphics) {
    int size = WIDTH;
    fractalFunction(graphics, 0, 0, size);
  }

  public static void fractalFunction(Graphics g, int x, int y, int size) {
    g.setColor((new Color((int) (Math.random() * 16777215))));
    g.drawOval(x, y, size, size);
    if (size > 100) {
      fractalFunction(g, x + size / 4, y, size / 2);
      fractalFunction(g, x + size * 3 / 200, y + size / 3, size / 2);
      fractalFunction(g, x + size / 2 - size * 3 / 200, y + size / 3, size / 2);
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
      mainDraw(graphics);
    }
  }
}