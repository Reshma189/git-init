package com.example.zoomkart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BakeryActivity extends AppCompatActivity {
    TextView tvwel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakery);
        tvwel=findViewById(R.id.tvwel);
    }
}