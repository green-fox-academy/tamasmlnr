import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
//77 is the ideal number of stars
    for (int i = 0; i < 77; i++) {
      {int tint=((int)(60+(Math.random() * 40)));
       graphics.setColor (new Color (tint,tint,tint));
        int size = (int) (Math.random() * 10);
        graphics.fillRect((int) (Math.random() * 500), (int) (Math.random() * 500), size, size);
      }

    }
  }

  // Don't touch the code below
  static int WIDTH = 520;
  static int HEIGHT = 543;

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
      this.setBackground(new Color(75, 0, 130));
    }
  }
}