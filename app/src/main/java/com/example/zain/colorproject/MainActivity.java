package com.example.zain.colorproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout parentRelativeLayout;
    Button red, blue, green, yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parentRelativeLayout = findViewById(R.id.parentRelativeLayout);
        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        yellow = findViewById(R.id.yellow);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parentRelativeLayout.setBackgroundColor(Color.RED);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parentRelativeLayout.setBackgroundColor(Color.BLUE);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parentRelativeLayout.setBackgroundColor(Color.GREEN);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parentRelativeLayout.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}
