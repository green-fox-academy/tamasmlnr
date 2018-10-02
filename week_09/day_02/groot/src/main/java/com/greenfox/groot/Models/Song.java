package com.greenfox.groot.Models;

public class Song {
  private String author;
  private String title;
  private String genre;
  private int year;
  private double rating;

  public Song(String author, String title, String genre, int year, double rating) {
    this.author = author;
    this.title = title;
    this.genre = genre;
    this.year = year;
    this.rating = rating;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }
}
