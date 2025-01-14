package com.BloggingApplication.blog.Blogging.Application.repositories;

import com.BloggingApplication.blog.Blogging.Application.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User,Integer> {

}
