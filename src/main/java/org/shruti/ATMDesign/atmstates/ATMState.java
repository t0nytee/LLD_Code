package org.shruti.ATMDesign.atmstates;


import org.shruti.ATMDesign.ATM;
import org.shruti.ATMDesign.Card;
import org.shruti.ATMDesign.TransactionType;

public abstract class ATMState {

    // Define state operations
    public void insertCard(ATM atm, Card card) {
        System.out.println("oops! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        System.out.println("oops! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("oops! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int amount) {
        System.out.println("oops! Something went wrong");
    }

    public void displayBalance(ATM atm, Card cardt) {
        System.out.println("oops! Something went wrong");
    }

    public void returnCard() {
        System.out.println("oops! Something went wrong");
    }
    public void exit(ATM atm) {
        System.out.println("oops! Something went wrong");
    }

}
