package com.example.bank.management.system.bank.model;

import lombok.Data;

@Data
public class WithDrawalResponse {
    String success_message;
    Double updated_balance;

    public WithDrawalResponse(String success_message, Double updated_balance) {
        this.success_message = success_message;
        this.updated_balance = updated_balance;
    }
}
