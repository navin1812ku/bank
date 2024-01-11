package com.example.bank.management.system.bank.model.Medicalpackage;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="medical_information")
@Data
public class Medicine_info
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long medicine_id;
	@Column(nullable = false)
    String medicine_name;
	@Column(nullable = false)
	Double medicine_price;
	@Column(nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.ANY,pattern = "dd-mm-yyyy")
	Date medicine_expire_date;
	@Column(nullable = false)
	Integer medicine_dosage;
	@Column(nullable = false)
	String medicine_manufacture_details;
	@Column(nullable = false)
	String medicine_benefits;
	@Column(nullable = false)
	String medicine_side_effect;
}
