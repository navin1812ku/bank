package com.example.bank.management.system.bank.model.Medicalpackage;


import lombok.Data;

@Data
public class Medicine_Dosage_Response {
    Integer medicine_dosage;

    public Medicine_Dosage_Response(Integer medicine_dosage) {
        this.medicine_dosage = medicine_dosage;
    }
}
