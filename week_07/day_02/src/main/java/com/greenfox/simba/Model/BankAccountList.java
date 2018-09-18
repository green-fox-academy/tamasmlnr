package com.greenfox.simba.Model;

import java.util.ArrayList;
import java.util.List;

public class BankAccountList {
  List<BankAccount> bankAccountList;

  public BankAccountList() {
    bankAccountList = new ArrayList<>();
    generateAccountList();
  }

  public List<BankAccount> getList() {
    return bankAccountList;
  }


  public void generateAccountList() {
    bankAccountList.add(new BankAccount("Simba", 1000, "Lion", true, false));
    bankAccountList.add(new BankAccount("Mufasa", 2500, "Lion", true, true));
    bankAccountList.add(new BankAccount("Scar", 3000, "Lion", false, false));
    bankAccountList.add(new BankAccount("Timon", 1500, "Meerkat", true, false));
    bankAccountList.add(new BankAccount("Pumba", 1500, "Boar", true, false));
  }

  public void add(BankAccount bankAccount) {
    bankAccountList.add(bankAccount);
  }

  public List<BankAccount> getBankAccountList() {
    return bankAccountList;
  }

  public void setBankAccountList(List<BankAccount> bankAccountList) {
    this.bankAccountList = bankAccountList;
  }
}
