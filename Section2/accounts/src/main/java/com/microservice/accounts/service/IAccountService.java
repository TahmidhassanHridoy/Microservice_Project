package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     * @param customerDto
     */
    void createAccounts(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccounts(CustomerDto customerDto);

    boolean deleteAccounts(String mobileNumber);


}
