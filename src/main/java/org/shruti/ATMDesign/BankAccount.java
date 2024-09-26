package org.shruti.ATMDesign;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {
    private String accountNo;
    private int balance;

    public void withdrawBalance(int amount) {
        balance = balance - amount;
    }


}
