package com.derezhenko.model;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
//    private String text;
    @Column
    private String date;
    @ManyToOne()
    @JoinColumn(name = "author_id")
    private User author;

//    TODO: OneToMany post-comments


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public String getText() {
//        return text;
//    }

//    public void setText(String text) {
//        this.text = text;
//    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
