import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(100, 100, 200, 100);
    graphics.setColor(Color.RED);
    graphics.drawLine(200, 100, 200, 200);
    graphics.setColor(Color.BLACK);
    graphics.drawLine(200, 200, 100, 200);
    graphics.setColor(Color.ORANGE);
    graphics.drawLine(100, 200, 100, 100);
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