package com.example.bank.management.system.bank.service.impl;


import com.example.bank.management.system.bank.exception.MedicineNotFoundException;
import com.example.bank.management.system.bank.model.Medicalpackage.*;
import com.example.bank.management.system.bank.repository.Medicine_Repository;
import com.example.bank.management.system.bank.service.Medicine_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Medicine_Service_impl implements Medicine_Service {
    @Autowired
    Medicine_Repository medicine_repository;


    @Override
    public Medicine_info medicine_details(Medicine_info medicine_info) {
        return medicine_repository.save(medicine_info);
    }

    @Override
    public Medicine_Expire_date_Response is_expired(Medicine_Expired medicine_expired) {
        Medicine_info medicine_info=medicine_repository.findById(medicine_expired.getMedicine_id()).
                orElseThrow(() -> new MedicineNotFoundException(medicine_expired.getMedicine_id().toString()));
        Medicine_Expire_date_Response medicine_expire_date_response = null;
        String isExpired=null;
        if(medicine_expired.getCurrent_date().before(medicine_info.getMedicine_expire_date()))
        {
            isExpired="Medicine is not expired,it can be used";
            medicine_expire_date_response=new Medicine_Expire_date_Response(isExpired);
        }
        else {
            isExpired="Medicine is  expired,it cannot be used";
            medicine_expire_date_response=new Medicine_Expire_date_Response(isExpired);
        }
        return medicine_expire_date_response;
    }

    @Override
    public Medicine_Dosage_Response check_dosage(Medicine_Dosage medicine_dosage) {
        Medicine_info medicine_info=medicine_repository.findById(medicine_dosage.getMedicine_id()).
                orElseThrow(() -> new MedicineNotFoundException(medicine_dosage.getMedicine_id().toString()));
        Medicine_Dosage_Response medicine_dosage_response;
        medicine_dosage_response=new Medicine_Dosage_Response(medicine_info.getMedicine_dosage());
        return medicine_dosage_response;
    }

    @Override
    public Medicine_Manufacture_Details_Response manufacture_details(Medicine_Manufacture_Details medicine_manufacture_details) {
        Medicine_info medicine_info=medicine_repository.findById(medicine_manufacture_details.getMedicine_id()).
                orElseThrow(() -> new MedicineNotFoundException(medicine_manufacture_details.getMedicine_id().toString()));
        Medicine_Manufacture_Details_Response medicine_manufacture_details_response;
        medicine_manufacture_details_response=new Medicine_Manufacture_Details_Response(medicine_info.getMedicine_manufacture_details());
        return medicine_manufacture_details_response;
    }

    @Override
    public String medicine_benefits(Medicine_Benefits benefits) {
        Medicine_info medicine_info=medicine_repository.findById(benefits.getMedicine_id()).
                orElseThrow(() -> new MedicineNotFoundException(benefits.getMedicine_id().toString()));
        String medicinebenefits=null;
       // Medicine_Benefits_Response medicine_benefits_response;
       // medicine_benefits_response=new Medicine_Benefits_Response(medicine_info.getMedicine_benefits());
        medicinebenefits=medicine_info.getMedicine_benefits();
        return medicinebenefits;
    }

    @Override
    public Medicine_Side_Effect_Response medicine_side_effect(Medicine_Side_Effect medicine_side_effect) {
        Medicine_info medicine_info=medicine_repository.findById(medicine_side_effect.getMedicine_id()).
                orElseThrow(() -> new MedicineNotFoundException(medicine_side_effect.getMedicine_id().toString()));
        Medicine_Side_Effect_Response medicine_side_effect_response;
        medicine_side_effect_response=new Medicine_Side_Effect_Response(medicine_info.getMedicine_side_effect());
        return medicine_side_effect_response;
    }
}
