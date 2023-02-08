package com.nttdata.repository;

import com.nttdata.model.BankingTransactions;

import java.util.ArrayList;
import java.util.List;

public class BankingTransactionsRepository {
  public  List<BankingTransactions> getAll(){
        List<BankingTransactions> bankingTransactions = new ArrayList<>();
        bankingTransactions.add(new BankingTransactions(1, "retiro"));
        bankingTransactions.add(new BankingTransactions(2, "deposito"));
        bankingTransactions.add(new BankingTransactions(3, "retiro"));
        bankingTransactions.add(new BankingTransactions(4, "retiro"));
        bankingTransactions.add(new BankingTransactions(5, "deposito"));
        bankingTransactions.add(new BankingTransactions(6, "retiro"));
return bankingTransactions;
    }


}
