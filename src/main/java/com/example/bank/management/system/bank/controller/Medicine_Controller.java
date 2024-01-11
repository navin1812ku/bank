package com.example.bank.management.system.bank.controller;


import com.example.bank.management.system.bank.model.Medicalpackage.*;
import com.example.bank.management.system.bank.service.impl.Medicine_Service_impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Medicine_Controller {
    @Autowired
    Medicine_Service_impl medicine_serviceImpl;
    @PostMapping("/medicine_details")
    public ResponseEntity<Medicine_info> medicine_details(@RequestBody Medicine_info medicine_info){
        return new ResponseEntity<Medicine_info>(medicine_serviceImpl.medicine_details(medicine_info), HttpStatus.CREATED);
    }

    @GetMapping("/medicine_dosage")
    public ResponseEntity<Medicine_Dosage_Response> medicine_dosage(@RequestBody Medicine_Dosage medicine_dosage){
        return new ResponseEntity<Medicine_Dosage_Response>(medicine_serviceImpl.check_dosage(medicine_dosage),HttpStatus.FOUND);
    }

    @GetMapping("/medicine_expire_date")
    public ResponseEntity<Medicine_Expire_date_Response> medicine_expire_date(@RequestBody Medicine_Expired medicine_expired){
        return new ResponseEntity<Medicine_Expire_date_Response>(medicine_serviceImpl.is_expired(medicine_expired),HttpStatus.ACCEPTED);
    }

    @GetMapping("/medicine_manufacture_details")
    public ResponseEntity<Medicine_Manufacture_Details_Response> medicine_manufacture_details(@RequestBody Medicine_Manufacture_Details medicine_manufacture_details){
        return new ResponseEntity<Medicine_Manufacture_Details_Response>(medicine_serviceImpl.manufacture_details(medicine_manufacture_details),HttpStatus.MULTI_STATUS);
    }

    @GetMapping("/medicine_benefits")
    public ResponseEntity<String> medicine_benefits(@RequestBody Medicine_Benefits benefits){
        return new ResponseEntity<String>(medicine_serviceImpl.medicine_benefits(benefits),HttpStatus.ACCEPTED);
    }

    @GetMapping("/medicine_side_effect")
    public ResponseEntity<Medicine_Side_Effect_Response> medicine_side_effect(@RequestBody Medicine_Side_Effect medicine_side_effect){
        return new ResponseEntity<Medicine_Side_Effect_Response>(medicine_serviceImpl.medicine_side_effect(medicine_side_effect),HttpStatus.FOUND);
    }
}
