package com.nttdata.repository;

import com.nttdata.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Peramas", "Alejandro", "79944085", "104805544608", "personal"));
        customers.add(new Customer(2, "Gavidia", "Juan", "953218085", "10506555489", "empresarial"));
        customers.add(new Customer(3, "Vega", "Benito", "93158095", "10372154085", "personal"));
        customers.add(new Customer(4, "Tolentino", "Mariano", "78134085", "10552154048", "empresarial"));
        customers.add(new Customer(5, "Zavaleta", "Mario", "73217095", "10685215408", "personal"));
        customers.add(new Customer(6, "Vela", "Jasinto", "85244675", "10414515408", "empresarial"));
        return customers;
    }
}
