package com.derezhenko.model;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String text;
    private String date;
    @ManyToOne()
    @JoinColumn(name = "author_id")
    private User author;
    @ManyToOne()
    @JoinColumn(name = "post_id")
    private Post post;

//    TODO: joinTable


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
