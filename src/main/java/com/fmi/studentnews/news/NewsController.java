package com.fmi.studentnews.news;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @RequestMapping("/")
    public String index() {
        return "Welcome to Student News";
    }
}
