package com.example.jpmorgan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText etContact; //declaration
    TextView tvResult;
    public static String TAG = HomeActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "im in oncreate of home activity");
        setContentView(R.layout.activity_home);
        //setContentView -- inflating the layout file activity_home
        etContact = findViewById(R.id.etContact);  //initialization -- taking handle
        tvResult = findViewById(R.id.tvResult);

      //  String name = getIntent().getExtras().getString("jpmkey");
    }

    public void showContact(View view) {
        String contact  = etContact.getText().toString();
        tvResult.setText(contact);

        //Toast.makeText(this, contact, Toast.LENGTH_SHORT).show();
    }
}