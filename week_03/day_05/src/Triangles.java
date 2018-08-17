import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {


  public static void mainDraw(Graphics graphics) {
    fractalFunction(graphics, 0, 0, WIDTH);
  }


  public static void fractalFunction(Graphics graphics, int x, int y, int size) {
    int[] xPoints = {x, x + size / 2, x + size};
    int[] yPoints = {y, y + size, y};
    graphics.setColor((new Color((int) (Math.random() * 16777215))));
    graphics.fillPolygon(xPoints, yPoints, 3);

    if (size > 5) {
      fractalFunction(graphics, x, y, size / 2);
      fractalFunction(graphics, x + size / 2, y, size / 2);
      fractalFunction(graphics, x + size / 4, y + size / 2, size / 2);
    }


  }

  //    if(size>10){
//    fractalFunction(graphics,x,y,size/2);
//    fractalFunction(graphics,x+size,y,size/2);
//    fractalFunction(graphics,x+size/2,y+size/2,size/2);


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