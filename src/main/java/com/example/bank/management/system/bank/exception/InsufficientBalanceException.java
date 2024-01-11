package com.example.bank.management.system.bank.exception;

public class InsufficientBalanceException extends RuntimeException{
    String acc_no;

    public InsufficientBalanceException(String str) {
        super(String.format("Account number ending xxxx%s not have minimum amount",str));
        this.acc_no = acc_no;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }
}
