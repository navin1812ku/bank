package com.example.bank.management.system.bank.model;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class CurrencyRate
{
    private Motd motd;
    private boolean success;
    private String base;
    private Date date;
    private Map<String,Double> rates;
}
