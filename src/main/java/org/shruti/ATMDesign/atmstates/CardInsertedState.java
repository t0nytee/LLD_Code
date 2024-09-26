package org.shruti.ATMDesign.atmstates;


import org.shruti.ATMDesign.ATM;
import org.shruti.ATMDesign.Card;

public class CardInsertedState extends ATMState{

        public CardInsertedState() {
            System.out.println("Enter your pin : ");
        }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {
        boolean isCorrectPin = card.isCorrectPin(pin);
        if(isCorrectPin) {
            atm.setCurrentATMState(new SelectOperationState());
        } else {
            System.out.println("Incorrect Pin");
            exit(atm);
        }
    }
}
