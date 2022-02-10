package com.sacsolutions.expensetrackerapi.repositories;

import com.sacsolutions.expensetrackerapi.domain.Category;
import com.sacsolutions.expensetrackerapi.exceptions.EtBadRequestException;
import com.sacsolutions.expensetrackerapi.exceptions.EtResouceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResouceNotFoundException;


    Category findById(Integer userId, Integer categoryId) throws EtResouceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
