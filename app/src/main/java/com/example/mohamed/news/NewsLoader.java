package com.example.mohamed.news;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Mohamed on 1/27/2018.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private String mUrl;
    private static final String LOG_TAG = NewsLoader.class.getName();

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        Log.i(LOG_TAG, "calling : onStartLoading ");
    }

    @Override
    public List<News> loadInBackground() {
        Log.i(LOG_TAG, "calling : loadInBackground ");
        if (mUrl.length() < 1 || mUrl == null) {
            return null;
        }
        List<News> news = QueryUtils.fetchNewsData(mUrl);
        return news;
    }
}

