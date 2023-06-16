package com.example.jpmorgan.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviderGetKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.jpmorgan.R;
import com.example.jpmorgan.RecyclerViewModel;
import com.example.jpmorgan.roomdb.AppDatabase;
import com.example.jpmorgan.roomdb.AppExecutors;
import com.example.jpmorgan.roomdb.Person;

import java.util.List;

public class RecyclerActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    private AppDatabase mDb;
    List<Person> personList;

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
        countRecyView.setLayoutManager(new LinearLayoutManager(this));

        mDb = AppDatabase.getInstance(this);

    }

    @Override
    protected void onStart() {
        super.onStart();

        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
              personList =  mDb.personDao().loadAllPersons();
              LangAdapter mAdapter = new LangAdapter(personList);
              countRecyView.setAdapter(mAdapter);
            }
        });

       // LangAdapter langAdapter = new LangAdapter(languages);
        //countRecyView.setAdapter(langAdapter);

       // countListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "item clicked", Toast.LENGTH_SHORT).show();

    }
}