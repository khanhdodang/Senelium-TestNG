package TestData;

import Objects.Account;

public class Data {
    public static Account standardUser() {
        Account account = new Account();
        account.setUsername("tomsmith");
        account.setPassword("SuperSecretPassword!");
        return account;
    }
}
