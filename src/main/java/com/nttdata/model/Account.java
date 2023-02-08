package com.nttdata.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor




public class Account {
    private Integer id;
    private String numberAccount;
    private Integer customerId;
    private float totalBalance;
    private String typeAccount;

}
