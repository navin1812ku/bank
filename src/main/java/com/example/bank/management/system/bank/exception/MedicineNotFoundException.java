package com.example.bank.management.system.bank.exception;

public class MedicineNotFoundException extends RuntimeException {
    String medicine_name;
    String medicine_id;

    public MedicineNotFoundException(String medicine_id) {
        super(String.format("The search of this medicine id not available"));
        this.medicine_id = medicine_id;
    }


    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(String medicine_id) {
        this.medicine_id = medicine_id;
    }
}