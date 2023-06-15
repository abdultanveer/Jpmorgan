package com.example.jpmorgan.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jpmorgan.R;

import java.sql.Array;

public class RecyclerActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    String[] languages = {"english","urdu","kannada","hindi","arabic"};
    RecyclerView countListView;

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

       // countListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "item clicked", Toast.LENGTH_SHORT).show();

    }
}