package com.example.jpmorgan.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jpmorgan.R;

import java.sql.Array;

public class RecyclerActivity extends AppCompatActivity {
    String[] languages = {"english","urdu","kannada","hindi","arabic"};
    ListView countListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        countListView = findViewById(R.id.countrieslistview);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, //layout is of each
                android.R.id.text1, //textview of the above layout
                languages);
        countListView.setAdapter(adapter);
    }
}