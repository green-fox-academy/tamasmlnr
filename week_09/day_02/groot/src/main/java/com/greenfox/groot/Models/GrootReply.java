package com.greenfox.groot.Models;

public class GrootReply {

  private String received;
  private String translated;

  public GrootReply() {
  }

  public GrootReply(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
