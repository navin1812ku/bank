package com.example.bank.management.system.bank.model.Medicalpackage;


import lombok.Data;

@Data
public class Medicine_Expire_date_Response {
    String successor_message;

    public Medicine_Expire_date_Response(String successor_message) {
        this.successor_message = successor_message;
    }
}
