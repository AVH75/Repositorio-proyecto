package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankingTransactions {
    private Integer accountId;
    private String description;
}
