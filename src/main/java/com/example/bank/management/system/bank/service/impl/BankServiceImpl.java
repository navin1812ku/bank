package com.example.bank.management.system.bank.service.impl;

import com.example.bank.management.system.bank.exception.UserNotFoundException;
import com.example.bank.management.system.bank.model.*;
import com.example.bank.management.system.bank.repository.BankRepository;
import com.example.bank.management.system.bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;

@Service
public class BankServiceImpl implements BankService{
    @Autowired
    BankRepository bankRepository;

    @Override
    public Sbi_Bank profile_update(ProfileUpdation profileUpdation) {
        Sbi_Bank sbi_bank= bankRepository.findById(profileUpdation.getAccount_num()).
                orElseThrow(() -> new UserNotFoundException
                        (profileUpdation.getAccount_num().toString()));
        BigInteger phone_number=profileUpdation.getPh_no();
        String email=profileUpdation.getE_mail();
        sbi_bank.setPh_no(phone_number);
        sbi_bank.setE_mail(email);
        bankRepository.save(sbi_bank);
        return sbi_bank;
    }

    @Override
    public Sbi_Bank amount_deposit(Deposit deposit) {
        Sbi_Bank sbi_bank= bankRepository.findById(deposit.getAccount_num()).
                orElseThrow(() -> new UserNotFoundException
                        (deposit.getAccount_num().toString()));
                double update=sbi_bank.getAccount_bal()+deposit.getWith_deposit();
                sbi_bank.setAccount_bal(update);
                bankRepository.save(sbi_bank);
        return sbi_bank;
    }

    @Override
    public <T> Object amount_withdrawal(WithDrawal withDrawal) {
        double minimum=2000;
       Sbi_Bank sbi_bank= bankRepository.findById(withDrawal.getAccount_num()).
                orElseThrow(() -> new UserNotFoundException
                        (withDrawal.getAccount_num().toString()));
        double updated_bal = sbi_bank.getAccount_bal() - withDrawal.getWith_drawal();
        WithDrawalResponse withDrawalResponse;
                if(minimum < updated_bal) {
                    sbi_bank.setAccount_bal(updated_bal);
                    bankRepository.save(sbi_bank);
                    withDrawalResponse=new WithDrawalResponse("Amount successfully withdrawal",updated_bal);
                    return withDrawalResponse;
                }
                else {
                       // throw new InsufficientBalanceException(withDrawal.getAccount_num().toString());
                        WithDrawalFailureResponse withDrawalFailureResponse = new WithDrawalFailureResponse("Requseted amount is violted the minimum balance constraint", updated_bal, minimum, "Transcantion is cancelled");
                        return withDrawalFailureResponse;
                }
    }

    @Override
    public Sbi_Bank account_creation(Sbi_Bank sbi_bank) {
        return bankRepository.save(sbi_bank);
        //return sbi_bank;
    }

}
