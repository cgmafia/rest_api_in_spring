package com.sacsolutions.expensetrackerapi.repositories;

import com.sacsolutions.expensetrackerapi.domain.User;
import com.sacsolutions.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String pasword) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
