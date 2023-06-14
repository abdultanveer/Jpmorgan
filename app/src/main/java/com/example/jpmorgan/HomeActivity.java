package com.example.jpmorgan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText etContact; //declaration
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //setContentView -- inflating the layout file activity_home
        etContact = findViewById(R.id.etContact);  //initialization -- taking handle
        tvResult = findViewById(R.id.tvResult);

        String name = getIntent().getExtras().getString("jpmkey");
        tvResult.setText(name);
    }

    public void showContact(View view) {
        String contact  = etContact.getText().toString();
        Toast.makeText(this, contact, Toast.LENGTH_SHORT).show();
    }
}