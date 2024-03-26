package com.example.bank.management.system.bank.service;

import com.example.bank.management.system.bank.model.*;

public interface BankService {
    Sbi_Bank profile_update(ProfileUpdation profileUpdation);
    Sbi_Bank amount_deposit(Deposit deposit);
    <T> Object amount_withdrawal(WithDrawal withDrawal);
    Sbi_Bank account_creation(Sbi_Bank sbi_bank);
}
