package org.shruti.ATMDesign.cashwithdrawal;


import org.shruti.ATMDesign.ATM;

import static java.lang.System.exit;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{

    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextprocessor) {
        super(nextprocessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/500;
        int balance = remainingAmount%500;

        if(required <= atm.getNoOfOneHundredNotes()) {
            atm.deduct100Notes(required);
        }
        else {
            balance = balance + 500 * (required - atm.getNoOfOneHundredNotes());
            atm.deduct100Notes(atm.getNoOfOneHundredNotes());

        }
        if(balance!=0) {
            System.out.println("Something went wrong");
        }
    }
}
