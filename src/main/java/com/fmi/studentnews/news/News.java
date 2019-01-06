package com.fmi.studentnews.news;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class News {
  @Id
  @GeneratedValue Long id;
  private String title;
  private String author;
  private String[] paragraphs;

  public News() {}

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

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String[] getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(String[] paragraphs) {
    this.paragraphs = paragraphs;
  }
}
