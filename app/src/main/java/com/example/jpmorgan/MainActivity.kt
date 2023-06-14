package com.example.jpmorgan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var etName : EditText
    var TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        Log.i(TAG,"im in oncreate")
    }

    //context --- history
    fun showToast(view: View) {
       // Intent myIntent = new Intent();
        Log.e(TAG,"clicked login")

        var myIntent = Intent(this,HomeActivity::class.java)
       var name: String = etName.text.toString()

        myIntent.putExtra("jpmkey",name)   //extras -- java map
        startActivity(myIntent)

       // Toast.makeText(this,name,Toast.LENGTH_SHORT).show();*/
    }

    fun handleClick(view: View) {
        Log.w(TAG,"launching dialer")
        var dialIntent : Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"))
        startActivity(dialIntent)
    }
}