package com.sacsolutions.expensetrackerapi.services;

import com.sacsolutions.expensetrackerapi.domain.Transaction;
import com.sacsolutions.expensetrackerapi.exceptions.EtBadRequestException;
import com.sacsolutions.expensetrackerapi.exceptions.EtResouceNotFoundException;

import java.util.List;

public interface TransactionService {

    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResouceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws  EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResouceNotFoundException;
}
