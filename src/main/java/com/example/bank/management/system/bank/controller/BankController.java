package com.example.bank.management.system.bank.controller;

import com.example.bank.management.system.bank.model.*;
import com.example.bank.management.system.bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    BankService bankService;

    @Operation(summary = "Creating Bank Account",description = "Get an bank account",tags = "Post")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Created the account",
            content = {@Content(mediaType = "Application/json",schema = @Schema(implementation = BankService.class))}),
            @ApiResponse(responseCode = "400",description = "Account not created",
            content = @Content)})
    @PostMapping("/accountcreation")
    public ResponseEntity<Sbi_Bank> acc_creation(@RequestBody Sbi_Bank sbi_bank){
        return new ResponseEntity<Sbi_Bank>(bankService.account_creation(sbi_bank), HttpStatus.CREATED);
    }

    @PutMapping("/withdrawal")
    public ResponseEntity<Object> amt_withdrawal(@RequestBody WithDrawal withDrawal){
        return new ResponseEntity<Object> (bankService.amount_withdrawal(withDrawal), HttpStatus.ACCEPTED);
    }

    @PutMapping("/deposit")
    public ResponseEntity<Sbi_Bank> amt_deposit(@RequestBody Deposit deposit){
        return new ResponseEntity<Sbi_Bank>(bankService.amount_deposit(deposit),HttpStatus.PROCESSING);
    }

    @PutMapping("/profileupdate")
    public ResponseEntity<Sbi_Bank> profile_update(@RequestBody ProfileUpdation profileUpdation){
        return new ResponseEntity<Sbi_Bank>(bankService.profile_update(profileUpdation),HttpStatus.CREATED);
    }

}
