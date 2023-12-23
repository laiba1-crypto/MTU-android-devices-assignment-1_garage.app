package com.example.mygarageapp;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Intent intent = getIntent();
        RecyclerViewItemModel item = (RecyclerViewItemModel) intent.getSerializableExtra("item");

        // Find the WebView by its unique ID
        WebView webView = findViewById(R.id.webView);

        // loading https://www.geeksforgeeks.org url in the WebView.
        webView.loadUrl(item.getWebUrl());

        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());
    }
}