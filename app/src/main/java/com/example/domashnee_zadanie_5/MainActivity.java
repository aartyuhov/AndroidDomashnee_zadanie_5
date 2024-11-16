package com.example.domashnee_zadanie_5;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.domashnee_zadanie_5.Models.Article;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Article article1 = new Article("Article 1", "This is the full content of Article 1.");
        Article article2 = new Article("Article 2", "This is the full content of Article 2.");
        Article article3 = new Article("Article 3", "This is the full content of Article 3.");

        findViewById(R.id.buttonArticle1).setOnClickListener(v -> openDetailActivity(article1));
        findViewById(R.id.buttonArticle2).setOnClickListener(v -> openDetailActivity(article2));
        findViewById(R.id.buttonArticle3).setOnClickListener(v -> openDetailActivity(article3));
    }

    private void openDetailActivity(Article article) {
        Intent intent = new Intent(this, ArticleDetailActivity.class);
        intent.putExtra("ARTICLE", article);
        startActivity(intent);
    }


}