package com.example.zoomkart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity {
    private TextView tvBakery, tvVegetables, tvPersonal,tvOils,tvCoffee;
    CardView cdBakery;
    private ViewFlipper imgBanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        tvBakery=(TextView) findViewById(R.id.tvBakery);
        tvVegetables=(TextView) findViewById(R.id.tvVegetables);
        tvCoffee=(TextView) findViewById(R.id.tvCoffee);
        tvOils=(TextView) findViewById(R.id.tvOils);
        tvPersonal=(TextView) findViewById(R.id.tvPersonal);
        imgBanner=findViewById(R.id.imgBanner);
        cdBakery=(CardView)findViewById(R.id.cdBakery);
        cdBakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShopActivity.this,BakeryActivity.class));

            }
        });



        int sliders[]={
                R.drawable.banner1,
                R.drawable.banner2,
                R.drawable.banner3,
                R.drawable.banner4,
                R.drawable.banner5,
        };
        for( int slide:sliders){
            bannerFlipper(slide);
        }
    }
    public void bannerFlipper(int image){
        ImageView iv=new ImageView(this);
        iv.setImageResource(image);
        imgBanner.addView(iv);
        imgBanner.setFlipInterval(6000);
        imgBanner.setAutoStart(true);
        imgBanner.setInAnimation(this,android.R.anim.fade_in);
        imgBanner.setOutAnimation(this,android.R.anim.fade_out);
    }
}