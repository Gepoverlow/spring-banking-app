package org.banking.service;

import org.banking.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankService {

    BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {

        this.bankRepository = bankRepository;

    }

    public void receiveCustomer(){

        showWelcomeMessage();

    }

    private void showWelcomeMessage(){

        System.out.println("Welcome to our bank! Please select an option:");
        System.out.println("1. Im already a customer and want to manage my account");
        System.out.println("2. Im a new customer and want to register in this bank");

    }

}
