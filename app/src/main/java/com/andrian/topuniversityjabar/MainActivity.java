package com.andrian.topuniversityjabar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUniversity;
    private ArrayList<University> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUniversity = findViewById(R.id.rv_university);
        rvUniversity.setHasFixedSize(true);
        list.addAll(UniversityData.getListData());
        showRecyclerList();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
                Intent intent = new Intent(this, Profile.class);
                this.startActivity(intent);
            break;
        }
        return super.onOptionsItemSelected(item);

    }

    private void showRecyclerList() {
        rvUniversity.setLayoutManager(new LinearLayoutManager(this));
        ListUniversityAdapter cardViewHeroAdapter = new ListUniversityAdapter(list);
        rvUniversity.setAdapter(cardViewHeroAdapter);
    }
}
