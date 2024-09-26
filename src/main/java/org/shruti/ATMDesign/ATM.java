package org.shruti.ATMDesign;

import lombok.Getter;
import lombok.Setter;
import org.shruti.ATMDesign.atmstates.ATMState;

@Getter
@Setter
public class ATM {
    private static ATM atmObject = new ATM();
    private ATMState currentATMState;
    private  int balance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    public ATM() {

    }

    public void deductBalance(int amount) {
        balance = balance - amount;
    }

    public void deduct2KNotes(int n) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - n;
    }

    public void deduct500Notes(int n) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - n;
    }

    public void deduct100Notes(int n) {
        noOfOneHundredNotes = noOfOneHundredNotes - n;
    }


}
