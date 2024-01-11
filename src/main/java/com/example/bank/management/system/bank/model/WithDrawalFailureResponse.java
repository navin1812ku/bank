package com.example.bank.management.system.bank.model;

import lombok.Data;

@Data
public class WithDrawalFailureResponse {
    String failure_message;
    Double current_account_balance;
    Double minimum_balance;
    String failure_statement;
    public WithDrawalFailureResponse(String failure_message, Double current_account_balance,Double minimum,String failure) {
        this.failure_message = failure_message;
        this.current_account_balance = current_account_balance;
        this.minimum_balance=minimum;
        this.failure_statement=failure;
    }


}
