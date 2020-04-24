package com.andrian.topuniversityjabar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {

    private ImageView Img_DetailImage;
    private TextView Tv_detailName,Tv_detailDescription,Tv_detailPeringkat,Tv_detailKlaster;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Tv_detailName = findViewById(R.id.tv_detail_name);
        Tv_detailDescription = findViewById(R.id.tv_detail_description);
        Tv_detailPeringkat = findViewById(R.id.tv_detail_peringkat);
        Tv_detailKlaster = findViewById(R.id.tv_detail_klaster);
        Img_DetailImage = findViewById(R.id.img_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        int Image = intent.getIntExtra("image",0);
        String Nama = intent.getStringExtra("nama");
        String Details = intent.getStringExtra("details");
        String Peringkat = intent.getStringExtra("peringkat");
        String Klaster = intent.getStringExtra("klaster");

        Tv_detailName.setText(Nama);
        Glide.with(this).load(Image).into(Img_DetailImage);
        Tv_detailDescription.setText(Details);
        Tv_detailPeringkat.setText(Peringkat);
        Tv_detailKlaster.setText(Klaster);

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
