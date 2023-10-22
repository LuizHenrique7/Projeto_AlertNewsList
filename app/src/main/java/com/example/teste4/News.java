package com.example.teste4;

public class News {
    private String textNews;
    private String fullTextNews;

    public News(String textNews, String fullTextNews) {
        this.textNews = textNews;
        this.fullTextNews = fullTextNews;
    }

    public String getText() {
        return textNews;
    }

    public String getFullText() {
        return fullTextNews;
    }
}
