package org.shruti.ATMDesign.cashwithdrawal;


import org.shruti.ATMDesign.ATM;

public abstract class CashWithdrawProcessor {

    CashWithdrawProcessor nextprocessor;

    public CashWithdrawProcessor(CashWithdrawProcessor nextprocessor) {
        this.nextprocessor = nextprocessor;
    }

    public void withdraw(ATM atm, int remainingAmount) {
        if(nextprocessor!=null) {
            nextprocessor.withdraw(atm, remainingAmount);
        }
    }
}
