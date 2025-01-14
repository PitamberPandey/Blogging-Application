package com.BloggingApplication.blog.Blogging.Application.services;

import com.BloggingApplication.blog.Blogging.Application.Entity.Post;
import com.BloggingApplication.blog.Blogging.Application.payloads.PostDto;
import com.BloggingApplication.blog.Blogging.Application.payloads.PostResponse;

import java.util.List;

public interface PostService {
    //create
PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);


//Update

    PostDto updatePost(PostDto postDto, Integer postId);


    //delete
    void deletePost(Integer postId);

    //getAllPost

    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy);

    //get Single Post
    PostDto getPostById(Integer PostId);

    //get all PostsBy category
    List<Post>getPostByCategory(Integer categoryId);

    //get all  post By User
    List<PostDto> getPostsByUser(Integer userId);

    List<PostDto> getPostsByCategory(Integer categoryId);

    List<PostDto> searchPosts(String Keyword);

    //getSearch POst



}
