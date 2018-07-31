package com.digitalhouse.gsonexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsResponse {

    @SerializedName("noticias")
    private List<News> news;

    public NewsResponse() {

    }

    public NewsResponse(List<News> news) {
        this.news = news;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
