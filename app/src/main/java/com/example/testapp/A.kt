package com.example.testapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class A : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent: Intent =Intent(this,B::class.java)
        startActivityForResult(intent,101)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==101){
            if (resultCode== Activity.RESULT_OK) {
                Log.d("Name",data?.getStringExtra("name"))
            }
            else{
                Log.d("Name","Empty")
            }
        }

    }
}
