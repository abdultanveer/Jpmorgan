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

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"im in start")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"im in start -- save the state")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"im in resume --restore state")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"im in stop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"im in destroy")

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
        add(10,20)
        Log.w(TAG,"launching dialer")
        var dialIntent : Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:98765432"))
        startActivity(dialIntent)
       // throw NullPointerException("crashing my app")
    }

    private fun add(i: Int, i1: Int): Int {
        var c = i * i1;
        c * 20;

        c++;
        return c;

    }
}