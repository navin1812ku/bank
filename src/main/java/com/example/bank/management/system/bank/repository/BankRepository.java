package com.example.bank.management.system.bank.repository;

import com.example.bank.management.system.bank.model.Sbi_Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Sbi_Bank, Long> {
}
