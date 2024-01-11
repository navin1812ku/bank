package com.example.bank.management.system.bank.model.Medicalpackage;


import lombok.Data;

@Data
public class Medicine_Manufacture_Details_Response {
    String medicine_manufacture_details;

    public Medicine_Manufacture_Details_Response(String medicine_manufacture_details) {
        this.medicine_manufacture_details = medicine_manufacture_details;
    }
}
