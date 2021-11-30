package abstractClassSample.application;

import abstractClassSample.Entities.Account;
import abstractClassSample.Entities.BusinessAccount;
import abstractClassSample.Entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramAbstract {
    public static void main(String[] args){
//        Account acc1 = new Account(1001, "Alex", 1000.00);
//        Account acc2 = new SavingAccount(1002, "Robert", 1000.00, 0.01);
//        Account acc3 = new BusinessAccount(1003, "Ana", 1000.00, 500.00);

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();
        list.add(new SavingAccount(1001, "Alex", 500.00, 0.01));
        list.add(new SavingAccount(1002, "John", 1000.00, 400.00));
        list.add(new SavingAccount(1003, "Holy", 300.00, 0.01));
        list.add(new SavingAccount(1004, "David", 500.00, 500.00));

        double sum = 0.0;
        for(Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);
        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for(Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }


    }
}
