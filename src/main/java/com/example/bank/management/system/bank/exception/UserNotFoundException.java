package com.example.bank.management.system.bank.exception;

public class UserNotFoundException extends RuntimeException{
    String name;
    String acc_no;

    public UserNotFoundException(String acc_no) {
        super(String.format("search the user with account_no ending xxxx%s is not found",acc_no));
        this.name = name;
        this.acc_no = acc_no;
    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }
}
