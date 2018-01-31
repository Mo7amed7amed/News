package com.example.mohamed.news;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mohamed on 1/27/2018.
 */

public class NewsAdapter extends ArrayAdapter {
    public NewsAdapter(Activity context, ArrayList<News> androidFlavors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);

        }
        News currentNews = (News) getItem(position);
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());
        TextView section = (TextView) listItemView.findViewById(R.id.section_name);
        section.setText(currentNews.getSection());
        TextView date = (TextView) listItemView.findViewById(R.id.date_pub);
        date.setText(currentNews.getDate());
        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentNews.getAuthor());
        return listItemView;
    }

}
