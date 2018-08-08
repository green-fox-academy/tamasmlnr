import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    //the integer parameter sets how many lines should a quarter consist of
    drawStar(graphics, 50);
  }

  public static void drawStar(Graphics graphics, int lineNum) {
    graphics.setColor(Color.GREEN);
    int hHeight = HEIGHT / 2;
    int hWidth = WIDTH / 2;
    int hPiece = HEIGHT / lineNum;
    int wPiece = WIDTH / lineNum;
    //first quarter
    for (int x = 0; x <= hWidth; x += wPiece) {
      for (int y = HEIGHT; y >= hPiece; y -= hPiece) {
        graphics.drawLine(x, hHeight, hWidth, hHeight - x);
      }
    }
    //second quarter
    for (int x = 0; x <= hWidth; x += wPiece) {
      for (int y = hHeight; y <= HEIGHT; y += hPiece) {
        graphics.drawLine(x, hHeight, hWidth, hHeight + x);
      }
    }
    //third quarter
    for (int x = WIDTH; x >= hWidth; x -= wPiece) {
      for (int y = hHeight; y >= hPiece; y -= hPiece) {
        graphics.drawLine(x, hHeight, hWidth, hHeight - (WIDTH - x));
      }
    }
    //fourth quarter
    for (int x = WIDTH; x >= hWidth; x -= wPiece) {
      for (int y = hHeight; y <= HEIGHT; y += hPiece) {
        graphics.drawLine(x, hHeight, hWidth, hHeight + (WIDTH - x));
      }
    }
  }

  // Don't touch the code below
  //Sorry, i touched the code below to edit the frame size
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