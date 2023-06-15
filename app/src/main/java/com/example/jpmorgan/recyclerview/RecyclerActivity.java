package com.example.jpmorgan.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jpmorgan.R;

public class RecyclerActivity extends AppCompatActivity {
    String[] languages = {"english","urdu","kannada","hindi","arabic"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
    }
}