package com.derezhenko.dto;

import com.derezhenko.model.User;

public class PostDto {
    public User author;

    public PostDto(User author) {
        this.author = author;
    }
}
