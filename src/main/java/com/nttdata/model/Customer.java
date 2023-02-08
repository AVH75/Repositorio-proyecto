package com.nttdata.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Data
public class Customer {
    private Integer id;
    private String lastName;
    private String firstName;
    private String dni;
    private String ruc;
    private String clientType;


}
