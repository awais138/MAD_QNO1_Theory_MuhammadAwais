package com.example.muhammadawais18arid3024;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    Button button;
    private Spinner spinner1, spinner2;
    private static final String[] paths1 = {"Day", "Month", "Year"};
    private static final String[] paths2 = {"Red", "Blue", "Green"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        button = findViewById(R.id.savebtn);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter adapter1 = new ArrayAdapter<String>(Settings.this, android.R.layout.simple_spinner_item, paths1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter adapter2 = new ArrayAdapter<String>(Settings.this, android.R.layout.simple_spinner_item, paths2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);


        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View view) {

                String state1 = spinner1.getSelectedItem().toString();
                String state2 = spinner2.getSelectedItem().toString();

                Intent intent1 = new Intent(Settings.this, MainActivity.class);
                intent1.putExtra("Day",state1);

                intent1.putExtra("Red",state2);
                startActivity(intent1);
            }
        });


    }
}