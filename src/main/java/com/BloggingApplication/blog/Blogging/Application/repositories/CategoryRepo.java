package com.BloggingApplication.blog.Blogging.Application.repositories;

import com.BloggingApplication.blog.Blogging.Application.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
