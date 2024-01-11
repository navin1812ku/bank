package com.example.bank.management.system.bank.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class ProfileUpdation
{
    Long account_num;
    BigInteger ph_no;
    String e_mail;
}
