package com.imc.virtual;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
