package com.bank.transaction.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

@Data
public class TransactionDTO {
    @NotBlank
    private String accountNumber;

    @Range(min = 1)
    private double amount;

    private String description;
}
