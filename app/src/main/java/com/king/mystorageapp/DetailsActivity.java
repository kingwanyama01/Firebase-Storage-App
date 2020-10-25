package com.king.mystorageapp;

import android.os.Bundle;

import com.bumptech.glide.Glide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView mImgDetail;
    TextView mTvDetail;
    String ImgUrl,Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mImgDetail = findViewById(R.id.imgDetail);
        mTvDetail = findViewById(R.id.tvDetail);
        ImgUrl = getIntent().getStringExtra("url");
        Txt = getIntent().getStringExtra("txt");
        Glide.with(this).load(ImgUrl).into(mImgDetail);
        mTvDetail.setText(Txt);
    }

}
