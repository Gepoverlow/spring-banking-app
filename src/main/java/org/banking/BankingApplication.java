package org.banking;

import org.banking.config.AppConfig;
import org.banking.service.BankService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankingApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BankService bankService = applicationContext.getBean("bankService", BankService.class);

        bankService.receiveCustomer();


    }

}