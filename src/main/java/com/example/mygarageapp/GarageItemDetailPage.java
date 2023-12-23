package com.example.mygarageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import android.content.Intent;

import android.widget.*;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import android.view.View;

public class GarageItemDetailPage extends AppCompatActivity {

    ImageView imageView;

    TextView title;

    FloatingActionButton adButton, backButton, homeButton;

    RecyclerViewItemModel item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_item_detail_view);

        Intent intent = getIntent();
        item = (RecyclerViewItemModel) intent.getSerializableExtra("item");

        imageView = findViewById(R.id.imageView);

        title = findViewById(R.id.title);

        adButton = findViewById(R.id.btnAdd);

        backButton = findViewById(R.id.btnBack);

        homeButton = findViewById(R.id.btnHome);

        title.setText(item.getTitle());

        Glide.with(getApplicationContext())
                .load(item.getImage())
                .placeholder(R.drawable.app_icon_your_company)
                .into(imageView);

        adButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Webview.class);
                myIntent.putExtra("item", item);
                startActivity(myIntent);

//                Toast.makeText(getApplicationContext(), "Ad button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
}