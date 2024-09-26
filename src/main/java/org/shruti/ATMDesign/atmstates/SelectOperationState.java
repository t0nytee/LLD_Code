package org.shruti.ATMDesign.atmstates;


import org.shruti.ATMDesign.ATM;
import org.shruti.ATMDesign.Card;
import org.shruti.ATMDesign.TransactionType;

import static org.shruti.ATMDesign.TransactionType.BALANCE_CHECK;
import static org.shruti.ATMDesign.TransactionType.CASH_WITHDRAW;

public class SelectOperationState extends ATMState{

    public SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        switch (transactionType) {
            case BALANCE_CHECK :
                atm.setCurrentATMState(new CheckBalanceState());
            case CASH_WITHDRAW:
                atm.setCurrentATMState(new CashWithdrawalState());
            default: {
                System.out.println("Invalid option");
                exit(atm);
            }

        }
    }

    public void showOperations() {
        TransactionType.showALlTransactionTypes();
    }


}
