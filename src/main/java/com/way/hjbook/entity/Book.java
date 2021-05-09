package com.way.hjbook.entity;

/**
 * 书
 */
public class Book {
    private Long id;

    private Long test;

    private String bookName;

    private String bookAuthor;

    private Integer chapterNum;

    private String bookType;

    private String bookWebsite;

    private String bookLikes;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTest() {
        return test;
    }

    public void setTest(Long test) {
        this.test = test;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public Integer getChapterNum() {
        return chapterNum;
    }

    public void setChapterNum(Integer chapterNum) {
        this.chapterNum = chapterNum;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType == null ? null : bookType.trim();
    }

    public String getBookWebsite() {
        return bookWebsite;
    }

    public void setBookWebsite(String bookWebsite) {
        this.bookWebsite = bookWebsite == null ? null : bookWebsite.trim();
    }

    public String getBookLikes() {
        return bookLikes;
    }

    public void setBookLikes(String bookLikes) {
        this.bookLikes = bookLikes == null ? null : bookLikes.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}