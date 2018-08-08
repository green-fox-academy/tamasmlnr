import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {

    for (int x = 0; x < 500; x += 100) {
      for (int i = 0; i < 500; i += 100) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, i, 50, 50);
        System.out.println(x);
        System.out.println(i);
      }
    }

    for (int z = 50; z < 500; z += 100) {
      for (int i = 50; i < 500; i += 100) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(z, i, 50, 50);
        System.out.println(z);
        System.out.println(i);
      }


    }
  }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main (String[]args){
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