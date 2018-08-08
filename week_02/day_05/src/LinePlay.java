import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    //the integer parameter sets how many lines should a quarter consist of
    drawStar(graphics, 14);
  }

  public static void drawStar(Graphics graphics, int lineNum) {
    graphics.setColor(Color.GREEN);

    int hPiece = HEIGHT / lineNum;
    int wPiece = WIDTH / lineNum;

    //bottom part
    for (int x = 40; x < WIDTH; x += wPiece) {
        graphics.drawLine(x-hPiece, HEIGHT, 0, x);
      }

  //top part
    graphics.setColor(new Color(11876852));
    for (int x = 40; x < WIDTH; x += wPiece) {
    graphics.drawLine(WIDTH-x+wPiece, 0, WIDTH, WIDTH-x);
  }
}



  // Don't touch the code below
  //Sorry, i touched the code below to edit the frame size
  static int WIDTH = 350;
  static int HEIGHT = 350;

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