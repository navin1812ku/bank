package com.example.bank.management.system.bank.model.Medicalpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Medicine_Expired {
    Long medicine_id;
    @JsonFormat(shape = JsonFormat.Shape.ANY,pattern = "dd-mm-yyyy")
    Date current_date;
}
