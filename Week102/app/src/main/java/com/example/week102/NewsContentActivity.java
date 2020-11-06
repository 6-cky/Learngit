package com.example.week102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class NewsContentActivity extends AppCompatActivity {
    public static void actionStart(Context context,String newsTitle,String NewsContent) {
        Intent intent = new Intent(context, NewsContentFragment.class);
        intent.putExtra("news_title", newsTitle);








        intent.putExtra("news_content",newsContent)
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_content);

    }
}