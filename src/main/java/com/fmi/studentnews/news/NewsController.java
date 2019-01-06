package com.fmi.studentnews.news;

import com.fmi.studentnews.news.exceptions.NewsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {

  private @Autowired NewsRepository newsRepository;

  @RequestMapping("/")
  public String index() {
    return "Welcome to Student News";
  }

  @GetMapping("/news")
  public List<News> getAllNews() {
    return this.newsRepository.findAll();
  }

  @GetMapping("/news/{id}")
  public News getNews(@PathVariable Long id) {
    return this.newsRepository.findById(id).orElseThrow(() -> new NewsNotFoundException(id));
  }

  @PostMapping("/news")
  public News addNews(@RequestBody News newNews) {
    return newsRepository.save(newNews);
  }
}
