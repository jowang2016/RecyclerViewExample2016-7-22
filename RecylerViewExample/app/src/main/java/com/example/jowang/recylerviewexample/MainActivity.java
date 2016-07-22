package com.example.jowang.recylerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerView=new RecyclerView(this);

        setContentView(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter();
        recyclerView.setAdapter(adapter);
    }
}
