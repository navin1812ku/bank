package com.example.bank.management.system.bank.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name="Sbi_Bank")
@Data
public class Sbi_Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long account_number;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String aadhar_number;
    @Column(nullable = false)
    String gender;
    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "dd-MM-yyyy")
    Date date_of_birth;
    @Column(nullable = false)
    String address;
    @Column(nullable = false)
    String acc_type;
    @Column(nullable = false)
    Double account_bal;
    @Column(nullable = false)
    BigInteger ph_no;
    @Column(nullable = false)
    String e_mail;
    @Column(nullable = true)
    Boolean success;
}
