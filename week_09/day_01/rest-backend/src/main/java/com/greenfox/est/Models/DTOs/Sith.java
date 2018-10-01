package com.greenfox.est.Models.DTOs;

import java.util.*;

public class Sith {

  private String sithText;

  public Sith(String text) {
    this.sithText = sithize(text);
  }


  public String sithize(String text) {
    String[] randomwords = new String[]{" Uhmm.", " Arrrgh.", " Mhm."};
    String result = "";
    String[] sentences = text.split("(\\. )|(\\.)");
    for (String sentence : sentences) {
      String[] words = sentence.split(" ");
      String firstWord = words[0];
      String lastWord = words[words.length - 1];
      String[] middlewords = new String[words.length - 2];
      for (int i = 0; i < words.length - 2; i++) {
        middlewords[i] = words[i + 1];
      }
      Collections.shuffle(Arrays.asList(middlewords));
      result += firstWord + " ";
      for (int i = 0; i < middlewords.length; i++) {
        result += middlewords[i];
        System.out.println(middlewords[i]);
        result += " ";
      }
      result += lastWord;
      result += ".";
      for (int i = 0; i <= (int) (Math.random() * 2); i++) {
        result += randomwords[(int) (Math.random() * 2)];
      }
    }

    return result;
  }

  public String getSithText() {
    return sithText;
  }

  public void setText(String text) {
    this.sithText = text;
  }
}
