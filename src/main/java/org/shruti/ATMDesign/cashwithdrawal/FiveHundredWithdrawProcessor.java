package org.shruti.ATMDesign.cashwithdrawal;


import org.shruti.ATMDesign.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor{

    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextprocessor) {
        super(nextprocessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/500;
        int balance = remainingAmount%500;

        if(required <= atm.getNoOfFiveHundredNotes()) {
            atm.deduct500Notes(required);
        }
        else {
            balance = balance + 500 * (required - atm.getNoOfFiveHundredNotes());
            atm.deduct500Notes(atm.getNoOfFiveHundredNotes());

        }
        if(balance!=0) {
            super.withdraw(atm, balance);
        }
    }
}
