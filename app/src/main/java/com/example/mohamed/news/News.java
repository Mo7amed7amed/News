package com.example.mohamed.news;

/**
 * Created by Mohamed on 1/27/2018.
 */
public class News {
    private String mTitle;
    private String mType;
    private String mDate;
    private String mSection;
    private String mUrl;
    private String author;



    public News(String mTitle, String mType, String mDate, String mSection, String mUrl, String author) {
        this.mTitle = mTitle;
        this.mType = mType;
        this.mDate = mDate;
        this.mSection = mSection;
        this.mUrl = mUrl;
        this.author=author;

    }

    public String getmTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return author;
    }
    public String getmType() {
        return mType;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmUrl() {

        return mUrl;
    }
}
