package org.shruti.ATMDesign;

public enum TransactionType {
    CASH_WITHDRAW,
    BALANCE_CHECK;

    public static void showALlTransactionTypes() {
        for(TransactionType type : TransactionType.values()) {
            System.out.println(type.name());
        }
    }
}
