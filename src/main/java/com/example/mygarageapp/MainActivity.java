package com.example.mygarageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    RadioGroup radioGroup;

    String radioGroupOptionSelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button) findViewById(R.id.button);

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Find the radio button by the returned id
                RadioButton radioButton = findViewById(checkedId);

                // Get the text of the radio button
                radioGroupOptionSelected = radioButton.getText().toString();
            }
        });

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radioGroupOptionSelected.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "No Option Selected", Toast.LENGTH_SHORT).show();
                } else {

                    Intent myIntent = new Intent(MainActivity.this, GarageCategoryListViewPage.class);
                    myIntent.putExtra("optionSelected", radioGroupOptionSelected);
                    startActivity(myIntent);
                }//process
            }
        });
    }
}