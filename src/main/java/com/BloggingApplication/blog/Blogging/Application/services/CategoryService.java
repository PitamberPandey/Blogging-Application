package com.BloggingApplication.blog.Blogging.Application.services;

import com.BloggingApplication.blog.Blogging.Application.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    //create
    public CategoryDto createCategory(CategoryDto categoryDto);


    //update
    public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);

    //detele
    public void deleteCategory(Integer categoryId);
    //get

    public CategoryDto getCategory(Integer categoryId);
    //get all
    List<CategoryDto>getCategories();


}

