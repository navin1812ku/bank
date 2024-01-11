package com.example.bank.management.system.bank.model.Medicalpackage;

import lombok.Data;

@Data
public class Medicine_Side_Effect_Response {
    String medicine_side_effect;

    public Medicine_Side_Effect_Response(String medicine_side_effect) {
        this.medicine_side_effect = medicine_side_effect;
    }
}
