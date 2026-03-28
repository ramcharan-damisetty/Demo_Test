package com.example.demo.dto;

public class AccountRequest {

    private  String accountNumber;
    private String branchCode;
    private String bankName;

    public AccountRequest() {
    }

    public AccountRequest(String accountNumber, String branchCode, String bankName) {
        this.accountNumber = accountNumber;
        this.branchCode = branchCode;
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
