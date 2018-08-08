import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    // Create a function that takes 1 parameter:
    // An array of {x, y} points
    // and connects them with green lines.
    // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}


//    ArrayList<Integer> coordinates = new ArrayList<>();
//    int[][] firstArray = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
//    int[][] secondArray = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
//        {120, 100}, {85, 130}, {50, 100}};
//    connect(firstArray, graphics);
//    connect(secondArray,graphics);
//  }
//
//
//  public static void connect(int [][] inputArray, Graphics graphics) {
//  for (int x=0; x<inputArray.length; x+=1)
//  for (int y=0; y<inputArray[x].length; y+=1) {
//    graphics.drawLine(inputArray[x][x], inputArray[x][y],inputArray[x][x], inputArray[y][y]);
//  }

  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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


// create a 300x300 canvas.