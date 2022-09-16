package org.banking.repository;

import org.banking.models.BankAccount;
import org.banking.models.Client;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class BankRepository {

    public Map<String, Client> clients = new LinkedHashMap<>();
    public static Map<String, BankAccount> accounts = new LinkedHashMap<>();

}
