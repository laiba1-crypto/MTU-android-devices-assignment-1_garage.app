package com.example.mygarageapp;

import android.view.View;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.widget.*;

public class GarageCategoryListViewPage extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    FloatingActionButton fab;

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_category_list_view); // Make sure this points to the correct layout XML

        RecyclerView recyclerView = findViewById(R.id.rvCategoryList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent = getIntent();

        String radioGroupOptionSelected = intent.getStringExtra("optionSelected");

        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        switch (radioGroupOptionSelected) {
            case "Other":
                adapter = new MyRecyclerViewAdapter(this, ItemsCollection.otherItems);
                break;
            case "Cars":
                adapter = new MyRecyclerViewAdapter(this, ItemsCollection.carItems);
                break;
            case "Bikes":
                adapter = new MyRecyclerViewAdapter(this, ItemsCollection.bikeItems);
                break;
            default:
                break;
        }

        adapter.setClickListener(this);

        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent myIntent = new Intent(this, GarageItemDetailPage.class);
        myIntent.putExtra("item", adapter.getItemByPosition(position));
        startActivity(myIntent);
    }
}

