package com.nttdata.service;

import com.nttdata.model.Account;
import com.nttdata.model.BankingTransactions;
import com.nttdata.proxy.AccountProxy;
import com.nttdata.repository.BankingTransactionsRepository;
import com.nttdata.repository.CustomerRepository;


import java.util.List;
import java.util.stream.Collectors;

public class OperationService {
    private CustomerRepository customerRepository;
    private AccountProxy accountProxy;
    private BankingTransactionsRepository bankingTransactionsRepository;

    public OperationService(){
        customerRepository = new CustomerRepository();
        accountProxy = new AccountProxy();
        bankingTransactionsRepository = new BankingTransactionsRepository();

    }

    public void consultBalance(Integer id){
        accountProxy.accountsGet()
                .filter(account -> account.getId().equals(id))
                .map(account -> account.getTotalBalance())
                .collect(Collectors.toList())
                .forEach(x -> System.out.println("Su saldo es :" + x));
    }

    public void shopping(Integer id, String description , float cost, Integer limitMax){
        accountProxy.accountsGet()
                .filter(account -> account.getId().equals(id))
                .filter(account -> account.getTotalBalance()<=limitMax && cost<account.getTotalBalance() & cost<limitMax)
                .map(account -> account.getTotalBalance() - cost)
                .collect(Collectors.toList())
                .forEach(x -> System.out.println("Despues de la compra de" +  description  +"Le queda:"+ x));
    }

    public void toPay(Integer id, float debt ,float payment ){
        float currentDebt = debt - payment;
        System.out.println("Deuda actual:"+currentDebt);
        accountProxy.accountsGet()
                .filter(account -> account.getId().equals(id))
                .map(account -> account.getTotalBalance() + payment)
                .collect(Collectors.toList())
                .forEach(x -> System.out.println("Saldo actual de su tarjeta de credito :"+ x));

    }
    public void deposit ( Integer id,float depositedAmount){
        accountProxy.accountsGet()
                .filter(account -> account.getId().equals(id))
                .map(account -> account.getTotalBalance()+depositedAmount)
                .collect(Collectors.toList())
                .forEach(x -> System.out.println("Su saldo es :" + x));
    }
    public void retirement (Integer id, float retirementAmount){
        accountProxy.accountsGet()
                .filter(account -> account.getId().equals(id))
                .map(account -> account.getTotalBalance()-retirementAmount)
                .collect(Collectors.toList())
                .forEach(x -> System.out.println("Su saldo es :" + x));
    }
    public void getTransactionsById(Integer id){
bankingTransactionsRepository.getAll().stream()
        .filter(bankingTransactions -> bankingTransactions.getAccountId().equals(id))
        .collect(Collectors.toList())
        .forEach(System.out::println);

    }

}
