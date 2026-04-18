package com.example.demo.implementation;

import com.example.demo.service.AccountValidationService;
import org.springframework.stereotype.Service;

@Service
public class AccountValidationServiceImpl implements AccountValidationService {
    @Override
    public boolean validate(String accountNumber, String branchCode) {
        return accountNumber != null
                && accountNumber.startsWith("4212")
                && accountNumber.length() == 13
                && branchCode != null
                && branchCode.startsWith("345")
                && branchCode.length() == 7;
    }
}
