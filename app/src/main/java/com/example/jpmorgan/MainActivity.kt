package com.example.jpmorgan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etName : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
    }

    //context --- history
    fun showToast(view: View) {
       // Intent myIntent = new Intent();

        var myIntent = Intent(this,HomeActivity::class.java)
        startActivity(myIntent)
       /* var name: String = etName.text.toString()

        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();*/
    }
}