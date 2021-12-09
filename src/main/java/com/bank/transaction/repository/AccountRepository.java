package com.bank.transaction.repository;

import com.bank.transaction.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByAccountNumber(String accountNumber);

    Account findByOwnerName(String ownerName);
}
