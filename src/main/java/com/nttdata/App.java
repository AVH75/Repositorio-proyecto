package com.nttdata;

import com.nttdata.service.OperationService;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        final int limitMaxCredit = 7000;
        OperationService operationService = new OperationService();
        //operationService.consultBalance(1);
        //operationService.shopping(1," Computadora ",1000, limitMaxCredit);
        //operationService.toPay(1,200,100);
       // operationService.deposit(1,200);
      //  operationService.retirement(2, 220);
        operationService.getTransactionsById(1);


    }
}
