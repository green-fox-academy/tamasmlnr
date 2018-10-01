package com.greenfox.est.Models.DTOs;

import java.util.List;

public class LogsAndLogCount {
  private List<Log> entries;
  public static int entryCount = 0;

  public LogsAndLogCount(List<Log> entries) {
    this.entries = entries;
  }

  public LogsAndLogCount() {
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(int entryCount) {
    this.entryCount = entryCount;
  }
}
