package com.example.mohamed.news;

/**
 * Created by Mohamed on 1/27/2018.
 */

public class News {
    private String mTitle;
    private String mDate;
    private String mSection;
    private String mUrl;
    private String mAuthor;

    public News(String title, String author, String date, String section, String url) {
        this.mTitle = title;
        this.mAuthor = author;
        this.mDate = date;
        this.mSection = section;
        this.mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {return mAuthor;}

    public String getDate() {
        return mDate;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }

}
