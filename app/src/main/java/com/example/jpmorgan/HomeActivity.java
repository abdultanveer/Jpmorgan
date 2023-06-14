package com.example.jpmorgan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText etContact; //declaration
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //setContentView -- inflating the layout file activity_home
        etContact = findViewById(R.id.etContact);  //initialization -- taking handle
    }

    public void showContact(View view) {
        String contact  = etContact.getText().toString();
        Toast.makeText(this, contact, Toast.LENGTH_SHORT).show();
    }
}