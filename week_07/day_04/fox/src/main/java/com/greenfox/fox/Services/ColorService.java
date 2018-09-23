package com.greenfox.fox.Services;


import com.greenfox.fox.Models.Fox;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ColorService {

  public static void recolorFox(String color, Fox fox) {
    String newColor = color.substring(1);
    String tempColor = fox.getNewColor();
    fox.setNewColor(newColor);
    fox.setOldColor(tempColor);
    colorChanger(fox.getOldColor(), fox.getNewColor());
  }

  public static void colorChanger(String oldHex, String newHex) {
    String oldRgb = hex2Rgb(oldHex);
    String newRgb = hex2Rgb(newHex);
    String oldDarkRgb = hex2DarkerRgb(oldHex);
    String newDarkRgb = hex2DarkerRgb(newHex);
    try {
      modifyColor(oldRgb, newRgb);
      modifyColor(oldDarkRgb, newDarkRgb);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public static String hex2Rgb(String colorStr) {
    String color = "";
    color += Integer.valueOf(colorStr.substring(0, 2), 16);
    color += ",";
    color += Integer.valueOf(colorStr.substring(2, 4), 16);
    color += ",";
    color += Integer.valueOf(colorStr.substring(4, 6), 16);

    return color;
  }

  public static String hex2DarkerRgb(String colorStr) {
    int color1 = Integer.valueOf(colorStr.substring(0, 2), 16) - 60;
    if (color1 < 0) color1 = 0;
    int color2 = Integer.valueOf(colorStr.substring(2, 4), 16) - 60;
    if (color2 < 0) color2 = 0;
    int color3 = Integer.valueOf(colorStr.substring(4, 6), 16) - 60;
    if (color3 < 0) color3 = 0;
    String color = "";
    color += color1;
    color += ",";
    color += color2;
    color += ",";
    color += color3;

    return color;
  }

  public static void modifyColor(String oldColor, String newColor) throws IOException {
    Path path = Paths.get("C:\\Users\\Tamás\\greenfox\\tamasmlnr\\week_07\\day_04\\fox\\src\\main\\resources\\static\\drawfox.js");
    Charset charset = StandardCharsets.UTF_8;
    String content = new String(Files.readAllBytes(path), charset);
    content = content.replaceAll(oldColor, newColor);
    Files.write(path, content.getBytes(charset));
  }

  public static void recreateGreenFox()
      throws IOException {
    Files.deleteIfExists(Paths.get("C:\\Users\\Tamás\\greenfox\\tamasmlnr\\week_07\\day_04\\fox\\src\\main\\resources\\static\\drawfox.js"));
    InputStream input = null;
    OutputStream output = null;
    try {
      input = new FileInputStream("C:\\Users\\Tamás\\greenfox\\tamasmlnr\\week_07\\day_04\\fox\\src\\main\\resources\\static\\drawfoxOrig.js");
      output = new FileOutputStream("C:\\Users\\Tamás\\greenfox\\tamasmlnr\\week_07\\day_04\\fox\\src\\main\\resources\\static\\drawfox.js");
      byte[] buf = new byte[1024];
      int bytesRead;
      while ((bytesRead = input.read(buf)) > 0) {
        output.write(buf, 0, bytesRead);
      }
    } finally {
      input.close();
      output.close();
    }
  }


}

