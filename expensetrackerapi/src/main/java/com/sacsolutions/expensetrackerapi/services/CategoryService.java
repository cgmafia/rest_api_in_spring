package com.sacsolutions.expensetrackerapi.services;

import com.sacsolutions.expensetrackerapi.domain.Category;
import com.sacsolutions.expensetrackerapi.exceptions.EtAuthException;
import com.sacsolutions.expensetrackerapi.exceptions.EtBadRequestException;
import com.sacsolutions.expensetrackerapi.exceptions.EtResouceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResouceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResouceNotFoundException;
}
