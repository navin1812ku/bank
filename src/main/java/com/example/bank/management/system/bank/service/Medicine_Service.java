package com.example.bank.management.system.bank.service;

import com.example.bank.management.system.bank.model.Medicalpackage.*;

public interface Medicine_Service {
    Medicine_info medicine_details(Medicine_info medicine_info);
    Medicine_Expire_date_Response is_expired(Medicine_Expired medicine_expired);
    Medicine_Dosage_Response check_dosage(Medicine_Dosage medicine_dosage);
    Medicine_Manufacture_Details_Response manufacture_details(Medicine_Manufacture_Details medicine_manufacture_details);
    String medicine_benefits(Medicine_Benefits benefits);
    Medicine_Side_Effect_Response medicine_side_effect(Medicine_Side_Effect medicine_side_effect);
}
