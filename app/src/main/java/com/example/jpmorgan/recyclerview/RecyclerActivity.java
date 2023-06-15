package com.example.jpmorgan.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.jpmorgan.R;

public class RecyclerActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    String[] languages = {"english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",
            "english","urdu","kannada","hindi","arabic",};
    RecyclerView countRecyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        countRecyView = findViewById(R.id.countrieslistview);
    }

    @Override
    protected void onStart() {
        super.onStart();

        LangAdapter langAdapter = new LangAdapter(languages);
        countRecyView.setLayoutManager(new LinearLayoutManager(this));
        countRecyView.setAdapter(langAdapter);

       // countListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "item clicked", Toast.LENGTH_SHORT).show();

    }
}