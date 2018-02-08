package com.example.mohamed.news;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mohamed on 1/27/2018.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private List<News> mNewsList;
    private OnItemClickListener mListener;
    private Context mContext;

    public NewsAdapter(List<News> newsList, OnItemClickListener listener) {
        mNewsList = newsList;
        mListener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(News news);
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View newsView = LayoutInflater.from(context).inflate(R.layout.news_list_item, parent, false);
        NewsViewHolder newsViewHolder = new NewsViewHolder(newsView);
        return newsViewHolder;
    }

    @Override
    public void onBindViewHolder(NewsAdapter.NewsViewHolder holder, int position) {
        News news = mNewsList.get(position);
        holder.mTitle.setText(news.getmTitle());
        holder.mType.setText(news.getmType());
        holder.mDate.setText(news.getmDate());
        holder.mSection.setText(news.getmSection());
        holder.author.setText(news.getAuthor());
        holder.bind(mNewsList.get(position), mListener);
    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.news_title)
        TextView mTitle;
        @BindView(R.id.news_type)
        TextView mType;
        @BindView(R.id.news_date)
        TextView mDate;
        @BindView(R.id.news_section)
        TextView mSection;
        @BindView(R.id.news_author)
        TextView author;

        public NewsViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }

        public void bind(final News news, final OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(news);
                }
            });
        }
    }

    public void clear() {
        mNewsList.clear();
        notifyDataSetChanged();
    }

    public void addAll(List<News> newsList) {
        mNewsList.addAll(newsList);
        notifyDataSetChanged();
    }
}
