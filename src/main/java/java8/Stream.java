package java8;

import java.util.List;

public class Stream {

    /**
     *
     */
    public void nestedForeach() {

    }

    private class Transaction {
        private Integer transactionId;
        private String transactionAmount;
        private String accountNumber;
    }

    private class Bill {
        private Integer billId;
        private String billerType;
        private String amount;
        private String transactionId;
    }

    private void matching(List<Transaction> transactions, List<Bill> bills) {
        for (Transaction trans : transactions) {
            for (Bill bill : bills) {

            }
        }

    }

    public static void main(String[] args) {

    }
}
