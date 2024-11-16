package com.example.domashnee_zadanie_5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.domashnee_zadanie_5.Models.Article;

public class ArticleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        // Get the article passed via intent
        Article article = (Article) getIntent().getSerializableExtra("ARTICLE");

        // Set the title and content
        TextView titleView = findViewById(R.id.textViewTitle);
        TextView contentView = findViewById(R.id.textViewContent);

        if (article != null) {
            titleView.setText(article.getTitle());
            contentView.setText(article.getContent());
        }

        findViewById(R.id.backButton).setOnClickListener(view -> finish());
    }
}