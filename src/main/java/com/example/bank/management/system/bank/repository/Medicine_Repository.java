package com.example.bank.management.system.bank.repository;


import com.example.bank.management.system.bank.model.Medicalpackage.Medicine_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Medicine_Repository extends JpaRepository<Medicine_info,Long> {
}
