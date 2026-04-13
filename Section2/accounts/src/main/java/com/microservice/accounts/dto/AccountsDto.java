package com.microservice.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber Can not be null or Empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(
            description = "Account Number of Bank", example = "1659843347"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType Number Can not be null or Empty")
    @Schema(
            description = "Account type of Ban Account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BrunchAddress Number Can not be null or Empty")
    @Schema(
            description = "Bank Account Address "
    )
    private String brunchAddress;
}
