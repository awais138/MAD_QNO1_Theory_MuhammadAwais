package com.example.muhammadawais18arid3024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    Button calage;
    EditText edittext, edittext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calage = findViewById(R.id.calage);
        edittext = findViewById(R.id.edittext);
        edittext2 = findViewById(R.id.edittext2);
        textView2 = findViewById(R.id.text2);
        String Date = edittext.getText().toString();

        calage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String data1 = getIntent().getExtras().getString("Day");
                String data2 = getIntent().getExtras().getString("Red");
                if (data2.equals("Red")) {
                    edittext2.setTextColor(Color.RED);
                    edittext2.setText("7464");
                } else if (data2.equals("Green")) {
                    edittext2.setTextColor(Color.GREEN);
                    edittext2.setText("179");
                } else if (data2.equals("Blue")) {
                    edittext2.setTextColor(Color.BLUE);
                    edittext2.setText("20");
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menuawais, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.settings) {
            startActivity(new Intent(MainActivity.this, Settings.class));
        }
        return super.onOptionsItemSelected(item);
    }
}