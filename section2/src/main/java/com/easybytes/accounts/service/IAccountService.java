package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountService {
    void createAccount(CustomerDto customerDto);
}
