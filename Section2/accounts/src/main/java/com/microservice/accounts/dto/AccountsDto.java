package com.microservice.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "AccountNumber Can not be null or Empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "AccountType Number Can not be null or Empty")
    private String accountType;

    @NotEmpty(message = "BrunchAddress Number Can not be null or Empty")
    private String brunchAddress;
}
