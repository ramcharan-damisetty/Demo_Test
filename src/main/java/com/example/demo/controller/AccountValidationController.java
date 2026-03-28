package com.example.demo.controller;

import com.example.demo.dto.AccountRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class AccountValidationController {


//    If (accountNumber starts with 4212 and accountNumber length is 13 and branch code
//            starts with 345 and branch code length is 7
//            return “Valid account number”
//            else
//            return “Invalid account number”
    @PostMapping("/validate")
    public ResponseEntity<String> validateAccountNumber(
            @RequestBody AccountRequest accountRequest) {

        String accountNumber = accountRequest.getAccountNumber();
        String branchCode = accountRequest.getBranchCode();
        if(null != accountNumber
                && accountNumber.startsWith("4212")
                && accountNumber.length()== 13
                && null != branchCode
                && branchCode.startsWith("345")
                && branchCode.length() == 7) {

            return ResponseEntity.ok("Valid");
        }
        return   ResponseEntity.badRequest().body("In-Valid");
    }
}
