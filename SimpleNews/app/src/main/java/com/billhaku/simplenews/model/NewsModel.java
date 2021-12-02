package com.billhaku.simplenews.model;

public class NewsModel {
    int code;
    String msg;
    NewsList newslist[];

    class NewsList {
        String mtime;
        String title;
        String digest;
        String imgsrc;
        String url;
        String source;
    }
}
