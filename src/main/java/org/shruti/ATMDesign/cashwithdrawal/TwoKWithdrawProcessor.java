package org.shruti.ATMDesign.cashwithdrawal;


import org.shruti.ATMDesign.ATM;

public class TwoKWithdrawProcessor extends CashWithdrawProcessor{

    public TwoKWithdrawProcessor(CashWithdrawProcessor nextprocessor) {
        super(nextprocessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/2000;
        int balance = remainingAmount%2000;

        if(required <= atm.getNoOfTwoThousandNotes()) {
            atm.deduct2KNotes(required);
        }
        else {
            balance = balance + 2000 * (required - atm.getNoOfTwoThousandNotes());
            atm.deduct2KNotes(atm.getNoOfTwoThousandNotes());

        }
        if(balance!=0) {
            super.withdraw(atm, balance);
        }
    }
}
