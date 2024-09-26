package org.shruti.ATMDesign.atmstates;


import org.shruti.ATMDesign.ATM;
import org.shruti.ATMDesign.Card;
import org.shruti.ATMDesign.cashwithdrawal.CashWithdrawProcessor;
import org.shruti.ATMDesign.cashwithdrawal.FiveHundredWithdrawProcessor;
import org.shruti.ATMDesign.cashwithdrawal.OneHundredWithdrawProcessor;
import org.shruti.ATMDesign.cashwithdrawal.TwoKWithdrawProcessor;

public class CashWithdrawalState extends ATMState{
    public CashWithdrawalState() {
        System.out.println("Please Enter withdrawal amount : ");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int amount) {
        if(atm.getBalance()< amount) {
            System.out.println("Insufficient fund in ATM");
            exit(atm);
        } else if(card.getBankAccount().getBalance() < amount) {
            System.out.println("Insufficient fund in your account");
            exit(atm);
        } else {
            atm.deductBalance(amount);
            card.getBankAccount().withdrawBalance(amount);

            CashWithdrawProcessor withdrawProcessor =
                    new TwoKWithdrawProcessor(
                            new FiveHundredWithdrawProcessor(
                                    new OneHundredWithdrawProcessor( null)
                            ));

            withdrawProcessor.withdraw(atm, amount);
            exit(atm);

        }

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
