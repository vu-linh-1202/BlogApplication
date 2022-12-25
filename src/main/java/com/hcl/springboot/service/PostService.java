package com.hcl.springboot.service;

import com.hcl.springboot.entity.Post;
import com.hcl.springboot.payload.PostDto;
import com.hcl.springboot.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

}
