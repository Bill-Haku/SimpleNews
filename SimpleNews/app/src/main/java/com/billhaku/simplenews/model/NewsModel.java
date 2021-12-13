package com.billhaku.simplenews.model;

import java.util.List;

public class NewsModel {
    int code;
    String msg;
    List<NewsList> newslist;

    public class NewsList {
        String mtime;
        String title;
        String digest;
        String imgsrc;
        String url;
        String source;

        public String getTitle() {
            return title;
        }

        public String getMtime() { return mtime; }

        public String getDigest() { return digest; }

        public String getImgsrc() { return imgsrc; }

        public String getUrl() { return url; }

        public String getSource() { return source; }

        public void setMtime(String mtime) { this.mtime = mtime; }

        public void setTitle(String title) { this.title = title; }

        public void setDigest(String digest) { this.digest = digest; }

        public void setImgsrc(String imgsrc) { this.imgsrc = imgsrc; }

        public void setUrl(String url) { this.url = url; }

        public void setSource(String source) { this.source = source; }

    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public List<NewsList> getNewsList() {
        return newslist;
    }

    public void setCode(int code) { this.code = code; }

    public void setMsg(String msg) { this.msg = msg; }

//    public void setNewslist(NewsList newslist[]) { this.NewsList = newslist;}
}
