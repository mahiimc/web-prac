package com.imc.virtual;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    private int id;
    @Column(name = "post_id")
    private int postId;
    private String name;
    private String email;

    @Lob
    @Column
    private String body;
}
