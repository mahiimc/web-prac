package com.imc.virtual.client;


import com.imc.virtual.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        url = "https://jsonplaceholder.typicode.com",
        name = "comments-client"
)
public interface CommentsClient {
    @GetMapping("/comments/")
    List<Comment> loadComments();
}




