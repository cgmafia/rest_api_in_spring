package com.sacsolutions.expensetrackerapi.services;

import com.sacsolutions.expensetrackerapi.domain.User;
import com.sacsolutions.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
