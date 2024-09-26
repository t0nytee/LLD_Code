package org.shruti.ATMDesign.atmstates;


import org.shruti.ATMDesign.ATM;
import org.shruti.ATMDesign.Card;

public class CheckBalanceState extends ATMState{

    public CheckBalanceState(){

    }

    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Balance is : " + card.getBankAccount().getBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
    }

    @Override
    public void returnCard() {
        System.out.println("Collect your card");
    }
}
