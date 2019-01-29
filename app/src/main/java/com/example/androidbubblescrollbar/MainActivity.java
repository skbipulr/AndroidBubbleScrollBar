package com.example.androidbubblescrollbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.trendyol.bubblescrollbarlib.BubbleScrollBar;
import com.trendyol.bubblescrollbarlib.BubbleTextProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> listData = new ArrayList<>();

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    BubbleScrollBar scrollBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,layoutManager.getOrientation()));

        iniData();
        Collections.sort(listData);
        recyclerView.setAdapter(new MyAdapter(listData));

        scrollBar = findViewById(R.id.bublle_scroll);
        scrollBar.attachToRecyclerView(recyclerView);
        scrollBar.setBubbleTextProvider(new BubbleTextProvider() {
            @Override
            public String provideBubbleText(int i) {
                return new StringBuilder(listData.get(i).substring(0,1)).toString();
            }
        });
    }

    private void iniData() {
        listData.add("Bipul");
        listData.add("Antora");
        listData.add("Tumi");
        listData.add("Bangla");
        listData.add("Rubel");
        listData.add("Ripon");
        listData.add("Nayem");
        listData.add("Poritos");
        listData.add("Ruhul");
        listData.add("Romiz");
        listData.add("Noath");

        listData.add("Machidd");
        listData.add("Ethan");
        listData.add("Sophia");
        listData.add("Jacob");
        listData.add("Ava");
        listData.add("Michael");
        listData.add("Emily");
        listData.add("Ball");

        listData.add("Cachidd");
        listData.add("Wthan");
        listData.add("Pophia");
        listData.add("Oacob");
        listData.add("Ava");
        listData.add("Tichael");
        listData.add("Vily");
        listData.add("Saall");
    }
}
