import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {

  public static void mainDraw(Graphics graphics) {
    int size = WIDTH/3;
    fractalFunction(graphics, WIDTH/2-size/2, WIDTH/2-size/2, size);
  }

  public static void fractalFunction(Graphics g, int x, int y, int size) {
//    g.setColor((new Color((int) (Math.random() * 16777215))));
    g.setColor((Color.black));
    g.fillRect(x, y, size, size);
    if (size > 5) {
      fractalFunction(g, x-(size*2/3), y+size/3, size /3);
      fractalFunction(g, x-(size*2/3), y-size*2/3, size /3);
      fractalFunction(g, x-(size*2/3), y+size*4/3, size /3);
      fractalFunction(g, x+(size*4/3), y+size/3, size /3);
      fractalFunction(g, x+(size*4/3), y+size*4/3, size /3);
      fractalFunction(g, x+(size*4/3), y-size*2/3, size /3);
      fractalFunction(g, x+size/3, y+size*4/3, size /3);
      fractalFunction(g, x+size/3, y-size*2/3, size /3);
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