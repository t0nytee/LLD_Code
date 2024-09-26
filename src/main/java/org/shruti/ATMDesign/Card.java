package org.shruti.ATMDesign;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {
    private String cardNumber;
    private int cvv;
    private String expiryDate;

    private String holderName;
    private int pin = 12345;

    private BankAccount bankAccount;

    public boolean isCorrectPin(int x) {
        return x== pin;
    }

}
