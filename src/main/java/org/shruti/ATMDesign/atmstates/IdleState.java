package org.shruti.ATMDesign.atmstates;


import org.shruti.ATMDesign.ATM;
import org.shruti.ATMDesign.Card;

public class IdleState extends ATMState{

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted!");
        atm.setCurrentATMState(new CardInsertedState());
    }
}
