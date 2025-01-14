package com.BloggingApplication.blog.Blogging.Application.repositories;

import com.BloggingApplication.blog.Blogging.Application.Entity.Category;
import com.BloggingApplication.blog.Blogging.Application.Entity.Post;
import com.BloggingApplication.blog.Blogging.Application.Entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface PostRepo  extends JpaRepository<Post,Integer> {
    List<Post> findAByUser(User user);
    List<Post> findByCategory(Category category);
    List<Post>findByTitleContaining(String title);


}
